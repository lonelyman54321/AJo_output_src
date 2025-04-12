/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oa2
 */
public final class oa2_1
extends RecyclerView$B {
    public final View a;
    public final g82_0 b;
    public final boolean c;
    public final TextView d;
    public final RelativeLayout e;
    public final TextView f;

    public oa2_1(View view, ap0_0 ap0_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = view;
        this.b = ap0_02;
        this.c = true;
        int n3 = R$id.lodcTvOrderDateRange;
        ap0_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ap0_02, string2);
        ap0_02 = (TextView)ap0_02;
        this.d = ap0_02;
        n3 = R$id.lodcCvChangeOrderDateRange;
        ap0_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ap0_02, string2);
        ap0_02 = (RelativeLayout)ap0_02;
        this.e = ap0_02;
        n3 = R$id.lodcTvChangeOrderDateRange;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.f = view;
    }
}

