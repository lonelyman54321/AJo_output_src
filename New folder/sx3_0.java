/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sx3
 */
public final class sx3_0
extends RecyclerView$B {
    public final Product a;
    public final J43 b;
    public final RecyclerView c;
    public final String d;

    public sx3_0(View object, Product product, J43 j43) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = product;
        this.b = j43;
        int n3 = R$id.useful_links_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        this.d = "More ";
    }
}

