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
 * Renamed from Wt3
 */
public final class wt3_0
extends RecyclerView$B {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public wt3_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.how_to_row_icon_iv;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        this.a = view2;
        n3 = R$id.how_to_row_heading_tv;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.how_to_row_desc_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
    }
}

