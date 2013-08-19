package com.common_droid_libs.app;

/**
 * @author Bijesh
 */

import android.app.Application;
import android.content.Context;

public class CommonApplication extends Application{
   private static Context baseContext;	
   @Override	
   public void onCreate() {
	   setCommonApplication(this);
   };
   private void setCommonApplication(Context context){
	   baseContext = context;
   }
   public static Context getCommonApplication(){
	   return baseContext;
   }
}
