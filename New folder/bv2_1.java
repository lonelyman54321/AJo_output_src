/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bv2
 */
public final class bv2_1
extends RecyclerView$f {
    public final List a;
    public final yv2_1 b;
    public final boolean c;
    public final HashMap d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public bv2_1(List list, yv2_1 yv2_12, HashMap hashMap, int n3, boolean bl2, boolean bl3, boolean bl4, int n4) {
        int n7 = n4 & 0x20;
        if (n7 != 0) {
            bl2 = false;
        }
        if ((n7 = n4 & 0x40) != 0) {
            bl3 = false;
        }
        if ((n4 &= 0x80) != 0) {
            bl4 = false;
        }
        Intrinsics.checkNotNullParameter(list, "listOfSelectedQuickFilters");
        Intrinsics.checkNotNullParameter(yv2_12, "filterClickListener");
        Intrinsics.checkNotNullParameter(hashMap, "imagesMap");
        this.a = list;
        this.b = yv2_12;
        this.c = false;
        this.d = hashMap;
        this.e = n3;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
    }

    public final int getItemCount() {
        List list = this.a;
        boolean bl2 = list.isEmpty();
        int n3 = 1;
        boolean bl3 = this.g;
        boolean bl4 = this.f;
        if (bl2) {
            if (!bl4 || bl3) {
                n3 = 0;
            }
        } else if (bl4 && !bl3) {
            int n4 = list.size();
            n3 = n4 + 2;
        } else {
            int n7 = list.size();
            n3 += n7;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4 = this.f;
        int n7 = 3;
        List list = this.a;
        if (n4 != 0) {
            n4 = this.g;
            if (n3 == 0 && n4 == 0) {
                n7 = 2;
            } else if (n4 == 0 && n3 <= (n4 = list.size()) || n3 < (n4 = list.size())) {
                n7 = 1;
            }
            return n7;
        }
        n4 = list.size();
        if (n3 < n4) {
            n7 = 1;
        }
        return n7;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = recyclerView$B instanceof dv2_0;
        HashMap hashMap = this.d;
        Object object2 = this.a;
        int n7 = this.e;
        boolean bl2 = this.f;
        if (n4 != 0) {
            n4 = bl2 && (n4 = (int)(this.g ? 1 : 0)) == 0 ? n3 + -1 : n3;
            recyclerView$B = (dv2_0)recyclerView$B;
            object = (FacetValue)object2.get(n4);
            ((dv2_0)recyclerView$B).w((FacetValue)object, hashMap, n7, n3);
        } else {
            n3 = recyclerView$B instanceof xv2_1;
            if (n3 != 0) {
                recyclerView$B = (xv2_1)recyclerView$B;
                Boolean bl3 = bl2;
                ((xv2_1)recyclerView$B).w(n7, bl3, (List)object2, hashMap);
            } else {
                n3 = recyclerView$B instanceof av2_1;
                if (n3 != 0) {
                    int n8;
                    recyclerView$B = (av2_1)recyclerView$B;
                    View view = recyclerView$B.itemView;
                    n4 = R$id.clear_all_tv;
                    view = (TextView)view.findViewById(n4);
                    object = new zv2_0((av2_1)recyclerView$B, n7);
                    view.setOnClickListener((View.OnClickListener)object);
                    n3 = mz3_0.L(4);
                    n4 = 0;
                    object = null;
                    if (bl2) {
                        n8 = mz3_0.L(16);
                    } else {
                        n8 = 0;
                        hashMap = null;
                    }
                    n7 = -2;
                    object2 = new FlexboxLayoutManager$LayoutParams(n7, n7);
                    object2.setMargins(0, 0, 0, 0);
                    recyclerView$B = ((av2_1)recyclerView$B).b;
                    if (recyclerView$B != null) {
                        recyclerView$B.setLayoutParams((ViewGroup.LayoutParams)object2);
                    }
                    if (recyclerView$B != null) {
                        recyclerView$B.setPadding(n3, n8, 0, 0);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 1;
        String string3 = "inflate(...)";
        if (n3 != n4) {
            n4 = 2;
            yv2_1 yv2_12 = this.b;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    string2 = LayoutInflater.from((Context)viewGroup.getContext());
                    int n7 = R$layout.plp_selected_quick_filters_layout;
                    View view = string2.inflate(n7, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(view, string3);
                    boolean bl2 = this.f;
                    boolean bl3 = this.h;
                    yv2_1 yv2_13 = this.b;
                    boolean bl4 = this.c;
                    recyclerView$B = new dv2_0(view, yv2_13, bl4, bl2, bl3);
                } else {
                    string2 = LayoutInflater.from((Context)viewGroup.getContext());
                    int n8 = R$layout.plp_selected_quick_filter_clear_all_layout;
                    viewGroup = string2.inflate(n8, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
                    recyclerView$B = new av2_1((View)viewGroup, yv2_12);
                }
            } else {
                string2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n10 = R$layout.plp_settings_quick_filter_item_view;
                viewGroup = string2.inflate(n10, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
                n4 = (int)(this.h ? 1 : 0);
                recyclerView$B = new xv2_1((View)viewGroup, yv2_12, n4 != 0);
            }
        } else {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n14 = R$layout.plp_selected_quick_filters_layout;
            View view = string2.inflate(n14, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(view, string3);
            boolean bl5 = this.f;
            boolean bl6 = this.h;
            yv2_1 yv2_14 = this.b;
            boolean bl7 = this.c;
            recyclerView$B = new dv2_0(view, yv2_14, bl7, bl5, bl6);
        }
        return recyclerView$B;
    }
}

