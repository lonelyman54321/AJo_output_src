/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.Card;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jr2
 */
public final class jr2_2
implements View.OnClickListener {
    public final /* synthetic */ mr2_0 a;
    public final /* synthetic */ Mr2$a b;
    public final /* synthetic */ PaymentInstrumentInfo c;

    public /* synthetic */ jr2_2(mr2_0 mr2_02, Mr2$a a2, PaymentInstrumentInfo paymentInstrumentInfo) {
        this.a = mr2_02;
        this.b = a2;
        this.c = paymentInstrumentInfo;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        jr2_2 jr2_22 = this;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$viewHolder");
        object2.getClass();
        Object object4 = object3.j;
        Object object5 = null;
        if (object4 != null && (object4 = object4.getText()) != null && (object4 = object4.toString()) != null && (n4 = object4.length()) == 0) {
            object3 = object3.k;
            if (object3 != null) {
                n4 = R$string.enter_valid_cvv;
                object4 = hv3_0.K(n4);
                ((TextInputLayout)((Object)object3)).setError((CharSequence)object4);
            }
        } else {
            object4 = object3.k;
            if (object4 != null) {
                object = "";
                object4.setError((CharSequence)object);
            }
            if ((object3 = object3.j) != null) {
                object5 = object3.getText();
            }
            object5 = String.valueOf(object5);
        }
        if (object5 != null && (n3 = ((String)object5).length()) != 0 && (object3 = jr2_22.c) != null) {
            int n7 = 1023;
            object = object4;
            object4 = new Card(null, null, null, null, null, null, null, null, null, false, n7, null);
            object4.setCvv((String)object5);
            object5 = Boolean.TRUE;
            object4.setSaveCard((Boolean)object5);
            object5 = ((PaymentInstrumentInfo)object3).getPaymentInstrumentId();
            object4.setPaymentInstrumentId((String)object5);
            object2 = ((mr2_0)object2).b;
            if (object2 != null) {
                object2.v((Card)object4, (PaymentInstrumentInfo)object3);
            }
        }
    }
}

