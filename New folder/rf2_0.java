/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.j;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.myaccount.order.fragment.b$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rf2
 */
public final class rf2_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = j.g;
                object2 = (j)((Object)object2);
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = new StringBuilder();
                b b2 = ((j)((Object)object2)).a;
                String string2 = ": JioAdLayout: onSizeChanged";
                j_0.i(b2, (StringBuilder)object, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = ((j)((Object)object2)).f;
                if (object != null) {
                    object.b();
                }
                return;
            }
            case 0: 
        }
        b$a b$a = com.ril.ajio.myaccount.order.fragment.b.Companion;
        object2 = (com.ril.ajio.myaccount.order.fragment.b)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((com.ril.ajio.myaccount.order.fragment.b)object2).n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
            object = null;
        }
        if ((object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

