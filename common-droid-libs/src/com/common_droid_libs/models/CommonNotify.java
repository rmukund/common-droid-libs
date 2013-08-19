package com.common_droid_libs.models;

/**
 * @author Bijesh
 */
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;

public class CommonNotify {

private Context context;	
private Intent intent;
private PendingIntent pendingIntent;
private String subject;
private String message;
private Bitmap bitmapImage;

public CommonNotify(Context context,Intent intent,String subject,String message,Bitmap img){
	this.intent = intent;
	this.subject = subject;
	this.message = message;
	this.bitmapImage = img;
	this.context = context;
	init(context);
}
private void init(Context context){
	pendingIntent = PendingIntent.getActivity(context,0, intent, 0);
}

public Context getContext() {
	return context;
}
public NotificationManager getNotificationManger() {
	return (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
}
public Intent getIntent() {
	return intent;
}
public void setIntent(Intent intent) {
	this.intent = intent;
}
public PendingIntent getPendingIntent() {
	return pendingIntent;
}
public void setPendingIntent(PendingIntent pendingIntent) {
	this.pendingIntent = pendingIntent;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Bitmap getBitmapImage() {
	return bitmapImage;
}
public void setBitmapImage(Bitmap bitmapImage) {
	this.bitmapImage = bitmapImage;
}

}
