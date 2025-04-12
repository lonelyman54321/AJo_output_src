/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.videomodule.config.a;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p7
 */
public final class p7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7_0(Object object, int n3) {
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
                object = s7.g0();
                n3 = (int)(((a)object).t ? 1 : 0);
                if (n3 != 0) {
                    s7.g();
                }
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
        }
    }
}

