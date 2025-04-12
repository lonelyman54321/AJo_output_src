/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SD0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ SD0(int n3, Object object, Object object2) {
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
                ((StringBuilder)object2).append(" Callback onAdMediaCollapse");
                Intrinsics.checkNotNullParameter(((StringBuilder)object2).toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((JioAdView)object).getMAdState();
                object3 = JioAdView$AdState.DESTROYED;
                if (object2 != object3 && (object2 = ((JioAdView)object).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    ((JioAdListener)object2).onAdMediaCollapse((JioAdView)object);
                }
                return;
            }
            case 0: 
        }
        n3 = ExchangeReturnVerifyActivity.Y0;
        object3 = (ExchangeReturnVerifyActivity)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((ExchangeReturnVerifyActivity)object3).F0;
        if (object2 != null) {
            Object object4;
            Object object5;
            object = (CartEntry)object;
            Intrinsics.checkNotNull(object);
            object3 = new StringBuilder();
            if (object != null && (object5 = ((CartEntry)object).getImageInfoList()) != null) {
                boolean bl2;
                object5 = object5.iterator();
                while (bl2 = object5.hasNext()) {
                    object4 = (ImageFileInfo)object5.next();
                    if (object4 == null || (object4 = ((ImageFileInfo)object4).getImageName()) == null) {
                        object4 = "empty";
                    }
                    String string3 = "| ";
                    object4 = ((String)object4).concat(string3);
                    ((StringBuilder)object3).append((String)object4);
                }
            }
            object3 = ((StringBuilder)object3).toString();
            Intrinsics.checkNotNullExpressionValue(object3, "toString(...)");
            object5 = new Bundle();
            object = ((CartEntry)object).getOrderId();
            if (object == null) {
                object = "";
            }
            object5.putString("order_id", (String)object);
            object = Unit.a;
            object = "return request created";
            object4 = "request response";
            ((db2_1)object2).d((String)object, (String)object4, (Bundle)object5, (String)object3);
        }
    }
}

