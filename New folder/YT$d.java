/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class YT$d
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final View h;
    public final View i;
    public final RadioButton j;

    public YT$d(yt_0 yt_02, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.find_store_tv_name;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.find_store_tv_cod;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.find_store_tv_address;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.find_store_tv_landmark;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.d = view2;
        n3 = R$id.find_store_tv_mobile;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.e = view2;
        n3 = R$id.find_store_tv_timing;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.f = view2;
        n3 = R$id.find_store_layout_landmark;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        this.g = view2;
        n3 = R$id.find_store_layout_mobile;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        this.h = view2;
        n3 = R$id.row_find_store;
        this.i = view2 = view.findViewById(n3);
        int n4 = R$id.find_store_rb_select;
        view = (RadioButton)view.findViewById(n4);
        this.j = view;
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener)yt_02);
        }
    }
}

