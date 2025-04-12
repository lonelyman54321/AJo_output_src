/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;

/*
 * Renamed from rH1
 */
public final class rh1_2
implements OnBackInvokedCallback {
    public final /* synthetic */ MaterialBackHandler a;

    public /* synthetic */ rh1_2(MaterialBackHandler materialBackHandler) {
        this.a = materialBackHandler;
    }

    public final void onBackInvoked() {
        this.a.handleBackInvoked();
    }
}

