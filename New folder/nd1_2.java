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
 * Renamed from ND1
 */
public final class nd1_2
extends RecyclerView$B {
    public final CD1$a a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final View e;

    public nd1_2(View view, CD1$a cD1$a) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(cD1$a, "listener");
        super(view);
        this.a = cD1$a;
        int n3 = R$id.row_category_divider;
        cD1$a = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(cD1$a, string2);
        this.b = cD1$a;
        n3 = R$id.row_category_tv_title;
        cD1$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(cD1$a, string2);
        cD1$a = (TextView)cD1$a;
        this.c = cD1$a;
        n3 = R$id.row_category_lbl_new;
        cD1$a = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(cD1$a, string2);
        cD1$a = (TextView)cD1$a;
        this.d = cD1$a;
        n3 = R$id.row_category;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.e = view;
    }
}

