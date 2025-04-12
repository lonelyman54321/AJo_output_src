/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayList;

public class FcmMessageListenerService
extends FirebaseMessagingService {
    public final lh_1 a;

    public FcmMessageListenerService() {
        lh_1 lh_12;
        this.a = lh_12 = new lh_1();
    }

    public final void onMessageReceived(RemoteMessage remoteMessage) {
        lh_1 lh_12 = this.a;
        Context context = this.getApplicationContext();
        lh_12.a(context, remoteMessage);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onNewToken(String object) {
        super.onNewToken((String)object);
        Object object2 = this.a;
        Object object3 = this.getApplicationContext();
        object2.getClass();
        try {
            object2 = XB2$a.FCM;
            Object object4 = ((XB2$a)((Object)object2)).getType();
            Object object5 = ((XB2$a)((Object)object2)).getType();
            boolean bl2 = ((String)object4).equals(object5);
            if (bl2) {
                object3 = com.clevertap.android.sdk.a.c((Context)object3);
                object3 = ((ArrayList)object3).iterator();
                while (bl2 = object3.hasNext()) {
                    object4 = object3.next();
                    object4 = (a)object4;
                    object4 = ((a)object4).b;
                    object4 = ((H80)object4).p;
                    object4.getClass();
                    Object object6 = TextUtils.isEmpty((CharSequence)object);
                    if (object6 != false) continue;
                    object5 = hC2$a.a;
                    int n3 = ((Enum)object2).ordinal();
                    object6 = object5[n3];
                    if (object6 != (n3 = 1)) continue;
                    object5 = XB2$a.FCM;
                    ((hC2)object4).e((String)object, (XB2$a)((Object)object5));
                }
            }
            object = xb2_0.a;
            b.d();
            return;
        }
        catch (Throwable throwable) {
            object = xb2_0.a;
            object = a$a.INFO;
            ((a$a)((Object)object)).intValue();
        }
    }
}

