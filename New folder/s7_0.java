/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.exoplayer.e;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from s7
 */
public final class s7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        int n3 = this.a;
        switch (n3) {
            default: {
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, "this$0");
                s7.P();
                return;
            }
            case 0: 
        }
        object = (AjioExoPlayerFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((AjioExoPlayerFragment)object).n;
        if (object2 != null) {
            object2 = ((VideoSetting)object2).getFullScreen();
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, bl3);
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            ((AjioExoPlayerFragment)object).Wa();
        } else {
            object2 = ((AjioExoPlayerFragment)object).a;
            if (object2 != null) {
                boolean bl4;
                boolean bl5;
                ((ob_2)object2).g = bl5 = true;
                e e2 = ((ob_2)object2).i;
                if (e2 != null && !(bl4 = e2.isPlaying())) {
                    object2 = ((ob_2)object2).i;
                    if (object2 != null) {
                        object2.setPlayWhenReady(bl5);
                    }
                } else {
                    long l2 = ((ob_2)object2).h;
                    int n4 = 5;
                    ob_2.h((ob_2)object2, l2, 0, n4);
                }
            }
            ((AjioExoPlayerFragment)object).Pa();
        }
    }
}

