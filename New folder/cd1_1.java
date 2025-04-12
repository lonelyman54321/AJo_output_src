/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CD1
 */
public final class cd1_1
extends RecyclerView$f {
    public final ArrayList a;
    public final CD1$a b;

    public cd1_1(ArrayList arrayList, CD1$a cD1$a) {
        Intrinsics.checkNotNullParameter(arrayList, "dataList");
        Intrinsics.checkNotNullParameter(cD1$a, "categoryClickListener");
        this.a = arrayList;
        this.b = cD1$a;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (nd1_2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.a;
        Object object2 = ((ArrayList)object).get(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
        object2 = (NavImpl)object2;
        ((ArrayList)object).size();
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object2, "navImpl");
        boolean bl2 = false;
        object = null;
        Object object3 = ((nd1_2)recyclerView$B).b;
        int n4 = 8;
        if (n3 == 0) {
            object3.setVisibility(n4);
        } else {
            object3.setVisibility(0);
        }
        boolean bl3 = object2 instanceof Navigation;
        TextView textView = ((nd1_2)recyclerView$B).d;
        if (bl3) {
            Boolean bl4;
            object2 = (Navigation)object2;
            object3 = ((Navigation)object2).getName();
            boolean bl5 = Intrinsics.areEqual(object2 = ((Navigation)object2).getNewFlag(), bl4 = Boolean.TRUE);
            if (bl5) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(n4);
            }
        } else {
            bl2 = object2 instanceof LinkDetail;
            if (bl2) {
                textView.setVisibility(n4);
                object2 = (LinkDetail)object2;
                object3 = ((LinkDetail)object2).getLinkName();
                px3.a((LinkDetail)object2);
            } else {
                object3 = "";
            }
        }
        object = new md1_0((nd1_2)recyclerView$B, n3);
        ((nd1_2)recyclerView$B).e.setOnClickListener((View.OnClickListener)object);
        recyclerView$B = ((nd1_2)recyclerView$B).c;
        String string2 = hv3_0.u((String)object3);
        recyclerView$B.setText(string2);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_lux_sub_category;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        CD1$a cD1$a = this.b;
        object = new nd1_2((View)viewGroup, cD1$a);
        return object;
    }
}

