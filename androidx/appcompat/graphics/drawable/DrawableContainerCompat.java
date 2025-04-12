/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 */
package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$1;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$a;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$b;
import androidx.appcompat.graphics.drawable.b;

public class DrawableContainerCompat
extends Drawable
implements Drawable.Callback {
    public static final /* synthetic */ int m;
    public DrawableContainerCompat$b a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public int e = 255;
    public boolean f;
    public int g = -1;
    public boolean h;
    public Runnable i;
    public long j;
    public long k;
    public DrawableContainerCompat$a l;

    public final void a(boolean bl2) {
        int n3;
        block8: {
            int n4;
            block6: {
                long l2;
                block5: {
                    long l3;
                    Object object;
                    long l4;
                    long l7;
                    block7: {
                        block4: {
                            Drawable drawable2;
                            block2: {
                                block1: {
                                    long l8;
                                    block3: {
                                        this.f = n3 = 1;
                                        l7 = SystemClock.uptimeMillis();
                                        drawable2 = this.c;
                                        l4 = 255L;
                                        l2 = 0L;
                                        if (drawable2 == null) break block1;
                                        l8 = this.j;
                                        long l12 = l8 - l2;
                                        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                        if (object2 == false) break block2;
                                        object2 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                                        if (object2 > 0) break block3;
                                        int n7 = this.e;
                                        drawable2.setAlpha(n7);
                                        this.j = l2;
                                        break block2;
                                    }
                                    l8 = (l8 - l7) * l4;
                                    int n8 = (int)l8;
                                    object = this.a;
                                    int n10 = object.y;
                                    n8 /= n10;
                                    n10 = 255 - n8;
                                    n8 = this.e;
                                    n10 = n10 * n8 / 255;
                                    drawable2.setAlpha(n10);
                                    n4 = 1;
                                    break block4;
                                }
                                this.j = l2;
                            }
                            n4 = 0;
                            drawable2 = null;
                        }
                        object = this.d;
                        if (object == null) break block5;
                        l3 = this.k;
                        long l14 = l3 - l2;
                        Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object3 == false) break block6;
                        object3 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
                        if (object3 > 0) break block7;
                        object.setVisible(false, false);
                        n3 = 0;
                        this.d = null;
                        this.k = l2;
                        break block6;
                    }
                    l3 = (l3 - l7) * l4;
                    n4 = (int)l3;
                    DrawableContainerCompat$b drawableContainerCompat$b = this.a;
                    int n14 = drawableContainerCompat$b.z;
                    n4 /= n14;
                    n14 = this.e;
                    n4 = n4 * n14 / 255;
                    object.setAlpha(n4);
                    break block8;
                }
                this.k = l2;
            }
            n3 = n4;
        }
        if (bl2 && n3 != 0) {
            Runnable runnable2 = this.i;
            long l15 = 16;
            this.scheduleSelf(runnable2, l7 += l15);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        if (theme != null) {
            drawableContainerCompat$b.c();
            int n3 = drawableContainerCompat$b.h;
            Drawable[] drawableArray = drawableContainerCompat$b.g;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4;
                Drawable drawable2 = drawableArray[i3];
                if (drawable2 == null || (n4 = drawable2.canApplyTheme()) == 0) continue;
                drawable2 = drawableArray[i3];
                drawable2.applyTheme(theme);
                n4 = drawableContainerCompat$b.e;
                Drawable drawable3 = drawableArray[i3];
                int n7 = drawable3.getChangingConfigurations();
                drawableContainerCompat$b.e = n4 |= n7;
            }
            if ((theme = theme.getResources()) != null) {
                drawableContainerCompat$b.b = theme;
                theme = theme.getDisplayMetrics();
                int n8 = theme.densityDpi;
                if (n8 == 0) {
                    n8 = 160;
                }
                n3 = drawableContainerCompat$b.c;
                drawableContainerCompat$b.c = n8;
                if (n3 != n8) {
                    drawableContainerCompat$b.m = false;
                    drawableContainerCompat$b.j = false;
                }
            }
        } else {
            ((Object)((Object)drawableContainerCompat$b)).getClass();
        }
    }

    public DrawableContainerCompat$b b() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Drawable drawable2) {
        Throwable throwable2;
        block10: {
            int n3;
            Object object;
            block9: {
                DrawableContainerCompat$a drawableContainerCompat$a = this.l;
                if (drawableContainerCompat$a == null) {
                    this.l = drawableContainerCompat$a = new Object();
                }
                drawableContainerCompat$a = this.l;
                drawableContainerCompat$a.a = object = drawable2.getCallback();
                drawable2.setCallback((Drawable.Callback)drawableContainerCompat$a);
                drawableContainerCompat$a = null;
                try {
                    object = this.a;
                    n3 = object.y;
                    if (n3 > 0 || (n3 = (int)(this.f ? 1 : 0)) == 0) break block9;
                    n3 = this.e;
                    drawable2.setAlpha(n3);
                }
                catch (Throwable throwable2) {
                    break block10;
                }
            }
            object = this.a;
            int n4 = object.C;
            if (n4 != 0) {
                object = object.B;
                drawable2.setColorFilter((ColorFilter)object);
            } else {
                n4 = object.F;
                if (n4 != 0) {
                    object = object.D;
                    drawable2.setTintList((ColorStateList)object);
                }
                object = this.a;
                n4 = object.G;
                if (n4 != 0) {
                    object = object.E;
                    drawable2.setTintMode((PorterDuff.Mode)object);
                }
            }
            n3 = (int)(this.isVisible() ? 1 : 0);
            n4 = 1;
            drawable2.setVisible(n3 != 0, n4 != 0);
            object = this.a;
            n3 = object.w;
            drawable2.setDither(n3 != 0);
            object = this.getState();
            drawable2.setState((int[])object);
            n3 = this.getLevel();
            drawable2.setLevel(n3);
            object = this.getBounds();
            drawable2.setBounds((Rect)object);
            n3 = Build.VERSION.SDK_INT;
            n4 = 23;
            if (n3 >= n4) {
                n3 = ut0_0.b(this);
                ut0_0.c(drawable2, n3);
            }
            object = this.a;
            n3 = (int)(object.A ? 1 : 0);
            drawable2.setAutoMirrored(n3 != 0);
            object = this.b;
            if (object != null) {
                n4 = object.left;
                int n7 = object.top;
                int n8 = object.right;
                n3 = object.bottom;
                drawable2.setHotspotBounds(n4, n7, n8, n3);
            }
            object = this.l;
            Drawable.Callback callback2 = object.a;
            object.a = null;
            drawable2.setCallback(callback2);
            return;
        }
        DrawableContainerCompat$a drawableContainerCompat$a = this.l;
        Drawable.Callback callback3 = drawableContainerCompat$a.a;
        drawableContainerCompat$a.a = null;
        drawable2.setCallback(callback3);
        throw throwable2;
    }

    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean d(int var1_1) {
        var2_2 = this.g;
        var3_3 = 0;
        var4_4 = null;
        if (var1_1 == var2_2) {
            return false;
        }
        var5_5 = SystemClock.uptimeMillis();
        var7_6 /* !! */  = this.a;
        var2_2 = var7_6 /* !! */ .z;
        var8_7 = 0L;
        if (var2_2 > 0) {
            var7_6 /* !! */  = this.d;
            if (var7_6 /* !! */  != null) {
                var7_6 /* !! */ .setVisible(false, false);
            }
            if ((var7_6 /* !! */  = this.c) != null) {
                this.d = var7_6 /* !! */ ;
                var7_6 /* !! */  = this.a;
                var2_2 = var7_6 /* !! */ .z;
                this.k = var10_8 = (long)var2_2 + var5_5;
            } else {
                this.d = null;
                this.k = var8_7;
            }
        } else {
            var7_6 /* !! */  = this.c;
            if (var7_6 /* !! */  != null) {
                var7_6 /* !! */ .setVisible(false, false);
            }
        }
        if (var1_1 < 0) ** GOTO lbl-1000
        var7_6 /* !! */  = this.a;
        var3_3 = var7_6 /* !! */ .h;
        if (var1_1 < var3_3) {
            var7_6 /* !! */  = var7_6 /* !! */ .d(var1_1);
            this.c = var7_6 /* !! */ ;
            this.g = var1_1;
            if (var7_6 /* !! */  != null) {
                var12_9 = this.a;
                var1_1 = var12_9.y;
                if (var1_1 > 0) {
                    var13_10 = var1_1;
                    this.j = var5_5 += var13_10;
                }
                this.c((Drawable)var7_6 /* !! */ );
            }
        } else lbl-1000:
        // 2 sources

        {
            this.c = null;
            this.g = var1_1 = -1;
        }
        var10_8 = this.j;
        var1_1 = 1;
        var15_11 /* !! */  = (long)(var10_8 == var8_7 ? 0 : (var10_8 < var8_7 ? -1 : 1));
        if (var15_11 /* !! */  != false || (var15_11 /* !! */  = (cfr_temp_0 = (var10_8 = this.k) - var8_7) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
            var7_6 /* !! */  = this.i;
            if (var7_6 /* !! */  == null) {
                var4_4 = this;
                var4_4 = (b)this;
                var7_6 /* !! */  = new DrawableContainerCompat$1((b)var4_4);
                this.i = var7_6 /* !! */ ;
            } else {
                this.unscheduleSelf((Runnable)var7_6 /* !! */ );
            }
            this.a((boolean)var1_1);
        }
        this.invalidateSelf();
        return (boolean)var1_1;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((drawable2 = this.d) != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(DrawableContainerCompat$b drawableContainerCompat$b) {
        throw null;
    }

    public final int getAlpha() {
        return this.e;
    }

    public final int getChangingConfigurations() {
        int n3 = super.getChangingConfigurations();
        int n4 = this.a.getChangingConfigurations();
        return n3 | n4;
    }

    public final Drawable.ConstantState getConstantState() {
        boolean bl2;
        int n3;
        DrawableContainerCompat$b drawableContainerCompat$b;
        block4: {
            drawableContainerCompat$b = this.a;
            n3 = drawableContainerCompat$b.u;
            if (n3 != 0) {
                bl2 = drawableContainerCompat$b.v;
            } else {
                drawableContainerCompat$b.c();
                drawableContainerCompat$b.u = n3 = 1;
                int n4 = drawableContainerCompat$b.h;
                Drawable[] drawableArray = drawableContainerCompat$b.g;
                for (int i3 = 0; i3 < n4; ++i3) {
                    Drawable.ConstantState constantState = drawableArray[i3].getConstantState();
                    if (constantState != null) continue;
                    drawableContainerCompat$b.v = false;
                    bl2 = false;
                    drawableContainerCompat$b = null;
                    break block4;
                }
                drawableContainerCompat$b.v = n3;
                bl2 = true;
            }
        }
        if (bl2) {
            drawableContainerCompat$b = this.a;
            drawableContainerCompat$b.d = n3 = this.getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    public final Drawable getCurrent() {
        return this.c;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl2 = drawableContainerCompat$b.l;
        if (bl2) {
            bl2 = drawableContainerCompat$b.m;
            if (!bl2) {
                drawableContainerCompat$b.b();
            }
            return drawableContainerCompat$b.o;
        }
        drawableContainerCompat$b = this.c;
        int n3 = drawableContainerCompat$b != null ? drawableContainerCompat$b.getIntrinsicHeight() : -1;
        return n3;
    }

    public final int getIntrinsicWidth() {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl2 = drawableContainerCompat$b.l;
        if (bl2) {
            bl2 = drawableContainerCompat$b.m;
            if (!bl2) {
                drawableContainerCompat$b.b();
            }
            return drawableContainerCompat$b.n;
        }
        drawableContainerCompat$b = this.c;
        int n3 = drawableContainerCompat$b != null ? drawableContainerCompat$b.getIntrinsicWidth() : -1;
        return n3;
    }

    public final int getMinimumHeight() {
        int n3;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl2 = drawableContainerCompat$b.l;
        if (bl2) {
            bl2 = drawableContainerCompat$b.m;
            if (!bl2) {
                drawableContainerCompat$b.b();
            }
            return drawableContainerCompat$b.q;
        }
        drawableContainerCompat$b = this.c;
        if (drawableContainerCompat$b != null) {
            n3 = drawableContainerCompat$b.getMinimumHeight();
        } else {
            n3 = 0;
            drawableContainerCompat$b = null;
        }
        return n3;
    }

    public final int getMinimumWidth() {
        int n3;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl2 = drawableContainerCompat$b.l;
        if (bl2) {
            bl2 = drawableContainerCompat$b.m;
            if (!bl2) {
                drawableContainerCompat$b.b();
            }
            return drawableContainerCompat$b.p;
        }
        drawableContainerCompat$b = this.c;
        if (drawableContainerCompat$b != null) {
            n3 = drawableContainerCompat$b.getMinimumWidth();
        } else {
            n3 = 0;
            drawableContainerCompat$b = null;
        }
        return n3;
    }

    public final int getOpacity() {
        int n3;
        Object object = this.c;
        int n4 = -2;
        if (object != null && (n3 = object.isVisible()) != 0) {
            object = this.a;
            int n7 = ((DrawableContainerCompat$b)((Object)object)).r;
            if (n7 != 0) {
                n4 = n3 = ((DrawableContainerCompat$b)((Object)object)).s;
            } else {
                ((DrawableContainerCompat$b)((Object)object)).c();
                n7 = ((DrawableContainerCompat$b)((Object)object)).h;
                Drawable[] drawableArray = ((DrawableContainerCompat$b)((Object)object)).g;
                if (n7 > 0) {
                    Drawable drawable2 = drawableArray[0];
                    n4 = drawable2.getOpacity();
                }
                boolean bl2 = true;
                for (int i3 = 1; i3 < n7; ++i3) {
                    Drawable drawable3 = drawableArray[i3];
                    int n8 = drawable3.getOpacity();
                    n4 = Drawable.resolveOpacity((int)n4, (int)n8);
                }
                ((DrawableContainerCompat$b)((Object)object)).s = n4;
                ((DrawableContainerCompat$b)((Object)object)).r = bl2;
            }
        }
        return n4;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        int n3;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        int n4 = drawableContainerCompat$b.i;
        boolean bl2 = false;
        int n7 = 1;
        Rect rect2 = null;
        if (n4 == 0) {
            int n8;
            Rect rect3 = drawableContainerCompat$b.k;
            if (rect3 == null && (n8 = drawableContainerCompat$b.j) == 0) {
                drawableContainerCompat$b.c();
                rect3 = new Rect();
                n8 = drawableContainerCompat$b.h;
                Drawable[] drawableArray = drawableContainerCompat$b.g;
                for (int i3 = 0; i3 < n8; ++i3) {
                    int n10;
                    Drawable drawable2 = drawableArray[i3];
                    int n14 = drawable2.getPadding(rect3);
                    if (n14 == 0) continue;
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if ((n14 = rect3.left) > (n10 = rect2.left)) {
                        rect2.left = n14;
                    }
                    if ((n14 = rect3.top) > (n10 = rect2.top)) {
                        rect2.top = n14;
                    }
                    if ((n14 = rect3.right) > (n10 = rect2.right)) {
                        rect2.right = n14;
                    }
                    if ((n14 = rect3.bottom) <= (n10 = rect2.bottom)) continue;
                    rect2.bottom = n14;
                }
                drawableContainerCompat$b.j = n7;
                drawableContainerCompat$b.k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            n3 = rect2.left;
            n4 = rect2.top;
            n3 |= n4;
            n4 = rect2.bottom;
            n3 |= n4;
            n4 = rect2.right;
            if ((n3 |= n4) != 0) {
                bl2 = true;
            }
        } else {
            drawableContainerCompat$b = this.c;
            bl2 = drawableContainerCompat$b != null ? drawableContainerCompat$b.getPadding(rect) : super.getPadding(rect);
        }
        drawableContainerCompat$b = this.a;
        n3 = (int)(drawableContainerCompat$b.A ? 1 : 0);
        if (n3 != 0 && (n3 = ut0_0.b(this)) == n7) {
            n3 = rect.left;
            rect.left = n4 = rect.right;
            rect.right = n3;
        }
        return bl2;
    }

    public final void invalidateDrawable(Drawable drawable2) {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        if (drawableContainerCompat$b != null) {
            drawableContainerCompat$b.r = false;
            drawableContainerCompat$b.t = false;
        }
        if (drawable2 == (drawableContainerCompat$b = this.c) && (drawable2 = this.getCallback()) != null) {
            drawable2 = this.getCallback();
            drawable2.invalidateDrawable((Drawable)this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    public void jumpToCurrentState() {
        long l2;
        long l3;
        long l4;
        long l7;
        long l8;
        boolean bl2;
        Drawable drawable2 = this.d;
        boolean bl3 = true;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            drawable2 = null;
            this.d = null;
            bl2 = true;
        } else {
            bl2 = false;
            drawable2 = null;
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
            boolean bl4 = this.f;
            if (bl4) {
                drawable3 = this.c;
                int n3 = this.e;
                drawable3.setAlpha(n3);
            }
        }
        if ((l8 = (l7 = (l4 = this.k) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false) {
            this.k = l3;
            bl2 = true;
        }
        if ((l8 = (l2 = (l4 = this.j) - l3) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            this.j = l3;
        } else {
            bl3 = bl2;
        }
        if (bl3) {
            this.invalidateSelf();
        }
    }

    public Drawable mutate() {
        Object object;
        boolean bl2 = this.h;
        if (!bl2 && (object = super.mutate()) == this) {
            object = this.b();
            ((DrawableContainerCompat$b)((Object)object)).e();
            this.e((DrawableContainerCompat$b)((Object)object));
            this.h = bl2 = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        if ((drawable2 = this.c) != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int n3) {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        int n4 = this.g;
        int n7 = drawableContainerCompat$b.h;
        Drawable[] drawableArray = drawableContainerCompat$b.g;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n7; ++i3) {
            boolean bl3;
            Drawable drawable2 = drawableArray[i3];
            if (drawable2 == null) continue;
            int n8 = Build.VERSION.SDK_INT;
            int n10 = 23;
            if (n8 >= n10) {
                bl3 = ut0_0.c(drawable2, n3);
            } else {
                bl3 = false;
                drawable2 = null;
            }
            if (i3 != n4) continue;
            bl2 = bl3;
        }
        drawableContainerCompat$b.x = n3;
        return bl2;
    }

    public final boolean onLevelChange(int n3) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setLevel(n3);
        }
        drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(n3);
        }
        return false;
    }

    public boolean onStateChange(int[] nArray) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            return drawable2.setState(nArray);
        }
        drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setState(nArray);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable2, Runnable runnable2, long l2) {
        Drawable drawable3 = this.c;
        if (drawable2 == drawable3 && (drawable2 = this.getCallback()) != null) {
            drawable2 = this.getCallback();
            drawable2.scheduleDrawable((Drawable)this, runnable2, l2);
        }
    }

    public final void setAlpha(int n3) {
        int n4 = this.f;
        if (n4 == 0 || (n4 = this.e) != n3) {
            n4 = 1;
            this.f = n4;
            this.e = n3;
            Drawable drawable2 = this.c;
            if (drawable2 != null) {
                long l2 = this.j;
                long l3 = 0L;
                long l4 = l2 - l3;
                Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object == false) {
                    drawable2.setAlpha(n3);
                } else {
                    n3 = 0;
                    this.a(false);
                }
            }
        }
    }

    public final void setAutoMirrored(boolean bl2) {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl3 = drawableContainerCompat$b.A;
        if (bl3 != bl2) {
            drawableContainerCompat$b.A = bl2;
            drawableContainerCompat$b = this.c;
            if (drawableContainerCompat$b != null) {
                drawableContainerCompat$b.setAutoMirrored(bl2);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        boolean bl2;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        drawableContainerCompat$b.C = bl2 = true;
        ColorFilter colorFilter2 = drawableContainerCompat$b.B;
        if (colorFilter2 != colorFilter) {
            drawableContainerCompat$b.B = colorFilter;
            drawableContainerCompat$b = this.c;
            if (drawableContainerCompat$b != null) {
                drawableContainerCompat$b.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean bl2) {
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        boolean bl3 = drawableContainerCompat$b.w;
        if (bl3 != bl2) {
            drawableContainerCompat$b.w = bl2;
            drawableContainerCompat$b = this.c;
            if (drawableContainerCompat$b != null) {
                drawableContainerCompat$b.setDither(bl2);
            }
        }
    }

    public final void setHotspot(float f5, float f6) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setHotspot(f5, f6);
        }
    }

    public final void setHotspotBounds(int n3, int n4, int n7, int n8) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = rect = new Rect(n3, n4, n7, n8);
        } else {
            rect.set(n3, n4, n7, n8);
        }
        rect = this.c;
        if (rect != null) {
            rect.setHotspotBounds(n3, n4, n7, n8);
        }
    }

    public final void setTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        this.setTintList(colorStateList);
    }

    public final void setTintList(ColorStateList colorStateList) {
        boolean bl2;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        drawableContainerCompat$b.F = bl2 = true;
        ColorStateList colorStateList2 = drawableContainerCompat$b.D;
        if (colorStateList2 != colorStateList) {
            drawableContainerCompat$b.D = colorStateList;
            drawableContainerCompat$b = this.c;
            ut0_0.e((Drawable)drawableContainerCompat$b, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        boolean bl2;
        DrawableContainerCompat$b drawableContainerCompat$b = this.a;
        drawableContainerCompat$b.G = bl2 = true;
        PorterDuff.Mode mode2 = drawableContainerCompat$b.E;
        if (mode2 != mode) {
            drawableContainerCompat$b.E = mode;
            drawableContainerCompat$b = this.c;
            ut0_0.f((Drawable)drawableContainerCompat$b, mode);
        }
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        boolean bl4 = super.setVisible(bl2, bl3);
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setVisible(bl2, bl3);
        }
        if ((drawable2 = this.c) != null) {
            drawable2.setVisible(bl2, bl3);
        }
        return bl4;
    }

    public final void unscheduleDrawable(Drawable drawable2, Runnable runnable2) {
        Drawable drawable3 = this.c;
        if (drawable2 == drawable3 && (drawable2 = this.getCallback()) != null) {
            drawable2 = this.getCallback();
            drawable2.unscheduleDrawable((Drawable)this, runnable2);
        }
    }
}

