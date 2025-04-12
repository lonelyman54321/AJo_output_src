/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.ProxyNotificationPreferences;

public final class j
implements OnSuccessListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ j(Context context, boolean bl2) {
        this.a = context;
        this.b = bl2;
    }

    public final void onSuccess(Object object) {
        boolean bl2 = this.b;
        object = (Void)object;
        ProxyNotificationPreferences.a(this.a, bl2, (Void)object);
    }
}

