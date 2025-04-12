/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$layout;
import com.ril.ajio.rto.entity.RTOReasonData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class zQ2
extends RecyclerView$f {
    public final Function1 a;
    public ArrayList b;
    public int c;

    public zQ2(ta_0 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "onReasonSelected");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        this.c = -1;
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B = (cq2_0)recyclerView$B;
        Object object = this.b.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (RTOReasonData)object;
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "data");
        Object object2 = ((RTOReasonData)object).getReason();
        ((cq2_0)recyclerView$B).c.setText((CharSequence)object2);
        object2 = new AQ2((cq2_0)recyclerView$B, n3);
        View view = ((cq2_0)recyclerView$B).a;
        view.setOnClickListener((View.OnClickListener)object2);
        object2 = new BQ2((cq2_0)recyclerView$B, n3);
        ImageView imageView = ((cq2_0)recyclerView$B).d;
        imageView.setOnClickListener((View.OnClickListener)object2);
        object = ((RTOReasonData)object).isSelected();
        object2 = Boolean.TRUE;
        int n4 = Intrinsics.areEqual(object, object2);
        object2 = "getContext(...)";
        if (n4 != 0) {
            recyclerView$B = recyclerView$B.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(recyclerView$B, (String)object2);
            n4 = R$attr.sort_solid_selected;
            int n7 = tm3_0.b(n4, (Context)recyclerView$B);
            imageView.setImageResource(n7);
        } else {
            recyclerView$B = recyclerView$B.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(recyclerView$B, (String)object2);
            n4 = R$attr.sort_solid_unselected;
            int n8 = tm3_0.b(n4, (Context)recyclerView$B);
            imageView.setImageResource(n8);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object2 = od3_2.a;
        int n4 = ((String)object2).length();
        if (n4 == 0) {
            object2 = od3_2.a();
        }
        n3 = (n3 = (int)(Intrinsics.areEqual(object2, object = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) != 0 ? R$layout.rto_reason_row_luxe : R$layout.rto_reason_row;
        viewGroup = LayoutInflater.from((Context)viewGroup.getContext()).inflate(n3, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new WC2(this, 1);
        object2 = new cq2_0((View)viewGroup, (WC2)object);
        return object2;
    }
}

