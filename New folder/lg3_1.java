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
import com.ril.ajio.services.data.Product.SuggestedSearchTerms;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lg3
 */
public final class lg3_1
extends RecyclerView$f {
    public final ng3_1 a;
    public final List b;

    public lg3_1(ng3_1 ng3_12, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(ng3_12, "suggestionOnItemClickListener");
        this.a = ng3_12;
        this.b = arrayList;
    }

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
        Object object;
        recyclerView$B = (mg3_2)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        String string2 = null;
        Object object2 = this.b;
        if (object2 != null) {
            object = (SuggestedSearchTerms)object2.get(n3);
        } else {
            n3 = 0;
            object = null;
        }
        ((mg3_2)recyclerView$B).c = object;
        object2 = object != null ? ((SuggestedSearchTerms)object).getSearchTerm() : null;
        if (object != null) {
            string2 = ((SuggestedSearchTerms)object).getItemCount();
        }
        object = y02.a((String)object2, "(", string2, ")");
        ((mg3_2)recyclerView$B).b.setText((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "viewGroup");
        int n4 = R$layout.search_suggestion_viewholder_refresh;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        ng3_1 ng3_12 = this.a;
        object = new mg3_2((View)viewGroup, ng3_12);
        return object;
    }
}

