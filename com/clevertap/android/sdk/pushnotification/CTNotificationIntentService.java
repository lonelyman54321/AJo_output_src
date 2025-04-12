/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
package com.clevertap.android.sdk.pushnotification;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;

public class CTNotificationIntentService
extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private n2_0 mActionButtonClickHandler;

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void handleActionButtonClick(Bundle object) {
        Throwable throwable2;
        block9: {
            boolean bl2;
            n2_0 n2_02;
            String string2;
            int n3;
            boolean bl3;
            int n4;
            String string3;
            block8: {
                Object object2;
                block7: {
                    string3 = "dl";
                    String string4 = "autoCancel";
                    n4 = 0;
                    String string5 = null;
                    try {
                        bl3 = object.getBoolean(string4, false);
                        string5 = "notificationId";
                        n3 = -1;
                        n4 = object.getInt(string5, n3);
                        string2 = object.getString(string3);
                        object2 = this.getApplicationContext();
                        n2_02 = this.mActionButtonClickHandler;
                        int n7 = n2_02.a((Context)object2, (Bundle)object, n4);
                        if (n7 != 0) {
                            return;
                        }
                        n7 = Build.VERSION.SDK_INT;
                        int n8 = 31;
                        if (n7 >= n8) {
                            return;
                        }
                        if (string2 == null) break block7;
                        String string6 = "android.intent.action.VIEW";
                        string2 = Uri.parse((String)string2);
                        n2_02 = new Intent(string6, (Uri)string2);
                        yz3_0.k(object2, (Intent)n2_02);
                        break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                string2 = object2.getPackageManager();
                object2 = object2.getPackageName();
                n2_02 = string2.getLaunchIntentForPackage((String)object2);
            }
            if (n2_02 == null) {
                b.j();
                return;
            }
            int n10 = 0x34000000;
            n2_02.setFlags(n10);
            n2_02.putExtras((Bundle)object);
            n2_02.removeExtra(string3);
            string3 = "pt_dismiss_on_click";
            string2 = "";
            object = object.getString(string3, string2);
            if (bl3 && n4 > n3 && (bl2 = ((String)object).isEmpty())) {
                object = this.getApplicationContext();
                string3 = "notification";
                object = object.getSystemService(string3);
                if ((object = (NotificationManager)object) != null) {
                    object.cancel(n4);
                }
            }
            string3 = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
            object = new Intent(string3);
            this.sendBroadcast((Intent)object);
            this.startActivity((Intent)n2_02);
            return;
        }
        throwable2.getLocalizedMessage();
        b.j();
    }

    public void onHandleIntent(Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            return;
        }
        Object object = a.f;
        boolean bl2 = yb2_0.c(bundle);
        if (bl2 && object != null) {
            this.mActionButtonClickHandler = object;
        } else {
            object = YB2$a.a;
            this.mActionButtonClickHandler = object;
        }
        object = bundle.getString("ct_type");
        String string2 = TYPE_BUTTON_CLICK;
        boolean bl3 = string2.equals(object);
        if (bl3) {
            b.j();
            this.handleActionButtonClick(bundle);
        } else {
            intent.getAction();
            b.j();
        }
    }
}

