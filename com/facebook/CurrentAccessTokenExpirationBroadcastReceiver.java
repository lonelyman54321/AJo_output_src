/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.b;
import kotlin.jvm.internal.Intrinsics;

public final class CurrentAccessTokenExpirationBroadcastReceiver
extends BroadcastReceiver {
    public final void onReceive(Context object, Intent object2) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, "intent");
        object = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
        object2 = object2.getAction();
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2 && (bl2 = FacebookSdk.isInitialized())) {
            object = b.f.a();
            object2 = ((b)object).c;
            ((b)object).b((AccessToken)object2, (AccessToken)object2);
        }
    }
}

