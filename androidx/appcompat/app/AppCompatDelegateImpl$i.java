/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.PowerManager
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$e;
import androidx.appcompat.app.AppCompatDelegateImpl$j;

public final class AppCompatDelegateImpl$i
extends AppCompatDelegateImpl$j {
    public final PowerManager c;
    public final /* synthetic */ AppCompatDelegateImpl d;

    public AppCompatDelegateImpl$i(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        this.d = appCompatDelegateImpl;
        super(appCompatDelegateImpl);
        appCompatDelegateImpl = (PowerManager)context.getApplicationContext().getSystemService("power");
        this.c = appCompatDelegateImpl;
    }

    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    public final int c() {
        PowerManager powerManager = this.c;
        int n3 = AppCompatDelegateImpl$e.a(powerManager);
        n3 = n3 != 0 ? 2 : 1;
        return n3;
    }

    public final void d() {
        boolean bl2 = true;
        this.d.B(bl2, bl2);
    }
}

