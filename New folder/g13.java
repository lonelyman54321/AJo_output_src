/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.jioreel.ssai.p;
import com.jio.jioads.network.d;
import com.jio.jioads.network.e;
import com.jio.jioads.network.f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g13
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g13(Object object, int n3) {
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
                Object object3 = "it";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                n3 = object instanceof e;
                String string2 = "message";
                if (n3 != 0) {
                    object = ((e)object).a;
                    if (object != null) {
                        Intrinsics.checkNotNullParameter("***** Network Success parseMetaData", string2);
                        object3 = JioAds.Companion;
                        ((JioAds$Companion)object3).getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                        if (!bl2) {
                            object2 = ((p)object2).a;
                            bl2 = false;
                            String string3 = "vod_ad_details";
                            String string4 = "common_prefs";
                            j_0.p((Context)object2, string4, 0, object, string3);
                            object = "vod vast model response saved";
                            v12.a((String)object, string2, (JioAds$Companion)object3);
                        }
                    }
                } else {
                    boolean bl3 = object instanceof d;
                    if (bl3) {
                        Intrinsics.checkNotNullParameter("***** Network Error parseMetaData", string2);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = ((e13_0)((Pair)object).b).a();
        object2 = (e13_0)object2;
        return Intrinsics.areEqual(object, object2) ^ true;
    }
}

