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
 * Renamed from BW
 */
public final class bw_0
extends RecyclerView$B {
    public final TextView a;
    public final c92 b;

    public bw_0(View view, c92 c922) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(c922, "onSizeClickListener");
        super(view);
        int n3 = R$id.row_wishlist_variable_size_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.a = view;
        this.b = c922;
    }
}

