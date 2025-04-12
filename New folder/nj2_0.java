/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nj2
 */
public final class nj2_0
extends RecyclerView$f {
    public final List a;
    public final yv2_1 b;
    public final boolean c;
    public final HashMap d;
    public final int e;
    public final boolean f;

    public nj2_0(List list, yv2_1 object, boolean n3, Integer n4, HashMap hashMap, int n7, int n8) {
        int n10;
        int n14;
        int n15 = n8 & 4;
        if (n15 != 0) {
            n3 = 0;
        }
        if ((n8 &= 8) != 0) {
            int n16 = 7;
            n4 = n16;
        }
        Intrinsics.checkNotNullParameter(list, "listOfFilters");
        Intrinsics.checkNotNullParameter(object, "filterClickListener");
        String string2 = "imagesMap";
        Intrinsics.checkNotNullParameter(hashMap, string2);
        this.a = list;
        this.b = object;
        this.c = n3;
        this.d = hashMap;
        this.e = n7;
        if (n4 != null && (n14 = list.size()) > (n10 = n4.intValue())) {
            n14 = 1;
            this.f = n14;
        }
        if (n3 == 0 && n4 != null) {
            object = list;
            object = list;
            int n17 = list.size();
            if (n17 > (n3 = n4.intValue())) {
                n17 = n3;
            }
            list = CollectionsKt.f0((Iterable)object, n17);
        }
        this.a = list;
    }

    public final int getItemCount() {
        int n3 = this.c;
        List list = this.a;
        if (n3 != 0) {
            return list.size();
        }
        n3 = this.f;
        n3 = n3 != 0 ? list.size() + 1 : list.size();
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4 = this.c;
        List list = this.a;
        if (n4 != 0) {
            return (int)(((FacetValue)list.get(n3)).getSelected() ? 1 : 0);
        }
        n4 = list.size();
        if (n3 < n4) {
            return (int)(((FacetValue)list.get(n3)).getSelected() ? 1 : 0);
        }
        return 2;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof du2_1;
        Object object2 = this.a;
        int n4 = this.e;
        Object object3 = this.d;
        if (bl2) {
            recyclerView$B = (du2_1)recyclerView$B;
            object = (FacetValue)object2.get(n3);
            recyclerView$B.getClass();
            Intrinsics.checkNotNullParameter(object, "item");
            Intrinsics.checkNotNullParameter(object3, "imagesMap");
            object2 = ((FacetValue)object).getCode();
            object2 = (String)object3.get(object2);
            object3 = ((du2_1)recyclerView$B).b;
            if (object3 != null) {
                int n7;
                if (object2 != null && (n7 = ((String)object2).length()) != 0) {
                    boolean bl3;
                    ai0_2.B((View)object3);
                    da$a da$a = new da$a();
                    da$a.n = object2;
                    da$a.u = object3;
                    da$a.k = bl3 = true;
                    da$a.g = bl3;
                    da$a.a();
                } else {
                    ai0_2.i((View)object3);
                }
            }
            if ((object2 = ((du2_1)recyclerView$B).c) != null) {
                object3 = ((FacetValue)object).getName();
                object2.setText((CharSequence)object3);
            }
            object2 = recyclerView$B.itemView;
            object3 = new Cu2((du2_1)recyclerView$B, (FacetValue)object, n4, n3);
            object2.setOnClickListener((View.OnClickListener)object3);
        } else {
            bl2 = recyclerView$B instanceof xv2_1;
            if (bl2) {
                recyclerView$B = (xv2_1)recyclerView$B;
                n3 = xv2_1.c;
                Boolean bl4 = Boolean.FALSE;
                bl2 = false;
                object = null;
                ((xv2_1)recyclerView$B).w(n4, bl4, null, (HashMap)object3);
            } else {
                bl2 = recyclerView$B instanceof dv2_0;
                if (bl2) {
                    recyclerView$B = (dv2_0)recyclerView$B;
                    object = (FacetValue)object2.get(n3);
                    ((dv2_0)recyclerView$B).w((FacetValue)object, (HashMap)object3, n4, n3);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        yv2_1 yv2_12 = this.b;
        String string2 = "inflate(...)";
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    int n7 = R$layout.plp_quick_filter_item_view;
                    viewGroup = layoutInflater.inflate(n7, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    recyclerView$B = new du2_1((View)viewGroup, yv2_12);
                } else {
                    LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
                    int n8 = R$layout.plp_settings_quick_filter_item_view;
                    viewGroup = layoutInflater.inflate(n8, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    recyclerView$B = new xv2_1((View)viewGroup, yv2_12, false);
                }
            } else {
                yv2_12 = LayoutInflater.from((Context)viewGroup.getContext());
                n4 = R$layout.plp_selected_quick_filters_layout;
                View view = yv2_12.inflate(n4, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(view, string2);
                boolean bl2 = this.c;
                yv2_1 yv2_13 = this.b;
                RecyclerView$B recyclerView$B2 = recyclerView$B;
                recyclerView$B = new dv2_0(view, yv2_13, bl2, false, false);
            }
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n10 = R$layout.plp_quick_filter_item_view;
            viewGroup = layoutInflater.inflate(n10, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new du2_1((View)viewGroup, yv2_12);
        }
        return recyclerView$B;
    }
}

