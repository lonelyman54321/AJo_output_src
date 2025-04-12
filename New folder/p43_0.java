/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from P43
 */
public final class p43_0
extends RecyclerView$f {
    public yi2_1 a;
    public m63_0 b;
    public final ArrayList c;

    public p43_0(ArrayList object, yi2_1 arrayList, m63_0 object2) {
        Intrinsics.checkNotNullParameter(object, "sizeList");
        Intrinsics.checkNotNullParameter(arrayList, "pdpInfoProvider");
        String string2 = "sizeSelection";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.a = arrayList;
        this.b = object2;
        int n3 = yx_2.o((Iterable)object, 10);
        arrayList = new ArrayList<Object>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = ((ProductOptionVariant)object.next()).clone();
            arrayList.add(object2);
        }
        this.c = arrayList;
    }

    public final int getItemCount() {
        return this.c.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        boolean bl2;
        int n7;
        int n8;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B = (P43$a)recyclerView$B;
        Object object = this.c.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (ProductOptionVariant)object;
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "optionVariant");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object2 = ((ProductOptionVariant)object).getValue();
        int n10 = 1;
        int n14 = 0;
        Object object3 = null;
        int n15 = 32;
        if (object2 != null) {
            n8 = ((String)object2).length() - n10;
            n7 = 0;
            bl2 = false;
            while (n7 <= n8) {
                n4 = !bl2 ? n7 : n8;
                n4 = Intrinsics.compare(((String)object2).charAt(n4), n15);
                n4 = n4 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n4 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n7;
                    continue;
                }
                if (n4 == 0) break;
                n8 += -1;
            }
            object2 = com.jio.jioads.adinterfaces.a.a(n8, n10, n7, (String)object2);
        } else {
            object2 = null;
        }
        ref$ObjectRef.element = object2;
        object2 = ((P43$a)recyclerView$B).f;
        Object object4 = ((p43_0)object2).a;
        n8 = (int)(object4.E0() ? 1 : 0);
        if (n8 != 0 && (n8 = (int)((object4 = ((p43_0)object2).a).N0() ? 1 : 0)) != 0) {
            object4 = ((ProductOptionVariant)object).getBrickBrandSize();
            if (object4 != null) {
                n14 = ((String)object4).length() - n10;
                n7 = 0;
                bl2 = false;
                while (n7 <= n14) {
                    n4 = !bl2 ? n7 : n14;
                    n4 = Intrinsics.compare(((String)object4).charAt(n4), n15);
                    n4 = n4 <= 0 ? 1 : 0;
                    if (!bl2) {
                        if (n4 == 0) {
                            bl2 = true;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n4 == 0) break;
                    n14 += -1;
                }
                object3 = com.jio.jioads.adinterfaces.a.a(n14, n10, n7, (String)object4);
            }
            ref$ObjectRef.element = object3;
        }
        Object object5 = (CharSequence)ref$ObjectRef.element;
        ((P43$a)recyclerView$B).a.setText((CharSequence)object5);
        object5 = (CharSequence)ref$ObjectRef.element;
        ((P43$a)recyclerView$B).b.setText((CharSequence)object5);
        n10 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
        object3 = ((P43$a)recyclerView$B).e;
        RelativeLayout relativeLayout = ((P43$a)recyclerView$B).d;
        if (n10 != 0) {
            ai0_2.B((View)relativeLayout);
            ai0_2.i((View)object3);
        } else {
            ai0_2.B((View)object3);
            ai0_2.i((View)relativeLayout);
        }
        object5 = new O43((p43_0)object2, n3, ref$ObjectRef, (ProductOptionVariant)object);
        ((P43$a)recyclerView$B).c.setOnClickListener((View.OnClickListener)object5);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.similar_to_filter_sizes_item_layout;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        P43$a p43$a = new P43$a(this, (View)viewGroup);
        return p43$a;
    }
}

