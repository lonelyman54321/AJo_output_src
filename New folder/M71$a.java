/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import kotlin.jvm.internal.Intrinsics;

public final class M71$a
extends RecyclerView$B {
    public final AjioRoundedCornerImageView a;

    public M71$a(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        int n3 = R$id.product_img;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioRoundedCornerImageView)((Object)object);
        this.a = object;
    }
}

