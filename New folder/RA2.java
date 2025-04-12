/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class RA2
implements View.OnClickListener {
    public final /* synthetic */ sa2_2 a;
    public final /* synthetic */ CartEntry b;

    public /* synthetic */ RA2(sa2_2 sa2_22, CartEntry cartEntry) {
        this.a = sa2_22;
        this.b = cartEntry;
    }

    /*
     * WARNING - void declaration
     */
    public final void onClick(View view) {
        void var5_8;
        Object object;
        float f5;
        float f6;
        float f7;
        boolean bl2;
        float f8;
        float f11;
        int n3;
        Object object2 = sa2_2.j;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$it");
        object2.getClass();
        Object object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        int bl3 = 32;
        String string2 = null;
        Object object5 = "whats_this_click";
        Object object6 = "Whats this click";
        float f12 = 0.0f;
        Object object7 = null;
        Object object8 = "return order details screen";
        String string3 = null;
        GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object4, "return order details interaction", (String)object5, (String)object6, null, (String)object8, null, bl3, null);
        Serializable serializable = ((CartEntry)object3).getConvenienceFee();
        Intrinsics.checkNotNullExpressionValue(serializable, "getConvenienceFee(...)");
        object4 = ((sa2_2)object2).g;
        boolean bl4 = false;
        if (object4 != null && (object4 = ((CartEntry)object4).getOrderTotalQuantity()) != null) {
            n3 = (Integer)object4;
        } else {
            n3 = 0;
            f11 = 0.0f;
            object4 = null;
        }
        object3 = ((CartEntry)object3).getQuantity();
        Intrinsics.checkNotNullExpressionValue(object3, "getQuantity(...)");
        int n4 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(serializable, "conFee");
        object5 = new r80_0();
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getDelivery();
        f12 = 0.0f;
        object7 = null;
        if (object6 != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getAmount();
            object6 = Float.valueOf(f8);
        } else {
            bl2 = false;
            object6 = null;
            f8 = 0.0f;
        }
        object8 = String.valueOf(object6);
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getDelivery();
        if (object6 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
        }
        if ((object6 = ((ConvenienceFeePriceSplitUp)serializable).getRVP()) != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getAmount();
            object6 = Float.valueOf(f8);
        } else {
            bl2 = false;
            object6 = null;
            f8 = 0.0f;
        }
        string3 = String.valueOf(object6);
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getRVP();
        if (object6 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
        }
        if ((object6 = ((ConvenienceFeePriceSplitUp)serializable).getCOD()) != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getAmount();
            object6 = Float.valueOf(f8);
        } else {
            bl2 = false;
            object6 = null;
            f8 = 0.0f;
        }
        string2 = String.valueOf(object6);
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getCOD();
        if (object6 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
        }
        if ((object6 = ((ConvenienceFeePriceSplitUp)serializable).getTotal()) != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object6).getAmount();
        }
        if ((object6 = ((ConvenienceFeePriceSplitUp)serializable).getTotal()) != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
        }
        if ((object6 = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery()) != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getAmount();
            object6 = Float.valueOf(f8);
        } else {
            bl2 = false;
            object6 = null;
            f8 = 0.0f;
        }
        String string4 = String.valueOf(object6);
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery();
        if (object6 != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
            object6 = Float.valueOf(f8);
        } else {
            bl2 = false;
            object6 = null;
            f8 = 0.0f;
        }
        object6 = String.valueOf(object6);
        Object object9 = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery();
        if (object9 != null && (object9 = ((ConvenienceFeePriceSplitUp$AmountData)object9).isFeeCharged()) != null) {
            boolean bl5 = (Boolean)object9;
        } else {
            boolean bl6 = false;
            object9 = null;
        }
        Object object10 = ((ConvenienceFeePriceSplitUp)serializable).getTotal();
        if (object10 != null) {
            f7 = ((ConvenienceFeePriceSplitUp$AmountData)object10).getNetAmount();
            object10 = Float.valueOf(f7);
        } else {
            object10 = null;
            f7 = 0.0f;
        }
        Intrinsics.checkNotNull(object10);
        f7 = ((Float)object10).floatValue();
        f11 = n3;
        f7 /= f11;
        float f14 = n4;
        String string5 = String.valueOf(f7 *= f14);
        object10 = ((ConvenienceFeePriceSplitUp)serializable).getDelivery();
        if (object10 != null) {
            f7 = ((ConvenienceFeePriceSplitUp$AmountData)object10).getNetAmount();
            object10 = Float.valueOf(f7);
        } else {
            object10 = null;
            f7 = 0.0f;
        }
        Intrinsics.checkNotNull(object10);
        f7 = ((Float)object10).floatValue() / f11 * f14;
        object10 = String.valueOf(f7);
        Object object11 = ((ConvenienceFeePriceSplitUp)serializable).getCOD();
        if (object11 != null) {
            f6 = ((ConvenienceFeePriceSplitUp$AmountData)object11).getNetAmount();
            object11 = Float.valueOf(f6);
        } else {
            object11 = null;
            f6 = 0.0f;
        }
        Intrinsics.checkNotNull(object11);
        f6 = ((Float)object11).floatValue() / f11 * f14;
        object11 = String.valueOf(f6);
        Object object12 = ((ConvenienceFeePriceSplitUp)serializable).getRVP();
        if (object12 != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)object12).getNetAmount();
            object12 = Float.valueOf(f5);
        } else {
            object12 = null;
            f5 = 0.0f;
        }
        Intrinsics.checkNotNull(object12);
        f5 = ((Float)object12).floatValue() / f11 * f14;
        object12 = String.valueOf(f5);
        ConvenienceFeePriceSplitUp$AmountData convenienceFeePriceSplitUp$AmountData = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery();
        if (convenienceFeePriceSplitUp$AmountData != null) {
            f12 = convenienceFeePriceSplitUp$AmountData.getNetAmount();
            object7 = Float.valueOf(f12);
        }
        if (object7 != null) {
            object6 = ((ConvenienceFeePriceSplitUp)serializable).getPriorityDelivery();
            if (object6 != null) {
                f8 = ((ConvenienceFeePriceSplitUp$AmountData)object6).getNetAmount();
            } else {
                bl2 = false;
                f8 = 0.0f;
                object6 = null;
            }
            f8 = f8 / f11 * f14;
            object = object3 = String.valueOf(f8);
        } else {
            object = object6;
        }
        cp_1.Companion.getClass();
        object3 = new Object();
        ((m80_0)object3).c();
        object4 = 0;
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getDelivery();
        if (object6 != null && (object6 = ((ConvenienceFeePriceSplitUp$AmountData)object6).isFeeCharged()) != null) {
            bl2 = (Boolean)object6;
        } else {
            bl2 = false;
            f8 = 0.0f;
            object6 = null;
        }
        Boolean bl7 = bl2;
        object6 = ((ConvenienceFeePriceSplitUp)serializable).getRVP();
        if (object6 != null && (object6 = ((ConvenienceFeePriceSplitUp$AmountData)object6).isFeeCharged()) != null) {
            bl2 = (Boolean)object6;
        } else {
            bl2 = false;
            f8 = 0.0f;
            object6 = null;
        }
        Boolean bl8 = bl2;
        serializable = ((ConvenienceFeePriceSplitUp)serializable).getCOD();
        if (serializable != null && (serializable = ((ConvenienceFeePriceSplitUp$AmountData)serializable).isFeeCharged()) != null) {
            bl4 = (Boolean)serializable;
        }
        Boolean bl9 = bl4;
        Boolean bl10 = (boolean)var5_8;
        Boolean bl11 = Boolean.FALSE;
        boolean bl12 = true;
        object6 = object5;
        object7 = object8;
        object8 = object10;
        object9 = object12;
        object10 = object11;
        object11 = object3;
        object12 = object4;
        ((r80_0)object5).Oa((String)object7, (String)object8, string3, (String)object9, string2, (String)object10, string5, (m80_0)object3, (Integer)object4, bl12, bl7, bl8, bl9, string4, (String)object, bl10, bl11);
        object2 = ((Fragment)object2).getActivity();
        if (object2 != null && (object2 = ((FragmentActivity)object2).getSupportFragmentManager()) != null) {
            r80_0.Companion.getClass();
            object3 = "ConvenienceFeeInfoBottomSheet";
            ((DialogFragment)object5).show((FragmentManager)object2, (String)object3);
        }
    }
}

