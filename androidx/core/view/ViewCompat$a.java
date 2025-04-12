/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
package androidx.core.view;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.core.view.a$a;

public abstract class ViewCompat$a {
    public final int a;
    public final Class b;
    public final int c;
    public final int d;

    public ViewCompat$a(int n3, Class clazz, int n4, int n7) {
        this.a = n3;
        this.b = clazz;
        this.d = n4;
        this.c = n7;
    }

    public abstract Object a(View var1);

    public abstract void b(View var1, Object var2);

    public final Object c(View object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = this.c;
        if (n3 >= n4) {
            return this.a((View)object);
        }
        n3 = this.a;
        Class clazz = this.b;
        if ((n3 = (int)(clazz.isInstance(object = object.getTag(n3)) ? 1 : 0)) != 0) {
            return object;
        }
        return null;
    }

    public final void d(View view, Object object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = this.c;
        if (n3 >= n4) {
            this.b(view, object);
        } else {
            Object object2 = this.c(view);
            n3 = (int)(this.e(object2, object) ? 1 : 0);
            if (n3 != 0) {
                object2 = ViewCompat.d(view);
                if (object2 == null) {
                    n3 = 0;
                    object2 = null;
                } else {
                    n4 = object2 instanceof a$a;
                    if (n4 != 0) {
                        object2 = ((a$a)((Object)object2)).a;
                    } else {
                        a a2 = new a((View.AccessibilityDelegate)object2);
                        object2 = a2;
                    }
                }
                if (object2 == null) {
                    object2 = new a();
                }
                ViewCompat.s(view, (a)object2);
                n3 = this.a;
                view.setTag(n3, object);
                int n7 = this.d;
                ViewCompat.k(n7, view);
            }
        }
    }

    public abstract boolean e(Object var1, Object var2);
}

