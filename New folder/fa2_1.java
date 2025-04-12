/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fA2
 */
public final class fa2_1
extends RecyclerView$f {
    public static final fA2$a Companion;
    public final c92 a;
    public final List b;

    static {
        fA2$a fA2$a;
        Companion = fA2$a = new Object();
    }

    public fa2_1(c92 c922, List list) {
        Intrinsics.checkNotNullParameter(c922, "sizeClickListener");
        this.a = c922;
        this.b = list;
    }

    public final int getItemCount() {
        int n3;
        List list = this.b;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4 = 1;
        List list = this.b;
        if (list != null) {
            String string2 = ((ProductOptionVariant)list.get(n3)).getValue();
            int n7 = 0;
            list = null;
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
        recyclerView$B = (Z63)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = null;
        if (n3 != 0) {
            LinearLayout linearLayout = ((Z63)recyclerView$B).b;
            Intrinsics.checkNotNull(linearLayout);
            n4 = mz3_0.d(6);
            linearLayout.setPadding(n4, 0, 0, 0);
        } else {
            LinearLayout linearLayout = ((Z63)recyclerView$B).b;
            Intrinsics.checkNotNull(linearLayout);
            linearLayout.setPadding(0, 0, 0, 0);
        }
        object = this.b;
        Intrinsics.checkNotNull(object);
        object = (ProductOptionVariant)object.get(n3);
        int n7 = this.getItemViewType(n3);
        n4 = 2;
        if (n7 == n4) {
            ((Z63)recyclerView$B).w((ProductOptionVariant)object, n3);
        } else {
            ((Z63)recyclerView$B).w((ProductOptionVariant)object, n3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 2;
        String string3 = "null cannot be cast to non-null type android.widget.TextView";
        String string4 = "null cannot be cast to non-null type android.widget.LinearLayout";
        String string5 = "onSizeClickListener";
        String string6 = "view";
        c92 c922 = this.a;
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_pdp_variable_size;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullParameter(viewGroup, string6);
            Intrinsics.checkNotNullParameter(c922, string5);
            object = new Z63((View)viewGroup, c922);
            n4 = R$id.row_pdp_variable_size_layout;
            string2 = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(string2, string4);
            string2 = (LinearLayout)string2;
            object.b = string2;
            n4 = R$id.row_pdp_variable_size_tv;
            viewGroup = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(viewGroup, string3);
            viewGroup = (TextView)viewGroup;
            object.a = viewGroup;
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_pdp_fixed_size;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullParameter(viewGroup, string6);
            Intrinsics.checkNotNullParameter(c922, string5);
            object = new Z63((View)viewGroup, c922);
            n4 = R$id.row_pdp_fixed_size_layout;
            string2 = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(string2, string4);
            string2 = (LinearLayout)string2;
            object.b = string2;
            n4 = R$id.row_pdp_fixed_size_tv;
            viewGroup = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(viewGroup, string3);
            viewGroup = (TextView)viewGroup;
            object.a = viewGroup;
        }
        return object;
    }
}

