/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.a;
import com.facebook.appevents.f;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import com.ril.ajio.home.landingpage.fragment.HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1;
import in.juspay.hypersdk.core.JuspayServices;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pn
 */
public final class pn_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pn_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.c;
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (JioVmapAdsLoader)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object);
                object2 = (JioAdError)object2;
                Intrinsics.checkNotNullParameter(object2, "$error");
                object = JioVmapAdsLoader.access$getMJioAdView$p((JioVmapAdsLoader)object3);
                if (object != null) {
                    JioAdView$AdState jioAdView$AdState = JioAdView$AdState.FAILED;
                    ((JioAdView)object).setMAdState$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease(jioAdView$AdState);
                }
                object = JioVmapAdsLoader.access$getJioVmapListener$p((JioVmapAdsLoader)object3);
                if (object != null) {
                    object.onJioVmapError((JioAdError)object2);
                }
                return;
            }
            case 2: {
                object3 = (JuspayServices)object3;
                object2 = (Runnable)object2;
                JuspayServices.j((JuspayServices)object3, (Runnable)object2);
                return;
            }
            case 1: {
                n3 = HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1.c;
                object3 = (i71_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object);
                object2 = (wd2_0)object2;
                Intrinsics.checkNotNullParameter(object2, "$fragment");
                cp_1.Companion.getClass();
                object = cp$a.e();
                FragmentManager fragmentManager = ((Fragment)object3).getChildFragmentManager();
                String string2 = "getChildFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(fragmentManager, string2);
                object.getClass();
                boolean bl2 = cp_1.e(fragmentManager);
                if (!bl2) {
                    object = ((Fragment)object3).getChildFragmentManager();
                    object3 = "RatingBottomSheetFragment";
                    ((DialogFragment)object2).show((FragmentManager)object, (String)object3);
                }
                return;
            }
            case 0: 
        }
        object3 = (a)object3;
        object2 = (s03_0)object2;
        object = f.class;
        n3 = (int)(td0.b(object) ? 1 : 0);
        if (n3 == 0) {
            String string3 = "$accessTokenAppId";
            Intrinsics.checkNotNullParameter(object3, string3);
            string3 = "$appEvents";
            Intrinsics.checkNotNullParameter(object2, string3);
            try {
                qn_0.a((a)object3, (s03_0)object2);
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
    }
}

