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
 * Renamed from Of2
 */
public final class of2_0
extends RecyclerView$B {
    public final TextView a;

    public of2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.row_order_title_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.a = view;
    }
}

