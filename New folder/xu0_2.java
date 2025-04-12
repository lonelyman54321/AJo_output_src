/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Xu0
 */
public final class xu0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xu0_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = this.d;
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (f)object;
                String string2 = "result";
                Intrinsics.checkNotNullParameter(object, string2);
                n3 = object instanceof e;
                String string3 = "message";
                object2 = (String)object2;
                if (n3 != 0) {
                    string2 = "*****tracking url  success: ";
                    object = new StringBuilder(string2);
                    ((StringBuilder)object).append((String)object2);
                    Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                } else {
                    boolean bl2 = object instanceof d;
                    if (bl2) {
                        string2 = "tracking  url Failure: ";
                        object = new StringBuilder(string2);
                        ((StringBuilder)object).append((String)object2);
                        Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string3);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (zu0_0)((Object)object);
        object2 = (Function1)object2;
        yu0_0 yu0_02 = new yu0_0((zu0_0)((Object)object), (Function1)object2);
        return yu0_02;
    }
}

