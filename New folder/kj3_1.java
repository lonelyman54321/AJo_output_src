/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/*
 * Renamed from kJ3
 */
public final class kj3_1 {
    public static final kj3_1 a;

    static {
        kj3_1 kj3_12;
        a = kj3_12 = new Object();
    }

    public final void a(AndroidComposeView androidComposeView) {
        ViewParent viewParent = androidComposeView.getParent();
        if (viewParent != null) {
            jj3_0.a(viewParent, (View)androidComposeView, (View)androidComposeView);
        }
    }
}

