/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.RectF
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/*
 * Renamed from j93
 */
public final class j93_0
extends kw_1 {
    public final RectF D;
    public final bp1_1 E;
    public final float[] F;
    public final Path G;
    public final pp1 H;
    public la3_0 I;
    public la3_0 J;

    public j93_0(yc1_1 object, pp1 pp12) {
        super((yc1_1)((Object)object), pp12);
        super();
        this.D = object;
        super();
        this.E = object;
        Object object2 = new float[8];
        this.F = object2;
        object2 = new Path;
        super();
        this.G = (Path)object2;
        this.H = pp12;
        ((bp1_1)((Object)object)).setAlpha(0);
        object2 = Paint.Style.FILL;
        object.setStyle((Paint.Style)object2);
        int n3 = pp12.l;
        object.setColor(n3);
    }

    public final void f(RectF rectF, Matrix matrix, boolean bl2) {
        super.f(rectF, matrix, bl2);
        matrix = this.D;
        pp1 pp12 = this.H;
        float f5 = pp12.j;
        float f6 = pp12.k;
        matrix.set(0.0f, 0.0f, f5, f6);
        this.n.mapRect((RectF)matrix);
        rectF.set((RectF)matrix);
    }

    public final void h(LC1 object, Object object2) {
        super.h((LC1)object, object2);
        Object object3 = GC1.F;
        if (object2 == object3) {
            this.I = object == null ? null : (object2 = new la3_0((LC1)object, null));
        } else {
            int n3 = 1;
            object3 = n3;
            if (object2 == object3) {
                if (object == null) {
                    this.J = null;
                    object = this.H;
                    int n4 = ((pp1)object).l;
                    object2 = this.E;
                    object2.setColor(n4);
                } else {
                    this.J = object2 = new la3_0((LC1)object, null);
                }
            }
        }
    }

    public final void l(Canvas canvas, Matrix matrix, int n3, bw0_0 object) {
        int n4;
        float f5;
        int n7;
        pp1 pp12 = this.H;
        int n8 = Color.alpha((int)pp12.l);
        if (n8 == 0) {
            return;
        }
        Object object2 = this.J;
        if (object2 == null) {
            n7 = 0;
            f5 = 0.0f;
            object2 = null;
        } else {
            object2 = (Integer)((la3_0)object2).f();
        }
        bp1_1 bp1_12 = this.E;
        if (object2 != null) {
            n7 = (Integer)object2;
            bp1_12.setColor(n7);
        } else {
            n7 = pp12.l;
            bp1_12.setColor(n7);
        }
        object2 = this.w.j;
        if (object2 == null) {
            n7 = 100;
            f5 = 1.4E-43f;
        } else {
            object2 = (Integer)((iw_0)object2).f();
            n7 = (Integer)object2;
        }
        float f6 = n3;
        int n10 = 1132396544;
        float f7 = 255.0f;
        f6 /= f7;
        float f8 = (float)n8 / f7;
        f5 = n7;
        f8 *= f5;
        n7 = 1120403456;
        f5 = 100.0f;
        f8 = f8 / f5 * f6 * f7;
        n3 = (int)f8;
        bp1_12.setAlpha(n3);
        if (object != null) {
            n8 = Color.alpha((int)((bw0_0)object).d);
            if (n8 > 0) {
                f8 = ((bw0_0)object).a;
                n7 = 1;
                f8 = Math.max(f8, Float.MIN_VALUE);
                f5 = ((bw0_0)object).b;
                f7 = ((bw0_0)object).c;
                n4 = ((bw0_0)object).d;
                bp1_12.setShadowLayer(f8, f5, f7, n4);
            } else {
                bp1_12.clearShadowLayer();
            }
        } else {
            bp1_12.clearShadowLayer();
        }
        object = this.I;
        if (object != null) {
            object = (ColorFilter)((la3_0)object).f();
            bp1_12.setColorFilter((ColorFilter)object);
        }
        if (n3 > 0) {
            float[] fArray = this.F;
            n4 = 0;
            object = null;
            fArray[0] = 0.0f;
            n7 = 1;
            f5 = Float.MIN_VALUE;
            fArray[n7] = 0.0f;
            f7 = pp12.j;
            int n14 = 2;
            fArray[n14] = f7;
            int n15 = 3;
            fArray[n15] = 0.0f;
            int n16 = 4;
            fArray[n16] = f7;
            int n17 = pp12.k;
            float f11 = n17;
            n10 = 5;
            fArray[n10] = f11;
            int n18 = 6;
            fArray[n18] = 0.0f;
            n8 = 7;
            fArray[n8] = f11;
            matrix.mapPoints(fArray);
            matrix = this.G;
            matrix.reset();
            f11 = fArray[0];
            float f12 = fArray[n7];
            matrix.moveTo(f11, f12);
            f11 = fArray[n14];
            float f14 = fArray[n15];
            matrix.lineTo(f11, f14);
            f11 = fArray[n16];
            f7 = fArray[n10];
            matrix.lineTo(f11, f7);
            f11 = fArray[n18];
            f8 = fArray[n8];
            matrix.lineTo(f11, f8);
            float f15 = fArray[0];
            f6 = fArray[n7];
            matrix.lineTo(f15, f6);
            matrix.close();
            canvas.drawPath((Path)matrix, (Paint)bp1_12);
        }
    }
}

