/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.List;

/*
 * Renamed from nS2
 */
public final class ns2_1
extends RecyclerView$f {
    public List a;
    public Context b;
    public os2_1 c;

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = null;
        int n4 = 1;
        PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)this.a.get(n3);
        recyclerView$B = (ns2$a_0)recyclerView$B;
        Object object = ((ns2$a_0)recyclerView$B).a;
        Object object2 = paymentInstrumentInfo.getLastFourDigits();
        object.setText((CharSequence)object2);
        int n7 = R$string.acc_last_four_digits_of_card_number_text;
        object2 = cp_1.Companion;
        Object[] objectArray = paymentInstrumentInfo.getLastFourDigits();
        object2.getClass();
        object2 = cp$a.B((String)objectArray);
        objectArray = new Object[n4];
        objectArray[0] = object2;
        object = this.b.getString(n7, objectArray);
        object2 = ((ns2$a_0)recyclerView$B).a;
        object2.setContentDescription((CharSequence)object);
        object = paymentInstrumentInfo.getLastFourDigits();
        object = object != null && (n7 = (int)(((String)(object = paymentInstrumentInfo.getLastFourDigits())).isEmpty() ? 1 : 0)) == 0 ? paymentInstrumentInfo.getLastFourDigits() : "";
        int n8 = R$string.remove_saved_card;
        objectArray = new Object[n4];
        objectArray[0] = object;
        string2 = hv3_0.L(n8, objectArray);
        ((ns2$a_0)recyclerView$B).c.setContentDescription(string2);
        ((ns2$a_0)recyclerView$B).d = n3;
        da$a da$a = new da$a();
        da$a.k = n4;
        da$a.g = n4;
        string2 = paymentInstrumentInfo.getIconUrl();
        da$a.n = string2;
        recyclerView$B = ((ns2$a_0)recyclerView$B).b;
        da$a.u = recyclerView$B;
        da$a.a();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.pesdk_lux_saved_card;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.pesdk_saved_card;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        object = new ns2$a_0(this, (View)viewGroup);
        return object;
    }
}

