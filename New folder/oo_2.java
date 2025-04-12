/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OO
 */
public final class oo_2
extends RecyclerView$B
implements View.OnClickListener {
    public final TextView a;
    public final LinearLayout b;

    public oo_2(View view, j82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "mOnCartClickListener");
        super(view);
        view = this.itemView;
        int n3 = R$id.row_offer_title_tv_title;
        view = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        this.a = view;
        view = this.itemView;
        int n4 = R$id.offer_title_parent_layout;
        view = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (LinearLayout)view;
        this.b = view;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}

