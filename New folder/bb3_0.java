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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bb3
 */
public final class bb3_0
extends RecyclerView$B
implements View.OnClickListener {
    public final q82_0 a;
    public final LinearLayout b;
    public final AppCompatImageView c;
    public final AjioTextView d;
    public ProductOptionVariant e;

    public bb3_0(View object, q82_0 object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "onColorClickListener");
        super((View)object);
        this.a = object2;
        int n3 = R$id.myCardView;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.widget.LinearLayout");
        object2 = (LinearLayout)object2;
        this.b = object2;
        n3 = R$id.row_product_detail_imv_color;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        object2 = (AppCompatImageView)((Object)object2);
        this.c = object2;
        int n4 = R$id.color_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.AjioTextView");
        object = (AjioTextView)object;
        this.d = object;
        object2.setOnClickListener(this);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.row_product_detail_imv_color)) {
            object = this.e;
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
                object = this.e;
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

