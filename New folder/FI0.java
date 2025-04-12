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
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Facet;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public class FI0
extends RecyclerView$f {
    public ImmutableList a;
    public HashMap b;
    public final GI0 c;
    public final int d;
    public final int e;

    public FI0(ImmutableList immutableList, HashMap hashMap, GI0 gI0) {
        Intrinsics.checkNotNullParameter(immutableList, "facetList");
        Intrinsics.checkNotNullParameter(gI0, "facetNameClickListener");
        this.a = immutableList;
        this.b = hashMap;
        this.c = gI0;
        this.d = 1;
        this.e = 2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        boolean bl2;
        int n4;
        String string2;
        String string3 = ((Facet)this.a.get(n3)).getName();
        n3 = (n3 = (int)(kotlin.text.b.i(string3, string2 = hv3_0.K(n4 = R$string.more_filter), bl2 = true) ? 1 : 0)) != 0 ? this.e : this.d;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof ii0_0;
        Object object2 = "get(...)";
        if (bl2) {
            recyclerView$B = (ii0_0)recyclerView$B;
            object = this.a.get(n3);
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (Facet)object;
            ((ii0_0)recyclerView$B).x((Facet)object);
            object = this.b;
            if (object != null) {
                Object object3;
                Intrinsics.checkNotNull(object);
                object2 = ((Facet)this.a.get(n3)).getCode();
                bl2 = object.containsKey(object2);
                if (bl2) {
                    object = this.b;
                    Intrinsics.checkNotNull(object);
                    object2 = this.a;
                    object3 = ((Facet)object2.get(n3)).getCode();
                    object3 = (Integer)object.get(object3);
                } else {
                    n3 = 0;
                    object3 = 0;
                }
                Intrinsics.checkNotNull(object3);
                n3 = (Integer)object3;
                ((ii0_0)recyclerView$B).w(n3);
            }
        } else {
            bl2 = recyclerView$B instanceof JI0;
            if (bl2) {
                recyclerView$B = (JI0)recyclerView$B;
                object = this.a;
                Object object4 = object.get(n3);
                Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
                object4 = (Facet)object4;
                ((JI0)recyclerView$B).w((Facet)object4);
            }
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = this.d;
        String string2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.filter_facet_name_row_view;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.c;
            recyclerView$B = new ii0_0((View)viewGroup, (GI0)object);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.facet_title_layout;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new JI0((View)viewGroup);
        }
        return recyclerView$B;
    }
}

