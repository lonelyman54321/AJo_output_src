/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.ssai.f;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uK
 */
public final class uk_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = null;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (k)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                ((f)object2).b.onAdChange(null);
                Intrinsics.checkNotNullParameter("SDK onAdChange ", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return;
            }
            case 0: 
        }
        object2 = (CancelReasonFragment)object2;
        object2.getClass();
        Object object3 = cp_1.Companion;
        n3 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
        if (n3 != 0) {
            ((CancelReasonFragment)object2).y.getToolbar().setImportantForAccessibility(1);
            object3 = ((CancelReasonFragment)object2).y.getToolbar();
            int n4 = 64;
            object3.performAccessibilityAction(n4, null);
            object = ((CancelReasonFragment)object2).y.getToolbar();
            int n7 = 4;
            object.sendAccessibilityEvent(n7);
        }
    }
}

