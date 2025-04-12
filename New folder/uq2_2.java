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
 * Renamed from uq2
 */
public final class uq2_2
extends RecyclerView$B {
    public final zq2_1 a;
    public final View b;
    public final TextView c;

    public uq2_2(View view, zq2_1 zq2_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(zq2_12, "pendingPointListener");
        super(view);
        this.a = zq2_12;
        int n3 = R$id.tnc_container;
        zq2_12 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(zq2_12, string2);
        this.b = zq2_12;
        n3 = R$id.additional_info;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
    }
}

