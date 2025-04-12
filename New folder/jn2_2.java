/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Order.OptedPaymentModeOrder;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JN2
 */
public final class jn2_2
extends RecyclerView$f {
    public ArrayList a;
    public boolean b;

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        boolean bl2;
        OptedPaymentModeOrder optedPaymentModeOrder;
        recyclerView$B = (kn2_1)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            optedPaymentModeOrder = (OptedPaymentModeOrder)CollectionsKt.N(n3, arrayList);
        } else {
            n3 = 0;
            optedPaymentModeOrder = null;
        }
        ((kn2_1)recyclerView$B).a = bl2 = this.b;
        ((kn2_1)recyclerView$B).w(optedPaymentModeOrder, null);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "viewGroup");
        int n4 = R$layout.return_refund_credit_mode_section;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = new kn2_1((View)viewGroup);
        return object;
    }
}

