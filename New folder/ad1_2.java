/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AD1
 */
public final class ad1_2
extends RecyclerView$B {
    public final ld1$a_0 a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final View e;

    public ad1_2(View view, ld1$a_0 ld1$a_0) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(ld1$a_0, "listener");
        super(view);
        this.a = ld1$a_0;
        int n3 = R$id.row_category_divider;
        ld1$a_0 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ld1$a_0, string2);
        this.b = ld1$a_0;
        n3 = R$id.row_category_tv_title;
        ld1$a_0 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ld1$a_0, string2);
        ld1$a_0 = (TextView)ld1$a_0;
        this.c = ld1$a_0;
        n3 = R$id.row_category_lbl_new;
        ld1$a_0 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ld1$a_0, string2);
        ld1$a_0 = (TextView)ld1$a_0;
        this.d = ld1$a_0;
        n3 = R$id.row_category;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.e = view;
    }
}

