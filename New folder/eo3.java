/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
import android.window.OnBackInvokedCallback;

public final class eo3
implements OnBackInvokedCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ eo3(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void onBackInvoked() {
        this.a.run();
    }
}

