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
 * Renamed from vG2
 */
public final class vg2_0
extends RecyclerView$B {
    public final View a;
    public final LG2 b;
    public final TextView c;
    public final View d;

    public vg2_0(View view, LG2 lG2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lG2, "referralListener");
        super(view);
        this.a = view;
        this.b = lG2;
        int n3 = R$id.cash_amount;
        lG2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(lG2, string2);
        lG2 = (TextView)lG2;
        this.c = lG2;
        n3 = R$id.view_wallet;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        this.d = view;
    }
}

