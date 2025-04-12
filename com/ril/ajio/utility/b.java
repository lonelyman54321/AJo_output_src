/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 */
package com.ril.ajio.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.utility.SMSBroadcastReceiver;
import com.ril.ajio.utility.a;
import com.ril.ajio.utility.b$a;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static final b$a Companion;
    public final Context a;
    public final SMSBroadcastReceiver b;

    static {
        a a2 = com.ril.ajio.utility.a.a;
        Intrinsics.checkNotNullParameter(a2, "creator");
        b$a b$a = new Object();
        b$a.a = a2;
        Companion = b$a;
    }

    public b(Context object) {
        this.a = object;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        try {
            SMSBroadcastReceiver sMSBroadcastReceiver = this.b;
            if (sMSBroadcastReceiver == null) return;
            Context context = this.a;
            context.unregisterReceiver((BroadcastReceiver)sMSBroadcastReceiver);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void b(nr2_2 nr2_22) {
        Intrinsics.checkNotNullParameter(nr2_22, "smsRetrieverCallback");
        Object object = SmsRetriever.getClient(this.a);
        Intrinsics.checkNotNullExpressionValue(object, "getClient(...)");
        object = ((SmsRetrieverClient)object).startSmsRetriever();
        Intrinsics.checkNotNullExpressionValue(object, "startSmsRetriever(...)");
        or2_1 or2_12 = new or2_1(this, nr2_22);
        ((Task)object).addOnCompleteListener(or2_12);
    }
}

