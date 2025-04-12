/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.unity.plugin.android.UnityBridge;

public final class dw3
implements Runnable {
    public final /* synthetic */ UnityBridge a;

    public /* synthetic */ dw3(UnityBridge unityBridge) {
        this.a = unityBridge;
    }

    public final void run() {
        JioAdView jioAdView = this.a.d;
        if (jioAdView != null) {
            jioAdView.loadAd();
        }
    }
}

