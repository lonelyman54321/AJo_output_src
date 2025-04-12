/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import com.ril.ajio.services.data.Payment.PriceValidation;
import kotlin.jvm.internal.Intrinsics;

public final class xT
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xT(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = "$adspotId";
                object3 = (String)object3;
                Intrinsics.checkNotNullParameter(object3, string2);
                object = (JioAdView)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append(" Callback onSwipeLeft");
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((JioAdView)object).getMAdState();
                object3 = JioAdView$AdState.DESTROYED;
                if (object2 != object3 && (object2 = ((JioAdView)object).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    ((JioAdListener)object2).onSwipeLeft((JioAdView)object);
                }
                return;
            }
            case 0: 
        }
        object3 = (CheckoutFragment)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        hv3_0.S(((CheckoutFragment)object3).y);
        object2 = ((CheckoutFragment)object3).o;
        if (object2 != null) {
            int n4;
            if ((object = (PriceValidation)object) != null && (object = ((PriceValidation)object).getLuxeDetails()) != null) {
                object3 = ((CheckoutFragment)object3).Qa();
                ((kj2_1)object3).g = object;
            }
            if ((n4 = ((ys_1)object2).n) > 0) {
                ((RecyclerView$f)object2).notifyItemChanged(n4);
            }
        }
    }
}

