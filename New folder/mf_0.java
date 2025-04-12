/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Mf
 */
public final class mf_0
implements iL {
    public Canvas a;
    public Rect b;
    public Rect c;

    public mf_0() {
        Canvas canvas;
        this.a = canvas = Nf.a;
    }

    public final void a(float f5, float f6) {
        this.a.scale(f5, f6);
    }

    public final void b(float f5, float f6, float f7, float f8, float f11, float f12, fm2 fm22) {
        Canvas canvas = this.a;
        Paint paint = fm22.h();
        canvas.drawArc(f5, f6, f7, f8, f11, f12, false, paint);
    }

    public final void c(aG2 aG22, ei ei2) {
        float f5 = aG22.a;
        float f6 = aG22.b;
        float f7 = aG22.c;
        float f8 = aG22.d;
        this.u(f5, f6, f7, f8, ei2);
    }

    public final void d(aG2 aG22, int n3) {
        float f5 = aG22.a;
        float f6 = aG22.c;
        float f7 = aG22.d;
        float f8 = aG22.b;
        this.f(f5, f8, f6, f7, n3);
    }

    public final void e(hd1_0 hd1_02, long l2, long l3, long l4, long l7, fm2 fm22) {
        int n3;
        int n4;
        mf_0 mf_02 = this;
        Rect rect = this.b;
        if (rect == null) {
            this.b = rect = new Rect();
            this.c = rect = new Rect();
        }
        rect = mf_02.a;
        Bitmap bitmap = Lh.a(hd1_02);
        Rect rect2 = mf_02.b;
        Intrinsics.checkNotNull(rect2);
        int n7 = 32;
        rect2.left = n4 = (int)(l2 >> n7);
        long l8 = 0xFFFFFFFFL;
        rect2.top = n3 = (int)(l2 & l8);
        int n8 = (int)(l3 >> n7);
        rect2.right = n4 += n8;
        n4 = (int)(l3 & l8);
        rect2.bottom = n3 += n4;
        Unit unit = Unit.a;
        unit = mf_02.c;
        Intrinsics.checkNotNull(unit);
        ((Rect)unit).left = n4 = (int)(l4 >> n7);
        ((Rect)unit).top = n8 = (int)(l4 & l8);
        n7 = (int)(l7 >> n7);
        ((Rect)unit).right = n4 += n7;
        n7 = (int)(l7 & l8);
        ((Rect)unit).bottom = n8 += n7;
        Paint paint = fm22.h();
        rect.drawBitmap(bitmap, rect2, (Rect)unit, paint);
    }

    public final void f(float f5, float f6, float f7, float f8, int n3) {
        Canvas canvas = this.a;
        Region.Op op2 = n3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
        canvas.clipRect(f5, f6, f7, f8, op2);
    }

    public final void g(float f5, float f6) {
        this.a.translate(f5, f6);
    }

    public final void h() {
        this.a.restore();
    }

    public final void i(hd1_0 hd1_02, long l2, fm2 fm22) {
        Canvas canvas = this.a;
        hd1_02 = Lh.a(hd1_02);
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        Paint paint = fm22.h();
        canvas.drawBitmap((Bitmap)hd1_02, f5, f6, paint);
    }

    public final void j() {
        DL.a(this.a, true);
    }

    public final void k(long l2, long l3, fm2 fm22) {
        Canvas canvas = this.a;
        float f5 = e72.d(l2);
        float f6 = e72.e(l2);
        float f7 = e72.d(l3);
        float f8 = e72.e(l3);
        Paint paint = fm22.h();
        canvas.drawLine(f5, f6, f7, f8, paint);
    }

    public final void l(float f5, float f6, float f7, float f8, float f11, float f12, fm2 fm22) {
        Canvas canvas = this.a;
        Paint paint = fm22.h();
        canvas.drawRoundRect(f5, f6, f7, f8, f11, f12, paint);
    }

    public final void m(gn2 object, fm2 fm22) {
        Canvas canvas = this.a;
        boolean bl2 = object instanceof ki;
        if (bl2) {
            object = ((ki)object).a;
            fm22 = fm22.h();
            canvas.drawPath((Path)object, (Paint)fm22);
            return;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw object;
    }

    public final void n(float f5) {
        this.a.rotate(f5);
    }

    public final void o(gn2 object, int n3) {
        Canvas canvas = this.a;
        boolean bl2 = object instanceof ki;
        if (bl2) {
            object = ((ki)object).a;
            Region.Op op2 = n3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
            canvas.clipPath((Path)object, op2);
            return;
        }
        object = new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        throw object;
    }

    public final void p() {
        this.a.save();
    }

    public final void q() {
        DL.a(this.a, false);
    }

    public final void r(float[] object) {
        int n3;
        Matrix matrix = null;
        block0: for (int i3 = 0; i3 < (n3 = 4); ++i3) {
            for (int i8 = 0; i8 < n3; ++i8) {
                float f5;
                int n4;
                if (i3 == i8) {
                    n4 = 1065353216;
                    f5 = 1.0f;
                } else {
                    n4 = 0;
                    f5 = 0.0f;
                }
                int n7 = i3 * 4 + i8;
                float f6 = object[n7];
                n4 = (int)(f6 == f5 ? 0 : (f6 < f5 ? -1 : 1));
                if (n4 == 0) {
                    continue;
                }
                matrix = new Matrix();
                wu1_2.b(matrix, object);
                object = this.a;
                object.concat(matrix);
                break block0;
            }
        }
    }

    public final void s(aG2 aG22, fm2 fm22) {
        Canvas canvas = this.a;
        Paint paint = fm22.h();
        float f5 = aG22.c;
        float f6 = aG22.d;
        float f7 = aG22.a;
        float f8 = aG22.b;
        canvas.saveLayer(f7, f8, f5, f6, paint, 31);
    }

    public final void t(float f5, long l2, fm2 fm22) {
        Canvas canvas = this.a;
        float f6 = e72.d(l2);
        float f7 = e72.e(l2);
        Paint paint = fm22.h();
        canvas.drawCircle(f6, f7, f5, paint);
    }

    public final void u(float f5, float f6, float f7, float f8, fm2 fm22) {
        Canvas canvas = this.a;
        Paint paint = fm22.h();
        canvas.drawRect(f5, f6, f7, f8, paint);
    }

    public final Canvas v() {
        return this.a;
    }

    public final void w(Canvas canvas) {
        this.a = canvas;
    }
}

