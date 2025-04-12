/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.common.b;
import com.jio.jioads.common.h;
import com.jio.jioads.common.j;
import com.jio.jioads.util.Utility;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

public final class BG2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ BG2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                int n4;
                n3 = j.g;
                object2 = (j)((Object)object2);
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = object2.getContext();
                if (object != null && (n3 = Build.VERSION.SDK_INT) >= (n4 = 24) && (n3 = object instanceof Activity) != 0 && (bl2 = h.a((Activity)(object = (Activity)object)))) {
                    object = new StringBuilder();
                    b b2 = ((j)((Object)object2)).a;
                    String string2 = ": onResume() of JioAdLayout";
                    j_0.i(b2, (StringBuilder)object, string2);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object = JioAds$LogLevel.NONE;
                    object = ((j)((Object)object2)).f;
                    if (object != null) {
                        object.a();
                    }
                } else {
                    object = Utility.INSTANCE;
                    n3 = 5;
                    bl2 = ((Utility)object).checkVisibility((ViewGroup)object2, n3);
                    if (!bl2) {
                        object = new StringBuilder();
                        b b3 = ((j)((Object)object2)).a;
                        String string3 = ": onPause() of checkPIPAndPause";
                        j_0.i(b3, (StringBuilder)object, string3);
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object = JioAds$LogLevel.NONE;
                        object = ((j)((Object)object2)).f;
                        if (object != null) {
                            object.c();
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        object2 = (gg2_1)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((gg2_1)object2).k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customToolbarViewMerger");
            boolean bl3 = false;
            object = null;
        }
        if ((object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

