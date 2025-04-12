/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.AsyncQueryHandler
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Looper
 */
package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Looper;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger
implements mu_1 {
    public final Uri a;
    public m93_0 b;

    public SonyHomeBadger() {
        Uri uri;
        this.a = uri = Uri.parse((String)"content://com.sonymobile.home.resourceprovider/badge");
    }

    public final void a(AJIOApplication object, ComponentName object2, int n3) {
        PackageManager packageManager = object.getPackageManager();
        String string2 = "com.sonymobile.home.resourceprovider";
        boolean bl2 = false;
        if ((packageManager = packageManager.resolveContentProvider(string2, 0)) != null) {
            if (n3 >= 0) {
                packageManager = new ContentValues();
                Object object3 = n3;
                packageManager.put("badge_count", (Integer)object3);
                object3 = object2.getPackageName();
                packageManager.put("package_name", (String)object3);
                object2 = object2.getClassName();
                packageManager.put("activity_name", (String)object2);
                object2 = Looper.myLooper();
                object3 = Looper.getMainLooper();
                string2 = this.a;
                if (object2 == object3) {
                    object2 = this.b;
                    if (object2 == null) {
                        object = object.getApplicationContext().getContentResolver();
                        object2 = new AsyncQueryHandler((ContentResolver)object);
                        this.b = object2;
                    }
                    object = this.b;
                    object2 = null;
                    object.startInsert(0, null, (Uri)string2, (ContentValues)packageManager);
                } else {
                    object = object.getApplicationContext().getContentResolver();
                    object.insert((Uri)string2, (ContentValues)packageManager);
                }
            }
        } else {
            packageManager = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            string2 = object2.getPackageName();
            String string3 = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
            packageManager.putExtra(string3, string2);
            object2 = object2.getClassName();
            packageManager.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", (String)object2);
            object2 = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
            string2 = String.valueOf(n3);
            packageManager.putExtra((String)object2, string2);
            if (n3 > 0) {
                bl2 = true;
            }
            object2 = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
            packageManager.putExtra((String)object2, bl2);
            object.sendBroadcast((Intent)packageManager);
        }
    }

    public final List b() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }
}

