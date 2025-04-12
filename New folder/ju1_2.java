/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.NetBanking;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from JU1
 */
public final class ju1_2
implements View.OnClickListener {
    public final /* synthetic */ ku1_2 a;

    public /* synthetic */ ju1_2(ku1_2 ku1_22) {
        this.a = ku1_22;
    }

    public final void onClick(View object) {
        int n3 = 1;
        float f5 = Float.MIN_VALUE;
        Object object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n4 = ((ku1_2)object2).j;
        int n7 = -1;
        if (n4 == n7) {
            object2 = StringCompanionObject.INSTANCE;
            int n8 = R$string.acc_alert_message;
            object2 = hv3_0.K(n8);
            object3 = "Please select bank";
            Object[] objectArray = new Object[n3];
            boolean bl2 = false;
            Object var11_14 = null;
            objectArray[0] = object3;
            object = Arrays.copyOf(objectArray, n3);
            object = String.format((String)object2, (Object[])object);
            object2 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            mq0_2.b((String)object3, (String)object);
        } else if (n4 != n7) {
            dv_0 dv_02;
            int n10;
            n7 = 0;
            PriceValidation priceValidation = null;
            object3 = new NetBanking(null, n3, null);
            object = ((ku1_2)object2).h;
            if (object != null && (object = (PaymentInstrumentInfo)object.get(n10 = ((ku1_2)object2).j)) != null) {
                object = ((PaymentInstrumentInfo)object).getCode();
            } else {
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            ((NetBanking)object3).setCode((String)object);
            object = ((ku1_2)object2).d;
            TenantResponse tenantResponse = object.n8();
            if (tenantResponse != null && (dv_02 = ((ku1_2)object2).b) != null) {
                int n14;
                oo2_0 oo2_02 = oo2_0.a;
                List list = ((ku1_2)object2).h;
                if (list != null && (object2 = (PaymentInstrumentInfo)list.get(n14 = ((ku1_2)object2).j)) != null) {
                    priceValidation = ((PaymentInstrumentInfo)object2).getPriceValidation();
                }
                f5 = object.D();
                object = Float.valueOf(f5);
                oo2_02.getClass();
                object = oo2_0.p((NetBanking)object3, tenantResponse, priceValidation, (Float)object);
                dv_02.J1((PayNowRequest)object);
            }
        }
    }
}

