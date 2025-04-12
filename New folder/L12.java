/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class L12
extends RecyclerView$f {
    public static final L12$a Companion;
    public final c92 a;
    public final List b;
    public final oq2_0 c;
    public final yi2_1 d;
    public final boolean e;
    public final boolean f;
    public final vb2_1 g;
    public boolean h;
    public final ArrayList i;

    static {
        L12$a l12$a;
        Companion = l12$a = new Object();
    }

    public L12(c92 arrayList, ArrayList object, oq2_0 object2, yi2_1 yi2_12, boolean bl2, boolean bl3, vb2_1 vb2_12, boolean bl4) {
        Intrinsics.checkNotNullParameter(arrayList, "sizeClickListener");
        Intrinsics.checkNotNullParameter(object2, "rowWidthCallBack");
        String string2 = "pdpInfoProvider";
        Intrinsics.checkNotNullParameter(yi2_12, string2);
        this.a = arrayList;
        this.b = object;
        this.c = object2;
        this.d = yi2_12;
        this.e = bl2;
        this.f = bl3;
        this.g = vb2_12;
        this.h = bl4;
        if (object != null) {
            int n3 = yx_2.o((Iterable)object, 10);
            arrayList = new ArrayList<Object>(n3);
            object = object.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = ((ProductOptionVariant)object.next()).clone();
                arrayList.add(object2);
            }
        } else {
            arrayList = null;
        }
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.ProductOptionVariant>");
        this.i = arrayList;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4 = 1;
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            String string2 = ((ProductOptionVariant)arrayList.get(n3)).getValue();
            int n7 = 0;
            arrayList = null;
            if (string2 != null) {
                int n8 = string2.length() - n4;
                int n10 = 0;
                boolean bl2 = false;
                while (n10 <= n8) {
                    int n14 = !bl2 ? n10 : n8;
                    n14 = string2.charAt(n14);
                    int n15 = 32;
                    n14 = Intrinsics.compare(n14, n15);
                    n14 = n14 <= 0 ? 1 : 0;
                    if (!bl2) {
                        if (n14 == 0) {
                            bl2 = true;
                            continue;
                        }
                        ++n10;
                        continue;
                    }
                    if (n14 == 0) break;
                    n8 += -1;
                }
                string2 = ((Object)string2.subSequence(n10, n8 += n4)).toString();
            } else {
                n3 = 0;
                string2 = null;
            }
            if (string2 != null) {
                n7 = string2.length();
            }
            if (n7 > (n3 = 3)) {
                return 2;
            }
        }
        return n4;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        recyclerView$B = (t32_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = null;
        if (n3 != 0) {
            LinearLayout linearLayout = ((t32_0)recyclerView$B).g;
            Intrinsics.checkNotNull(linearLayout);
            n4 = mz3_0.d(6);
            linearLayout.setPadding(n4, 0, 0, 0);
        } else {
            LinearLayout linearLayout = ((t32_0)recyclerView$B).g;
            Intrinsics.checkNotNull(linearLayout);
            linearLayout.setPadding(0, 0, 0, 0);
        }
        object = this.b;
        object = object != null ? (ProductOptionVariant)object.get(n3) : null;
        int n7 = this.getItemViewType(n3);
        n4 = 2;
        if (n7 == n4) {
            if (object != null) {
                ((t32_0)recyclerView$B).x((ProductOptionVariant)object, n3);
            }
        } else if (object != null) {
            ((t32_0)recyclerView$B).x((ProductOptionVariant)object, n3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(object, string2);
        object.getContext();
        int n4 = 2;
        if (n3 == n4) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.row_pdp_fixed_similar_to_size_oos;
            View view = layoutInflater.inflate(n4, object, false);
            boolean bl2 = this.h;
            boolean bl3 = this.e;
            boolean bl4 = this.f;
            c92 c922 = this.a;
            oq2_0 oq2_02 = this.c;
            yi2_1 yi2_12 = this.d;
            vb2_1 vb2_12 = this.g;
            object = new iz1_2(view, c922, oq2_02, yi2_12, bl3, bl4, vb2_12, bl2);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
            n4 = R$layout.row_pdp_fixed_similar_to_size_oos;
            View view = layoutInflater.inflate(n4, object, false);
            boolean bl5 = this.h;
            boolean bl6 = this.e;
            boolean bl7 = this.f;
            c92 c923 = this.a;
            oq2_0 oq2_03 = this.c;
            yi2_1 yi2_13 = this.d;
            vb2_1 vb2_13 = this.g;
            object = new iz1_2(view, c923, oq2_03, yi2_13, bl6, bl7, vb2_13, bl5);
        }
        return object;
    }
}

