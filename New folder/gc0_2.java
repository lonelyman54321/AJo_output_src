/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gc0
 */
public final class gc0_2
extends nw_1 {
    public final TextView a;

    public gc0_2(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.coupon_list_header_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.a = view;
    }

    public final void w(List object, List list, int n3) {
        object = hv3_0.K(R$string.not_applicable_coupon_header_refresh);
        this.a.setText((CharSequence)object);
    }
}

