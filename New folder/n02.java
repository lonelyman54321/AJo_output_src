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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class n02
extends RecyclerView$f {
    public final List a;

    public n02(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void g(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "featureDataList");
        List list = this.a;
        if (list != null) {
            list.addAll(arrayList);
        }
        this.notifyDataSetChanged();
    }

    public final int getItemCount() {
        Object object = this.a;
        if (object != null) {
            int n3 = object.size();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        return (Integer)object;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object;
        recyclerView$B = (n02$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        int n7 = 0;
        String string2 = null;
        List list = this.a;
        if (list != null) {
            object = (FeatureData)list.get(n3);
        } else {
            n4 = 0;
            object = null;
        }
        AjioTextView ajioTextView = ((n02$a)recyclerView$B).a;
        String string3 = object != null ? ((FeatureData)object).getName() : null;
        ajioTextView.setText(string3);
        ajioTextView = null;
        if (object != null && (object = ((FeatureData)object).getFeatureValues()) != null && (object = (FeatureValue)object.get(0)) != null) {
            string2 = ((FeatureValue)object).getValue();
        }
        object = ((n02$a)recyclerView$B).b;
        object.setText(string2);
        n7 = this.getItemCount() % 2;
        n4 = 8;
        recyclerView$B = ((n02$a)recyclerView$B).c;
        if (n7 == 0) {
            if (list != null && n3 == (n7 = list.size() + -1) || list != null && n3 == (n7 = list.size() + -2)) {
                recyclerView$B.setVisibility(n4);
            } else {
                recyclerView$B.setVisibility(0);
            }
        } else if (list != null && n3 == (n7 = list.size() + -1)) {
            recyclerView$B.setVisibility(n4);
        } else {
            recyclerView$B.setVisibility(0);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.list_item_grid_new_pdp_details;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new n02$a((View)viewGroup);
        return object;
    }
}

