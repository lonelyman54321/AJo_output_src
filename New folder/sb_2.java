/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.instream.audio.j;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from sb
 */
public final class sb_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        object = "";
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (j)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = new StringBuilder();
                j_0.i(((j)object3).b, (StringBuilder)object, " :skip ad called");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                ((j)object3).m();
                ((j)object3).t();
                return;
            }
            case 2: {
                object3 = (rr2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = ((rr2_1)object3).b;
                if (object2 != null) {
                    String string2 = ((rr2_1)object3).g.getEC_CHECKOUT_INTERACTIONS();
                    String string3 = "checkout_interactions";
                    String string4 = "view more banks clicked";
                    object2.x1(string2, string4, (String)object, string3);
                }
                if ((object = ((rr2_1)object3).b) != null) {
                    object.Ga();
                }
                return;
            }
            case 1: {
                object3 = (bG1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((q22_0)object3).Hb();
                return;
            }
            case 0: 
        }
        object3 = (AjioVideoPlayerFullScreenFragment)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((AjioVideoPlayerFullScreenFragment)object3).s;
        if (object2 == null) {
            ((AjioVideoPlayerFullScreenFragment)object3).Ra();
        }
        object2 = sq0_1.a;
        object2 = ((AjioVideoPlayerFullScreenFragment)object3).F;
        if (object2 == null || (object2 = ((BannerData)object2).getBannerUrl()) == null) {
            object2 = object;
        }
        Intrinsics.checkNotNullParameter(object2, "bannerUrl");
        Object object4 = "?";
        Object object5 = null;
        int n4 = StringsKt.F((CharSequence)object2, (CharSequence)object4, false);
        Object object6 = "/";
        int n7 = 6;
        String string2 = "substring(...)";
        int n8 = 1;
        if (n4 == n8) {
            int n10 = StringsKt.R((CharSequence)object2, (String)object6, 0, n7) + n8;
            n3 = StringsKt.O((CharSequence)object2, (String)object4, 0, false, n7);
            object2 = ((String)object2).substring(n10, n3);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
        } else {
            n3 = StringsKt.R((CharSequence)object2, (String)object6, 0, n7) + n8;
            object2 = ((String)object2).substring(n3);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
        }
        object5 = object2 == null ? object : object2;
        String string6 = "fleek_ingress_banner";
        object6 = "explore ajio fleek";
        String string3 = "";
        boolean bl4 = true;
        sq0_1.i("ingress screen", (String)object5, string6, (String)object6, string3, bl4);
        object4 = VideoComponentEvents.Companion.getInstance();
        object = ((AjioVideoPlayerFullScreenFragment)object3).t;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnShop");
            bl3 = false;
            object = null;
        }
        object5 = ((Object)object.getText()).toString();
        string6 = ai0_2.h(((AjioVideoPlayerFullScreenFragment)object3).u);
        object = ((AjioVideoPlayerFullScreenFragment)object3).s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
            bl3 = false;
            object = null;
        }
        if ((object6 = ((AjioVideoPlayerFullScreenFragment)object3).F) != null) {
            object6 = ((BannerData)object6).getVideoSettings();
        } else {
            bl2 = false;
            object6 = null;
        }
        object.getClass();
        bl2 = ow_0.g((VideoSetting)object6);
        long l2 = ((AjioVideoPlayerFullScreenFragment)object3).D;
        ((VideoComponentEvents)object4).logShopCta((String)object5, string6, bl2, l2);
        object = ((AjioVideoPlayerFullScreenFragment)object3).A;
        if (object != null && (object = ((CTASettings)object).getCtaLink()) != null) {
            object4 = ((Fragment)object3).getActivity();
            n3 = object4 instanceof AjioHomeActivity;
            if (n3 != 0 && (bl3 = az3_0.e((String)object))) {
                object = ((Fragment)object3).getActivity();
                object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (AjioHomeActivity)object;
                ((AjioHomeActivity)object).p();
            } else {
                object = kj0_1.g();
                object4 = ((Fragment)object3).getActivity();
                object3 = ((AjioVideoPlayerFullScreenFragment)object3).A;
                object3 = object3 != null ? ((CTASettings)object3).getCtaLink() : null;
                object5 = Boolean.FALSE;
                ((kj0_1)object).s((Activity)object4, (String)object3, null, (Boolean)object5);
            }
        }
    }
}

