/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 */
package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;

public final class SingletonConnectivityReceiver$a
implements ZZ0 {
    public final /* synthetic */ Context a;

    public SingletonConnectivityReceiver$a(Context context) {
        this.a = context;
    }

    public final Object get() {
        return (ConnectivityManager)this.a.getSystemService("connectivity");
    }
}

