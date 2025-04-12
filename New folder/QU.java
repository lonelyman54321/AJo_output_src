/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.view.animation.LinearInterpolator
 */
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

public final class QU
extends Drawable
implements Animatable {
    public static final LinearInterpolator g;
    public static final xi0_0 h;
    public static final int[] i;
    public final QU$a a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    static {
        Object object;
        g = object = new LinearInterpolator();
        object = new xi0_0();
        h = object;
        i = new int[]{-16777216};
    }

    public QU(Context object) {
        float f5;
        object.getClass();
        object = object.getResources();
        this.c = object;
        this.a = object;
        Object object2 = i;
        ((QU$a)object).i = object2;
        ((QU$a)object).a(0);
        ((QU$a)object).h = f5 = 2.5f;
        ((QU$a)object).b.setStrokeWidth(f5);
        this.invalidateSelf();
        object2 = new float[2];
        object2[0] = (int)0.0f;
        object2[1] = (int)1.0f;
        object2 = ValueAnimator.ofFloat((float[])object2);
        Object object3 = new OU(this, (QU$a)object);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object3);
        object2.setRepeatCount(-1);
        object2.setRepeatMode(1);
        object3 = g;
        object2.setInterpolator((TimeInterpolator)object3);
        object3 = new PU(this, (QU$a)object);
        object2.addListener((Animator.AnimatorListener)object3);
        this.d = (ValueAnimator)object2;
    }

    public static void d(float f5, QU$a qU$a) {
        int n3 = 1061158912;
        float f6 = 0.75f;
        float f7 = f5 - f6;
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 > 0) {
            f5 = (f5 - f6) / 0.25f;
            int[] nArray = qU$a.i;
            f8 = qU$a.j;
            int n4 = nArray[f8];
            ++f8;
            int n7 = nArray.length;
            n3 = nArray[f8 %= n7];
            f8 = n4 >> 24 & 0xFF;
            n7 = n4 >> 16 & 0xFF;
            int n8 = n4 >> 8 & 0xFF;
            n4 &= 0xFF;
            int n10 = n3 >> 24 & 0xFF;
            int n14 = n3 >> 16 & 0xFF;
            int n15 = n3 >> 8 & 0xFF;
            n3 &= 0xFF;
            n10 = (int)((float)(n10 - f8) * f5);
            f8 = f8 + n10 << 24;
            float f11 = (float)(n14 -= n7) * f5;
            n10 = (int)f11;
            n7 = n7 + n10 << 16;
            f8 = f8 | n7;
            float f12 = (float)(n15 -= n8) * f5;
            n7 = (int)f12;
            n8 += n7;
            n7 = n8 << 8;
            f8 = f8 | n7;
            f6 = n3 -= n4;
            int n16 = (int)(f5 *= f6);
            n4 += n16;
            qU$a.u = n16 = f8 | n4;
        } else {
            int n17;
            int[] nArray = qU$a.i;
            n3 = qU$a.j;
            qU$a.u = n17 = nArray[n3];
        }
    }

    public final void a(float f5, QU$a qU$a, boolean bl2) {
        int n3 = this.f;
        float f6 = 0.01f;
        if (n3 != 0) {
            QU.d(f5, qU$a);
            float f16 = qU$a.m;
            n3 = 1061997773;
            double d2 = Math.floor(f16 / 0.8f);
            double d5 = 1.0;
            f16 = (float)(d2 += d5);
            float f12 = qU$a.k;
            float f23 = qU$a.l;
            qU$a.e = f6 = (f23 - f6 - f12) * f5 + f12;
            qU$a.f = f23;
            f12 = qU$a.m;
            qU$a.g = f5 = xu0_1.a(f16, f12, f5, f12);
        } else {
            n3 = 1065353216;
            float f7 = 1.0f;
            float f8 = f5 - f7;
            float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (f11 != false || bl2) {
                float f12 = qU$a.m;
                xi0_0 xi0_02 = h;
                float f14 = 0.79f;
                float f15 = 0.5f;
                float f16 = f5 - f15;
                float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                if (f17 < 0) {
                    f7 = f5 / f15;
                    f15 = qU$a.k;
                    f7 = xi0_02.getInterpolation(f7) * f14 + f6 + f15;
                } else {
                    float f18 = (f5 - f15) / f15;
                    f15 = qU$a.k + f14;
                    float f19 = xi0_02.getInterpolation(f18);
                    f7 = (f7 - f19) * f14 + f6;
                    f7 = f15 - f7;
                    float f20 = f15;
                    f15 = f7;
                    f7 = f20;
                }
                f6 = 0.20999998f * f5 + f12;
                f12 = this.e;
                f5 += f12;
                int n4 = 1129840640;
                f12 = 216.0f;
                qU$a.e = f15;
                qU$a.f = f7;
                qU$a.g = f6;
                this.b = f5 *= f12;
            }
        }
    }

    public final void b(float f5, float f6, float f7, float f8) {
        int n3;
        float f11 = this.c.getDisplayMetrics().density;
        QU$a qU$a = this.a;
        qU$a.h = f6 *= f11;
        qU$a.b.setStrokeWidth(f6);
        qU$a.q = f5 *= f11;
        qU$a.a(0);
        qU$a.r = n3 = (int)(f7 *= f11);
        qU$a.s = n3 = (int)(f8 *= f11);
    }

    public final void c(int n3) {
        if (n3 == 0) {
            n3 = 0x41400000;
            float f5 = 12.0f;
            float f6 = 6.0f;
            float f7 = 11.0f;
            float f8 = 3.0f;
            this.b(f7, f8, f5, f6);
        } else {
            n3 = 1092616192;
            float f11 = 10.0f;
            float f12 = 5.0f;
            float f14 = 7.5f;
            float f15 = 2.5f;
            this.b(f14, f15, f11, f12);
        }
        this.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        float f5;
        int n3;
        Rect rect = this.getBounds();
        canvas.save();
        float f6 = this.b;
        float f7 = rect.exactCenterX();
        float f8 = rect.exactCenterY();
        canvas.rotate(f6, f7, f8);
        QU$a qU$a = this.a;
        RectF rectF = qU$a.a;
        f7 = qU$a.q;
        f8 = qU$a.h;
        float f11 = 2.0f;
        f8 = f8 / f11 + f7;
        float f12 = f7 - 0.0f;
        float f14 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (f14 <= 0) {
            f14 = rect.width();
            n3 = rect.height();
            f14 = Math.min((int)f14, n3);
            f7 = (float)f14 / f11;
            n3 = qU$a.r;
            f8 = n3;
            f5 = qU$a.p;
            f8 = f8 * f5 / f11;
            f5 = qU$a.h / f11;
            f8 = Math.max(f8, f5);
            f8 = f7 - f8;
        }
        f7 = (float)rect.centerX() - f8;
        int n4 = rect.centerY();
        f5 = (float)n4 - f8;
        int n7 = rect.centerX();
        float f15 = (float)n7 + f8;
        int n8 = rect.centerY();
        float f16 = (float)n8 + f8;
        rectF.set(f7, f5, f15, f16);
        f16 = qU$a.e;
        f7 = qU$a.g;
        f16 += f7;
        n3 = 1135869952;
        f8 = 360.0f;
        float f17 = (qU$a.f + f7) * f8 - (f16 *= f8);
        Paint paint = qU$a.b;
        f14 = qU$a.u;
        paint.setColor((int)f14);
        f14 = qU$a.t;
        paint.setAlpha((int)f14);
        f7 = qU$a.h / f11;
        rectF.inset(f7, f7);
        f8 = rectF.centerX();
        f5 = rectF.centerY();
        f15 = rectF.width() / f11;
        Paint paint2 = qU$a.d;
        canvas.drawCircle(f8, f5, f15, paint2);
        f7 = -f7;
        rectF.inset(f7, f7);
        float f18 = 0.0f;
        paint2 = null;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        f5 = f16;
        f15 = f17;
        canvas.drawArc(rectF, f16, f17, false, paint);
        f14 = (float)qU$a.n;
        if (f14 != false) {
            canvas2 = qU$a.o;
            if (canvas2 == null) {
                canvas2 = new Path();
                qU$a.o = canvas2;
                rectF2 = Path.FillType.EVEN_ODD;
                canvas2.setFillType((Path.FillType)rectF2);
            } else {
                canvas2.reset();
            }
            f7 = rectF.width();
            f8 = rectF.height();
            f7 = Math.min(f7, f8) / f11;
            f8 = qU$a.r;
            f5 = qU$a.p;
            f8 = f8 * f5 / f11;
            qU$a.o.moveTo(0.0f, 0.0f);
            Path path = qU$a.o;
            f15 = qU$a.r;
            f18 = qU$a.p;
            path.lineTo(f15 *= f18, 0.0f);
            path = qU$a.o;
            n7 = qU$a.r;
            f15 = n7;
            f18 = qU$a.p;
            f15 = f15 * f18 / f11;
            int n10 = qU$a.s;
            float f19 = (float)n10 * f18;
            path.lineTo(f15, f19);
            path = qU$a.o;
            f15 = rectF.centerX() + f7 - f8;
            f7 = rectF.centerY();
            f8 = qU$a.h / f11 + f7;
            path.offset(f15, f8);
            qU$a.o.close();
            canvas2 = qU$a.c;
            n3 = qU$a.u;
            canvas2.setColor(n3);
            n3 = qU$a.t;
            canvas2.setAlpha(n3);
            canvas.save();
            f8 = rectF.centerX();
            f5 = rectF.centerY();
            canvas.rotate(f16 += f17, f8, f5);
            rect = qU$a.o;
            canvas.drawPath((Path)rect, (Paint)canvas2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.a.t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.d.isRunning();
    }

    public final void setAlpha(int n3) {
        this.a.t = n3;
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public final void start() {
        float f5;
        float f6;
        float f7;
        this.d.cancel();
        QU$a qU$a = this.a;
        qU$a.k = f7 = qU$a.e;
        qU$a.l = f6 = qU$a.f;
        qU$a.m = f5 = qU$a.g;
        float f8 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
        if (f8 != false) {
            boolean bl2;
            this.f = bl2 = true;
            qU$a = this.d;
            long l2 = 666L;
            qU$a.setDuration(l2);
            qU$a = this.d;
            qU$a.start();
        } else {
            qU$a.a(0);
            f8 = 0.0f;
            f7 = 0.0f;
            qU$a.k = 0.0f;
            qU$a.l = 0.0f;
            qU$a.m = 0.0f;
            qU$a.e = 0.0f;
            qU$a.f = 0.0f;
            qU$a.g = 0.0f;
            qU$a = this.d;
            long l3 = 1332L;
            qU$a.setDuration(l3);
            qU$a = this.d;
            qU$a.start();
        }
    }

    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        QU$a qU$a = this.a;
        boolean bl2 = qU$a.n;
        if (bl2) {
            qU$a.n = false;
        }
        qU$a.a(0);
        qU$a.k = 0.0f;
        qU$a.l = 0.0f;
        qU$a.m = 0.0f;
        qU$a.e = 0.0f;
        qU$a.f = 0.0f;
        qU$a.g = 0.0f;
        this.invalidateSelf();
    }
}

