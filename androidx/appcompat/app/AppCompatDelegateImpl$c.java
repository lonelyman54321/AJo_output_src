/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.Window$Callback
 */
package androidx.appcompat.app;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;

public final class AppCompatDelegateImpl$c
implements h$a {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public AppCompatDelegateImpl$c(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final boolean a(d d2) {
        Window.Callback callback2 = this.a.l.getCallback();
        if (callback2 != null) {
            int n3 = 108;
            callback2.onMenuOpened(n3, (Menu)d2);
        }
        return true;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        this.a.F(d2);
    }
}

