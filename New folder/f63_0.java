/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from F63
 */
public final class f63_0
extends RecyclerView$f {
    public static final F63$a Companion;
    public final F63$d a;
    public final List b;

    static {
        F63$a f63$a;
        Companion = f63$a = new Object();
    }

    public f63_0(F63$d f63$d, List list) {
        Intrinsics.checkNotNullParameter(f63$d, "sizeClickListener");
        this.a = f63$d;
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
        recyclerView$B = (F63$b)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "viewHolder");
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        object = (ProductOptionVariant)object.get(n3);
        int n4 = this.getItemViewType(n3);
        int n7 = 2;
        if (n4 == n7) {
            ((F63$b)recyclerView$B).w((ProductOptionVariant)object, n3);
        } else {
            ((F63$b)recyclerView$B).w((ProductOptionVariant)object, n3);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 2;
        String string3 = "null cannot be cast to non-null type android.widget.TextView";
        String string4 = "onSizeClickListener";
        String string5 = "view";
        F63$d f63$d = this.a;
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_wishlist_variable_size_refresh;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullParameter(viewGroup, string5);
            Intrinsics.checkNotNullParameter(f63$d, string4);
            object = new F63$b((View)viewGroup, f63$d);
            n4 = R$id.row_wishlist_variable_size_tv;
            viewGroup = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(viewGroup, string3);
            viewGroup = (TextView)viewGroup;
            object.a = viewGroup;
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_pdp_fixed_soze_revamp;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullParameter(viewGroup, string5);
            Intrinsics.checkNotNullParameter(f63$d, string4);
            object = new F63$b((View)viewGroup, f63$d);
            n4 = R$id.row_pdp_fixed_size_tv;
            viewGroup = viewGroup.findViewById(n4);
            Intrinsics.checkNotNull(viewGroup, string3);
            viewGroup = (TextView)viewGroup;
            object.a = viewGroup;
        }
        return object;
    }
}

