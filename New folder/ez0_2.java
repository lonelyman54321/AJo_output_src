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
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ez0
 */
public final class ez0_2
extends RecyclerView$B {
    public final z82_0 a;
    public final ImageView b;

    public ez0_2(View view, z82_0 z82_02) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(z82_02, "onEmptyCartClosetClickListener");
        super(view);
        this.a = z82_02;
        int n3 = R$id.productImg;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (ImageView)view;
        this.b = view;
    }

    public final void w() {
        String string2;
        int n3 = this.getBindingAdapterPosition();
        Object object = this.b;
        if (n3 == 0) {
            n3 = R$string.acc_icon_product_placeholder;
            string2 = hv3_0.K(n3);
            String string3 = "First ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            object.setContentDescription((CharSequence)string2);
        } else {
            int n4;
            n3 = this.getBindingAdapterPosition();
            if (n3 == (n4 = 1)) {
                n3 = R$string.acc_icon_product_placeholder;
                string2 = hv3_0.K(n3);
                String string4 = "Second ";
                StringBuilder stringBuilder = new StringBuilder(string4);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                object.setContentDescription((CharSequence)string2);
            } else {
                n3 = this.getBindingAdapterPosition();
                if (n3 == (n4 = 2)) {
                    n3 = R$string.acc_icon_product_placeholder;
                    string2 = hv3_0.K(n3);
                    String string5 = "Third ";
                    StringBuilder stringBuilder = new StringBuilder(string5);
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    object.setContentDescription((CharSequence)string2);
                }
            }
        }
        string2 = this.itemView;
        object = new dz0_0(this, 0);
        string2.setOnClickListener((View.OnClickListener)object);
    }
}

