/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

public final class RY1
extends RecyclerView$B
implements View.OnClickListener {
    public final q82_0 a;
    public final LinearLayout b;
    public final AjioCircularImageView c;
    public ProductOptionVariant d;

    public RY1(View object, q82_0 q82_02) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(q82_02, "onColorClickListener");
        super((View)object);
        this.a = q82_02;
        int n3 = R$id.row_pdp_color;
        q82_02 = object.findViewById(n3);
        Intrinsics.checkNotNull(q82_02, "null cannot be cast to non-null type android.widget.LinearLayout");
        q82_02 = (LinearLayout)q82_02;
        this.b = q82_02;
        n3 = R$id.row_product_detail_imv_color;
        object = object.findViewById(n3);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioCircularImageView");
        object = (AjioCircularImageView)((Object)object);
        this.c = object;
        object.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.row_product_detail_imv_color)) {
            object = this.d;
            n3 = 0;
            Object object2 = null;
            String string2 = "productOptionVariant";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            n4 = (int)(((ProductOptionVariant)object).isSelected() ? 1 : 0);
            if (n4 == 0) {
                object = this.d;
                if (object != null) {
                    object2 = object;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                object = ((ProductOptionVariant)object2).getCode();
                if (object == null) {
                    object = "";
                }
                object2 = this.a;
                object2.c3((String)object);
            }
        }
    }
}

