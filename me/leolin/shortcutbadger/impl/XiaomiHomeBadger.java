/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build
 */
package me.leolin.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.ril.ajio.AJIOApplication;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class XiaomiHomeBadger
implements mu_1 {
    public ResolveInfo a;

    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Class[] classArray;
        Object object2;
        GenericDeclaration genericDeclaration;
        Object object3;
        int n4;
        block32: {
            block31: {
                n4 = 1;
                object3 = "";
                genericDeclaration = "android.app.MiuiNotification";
                genericDeclaration = Class.forName((String)((Object)genericDeclaration));
                genericDeclaration = ((Class)genericDeclaration).newInstance();
                object2 = genericDeclaration.getClass();
                classArray = "messageCount";
                object2 = ((Class)object2).getDeclaredField((String)classArray);
                ((AccessibleObject)object2).setAccessible(n4 != 0);
                if (n3 != 0) break block31;
                classArray = object3;
                break block32;
            }
            classArray = n3;
        }
        classArray = String.valueOf(classArray);
        try {
            ((Field)object2).set(genericDeclaration, classArray);
        }
        catch (Exception exception) {
            classArray = n3;
            try {
                ((Field)object2).set(genericDeclaration, classArray);
            }
            catch (Exception exception2) {
                genericDeclaration = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
                object2 = new StringBuilder();
                classArray = object.getPackageName();
                ((StringBuilder)object2).append((String)classArray);
                classArray = "/";
                ((StringBuilder)object2).append((String)classArray);
                object = object.getClassName();
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
                object2 = "android.intent.extra.update_application_component_name";
                genericDeclaration.putExtra((String)object2, (String)object);
                object = n3 == 0 ? object3 : Integer.valueOf(n3);
                object = String.valueOf(object);
                object2 = "android.intent.extra.update_application_message_text";
                genericDeclaration.putExtra((String)object2, (String)object);
                try {
                    xd_2.a(aJIOApplication, (Intent)genericDeclaration);
                }
                catch (ShortcutBadgeException shortcutBadgeException) {}
            }
        }
        object = Build.MANUFACTURER;
        genericDeclaration = "Xiaomi";
        boolean bl2 = ((String)object).equalsIgnoreCase((String)((Object)genericDeclaration));
        if (bl2) {
            object = this.a;
            if (object == null) {
                object = new Intent("android.intent.action.MAIN");
                object.addCategory("android.intent.category.HOME");
                genericDeclaration = aJIOApplication.getPackageManager();
                int n7 = 65536;
                object = genericDeclaration.resolveActivity((Intent)object, n7);
                this.a = object;
            }
            if ((object = this.a) != null) {
                object = (NotificationManager)aJIOApplication.getSystemService("notification");
                genericDeclaration = new Notification.Builder((Context)aJIOApplication);
                aJIOApplication = genericDeclaration.setContentTitle((CharSequence)object3).setContentText((CharSequence)object3);
                object3 = this.a;
                int n8 = object3.getIconResource();
                aJIOApplication = aJIOApplication.setSmallIcon(n8).build();
                try {
                    object3 = aJIOApplication.getClass();
                    genericDeclaration = "extraNotification";
                }
                catch (Exception exception) {
                    object = new Exception("not able to set badge", exception);
                    throw object;
                }
                object3 = ((Class)object3).getDeclaredField((String)((Object)genericDeclaration));
                object3 = ((Field)object3).get(aJIOApplication);
                genericDeclaration = object3.getClass();
                object2 = "setMessageCount";
                classArray = new Class[n4];
                Class<Integer> clazz = Integer.TYPE;
                classArray[0] = clazz;
                genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod((String)object2, classArray);
                Integer n10 = n3;
                Object[] objectArray = new Object[n4];
                objectArray[0] = n10;
                ((Method)genericDeclaration).invoke(object3, objectArray);
                object.notify(0, (Notification)aJIOApplication);
            }
        }
    }

    public final List b() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }
}

