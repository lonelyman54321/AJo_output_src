/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Product.KYPMedia;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xj2
 */
public final class xj2_1
implements View.OnClickListener {
    public final /* synthetic */ PDPVideoKYPHolder a;
    public final /* synthetic */ KYPMedia b;

    public /* synthetic */ xj2_1(PDPVideoKYPHolder pDPVideoKYPHolder, KYPMedia kYPMedia) {
        this.a = pDPVideoKYPHolder;
        this.b = kYPMedia;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        String string2;
        String string3;
        float f5;
        int n4;
        Object object2;
        boolean bl2;
        PDPVideoKYPHolder pDPVideoKYPHolder = this.a;
        Intrinsics.checkNotNullParameter(pDPVideoKYPHolder, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$kypMedia");
        Object object4 = pDPVideoKYPHolder.c;
        int n7 = ((ma_2)object4).r;
        object4 = ((ow_0)object4).a(n7);
        ma_2 ma_22 = pDPVideoKYPHolder.c;
        if (object4 != null && (bl2 = object4.isPlaying())) {
            object4.pause();
            object2 = ma_22.e(n7);
            if (object2 == null || (object2 = ((lt2_1)object2).d) == null) {
                object2 = "";
            }
            pDPVideoKYPHolder.D((String)object2, (ExoPlayer)object4, (KYPMedia)object3);
            pDPVideoKYPHolder.y();
        }
        ma_22.r = n4 = pDPVideoKYPHolder.w();
        object4 = pDPVideoKYPHolder.h;
        String string4 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekbar");
            n4 = 0;
            object4 = null;
        }
        ai0_2.B((View)object4);
        object4 = pDPVideoKYPHolder.i;
        Object object5 = "imgVolume";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object4 = null;
        }
        ai0_2.B((View)object4);
        object4 = pDPVideoKYPHolder.i;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object4 = null;
        }
        ai0_2.a((View)object4);
        object4 = pDPVideoKYPHolder.l;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgPause");
            n4 = 0;
            object4 = null;
        }
        ai0_2.B((View)object4);
        object4 = pDPVideoKYPHolder.r;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoSetting");
            n4 = 0;
            object4 = null;
        }
        if ((n4 = (int)(Intrinsics.areEqual(object4 = ((VideoSetting)object4).getFullScreen(), object2 = Boolean.TRUE) ? 1 : 0)) != 0) {
            object4 = pDPVideoKYPHolder.n;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
                n4 = 0;
                object4 = null;
            }
            ai0_2.B((View)object4);
        }
        cp_1.Companion.getClass();
        object4 = cp$a.d().getAudioSettings();
        Object object6 = ((KYPMedia)object3).getUrl();
        int n8 = pDPVideoKYPHolder.w();
        object6 = ow_0.c(n8, (String)object6);
        pDPVideoKYPHolder.A = object6;
        Serializable serializable = eb_2.d;
        pDPVideoKYPHolder.z = object6 = (sb3_2)serializable.get(object6);
        if (object6 != null) {
            f5 = ((sb3_2)object6).f;
            serializable = Float.valueOf(f5);
            ma_22.g = serializable;
            serializable = Boolean.valueOf(PDPVideoKYPHolder.I);
            ((sb3_2)object6).h = serializable;
            n8 = (int)(PDPVideoKYPHolder.I ? 1 : 0);
            ((sb3_2)object6).d = n8;
        }
        if ((object6 = pDPVideoKYPHolder.z) == null) {
            string3 = null;
            int n10 = 255;
            string2 = null;
            object = object6;
            pDPVideoKYPHolder.z = object6 = new sb3_2(null, null, null, false, 0.0f, null, null, n10);
            serializable = ((AudioSettings)object4).getMuteOnMinimizedScreen();
            ((sb3_2)object6).h = serializable;
            serializable = ((AudioSettings)object4).getMuteOnFullScreen();
            ((sb3_2)object6).g = serializable;
            object4 = ((AudioSettings)object4).getMuteOnMinimizedScreen();
            n4 = (int)(Intrinsics.areEqual(object4, object2) ? 1 : 0);
            ((sb3_2)object6).d = n4;
        }
        n4 = pDPVideoKYPHolder.w();
        object2 = pDPVideoKYPHolder.g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerView");
            n7 = 0;
            object2 = null;
        }
        object6 = ((KYPMedia)object3).getUrl();
        String string5 = String.valueOf(pDPVideoKYPHolder.A);
        sb3_2 sb3_22 = pDPVideoKYPHolder.z;
        object3 = pDPVideoKYPHolder.c;
        int n14 = 136;
        f5 = 0.0f;
        serializable = null;
        ma_2.i((ma_2)object3, n4, (PlayerView)((Object)object2), (String)object6, null, pDPVideoKYPHolder, string5, sb3_22, n14);
        long l2 = pDPVideoKYPHolder.w;
        long l3 = 0L;
        n8 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        if (n8 == 0) {
            pDPVideoKYPHolder.w = l2 = System.currentTimeMillis();
        }
        if ((object3 = pDPVideoKYPHolder.z) != null && (n3 = ((sb3_2)object3).d) == (n4 = 1)) {
            n3 = pDPVideoKYPHolder.w();
            object3 = ma_22.a(n3);
            ma_22.k((ExoPlayer)object3);
            object3 = pDPVideoKYPHolder.i;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object3 = null;
            }
            if ((object4 = pDPVideoKYPHolder.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object4 = null;
            }
            object4 = object4.getContext();
            n7 = R$drawable.ic_pdp_video_mute;
            object4 = xn.a((Context)object4, n7);
            object3.setImageDrawable((Drawable)object4);
        } else {
            n3 = pDPVideoKYPHolder.w();
            object3 = ma_22.a(n3);
            ma_2.p(ma_22, (ExoPlayer)object3);
            object3 = pDPVideoKYPHolder.i;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n3 = 0;
                object3 = null;
            }
            if ((object4 = pDPVideoKYPHolder.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object4 = null;
            }
            object4 = object4.getContext();
            n7 = R$drawable.ic_pdp_video_unmute;
            object4 = xn.a((Context)object4, n7);
            object3.setImageDrawable((Drawable)object4);
        }
        object5 = VideoComponentEvents.Companion.getInstance();
        object3 = pDPVideoKYPHolder.u;
        object = String.valueOf(object3);
        l2 = pDPVideoKYPHolder.v;
        object2 = pDPVideoKYPHolder.b;
        string2 = object2.l6();
        object2 = object2.x5();
        if (object2 != null) {
            string4 = ((Product)object2).getName();
        }
        string3 = String.valueOf(string4);
        ((VideoComponentEvents)object5).logPlayPauseEvent((String)object, false, l2, string2, string3, false, true, "pdp_video_interactions", "pdp_screen_interaction");
    }
}

