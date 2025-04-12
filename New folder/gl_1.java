/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.PaymentInstrumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from GL
 */
public final class gl_1
implements View.OnClickListener {
    public final /* synthetic */ il_2 a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ PaymentInstrumentType c;

    public /* synthetic */ gl_1(il_2 il_22, TextView textView, PaymentInstrumentType paymentInstrumentType) {
        this.a = il_22;
        this.b = textView;
        this.c = paymentInstrumentType;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = 0;
        object = null;
        int n7 = 1;
        il_2 il_22 = this.a;
        Intrinsics.checkNotNullParameter(il_22, "this$0");
        TextView textView = this.b;
        Intrinsics.checkNotNullParameter(textView, "$more");
        Object object2 = il_22.h;
        mr2_0 mr2_02 = il_22.i;
        Object[] objectArray = this.c;
        if (object2 != null && (n3 = ((qq2_2)object2).f) == n7) {
            if (objectArray != null && (object2 = objectArray.getPaymentInstrumentsInfo()) != null) {
                n3 = ((ArrayList)object2).size();
            } else {
                n3 = 0;
                object2 = null;
            }
            int n8 = 3;
            if (n3 > n8) {
                object2 = StringCompanionObject.INSTANCE;
                if (objectArray != null && (object2 = objectArray.getPaymentInstrumentsInfo()) != null) {
                    n3 = ((ArrayList)object2).size();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                object2 = n3 += -2;
                objectArray = new Object[n7];
                objectArray[0] = object2;
                object = "View %s More Cards";
                object2 = "format(...)";
                zn0_1.b(objectArray, n7, (String)object, (String)object2, textView);
            } else {
                n4 = R$string.card_view_more_1;
                object = hv3_0.K(n4);
                textView.setText((CharSequence)object);
            }
            object = il_22.g;
            mr2_02.c((List)object);
        } else {
            n4 = R$string.card_view_less;
            object = hv3_0.K(n4);
            textView.setText((CharSequence)object);
            if (objectArray != null) {
                object = objectArray.getPaymentInstrumentsInfo();
            } else {
                n4 = 0;
                object = null;
            }
            mr2_02.c((List)object);
        }
        object = il_22.h;
        if (object != null) {
            int n10 = ((qq2_2)object).f;
            ((qq2_2)object).f = n7 ^= n10;
        }
    }
}

