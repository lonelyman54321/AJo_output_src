/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class p32
extends RecyclerView$B
implements View.OnClickListener {
    public final s82_0 a;
    public final String b;
    public final RelativeLayout c;
    public final AjioTextView d;
    public final TextView e;
    public final AjioRoundedCornerImageView f;
    public final TextView g;
    public final ImageView h;
    public String i;
    public Product j;
    public int k;

    public p32(View object, s82_0 object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(string2, "listType");
        super((View)object);
        this.a = object2;
        this.b = string2;
        object = this.itemView;
        int n3 = R$id.row_similar_product;
        object = object.findViewById(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.widget.RelativeLayout");
        object = (RelativeLayout)object;
        this.c = object;
        object = this.itemView;
        n3 = R$id.item_brand;
        object = object.findViewById(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioTextView");
        object = (AjioTextView)object;
        this.d = object;
        object = this.itemView;
        n3 = R$id.item_price;
        object = object.findViewById(n3);
        object2 = "null cannot be cast to non-null type android.widget.TextView";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (TextView)object;
        this.e = object;
        object = this.itemView;
        int n4 = R$id.img_product;
        object = object.findViewById(n4);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView");
        object = (AjioRoundedCornerImageView)((Object)object);
        this.f = object;
        string2 = this.itemView;
        int n7 = R$id.item_old_price;
        string2 = string2.findViewById(n7);
        Intrinsics.checkNotNull(string2, (String)object2);
        string2 = (TextView)string2;
        this.g = string2;
        object2 = this.itemView;
        n4 = R$id.img_promo;
        object2 = object2.findViewById(n4);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.widget.ImageView");
        object2 = (ImageView)object2;
        this.h = object2;
        object.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        int n3;
        Object object2 = null;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.save_to_list_circle;
        String string2 = "product";
        s82_0 s82_02 = this.a;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            n3 = this.getAdapterPosition();
            if (n3 < (n4 = this.k) && s82_02 != null) {
                object = this.j;
                if (object != null) {
                    object2 = object;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                object = this.i;
                n4 = 0;
                Object var7_7 = null;
                s82_02.x4((Product)object2, (String)object, false);
            }
        } else {
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            String string3 = this.i;
            ((Product)object).setCode(string3);
            if (s82_02 != null) {
                object = this.j;
                if (object != null) {
                    object2 = object;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                n3 = this.getAdapterPosition();
                string3 = this.b;
                s82_02.F((Product)object2, n3, string3);
            }
        }
    }
}

