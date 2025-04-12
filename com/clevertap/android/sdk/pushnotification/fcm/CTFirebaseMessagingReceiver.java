/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.pushnotification.fcm.CTFirebaseMessagingReceiver$a;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CTFirebaseMessagingReceiver
extends BroadcastReceiver
implements A52 {
    public static final /* synthetic */ int f;
    public CTFirebaseMessagingReceiver$a a;
    public String b = "";
    public boolean c;
    public BroadcastReceiver.PendingResult d;
    public long e;

    public final void a() {
        com.clevertap.android.sdk.b.k();
        this.b("push impression sent successfully by core");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String object) {
        try {
            com.clevertap.android.sdk.b.k();
            object = this.b;
            object = ((String)object).trim();
            boolean bl2 = ((String)object).isEmpty();
            if (!bl2) {
                object = this.b;
                HashMap hashMap = com.clevertap.android.sdk.a.g;
                object = hashMap.remove(object);
                object = (A52)object;
            }
            long l2 = System.nanoTime();
            object = this.d;
            if (object != null && !(bl2 = this.c)) {
                com.clevertap.android.sdk.b.k();
                object = this.d;
                object.finish();
                this.c = bl2 = true;
                object = this.a;
                if (object != null) {
                    object.cancel();
                }
                com.clevertap.android.sdk.b.k();
                object = TimeUnit.NANOSECONDS;
                long l3 = this.e;
                ((TimeUnit)((Object)object)).toSeconds(l2 -= l3);
                com.clevertap.android.sdk.b.k();
                return;
            }
            com.clevertap.android.sdk.b.k();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void onReceive(Context object, Intent intent) {
        long l2;
        this.e = l2 = System.nanoTime();
        com.clevertap.android.sdk.b.d();
        if (object != null && intent != null) {
            int n3;
            intent = intent.getExtras();
            Object object2 = new RemoteMessage((Bundle)intent);
            if ((intent = fj0_1.a((RemoteMessage)object2)) == null) {
                return;
            }
            int n4 = ((RemoteMessage)object2).getPriority();
            if (n4 != (n3 = 2)) {
                com.clevertap.android.sdk.b.d();
                return;
            }
            String string2 = "4500";
            Object object3 = intent.getString("ctrmt", string2);
            long l3 = Long.parseLong((String)object3);
            Object object4 = this.goAsync();
            this.d = object4;
            object4 = com.clevertap.android.sdk.a.i((Bundle)intent);
            boolean bl2 = ((m52_0)object4).a;
            if (bl2) {
                object4 = yz3_0.a;
                object4 = (String)((RemoteMessage)object2).getData().get("wzrk_tsr_fb");
                bl2 = Boolean.parseBoolean((String)object4);
                object2 = ((RemoteMessage)object2).getData();
                String string3 = "wzrk_fallback";
                object2 = (String)object2.get(string3);
                boolean bl3 = Boolean.parseBoolean((String)object2);
                if (!bl2 && bl3) {
                    object2 = zb2_0.a((Bundle)intent);
                    object4 = intent.getString("wzrk_pid", "");
                    string3 = "_";
                    this.b = object2 = n1.a((String)object2, string3, (String)object4);
                    object4 = com.clevertap.android.sdk.a.g;
                    ((HashMap)object4).put(object2, this);
                    object2 = new CTFirebaseMessagingReceiver$a(this, l3);
                    this.a = object2;
                    object2.start();
                    n3 = 0;
                    string2 = null;
                    object3 = new oh_1(this, 0, object, intent);
                    object2 = new Thread((Runnable)object3);
                    ((Thread)object2).start();
                } else {
                    com.clevertap.android.sdk.b.k();
                    object = "isRenderFallback is false";
                    this.b((String)object);
                }
            } else {
                com.clevertap.android.sdk.b.k();
                object = "push is not from CleverTap.";
                this.b((String)object);
            }
        }
    }
}

