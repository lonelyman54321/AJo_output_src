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
 * Renamed from rj2
 */
public final class rj2_1
extends RecyclerView$B {
    public final View a;
    public final TextView b;

    public rj2_1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.row_pdp_trust_marker_tv;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }
}

