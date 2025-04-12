/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Path
 *  android.view.autofill.AutofillValue
 */
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.autofill.AutofillValue;

/*
 * Renamed from ff
 */
public final class ff_0 {
    public static /* bridge */ /* synthetic */ AutofillValue a(Object object) {
        return (AutofillValue)object;
    }

    public static /* bridge */ /* synthetic */ boolean b(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }
}

