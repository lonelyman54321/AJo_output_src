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

public final class d71
extends RecyclerView$B {
    public final View a;
    public final lf1_0 b;
    public final TextView c;

    public d71(View view, lf1_0 lf1_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = view;
        this.b = lf1_02;
        int n3 = R$id.lbttTvBack2top;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.c = view;
    }
}

