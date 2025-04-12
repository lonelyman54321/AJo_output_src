/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class mA2
extends RecyclerView$B
implements View.OnClickListener {
    public final Oj2 a;
    public final ImageView b;
    public final lA2 c;

    public mA2(View object, Oj2 oj2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(oj2, "plpImageClickListener");
        super((View)object);
        this.a = oj2;
        int n3 = R$id.pdp_product_img;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ImageView)object;
        this.b = object;
        super(this);
        this.c = object;
    }

    public final void onClick(View view) {
        this.a.g();
    }
}

