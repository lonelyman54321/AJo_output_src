/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.JioAdsMetadata;
import com.jio.jioads.controller.f;
import com.jio.jioads.controller.o;
import com.jio.jioads.instreamads.vastparser.n;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class l32
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l32(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (n)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                String string2 = "message";
                Intrinsics.checkNotNullParameter("prepareNextVideoAd() - preparing next ad for infinite looping", string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = ((n)object2).b.k0();
                Object object3 = JioAdView$AdState.DESTROYED;
                if (object != object3) {
                    object = ((f)((n)object2).c).a;
                    Object object4 = ((o)object).a.k0();
                    if (object4 == object3) {
                        fh1_2.f();
                    } else {
                        boolean bl2;
                        object = ((o)object).a;
                        object3 = object.Y();
                        object4 = new HashMap();
                        HashMap<CharSequence, JioAdView$AdState> hashMap = new HashMap<CharSequence, JioAdView$AdState>();
                        if ((object = object.R()) == null || (object = ((JioAdsMetadata)object).getAdMetadata$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((Context)object3)) == null) {
                            object = new HashMap();
                        }
                        ((HashMap)object4).putAll(object);
                        object = ((HashMap)object4).keySet().iterator();
                        while (bl2 = object.hasNext()) {
                            CharSequence charSequence;
                            object3 = (String)object.next();
                            boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                            if (bl3 || (bl3 = TextUtils.isEmpty((CharSequence)(charSequence = (CharSequence)((HashMap)object4).get(object3))))) continue;
                            charSequence = kp1_0.c("md_", (String)object3);
                            object3 = ((HashMap)object4).get(object3);
                            Intrinsics.checkNotNull(object3);
                            hashMap.put(charSequence, (JioAdView$AdState)((Object)object3));
                        }
                    }
                    Intrinsics.checkNotNullParameter("Checking if Production Ad Available locally", string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    ((n)object2).x();
                }
                return;
            }
            case 1: {
                WorkInitializer.b((WorkInitializer)object2);
                return;
            }
            case 0: 
        }
        object2 = (n32_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((n32_0)object2).Pa();
    }
}

