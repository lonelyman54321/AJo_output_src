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
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MN
 */
public final class mn_2
extends RecyclerView$f {
    public final j82_0 a;
    public final List b;
    public final nw_0 c;
    public final boolean d;

    public mn_2(j82_0 j82_02, List list, nw_0 nw_02, boolean bl2) {
        this.a = j82_02;
        this.b = list;
        this.c = nw_02;
        this.d = bl2;
    }

    public final int getItemCount() {
        boolean bl2;
        List list = this.b;
        Collection collection = list;
        collection = list;
        if (collection != null && !(bl2 = collection.isEmpty())) {
            return list.size();
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = yn3_0.a;
        Comparable<Integer> comparable = n3;
        int n4 = 1;
        Object object2 = new Object[n4];
        int n7 = 0;
        object2[0] = comparable;
        ((yn3$a)object).a("onBindViewHolder position = %s", (Object[])object2);
        int n8 = recyclerView$B instanceof tn_2;
        comparable = null;
        object2 = this.b;
        if (n8 != 0) {
            recyclerView$B = (tn_2)recyclerView$B;
            if (object2 != null) {
                Object e2 = object2.get(n3);
                comparable = e2;
                comparable = (CartEntry)e2;
            }
            ((tn_2)recyclerView$B).x(comparable);
        } else {
            n8 = recyclerView$B instanceof sn_1;
            if (n8 != 0) {
                if (object2 != null) {
                    n8 = object2.size() - n4;
                    if (n8 != n3) {
                        n4 = 0;
                    }
                    n7 = n4;
                }
                recyclerView$B = (sn_1)recyclerView$B;
                ((sn_1)recyclerView$B).v = object = Boolean.valueOf(n7 != 0);
                if (object2 != null) {
                    Object e5 = object2.get(n3);
                    comparable = e5;
                    comparable = (CartEntry)e5;
                }
                ((sn_1)recyclerView$B).x(comparable);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Object object = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).a("onCreateViewHolder", objectArray);
        n3 = (int)(og1_1.b() ? 1 : 0);
        boolean bl2 = this.d;
        nw_0 nw_02 = this.c;
        j82_0 j82_02 = this.a;
        String string2 = "inflate(...)";
        if (n3 != 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.cart_inventory_oos_new_row_luxe;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new tn_2((View)viewGroup, j82_02, nw_02, bl2);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.cart_inventory_oos_new_similar_row;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new sn_1((View)viewGroup, j82_02, nw_02, bl2);
        }
        return object;
    }
}

