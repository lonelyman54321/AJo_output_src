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
 * Renamed from bH
 */
public final class bh_2
extends RecyclerView$B {
    public final ZG$a a;
    public final View b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final View f;

    public bh_2(View view, ZG$a zG$a) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(zG$a, "listener");
        super(view);
        this.a = zG$a;
        int n3 = R$id.row_category_divider;
        zG$a = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(zG$a, string2);
        this.b = zG$a;
        n3 = R$id.row_category_imv;
        zG$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(zG$a, string2);
        zG$a = (ImageView)zG$a;
        this.c = zG$a;
        n3 = R$id.row_category_tv_title;
        zG$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(zG$a, string2);
        zG$a = (TextView)zG$a;
        this.d = zG$a;
        n3 = R$id.row_category_exp_imv_next;
        zG$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(zG$a, string2);
        zG$a = (ImageView)zG$a;
        this.e = zG$a;
        n3 = R$id.row_category;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.f = view;
    }
}

