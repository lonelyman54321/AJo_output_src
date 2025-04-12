/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 *  android.graphics.RenderNode
 *  android.graphics.text.MeasuredText
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/*
 * Renamed from oL
 */
public final class ol_0 {
    public static final ol_0 a;

    static {
        ol_0 ol_02;
        a = ol_02 = new Object();
    }

    public final void a(Canvas canvas) {
        uf_0.d(canvas);
    }

    public final void b(Canvas canvas, int n3, BlendMode blendMode) {
        gf_0.b(canvas, n3, blendMode);
    }

    public final void c(Canvas canvas, long l2) {
        kf_0.b(canvas, l2);
    }

    public final void d(Canvas canvas, long l2, BlendMode blendMode) {
        lf_0.b(canvas, l2, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f5, float f6, RectF rectF2, float f7, float f8, Paint paint) {
        hf_1.b(canvas, rectF, f5, f6, rectF2, f7, f8, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArray, RectF rectF2, float[] fArray2, Paint paint) {
        if_0.b(canvas, rectF, fArray, rectF2, fArray2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        ot0_0.a(canvas, renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int n3, int n4, int n7, int n8, float f5, float f6, boolean bl2, Paint paint) {
        jf_0.b(canvas, measuredText, n3, n4, n7, n8, f5, f6, bl2, paint);
    }

    public final void i(Canvas canvas) {
        tf_1.b(canvas);
    }
}

