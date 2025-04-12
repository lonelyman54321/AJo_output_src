/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class K23
extends RecyclerView$B
implements View.OnClickListener {
    public final p23 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final ImageView h;
    public final View i;
    public final ImageView j;
    public final ImageView k;
    public int l;

    public K23(View view, p23 p232) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(p232, "sharedWithMeAdapterListener");
        super(view);
        this.a = p232;
        int n3 = R$id.img_product;
        p232 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (ImageView)p232;
        this.b = p232;
        n3 = R$id.item_brand;
        p232 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (TextView)p232;
        this.c = p232;
        n3 = R$id.item_name;
        p232 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (TextView)p232;
        this.d = p232;
        n3 = R$id.item_price;
        p232 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (TextView)p232;
        this.e = p232;
        n3 = R$id.item_old_price;
        p232 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (TextView)p232;
        this.f = p232;
        n3 = R$id.add_to_bag;
        p232 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(p232, string2);
        p232 = (ImageView)p232;
        this.g = p232;
        int n4 = R$id.delete_item;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.h = view2;
        int n7 = R$id.pllVUnselected;
        View view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, string2);
        this.i = view3;
        n7 = R$id.pllBgGrey;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, string2);
        view3 = (ImageView)view3;
        this.j = view3;
        n7 = R$id.pllIvSelected;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, string2);
        view3 = (ImageView)view3;
        this.k = view3;
        this.l = -1;
        view.setOnClickListener((View.OnClickListener)this);
        p232.setOnClickListener(this);
        view2.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.itemParentLayout;
        ImageView imageView = this.k;
        View view2 = this.i;
        p23 p232 = this.a;
        int n7 = 8;
        if (n3 == n4) {
            view = this.j;
            int n8 = view.getVisibility();
            if (n8 == (n3 = 4) && (n8 = view2.getVisibility()) == n7 && (n8 = imageView.getVisibility()) == n7) {
                n8 = this.l;
                p232.u5(n8);
            } else {
                n8 = this.l;
                p232.C5(n8);
            }
        } else {
            n3 = view.getId();
            if (n3 == (n4 = R$id.add_to_bag)) {
                int n10 = view2.getVisibility();
                if (n10 == n7 && (n10 = imageView.getVisibility()) == n7) {
                    n10 = this.l;
                    p232.U1(n10);
                }
            } else {
                int n14 = view.getId();
                if (n14 == (n3 = R$id.delete_item) && (n14 = view2.getVisibility()) == n7 && (n14 = imageView.getVisibility()) == n7) {
                    n14 = this.l;
                    p232.O2(n14);
                }
            }
        }
    }
}

