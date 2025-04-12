/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.OnImageSearchCategoryClickListener;
import com.ril.ajio.services.data.ProductType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from we1
 */
public final class we1_0
extends RecyclerView$f {
    public List a;
    public final OnImageSearchCategoryClickListener b;

    public we1_0(List list, OnImageSearchCategoryClickListener onImageSearchCategoryClickListener) {
        Intrinsics.checkNotNullParameter(list, "categories");
        Intrinsics.checkNotNullParameter(onImageSearchCategoryClickListener, "onCategoryClickListener");
        this.a = list;
        this.b = onImageSearchCategoryClickListener;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (xe1_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = ((xe1_0)recyclerView$B).a;
        Object object2 = he3_1.Companion;
        String string2 = ((ProductType)this.a.get(n3)).getType();
        object2.getClass();
        object2 = he3$a_0.b(string2);
        object.setText((CharSequence)object2);
        boolean bl2 = ((ProductType)this.a.get(n3)).getSelected();
        ((xe1_0)recyclerView$B).a.setSelected(bl2);
        recyclerView$B = recyclerView$B.itemView;
        object = new ve1(this, n3);
        recyclerView$B.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.row_image_search_category;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new xe1_0((View)viewGroup);
        return object;
    }
}

