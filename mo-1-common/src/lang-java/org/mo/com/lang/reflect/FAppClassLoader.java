package org.mo.com.lang.reflect;

//============================================================
// <T>应用类加载器。</T>
//============================================================
public class FAppClassLoader
      extends FClassLoader
{
   //============================================================
   // <T>构造应用类加载器。</T>
   //============================================================
   public FAppClassLoader(){
   }

   //============================================================
   // <T>构造应用类加载器。</T>
   //
   // @param parent 父加载器
   //============================================================
   public FAppClassLoader(ClassLoader parent){
      super(parent);
   }

   //============================================================
   // <T>增加类的路径。</T>
   //
   // @param classPath 路径
   //============================================================
   public void appendClassPath(String classPath){
      _paths.add(classPath);
   }
}
