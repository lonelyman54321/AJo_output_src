/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.view.WindowInsets
 *  android.view.WindowInsetsController
 */
import android.graphics.Insets;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/*
 * Renamed from Lp0
 */
public final class lp0_0 {
    public static /* bridge */ /* synthetic */ Insets a(WindowInsets windowInsets, int n3) {
        return windowInsets.getInsetsIgnoringVisibility(n3);
    }

    public static /* bridge */ /* synthetic */ void b(WindowInsetsController windowInsetsController) {
        int n3 = 8;
        windowInsetsController.setSystemBarsAppearance(n3, n3);
    }
}

