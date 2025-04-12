/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import in.juspay.hypersdk.safe.JuspayWebView;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zn
 */
public final class zn_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zn_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (String)object2;
                Intrinsics.checkNotNullParameter(object2, "$adspotId");
                object = (JioAdView)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object3 = new StringBuilder();
                object3.append((String)object2);
                object3.append(" Callback onAdReceived");
                Intrinsics.checkNotNullParameter(object3.toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((JioAdView)object).getMAdState();
                object3 = JioAdView$AdState.DESTROYED;
                if (object2 != object3 && (object2 = ((JioAdView)object).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    ((JioAdListener)object2).onAdReceived((JioAdView)object);
                }
                return;
            }
            case 1: {
                object2 = (JuspayWebView)((Object)object2);
                JuspayWebView.a((String)object, (JuspayWebView)((Object)object2));
                return;
            }
            case 0: 
        }
        object = (List)object;
        Intrinsics.checkNotNullParameter(object, "$processedEvents");
        HashSet hashSet = yn_0.a;
        object2 = (Integer)object2;
        n3 = (int)(CollectionsKt.F(hashSet, object2) ? 1 : 0);
        if (n3 == 0) {
            Intrinsics.checkNotNullParameter(object, "processedEvents");
            hashSet = yn_0.b;
            int n4 = CollectionsKt.F(hashSet, object2);
            if (n4 != 0) {
                n4 = yn_0.e;
                n3 = 5;
                if (n4 >= n3) {
                    object = yn_0.b();
                    object.clear();
                    yn_0.e = 0;
                } else {
                    int n7;
                    object2 = yn_0.b();
                    object = (Collection)object;
                    object2.addAll(0, object);
                    yn_0.e = n7 = yn_0.e + 1;
                }
            }
        }
    }
}

