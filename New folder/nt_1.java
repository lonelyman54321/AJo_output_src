/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableString
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nT
 */
public final class nt_1
extends rw_2 {
    public final TextView b;
    public final TextView c;

    public nt_1(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.id_loc_image;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (ImageView)view2;
        n3 = R$id.tv_delivery_info;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.id_address_name;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.id_address_details;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
    }

    public final void w(Object object) {
        if (object == null) {
            return;
        }
        int n3 = object instanceof CartDeliveryAddress;
        if (n3 != 0) {
            String string2;
            String string3;
            object = (CartDeliveryAddress)object;
            this.b.setText((CharSequence)"Delivering to");
            String string4 = ((CartDeliveryAddress)object).getFirstName();
            Object object2 = "";
            if (string4 == null) {
                string4 = object2;
            }
            if ((string3 = ((CartDeliveryAddress)object).getCompleteAddress()) == null) {
                string3 = object2;
            }
            if ((string2 = ((CartDeliveryAddress)object).getDistrict()) == null) {
                string2 = object2;
            }
            if ((object = ((CartDeliveryAddress)object).getPostalCode()) != null) {
                object2 = object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string4);
            String string5 = " | ";
            stringBuilder.append(string5);
            stringBuilder.append(string3);
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            string3 = " - ";
            object2 = h30_0.a(stringBuilder, string3, (String)object2);
            object = new SpannableString((CharSequence)object2);
            object2 = new StyleSpan(1);
            n3 = string4.length();
            int n4 = 33;
            string2 = null;
            object.setSpan(object2, 0, n3, n4);
            string4 = this.c;
            string4.setText((CharSequence)object);
            int n7 = og1_1.c();
            if (n7 != 0) {
                n7 = string4.getPaintFlags() | 8;
                string4.setPaintFlags(n7);
            }
        }
    }
}

