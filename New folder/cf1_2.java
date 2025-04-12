/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cF1
 */
public final class cf1_2
extends RecyclerView$f {
    public final c92 a;
    public ImmutableList b;

    public cf1_2(c92 c922, ImmutableList immutableList) {
        Intrinsics.checkNotNullParameter(c922, "sizeClickListener");
        Intrinsics.checkNotNullParameter(immutableList, "productOptionVariants");
        this.a = c922;
        this.b = immutableList;
    }

    public final int getItemCount() {
        return this.b.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof hf1_1;
        if (bl2) {
            recyclerView$B = (hf1_1)recyclerView$B;
            object = this.b.get(n3);
            String string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (ProductOptionVariant)object;
            ((hf1_1)recyclerView$B).w((ProductOptionVariant)object, n3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_closet_size_row_view;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        Intrinsics.checkNotNullParameter(viewGroup, "view");
        c92 c922 = this.a;
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        hf1_1 hf1_12 = new RecyclerView$B((View)viewGroup);
        hf1_12.a = c922;
        int n7 = R$id.luxe_closet_size_row_tv;
        viewGroup = viewGroup.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "findViewById(...)");
        viewGroup = (TextView)viewGroup;
        hf1_12.b = viewGroup;
        return hf1_12;
    }
}

