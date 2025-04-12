/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.RectF
 *  android.view.autofill.AutofillManager
 */
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.autofill.AutofillManager;

/*
 * Renamed from af
 */
public final class af_0 {
    public static /* bridge */ /* synthetic */ Class a() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean b(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}

