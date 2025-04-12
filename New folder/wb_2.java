/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wb
 */
public final class wb_2
implements Runnable {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ wb_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    public final void run() {
        long l2;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((AjioVideoPlayerFullScreenFragment)object).G = l2 = ((AjioVideoPlayerFullScreenFragment)object).G + 1L;
        Handler handler = ((AjioVideoPlayerFullScreenFragment)object).H;
        object = ((AjioVideoPlayerFullScreenFragment)object).I;
        handler.postDelayed((Runnable)object, 1000L);
    }
}

