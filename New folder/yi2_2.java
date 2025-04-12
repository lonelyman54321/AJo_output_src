/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yi2
 */
public final class yi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public final q82_0 a;
    public final CardView b;
    public final TextView c;
    public ProductOptionVariant d;

    public yi2_2(View view, q82_0 object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "onColorClickListener");
        super(view);
        this.a = object;
        int n3 = R$id.s1ParentView;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (CardView)((Object)object);
        this.b = object;
        n3 = R$id.closet_size_item_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.closet_size_item_tv)) {
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

