package com.common_droid_libs.app;

/**
 * @author Bijesh
 */

import com.common_droid_libs.models.CommonNotify;
import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;

public class CommonNotification {
	/**
	 * Use this method to create notification by initializing the com.common_droid_libs.models.CommonNotify model 
	 * @param context
	 * @param commonNotify
	 */
    public void createNotification(CommonNotify commonNotify){
    	NotificationCompat.Builder builder = new NotificationCompat.Builder(commonNotify.getContext())
		.setContentTitle(commonNotify.getSubject())
		.setContentText(commonNotify.getMessage())
		.setLargeIcon(commonNotify.getBitmapImage())
		.setAutoCancel(true)
		.setContentIntent(commonNotify.getPendingIntent())
		.setWhen(System.currentTimeMillis())
		.setDefaults(Notification.DEFAULT_ALL);
	    
		Notification notification = builder.build();
		NotificationManager notificationManager = commonNotify.getNotificationManger();
		notificationManager.notify(0, notification);
		
    }
}
