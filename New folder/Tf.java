/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 */
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

public final class Tf
implements ViewTreeObserver.OnTouchModeChangeListener {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ Tf(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean n3) {
        xh1_0 xh1_02 = this.a.C0;
        n3 = n3 != 0 ? 1 : 2;
        xh1_02.getClass();
        Vh1 vh1 = new Vh1(n3);
        xh1_02.b.setValue(vh1);
    }
}

