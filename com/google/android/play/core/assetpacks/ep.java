/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

final class ep {
    private final Context a;
    private final NotificationManager b;

    public ep(Context context) {
        this.a = context;
        context = (NotificationManager)context.getSystemService("notification");
        this.b = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c(String string2) {
        synchronized (this) {
            if (string2 == null) {
                string2 = "File downloads by Play";
            }
            try {
                k52.a();
                string2 = gk3_2.a(string2);
                NotificationManager notificationManager = this.b;
                x31.a(notificationManager, (NotificationChannel)string2);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Notification a(Bundle bundle) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Context context;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 26;
        if (n4 < n7) {
            context = this.a;
            object3 = new Notification.Builder(context);
            n4 = -2;
            context = object3.setPriority(n4);
        } else {
            long l2 = 600000L;
            long l3 = bundle.getLong("notification_timeout", l2);
            object2 = fk3_2.a(this.a);
            context = ek3_2.a(object2, l3);
        }
        object3 = bundle.getParcelable("notification_on_click_intent");
        int n8 = object3 instanceof PendingIntent;
        Notification.Builder builder = null;
        if (n8 != 0) {
            object3 = (PendingIntent)object3;
        } else {
            object3 = "notification_intent_reconstruct_from_data";
            n7 = (int)(bundle.getBoolean((String)object3) ? 1 : 0);
            if (n7 == 0) {
                n7 = 0;
                object3 = null;
            } else {
                object3 = new Intent();
                object2 = bundle.getString("notification_intent_component_class_name");
                object = bundle.getString("notification_intent_component_package_name");
                if (object2 != null && object != null) {
                    ComponentName componentName = new ComponentName((String)object, (String)object2);
                    object3.setComponent(componentName);
                }
                object2 = bundle.getString("notification_intent_package");
                object3.setPackage((String)object2);
                object2 = bundle.getString("notification_intent_action");
                object3.setAction((String)object2);
                n8 = bundle.getInt("notification_intent_flags");
                object3.setFlags(n8);
                object2 = bundle.getString("notification_intent_data");
                if (object2 != null) {
                    object2 = Uri.parse((String)object2);
                    object3.setData((Uri)object2);
                }
                object2 = bundle.getString("notification_intent_extra_error_dialog_document_id");
                object = "error_doc_id";
                object3.putExtra((String)object, (String)object2);
                object2 = this.a;
                n3 = 0xC000000;
                object3 = PendingIntent.getActivity((Context)object2, (int)0, (Intent)object3, (int)n3);
            }
        }
        if (object3 != null) {
            context.setContentIntent((PendingIntent)object3);
        }
        object3 = bundle.getString("notification_title");
        object2 = bundle.getString("notification_subtext");
        n3 = 0x1080081;
        object = context.setSmallIcon(n3);
        builder = object.setOngoing(false);
        if (object3 == null) {
            object3 = "Downloading additional file";
        }
        object3 = builder.setContentTitle((CharSequence)object3);
        if (object2 == null) {
            object2 = "Transferring";
        }
        object3.setSubText((CharSequence)object2);
        object3 = "notification_color";
        int n10 = bundle.getInt((String)object3);
        if (n10 != 0) {
            bundle = context.setColor(n10);
            n7 = -1;
            bundle.setVisibility(n7);
        }
        return context.build();
    }

    public final void b(Bundle object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            String string2 = "notification_channel_name";
            object = object.getString(string2);
            this.c((String)object);
        }
    }
}

