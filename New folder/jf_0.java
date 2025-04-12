/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.text.MeasuredText
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.text.MeasuredText;

/*
 * Renamed from jf
 */
public final class jf_0 {
    public static /* bridge */ /* synthetic */ BlendMode a() {
        return BlendMode.HARD_LIGHT;
    }

    public static /* bridge */ /* synthetic */ void b(Canvas canvas, MeasuredText measuredText, int n3, int n4, int n7, int n8, float f5, float f6, boolean bl2, Paint paint) {
        canvas.drawTextRun(measuredText, n3, n4, n7, n8, f5, f6, bl2, paint);
    }
}

