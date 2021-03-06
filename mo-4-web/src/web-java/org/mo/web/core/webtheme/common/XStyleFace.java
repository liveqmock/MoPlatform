package org.mo.web.core.webtheme.common;

import org.mo.com.xml.IXmlObject;

//============================================================
// <T>样式接口对象的XML节点基类。</T>
//============================================================
public interface XStyleFace
      extends IXmlObject
{
   // 名称定义
   String NAME = "IStyle";

   // 颜色的名称定义
   String PTY_COLOR = "color";

   // 背景色的名称定义
   String PTY_BACKGROUND_COLOR = "background_color";

   // 背景图片的名称定义
   String PTY_BACKGROUND_IMAGE = "background_image";

   // 背景图片位置的名称定义
   String PTY_BACKGROUND_POSITION = "background_position";

   // 背景图片位置X的名称定义
   String PTY_BACKGROUND_POSITION_X = "background_position_x";

   // 背景图片位置Y的名称定义
   String PTY_BACKGROUND_POSITION_Y = "background_position_y";

   // 背景图片重复的名称定义
   String PTY_BACKGROUND_REPEAT = "background_repeat";

   // 光标的名称定义
   String PTY_CURSOR = "cursor";

   // 垂直对齐的名称定义
   String PTY_VERTICAL_ALIGN = "vertical_align";

   // 宽度的名称定义
   String PTY_WIDTH = "width";

   // 高度的名称定义
   String PTY_HEIGHT = "height";

   // 位置的名称定义
   String PTY_POSITION = "position";

   // 左坐标的名称定义
   String PTY_LEFT = "left";

   // 上坐标的名称定义
   String PTY_TOP = "top";

   // 边框的名称定义
   String PTY_BORDER = "border";

   // 边框宽度的名称定义
   String PTY_BORDER_WIDTH = "border_width";

   // 边框样式的名称定义
   String PTY_BORDER_STYLE = "border_style";

   // 边框颜色的名称定义
   String PTY_BORDER_COLOR = "border_color";

   // 左边框的名称定义
   String PTY_BORDER_LEFT = "border_left";

   // 左边框宽度的名称定义
   String PTY_BORDER_LEFT_WIDTH = "border_left_width";

   // 左边框样式的名称定义
   String PTY_BORDER_LEFT_STYLE = "border_left_style";

   // 左边框颜色的名称定义
   String PTY_BORDER_LEFT_COLOR = "border_left_color";

   // 上边框的名称定义
   String PTY_BORDER_TOP = "border_top";

   // 上边框宽度的名称定义
   String PTY_BORDER_TOP_WIDTH = "border_top_width";

   // 上边框样式的名称定义
   String PTY_BORDER_TOP_STYLE = "border_top_style";

   // 上边框颜色的名称定义
   String PTY_BORDER_TOP_COLOR = "border_top_color";

   // 右边框的名称定义
   String PTY_BORDER_RIGHT = "border_right";

   // 右边框宽度的名称定义
   String PTY_BORDER_RIGHT_WIDTH = "border_right_width";

   // 右边框样式的名称定义
   String PTY_BORDER_RIGHT_STYLE = "border_right_style";

   // 右边框颜色的名称定义
   String PTY_BORDER_RIGHT_COLOR = "border_right_color";

   // 下边框的名称定义
   String PTY_BORDER_BOTTOM = "border_bottom";

   // 下边框宽度的名称定义
   String PTY_BORDER_BOTTOM_WIDTH = "border_bottom_width";

   // 下边框样式的名称定义
   String PTY_BORDER_BOTTOM_STYLE = "border_bottom_style";

   // 下边框颜色的名称定义
   String PTY_BORDER_BOTTOM_COLOR = "border_bottom_color";

   // 余白设定的名称定义
   String PTY_PADDING = "padding";

   // 左余白的名称定义
   String PTY_PADDING_LEFT = "padding_left";

   // 上余白的名称定义
   String PTY_PADDING_TOP = "padding_top";

   // 右余白的名称定义
   String PTY_PADDING_RIGHT = "padding_right";

   // 下余白的名称定义
   String PTY_PADDING_BOTTOM = "padding_bottom";

   // 合并设定的名称定义
   String PTY_MARGIN = "margin";

   // 左合并的名称定义
   String PTY_MARGIN_LEFT = "margin_left";

   // 上合并的名称定义
   String PTY_MARGIN_TOP = "margin_top";

   // 右合并的名称定义
   String PTY_MARGIN_RIGHT = "margin_right";

   // 下合并的名称定义
   String PTY_MARGIN_BOTTOM = "margin_bottom";

   // 空白处理的名称定义
   String PTY_WHITE_SPACE = "white_space";

   // 行高的名称定义
   String PTY_LINE_HEIGHT = "line_height";

   // 字体族的名称定义
   String PTY_FONT_FAMILY = "font_family";

   // 字体大小的名称定义
   String PTY_FONT_SIZE = "font_size";

   // 字体粗细的名称定义
   String PTY_FONT_WEIGHT = "font_weight";

   // 溢出设定的名称定义
   String PTY_OVERFLOW = "overflow";

   // X轴溢出的名称定义
   String PTY_OVERFLOW_X = "overflow_x";

   // Y轴溢出的名称定义
   String PTY_OVERFLOW_Y = "overflow_y";

   // 下划线位置的名称定义
   String PTY_UNDERLINE_POSITION = "underline_position";

   // 文本对齐方式的名称定义
   String PTY_TEXT_ALIGN = "text_align";

   // 大小写控制的名称定义
   String PTY_TEXT_TRANSFORM = "text_transform";

   // 表格布局的名称定义
   String PTY_TABLE_LAYOUT = "table_layout";

   // 纵深的名称定义
   String PTY_Z_INDEX = "z_index";

   //============================================================
   // <T>获得颜色的内容。</T>
   //
   // @return 颜色
   //============================================================
   String getColor();

   //============================================================
   // <T>设置颜色的内容。</T>
   //
   // @param value 颜色
   //============================================================
   void setColor(String value);

   //============================================================
   // <T>获得背景色的内容。</T>
   //
   // @return 背景色
   //============================================================
   String getBackgroundColor();

   //============================================================
   // <T>设置背景色的内容。</T>
   //
   // @param value 背景色
   //============================================================
   void setBackgroundColor(String value);

   //============================================================
   // <T>获得背景图片的内容。</T>
   //
   // @return 背景图片
   //============================================================
   String getBackgroundImage();

   //============================================================
   // <T>设置背景图片的内容。</T>
   //
   // @param value 背景图片
   //============================================================
   void setBackgroundImage(String value);

   //============================================================
   // <T>获得背景图片位置的内容。</T>
   //
   // @return 背景图片位置
   //============================================================
   String getBackgroundPosition();

   //============================================================
   // <T>设置背景图片位置的内容。</T>
   //
   // @param value 背景图片位置
   //============================================================
   void setBackgroundPosition(String value);

   //============================================================
   // <T>获得背景图片位置X的内容。</T>
   //
   // @return 背景图片位置X
   //============================================================
   String getBackgroundPositionX();

   //============================================================
   // <T>设置背景图片位置X的内容。</T>
   //
   // @param value 背景图片位置X
   //============================================================
   void setBackgroundPositionX(String value);

   //============================================================
   // <T>获得背景图片位置Y的内容。</T>
   //
   // @return 背景图片位置Y
   //============================================================
   String getBackgroundPositionY();

   //============================================================
   // <T>设置背景图片位置Y的内容。</T>
   //
   // @param value 背景图片位置Y
   //============================================================
   void setBackgroundPositionY(String value);

   //============================================================
   // <T>获得背景图片重复的内容。</T>
   //
   // @return 背景图片重复
   //============================================================
   String getBackgroundRepeat();

   //============================================================
   // <T>设置背景图片重复的内容。</T>
   //
   // @param value 背景图片重复
   //============================================================
   void setBackgroundRepeat(String value);

   //============================================================
   // <T>获得光标的内容。</T>
   //
   // @return 光标
   //============================================================
   String getCursor();

   //============================================================
   // <T>设置光标的内容。</T>
   //
   // @param value 光标
   //============================================================
   void setCursor(String value);

   //============================================================
   // <T>获得垂直对齐的内容。</T>
   //
   // @return 垂直对齐
   //============================================================
   String getVerticalAlign();

   //============================================================
   // <T>设置垂直对齐的内容。</T>
   //
   // @param value 垂直对齐
   //============================================================
   void setVerticalAlign(String value);

   //============================================================
   // <T>获得宽度的内容。</T>
   //
   // @return 宽度
   //============================================================
   String getWidth();

   //============================================================
   // <T>设置宽度的内容。</T>
   //
   // @param value 宽度
   //============================================================
   void setWidth(String value);

   //============================================================
   // <T>获得高度的内容。</T>
   //
   // @return 高度
   //============================================================
   String getHeight();

   //============================================================
   // <T>设置高度的内容。</T>
   //
   // @param value 高度
   //============================================================
   void setHeight(String value);

   //============================================================
   // <T>获得位置的内容。</T>
   //
   // @return 位置
   //============================================================
   String getPosition();

   //============================================================
   // <T>设置位置的内容。</T>
   //
   // @param value 位置
   //============================================================
   void setPosition(String value);

   //============================================================
   // <T>获得左坐标的内容。</T>
   //
   // @return 左坐标
   //============================================================
   String getLeft();

   //============================================================
   // <T>设置左坐标的内容。</T>
   //
   // @param value 左坐标
   //============================================================
   void setLeft(String value);

   //============================================================
   // <T>获得上坐标的内容。</T>
   //
   // @return 上坐标
   //============================================================
   String getTop();

   //============================================================
   // <T>设置上坐标的内容。</T>
   //
   // @param value 上坐标
   //============================================================
   void setTop(String value);

   //============================================================
   // <T>获得边框的内容。</T>
   //
   // @return 边框
   //============================================================
   String getBorder();

   //============================================================
   // <T>设置边框的内容。</T>
   //
   // @param value 边框
   //============================================================
   void setBorder(String value);


   //============================================================
   // <T>获得边框宽度的内容。</T>
   //
   // @return 边框宽度
   //============================================================
   String getBorderWidth();

   //============================================================
   // <T>设置边框宽度的内容。</T>
   //
   // @param value 边框宽度
   //============================================================
   void setBorderWidth(String value);

   //============================================================
   // <T>获得边框样式的内容。</T>
   //
   // @return 边框样式
   //============================================================
   String getBorderStyle();

   //============================================================
   // <T>设置边框样式的内容。</T>
   //
   // @param value 边框样式
   //============================================================
   void setBorderStyle(String value);

   //============================================================
   // <T>获得边框颜色的内容。</T>
   //
   // @return 边框颜色
   //============================================================
   String getBorderColor();

   //============================================================
   // <T>设置边框颜色的内容。</T>
   //
   // @param value 边框颜色
   //============================================================
   void setBorderColor(String value);

   //============================================================
   // <T>获得左边框的内容。</T>
   //
   // @return 左边框
   //============================================================
   String getBorderLeft();

   //============================================================
   // <T>设置左边框的内容。</T>
   //
   // @param value 左边框
   //============================================================
   void setBorderLeft(String value);


   //============================================================
   // <T>获得左边框宽度的内容。</T>
   //
   // @return 左边框宽度
   //============================================================
   String getBorderLeftWidth();

   //============================================================
   // <T>设置左边框宽度的内容。</T>
   //
   // @param value 左边框宽度
   //============================================================
   void setBorderLeftWidth(String value);

   //============================================================
   // <T>获得左边框样式的内容。</T>
   //
   // @return 左边框样式
   //============================================================
   String getBorderLeftStyle();

   //============================================================
   // <T>设置左边框样式的内容。</T>
   //
   // @param value 左边框样式
   //============================================================
   void setBorderLeftStyle(String value);

   //============================================================
   // <T>获得左边框颜色的内容。</T>
   //
   // @return 左边框颜色
   //============================================================
   String getBorderLeftColor();

   //============================================================
   // <T>设置左边框颜色的内容。</T>
   //
   // @param value 左边框颜色
   //============================================================
   void setBorderLeftColor(String value);

   //============================================================
   // <T>获得上边框的内容。</T>
   //
   // @return 上边框
   //============================================================
   String getBorderTop();

   //============================================================
   // <T>设置上边框的内容。</T>
   //
   // @param value 上边框
   //============================================================
   void setBorderTop(String value);


   //============================================================
   // <T>获得上边框宽度的内容。</T>
   //
   // @return 上边框宽度
   //============================================================
   String getBorderTopWidth();

   //============================================================
   // <T>设置上边框宽度的内容。</T>
   //
   // @param value 上边框宽度
   //============================================================
   void setBorderTopWidth(String value);

   //============================================================
   // <T>获得上边框样式的内容。</T>
   //
   // @return 上边框样式
   //============================================================
   String getBorderTopStyle();

   //============================================================
   // <T>设置上边框样式的内容。</T>
   //
   // @param value 上边框样式
   //============================================================
   void setBorderTopStyle(String value);

   //============================================================
   // <T>获得上边框颜色的内容。</T>
   //
   // @return 上边框颜色
   //============================================================
   String getBorderTopColor();

   //============================================================
   // <T>设置上边框颜色的内容。</T>
   //
   // @param value 上边框颜色
   //============================================================
   void setBorderTopColor(String value);

   //============================================================
   // <T>获得右边框的内容。</T>
   //
   // @return 右边框
   //============================================================
   String getBorderRight();

   //============================================================
   // <T>设置右边框的内容。</T>
   //
   // @param value 右边框
   //============================================================
   void setBorderRight(String value);


   //============================================================
   // <T>获得右边框宽度的内容。</T>
   //
   // @return 右边框宽度
   //============================================================
   String getBorderRightWidth();

   //============================================================
   // <T>设置右边框宽度的内容。</T>
   //
   // @param value 右边框宽度
   //============================================================
   void setBorderRightWidth(String value);

   //============================================================
   // <T>获得右边框样式的内容。</T>
   //
   // @return 右边框样式
   //============================================================
   String getBorderRightStyle();

   //============================================================
   // <T>设置右边框样式的内容。</T>
   //
   // @param value 右边框样式
   //============================================================
   void setBorderRightStyle(String value);

   //============================================================
   // <T>获得右边框颜色的内容。</T>
   //
   // @return 右边框颜色
   //============================================================
   String getBorderRightColor();

   //============================================================
   // <T>设置右边框颜色的内容。</T>
   //
   // @param value 右边框颜色
   //============================================================
   void setBorderRightColor(String value);

   //============================================================
   // <T>获得下边框的内容。</T>
   //
   // @return 下边框
   //============================================================
   String getBorderBottom();

   //============================================================
   // <T>设置下边框的内容。</T>
   //
   // @param value 下边框
   //============================================================
   void setBorderBottom(String value);


   //============================================================
   // <T>获得下边框宽度的内容。</T>
   //
   // @return 下边框宽度
   //============================================================
   String getBorderBottomWidth();

   //============================================================
   // <T>设置下边框宽度的内容。</T>
   //
   // @param value 下边框宽度
   //============================================================
   void setBorderBottomWidth(String value);

   //============================================================
   // <T>获得下边框样式的内容。</T>
   //
   // @return 下边框样式
   //============================================================
   String getBorderBottomStyle();

   //============================================================
   // <T>设置下边框样式的内容。</T>
   //
   // @param value 下边框样式
   //============================================================
   void setBorderBottomStyle(String value);

   //============================================================
   // <T>获得下边框颜色的内容。</T>
   //
   // @return 下边框颜色
   //============================================================
   String getBorderBottomColor();

   //============================================================
   // <T>设置下边框颜色的内容。</T>
   //
   // @param value 下边框颜色
   //============================================================
   void setBorderBottomColor(String value);

   //============================================================
   // <T>获得余白设定的内容。</T>
   //
   // @return 余白设定
   //============================================================
   String getPadding();

   //============================================================
   // <T>设置余白设定的内容。</T>
   //
   // @param value 余白设定
   //============================================================
   void setPadding(String value);

   //============================================================
   // <T>获得左余白的内容。</T>
   //
   // @return 左余白
   //============================================================
   String getPaddingLeft();

   //============================================================
   // <T>设置左余白的内容。</T>
   //
   // @param value 左余白
   //============================================================
   void setPaddingLeft(String value);

   //============================================================
   // <T>获得上余白的内容。</T>
   //
   // @return 上余白
   //============================================================
   String getPaddingTop();

   //============================================================
   // <T>设置上余白的内容。</T>
   //
   // @param value 上余白
   //============================================================
   void setPaddingTop(String value);

   //============================================================
   // <T>获得右余白的内容。</T>
   //
   // @return 右余白
   //============================================================
   String getPaddingRight();

   //============================================================
   // <T>设置右余白的内容。</T>
   //
   // @param value 右余白
   //============================================================
   void setPaddingRight(String value);

   //============================================================
   // <T>获得下余白的内容。</T>
   //
   // @return 下余白
   //============================================================
   String getPaddingBottom();

   //============================================================
   // <T>设置下余白的内容。</T>
   //
   // @param value 下余白
   //============================================================
   void setPaddingBottom(String value);

   //============================================================
   // <T>获得合并设定的内容。</T>
   //
   // @return 合并设定
   //============================================================
   String getMargin();

   //============================================================
   // <T>设置合并设定的内容。</T>
   //
   // @param value 合并设定
   //============================================================
   void setMargin(String value);

   //============================================================
   // <T>获得左合并的内容。</T>
   //
   // @return 左合并
   //============================================================
   String getMarginLeft();

   //============================================================
   // <T>设置左合并的内容。</T>
   //
   // @param value 左合并
   //============================================================
   void setMarginLeft(String value);

   //============================================================
   // <T>获得上合并的内容。</T>
   //
   // @return 上合并
   //============================================================
   String getMarginTop();

   //============================================================
   // <T>设置上合并的内容。</T>
   //
   // @param value 上合并
   //============================================================
   void setMarginTop(String value);

   //============================================================
   // <T>获得右合并的内容。</T>
   //
   // @return 右合并
   //============================================================
   String getMarginRight();

   //============================================================
   // <T>设置右合并的内容。</T>
   //
   // @param value 右合并
   //============================================================
   void setMarginRight(String value);

   //============================================================
   // <T>获得下合并的内容。</T>
   //
   // @return 下合并
   //============================================================
   String getMarginBottom();

   //============================================================
   // <T>设置下合并的内容。</T>
   //
   // @param value 下合并
   //============================================================
   void setMarginBottom(String value);

   //============================================================
   // <T>获得空白处理的内容。</T>
   //
   // @return 空白处理
   //============================================================
   String getWhiteSpace();

   //============================================================
   // <T>设置空白处理的内容。</T>
   //
   // @param value 空白处理
   //============================================================
   void setWhiteSpace(String value);

   //============================================================
   // <T>获得行高的内容。</T>
   //
   // @return 行高
   //============================================================
   String getLineHeight();

   //============================================================
   // <T>设置行高的内容。</T>
   //
   // @param value 行高
   //============================================================
   void setLineHeight(String value);

   //============================================================
   // <T>获得字体族的内容。</T>
   //
   // @return 字体族
   //============================================================
   String getFontFamily();

   //============================================================
   // <T>设置字体族的内容。</T>
   //
   // @param value 字体族
   //============================================================
   void setFontFamily(String value);

   //============================================================
   // <T>获得字体大小的内容。</T>
   //
   // @return 字体大小
   //============================================================
   String getFontSize();

   //============================================================
   // <T>设置字体大小的内容。</T>
   //
   // @param value 字体大小
   //============================================================
   void setFontSize(String value);

   //============================================================
   // <T>获得字体粗细的内容。</T>
   //
   // @return 字体粗细
   //============================================================
   String getFontWeight();

   //============================================================
   // <T>设置字体粗细的内容。</T>
   //
   // @param value 字体粗细
   //============================================================
   void setFontWeight(String value);

   //============================================================
   // <T>获得溢出设定的内容。</T>
   //
   // @return 溢出设定
   //============================================================
   String getOverflow();

   //============================================================
   // <T>设置溢出设定的内容。</T>
   //
   // @param value 溢出设定
   //============================================================
   void setOverflow(String value);

   //============================================================
   // <T>获得X轴溢出的内容。</T>
   //
   // @return X轴溢出
   //============================================================
   String getOverflowX();

   //============================================================
   // <T>设置X轴溢出的内容。</T>
   //
   // @param value X轴溢出
   //============================================================
   void setOverflowX(String value);

   //============================================================
   // <T>获得Y轴溢出的内容。</T>
   //
   // @return Y轴溢出
   //============================================================
   String getOverflowY();

   //============================================================
   // <T>设置Y轴溢出的内容。</T>
   //
   // @param value Y轴溢出
   //============================================================
   void setOverflowY(String value);

   //============================================================
   // <T>获得下划线位置的内容。</T>
   //
   // @return 下划线位置
   //============================================================
   String getUnderlinePosition();

   //============================================================
   // <T>设置下划线位置的内容。</T>
   //
   // @param value 下划线位置
   //============================================================
   void setUnderlinePosition(String value);

   //============================================================
   // <T>获得文本对齐方式的内容。</T>
   //
   // @return 文本对齐方式
   //============================================================
   String getTextAlign();

   //============================================================
   // <T>设置文本对齐方式的内容。</T>
   //
   // @param value 文本对齐方式
   //============================================================
   void setTextAlign(String value);

   //============================================================
   // <T>获得大小写控制的内容。</T>
   //
   // @return 大小写控制
   //============================================================
   String getTextTransform();

   //============================================================
   // <T>设置大小写控制的内容。</T>
   //
   // @param value 大小写控制
   //============================================================
   void setTextTransform(String value);

   //============================================================
   // <T>获得表格布局的内容。</T>
   //
   // @return 表格布局
   //============================================================
   String getTableLayout();

   //============================================================
   // <T>设置表格布局的内容。</T>
   //
   // @param value 表格布局
   //============================================================
   void setTableLayout(String value);

   //============================================================
   // <T>获得纵深的内容。</T>
   //
   // @return 纵深
   //============================================================
   String getZIndex();

   //============================================================
   // <T>设置纵深的内容。</T>
   //
   // @param value 纵深
   //============================================================
   void setZIndex(String value);
}