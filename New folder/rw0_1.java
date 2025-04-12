/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.EMI;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Rw0
 */
public final class rw0_1
implements View.OnClickListener {
    public final /* synthetic */ uw0_1 a;

    public /* synthetic */ rw0_1(uw0_1 uw0_12) {
        this.a = uw0_12;
    }

    public final void onClick(View object) {
        int n3 = 1;
        Object object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n4 = ((uw0_1)object2).f;
        int n7 = -1;
        if (n4 == n7) {
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            n4 = R$string.select_bank;
            object2 = object2.getString(n4);
            Intrinsics.checkNotNullExpressionValue(object2, "getString(...)");
            object3 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_alert_message;
            object3 = hv3_0.K(n4);
            Object[] objectArray = new Object[n3];
            Object var8_9 = null;
            objectArray[0] = object2;
            object = Arrays.copyOf(objectArray, n3);
            object = String.format((String)object3, (Object[])object);
            object3 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            mq0_2.b((String)object2, (String)object);
        } else if (n4 != n7) {
            dv_0 dv_02;
            n4 = 3;
            n7 = 0;
            PriceValidation priceValidation = null;
            object = new EMI(null, null, n4, null);
            object3 = ((uw0_1)object2).g;
            if (object3 != null) {
                object3 = ((PaymentInstrumentInfo)object3).getName();
            } else {
                n4 = 0;
                object3 = null;
            }
            ((EMI)object).setBankName((String)object3);
            object3 = ((uw0_1)object2).g;
            if (object3 != null) {
                object3 = ((PaymentInstrumentInfo)object3).getInstrument_code();
            } else {
                n4 = 0;
                object3 = null;
            }
            ((EMI)object).setCode((String)object3);
            object3 = ((uw0_1)object2).b;
            TenantResponse tenantResponse = object3.n8();
            if (tenantResponse != null && (dv_02 = ((uw0_1)object2).a) != null) {
                oo2_0 oo2_02 = oo2_0.a;
                object2 = ((uw0_1)object2).g;
                if (object2 != null) {
                    priceValidation = ((PaymentInstrumentInfo)object2).getPriceValidation();
                }
                float f5 = object3.D();
                object2 = Float.valueOf(f5);
                oo2_02.getClass();
                object = oo2_0.o((EMI)object, tenantResponse, priceValidation, (Float)object2);
                dv_02.Z3((PayNowRequest)object);
            }
        }
    }
}

