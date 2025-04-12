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
 * Renamed from Z2
 */
public final class z2_0
extends RecyclerView$B {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;

    public z2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.row_ap_IV;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.a = view2;
        n3 = R$id.row_ap_header;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.row_ap_desc;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.row_ap_date_info;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.d = view2;
        n3 = R$id.row_ap_amnt;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.e = view2;
        n3 = R$id.row_ap_date_info_2;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.f = view2;
        n3 = R$id.row_ap_faded_layer;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.g = view;
    }
}

