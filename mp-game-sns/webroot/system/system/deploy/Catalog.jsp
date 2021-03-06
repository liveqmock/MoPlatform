<%@ page contentType='text/html;charset=utf-8' %>
<%@ include file='/apl/public.inc' %>

<HTML>
<HEAD>
<TITLE>Welcome</TITLE>
<js:css/>
<js:js type='runtime.client'/>
</HEAD>
<!-- Script -------------------------------------------------->
<SCRIPT language='javascript'>
var tree = null;
var toolbar = null;
function refreshNode(){
	tree.reloadNode();
}
function onNodeClick(sender, node){
	var type = node.type.get('type');
	fmMain.target = 'frmMain';
	fmMain.form_name.value = node.type.get('form_name');
	fmMain.sel_type.value = type;
	if('collection' == type){
		fmMain.sel_collection.value = node.label;
		fmMain.sel_component.value = '';
	}else if('component' == type){
		fmMain.sel_collection.value = node.topNode().label;
		fmMain.sel_component.value = node.uuid;
	}else{
		return alert('Unknown type ' + type);
	}
	fmMain.action = '<jh:context/>/system/deploy/Deploy.wa?do=update';
	fmMain.submit();
}
function _onloadAll(){
	MoJS.connect();
	// Toolbar
	toolbar = RControl.fromXml(xToolBar, _id_toolbar);
	// TreeView
	tree = RControl.fromXml(xTree, _id_tree);
	tree.lsnsClick.push(new TListener(tree, onNodeClick));
	tree.connect();
	// Global
	RGlobal.set('catalog.tree', tree);
}
//----------------------------------------------------------
function _onload(){
   RWindow.connect(window);
   RLoader.loadJs('mobj');
   RLoader.waitJs(new TInvoke(null, _onloadAll), 'mobj');
}
</SCRIPT>
<!-- Toolbar config ------------------------------------------>
<XML ID="xToolBar">
<ToolBar width='100%' height='100%' align='right'>
	<ToolButtonText name='btnForm' label='系统-部署' icon='sys.pst.mgr' target='frmMain' page='list@#/system/deploy/Deploy.wa?form_name=system.system.deploy.VersionList'/>
	<ToolButton name='btnRefresh' icon='tool.refresh' action='refreshNode()'/>
</ToolBar>
</XML>
<!-- TreeView config ----------------------------------------->
<jc:tree name='xTree' source='system.system.deploy'/>
<!-- Body begin ---------------------------------------------->
<jh:body style='bodyCatalog' onload='_onload()' scroll='no'>
<jh:form name='fmMain' method='post'>
<!-- Hidden -------------------------------------------------->
<jh:hidden name='form_name'/>
<jh:hidden name='sel_type'/>
<jh:hidden name='sel_collection'/>
<jh:hidden name='sel_component'/>
<!-- Catalog ------------------------------------------------->
<TABLE width='100%' height='100%' border='0' cellpadding='0' cellspacing='0'>
<TR><TD height='24'>
<!-- Toolbar begin ------------------------------------------->
<DIV id='_id_toolbar' style='width:100%; height:100%;'><DIV>
<!-- Toolbar end --------------------------------------------->
</TD></TR>
<TR><TD>
<!-- Tree begin ---------------------------------------------->
<DIV id='_id_tree' style='width:100%; height:100%; overflow:auto'><DIV>
<!-- Tree end ------------------------------------------------>
</TD></TR>
</TABLE>
</jh:form>
</jh:body>
<!-- Body end ------------------------------------------------>
</HTML>
