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
 * Renamed from MQ
 */
public final class mq_1
extends RecyclerView$B {
    public final OP$a a;
    public final View b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final View f;

    public mq_1(View view, OP$a oP$a) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(oP$a, "listener");
        super(view);
        this.a = oP$a;
        int n3 = R$id.row_category_divider;
        oP$a = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(oP$a, string2);
        this.b = oP$a;
        n3 = R$id.row_category_imv;
        oP$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(oP$a, string2);
        oP$a = (ImageView)oP$a;
        this.c = oP$a;
        n3 = R$id.row_category_tv_title;
        oP$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(oP$a, string2);
        oP$a = (TextView)oP$a;
        this.d = oP$a;
        n3 = R$id.row_category_exp_imv_next;
        oP$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(oP$a, string2);
        oP$a = (ImageView)oP$a;
        this.e = oP$a;
        n3 = R$id.row_category;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.f = view;
    }
}

