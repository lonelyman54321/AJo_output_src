/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import java.util.WeakHashMap;

public final class Qm {
    public final View a;
    public final qn b;
    public int c = -1;
    public Rn3 d;
    public Rn3 e;
    public Rn3 f;

    public Qm(View object) {
        this.a = object;
        object = qn.a();
        this.b = object;
    }

    public final void a() {
        Object object = this.a;
        Drawable drawable2 = object.getBackground();
        if (drawable2 != null) {
            Rn3 rn3;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 21;
            if (n3 > n4 ? (rn3 = this.d) != null : n3 == n4) {
                rn3 = this.f;
                if (rn3 == null) {
                    this.f = rn3 = new Object();
                }
                rn3 = this.f;
                n4 = 0;
                rn3.a = null;
                rn3.d = false;
                rn3.b = null;
                rn3.c = false;
                WeakHashMap weakHashMap = ViewCompat.a;
                weakHashMap = ViewCompat$c.c(object);
                boolean bl2 = true;
                if (weakHashMap != null) {
                    rn3.d = bl2;
                    rn3.a = weakHashMap;
                }
                if ((weakHashMap = ViewCompat$c.d(object)) != null) {
                    rn3.c = bl2;
                    rn3.b = weakHashMap;
                }
                if ((n4 = (int)(rn3.d ? 1 : 0)) != 0 || (n4 = (int)(rn3.c ? 1 : 0)) != 0) {
                    object = object.getDrawableState();
                    qn.e(drawable2, rn3, (int[])object);
                    return;
                }
            }
            if ((rn3 = this.e) != null) {
                object = object.getDrawableState();
                qn.e(drawable2, rn3, (int[])object);
            } else {
                rn3 = this.d;
                if (rn3 != null) {
                    object = object.getDrawableState();
                    qn.e(drawable2, rn3, (int[])object);
                }
            }
        }
    }

    public final ColorStateList b() {
        Rn3 rn3 = this.e;
        rn3 = rn3 != null ? rn3.a : null;
        return rn3;
    }

    public final PorterDuff.Mode c() {
        Rn3 rn3 = this.e;
        rn3 = rn3 != null ? rn3.b : null;
        return rn3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(AttributeSet object, int n3) {
        Throwable throwable2;
        Object object2;
        block14: {
            int n4;
            boolean bl2;
            Object object3;
            View view;
            block13: {
                int n7;
                view = this.a;
                object2 = view.getContext();
                object3 = R$styleable.ViewBackgroundHelper;
                bl2 = false;
                object2 = Tn3.f((Context)object2, object, object3, n3, 0);
                object3 = ((Tn3)object2).b;
                View view2 = this.a;
                Context context = view2.getContext();
                Object object4 = R$styleable.ViewBackgroundHelper;
                TypedArray typedArray = ((Tn3)object2).b;
                ViewCompat.r(view2, context, (int[])object4, object, typedArray, n3, 0);
                try {
                    n4 = R$styleable.ViewBackgroundHelper_android_background;
                    n4 = object3.hasValue(n4) ? 1 : 0;
                    n3 = -1;
                    if (n4 == 0) break block13;
                    n4 = R$styleable.ViewBackgroundHelper_android_background;
                    this.c = n4 = object3.getResourceId(n4, n3);
                    object = this.b;
                    view2 = view.getContext();
                    n7 = this.c;
                    synchronized (object) {
                    }
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                {
                    object4 = object.a;
                    view2 = ((OK2)object4).i(n7, (Context)view2);
                    {
                        // MONITOREXIT @DISABLED, blocks:[2, 5] lbl28 : MonitorExitStatement: MONITOREXIT : var1_1 /* !! */ 
                        if (view2 == null) break block13;
                        this.g((ColorStateList)view2);
                    }
                }
            }
            n4 = R$styleable.ViewBackgroundHelper_backgroundTint;
            if ((n4 = (int)(object3.hasValue(n4) ? 1 : 0)) != 0) {
                n4 = R$styleable.ViewBackgroundHelper_backgroundTint;
                object = ((Tn3)object2).a(n4);
                ViewCompat.u(view, (ColorStateList)object);
            }
            n4 = R$styleable.ViewBackgroundHelper_backgroundTintMode;
            if ((n4 = (int)(object3.hasValue(n4) ? 1 : 0)) != 0) {
                n4 = R$styleable.ViewBackgroundHelper_backgroundTintMode;
                n4 = object3.getInt(n4, n3);
                n3 = 0;
                Object object5 = null;
                object = uu0_0.c(n4, null);
                n3 = Build.VERSION.SDK_INT;
                ViewCompat$c.l(view, (PorterDuff.Mode)object);
                n4 = 21;
                if (n3 == n4) {
                    object = view.getBackground();
                    object5 = ViewCompat$c.c(view);
                    if (object5 != null || (object5 = ViewCompat$c.d(view)) != null) {
                        bl2 = true;
                    }
                    if (object != null && bl2) {
                        n3 = object.isStateful() ? 1 : 0;
                        if (n3 != 0) {
                            object5 = view.getDrawableState();
                            object.setState((int[])object5);
                        }
                        view.setBackground((Drawable)object);
                    }
                }
            }
            ((Tn3)object2).g();
            return;
        }
        ((Tn3)object2).g();
        throw throwable2;
    }

    public final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(int n3) {
        ColorStateList colorStateList;
        this.c = n3;
        qn qn3 = this.b;
        if (qn3 != null) {
            Context context = this.a.getContext();
            synchronized (qn3) {
                OK2 oK2 = qn3.a;
                colorStateList = oK2.i(n3, context);
            }
        } else {
            n3 = 0;
            colorStateList = null;
        }
        this.g(colorStateList);
        this.a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            boolean bl2;
            Rn3 rn3 = this.d;
            if (rn3 == null) {
                this.d = rn3 = new Object();
            }
            rn3 = this.d;
            rn3.a = colorStateList;
            rn3.d = bl2 = true;
        } else {
            boolean bl3 = false;
            colorStateList = null;
            this.d = null;
        }
        this.a();
    }

    public final void h(ColorStateList colorStateList) {
        Rn3 rn3 = this.e;
        if (rn3 == null) {
            this.e = rn3 = new Object();
        }
        rn3 = this.e;
        rn3.a = colorStateList;
        rn3.d = true;
        this.a();
    }

    public final void i(PorterDuff.Mode mode) {
        Rn3 rn3 = this.e;
        if (rn3 == null) {
            this.e = rn3 = new Object();
        }
        rn3 = this.e;
        rn3.b = mode;
        rn3.c = true;
        this.a();
    }
}

