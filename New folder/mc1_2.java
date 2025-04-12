/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.iab.b;
import com.jio.jioads.iab.f;
import com.jio.jioads.iab.h;
import com.jio.jioads.jioreel.adDetection.k;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from mc1
 */
public final class mc1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mc1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object2 = "this$0";
                object = (k)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n3 = (int)(((k)object).M ? 1 : 0);
                if (n3 != 0 && (object2 = ((com.jio.jioads.jioreel.ssai.f)object).h) == null) {
                    Object object3 = ((com.jio.jioads.jioreel.ssai.f)object).a;
                    f f5 = null;
                    ((com.jio.jioads.jioreel.ssai.f)object).h = object2 = new b((Context)object3, null);
                    n4 = (int)(((b)object2).c ? 1 : 0);
                    if (n4 != 0 && (object2 = ((b)object2).d) != null) {
                        Intrinsics.checkNotNullParameter("Creating OMID ad session for SSAI", "message");
                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        object3 = JioAds$LogLevel.NONE;
                        object3 = new Ref$ObjectRef();
                        f5 = new f((h)object2, (Ref$ObjectRef)object3);
                        object3 = "omid_js";
                        object2 = ((h)object2).a;
                        l_0.g((String)object3, (Context)object2, f5);
                    }
                    object2 = ((com.jio.jioads.jioreel.ssai.f)object).h;
                    Intrinsics.checkNotNull(object2);
                    object3 = "omHelper";
                    Intrinsics.checkNotNullParameter(object2, (String)object3);
                    ((com.jio.jioads.jioreel.ssai.f)object).h = object2;
                }
                return;
            }
            case 0: 
        }
        Object object4 = StringCompanionObject.INSTANCE;
        object4 = hv3_0.K(R$string.acc_alert_popup);
        String string2 = hv3_0.K(R$string.what_is_ifsc_code);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        String string3 = xh2_0.a(objectArray, n3, (String)object4, "format(...)");
        object = (ConstraintLayout)((Object)object);
        object.setContentDescription((CharSequence)string3);
        Intrinsics.checkNotNull(object);
        ai0_2.a((View)object);
    }
}

