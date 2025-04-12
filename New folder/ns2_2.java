/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ns2
 */
public final class ns2_2
extends rw_2 {
    public final TextView b;

    public ns2_2(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        super(view);
        int n3 = R$id.row_offer_title_tv_title;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.offer_title_parent_layout;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        ai0_2.t((View)((LinearLayout)view));
    }
}

