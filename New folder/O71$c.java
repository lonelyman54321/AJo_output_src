/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class O71$c
extends RecyclerView$B {
    public final RecyclerView a;
    public final TextView b;
    public final /* synthetic */ o71_0 c;

    public O71$c(o71_0 object, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.c = object;
        super(view);
        int n3 = R$id.homepage_rate_other_purchase_list;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.a = object = (RecyclerView)object;
        n3 = R$id.homepage_rate_other_purchase_product;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.b = object;
    }
}

