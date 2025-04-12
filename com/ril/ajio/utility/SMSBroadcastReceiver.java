/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.ril.ajio.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.ril.ajio.utility.SMSBroadcastReceiver$a;
import com.ril.ajio.utility.SMSBroadcastReceiver$b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

public final class SMSBroadcastReceiver
extends BroadcastReceiver {
    public static final SMSBroadcastReceiver$a Companion;
    public SMSBroadcastReceiver$b a;

    static {
        SMSBroadcastReceiver$a sMSBroadcastReceiver$a;
        Companion = sMSBroadcastReceiver$a = new Object();
    }

    public final void onReceive(Context object, Intent object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "intent");
        object = object2.getAction();
        Object[] objectArray = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
        boolean bl2 = Intrinsics.areEqual(objectArray, object);
        if (bl2) {
            int n3;
            object = object2.getExtras();
            if (object != null) {
                object2 = object.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            } else {
                n3 = 0;
                object2 = null;
            }
            objectArray = "null cannot be cast to non-null type com.google.android.gms.common.api.Status";
            Intrinsics.checkNotNull(object2, (String)objectArray);
            object2 = (Status)object2;
            n3 = ((Status)object2).getStatusCode();
            if (n3 == 0) {
                object2 = (String)object.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                objectArray = null;
                if (object2 != null) {
                    object = Pattern.compile("(\\d{6})").matcher((CharSequence)object2);
                    Pattern pattern = Pattern.compile("(\\d{4})");
                    object2 = pattern.matcher((CharSequence)object2);
                    boolean bl3 = ((Matcher)object).find();
                    if (bl3) {
                        object2 = this.a;
                        if (object2 != null) {
                            object = ((Matcher)object).group(0);
                            object2.a((String)object);
                        }
                    } else {
                        bl2 = ((Matcher)object2).find();
                        if (bl2 && (object = this.a) != null) {
                            object2 = ((Matcher)object2).group(0);
                            object.a((String)object2);
                        }
                    }
                } else {
                    object2 = yn3_0.a;
                    String string2 = "Message is null ";
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object);
                    object = stringBuilder.toString();
                    objectArray = new Object[]{};
                    ((yn3$a)object2).d((String)object, objectArray);
                }
            }
        }
    }
}

