/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.ViewConfiguration
 */
import android.os.Handler;
import android.view.ViewConfiguration;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xb
 */
public final class xb_2
implements Runnable {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ xb_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    public final void run() {
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = this.a;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        Handler handler = ajioVideoPlayerFullScreenFragment.O;
        yb_2 yb_22 = ajioVideoPlayerFullScreenFragment.N;
        long l2 = ajioVideoPlayerFullScreenFragment.C;
        long l3 = ViewConfiguration.getTapTimeout();
        handler.postDelayed((Runnable)yb_22, l2 -= l3);
    }
}

