/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatDelegateImpl$j;

public final class AppCompatDelegateImpl$j$a
extends BroadcastReceiver {
    public final /* synthetic */ AppCompatDelegateImpl$j a;

    public AppCompatDelegateImpl$j$a(AppCompatDelegateImpl$j j3) {
        this.a = j3;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.d();
    }
}

