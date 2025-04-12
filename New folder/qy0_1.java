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
import com.google.common.collect.UnmodifiableIterator;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QY0
 */
public class qy0_1
extends RecyclerView$f
implements DD2 {
    public ImmutableList a;
    public final HashMap b;
    public final HashMap c;
    public final KI0 d;
    public final int e;
    public final Boolean f;
    public final Function2 g;
    public int h;

    public qy0_1(ImmutableList immutableList, HashMap hashMap, HashMap hashMap2, KI0 kI0, int n3, Boolean bl2, Function2 function2) {
        Intrinsics.checkNotNullParameter(immutableList, "facetValueList");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Intrinsics.checkNotNullParameter(kI0, "facetValueClickListener");
        this.a = immutableList;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = kI0;
        this.e = n3;
        this.f = bl2;
        this.g = function2;
        this.h = -1;
    }

    public final void d(int n3) {
        int n4 = this.h;
        int n7 = -1;
        if (n4 != n7 && n3 != n7) {
            Object object = this.a.get(n4);
            Intrinsics.checkNotNullExpressionValue(object, "get(...)");
            object = (FacetValue)object;
            KI0 kI0 = this.d;
            kI0.Y5((FacetValue)object, false);
            object = this.a;
            n7 = this.h;
            object = (FacetValue)object.get(n7);
            ((FacetValue)object).setSelected(false);
        }
        this.h = n3;
        this.notifyDataSetChanged();
    }

    public final FacetValue g() {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.a.iterator();
        Object object = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(unmodifiableIterator, (String)object);
        while (bl2 = unmodifiableIterator.hasNext()) {
            object = (FacetValue)unmodifiableIterator.next();
            boolean bl3 = ((FacetValue)object).getSelected();
            if (!bl3) continue;
            return object;
        }
        return null;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = recyclerView$B instanceof YY0;
        if (n4 != 0) {
            n4 = this.e;
            int n7 = 4;
            Object object2 = "get(...)";
            if (n4 != n7 && n4 != (n7 = 5)) {
                RecyclerView$B recyclerView$B2 = recyclerView$B;
                recyclerView$B2 = (YY0)recyclerView$B;
                object = this.a.get(n3);
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object = (FacetValue)object;
                object2 = this.c;
                int n8 = this.e;
                HashMap hashMap = this.b;
                ((YY0)recyclerView$B2).x((FacetValue)object, hashMap, (HashMap)object2, n8, n3);
            } else {
                RecyclerView$B recyclerView$B3 = recyclerView$B;
                recyclerView$B3 = (YY0)recyclerView$B;
                object = this.a.get(n3);
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object = (FacetValue)object;
                Boolean bl2 = this.f;
                Function2 function2 = this.g;
                HashMap hashMap = this.b;
                object2 = this.c;
                int n10 = this.e;
                ((YY0)recyclerView$B3).y((FacetValue)object, hashMap, (HashMap)object2, n10, this, this, n3, bl2, function2);
            }
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.general_facet_value_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.d;
        YY0 yY0 = new YY0((View)viewGroup, (KI0)object);
        return yY0;
    }
}

