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

public final class ka2$a
extends RecyclerView$B {
    public final View a;
    public final ImageView b;
    public final RelativeLayout c;

    public ka2$a(View view) {
        Intrinsics.checkNotNullParameter(view, "rowView");
        super(view);
        this.a = view;
        int n3 = R$id.row_orderlist_closet_imv;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.b = view2;
        n3 = R$id.row_orderlist_closet;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (RelativeLayout)view;
        this.c = view;
    }
}

