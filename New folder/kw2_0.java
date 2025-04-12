/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowManager
 */
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/*
 * Renamed from Kw2
 */
public class kw2_0
implements iw2_0 {
    public final void a(Rect rect, View view) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    public final void b(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    public void c(View view, int n3, int n4) {
    }
}

