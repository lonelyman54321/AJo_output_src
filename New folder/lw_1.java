/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnScrollChangeListener
 *  android.view.WindowInsets
 *  android.widget.ScrollView
 */
import android.view.View;
import android.view.WindowInsets;
import android.widget.ScrollView;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;

/*
 * Renamed from Lw
 */
public final class lw_1 {
    public static /* bridge */ /* synthetic */ WindowInsets a(BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout) {
        return snackbarBaseLayout.getRootWindowInsets();
    }

    public static /* bridge */ /* synthetic */ void b(ScrollView scrollView, mx0_0 mx0_02) {
        scrollView.setOnScrollChangeListener((View.OnScrollChangeListener)mx0_02);
    }
}

