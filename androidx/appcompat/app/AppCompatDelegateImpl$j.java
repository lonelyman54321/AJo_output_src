/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 */
package androidx.appcompat.app;

import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$j$a;

public abstract class AppCompatDelegateImpl$j {
    public AppCompatDelegateImpl$j$a a;
    public final /* synthetic */ AppCompatDelegateImpl b;

    public AppCompatDelegateImpl$j(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.b = appCompatDelegateImpl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        AppCompatDelegateImpl$j$a appCompatDelegateImpl$j$a = this.a;
        if (appCompatDelegateImpl$j$a != null) {
            try {
                AppCompatDelegateImpl appCompatDelegateImpl = this.b;
                appCompatDelegateImpl = appCompatDelegateImpl.k;
                appCompatDelegateImpl.unregisterReceiver(appCompatDelegateImpl$j$a);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            appCompatDelegateImpl$j$a = null;
            this.a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public final void e() {
        this.a();
        IntentFilter intentFilter = this.b();
        int n3 = intentFilter.countActions();
        if (n3 == 0) {
            return;
        }
        AppCompatDelegateImpl$j$a appCompatDelegateImpl$j$a = this.a;
        if (appCompatDelegateImpl$j$a == null) {
            this.a = appCompatDelegateImpl$j$a = new AppCompatDelegateImpl$j$a(this);
        }
        appCompatDelegateImpl$j$a = this.b.k;
        AppCompatDelegateImpl$j$a appCompatDelegateImpl$j$a2 = this.a;
        appCompatDelegateImpl$j$a.registerReceiver(appCompatDelegateImpl$j$a2, intentFilter);
    }
}

