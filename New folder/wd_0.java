/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.home.eosspromotion.view.AvailableCouponsComponentView;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wd
 */
public final class wd_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ex1_0 ex1_02 = (ex1_0)this.b;
                Intrinsics.checkNotNullParameter(ex1_02, "this$0");
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog)this.c;
                Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dodTimesUpDialog");
                ex1_02.sb(false);
                bottomSheetDialog.dismiss();
                return;
            }
            case 1: {
                Object object = (jt_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                CouponEntity couponEntity = (CouponEntity)this.c;
                Object object2 = "$entity";
                Intrinsics.checkNotNullParameter(couponEntity, (String)object2);
                object = (AvailableCouponsComponentView)((jt_0)object).b;
                object.getClass();
                boolean bl2 = couponEntity.isSelected();
                if (bl2) {
                    object2 = ((AvailableCouponsComponentView)object).b;
                    object2.T3(couponEntity);
                } else {
                    object2 = AnalyticsManager.getInstance().getGtmEvents();
                    String string2 = couponEntity.getCode();
                    String string3 = AnalyticsManager.getInstance().getGtmEvents().getScreenName();
                    String string4 = "Coupon Selected";
                    ((GTMEvents)object2).pushButtonTapEvent(string4, string2, string3);
                    object2 = ((AvailableCouponsComponentView)object).b;
                    object2.w3(couponEntity);
                }
                ((AvailableCouponsComponentView)object).d.notifyDataSetChanged();
                ((AvailableCouponsComponentView)object).c.invalidate();
                return;
            }
            case 0: 
        }
        Object object = (ProductPromotion)this.b;
        Intrinsics.checkNotNullParameter(object, "$displayCoupon");
        Kd$d kd$d = (Kd$d)this.c;
        Intrinsics.checkNotNullParameter(kd$d, "this$0");
        object = ((ProductPromotion)object).getTermsLink();
        Intrinsics.checkNotNull(object);
        Object object3 = "\\|";
        object = fT1.a((String)object3, (String)object);
        int n4 = object.size();
        int n7 = 1;
        if (n4 > n7) {
            object3 = kd$d.b;
            object = (String)object.get(n7);
            object3.V3((String)object);
            Bundle bundle = new Bundle();
            NewCustomEventsRevamp newCustomEventsRevamp = kd$d.e;
            object = newCustomEventsRevamp.getPRODUCT_ID();
            object3 = kd$d.c;
            String string5 = object3.l6();
            bundle.putString((String)object, string5);
            object = newCustomEventsRevamp.getPRODUCT_NAME();
            object3 = object3.x5();
            if (object3 != null) {
                object3 = ((Product)object3).getName();
            } else {
                n4 = 0;
                object3 = null;
            }
            bundle.putString((String)object, (String)object3);
            string5 = newCustomEventsRevamp.getEC_PRODUCT_DETAILS_INTERACTION();
            object = kd$d.f;
            String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
            String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
            String string8 = "coupon mini card -  T&C click";
            String string9 = "";
            String string10 = "product_details_interactions";
            String string11 = "pdp screen";
            String string12 = "pdp screen";
            int n8 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string8, string9, string10, string11, string12, string6, bundle, string7, false, null, n8, null);
        }
    }
}

