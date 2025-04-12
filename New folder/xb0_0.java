/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
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
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XB0
 */
public final class xb0_0
extends RecyclerView$f
implements View.OnClickListener {
    public final String a;
    public final List b;
    public final XB0$c c;
    public boolean d;
    public int e;
    public final boolean f;

    public xb0_0(XB0$c xB0$c, ArrayList arrayList, boolean bl2, int n3, boolean bl3, String string2) {
        this.a = string2;
        this.b = arrayList;
        this.c = xB0$c;
        this.d = bl2;
        this.e = n3;
        this.f = bl3;
    }

    public final int getItemCount() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    public final int getItemViewType(int n3) {
        List list = this.b;
        Intrinsics.checkNotNull(list);
        return ((j33)list.get((int)n3)).a;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int bl2 = this.getItemViewType(n3);
        int n4 = 2;
        String string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartDeliveryAddress";
        Object object2 = null;
        List list = this.b;
        if (bl2 == n4) {
            recyclerView$B = (XB0$b)recyclerView$B;
            if (list != null && (object = (j33)list.get(n3)) != null) {
                object2 = ((j33)object).b;
            }
            Intrinsics.checkNotNull(object2, string2);
            object2 = (CartDeliveryAddress)object2;
            int n7 = XB0$b.t;
            boolean bl3 = false;
            object = null;
            ((XB0$b)recyclerView$B).x((CartDeliveryAddress)object2, n3, false);
        } else {
            int n8 = 4;
            if (bl2 == n8) {
                recyclerView$B = (XB0$b)recyclerView$B;
                if (list != null && (object = (j33)list.get(n3)) != null) {
                    object2 = ((j33)object).b;
                }
                Intrinsics.checkNotNull(object2, string2);
                boolean bl4 = this.f;
                ((XB0$b)recyclerView$B).x((CartDeliveryAddress)object2, n3, bl4);
            }
        }
    }

    public final void onClick(View object) {
        int n3;
        Object object2;
        int n4;
        XB0$c xB0$c = this.c;
        if (xB0$c == null) {
            return;
        }
        int n7 = 0;
        Object object3 = null;
        if (object != null) {
            n4 = object.getId();
            object2 = n4;
        } else {
            n4 = 0;
            object2 = null;
        }
        int n8 = R$id.tv_add_new_address;
        if (object2 != null && (n3 = ((Integer)object2).intValue()) == n8) {
            xB0$c.J3();
        } else {
            n8 = R$id.cvAddress;
            if (object2 != null && (n3 = ((Integer)object2).intValue()) == n8) {
                object = object.getTag();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
                object = (Integer)object;
                int n10 = (Integer)object;
                object2 = this.b;
                if (object2 != null) {
                    object2 = (j33)object2.get(n10);
                } else {
                    n4 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object3 = ((j33)object2).b;
                }
                object2 = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartDeliveryAddress";
                Intrinsics.checkNotNull(object3, (String)object2);
                object3 = (CartDeliveryAddress)object3;
                xB0$c.o9((CartDeliveryAddress)object3, n10);
            } else {
                int n14 = R$id.cvViewMore;
                if (object2 != null && (n7 = ((Integer)object2).intValue()) == n14) {
                    n14 = (int)(this.d ? 1 : 0);
                    if (n14 != 0) {
                        xB0$c.x8();
                    } else {
                        xB0$c.o2();
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        int n4 = 3;
        String string3 = "inflate(...)";
        if (n3 == n4) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_ex_return_add_address;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
            Intrinsics.checkNotNullParameter(viewGroup, "view");
            recyclerView$B = new RecyclerView$B((View)viewGroup);
            n4 = R$id.tv_add_new_address;
            viewGroup = viewGroup.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(viewGroup, "findViewById(...)");
            viewGroup = (TextView)viewGroup;
            string2 = "null cannot be cast to non-null type android.view.View.OnClickListener";
            Intrinsics.checkNotNull(this, string2);
            viewGroup.setOnClickListener((View.OnClickListener)this);
        } else {
            n4 = 4;
            if (n3 == n4) {
                string2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n8 = R$layout.row_ex_return_address_revamp;
                viewGroup = string2.inflate(n8, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
                recyclerView$B = new XB0$b(this, (View)viewGroup);
            } else {
                string2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n10 = R$layout.row_ex_return_address_revamp;
                viewGroup = string2.inflate(n10, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string3);
                recyclerView$B = new XB0$b(this, (View)viewGroup);
            }
        }
        return recyclerView$B;
    }
}

