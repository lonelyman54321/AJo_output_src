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
import com.ril.ajio.utility.NetworkRedirectionReceiver$a;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class NetworkRedirectionReceiver
extends BroadcastReceiver {
    public static final NetworkRedirectionReceiver$a Companion;
    public static boolean b;
    public final Context a;

    static {
        NetworkRedirectionReceiver$a networkRedirectionReceiver$a;
        Companion = networkRedirectionReceiver$a = new Object();
    }

    public NetworkRedirectionReceiver(Context context) {
        Intrinsics.checkNotNullParameter(context, "activityContext");
        this.a = context;
    }

    public final void onReceive(Context object, Intent object2) {
        int n3;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "intent";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        boolean bl2 = b;
        if (!bl2 && (object = object2.getStringExtra("redirection_path")) != null && (n3 = ((String)object).length()) != 0) {
            n3 = 1;
            b = n3;
            object2 = CustomWebViewActivity.Companion;
            string2 = this.a;
            int n4 = -1;
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)object2, (Context)string2, (String)object, n4);
        }
    }
}

