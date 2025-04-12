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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zG
 */
public final class zg_2
extends RecyclerView$f {
    public i82_0 a;
    public List b;

    public final int getItemCount() {
        int n3;
        List list = this.b;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (uv_2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        List list = this.b;
        Intrinsics.checkNotNull(list);
        list = list.get(n3);
        ((uv_2)recyclerView$B).setData(list, n3);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_cc_itemlist_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        i82_0 i82_02 = this.a;
        object = new dg_1((View)viewGroup, i82_02);
        return object;
    }
}

