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
import com.ril.ajio.data.repo.CartRepo;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PN
 */
public final class pn_1
extends RecyclerView$f {
    public final j82_0 a;
    public final List b;
    public final dn_1 c;

    public pn_1(j82_0 j82_02, ArrayList arrayList, dn_1 dn_12) {
        Intrinsics.checkNotNullParameter(j82_02, "onCartClickListener");
        this.a = j82_02;
        this.b = arrayList;
        this.c = dn_12;
    }

    public final int getItemCount() {
        List list = this.b;
        if (list != null) {
            Collection collection = list;
            collection = list;
            boolean bl2 = collection.isEmpty() ^ true;
            if (bl2) {
                return list.size();
            }
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        yn3$a yn3$a = yn3_0.a;
        Comparable<Integer> comparable = n3;
        int n4 = 1;
        Object object = new Object[n4];
        object[0] = comparable;
        yn3$a.a("onBindViewHolder position = %s", (Object[])object);
        boolean bl2 = recyclerView$B instanceof rn_1;
        comparable = null;
        object = this.b;
        if (bl2) {
            recyclerView$B = (rn_1)recyclerView$B;
            if (object != null) {
                Object e2 = object.get(n3);
                comparable = e2;
                comparable = (CartEntry)e2;
            }
            ((rn_1)recyclerView$B).x(comparable);
        } else {
            bl2 = recyclerView$B instanceof wn_2;
            if (bl2) {
                recyclerView$B = (wn_2)recyclerView$B;
                if (object != null) {
                    Object e5 = object.get(n3);
                    comparable = e5;
                    comparable = (CartEntry)e5;
                }
                ((wn_2)recyclerView$B).x(comparable);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Object object = yn3_0.a;
        dn_1 dn_12 = null;
        Object object2 = new Object[]{};
        ((yn3$a)object).a("onCreateViewHolder", object2);
        n3 = (int)(og1_1.b() ? 1 : 0);
        object2 = this.a;
        String string2 = "inflate(...)";
        if (n3 != 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.cart_inventory_oos_row_luxe;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = new rn_1((j82_0)object2, (View)viewGroup, false);
        } else {
            object = CartRepo.INSTANCE;
            n3 = (int)(((CartRepo)object).isOOSimilarEnabled() ? 1 : 0);
            if (n3 != 0) {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                int n7 = R$layout.cart_inventory_oos_similar_row;
                viewGroup = layoutInflater.inflate(n7, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                dn_12 = this.c;
                object = new wn_2((View)viewGroup, (j82_0)object2, dn_12);
            } else {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                int n8 = R$layout.cart_inventory_oos_row_refresh;
                viewGroup = layoutInflater.inflate(n8, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new rn_1((j82_0)object2, (View)viewGroup, false);
            }
        }
        return object;
    }
}

