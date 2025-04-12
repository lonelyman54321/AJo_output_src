/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from DG
 */
public final class dg_1
extends uv_2
implements View.OnClickListener {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final TextView i;

    public dg_1(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.img_product;
        i82_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (ImageView)i82_02;
        this.a = i82_02;
        n3 = R$id.item_name;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.b = i82_02;
        n3 = R$id.color;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.c = i82_02;
        n3 = R$id.color_txt;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.d = i82_02;
        n3 = R$id.size;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.e = i82_02;
        n3 = R$id.size_txt;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.f = i82_02;
        n3 = R$id.quantity;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (TextView)i82_02;
        this.g = i82_02;
        n3 = R$id.row_cc_itemlist;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        this.h = i82_02;
        int n4 = R$id.item_brand;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.i = view;
        i82_02.setOnClickListener(this);
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.row_cc_itemlist;
        if (n3 == n4 && (object2 = this.getMOnCCClickListener()) != null) {
            object = object.getTag();
            n4 = 8;
            object2.onViewItemClick(object, n4);
        }
    }

    public final void setData(Object object, int n3) {
        boolean bl2;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
        object = (CartEntry)object;
        Object object2 = ((CartEntry)object).getProduct();
        if (object2 == null) {
            return;
        }
        object2 = ((CartEntry)object).getProduct();
        Object object3 = mz3_0.p((Product)object2);
        Object object4 = this.h;
        Object object5 = ((CartEntry)object).getEntryNumber();
        object4.setTag(object5);
        object5 = this.a;
        boolean bl3 = false;
        object4 = this;
        uv_2.loadImage$default(this, (String)object3, (ImageView)object5, null, 4, null);
        object4 = mz3_0.o((Product)object2);
        boolean bl4 = kotlin.text.b.k((CharSequence)object4);
        object5 = this.d;
        Object object6 = this.c;
        int n4 = 8;
        if (bl4) {
            object6.setVisibility(n4);
            object5.setVisibility(n4);
        } else {
            object6.setVisibility(0);
            object5.setVisibility(0);
            object6.setText((CharSequence)object4);
        }
        object4 = ((Product)object2).getName();
        boolean bl5 = TextUtils.isEmpty((CharSequence)object4);
        object3 = "";
        object4 = bl5 ? object3 : ((Product)object2).getName();
        object5 = Y63.a((CartEntry)object);
        object6 = Y63.d((CartEntry)object);
        TextView textView = this.f;
        String string2 = "null";
        TextView textView2 = this.b;
        TextView textView3 = this.e;
        if ((object5 == null || (bl2 = kotlin.text.b.k((CharSequence)object5))) && (bl2 = string2.equalsIgnoreCase((String)object6))) {
            object5 = hv3_0.i((CartEntry)object);
            textView3.setVisibility(0);
            textView.setVisibility(0);
            if (object5 != null && !(bl3 = kotlin.text.b.k((CharSequence)object5))) {
                object3 = object5;
            }
            textView3.setText((CharSequence)object3);
            textView2.setText((CharSequence)object4);
        } else {
            textView3.setVisibility(n4);
            textView.setVisibility(n4);
            bl4 = string2.equalsIgnoreCase((String)object6);
            if (bl4) {
                textView2.setText((CharSequence)object4);
            } else {
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append(" | ");
                ((StringBuilder)object3).append((String)object5);
                object4 = ((StringBuilder)object3).toString();
                textView2.setText((CharSequence)object4);
            }
        }
        object4 = ((CartEntry)object).getQuantity();
        object = object4 == null ? Integer.valueOf(0) : ((CartEntry)object).getQuantity();
        object4 = this.g;
        object = ((Integer)object).toString();
        object4.setText((CharSequence)object);
        object = this.i;
        object2 = ((Product)object2).getBrandName();
        object.setText((CharSequence)object2);
    }
}

