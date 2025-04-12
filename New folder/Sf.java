/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;

public final class Sf
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ AndroidComposeView a;

    public /* synthetic */ Sf(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    public final void onScrollChanged() {
        this.a.X();
    }
}

