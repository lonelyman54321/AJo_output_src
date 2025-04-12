/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.ArrayList;

/*
 * Renamed from is2
 */
public class is2_1
extends RecyclerView$f {
    public op2_2 a;
    public mu1_1 b;
    public ArrayList c;
    public PaymentInstruments d;
    public dv_0 e;
    public co2_0 f;
    public OnCheckoutClickListener g;
    public Context h;
    public int i;
    public boolean j;

    public final int getItemViewType(int n3) {
        ArrayList arrayList = this.c;
        int n4 = arrayList.size();
        if (n3 >= n4) {
            n3 = -1;
        } else {
            arrayList = this.c;
            qq2_2 qq2_22 = (qq2_2)arrayList.get(n3);
            n3 = qq2_22.a;
        }
        return n3;
    }
}

