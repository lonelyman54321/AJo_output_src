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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bE0
 */
public final class be0_2
extends RecyclerView$B {
    public final ReturnOrderItemDetails a;
    public final HashMap b;
    public final AjioRoundedCornerImageView c;
    public final AjioTextView d;
    public final AjioTextView e;
    public final AjioTextView f;
    public final AjioTextView g;
    public final AjioTextView h;

    public be0_2(View object, ReturnOrderItemDetails object2, HashMap object3) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "returnOrderItemDetails");
        super((View)object);
        this.a = object2;
        this.b = object3;
        int n3 = R$id.img_product;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioRoundedCornerImageView)((Object)object2);
        this.c = object2;
        n3 = R$id.return_type;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.d = object2;
        n3 = R$id.size_type;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.e = object2;
        n3 = R$id.item_actual_cost;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.f = object2;
        n3 = R$id.item_original_price;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.g = object2;
        n3 = R$id.item_include_conv_fee;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (AjioTextView)object;
        this.h = object;
    }
}

