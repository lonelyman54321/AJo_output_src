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
import androidx.appcompat.app.AppCompatDelegateImpl$m;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h$a;

public final class AppCompatDelegateImpl$n
implements h$a {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public AppCompatDelegateImpl$n(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    public final boolean a(d d2) {
        Object object = d2.getRootMenu();
        if (d2 == object) {
            int n3;
            Window.Callback callback2;
            object = this.a;
            boolean bl2 = ((AppCompatDelegateImpl)object).G;
            if (bl2 && (callback2 = ((AppCompatDelegateImpl)object).l.getCallback()) != null && (n3 = ((AppCompatDelegateImpl)object).R) == 0) {
                n3 = 108;
                callback2.onMenuOpened(n3, (Menu)d2);
            }
        }
        return true;
    }

    public final void onCloseMenu(d d2, boolean bl2) {
        AppCompatDelegateImpl$m appCompatDelegateImpl$m;
        AppCompatDelegateImpl appCompatDelegateImpl;
        boolean bl3;
        boolean bl4;
        d d5;
        block6: {
            d5 = d2.getRootMenu();
            int n3 = 0;
            bl4 = true;
            bl3 = d5 != d2;
            if (bl3) {
                d2 = d5;
            }
            appCompatDelegateImpl = this.a;
            AppCompatDelegateImpl$m[] appCompatDelegateImpl$mArray = appCompatDelegateImpl.M;
            int n4 = appCompatDelegateImpl$mArray != null ? appCompatDelegateImpl$mArray.length : 0;
            while (n3 < n4) {
                d d7;
                appCompatDelegateImpl$m = appCompatDelegateImpl$mArray[n3];
                if (appCompatDelegateImpl$m == null || (d7 = appCompatDelegateImpl$m.h) != d2) {
                    ++n3;
                    continue;
                }
                break block6;
            }
            appCompatDelegateImpl$m = null;
        }
        if (appCompatDelegateImpl$m != null) {
            if (bl3) {
                int n7 = appCompatDelegateImpl$m.a;
                appCompatDelegateImpl.E(n7, appCompatDelegateImpl$m, d5);
                appCompatDelegateImpl.G(appCompatDelegateImpl$m, bl4);
            } else {
                appCompatDelegateImpl.G(appCompatDelegateImpl$m, bl2);
            }
        }
    }
}

