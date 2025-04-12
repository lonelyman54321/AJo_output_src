/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ajiocash.SpendHistory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ia3
 */
public final class ia3_0
extends Ql2 {
    public static final ia3$b Companion;
    public static final ia3$a f;
    public final qa3_1 d;
    public final ja2_1 e;

    static {
        Object object = new Object();
        Companion = object;
        f = object = new k$e();
    }

    public ia3_0(qa3_1 qa3_12, ja2_1 ja2_12) {
        Intrinsics.checkNotNullParameter(qa3_12, "spendHistoryListener");
        Intrinsics.checkNotNullParameter(ja2_12, "orderClickListener");
        ia3$a ia3$a = f;
        super(ia3$a);
        this.d = qa3_12;
        this.e = ja2_12;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4 = 0;
        Object object = null;
        int n7 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
        int n8 = recyclerView$B instanceof C;
        if (n8 != 0) {
            recyclerView$B = (C)recyclerView$B;
            SpendHistory spendHistory = (SpendHistory)this.h(n3);
            recyclerView$B.getClass();
            if (spendHistory != null) {
                float f5;
                object2 = spendHistory.getSpendCash();
                float f6 = 0.0f;
                Object object3 = null;
                if (object2 != null) {
                    f5 = ((Float)object2).floatValue();
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
                Float f7 = spendHistory.getSpendPoints();
                if (f7 != null) {
                    f6 = f7.floatValue();
                }
                object3 = spendHistory.getDescription();
                f7 = ((C)recyclerView$B).e;
                f7.setText((CharSequence)object3);
                object3 = StringCompanionObject.INSTANCE;
                object2 = qz2_0.x(Float.valueOf(f5 += f6));
                object3 = new Object[n7];
                object3[0] = object2;
                String string2 = "format(...)";
                object2 = xh2_0.a((Object[])object3, n7, "- %s", string2);
                ((C)recyclerView$B).d.setText((CharSequence)object2);
                n8 = R$string.transaction_date;
                object3 = k7.k(spendHistory.getDebitedDate());
                TextView textView = new Object[n7];
                textView[0] = object3;
                object = hv3_0.L(n8, (Object[])textView);
                ((C)recyclerView$B).c.setText((CharSequence)object);
                object = new A((C)recyclerView$B, spendHistory);
                textView = ((C)recyclerView$B).f;
                textView.setOnClickListener((View.OnClickListener)object);
                n4 = R$string.sp_view_details;
                object = hv3_0.K(n4);
                object2 = spendHistory.getDescription();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(" for ");
                ((StringBuilder)object3).append((String)object2);
                object = ((StringBuilder)object3).toString();
                textView.setContentDescription((CharSequence)object);
                object = spendHistory.getOrderId();
                if (object != null && (n4 = ((String)object).length()) != 0) {
                    object = new b_0((C)recyclerView$B, spendHistory);
                    f7.setOnClickListener((View.OnClickListener)object);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.row_spend_history;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.d;
        ja2_1 ja2_12 = this.e;
        C c2 = new C((View)viewGroup, (qa3_1)object, ja2_12);
        return c2;
    }
}

