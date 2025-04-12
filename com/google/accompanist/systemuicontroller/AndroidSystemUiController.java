/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 */
package com.google.accompanist.systemuicontroller;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.core.view.f$k;
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class AndroidSystemUiController
implements SystemUiController {
    public static final int $stable;
    private final View view;
    private final Window window;
    private final UG3 windowInsetsController;

    public AndroidSystemUiController(View view, Window window) {
        Object object = "view";
        Intrinsics.checkNotNullParameter(view, (String)object);
        this.view = view;
        this.window = window;
        object = window != null ? new UG3(view, window) : null;
        this.windowInsetsController = object;
    }

    public boolean getNavigationBarDarkContentEnabled() {
        boolean bl2;
        boolean bl3;
        Object object = this.windowInsetsController;
        boolean bl4 = false;
        if (object != null && (bl3 = ((UG3$g)(object = ((UG3)object).a)).c()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean getStatusBarDarkContentEnabled() {
        boolean bl2;
        boolean bl3;
        Object object = this.windowInsetsController;
        boolean bl4 = false;
        if (object != null && (bl3 = ((UG3$g)(object = ((UG3)object).a)).d()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public int getSystemBarsBehavior() {
        int n3;
        Object object = this.windowInsetsController;
        if (object != null) {
            object = ((UG3)object).a;
            n3 = ((UG3$g)object).a();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final /* synthetic */ boolean getSystemBarsDarkContentEnabled() {
        return jh3_2.a(this);
    }

    public boolean isNavigationBarContrastEnforced() {
        Window window;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 < n4 || (window = this.window) == null || (n3 = ij_1.a(window)) != (n4 = 1)) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isNavigationBarVisible() {
        boolean bl2;
        boolean bl3;
        Object object = ViewCompat.i(this.view);
        boolean bl4 = false;
        if (object != null && (bl3 = ((f$k)(object = ((f)object).a)).o(2)) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public boolean isStatusBarVisible() {
        int n3;
        int n4;
        Object object = ViewCompat.i(this.view);
        boolean bl2 = false;
        if (object != null && (n4 = ((f$k)(object = ((f)object).a)).o(n3 = 1)) == n3) {
            bl2 = true;
        }
        return bl2;
    }

    public final /* synthetic */ boolean isSystemBarsVisible() {
        return jh3_2.b(this);
    }

    public void setNavigationBarColor-Iv8Zu3U(long l2, boolean bl2, boolean bl3, Function1 function1) {
        String string2 = "transformColorForLightContent";
        Intrinsics.checkNotNullParameter(function1, string2);
        this.setNavigationBarDarkContentEnabled(bl2);
        this.setNavigationBarContrastEnforced(bl3);
        Window window = this.window;
        if (window != null) {
            boolean bl4;
            Object object;
            if (bl2 && ((object = this.windowInsetsController) == null || (bl2 = ((UG3$g)(object = ((UG3)object).a)).c()) != (bl4 = true))) {
                object = new OX(l2);
                OX oX = (OX)function1.invoke(object);
                l2 = oX.a;
            }
            int n3 = zx_0.i(l2);
            window.setNavigationBarColor(n3);
        }
    }

    public void setNavigationBarContrastEnforced(boolean bl2) {
        Window window;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4 && (window = this.window) != null) {
            jj_1.a(window, bl2);
        }
    }

    public void setNavigationBarDarkContentEnabled(boolean bl2) {
        Object object = this.windowInsetsController;
        if (object != null) {
            object = ((UG3)object).a;
            ((UG3$g)object).e(bl2);
        }
    }

    public void setNavigationBarVisible(boolean bl2) {
        int n3 = 2;
        if (bl2) {
            Object object = this.windowInsetsController;
            if (object != null) {
                object = ((UG3)object).a;
                ((UG3$g)object).h(n3);
            }
        } else {
            Object object = this.windowInsetsController;
            if (object != null) {
                object = ((UG3)object).a;
                ((UG3$g)object).b(n3);
            }
        }
    }

    public void setStatusBarColor-ek8zF_U(long l2, boolean bl2, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "transformColorForLightContent");
        this.setStatusBarDarkContentEnabled(bl2);
        Window window = this.window;
        if (window != null) {
            boolean bl3;
            Object object;
            if (bl2 && ((object = this.windowInsetsController) == null || (bl2 = ((UG3$g)(object = ((UG3)object).a)).d()) != (bl3 = true))) {
                object = new OX(l2);
                OX oX = (OX)function1.invoke(object);
                l2 = oX.a;
            }
            int n3 = zx_0.i(l2);
            window.setStatusBarColor(n3);
        }
    }

    public void setStatusBarDarkContentEnabled(boolean bl2) {
        Object object = this.windowInsetsController;
        if (object != null) {
            object = ((UG3)object).a;
            ((UG3$g)object).f(bl2);
        }
    }

    public void setStatusBarVisible(boolean bl2) {
        int n3 = 1;
        if (bl2) {
            Object object = this.windowInsetsController;
            if (object != null) {
                object = ((UG3)object).a;
                ((UG3$g)object).h(n3);
            }
        } else {
            Object object = this.windowInsetsController;
            if (object != null) {
                object = ((UG3)object).a;
                ((UG3$g)object).b(n3);
            }
        }
    }

    public void setSystemBarsBehavior(int n3) {
        Object object = this.windowInsetsController;
        if (object != null) {
            object = ((UG3)object).a;
            ((UG3$g)object).g(n3);
        }
    }

    public final /* synthetic */ void setSystemBarsColor-Iv8Zu3U(long l2, boolean bl2, boolean bl3, Function1 function1) {
        jh3_2.c(this, l2, bl2, bl3, function1);
    }

    public final /* synthetic */ void setSystemBarsDarkContentEnabled(boolean bl2) {
        jh3_2.d(this, bl2);
    }

    public final /* synthetic */ void setSystemBarsVisible(boolean bl2) {
        jh3_2.e(this, bl2);
    }
}

