/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.analytics.events.VideoComponentEvents$Companion;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import com.ril.ajio.services.data.Product.KYPMedia;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from wj2
 */
public final class wj2_1
implements View.OnClickListener {
    public final /* synthetic */ PDPVideoKYPHolder a;
    public final /* synthetic */ KYPMedia b;

    public /* synthetic */ wj2_1(PDPVideoKYPHolder pDPVideoKYPHolder, KYPMedia kYPMedia) {
        this.a = pDPVideoKYPHolder;
        this.b = kYPMedia;
    }

    public final void onClick(View view) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        KYPMedia kYPMedia = this.b;
        Intrinsics.checkNotNullParameter(kYPMedia, "$kypMedia");
        Object object2 = ((PDPVideoKYPHolder)object).n;
        PDPVideoKYPHolder pDPVideoKYPHolder = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgFullScreen");
            object2 = null;
        }
        Intrinsics.checkNotNullExpressionValue(object2.getContext(), "getContext(...)");
        object2 = ((PDPVideoKYPHolder)object).c;
        ((ma_2)object2).s = true;
        int n3 = ((ma_2)object2).r;
        object2 = ((ow_0)object2).a(n3);
        String string2 = kYPMedia.getUrl();
        int n4 = ((PDPVideoKYPHolder)object).w();
        string2 = ow_0.c(n4, string2);
        Object object3 = kYPMedia.getUrl();
        if (object3 != null) {
            object3 = ai0_2.h((String)object3);
        } else {
            n4 = 0;
            object3 = null;
        }
        VideoComponentEvents$Companion videoComponentEvents$Companion = VideoComponentEvents.Companion;
        Object object4 = videoComponentEvents$Companion.getInstance();
        Object object5 = String.valueOf(object3);
        int n7 = 8;
        boolean bl2 = true;
        dj2_2 dj2_22 = null;
        long l2 = 0L;
        Object object6 = "pdp_video_interactions";
        String string3 = "pdp_screen_interaction";
        String string4 = "full screen";
        VideoComponentEvents.logExpandMinimizeEvent$default((VideoComponentEvents)object4, bl2, (String)object5, false, l2, (String)object6, string3, string4, n7, null);
        ((PDPVideoKYPHolder)object).C(string2, (ExoPlayer)object2, kYPMedia);
        object2 = dj2_2.Companion;
        object3 = ((PDPVideoKYPHolder)object).b;
        boolean bl3 = object3.c9();
        object4 = object3.l6();
        object3 = object3.x5();
        if (object3 != null) {
            object3 = ((Product)object3).getName();
        } else {
            n4 = 0;
            object3 = null;
        }
        object3 = String.valueOf(object3);
        object2.getClass();
        dj2_22 = Dj2$a.a(kYPMedia, string2, bl3, (String)object4, (String)object3);
        object = ((PDPVideoKYPHolder)object).e;
        if (object == null) {
            object = "parentView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            pDPVideoKYPHolder = object;
        }
        object = zv0_2.b(pDPVideoKYPHolder.getContext());
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
        Object object7 = object;
        object7 = (AjioHomeActivity)object;
        object5 = ((AjioHomeActivity)object7).T0;
        String string5 = Reflection.getOrCreateKotlinClass(dj2_2.class).getSimpleName();
        object6 = Boolean.FALSE;
        ((AjioHomeActivity)object7).Q1((Fragment)object5, dj2_22, true, string5, (Boolean)object6);
    }
}

