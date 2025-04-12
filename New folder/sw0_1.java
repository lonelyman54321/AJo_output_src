/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.ToggleButton
 */
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ToggleButton;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Payment.Error;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sw0
 */
public final class sw0_1
implements Function1 {
    public final /* synthetic */ uw0_1 a;
    public final /* synthetic */ op2_2 b;

    public /* synthetic */ sw0_1(uw0_1 uw0_12, op2_2 op2_22) {
        this.a = uw0_12;
        this.b = op2_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        float f5;
        boolean bl2;
        Object object2;
        object = (rz2_0)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNull(object);
        object3.getClass();
        Object object4 = ((rz2_0)object).a;
        Object object5 = hj_1.EMI;
        if (object4 != object5) return Unit.a;
        object = ((rz2_0)object).b;
        int n3 = ((DataCallback)object).getStatus();
        int n4 = 1;
        dv_0 dv_02 = ((uw0_1)object3).a;
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
            f5 = 0.0f;
        }
        op2_2 op2_22 = this.b;
        co2_0 co2_02 = ((uw0_1)object3).b;
        if (object2 != null) {
            object2 = ((PriceValidation)object).getError();
            if (object2 != null) {
                object2 = ((Error)object2).getCode();
            } else {
                bl2 = false;
                object2 = null;
                f5 = 0.0f;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (!bl2) {
                if (op2_22 != null) {
                    object3 = ((PriceValidation)object).getError();
                    object4 = co2_02.n8();
                    f5 = co2_02.D();
                    op2_22.b((Error)object3, (TenantResponse)object4, f5);
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
        if (object5 != null && (object5 = ((uw0_1)object3).g) != null) {
            object5 = ((PriceValidation)object).getPriceSplitup();
            if (object5 != null) {
                object5 = ((PriceSplitUp)object5).getOfferDetails();
            } else {
                n4 = 0;
                object5 = null;
            }
            if (object5 != null && (object5 = ((uw0_1)object3).g) != null) {
                object2 = ((PriceValidation)object).getPriceSplitup();
                if (object2 != null) {
                    object4 = ((PriceSplitUp)object2).getOfferDetails();
                }
                ((PaymentInstrumentInfo)object5).setOfferDetails((OfferDetails)object4);
            }
            if ((object4 = ((uw0_1)object3).g) != null) {
                ((PaymentInstrumentInfo)object4).setPriceValidation((PriceValidation)object);
            }
            if (dv_02 != null) {
                object4 = Boolean.TRUE;
                dv_02.Ka((PriceValidation)object, (Boolean)object4);
            }
            object4 = ((uw0_1)object3).d;
            ((uw0_1)object3).d((List)object4);
            object = ((PriceValidation)object).isEmiAvailable();
            object4 = Boolean.TRUE;
            boolean bl3 = Intrinsics.areEqual(object, object4);
            if (!bl3) {
                object = co2_02.n8();
                object4 = ((uw0_1)object3).n;
                ((uw0_1)object3).b((ToggleButton)object4, (TenantResponse)object, op2_22);
            }
        }
        if (dv_02 == null) return Unit.a;
        dv_02.hideProgressView();
        return Unit.a;
    }
}

