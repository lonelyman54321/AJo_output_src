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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class i33
extends RecyclerView$f {
    public final ArrayList a;

    public i33(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        this.a = arrayList;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (i33$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B.getClass();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.shimmer_product_exit_intent;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new i33$a((View)viewGroup);
        return object;
    }
}

