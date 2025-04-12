/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class k33$b
extends RecyclerView$B {
    public final ImageView a;
    public final RelativeLayout b;

    public k33$b(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.row_shipping_imv;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.a = view2;
        n3 = R$id.row_shipping_product_imv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (RelativeLayout)view;
        this.b = view;
    }
}

