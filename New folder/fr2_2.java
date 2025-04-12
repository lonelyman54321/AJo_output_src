/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Parcelable;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.AmountDataKt;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Payment.FEPayment;
import com.ril.ajio.services.data.Payment.FEResult;
import com.ril.ajio.services.data.Payment.FraudEngineResponse;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fr2
 */
public final class fr2_2
implements View.OnClickListener {
    public final /* synthetic */ ir2_2 a;

    public /* synthetic */ fr2_2(ir2_2 ir2_22) {
        this.a = ir2_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object = ((ir2_2)object3).c.c2();
        boolean bl4 = false;
        Object object4 = null;
        if (object == null || (object = ((PriceValidation)object).getPriceSplitup()) == null || (object = ((PriceSplitUp)object).getConvenienceFee()) == null) {
            object = null;
        }
        Object object5 = ((ir2_2)object3).c;
        Parcelable parcelable = object5 != null ? object5.n5() : null;
        if (object != null) {
            object2 = ((ConvenienceFeePriceSplitUp)object).getCOD();
        } else {
            bl3 = false;
            object2 = null;
        }
        if (object2 != null) {
            if (object != null && (object2 = ((ConvenienceFeePriceSplitUp)object).getCOD()) != null) {
                object2 = ((ConvenienceFeePriceSplitUp$AmountData)object2).isFeeCharged();
            } else {
                bl3 = false;
                object2 = null;
            }
            if (object2 == null) {
                if (object5 != null && (object5 = object5.n8()) != null && (object5 = ((TenantResponse)object5).getFraudEngineResponseDetails()) != null && (object5 = ((FraudEngineResponse)object5).getResult()) != null && (object5 = ((FEResult)object5).getCOHORT_COD_FEE()) != null) {
                    bl2 = Intrinsics.areEqual(object5 = ((FEPayment)object5).getAction(), object2 = "BAD_COHORT_COD_FEE");
                    if (bl2 && (object5 = ((ConvenienceFeePriceSplitUp)object).getCOD()) != null) {
                        object2 = Boolean.TRUE;
                        ((ConvenienceFeePriceSplitUp$AmountData)object5).setFeeCharged((Boolean)object2);
                    }
                } else {
                    object5 = ((ConvenienceFeePriceSplitUp)object).getCOD();
                    if (object5 != null) {
                        if (parcelable != null && (object2 = parcelable.getCOD()) != null) {
                            object2 = ((AmountData)object2).getCohort();
                        } else {
                            bl3 = false;
                            object2 = null;
                        }
                        bl3 = AmountDataKt.isFeeCharged((String)object2);
                        object2 = bl3;
                        ((ConvenienceFeePriceSplitUp$AmountData)object5).setFeeCharged((Boolean)object2);
                    }
                }
            }
        }
        if (object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getRVP()) != null) {
            object5 = ((ConvenienceFeePriceSplitUp$AmountData)object5).isFeeCharged();
        } else {
            bl2 = false;
            object5 = null;
        }
        if (object5 == null && object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getRVP()) != null) {
            if (parcelable != null && (object2 = parcelable.getRVP()) != null) {
                object2 = ((AmountData)object2).getCohort();
            } else {
                bl3 = false;
                object2 = null;
            }
            bl3 = AmountDataKt.isFeeCharged((String)object2);
            object2 = bl3;
            ((ConvenienceFeePriceSplitUp$AmountData)object5).setFeeCharged((Boolean)object2);
        }
        if (object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getDelivery()) != null) {
            object5 = ((ConvenienceFeePriceSplitUp$AmountData)object5).isFeeCharged();
        } else {
            bl2 = false;
            object5 = null;
        }
        if (object5 == null && object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getDelivery()) != null) {
            if (parcelable != null && (object2 = parcelable.getDelivery()) != null) {
                object2 = ((AmountData)object2).getCohort();
            } else {
                bl3 = false;
                object2 = null;
            }
            bl3 = AmountDataKt.isFeeCharged((String)object2);
            object2 = bl3;
            ((ConvenienceFeePriceSplitUp$AmountData)object5).setFeeCharged((Boolean)object2);
        }
        if (object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getTotal()) != null) {
            object5 = ((ConvenienceFeePriceSplitUp$AmountData)object5).isFeeCharged();
        } else {
            bl2 = false;
            object5 = null;
        }
        if (object5 == null && object != null && (object5 = ((ConvenienceFeePriceSplitUp)object).getTotal()) != null) {
            if (parcelable != null && (parcelable = parcelable.getTotal()) != null) {
                object4 = parcelable.getCohort();
            }
            bl4 = AmountDataKt.isFeeCharged(object4);
            object4 = bl4;
            ((ConvenienceFeePriceSplitUp$AmountData)object5).setFeeCharged((Boolean)object4);
        }
        if ((object3 = ((ir2_2)object3).d) != null) {
            object3.I9((ConvenienceFeePriceSplitUp)object);
        }
        GTMEvents.gtmEventsToGaWithCategory$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "COD convenience fee screen interactions", "whats_this_click", "Whats this click", null, "COD convenience fee screen", null, 32, null);
    }
}

