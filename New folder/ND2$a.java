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

public final class ND2$a
extends RecyclerView$B {
    public final TextView a;
    public final /* synthetic */ nd2_0 b;

    public ND2$a(nd2_0 nd2_02, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b = nd2_02;
        super(view);
        int n3 = R$id.response_item;
        nd2_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(nd2_02, "findViewById(...)");
        nd2_02 = (TextView)nd2_02;
        this.a = nd2_02;
    }
}

