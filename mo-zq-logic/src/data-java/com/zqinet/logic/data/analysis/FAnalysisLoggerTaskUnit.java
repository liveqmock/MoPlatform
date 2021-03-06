package com.zqinet.logic.data.analysis;

import org.mo.com.lang.*;
import org.mo.com.collections.*;
import org.mo.com.lang.type.*;
import org.mo.data.logic.*;

//============================================================
// <T>日志分析登录逻辑单元。</T>
//============================================================
public class FAnalysisLoggerTaskUnit extends FLogicUnit
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

   // 存储字段游戏ID的定义。
   private long __gameId;

   // 字段游戏ID的定义。
   protected long _gameId;

   // 存储字段记录时间的定义。
   private TDateTime __recordDate = new TDateTime();

   // 字段记录时间的定义。
   protected TDateTime _recordDate = new TDateTime();

   // 存储字段角色编号的定义。
   private long __roleId;

   // 字段角色编号的定义。
   protected long _roleId;

   // 存储字段任务模板编号的定义。
   private int __taskTid;

   // 字段任务模板编号的定义。
   protected int _taskTid;

   // 存储字段操作接受的定义。
   private int __operateAccept;

   // 字段操作接受的定义。
   protected int _operateAccept;

   // 存储字段操作交付的定义。
   private int __operateDeliver;

   // 字段操作交付的定义。
   protected int _operateDeliver;

   // 存储字段操作完成的定义。
   private int __operateComplete;

   // 字段操作完成的定义。
   protected int _operateComplete;

   // 存储字段操作变化的定义。
   private int __operateTrack;

   // 字段操作变化的定义。
   protected int _operateTrack;

   // 存储字段操作放弃的定义。
   private int __operateAbandon;

   // 字段操作放弃的定义。
   protected int _operateAbandon;

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
   // <T>构造日志分析登录逻辑单元。</T>
   //============================================================
   public FAnalysisLoggerTaskUnit(){
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
   // <T>判断游戏ID的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isGameIdChanged(){
      return __gameId != _gameId;
   }

   //============================================================
   // <T>获得游戏ID的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public long gameId(){
      return _gameId;
   }

   //============================================================
   // <T>设置游戏ID的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setGameId(long value){
      _gameId = value;
   }

   //============================================================
   // <T>判断记录时间的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isRecordDateChanged(){
      return !__recordDate.equals(_recordDate);
   }

   //============================================================
   // <T>获得记录时间的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public TDateTime recordDate(){
      return _recordDate;
   }

   //============================================================
   // <T>设置记录时间的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setRecordDate(TDateTime value){
      _recordDate = value;
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
   // <T>判断任务模板编号的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isTaskTidChanged(){
      return __taskTid != _taskTid;
   }

   //============================================================
   // <T>获得任务模板编号的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int taskTid(){
      return _taskTid;
   }

   //============================================================
   // <T>设置任务模板编号的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setTaskTid(int value){
      _taskTid = value;
   }

   //============================================================
   // <T>判断操作接受的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperateAcceptChanged(){
      return __operateAccept != _operateAccept;
   }

   //============================================================
   // <T>获得操作接受的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operateAccept(){
      return _operateAccept;
   }

   //============================================================
   // <T>设置操作接受的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperateAccept(int value){
      _operateAccept = value;
   }

   //============================================================
   // <T>判断操作交付的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperateDeliverChanged(){
      return __operateDeliver != _operateDeliver;
   }

   //============================================================
   // <T>获得操作交付的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operateDeliver(){
      return _operateDeliver;
   }

   //============================================================
   // <T>设置操作交付的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperateDeliver(int value){
      _operateDeliver = value;
   }

   //============================================================
   // <T>判断操作完成的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperateCompleteChanged(){
      return __operateComplete != _operateComplete;
   }

   //============================================================
   // <T>获得操作完成的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operateComplete(){
      return _operateComplete;
   }

   //============================================================
   // <T>设置操作完成的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperateComplete(int value){
      _operateComplete = value;
   }

   //============================================================
   // <T>判断操作变化的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperateTrackChanged(){
      return __operateTrack != _operateTrack;
   }

   //============================================================
   // <T>获得操作变化的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operateTrack(){
      return _operateTrack;
   }

   //============================================================
   // <T>设置操作变化的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperateTrack(int value){
      _operateTrack = value;
   }

   //============================================================
   // <T>判断操作放弃的数据是否改变。</T>
   //
   // @return 数据内容
   //============================================================
   public boolean isOperateAbandonChanged(){
      return __operateAbandon != _operateAbandon;
   }

   //============================================================
   // <T>获得操作放弃的数据内容。</T>
   //
   // @return 数据内容
   //============================================================
   public int operateAbandon(){
      return _operateAbandon;
   }

   //============================================================
   // <T>设置操作放弃的数据内容。</T>
   //
   // @param value 数据内容
   //============================================================
   public void setOperateAbandon(int value){
      _operateAbandon = value;
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
      __gameId = RLong.parse(row.get("game_id"));
      _gameId = __gameId;
      __recordDate.parse(row.get("record_date"));
      _recordDate.assign(__recordDate);
      __roleId = RLong.parse(row.get("role_id"));
      _roleId = __roleId;
      __taskTid = row.getInteger("task_tid");
      _taskTid = __taskTid;
      __operateAccept = row.getInteger("operate_accept");
      _operateAccept = __operateAccept;
      __operateDeliver = row.getInteger("operate_deliver");
      _operateDeliver = __operateDeliver;
      __operateComplete = row.getInteger("operate_complete");
      _operateComplete = __operateComplete;
      __operateTrack = row.getInteger("operate_track");
      _operateTrack = __operateTrack;
      __operateAbandon = row.getInteger("operate_abandon");
      _operateAbandon = __operateAbandon;
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