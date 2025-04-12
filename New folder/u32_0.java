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
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Sort;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from u32
 */
public final class u32_0
extends RecyclerView$f {
    public final ImmutableList a;
    public final d92 b;

    public u32_0(ImmutableList immutableList, d92 d922) {
        Intrinsics.checkNotNullParameter(immutableList, "sortItemList");
        Intrinsics.checkNotNullParameter(d922, "onSortClickListener");
        this.a = immutableList;
        this.b = d922;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        boolean bl2 = recyclerView$B instanceof z32_0;
        if (bl2) {
            recyclerView$B = (z32_0)recyclerView$B;
            Object object = this.a.get(n3);
            string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (Sort)object;
            ((z32_0)recyclerView$B).w((Sort)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.plp_sort_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        z32_0 z32_02 = new z32_0((View)viewGroup, (d92)object);
        return z32_02;
    }
}

