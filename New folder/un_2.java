/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from uN
 */
public final class un_2
extends RecyclerView$B {
    public final RecyclerView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public xn_2 f;
    public String g;
    public final String h;
    public int i;
    public String j;

    public un_2(View object, j82_0 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.id_cart_gwp_list;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.a = object2 = (RecyclerView)object2;
        n3 = R$id.id_cart_gwp_title;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.b = object2;
        n3 = R$id.id_cart_gwp_sub_title;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (TextView)object2;
        this.c = object2;
        n3 = R$id.id_cart_gwp_show_more_less;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.d = object;
        this.e = true;
        object = "";
        this.g = object;
        this.h = object2 = hv3_0.K(R$string.gwp_show_less);
        this.j = object;
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushCartInteractionsEvent("free gift widget summary loaded", "", "bag_interaction", "bag screen", "bag interactions", null);
    }

    public final void w(ArrayList arrayList) {
        Object object;
        Object object2;
        int n3;
        un_2 un_22 = this;
        int n4 = 1;
        Object object3 = null;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            object2 = null;
        }
        un_22.i = n3;
        Object object4 = "+";
        object2 = Gj0.b(n3 -= n4, (String)object4, " More");
        un_22.g = object2;
        int n7 = un_22.i;
        TextView textView = un_22.d;
        if (n7 > n4) {
            un_22.e = n4;
            textView.setText((CharSequence)object2);
            n3 = (int)(og1_1.b() ? 1 : 0);
            if (n3 != 0) {
                n3 = textView.getPaintFlags() | 8;
                textView.setPaintFlags(n3);
            }
            ai0_2.B((View)textView);
        } else {
            un_22.e = false;
            ai0_2.i((View)textView);
        }
        object4 = new ArrayList();
        String string2 = "next(...)";
        Object object5 = "iterator(...)";
        String string3 = null;
        if (arrayList != null) {
            boolean bl2;
            object = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(object, (String)object5);
            while (bl2 = object.hasNext()) {
                int n8;
                boolean bl3;
                Object object6 = object.next();
                Intrinsics.checkNotNullExpressionValue(object6, string2);
                object6 = (CartEntry)object6;
                Object object7 = ((CartEntry)object6).getProduct().getCode();
                Object object8 = "";
                Object object9 = object7 == null ? object8 : object7;
                Integer n10 = ((CartEntry)object6).getQuantity();
                object7 = ((CartEntry)object6).getProduct().getImages();
                if (object7 != null && !(bl3 = object7.isEmpty())) {
                    object7 = ((CartEntry)object6).getProduct();
                    if (object7 != null) {
                        object7 = ((Product)object7).getImages();
                    } else {
                        bl3 = false;
                        object7 = null;
                    }
                    Intrinsics.checkNotNull(object7);
                    object7 = ((ProductImage)object7.get(0)).getUrl();
                    if (object7 != null) {
                        object8 = object7;
                    }
                }
                String string4 = object8;
                object7 = new StringBuilder();
                boolean bl4 = ((CartEntry)object6).isReturnable();
                Object object10 = ((CartEntry)object6).getProduct();
                if (object10 != null) {
                    object10 = ((Product)object10).getBrandName();
                } else {
                    n8 = 0;
                    object10 = null;
                }
                ((StringBuilder)object7).append((String)object10);
                object10 = ((CartEntry)object6).getProduct();
                if (object10 != null) {
                    object10 = ((Product)object10).getName();
                } else {
                    n8 = 0;
                    object10 = null;
                }
                if (object10 != null && (n8 = ((String)object10).length()) != 0) {
                    object10 = " - ";
                    ((StringBuilder)object7).append((String)object10);
                    object6 = ((CartEntry)object6).getProduct();
                    if (object6 != null) {
                        object6 = ((Product)object6).getName();
                    } else {
                        bl2 = false;
                        object6 = null;
                    }
                    ((StringBuilder)object7).append((String)object6);
                }
                double d2 = 0.0;
                Double d5 = d2;
                String string5 = ((StringBuilder)object7).toString();
                Boolean bl5 = bl4;
                object10 = object6;
                object6 = new GiftProducts$Quantity((String)object9, string4, d5, string5, n10, bl5);
                ((ArrayList)object4).add(object6);
            }
        }
        object = n4;
        un_22.f = object2 = new xn_2((List)object4, (Integer)object);
        object4 = un_22.itemView.getContext();
        object2 = new LinearLayoutManager((Context)object4, n4, false);
        object4 = un_22.a;
        ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object2);
        object2 = un_22.f;
        ((RecyclerView)object4).setAdapter((RecyclerView$f)object2);
        if (arrayList != null) {
            int n14;
            object2 = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
            n7 = 0;
            object4 = null;
            while ((n14 = object2.hasNext()) != 0) {
                object5 = object2.next();
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object5 = ((CartEntry)object5).getQuantity();
                object = "getQuantity(...)";
                Intrinsics.checkNotNullExpressionValue(object5, (String)object);
                n14 = ((Number)object5).intValue();
                n7 += n14;
            }
        } else {
            n7 = 0;
            object4 = null;
        }
        un_22.j = object2 = String.valueOf(n7);
        object2 = h40_0.a;
        object2 = h40_0.D(false).getCartUnlockFreebies();
        if (object2 != null) {
            object4 = un_22.j;
            string2 = "%x";
            string3 = kotlin.text.b.n((String)object2, string2, (String)object4, false);
        }
        un_22.b.setText(string3);
        object3 = h40_0.D(false).getCartUnlockFreebiesDescription();
        un_22.c.setText((CharSequence)object3);
        object3 = new m6(un_22, n4);
        textView.setOnClickListener((View.OnClickListener)object3);
    }
}

