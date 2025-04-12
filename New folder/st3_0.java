/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.UPI;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from St3
 */
public final class st3_0
implements View.OnClickListener {
    public final /* synthetic */ tt3_0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ st3_0(tt3_0 tt3_02, int n3) {
        this.a = tt3_02;
        this.b = n3;
    }

    public final void onClick(View object) {
        int n3;
        Object object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = cp_1.Companion;
        object3.getClass();
        int n4 = cp$a.s();
        int n7 = this.b;
        if (n4 != 0 && ((object3 = ((UpiAppInfo)((tt3_0)object).a.get(n7)).getPackageName()) == null || (n4 = ((String)object3).length()) == 0) && (object2 = ((UpiAppInfo)(object3 = ((tt3_0)object).a).get(n7)).getName()) != null && (n3 = ((String)object2).length()) != 0) {
            uy2_1.a = ((UpiAppInfo)object3.get(n7)).getPaymentInstrumentId();
            int n8 = 255;
            Object object4 = object2;
            object2 = new UPI(null, null, null, null, null, null, null, null, n8, null);
            object4 = ((UpiAppInfo)object3.get(n7)).getName();
            ((UPI)object2).setVpa((String)object4);
            object4 = Boolean.TRUE;
            ((UPI)object2).setSaveUPI((Boolean)object4);
            object3 = ((UpiAppInfo)object3.get(n7)).getPaymentInstrumentId();
            ((UPI)object2).setPaymentInstrumentId((String)object3);
            object3 = ((tt3_0)object).g;
            n7 = 0;
            PriceValidation priceValidation = null;
            object4 = object3 != null && (object4 = ((cu3)object3).n) != null ? ((UPI)object4).getOfferDetails() : null;
            ((UPI)object2).setOfferDetails((OfferDetails)object4);
            if (object3 != null && (object3 = ((cu3)object3).n) != null) {
                priceValidation = ((UPI)object3).getPriceValidation();
            }
            ((UPI)object2).setPriceValidation(priceValidation);
            object = ((tt3_0)object).b;
            if (object != null) {
                object.g9((UPI)object2);
            }
        } else {
            object3 = ((tt3_0)object).b;
            if (object3 != null) {
                object = (UpiAppInfo)((tt3_0)object).a.get(n7);
                object3.y8((UpiAppInfo)object);
            }
        }
    }
}

