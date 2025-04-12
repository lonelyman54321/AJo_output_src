/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.drawable.StateListDrawable
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.drawable.StateListDrawable;
import android.view.View;

/*
 * Renamed from uf
 */
public final class uf_0 {
    public static /* bridge */ /* synthetic */ int a(StateListDrawable stateListDrawable) {
        return stateListDrawable.getStateCount();
    }

    public static /* bridge */ /* synthetic */ BlendMode b() {
        return BlendMode.DST;
    }

    public static /* bridge */ /* synthetic */ View.AccessibilityDelegate c(View view) {
        return view.getAccessibilityDelegate();
    }

    public static /* bridge */ /* synthetic */ void d(Canvas canvas) {
        canvas.disableZ();
    }
}

