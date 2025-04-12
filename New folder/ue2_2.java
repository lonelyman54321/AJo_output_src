/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnControllerActivity;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ue2
 */
public final class ue2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qz1_2 c;
    public final /* synthetic */ ConvenienceFeePriceSplitUp d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public ue2_2(Activity activity, qz1_2 qz1_22, ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp, int n3, int n4, f80_0 f80_02) {
        this.a = activity;
        this.b = true;
        this.c = qz1_22;
        this.d = convenienceFeePriceSplitUp;
        this.e = n3;
        this.f = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.c;
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp = this.d;
        Activity activity = this.a;
        int n3 = this.e;
        int n4 = this.f;
        object = new ue2_2(activity, qz1_22, convenienceFeePriceSplitUp, n3, n4, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ue2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ue2_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        float f5;
        boolean bl2;
        float f6;
        boolean bl3;
        float f7;
        Object object2;
        Object object3;
        ue2_2 ue2_22 = this;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Activity activity = this.a;
        if (activity == null) return Unit.a;
        boolean bl4 = this.b;
        if (!bl4) {
            object3 = "return order details interaction";
            object2 = "return order details screen";
        } else {
            object3 = "order details interaction";
            object2 = "order details screen";
        }
        Object object4 = object3;
        Object object5 = object2;
        Object object6 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        int n3 = 32;
        float f8 = 4.5E-44f;
        boolean bl5 = false;
        Object object7 = null;
        String string2 = "whats_this_click";
        String string3 = "Whats this click";
        int n4 = 0;
        float f11 = 0.0f;
        Object object8 = null;
        boolean bl6 = false;
        Object object9 = null;
        GTMEvents.gtmEventsToGaWithCategory$default((GTMEvents)object6, (String)object4, string2, string3, null, (String)object2, null, n3, null);
        object3 = ue2_22.c;
        object3.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        object2 = ue2_22.d;
        Intrinsics.checkNotNullParameter(object2, "conFee");
        object6 = new r80_0();
        object4 = ((ConvenienceFeePriceSplitUp)object2).getDelivery();
        if (object4 != null) {
            f7 = ((ConvenienceFeePriceSplitUp$AmountData)object4).getAmount();
            object4 = Float.valueOf(f7);
        } else {
            bl3 = false;
            f7 = 0.0f;
            object4 = null;
        }
        string3 = String.valueOf(object4);
        object4 = ((ConvenienceFeePriceSplitUp)object2).getDelivery();
        if (object4 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object4).getNetAmount();
        }
        if ((object4 = ((ConvenienceFeePriceSplitUp)object2).getDelivery()) != null && (object4 = ((ConvenienceFeePriceSplitUp$AmountData)object4).isFeeCharged()) != null) {
            bl3 = (Boolean)object4;
        } else {
            bl3 = false;
            f7 = 0.0f;
            object4 = null;
        }
        object5 = ((ConvenienceFeePriceSplitUp)object2).getRVP();
        if (object5 != null) {
            float f12 = ((ConvenienceFeePriceSplitUp$AmountData)object5).getAmount();
            object5 = Float.valueOf(f12);
        } else {
            float f14 = 0.0f;
            object5 = null;
        }
        object5 = String.valueOf(object5);
        object9 = ((ConvenienceFeePriceSplitUp)object2).getRVP();
        if (object9 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object9).getNetAmount();
        }
        if ((object9 = ((ConvenienceFeePriceSplitUp)object2).getRVP()) != null && (object9 = ((ConvenienceFeePriceSplitUp$AmountData)object9).isFeeCharged()) != null) {
            bl6 = (Boolean)object9;
        } else {
            bl6 = false;
            object9 = null;
        }
        Object object10 = ((ConvenienceFeePriceSplitUp)object2).getCOD();
        if (object10 != null) {
            f8 = ((ConvenienceFeePriceSplitUp$AmountData)object10).getAmount();
            object10 = Float.valueOf(f8);
        } else {
            n3 = 0;
            f8 = 0.0f;
            object10 = null;
        }
        object10 = String.valueOf(object10);
        object7 = ((ConvenienceFeePriceSplitUp)object2).getCOD();
        if (object7 != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)object7).getNetAmount();
        }
        if ((object7 = ((ConvenienceFeePriceSplitUp)object2).getCOD()) != null && (object7 = ((ConvenienceFeePriceSplitUp$AmountData)object7).isFeeCharged()) != null) {
            bl5 = (Boolean)object7;
        } else {
            bl5 = false;
            object7 = null;
        }
        Object object11 = ((ConvenienceFeePriceSplitUp)object2).getPriorityDelivery();
        if (object11 != null) {
            f6 = ((ConvenienceFeePriceSplitUp$AmountData)object11).getAmount();
            object11 = Float.valueOf(f6);
        } else {
            f6 = 0.0f;
            object11 = null;
        }
        String string4 = String.valueOf(object11);
        object11 = ((ConvenienceFeePriceSplitUp)object2).getPriorityDelivery();
        if (object11 != null) {
            f6 = ((ConvenienceFeePriceSplitUp$AmountData)object11).getNetAmount();
            object11 = Float.valueOf(f6);
        } else {
            f6 = 0.0f;
            object11 = null;
        }
        object11 = String.valueOf(object11);
        Serializable serializable = ((ConvenienceFeePriceSplitUp)object2).getPriorityDelivery();
        boolean bl7 = serializable != null && (serializable = ((ConvenienceFeePriceSplitUp$AmountData)serializable).isFeeCharged()) != null ? (bl2 = ((Boolean)serializable).booleanValue()) : false;
        serializable = ((ConvenienceFeePriceSplitUp)object2).getTotal();
        if (serializable != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)serializable).getAmount();
        }
        if ((serializable = ((ConvenienceFeePriceSplitUp)object2).getTotal()) != null) {
            ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
        }
        if ((serializable = ((ConvenienceFeePriceSplitUp)object2).getTotal()) != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
            serializable = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        f5 = ((Float)serializable).floatValue();
        int n7 = ue2_22.e;
        float f15 = n7;
        f5 /= f15;
        n4 = ue2_22.f;
        f11 = n4;
        Object object12 = String.valueOf(f5 *= f11);
        serializable = ((ConvenienceFeePriceSplitUp)object2).getDelivery();
        if (serializable != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
            serializable = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        f5 = ((Float)serializable).floatValue() / f15 * f11;
        String string5 = String.valueOf(f5);
        serializable = ((ConvenienceFeePriceSplitUp)object2).getCOD();
        if (serializable != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
            serializable = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        f5 = ((Float)serializable).floatValue() / f15 * f11;
        String string6 = String.valueOf(f5);
        serializable = ((ConvenienceFeePriceSplitUp)object2).getRVP();
        if (serializable != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
            serializable = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            serializable = null;
        }
        Intrinsics.checkNotNull(serializable);
        f5 = ((Float)serializable).floatValue() / f15 * f11;
        String string7 = String.valueOf(f5);
        serializable = ((ConvenienceFeePriceSplitUp)object2).getPriorityDelivery();
        if (serializable != null) {
            f5 = ((ConvenienceFeePriceSplitUp$AmountData)serializable).getNetAmount();
            serializable = Float.valueOf(f5);
        } else {
            bl2 = false;
            f5 = 0.0f;
            serializable = null;
        }
        if (serializable != null) {
            float f16;
            if ((object2 = ((ConvenienceFeePriceSplitUp)object2).getPriorityDelivery()) != null) {
                f16 = ((ConvenienceFeePriceSplitUp$AmountData)object2).getNetAmount();
            } else {
                f16 = 0.0f;
                object2 = null;
            }
            f16 = f16 / f15 * f11;
            object2 = String.valueOf(f16);
        } else {
            object2 = object11;
        }
        n7 = 0;
        f15 = 0.0f;
        string2 = null;
        serializable = Integer.valueOf(0);
        Boolean bl8 = bl3;
        Boolean bl9 = bl6;
        Boolean bl10 = bl5;
        Boolean bl11 = bl7;
        Boolean bl12 = Boolean.FALSE;
        object11 = ((qz1_2)object3).O;
        bl7 = true;
        object4 = object6;
        string2 = string3;
        string3 = string5;
        object8 = object5;
        object5 = string7;
        object9 = object10;
        object10 = string6;
        object7 = object12;
        object12 = object2;
        ((r80_0)object6).Oa(string2, string5, (String)object8, string7, (String)object9, string6, (String)object7, (m80_0)object11, (Integer)serializable, bl7, bl8, bl9, bl10, string4, (String)object2, bl11, bl12);
        bl4 = activity instanceof AjioHomeActivity;
        object2 = "ConvenienceFeeInfoBottomSheet";
        if (!bl4) {
            bl4 = activity instanceof ExchangeReturnControllerActivity;
            if (!bl4) return Unit.a;
            FragmentManager fragmentManager = ((ExchangeReturnControllerActivity)activity).getSupportFragmentManager();
            object3 = r80_0.Companion;
            object3.getClass();
            ((DialogFragment)object6).show(fragmentManager, (String)object2);
            return Unit.a;
        }
        FragmentManager fragmentManager = ((AjioHomeActivity)activity).getSupportFragmentManager();
        object3 = r80_0.Companion;
        object3.getClass();
        ((DialogFragment)object6).show(fragmentManager, (String)object2);
        return Unit.a;
    }
}

