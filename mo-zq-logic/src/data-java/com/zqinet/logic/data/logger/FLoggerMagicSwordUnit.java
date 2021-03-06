package com.zqinet.logic.data.logger;

import org.mo.com.lang.*;
import org.mo.com.collections.*;
import org.mo.com.lang.type.*;
import org.mo.data.logic.*;

//============================================================
// <T>操作神剑日志逻辑单元。</T>
//============================================================
public class FLoggerMagicSwordUnit extends FLogicUnit
{
   // 存储字段对象标识的定义。
   private long __ouid;

   // 字段对象标识的定义。
   protected long _ouid;

   // 存储字段有效性的定义。
   private boolean __ovld;

   // 字段有效性的定义。
   protected boolean _ovld;

   // 存储字段唯一标识的定义。
   private int __uniqueId;

   // 字段唯一标识的定义。
   protected int _uniqueId;

   // 存储字段角色编号的定义。
   private long __roleId;

   // 字段角色编号的定义。
   protected long _roleId;

   // 存储字段神剑编号的定义。
   private long __swordId;

   // 字段神剑编号的定义。
   protected long _swordId;

   // 存储字段培养前级别的定义。
   private int __oldLevel;

   // 字段培养前级别的定义。
   protected int _oldLevel;

   // 存储字段培养前品级的定义。
   private int __oldQuality;

   // 字段培养前品级的定义。
   protected int _oldQuality;

   // 存储字段操作类型的定义。
   private int __operationType;

   // 字段操作类型的定义。
   protected int _operationType;

   // 存储字段操作后级别的定义。
   private int __newLevel;

   // 字段操作后级别的定义。
   protected int _newLevel;

   // 存储字段操作后神剑品质的定义。
   private int __newQuality;

   // 字段操作后神剑品质的定义。
   protected int _newQuality;

   // 存储字段参数1的定义。
   private int __param1;

   // 字段参数1的定义。
   protected int _param1;

   // 存储字段参数2的定义。
   private int __param2;

   // 字段参数2的定义。
   protected int _param2;

   // 存储字段参数3的定义。
   private int __param3;

   // 字段参数3的定义。
   protected int _param3;

   // 存储字段参数4的定义。
   private int __param4;

   // 字段参数4的定义。
   protected int _param4;

   // 存储字段参数5的定义。
   private int __param5;

   // 字段参数5的定义。
   protected int _param5;

   // 存储字段参数6的定义。
   private int __param6;

   // 字段参数6的定义。
   protected int _param6;

   // 存储字段创建用户标识的定义。
   private int __createUserId;

   // 字段创建用户标识的定义。
   protected int _createUserId;

   // 存储字段创建日期的定义。
   private TDateTime __createDate = new TDateTime();

   // 字段创建日期的定义。
   protected TDateTime _createDate = new TDateTime();

   // 存储字段更新者标识的定义。
   private int __updateUserId;

   // 字段更新者标识的定义。
   protected int _updateUserId;

   // 存储字段更新时间的定义。
   private TDateTime __updateDate = new TDateTime();

   // 字段更新时间的定义。
   protected TDateTime _updateDate = new TDateTime();

   //============================================================
   // <T>构造操作神剑日志逻辑单元。</T>
   //============================================================
   public FLoggerMagicSwordUnit(){
   }

   //============================================================
   // <T>判断对象标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOuidChanged(){
      return __ouid != _ouid;
   }

   //============================================================
   // <T>获得对象标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long ouid(){
      return _ouid;
   }

   //============================================================
   // <T>设置对象标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOuid(long value){
      _ouid = value;
   }

   //============================================================
   // <T>判断有效性的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOvldChanged(){
      return __ovld != _ovld;
   }

   //============================================================
   // <T>获得有效性的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean ovld(){
      return _ovld;
   }

   //============================================================
   // <T>设置有效性的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOvld(boolean value){
      _ovld = value;
   }

   //============================================================
   // <T>判断唯一标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUniqueIdChanged(){
      return __uniqueId != _uniqueId;
   }

   //============================================================
   // <T>获得唯一标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int uniqueId(){
      return _uniqueId;
   }

   //============================================================
   // <T>设置唯一标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUniqueId(int value){
      _uniqueId = value;
   }

   //============================================================
   // <T>判断角色编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isRoleIdChanged(){
      return __roleId != _roleId;
   }

   //============================================================
   // <T>获得角色编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long roleId(){
      return _roleId;
   }

   //============================================================
   // <T>设置角色编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setRoleId(long value){
      _roleId = value;
   }

   //============================================================
   // <T>判断神剑编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isSwordIdChanged(){
      return __swordId != _swordId;
   }

   //============================================================
   // <T>获得神剑编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long swordId(){
      return _swordId;
   }

   //============================================================
   // <T>设置神剑编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setSwordId(long value){
      _swordId = value;
   }

   //============================================================
   // <T>判断培养前级别的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOldLevelChanged(){
      return __oldLevel != _oldLevel;
   }

   //============================================================
   // <T>获得培养前级别的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int oldLevel(){
      return _oldLevel;
   }

   //============================================================
   // <T>设置培养前级别的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOldLevel(int value){
      _oldLevel = value;
   }

   //============================================================
   // <T>判断培养前品级的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOldQualityChanged(){
      return __oldQuality != _oldQuality;
   }

   //============================================================
   // <T>获得培养前品级的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int oldQuality(){
      return _oldQuality;
   }

   //============================================================
   // <T>设置培养前品级的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOldQuality(int value){
      _oldQuality = value;
   }

   //============================================================
   // <T>判断操作类型的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperationTypeChanged(){
      return __operationType != _operationType;
   }

   //============================================================
   // <T>获得操作类型的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operationType(){
      return _operationType;
   }

   //============================================================
   // <T>设置操作类型的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperationType(int value){
      _operationType = value;
   }

   //============================================================
   // <T>判断操作后级别的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isNewLevelChanged(){
      return __newLevel != _newLevel;
   }

   //============================================================
   // <T>获得操作后级别的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int newLevel(){
      return _newLevel;
   }

   //============================================================
   // <T>设置操作后级别的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setNewLevel(int value){
      _newLevel = value;
   }

   //============================================================
   // <T>判断操作后神剑品质的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isNewQualityChanged(){
      return __newQuality != _newQuality;
   }

   //============================================================
   // <T>获得操作后神剑品质的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int newQuality(){
      return _newQuality;
   }

   //============================================================
   // <T>设置操作后神剑品质的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setNewQuality(int value){
      _newQuality = value;
   }

   //============================================================
   // <T>判断参数1的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam1Changed(){
      return __param1 != _param1;
   }

   //============================================================
   // <T>获得参数1的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param1(){
      return _param1;
   }

   //============================================================
   // <T>设置参数1的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam1(int value){
      _param1 = value;
   }

   //============================================================
   // <T>判断参数2的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam2Changed(){
      return __param2 != _param2;
   }

   //============================================================
   // <T>获得参数2的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param2(){
      return _param2;
   }

   //============================================================
   // <T>设置参数2的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam2(int value){
      _param2 = value;
   }

   //============================================================
   // <T>判断参数3的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam3Changed(){
      return __param3 != _param3;
   }

   //============================================================
   // <T>获得参数3的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param3(){
      return _param3;
   }

   //============================================================
   // <T>设置参数3的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam3(int value){
      _param3 = value;
   }

   //============================================================
   // <T>判断参数4的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam4Changed(){
      return __param4 != _param4;
   }

   //============================================================
   // <T>获得参数4的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param4(){
      return _param4;
   }

   //============================================================
   // <T>设置参数4的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam4(int value){
      _param4 = value;
   }

   //============================================================
   // <T>判断参数5的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam5Changed(){
      return __param5 != _param5;
   }

   //============================================================
   // <T>获得参数5的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param5(){
      return _param5;
   }

   //============================================================
   // <T>设置参数5的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam5(int value){
      _param5 = value;
   }

   //============================================================
   // <T>判断参数6的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isParam6Changed(){
      return __param6 != _param6;
   }

   //============================================================
   // <T>获得参数6的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int param6(){
      return _param6;
   }

   //============================================================
   // <T>设置参数6的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setParam6(int value){
      _param6 = value;
   }

   //============================================================
   // <T>判断创建用户标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isCreateUserIdChanged(){
      return __createUserId != _createUserId;
   }

   //============================================================
   // <T>获得创建用户标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int createUserId(){
      return _createUserId;
   }

   //============================================================
   // <T>设置创建用户标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setCreateUserId(int value){
      _createUserId = value;
   }

   //============================================================
   // <T>判断创建日期的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isCreateDateChanged(){
      return !__createDate.equals(_createDate);
   }

   //============================================================
   // <T>获得创建日期的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public TDateTime createDate(){
      return _createDate;
   }

   //============================================================
   // <T>设置创建日期的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setCreateDate(TDateTime value){
      _createDate = value;
   }

   //============================================================
   // <T>判断更新者标识的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUpdateUserIdChanged(){
      return __updateUserId != _updateUserId;
   }

   //============================================================
   // <T>获得更新者标识的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int updateUserId(){
      return _updateUserId;
   }

   //============================================================
   // <T>设置更新者标识的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUpdateUserId(int value){
      _updateUserId = value;
   }

   //============================================================
   // <T>判断更新时间的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isUpdateDateChanged(){
      return !__updateDate.equals(_updateDate);
   }

   //============================================================
   // <T>获得更新时间的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public TDateTime updateDate(){
      return _updateDate;
   }

   //============================================================
   // <T>设置更新时间的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setUpdateDate(TDateTime value){
      _updateDate = value;
   }

   //============================================================
   // <T>加载行记录。</T>
   //
   // @param row 行记录
   //============================================================
   public void load(FRow row){
      __ouid = RLong.parse(row.get("ouid"));
      _ouid = __ouid;
      __uniqueId = row.getInteger("unique_id");
      _uniqueId = __uniqueId;
      __roleId = RLong.parse(row.get("role_id"));
      _roleId = __roleId;
      __swordId = RLong.parse(row.get("sword_id"));
      _swordId = __swordId;
      __oldLevel = row.getInteger("old_level");
      _oldLevel = __oldLevel;
      __oldQuality = row.getInteger("old_quality");
      _oldQuality = __oldQuality;
      __operationType = row.getInteger("operation_type");
      _operationType = __operationType;
      __newLevel = row.getInteger("new_level");
      _newLevel = __newLevel;
      __newQuality = row.getInteger("new_quality");
      _newQuality = __newQuality;
      __param1 = row.getInteger("param1");
      _param1 = __param1;
      __param2 = row.getInteger("param2");
      _param2 = __param2;
      __param3 = row.getInteger("param3");
      _param3 = __param3;
      __param4 = row.getInteger("param4");
      _param4 = __param4;
      __param5 = row.getInteger("param5");
      _param5 = __param5;
      __param6 = row.getInteger("param6");
      _param6 = __param6;
      __createUserId = row.getInteger("create_user_id");
      _createUserId = __createUserId;
      __createDate.parse(row.get("create_date"));
      _createDate.assign(__createDate);
      __updateUserId = row.getInteger("update_user_id");
      _updateUserId = __updateUserId;
      __updateDate.parse(row.get("update_date"));
      _updateDate.assign(__updateDate);
   }
}