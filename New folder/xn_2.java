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
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xN
 */
public final class xn_2
extends RecyclerView$f {
    public Integer a;
    public final List b;

    public xn_2(List list, Integer n3) {
        this.a = n3;
        this.b = list;
    }

    public final int getItemCount() {
        int n3;
        Integer n4 = this.a;
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4 = 1;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n7 = recyclerView$B instanceof an_2;
        if (n7 != 0) {
            Object object2;
            recyclerView$B = (an_2)recyclerView$B;
            object = this.b;
            String string2 = null;
            if (object != null) {
                object2 = (GiftProducts$Quantity)CollectionsKt.N(n3, (List)object);
            } else {
                n3 = 0;
                object2 = null;
            }
            recyclerView$B.getClass();
            n7 = R$drawable.ic_gwp_default_image;
            boolean bl2 = og1_1.b();
            if (bl2) {
                n7 = R$drawable.ic_gwp_luxe_default_image;
            }
            Object object3 = new da$a();
            ((da$a)object3).k = n4;
            ((da$a)object3).a = n7;
            ((da$a)object3).b = n7;
            ((da$a)object3).c = n7;
            ((da$a)object3).s = n4;
            n7 = R$string.acc_icon_product_placeholder;
            object = hv3_0.K(n7);
            ((da$a)object3).b((String)object);
            if (object2 != null) {
                object = ((GiftProducts$Quantity)object2).getImage();
            } else {
                n7 = 0;
                object = null;
            }
            ((da$a)object3).n = object;
            object = ((an_2)recyclerView$B).d;
            ((da$a)object3).u = object;
            ((da$a)object3).i = n4;
            ((da$a)object3).a();
            object = h40_0.a;
            object = h40_0.D(false).getFreeTextOnProduct();
            object3 = ((an_2)recyclerView$B).b;
            object3.setText((CharSequence)object);
            n7 = R$string.cart_gwp_qty;
            if (object2 != null) {
                object3 = ((GiftProducts$Quantity)object2).getQty();
            } else {
                bl2 = false;
                object3 = null;
            }
            object3 = String.valueOf(object3);
            Object object4 = new Object[n4];
            object4[0] = object3;
            object4 = hv3_0.L(n7, (Object[])object4);
            object = ((an_2)recyclerView$B).c;
            object.setText((CharSequence)object4);
            if (object2 != null) {
                string2 = ((GiftProducts$Quantity)object2).getProductTitle();
            }
            object4 = ((an_2)recyclerView$B).a;
            object4.setText((CharSequence)string2);
            if (object2 != null) {
                object2 = ((GiftProducts$Quantity)object2).isReturnable();
                object4 = Boolean.TRUE;
                n3 = (int)(Intrinsics.areEqual(object2, object4) ? 1 : 0);
            } else {
                n3 = 0;
                object2 = null;
            }
            if (n3 != 0) {
                recyclerView$B = ((an_2)recyclerView$B).e;
                if (recyclerView$B != null) {
                    object2 = h40_0.D(false).getReturnText();
                    recyclerView$B.setText((CharSequence)object2);
                }
                if (recyclerView$B != null) {
                    ai0_2.B((View)recyclerView$B);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        boolean bl2 = og1_1.b();
        if (bl2) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.cart_gwp_items_holder_luxe;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.cart_gwp_items_holder;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        an_2 an_22 = new an_2((View)viewGroup);
        return an_22;
    }
}

