/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.SystemClock
 */
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.ranges.f;

public final class ne0
extends Drawable
implements Drawable.Callback,
Animatable {
    public final WS2 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final ArrayList e;
    public final int f;
    public final int g;
    public long h;
    public int i;
    public int j;
    public Drawable k;
    public final Drawable l;

    /*
     * WARNING - void declaration
     */
    public ne0(Drawable object, Drawable object2, WS2 object3, int n3, boolean bl2, boolean bl3) {
        int n4;
        int n7;
        int n8;
        Integer n10;
        Integer n14;
        void var6_15;
        this.a = object3;
        this.b = n3;
        this.c = bl2;
        this.d = var6_15;
        this.e = object3 = new ArrayList();
        object3 = null;
        if (object != null) {
            int n15 = object.getIntrinsicWidth();
            n14 = n15;
        } else {
            boolean bl4 = false;
            n14 = null;
        }
        if (object2 != null) {
            int n16 = object2.getIntrinsicWidth();
            n10 = n16;
        } else {
            boolean bl5 = false;
            n10 = null;
        }
        this.f = n8 = this.a(n14, n10);
        if (object != null) {
            int n17 = object.getIntrinsicHeight();
            n14 = n17;
        } else {
            boolean bl6 = false;
            n14 = null;
        }
        if (object2 != null) {
            int n18 = object2.getIntrinsicHeight();
            n10 = n18;
        } else {
            boolean bl7 = false;
            n10 = null;
        }
        this.g = n7 = this.a(n14, n10);
        this.i = n4 = 255;
        object = object != null ? object.mutate() : null;
        this.k = object;
        if (object2 != null) {
            object3 = object2.mutate();
        }
        this.l = object3;
        if (n3 > 0) {
            object = this.k;
            if (object != null) {
                object.setCallback((Drawable.Callback)this);
            }
            if (object3 != null) {
                object3.setCallback((Drawable.Callback)this);
            }
            return;
        }
        object2 = "durationMillis must be > 0.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final int a(Integer n3, Integer n4) {
        int n7 = this.d;
        int n8 = -1;
        if (n7 == 0 && (n3 != null && (n7 = n3.intValue()) == n8 || n4 != null && (n7 = n4.intValue()) == n8)) {
            return n8;
        }
        int n10 = n3 != null ? n3 : -1;
        if (n4 != null) {
            n8 = n4;
        }
        return Math.max(n10, n8);
    }

    public final void b() {
        this.j = 2;
        this.k = null;
        ArrayList arrayList = this.e;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Mj mj = (Mj)arrayList.get(i3);
            mj.onAnimationEnd(this);
        }
    }

    public final void c(Drawable drawable2, Rect rect) {
        int n3 = drawable2.getIntrinsicWidth();
        int n4 = drawable2.getIntrinsicHeight();
        if (n3 > 0 && n4 > 0) {
            int n7 = rect.width();
            int n8 = rect.height();
            WS2 wS2 = this.a;
            double d2 = cj0_0.a(n3, n4, n7, n8, wS2);
            double d5 = n7;
            double d7 = (double)n3 * d2;
            d5 -= d7;
            d7 = 2;
            n3 = ok1_1.a(d5 / d7);
            double d9 = n8;
            d5 = n4;
            n4 = ok1_1.a((d9 - (d2 *= d5)) / d7);
            n7 = rect.left + n3;
            n8 = rect.top + n4;
            int n10 = rect.right - n3;
            int n14 = rect.bottom - n4;
            drawable2.setBounds(n7, n8, n10, n14);
            return;
        }
        drawable2.setBounds(rect);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable2;
        double d2;
        int n3 = this.j;
        if (n3 == 0) {
            Drawable drawable3 = this.k;
            if (drawable3 != null) {
                int n4 = this.i;
                drawable3.setAlpha(n4);
                n4 = canvas.save();
                try {
                    drawable3.draw(canvas);
                }
                finally {
                    canvas.restoreToCount(n4);
                }
            }
            return;
        }
        int n7 = 2;
        Drawable drawable4 = this.l;
        if (n3 == n7) {
            if (drawable4 != null) {
                n3 = this.i;
                drawable4.setAlpha(n3);
                n3 = canvas.save();
                try {
                    drawable4.draw(canvas);
                }
                finally {
                    canvas.restoreToCount(n3);
                }
            }
            return;
        }
        long l2 = SystemClock.uptimeMillis();
        long l3 = this.h;
        double d5 = l2 -= l3;
        double d7 = this.b;
        d5 /= d7;
        double d9 = 0.0;
        double d12 = 1.0;
        d7 = kotlin.ranges.f.e(d5, d9, d12);
        int n8 = this.i;
        double d13 = n8;
        int n10 = (int)(d7 *= d13);
        int n14 = this.c;
        if (n14 != 0) {
            n8 -= n10;
        }
        if ((n14 = (d2 = d5 - (d13 = 1.0)) == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1)) >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            Object var3_5 = null;
        }
        if (n3 == 0 && (drawable2 = this.k) != null) {
            drawable2.setAlpha(n8);
            n14 = canvas.save();
            try {
                drawable2.draw(canvas);
            }
            finally {
                canvas.restoreToCount(n14);
            }
        }
        if (drawable4 != null) {
            drawable4.setAlpha(n10);
            n7 = canvas.save();
            try {
                drawable4.draw(canvas);
            }
            finally {
                canvas.restoreToCount(n7);
            }
        }
        if (n3 != 0) {
            this.b();
        } else {
            this.invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.i;
    }

    public final ColorFilter getColorFilter() {
        int n3 = this.j;
        ColorFilter colorFilter = null;
        if (n3 != 0) {
            ColorFilter colorFilter2;
            int n4 = 1;
            Drawable drawable2 = this.l;
            if (n3 != n4) {
                n4 = 2;
                if (n3 == n4 && drawable2 != null) {
                    colorFilter = drawable2.getColorFilter();
                }
            } else if (drawable2 != null && (colorFilter2 = drawable2.getColorFilter()) != null) {
                colorFilter = colorFilter2;
            } else {
                colorFilter2 = this.k;
                if (colorFilter2 != null) {
                    colorFilter = colorFilter2.getColorFilter();
                }
            }
        } else {
            Drawable drawable3 = this.k;
            if (drawable3 != null) {
                colorFilter = drawable3.getColorFilter();
            }
        }
        return colorFilter;
    }

    public final int getIntrinsicHeight() {
        return this.g;
    }

    public final int getIntrinsicWidth() {
        return this.f;
    }

    public final int getOpacity() {
        Drawable drawable2 = this.k;
        int n3 = this.j;
        int n4 = -2;
        if (n3 == 0) {
            if (drawable2 != null) {
                n4 = drawable2.getOpacity();
            }
            return n4;
        }
        int n7 = 2;
        Drawable drawable3 = this.l;
        if (n3 == n7) {
            if (drawable3 != null) {
                n4 = drawable3.getOpacity();
            }
            return n4;
        }
        if (drawable2 != null && drawable3 != null) {
            int n8 = drawable2.getOpacity();
            n3 = drawable3.getOpacity();
            n4 = Drawable.resolveOpacity((int)n8, (int)n3);
        } else if (drawable2 != null) {
            n4 = drawable2.getOpacity();
        } else if (drawable3 != null) {
            n4 = drawable3.getOpacity();
        }
        return n4;
    }

    public final void invalidateDrawable(Drawable drawable2) {
        this.invalidateSelf();
    }

    public final boolean isRunning() {
        int n3 = this.j;
        int n4 = 1;
        if (n3 != n4) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            this.c(drawable2, rect);
        }
        if ((drawable2 = this.l) != null) {
            this.c(drawable2, rect);
        }
    }

    public final boolean onLevelChange(int n3) {
        boolean bl2;
        Drawable drawable2 = this.k;
        boolean bl3 = false;
        if (drawable2 != null) {
            bl2 = drawable2.setLevel(n3);
        } else {
            bl2 = false;
            drawable2 = null;
        }
        Drawable drawable3 = this.l;
        n3 = drawable3 != null ? (int)(drawable3.setLevel(n3) ? 1 : 0) : 0;
        if (bl2 || n3 != 0) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean onStateChange(int[] nArray) {
        boolean bl2;
        boolean bl3;
        Drawable drawable2 = this.k;
        boolean bl4 = false;
        if (drawable2 != null) {
            bl3 = drawable2.setState(nArray);
        } else {
            bl3 = false;
            drawable2 = null;
        }
        Drawable drawable3 = this.l;
        if (drawable3 != null) {
            bl2 = drawable3.setState(nArray);
        } else {
            bl2 = false;
            nArray = null;
        }
        if (bl3 || bl2) {
            bl4 = true;
        }
        return bl4;
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        this.scheduleSelf(runnable2, l2);
    }

    public final void setAlpha(int n3) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = 256)) {
            this.i = n3;
            return;
        }
        String string2 = hj0_0.a(n3, "Invalid alpha: ");
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        if ((drawable2 = this.l) != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int n3) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTint(n3);
        }
        if ((drawable2 = this.l) != null) {
            drawable2.setTint(n3);
        }
    }

    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            me0.a(drawable2, blendMode);
        }
        if ((drawable2 = this.l) != null) {
            me0.a(drawable2, blendMode);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
        if ((drawable2 = this.l) != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
        if ((drawable2 = this.l) != null) {
            drawable2.setTintMode(mode);
        }
    }

    public final void start() {
        long l2;
        int n3;
        Object object = this.k;
        int n4 = object instanceof Animatable;
        int n7 = 0;
        Drawable drawable2 = null;
        if (n4 != 0) {
            object = (Animatable)object;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object.start();
        }
        if ((n4 = (object = this.l) instanceof Animatable) != 0) {
            drawable2 = object;
            drawable2 = (Animatable)object;
        }
        if (drawable2 != null) {
            drawable2.start();
        }
        if ((n3 = this.j) != 0) {
            return;
        }
        this.j = n3 = 1;
        this.h = l2 = SystemClock.uptimeMillis();
        object = this.e;
        n4 = ((ArrayList)object).size();
        drawable2 = null;
        for (n7 = 0; n7 < n4; ++n7) {
            Mj mj = (Mj)((ArrayList)object).get(n7);
            mj.onAnimationStart(this);
        }
        this.invalidateSelf();
    }

    public final void stop() {
        int n3;
        Drawable drawable2 = this.k;
        int n4 = drawable2 instanceof Animatable;
        Drawable drawable3 = null;
        if (n4 != 0) {
            drawable2 = (Animatable)drawable2;
        } else {
            n3 = 0;
            drawable2 = null;
        }
        if (drawable2 != null) {
            drawable2.stop();
        }
        if ((n4 = (drawable2 = this.l) instanceof Animatable) != 0) {
            drawable3 = drawable2;
            drawable3 = (Animatable)drawable2;
        }
        if (drawable3 != null) {
            drawable3.stop();
        }
        if ((n3 = this.j) != (n4 = 2)) {
            this.b();
        }
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

