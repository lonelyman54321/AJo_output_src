/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import androidx.core.view.f$f;
import androidx.core.view.f$g;
import androidx.core.view.f$h;
import androidx.core.view.f$i;
import androidx.core.view.f$j;
import androidx.core.view.f$k;
import java.util.Objects;

public final class f {
    public static final f b;
    public final f$k a;

    static {
        f f5;
        f f6;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        b = n3 >= n4 ? (f6 = f$j.q) : (f5 = f$k.b);
    }

    public f() {
        f$k f$k;
        this.a = f$k = new f$k(this);
    }

    public f(WindowInsets windowInsets) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            f$j f$j = new f$j(this, windowInsets);
            this.a = f$j;
        } else {
            n4 = 29;
            if (n3 >= n4) {
                f$i f$i = new f$i(this, windowInsets);
                this.a = f$i;
            } else {
                n4 = 28;
                if (n3 >= n4) {
                    f$h f$h = new f$h(this, windowInsets);
                    this.a = f$h;
                } else {
                    f$g f$g = new f$g(this, windowInsets);
                    this.a = f$g;
                }
            }
        }
    }

    public static ei1 e(ei1 ei12, int n3, int n4, int n7, int n8) {
        int n10 = ei12.a - n3;
        n10 = Math.max(0, n10);
        int n14 = ei12.b - n4;
        n14 = Math.max(0, n14);
        int n15 = ei12.c - n7;
        n15 = Math.max(0, n15);
        int n16 = ei12.d - n8;
        int n17 = Math.max(0, n16);
        if (n10 == n3 && n14 == n4 && n15 == n7 && n17 == n8) {
            return ei12;
        }
        return ei1.b(n10, n14, n15, n17);
    }

    public static f h(View view, WindowInsets object) {
        boolean bl2;
        object.getClass();
        f f5 = new f((WindowInsets)object);
        if (view != null && (bl2 = view.isAttachedToWindow())) {
            object = ViewCompat.i(view);
            f$k f$k = f5.a;
            f$k.q((f)object);
            view = view.getRootView();
            f$k.d(view);
        }
        return f5;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof f;
        if (!bl2) {
            return false;
        }
        object = ((f)object).a;
        return Objects.equals(this.a, object);
    }

    public final f f(int n3, int n4, int n7, int n8) {
        int n10 = Build.VERSION.SDK_INT;
        int n14 = 30;
        f$e f$e = n10 >= n14 ? new f$d(this) : (n10 >= (n14 = 29) ? new f$c(this) : new f$b(this));
        ei1 ei12 = ei1.b(n3, n4, n7, n8);
        f$e.g(ei12);
        return f$e.b();
    }

    public final WindowInsets g() {
        f$k f$k = this.a;
        boolean bl2 = f$k instanceof f$f;
        f$k = bl2 ? ((f$f)f$k).c : null;
        return f$k;
    }

    public final int hashCode() {
        int n3;
        f$k f$k = this.a;
        if (f$k == null) {
            n3 = 0;
            f$k = null;
        } else {
            n3 = f$k.hashCode();
        }
        return n3;
    }
}

