/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AN
 */
public final class an_2
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;

    public an_2(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.id_cart_gwp_title;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.id_cart_gwp_free_text;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.id_cart_gwp_qty;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.productImg;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.d = view2;
        n3 = R$id.id_cart_need_for_return;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }
}

