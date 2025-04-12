/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 */
package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.b$a;

public abstract class DrawableContainerCompat$b
extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public final DrawableContainerCompat a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public DrawableContainerCompat$b(DrawableContainerCompat$b sparseArray, DrawableContainerCompat drawableArray, Resources drawable2) {
        int n3;
        Drawable drawable3;
        int n4 = 0;
        this.i = false;
        this.l = false;
        int n7 = 1;
        this.w = n7;
        this.y = 0;
        this.z = 0;
        this.a = drawableArray;
        int n8 = 0;
        drawableArray = null;
        if (drawable2 != null) {
            drawable3 = drawable2;
        } else if (sparseArray != null) {
            drawable3 = sparseArray.b;
        } else {
            n3 = 0;
            drawable3 = null;
        }
        this.b = drawable3;
        if (sparseArray != null) {
            n3 = sparseArray.c;
        } else {
            n3 = 0;
            drawable3 = null;
        }
        if (drawable2 != null) {
            drawable2 = drawable2.getDisplayMetrics();
            n3 = drawable2.densityDpi;
        }
        if (n3 == 0) {
            n3 = 160;
        }
        this.c = n3;
        if (sparseArray != null) {
            int n10;
            this.d = n10 = sparseArray.d;
            this.e = n10 = sparseArray.e;
            this.u = n7;
            this.v = n7;
            n10 = (int)(sparseArray.i ? 1 : 0);
            this.i = n10;
            n10 = (int)(sparseArray.l ? 1 : 0);
            this.l = n10;
            n10 = (int)(sparseArray.w ? 1 : 0);
            this.w = n10;
            this.x = n10 = sparseArray.x;
            this.y = n10 = sparseArray.y;
            this.z = n10 = sparseArray.z;
            n10 = (int)(sparseArray.A ? 1 : 0);
            this.A = n10;
            drawable2 = sparseArray.B;
            this.B = drawable2;
            n10 = (int)(sparseArray.C ? 1 : 0);
            this.C = n10;
            drawable2 = sparseArray.D;
            this.D = drawable2;
            drawable2 = sparseArray.E;
            this.E = drawable2;
            n10 = (int)(sparseArray.F ? 1 : 0);
            this.F = n10;
            n10 = (int)(sparseArray.G ? 1 : 0);
            this.G = n10;
            n10 = sparseArray.c;
            if (n10 == n3) {
                n10 = (int)(sparseArray.j ? 1 : 0);
                if (n10 != 0) {
                    drawable2 = sparseArray.k;
                    if (drawable2 != null) {
                        drawable2 = sparseArray.k;
                        super((Rect)drawable2);
                    }
                    this.k = drawableArray;
                    this.j = n7;
                }
                if ((n8 = sparseArray.m) != 0) {
                    this.n = n8 = sparseArray.n;
                    this.o = n8 = sparseArray.o;
                    this.p = n8 = sparseArray.p;
                    this.q = n8 = sparseArray.q;
                    this.m = n7;
                }
            }
            if ((n8 = sparseArray.r) != 0) {
                this.s = n8 = sparseArray.s;
                this.r = n7;
            }
            if ((n8 = (int)(sparseArray.t ? 1 : 0)) != 0) {
                this.t = n7;
            }
            drawableArray = sparseArray.g;
            drawable2 = new Drawable[drawableArray.length];
            this.g = drawable2;
            this.h = n10 = sparseArray.h;
            sparseArray = sparseArray.f;
            if (sparseArray != null) {
                this.f = sparseArray = sparseArray.clone();
            } else {
                n10 = this.h;
                this.f = sparseArray = new SparseArray(n10);
            }
            int n14 = this.h;
            while (n4 < n14) {
                drawable2 = drawableArray[n4];
                if (drawable2 != null) {
                    if ((drawable2 = drawable2.getConstantState()) != null) {
                        drawable3 = this.f;
                        drawable3.put(n4, (Object)drawable2);
                    } else {
                        drawable2 = this.g;
                        drawable2[n4] = drawable3 = drawableArray[n4];
                    }
                }
                n4 += n7;
            }
        } else {
            int n15 = 10;
            sparseArray = new Drawable[n15];
            this.g = sparseArray;
            this.h = 0;
        }
    }

    public final int a(Drawable drawable2) {
        int n3;
        int n4;
        Object object;
        int n7 = this.h;
        Object object2 = this.g;
        int n8 = ((Drawable[])object2).length;
        if (n7 >= n8) {
            n8 = n7 + 10;
            object = this;
            object = (b$a)this;
            Object object3 = new Drawable[n8];
            Drawable[] drawableArray = object.g;
            if (drawableArray != null) {
                System.arraycopy(drawableArray, 0, object3, 0, n7);
            }
            object.g = object3;
            object2 = new int[n8][];
            object3 = ((b$a)((Object)object)).H;
            System.arraycopy(object3, 0, object2, 0, n7);
            ((b$a)((Object)object)).H = (int[][])object2;
        }
        drawable2.mutate();
        n8 = 1;
        drawable2.setVisible(false, n8 != 0);
        object = this.a;
        drawable2.setCallback((Drawable.Callback)object);
        this.g[n7] = drawable2;
        this.h = n4 = this.h + n8;
        n8 = this.e;
        this.e = n3 = drawable2.getChangingConfigurations() | n8;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return n7;
    }

    public final void b() {
        int n3;
        this.m = true;
        this.c();
        int n4 = this.h;
        Drawable[] drawableArray = this.g;
        this.o = n3 = -1;
        this.n = n3;
        this.q = 0;
        this.p = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            int n7;
            int n8;
            Drawable drawable2 = drawableArray[n3];
            int n10 = drawable2.getIntrinsicWidth();
            if (n10 > (n8 = this.n)) {
                this.n = n10;
            }
            if ((n10 = drawable2.getIntrinsicHeight()) > (n8 = this.o)) {
                this.o = n10;
            }
            if ((n10 = drawable2.getMinimumWidth()) > (n8 = this.p)) {
                this.p = n10;
            }
            if ((n7 = drawable2.getMinimumHeight()) <= (n10 = this.q)) continue;
            this.q = n7;
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int n3 = sparseArray.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                SparseArray sparseArray2 = this.f;
                int n4 = sparseArray2.keyAt(i3);
                Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(i3);
                Drawable[] drawableArray = this.g;
                Object object = this.b;
                constantState = constantState.newDrawable(object);
                int n7 = Build.VERSION.SDK_INT;
                int n8 = 23;
                if (n7 >= n8) {
                    n7 = this.x;
                    ut0_0.c((Drawable)constantState, n7);
                }
                constantState = constantState.mutate();
                object = this.a;
                constantState.setCallback((Drawable.Callback)object);
                drawableArray[n4] = constantState;
            }
            n3 = 0;
            sparseArray = null;
            this.f = null;
        }
    }

    public final boolean canApplyTheme() {
        int n3 = this.h;
        Drawable[] drawableArray = this.g;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Drawable drawable2 = drawableArray[i3];
            boolean bl3 = true;
            if (!(drawable2 != null ? (bl2 = drawable2.canApplyTheme()) : (drawable2 = (Drawable.ConstantState)this.f.get(i3)) != null && (bl2 = drawable2.canApplyTheme()))) continue;
            return bl3;
        }
        return false;
    }

    public final Drawable d(int n3) {
        int n4;
        Drawable drawable2 = this.g[n3];
        if (drawable2 != null) {
            return drawable2;
        }
        drawable2 = this.f;
        if (drawable2 != null && (n4 = drawable2.indexOfKey(n3)) >= 0) {
            Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(n4);
            Drawable[] drawableArray = this.b;
            constantState = constantState.newDrawable((Resources)drawableArray);
            int n7 = Build.VERSION.SDK_INT;
            int n8 = 23;
            if (n7 >= n8) {
                n7 = this.x;
                ut0_0.c((Drawable)constantState, n7);
            }
            constantState = constantState.mutate();
            drawableArray = this.a;
            constantState.setCallback((Drawable.Callback)drawableArray);
            drawableArray = this.g;
            drawableArray[n3] = constantState;
            this.f.removeAt(n4);
            SparseArray sparseArray = this.f;
            n3 = sparseArray.size();
            if (n3 == 0) {
                this.f = null;
            }
            return constantState;
        }
        return null;
    }

    public abstract void e();

    public final int getChangingConfigurations() {
        int n3 = this.d;
        int n4 = this.e;
        return n3 | n4;
    }
}

