@CLS

@SET JS_HOME=D:\ZW-Platform.WK\mp-platform\webroot\ajs

@D:
@CD D:\ZW-Platform.WK\mp-platform\webroot\ajs

@SET JAVA_HOME=C:\Program Files\Java\jdk1.7.0_21
@SET JAVA_PATH=%JS_HOME%\lib\mo-common.jar;%JS_HOME%\lib\mo-util.jar

@REM ============================================================
@SET JAVA_PMGR=org.mo.util.javascript.FJsPathMerger
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\0-runtime     %JS_HOME%\runtime.js     N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\1-lang        %JS_HOME%\lang.js        N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\2-base        %JS_HOME%\base.js        N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\3-core        %JS_HOME%\core.js        N

@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\4-ctl.toolbar %JS_HOME%\ctl.toolbar.js N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\4-ctl.tree    %JS_HOME%\ctl.tree.js    N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\4-ctl.form    %JS_HOME%\ctl.form.js    N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\4-ctl.table   %JS_HOME%\ctl.table.js   N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\4-ctl.window  %JS_HOME%\ctl.window.js  N

@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\6-logic       %JS_HOME%\logic.js       N

@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\6-workspace   %JS_HOME%\workspace.js   N
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_PMGR% %JS_HOME%\6-workspace2  %JS_HOME%\workspace2.js  N

@REM ============================================================
@SET JS_FILES=
@SET JS_FILES=%JS_FILES% %JS_HOME%\lang.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\base.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\core.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\ctl.form.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\ctl.table.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\ctl.toolbar.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\ctl.tree.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\ctl.window.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\logic.js
@SET JS_FILES=%JS_FILES% %JS_HOME%\8-context\context_cn.js

@SET JAVA_FMGR=org.mo.util.javascript.FJsFileMerger
@"%JAVA_HOME%\bin\java.exe" -cp %JAVA_PATH% %JAVA_FMGR% %JS_FILES% %JS_HOME%\mobj.js

@REM ============================================================
SET SOURCE_JS=D:\ZW-Platform.WK\mp-platform\webroot\ajs
SET TARGET_JS=D:\ZW-Platform.WK\mp-game-tz\webroot\ajs
COPY /Y %SOURCE_JS%\runtime.js     %TARGET_JS%\runtime.js
COPY /Y %SOURCE_JS%\base.js        %TARGET_JS%\base.js
COPY /Y %SOURCE_JS%\lang.js        %TARGET_JS%\lang.js
COPY /Y %SOURCE_JS%\core.js        %TARGET_JS%\core.js
COPY /Y %SOURCE_JS%\ctl.toolbar.js %TARGET_JS%\ctl.toolbar.js
COPY /Y %SOURCE_JS%\ctl.tree.js    %TARGET_JS%\ctl.tree.js
COPY /Y %SOURCE_JS%\ctl.form.js    %TARGET_JS%\ctl.form.js
COPY /Y %SOURCE_JS%\ctl.table.js   %TARGET_JS%\ctl.table.js
COPY /Y %SOURCE_JS%\ctl.window.js  %TARGET_JS%\ctl.window.js
COPY /Y %SOURCE_JS%\logic.js       %TARGET_JS%\logic.js
COPY /Y %SOURCE_JS%\workspace.js   %TARGET_JS%\workspace.js
COPY /Y %SOURCE_JS%\workspace2.js  %TARGET_JS%\workspace2.js
COPY /Y %SOURCE_JS%\mobj.js        %TARGET_JS%\mobj.js
