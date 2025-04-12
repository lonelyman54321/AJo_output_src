/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Rect
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/*
 * Renamed from Sf3
 */
public final class sf3_0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public CharSequence i;
    public Layout.Alignment j;
    public Bitmap k;
    public float l;
    public int m;
    public int n;
    public float o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public sf3_0(Context context) {
        float f5;
        float f6;
        Object object = new int[]{16843287, 16843288};
        object = context.obtainStyledAttributes(null, object, 0, 0);
        this.e = f6 = (float)object.getDimensionPixelSize(0, 0);
        boolean bl2 = true;
        this.d = f6 = object.getFloat(bl2 ? 1 : 0, 1.0f);
        object.recycle();
        this.a = f5 = (float)Math.round((float)context.getResources().getDisplayMetrics().densityDpi * 2.0f / 160.0f);
        this.b = f5;
        this.c = f5;
        this.f = context;
        context.setAntiAlias(bl2);
        context.setSubpixelText(bl2);
        super();
        this.g = context;
        context.setAntiAlias(bl2);
        object = Paint.Style.FILL;
        context.setStyle((Paint.Style)object);
        super();
        this.h = context;
        context.setAntiAlias(bl2);
        context.setFilterBitmap(bl2);
    }

    public final void a(Canvas canvas, boolean bl2) {
        block10: {
            block9: {
                TextPaint textPaint;
                int n3;
                StaticLayout staticLayout;
                StaticLayout staticLayout2;
                block12: {
                    float f5;
                    int n4;
                    int n7;
                    float f6;
                    int n8;
                    float f7;
                    float f8;
                    Paint paint;
                    int n10;
                    float f11;
                    block14: {
                        block13: {
                            block11: {
                                float f12;
                                if (!bl2) break block9;
                                staticLayout2 = this.E;
                                staticLayout = this.F;
                                if (staticLayout2 == null || staticLayout == null) break block10;
                                n3 = canvas.save();
                                f11 = this.G;
                                int n14 = this.H;
                                float f14 = n14;
                                canvas.translate(f11, f14);
                                n10 = Color.alpha((int)this.u);
                                if (n10 > 0) {
                                    paint = this.g;
                                    n10 = this.u;
                                    paint.setColor(n10);
                                    f12 = -this.I;
                                    n10 = staticLayout2.getWidth();
                                    n14 = this.I;
                                    f8 = n10 + n14;
                                    n10 = staticLayout2.getHeight();
                                    f7 = n10;
                                    n8 = 0;
                                    f6 = 0.0f;
                                    textPaint = canvas;
                                    canvas.drawRect(f12, 0.0f, f8, f7, paint);
                                }
                                n10 = this.w;
                                textPaint = this.f;
                                f12 = 0.0f;
                                n8 = 1;
                                f6 = Float.MIN_VALUE;
                                if (n10 != n8) break block11;
                                Paint.Join join = Paint.Join.ROUND;
                                textPaint.setStrokeJoin(join);
                                f11 = this.a;
                                textPaint.setStrokeWidth(f11);
                                n10 = this.v;
                                textPaint.setColor(n10);
                                join = Paint.Style.FILL_AND_STROKE;
                                textPaint.setStyle((Paint.Style)join);
                                staticLayout.draw(canvas);
                                break block12;
                            }
                            n7 = 2;
                            f8 = 2.8E-45f;
                            f7 = this.b;
                            if (n10 != n7) break block13;
                            float f15 = this.c;
                            n10 = this.v;
                            textPaint.setShadowLayer(f7, f15, f15, n10);
                            break block12;
                        }
                        n7 = 3;
                        f8 = 4.2E-45f;
                        if (n10 == n7) break block14;
                        n4 = 4;
                        f5 = 5.6E-45f;
                        if (n10 != n4) break block12;
                    }
                    if (n10 != n7) {
                        n8 = 0;
                        f6 = 0.0f;
                    }
                    n10 = -1;
                    f11 = 0.0f / 0.0f;
                    if (n8 != 0) {
                        n7 = -1;
                        f8 = 0.0f / 0.0f;
                    } else {
                        n7 = this.v;
                    }
                    if (n8 != 0) {
                        n10 = this.v;
                    }
                    n8 = 0x40000000;
                    f6 = f7 / 2.0f;
                    n4 = this.s;
                    textPaint.setColor(n4);
                    paint = Paint.Style.FILL;
                    textPaint.setStyle((Paint.Style)paint);
                    f5 = -f6;
                    textPaint.setShadowLayer(f7, f5, f5, n7);
                    staticLayout.draw(canvas);
                    textPaint.setShadowLayer(f7, f6, f6, n10);
                }
                int n15 = this.s;
                textPaint.setColor(n15);
                staticLayout = Paint.Style.FILL;
                textPaint.setStyle((Paint.Style)staticLayout);
                staticLayout2.draw(canvas);
                bl2 = false;
                staticLayout2 = null;
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(n3);
                break block10;
            }
            this.J.getClass();
            this.k.getClass();
            Bitmap bitmap = this.k;
            Rect rect = this.J;
            Paint paint = this.h;
            boolean bl3 = false;
            float f16 = 0.0f;
            Object var17_22 = null;
            canvas.drawBitmap(bitmap, null, rect, paint);
        }
    }
}

