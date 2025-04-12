/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.view.autofill.AutofillManager
 */
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/*
 * Renamed from cf
 */
public final class cf_0 {
    public static /* bridge */ /* synthetic */ AutofillManager a(Object object) {
        return (AutofillManager)object;
    }

    public static /* bridge */ /* synthetic */ boolean b(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }
}

