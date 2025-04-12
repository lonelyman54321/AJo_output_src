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
 * Renamed from Bb
 */
public final class bb_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ds2_2 ds2_22 = (ds2_2)this.b;
                Intrinsics.checkNotNullParameter(ds2_22, "this$0");
                object = ds2_22.b;
                if (object != null) {
                    object.l5();
                }
                return;
            }
            case 0: 
        }
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = (AjioVideoPlayerFullScreenFragment)this.b;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        ajioVideoPlayerFullScreenFragment.Va();
    }
}

