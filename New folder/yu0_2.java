/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;

/*
 * Renamed from yu0
 */
public final class yu0_2
extends Drawable {
    public static final float m = (float)Math.toRadians(45.0);
    public final Paint a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public final float k;
    public final int l;

    public yu0_2(Context context) {
        float f5;
        int n3;
        Path path;
        Paint paint;
        this.a = paint = new Paint();
        this.g = path = new Path();
        path = null;
        this.i = false;
        this.l = 2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        style2 = Paint.Join.MITER;
        paint.setStrokeJoin((Paint.Join)style2);
        style2 = Paint.Cap.BUTT;
        paint.setStrokeCap((Paint.Cap)style2);
        int n4 = 1;
        float f6 = Float.MIN_VALUE;
        paint.setAntiAlias(n4 != 0);
        context = context.getTheme();
        int[] nArray = R$styleable.DrawerArrowToggle;
        int n7 = R$attr.drawerArrowStyle;
        int n8 = R$style.Base_Widget_AppCompat_DrawerArrowToggle;
        context = context.obtainStyledAttributes(null, nArray, n7, n8);
        int n10 = R$styleable.DrawerArrowToggle_color;
        n10 = context.getColor(n10, 0);
        n7 = paint.getColor();
        if (n10 != n7) {
            paint.setColor(n10);
            this.invalidateSelf();
        }
        n10 = R$styleable.DrawerArrowToggle_thickness;
        n7 = 0;
        float f7 = context.getDimension(n10, 0.0f);
        float f8 = paint.getStrokeWidth();
        float f11 = f8 - f7;
        n8 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n8 != 0) {
            paint.setStrokeWidth(f7);
            n3 = 0x40000000;
            double d2 = f7 /= 2.0f;
            double d5 = Math.cos(m) * d2;
            this.k = f5 = (float)d5;
            this.invalidateSelf();
        }
        n3 = R$styleable.DrawerArrowToggle_spinBars;
        n4 = this.f;
        if (n4 != (n3 = (int)(context.getBoolean(n3, n4 != 0) ? 1 : 0))) {
            this.f = n3;
            this.invalidateSelf();
        }
        n3 = R$styleable.DrawerArrowToggle_gapBetweenBars;
        f5 = n3 = Math.round(context.getDimension(n3, 0.0f));
        float f12 = f5 - (f6 = this.e);
        n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            this.e = f5;
            this.invalidateSelf();
        }
        n3 = R$styleable.DrawerArrowToggle_drawableSize;
        this.h = n3 = context.getDimensionPixelSize(n3, 0);
        n3 = R$styleable.DrawerArrowToggle_barLength;
        this.c = f5 = (float)Math.round(context.getDimension(n3, 0.0f));
        n3 = R$styleable.DrawerArrowToggle_arrowHeadLength;
        this.b = f5 = (float)Math.round(context.getDimension(n3, 0.0f));
        n3 = R$styleable.DrawerArrowToggle_arrowShaftLength;
        this.d = f5 = context.getDimension(n3, 0.0f);
        context.recycle();
    }

    public static float a(float f5, float f6, float f7) {
        return xu0_1.a(f6, f5, f7, f5);
    }

    public final void b(float f5) {
        float f6 = this.j;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.j = f5;
            this.invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        float f5;
        float f6;
        int n3;
        float f7;
        int n4;
        boolean bl2;
        Rect rect;
        Canvas canvas2;
        yu0_2 yu0_22;
        block10: {
            block11: {
                yu0_22 = this;
                canvas2 = canvas;
                rect = this.getBounds();
                bl2 = false;
                n4 = 1;
                f7 = Float.MIN_VALUE;
                int n7 = this.l;
                if (n7 == 0) break block10;
                if (n7 == n4) break block11;
                n3 = 3;
                f6 = 4.2E-45f;
                if (!(n7 != n3 ? (n7 = ut0_0.b(this)) == n4 : (n7 = ut0_0.b(this)) == 0)) break block10;
            }
            bl2 = true;
        }
        float f8 = yu0_22.b;
        f8 *= f8;
        n3 = 0x40000000;
        f6 = 2.0f;
        double d2 = Math.sqrt(f8 * f6);
        f8 = (float)d2;
        float f11 = yu0_22.j;
        float f12 = yu0_22.c;
        f8 = yu0_2.a(f12, f8, f11);
        f11 = yu0_22.d;
        float f14 = yu0_22.j;
        f11 = yu0_2.a(f12, f11, f14);
        f12 = yu0_22.k;
        f14 = yu0_22.j;
        float f15 = 0.0f;
        int n8 = Math.round(yu0_2.a(0.0f, f12, f14));
        f12 = n8;
        f14 = m;
        float f16 = yu0_22.j;
        f14 = yu0_2.a(0.0f, f14, f16);
        f16 = bl2 ? 0.0f : -180.0f;
        float f17 = 180.0f;
        if (bl2) {
            f5 = 180.0f;
        } else {
            f5 = 0.0f;
            paint = null;
        }
        float f18 = yu0_22.j;
        f16 = yu0_2.a(f16, f5, f18);
        double d5 = f8;
        double d7 = f14;
        double d9 = Math.cos(d7) * d5;
        float f19 = f16;
        long l2 = Math.round(d9);
        f15 = l2;
        d7 = Math.sin(d7) * d5;
        long l3 = Math.round(d7);
        f7 = l3;
        Path path = yu0_22.g;
        path.rewind();
        f16 = yu0_22.e;
        paint = yu0_22.a;
        f18 = paint.getStrokeWidth() + f16;
        f16 = -yu0_22.k;
        f14 = yu0_22.j;
        f14 = yu0_2.a(f18, f16, f14);
        f16 = -f11 / f6;
        f18 = f16 + f12;
        path.moveTo(f18, 0.0f);
        path.rLineTo(f11 -= (f12 *= f6), 0.0f);
        path.moveTo(f16, f14);
        path.rLineTo(f15, f7);
        f11 = -f14;
        path.moveTo(f16, f11);
        f7 = -f7;
        path.rLineTo(f15, f7);
        path.close();
        canvas.save();
        f7 = paint.getStrokeWidth();
        f11 = rect.height();
        n8 = 0x40400000;
        f12 = 3.0f * f7;
        f11 -= f12;
        f12 = yu0_22.e;
        n3 = (int)(f11 - (f6 *= f12)) / 4 * 2;
        f6 = n3;
        f11 = 1.5f;
        f7 = f7 * f11 + f12 + f6;
        float f20 = rect.centerX();
        canvas2.translate(f20, f7);
        boolean bl3 = yu0_22.f;
        if (bl3) {
            bl3 = yu0_22.i ^ bl2;
            if (bl3) {
                n4 = -1;
                f7 = 0.0f / 0.0f;
            } else {
                n4 = 1;
                f7 = Float.MIN_VALUE;
            }
            f20 = n4;
            f16 = f19 * f20;
            canvas2.rotate(f16);
        } else if (bl2) {
            canvas2.rotate(f17);
        }
        canvas2.drawPath(path, paint);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.h;
    }

    public final int getIntrinsicWidth() {
        return this.h;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int n3) {
        Paint paint = this.a;
        int n4 = paint.getAlpha();
        if (n3 != n4) {
            paint.setAlpha(n3);
            this.invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
}

