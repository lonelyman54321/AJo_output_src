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
 * Renamed from if
 */
public final class if_0 {
    public static /* bridge */ /* synthetic */ BlendMode a() {
        return BlendMode.SRC;
    }

    public static /* bridge */ /* synthetic */ void b(Canvas canvas, RectF rectF, float[] fArray, RectF rectF2, float[] fArray2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArray, rectF2, fArray2, paint);
    }
}

