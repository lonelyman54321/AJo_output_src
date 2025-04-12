/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.TextView
 */
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

public final class cu3 {
    public final Context a;
    public PaymentInstrumentType b;
    public final ArrayList c;
    public final ArrayList d;
    public tt3_0 e;
    public op2_2 f;
    public mu1_1 g;
    public co2_0 h;
    public dv_0 i;
    public UPI j;
    public PesdkLoyaltyCardInfoView k;
    public hj_1 l;
    public UpiAppInfo m;
    public final UPI n;
    public TextView o;

    public cu3(Context object) {
        this.a = object;
        this.c = object;
        super();
        this.d = object;
        super(null, null, null, null, null, null, null, null, 255, null);
        this.n = object;
    }

    public final void a(hj_1 hj_12, UpiAppInfo upiAppInfo) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        cu3 cu32 = this;
        hj_1 hj_13 = hj_12;
        Object object4 = upiAppInfo;
        Intrinsics.checkNotNullParameter((Object)hj_12, "requestType");
        Object object5 = hj_1.INTENT_UPI;
        Object object6 = null;
        if (hj_12 == object5) {
            if (upiAppInfo != null) {
                object3 = upiAppInfo.getPackageName();
            } else {
                object2 = 0;
                object3 = null;
            }
            if (object3 != null && (object2 = object3.length()) != 0) {
                if (object4 != null) {
                    object3 = upiAppInfo.getPackageName();
                } else {
                    object2 = 0;
                    object3 = null;
                }
                object = cu32.m;
                if (object != null) {
                    object = ((UpiAppInfo)object).getPackageName();
                } else {
                    n3 = 0;
                    object = null;
                }
                object2 = Intrinsics.areEqual(object3, object);
                if (object2 != 0) {
                    return;
                }
            }
        }
        cu32.l = hj_13;
        if (hj_13 == object5 && (object5 = cu32.m) != null) {
            ((UpiAppInfo)object5).setOfferDetails(null);
            ((UpiAppInfo)object5).setPriceValidation(null);
        }
        if ((object5 = cu32.i) != null) {
            object5.a();
        }
        cu32.m = object4;
        object4 = cu32.f;
        if (object4 != null) {
            object = object5;
            co2_0 co2_02 = null;
            int n4 = 1048575;
            object5 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n4, null);
            object3 = cu32.l;
            if (object3 == null) {
                object2 = -1;
            } else {
                object = cu3$a.$EnumSwitchMapping$0;
                object2 = ((Enum)object3).ordinal();
                object2 = object[object2];
            }
            n3 = 1;
            if (object2 == n3) {
                object3 = cu32.j;
                if (object3 != null) {
                    object3 = ((UPI)object3).getPaymentInstrumentId();
                } else {
                    object2 = 0;
                    object3 = null;
                }
                ((PriceRequest)object5).setPaymentInstrumentId((String)object3);
            }
            if ((object3 = cu32.l) != null) {
                object3 = ((Enum)object3).name();
            } else {
                object2 = 0;
                object3 = null;
            }
            ((PriceRequest)object5).setPaymentInstrument((String)object3);
            object3 = cu32.h;
            if (object3 != null) {
                object3 = object3.j0();
            } else {
                object2 = 0;
                object3 = null;
            }
            object = cu32.h;
            if (object != null) {
                object = object.n8();
            } else {
                n3 = 0;
                object = null;
            }
            co2_02 = cu32.h;
            if (co2_02 != null) {
                object6 = co2_02.H();
            }
            co2_02 = object6;
            object6 = object3;
            object3 = object;
            hj_13 = hj_12;
            object = co2_02;
            ((op2_2)object4).k((PriceRequest)object5, (PaymentInstruments)object6, (TenantResponse)object3, hj_12, (HashSet)((Object)co2_02));
        }
    }

    public final void b(op2_2 op2_22) {
        Object object = this.i;
        if (object != null) {
            object.a();
        }
        if (op2_22 != null) {
            object = this.h;
            HashSet hashSet = null;
            object = object != null ? object.j0() : null;
            Object object2 = this.h;
            object2 = object2 != null ? object2.n8() : null;
            hj_1 hj_12 = hj_1.UPI;
            co2_0 co2_02 = this.h;
            if (co2_02 != null) {
                hashSet = co2_02.H();
            }
            op2_2.d(op2_22, (PaymentInstruments)object, (TenantResponse)object2, hj_12, hashSet);
        }
        this.c();
    }

    public final void c() {
        int n3;
        Object object = this.c.iterator();
        while ((n3 = object.hasNext()) != 0) {
            UpiAppInfo upiAppInfo = (UpiAppInfo)object.next();
            upiAppInfo.setPriceValidation(null);
            upiAppInfo.setOfferDetails(null);
        }
        object = this.k;
        if (object != null) {
            n3 = 1;
            String string2 = "upi";
            ((PesdkLoyaltyCardInfoView)((Object)object)).setData(null, null, n3, string2);
        }
        if ((object = this.e) != null) {
            ((tt3_0)object).f = n3 = -1;
        }
        if (object != null) {
            object.notifyDataSetChanged();
        }
    }

    public final void d(op2_2 object, mu1_1 object2, co2_0 object3, dv_0 object4, PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView, TextView textView) {
        String string2 = "paymentInfoProvider";
        Intrinsics.checkNotNullParameter(object3, string2);
        this.f = object;
        this.g = object2;
        this.h = object3;
        this.i = object4;
        this.o = textView;
        this.j = object2 = this.j;
        this.k = pesdkLoyaltyCardInfoView;
        if (pesdkLoyaltyCardInfoView != null) {
            object2 = "upi";
            object3 = null;
            int n3 = 1;
            pesdkLoyaltyCardInfoView.setData(null, null, n3, (String)object2);
        }
        if ((object2 = this.g) != null && object != null && (object = ((op2_2)object).s) != null) {
            object3 = new bu3_0(this);
            object4 = new cu3$b((bu3_0)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
        }
    }
}

