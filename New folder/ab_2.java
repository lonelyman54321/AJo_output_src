/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ab
 */
public final class ab_2
implements View.OnClickListener {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ ab_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    public final void onClick(View view) {
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = this.a;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        ajioVideoPlayerFullScreenFragment.Va();
    }
}

