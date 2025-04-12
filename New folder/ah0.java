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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import com.ril.ajio.services.data.ratings.SubRatings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class ah0
extends RecyclerView$f {
    public ArrayList a;

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2;
        object = (ah0$a)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object3 = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (SubRatings)object3;
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "rating");
        Iterator iterator = ((SubRatings)object3).getProductAttribute();
        Zg0 zg0 = null;
        if (iterator != null) {
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            iterator = cp_1.C((String)((Object)iterator));
        } else {
            iterator = null;
        }
        ((ah0$a)object).a.setText((CharSequence)((Object)iterator));
        object = ((ah0$a)object).b;
        object2 = object.getContext();
        int n4 = 1;
        int n7 = 0;
        iterator = new Iterator((Context)object2, n4, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)((Object)iterator));
        object3 = ((SubRatings)object3).getAttributeRatings();
        if (object3 != null) {
            boolean bl2;
            iterator = ((ArrayList)object3).iterator();
            object2 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(iterator, (String)object2);
            while (bl2 = iterator.hasNext()) {
                object2 = iterator.next();
                Intrinsics.checkNotNullExpressionValue(object2, "next(...)");
                object2 = (AttributeRatings)object2;
                cp_1.Companion.getClass();
                cp_1 cp_12 = cp$a.e();
                String string2 = ((AttributeRatings)object2).getPercentageRating();
                cp_12.getClass();
                n4 = cp_1.v(string2);
                if (n7 >= n4) continue;
                cp_12 = cp$a.e();
                object2 = ((AttributeRatings)object2).getPercentageRating();
                cp_12.getClass();
                n7 = cp_1.v((String)object2);
            }
            zg0 = new Zg0(n7, (ArrayList)object3);
        }
        ((RecyclerView)object).setAdapter(zg0);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.customer_opinion_item;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        ah0$a ah0$a = new ah0$a((View)viewGroup);
        return ah0$a;
    }
}

