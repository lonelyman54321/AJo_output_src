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

public final class O71$a
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;

    public O71$a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        int n3 = R$id.rated_title_msg;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.rated_thanks_msg;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
    }
}

