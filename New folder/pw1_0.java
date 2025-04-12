/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.view.View;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.multiad.H;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from PW1
 */
public final class pw1_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pw1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (H)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                boolean bl2 = ((H)object).c;
                if (bl2) {
                    bl2 = false;
                    ((H)object).c = false;
                    n3 = 1;
                    ((H)object).g = n3;
                    ((H)object).h = false;
                    object2 = ((H)object).d;
                    if (object2 != null && (object2 = ((H)object).e) != null) {
                        Intrinsics.checkNotNull(object2);
                        JSONArray jSONArray = ((H)object).d;
                        Intrinsics.checkNotNull(jSONArray);
                        ((H)object).c(jSONArray, (JSONObject)object2);
                        bl2 = false;
                        object2 = null;
                        ((H)object).d = null;
                        ((H)object).e = null;
                    }
                } else {
                    object2 = "message";
                    Intrinsics.checkNotNullParameter("js loading not yet started", (String)object2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                }
                return;
            }
            case 0: 
        }
        object = (ex1_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((ex1_0)object).J;
        if (object2 != null) {
            ai0_2.a((View)object2);
        }
        if ((object = ((ex1_0)object).I) != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

