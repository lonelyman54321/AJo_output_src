/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.view.View
 */
import android.graphics.Canvas;
import android.view.View;

/*
 * Renamed from df
 */
public final class df_1 {
    public static /* bridge */ /* synthetic */ void a(View view) {
        view.setImportantForAutofill(1);
    }

    public static /* bridge */ /* synthetic */ boolean b(Canvas canvas, float f5, float f6, float f7, float f8) {
        return canvas.clipOutRect(f5, f6, f7, f8);
    }
}

