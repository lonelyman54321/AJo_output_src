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
 * Renamed from Bq2
 */
public final class bq2_1
extends RecyclerView$B {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public bq2_1(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.row_pp_IV;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.a = view2;
        n3 = R$id.row_pp_header;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.row_pp_desc;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.row_pp_date_info;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.d = view2;
        n3 = R$id.row_pp_amnt;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.e = view2;
        n3 = R$id.row_pp_date_info_2;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.f = view;
    }
}

