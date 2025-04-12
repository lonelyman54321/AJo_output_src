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
import com.ril.ajio.services.data.ratings.SubRatings;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Fh0
extends RecyclerView$f {
    public ArrayList a;

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (Gh0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (SubRatings)object;
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "subRatings");
        Object object2 = ((SubRatings)object).getProductAttribute();
        if (object2 != null) {
            cp_1.Companion.getClass();
            cp_1 cp_12 = cp$a.e();
            cp_12.getClass();
            object2 = cp_1.C((String)object2);
        } else {
            object2 = null;
        }
        ((Gh0)recyclerView$B).a.setText((CharSequence)object2);
        cp_1.Companion.getClass();
        object2 = cp$a.e();
        object = ((SubRatings)object).getAttributeRatings();
        object2.getClass();
        object = cp_1.r((ArrayList)object);
        ((Gh0)recyclerView$B).b.setText((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.customer_word_item;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        Gh0 gh0 = new Gh0((View)viewGroup);
        return gh0;
    }
}

