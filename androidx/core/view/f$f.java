/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.DisplayCutout
 *  android.view.View
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$b;
import androidx.core.view.f$c;
import androidx.core.view.f$d;
import androidx.core.view.f$e;
import androidx.core.view.f$k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class f$f
extends f$k {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public ei1[] d;
    public ei1 e = null;
    public f f;
    public ei1 g;

    public f$f(f f5, WindowInsets windowInsets) {
        super(f5);
        this.c = windowInsets;
    }

    private ei1 s(int n3, boolean bl2) {
        int n4;
        ei1 ei12 = ei1.e;
        for (int i3 = 1; i3 <= (n4 = 256); i3 <<= 1) {
            n4 = n3 & i3;
            if (n4 == 0) continue;
            ei1 ei13 = this.t(i3, bl2);
            ei12 = ei1.a(ei12, ei13);
        }
        return ei12;
    }

    private ei1 u() {
        f f5 = this.f;
        if (f5 != null) {
            return f5.a.h();
        }
        return ei1.e;
    }

    private ei1 v(View object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 < n4) {
            AnnotatedElement annotatedElement;
            n3 = (int)(h ? 1 : 0);
            if (n3 == 0) {
                f$f.x();
            }
            AccessibleObject accessibleObject = i;
            n4 = 0;
            ei1 ei12 = null;
            if (accessibleObject != null && (annotatedElement = j) != null && (annotatedElement = k) != null) {
                block16: {
                    block15: {
                        object = ((Method)accessibleObject).invoke(object, null);
                        if (object != null) break block15;
                        return null;
                    }
                    accessibleObject = l;
                    object = ((Field)accessibleObject).get(object);
                    accessibleObject = k;
                    object = ((Field)accessibleObject).get(object);
                    object = (Rect)object;
                    if (object == null) break block16;
                    n3 = object.left;
                    int n7 = object.top;
                    int n8 = object.right;
                    int n10 = object.bottom;
                    try {
                        ei12 = ei1.b(n3, n7, n8, n10);
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        reflectiveOperationException.getMessage();
                    }
                }
                return ei12;
            }
            return null;
        }
        object = new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        throw object;
    }

    private static void x() {
        boolean bl2 = true;
        AnnotatedElement annotatedElement = View.class;
        String string2 = "getViewRootImpl";
        annotatedElement = ((Class)annotatedElement).getDeclaredMethod(string2, null);
        i = annotatedElement;
        annotatedElement = "android.view.View$AttachInfo";
        annotatedElement = Class.forName((String)((Object)annotatedElement));
        j = annotatedElement;
        string2 = "mVisibleInsets";
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        k = annotatedElement;
        annotatedElement = "android.view.ViewRootImpl";
        annotatedElement = Class.forName((String)((Object)annotatedElement));
        string2 = "mAttachInfo";
        annotatedElement = ((Class)annotatedElement).getDeclaredField(string2);
        l = annotatedElement;
        annotatedElement = k;
        ((AccessibleObject)annotatedElement).setAccessible(bl2);
        annotatedElement = l;
        try {
            ((AccessibleObject)annotatedElement).setAccessible(bl2);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            reflectiveOperationException.getMessage();
        }
        h = bl2;
    }

    public void d(View object) {
        if ((object = this.v((View)object)) == null) {
            object = ei1.e;
        }
        this.y((ei1)object);
    }

    public boolean equals(Object object) {
        boolean bl2 = super.equals(object);
        if (!bl2) {
            return false;
        }
        object = (f$f)object;
        ei1 ei12 = this.g;
        object = ((f$f)object).g;
        return Objects.equals(ei12, object);
    }

    public ei1 f(int n3) {
        return this.s(n3, false);
    }

    public final ei1 j() {
        ei1 ei12 = this.e;
        if (ei12 == null) {
            ei12 = this.c;
            int n3 = ei12.getSystemWindowInsetLeft();
            int n4 = ei12.getSystemWindowInsetTop();
            int n7 = ei12.getSystemWindowInsetRight();
            int n8 = ei12.getSystemWindowInsetBottom();
            this.e = ei12 = ei1.b(n3, n4, n7, n8);
        }
        return this.e;
    }

    public f l(int n3, int n4, int n7, int n8) {
        Object object = this.c;
        Object object2 = androidx.core.view.f.h(null, (WindowInsets)object);
        int n10 = Build.VERSION.SDK_INT;
        int n14 = 30;
        object = n10 >= n14 ? new f$d((f)object2) : (n10 >= (n14 = 29) ? new f$c((f)object2) : new f$b((f)object2));
        object2 = androidx.core.view.f.e(this.j(), n3, n4, n7, n8);
        ((f$e)object).g((ei1)object2);
        ei1 ei12 = androidx.core.view.f.e(this.h(), n3, n4, n7, n8);
        ((f$e)object).e(ei12);
        return ((f$e)object).b();
    }

    public boolean n() {
        return this.c.isRound();
    }

    public boolean o(int n3) {
        int n4;
        boolean bl2 = true;
        for (int i3 = 1; i3 <= (n4 = 256); i3 <<= 1) {
            n4 = n3 & i3;
            if (n4 == 0 || (n4 = (int)(this.w(i3) ? 1 : 0)) != 0) continue;
            return false;
        }
        return bl2;
    }

    public void p(ei1[] ei1Array) {
        this.d = ei1Array;
    }

    public void q(f f5) {
        this.f = f5;
    }

    public ei1 t(int n3, boolean n4) {
        int n7 = 1;
        int n8 = 0;
        if (n3 != n7) {
            n7 = 2;
            int n10 = 0;
            ei1 ei12 = null;
            if (n3 != n7) {
                n4 = 8;
                ei1 ei13 = ei1.e;
                if (n3 != n4) {
                    n4 = 16;
                    if (n3 != n4) {
                        n4 = 32;
                        if (n3 != n4) {
                            n4 = 64;
                            if (n3 != n4) {
                                n4 = 128;
                                if (n3 != n4) {
                                    return ei13;
                                }
                                Object object = this.f;
                                object = object != null ? ((f)object).a.e() : this.e();
                                if (object != null) {
                                    int n14;
                                    int n15;
                                    n4 = Build.VERSION.SDK_INT;
                                    n7 = 28;
                                    if (n4 >= n7) {
                                        ei12 = ((or0)object).a;
                                        n10 = or0$a.b((DisplayCutout)ei12);
                                    } else {
                                        n10 = 0;
                                        ei12 = null;
                                    }
                                    if (n4 >= n7) {
                                        DisplayCutout displayCutout = ((or0)object).a;
                                        n15 = or0$a.d(displayCutout);
                                    } else {
                                        n15 = 0;
                                        Object var9_13 = null;
                                    }
                                    if (n4 >= n7) {
                                        DisplayCutout displayCutout = ((or0)object).a;
                                        n14 = or0$a.c(displayCutout);
                                    } else {
                                        n14 = 0;
                                        Object var11_17 = null;
                                    }
                                    if (n4 >= n7) {
                                        object = ((or0)object).a;
                                        n8 = or0$a.a((DisplayCutout)object);
                                    }
                                    return ei1.b(n10, n15, n14, n8);
                                }
                                return ei13;
                            }
                            return this.k();
                        }
                        return this.g();
                    }
                    return this.i();
                }
                Object object = this.d;
                if (object != null) {
                    n4 = 3;
                    ei12 = object[n4];
                }
                if (ei12 != null) {
                    return ei12;
                }
                object = this.j();
                ei1 ei14 = this.u();
                n3 = ((ei1)object).d;
                n10 = ei14.d;
                if (n3 > n10) {
                    return ei1.b(0, 0, 0, n3);
                }
                object = this.g;
                if (object != null && (n3 = (int)(((ei1)object).equals(ei13) ? 1 : 0)) == 0) {
                    object = this.g;
                    n3 = ((ei1)object).d;
                    n4 = ei14.d;
                    if (n3 > n4) {
                        return ei1.b(0, 0, 0, n3);
                    }
                }
                return ei13;
            }
            if (n4 != 0) {
                ei1 ei15 = this.u();
                ei1 ei16 = this.h();
                n7 = ei15.a;
                n10 = ei16.a;
                n7 = Math.max(n7, n10);
                n10 = ei15.c;
                int n16 = ei16.c;
                n10 = Math.max(n10, n16);
                n3 = ei15.d;
                n4 = ei16.d;
                n3 = Math.max(n3, n4);
                return ei1.b(n7, 0, n10, n3);
            }
            ei1 ei17 = this.j();
            Object object = this.f;
            if (object != null) {
                object = ((f)object).a;
                ei12 = ((f$k)object).h();
            }
            n4 = ei17.d;
            if (ei12 != null) {
                n7 = ei12.d;
                n4 = Math.min(n4, n7);
            }
            n7 = ei17.a;
            n3 = ei17.c;
            return ei1.b(n7, 0, n3, n4);
        }
        if (n4 != 0) {
            n3 = this.u().b;
            n4 = this.j().b;
            n3 = Math.max(n3, n4);
            return ei1.b(0, n3, 0, 0);
        }
        n3 = this.j().b;
        return ei1.b(0, n3, 0, 0);
    }

    public boolean w(int n3) {
        int n4;
        ei1 ei12 = null;
        int n7 = 1;
        if (n3 != n7 && n3 != (n4 = 2)) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 8;
                if (n3 != n4 && n3 != (n4 = 128)) {
                    return n7 != 0;
                }
            } else {
                return false;
            }
        }
        ei1 ei13 = this.t(n3, false);
        ei12 = ei1.e;
        return (ei13.equals(ei12) ^ n7) != 0;
    }

    public void y(ei1 ei12) {
        this.g = ei12;
    }
}

