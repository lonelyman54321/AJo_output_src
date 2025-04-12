/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WE3
 */
public final class we3_0
extends RecyclerView$B {
    public final ImageView a;

    public we3_0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        int n3 = R$id.id_wallet_product_image;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (ImageView)view;
        this.a = view;
    }
}

