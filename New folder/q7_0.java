/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q7
 */
public final class q7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, "this$0");
                s7.e();
                return;
            }
            case 0: 
        }
        object = (AjioExoPlayerFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((AjioExoPlayerFragment)object).Wa();
    }
}

