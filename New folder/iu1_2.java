/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IU1
 */
public final class iu1_2
implements Function1 {
    public final /* synthetic */ ku1_2 a;
    public final /* synthetic */ op2_2 b;

    public /* synthetic */ iu1_2(ku1_2 ku1_22, op2_2 op2_22) {
        this.a = ku1_22;
        this.b = op2_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        boolean bl2;
        Object object2;
        object = (rz2_0)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNull(object);
        object3.getClass();
        Object object4 = ((rz2_0)object).a;
        Object object5 = hj_1.NET_BANKING;
        if (object4 != object5) return Unit.a;
        object = ((rz2_0)object).b;
        int n3 = ((DataCallback)object).getStatus();
        int n4 = 1;
        dv_0 dv_02 = ((ku1_2)object3).b;
        if (n3 != 0) {
            int n7 = ((DataCallback)object).getStatus();
            if (n7 != n4) return Unit.a;
            if (dv_02 == null) return Unit.a;
            dv_02.hideProgressView();
            return Unit.a;
        }
        object = (PriceValidation)((DataCallback)object).getData();
        n3 = 0;
        object4 = null;
        if (object != null) {
            object2 = ((PriceValidation)object).getError();
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            object2 = ((PriceValidation)object).getError();
            if (object2 != null) {
                object2 = ((Error)object2).getCode();
            } else {
                bl2 = false;
                object2 = null;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                object4 = this.b;
                if (object4 != null) {
                    object2 = ((PriceValidation)object).getError();
                    object3 = ((ku1_2)object3).d;
                    TenantResponse tenantResponse = object3.n8();
                    float f5 = object3.D();
                    ((op2_2)object4).b((Error)object2, tenantResponse, f5);
                }
                object3 = new Intent();
                object4 = new Bundle();
                object = JsonUtils.toJson(((PriceValidation)object).getError());
                object2 = "transactionresponse";
                object4.putString((String)object2, (String)object);
                object = "backendCartError";
                object4.putBoolean((String)object, n4 != 0);
                object3.putExtras((Bundle)object4);
                if (dv_02 == null) return Unit.a;
                dv_02.M5((Intent)object3);
                return Unit.a;
            }
        }
        if (object != null) {
            object5 = ((PriceValidation)object).getPriceSplitup();
        } else {
            n4 = 0;
            object5 = null;
        }
        if (object5 != null && (object5 = ((ku1_2)object3).k) != null) {
            object5 = ((PriceValidation)object).getPriceSplitup();
            if (object5 != null) {
                object5 = ((PriceSplitUp)object5).getOfferDetails();
            } else {
                n4 = 0;
                object5 = null;
            }
            if (object5 != null && (object5 = ((ku1_2)object3).k) != null) {
                object2 = ((PriceValidation)object).getPriceSplitup();
                if (object2 != null) {
                    object4 = ((PriceSplitUp)object2).getOfferDetails();
                }
                ((PaymentInstrumentInfo)object5).setOfferDetails((OfferDetails)object4);
            }
            if ((object4 = ((ku1_2)object3).k) != null) {
                ((PaymentInstrumentInfo)object4).setPriceValidation((PriceValidation)object);
            }
            if (dv_02 != null) {
                object4 = Boolean.TRUE;
                dv_02.Ka((PriceValidation)object, (Boolean)object4);
            }
            object = ((ku1_2)object3).h;
            object4 = ((ku1_2)object3).l;
            ((ku1_2)object3).b((List)object, (PaymentInstrumentType)object4);
        }
        if (dv_02 == null) return Unit.a;
        dv_02.hideProgressView();
        return Unit.a;
    }
}

