/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KV1
 */
public final class kv1_1
extends RecyclerView$f {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public kv1_1(ArrayList arrayList, boolean bl2, boolean bl3, boolean bl4) {
        this.a = arrayList;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
    }

    public final void g() {
        List list = this.a;
        if (list != null) {
            list.clear();
        }
        this.notifyDataSetChanged();
    }

    public final int getItemCount() {
        Object object = this.a;
        if (object != null) {
            int n3 = object.size();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        return (Integer)object;
    }

    public final void h(ArrayList arrayList, boolean bl2) {
        Intrinsics.checkNotNullParameter(arrayList, "featureDataList");
        List list = this.a;
        if (list != null) {
            list.addAll(arrayList);
        }
        this.e = bl2;
        this.notifyDataSetChanged();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        block18: {
            block17: {
                boolean bl2;
                String string2;
                Object object;
                recyclerView$B = (KV1$a)recyclerView$B;
                Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
                List list = this.a;
                int n7 = 0;
                Object object2 = null;
                if (list != null) {
                    object = (FeatureData)list.get(n3);
                } else {
                    n4 = 0;
                    object = null;
                }
                AjioTextView ajioTextView = ((KV1$a)recyclerView$B).a;
                if (object != null) {
                    string2 = ((FeatureData)object).getName();
                } else {
                    bl2 = false;
                    string2 = null;
                }
                ajioTextView.setText(string2);
                ajioTextView = null;
                if (object != null && (object = ((FeatureData)object).getFeatureValues()) != null && (object = (FeatureValue)object.get(0)) != null) {
                    object2 = ((FeatureValue)object).getValue();
                }
                object = ((KV1$a)recyclerView$B).b;
                object.setText(object2);
                n7 = this.f;
                bl2 = this.c;
                if (n7 != 0 && (bl2 || (n7 = (int)(this.d ? 1 : 0)) != 0)) {
                    object2 = TextUtils.TruncateAt.END;
                    object.setEllipsize((TextUtils.TruncateAt)object2);
                    object2 = h40_0.a;
                    object2 = h40_0.k();
                    String string3 = "max_line_for_value";
                    n7 = object2.optInt(string3);
                    object.setMaxLines(n7);
                } else {
                    n7 = 20;
                    object.setMaxLines(n7);
                }
                n7 = (int)(this.b ? 1 : 0);
                recyclerView$B = ((KV1$a)recyclerView$B).c;
                n4 = 8;
                if (n7 != 0) {
                    int n8;
                    n7 = this.getItemCount() % 2;
                    if (n7 == 0) {
                        int n10;
                        if ((list != null && n3 == (n7 = list.size() + -1) || list != null && n3 == (n7 = list.size() + -2)) && (n7 = (int)(this.e ? 1 : 0)) == 0) {
                            recyclerView$B.setVisibility(n4);
                        } else {
                            recyclerView$B.setVisibility(0);
                        }
                        object2 = h40_0.a;
                        n7 = (int)(h40_0.n2() ? 1 : 0);
                        if (n7 != 0) return;
                        if (list != null && n3 == (n10 = list.size() + -1)) {
                            return;
                        }
                        recyclerView$B.setVisibility(0);
                        return;
                    }
                    if (list != null && n3 == (n8 = list.size() + -1) && (n3 = (int)(this.e ? 1 : 0)) == 0) {
                        recyclerView$B.setVisibility(n4);
                        return;
                    }
                    recyclerView$B.setVisibility(0);
                    return;
                }
                if (!bl2) return;
                if (list != null && n3 == (n7 = list.size() + -1)) break block17;
                if (list == null || n3 != (n7 = list.size() + -2)) break block18;
                n3 = (int)(h40_0.a.p2() ? 1 : 0);
                if (n3 == 0 || (n3 = list.size() % 2) != 0) break block18;
            }
            if ((n3 = (int)(this.e ? 1 : 0)) != 0) {
                recyclerView$B.setVisibility(0);
                return;
            }
        }
        recyclerView$B.setVisibility(n4);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.list_item_grid_new_pdp_details;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        object = new KV1$a((View)viewGroup);
        return object;
    }
}

