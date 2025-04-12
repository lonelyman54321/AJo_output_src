/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 */
package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;

public class FcmPushProvider
implements ci_0 {
    private vc1_2 handler;

    public FcmPushProvider(di_1 di_12, Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        hj0_1 hj0_12 = new hj0_1(di_12, context, cleverTapInstanceConfig);
        this.handler = hj0_12;
    }

    public int getPlatform() {
        return 1;
    }

    public XB2$a getPushType() {
        ((hj0_1)this.handler).getClass();
        return XB2$a.FCM;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public boolean isAvailable() {
        boolean bl2;
        block8: {
            Object object;
            CleverTapInstanceConfig cleverTapInstanceConfig;
            String string2;
            Object object2;
            block7: {
                int n3;
                object2 = (hj0_1)this.handler;
                string2 = "PushProvider";
                cleverTapInstanceConfig = ((hj0_1)object2).a;
                bl2 = false;
                object2 = ((hj0_1)object2).b;
                try {
                    object = GooglePlayServicesUtil.GMS_ERROR_DIALOG;
                    object = GoogleApiAvailabilityLight.getInstance();
                    n3 = ((GoogleApiAvailabilityLight)object).isGooglePlayServicesAvailable((Context)object2);
                    if (n3 != 0) break block7;
                }
                catch (ClassNotFoundException classNotFoundException) {}
                object2 = FirebaseApp.getInstance();
                object2 = ((FirebaseApp)object2).getOptions();
                n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((FirebaseOptions)object2).getGcmSenderId())) ? 1 : 0);
                if (n3 != 0) {
                    object2 = new StringBuilder();
                    object = xb2_0.a;
                    ((StringBuilder)object2).append((String)object);
                    object = "The FCM sender ID is not set. Unable to register for FCM.";
                    ((StringBuilder)object2).append((String)object);
                    object2 = ((StringBuilder)object2).toString();
                    cleverTapInstanceConfig.e(string2, (String)object2);
                } else {
                    bl2 = true;
                }
                break block8;
            }
            try {
                object2 = new StringBuilder();
                object = xb2_0.a;
                ((StringBuilder)object2).append((String)object);
                object = "Google Play services is currently unavailable.";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                cleverTapInstanceConfig.e(string2, (String)object2);
            }
            catch (Throwable throwable) {
                object2 = xb2_0.a;
                cleverTapInstanceConfig.c();
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isSupported() {
        Context context = ((hj0_1)this.handler).b;
        String string2 = "com.android.vending";
        boolean bl2 = false;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo(string2, 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            string2 = "com.google.market";
            try {
                context = context.getPackageManager();
                context.getPackageInfo(string2, 0);
                return true;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                return bl2;
            }
        }
    }

    public int minSDKSupportVersionCode() {
        return 0;
    }

    public void requestToken() {
        Object object = (hj0_1)this.handler;
        Object object2 = "PushProvider";
        CleverTapInstanceConfig cleverTapInstanceConfig = ((hj0_1)object).a;
        Object object3 = new StringBuilder();
        String string2 = xb2_0.a;
        ((StringBuilder)object3).append(string2);
        string2 = "Requesting FCM token using googleservices.json";
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        cleverTapInstanceConfig.e((String)object2, (String)object3);
        object2 = FirebaseMessaging.getInstance();
        object2 = ((FirebaseMessaging)object2).getToken();
        object3 = new gj0_1((hj0_1)object);
        try {
            ((Task)object2).addOnCompleteListener((OnCompleteListener)object3);
        }
        catch (Throwable throwable) {
            object2 = xb2_0.a;
            cleverTapInstanceConfig.c();
            object2 = XB2$a.FCM;
            object = ((hj0_1)object).c;
            cleverTapInstanceConfig = null;
            object.a(null, (XB2$a)((Object)object2));
        }
    }

    public void setHandler(vc1_2 vc1_22) {
        this.handler = vc1_22;
    }
}

