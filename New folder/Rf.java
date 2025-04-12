/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

public final class Rf
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ Rf(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void onGlobalLayout() {
        this.a.X();
    }
}

