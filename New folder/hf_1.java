/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.RectF
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/*
 * Renamed from hf
 */
public final class hf_1 {
    public static /* bridge */ /* synthetic */ BlendMode a() {
        return BlendMode.COLOR_BURN;
    }

    public static /* bridge */ /* synthetic */ void b(Canvas canvas, RectF rectF, float f5, float f6, RectF rectF2, float f7, float f8, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f5, f6, rectF2, f7, f8, paint);
    }
}

