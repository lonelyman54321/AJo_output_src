/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from CN2
 */
public final class cn2_0
extends vw_0 {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public cn2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        int n3 = R$id.row_od_lbl_store;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.a = view2;
        n3 = R$id.row_od_tv_deliveryInfo;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.b = view2;
        n3 = R$id.row_od_tv_delivertype;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.c = view2;
        n3 = R$id.row_od_tv_name;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.d = view2;
        n3 = R$id.row_od_tv_address;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.e = view2;
        n3 = R$id.row_od_tv_phone;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.f = view;
    }

    public final void w(Object object, Object object2) {
        object2 = null;
        CharSequence charSequence = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.revamp.OrderDetailData";
        Intrinsics.checkNotNull(object, (String)charSequence);
        object = ((pa2_0)object).b;
        boolean n3 = object instanceof CartDeliveryAddress;
        if (n3) {
            boolean bl2;
            object = (CartDeliveryAddress)object;
            charSequence = ((CartDeliveryAddress)object).getDeliveryModeValue();
            Object[] objectArray = "store-pickup";
            boolean bl3 = Intrinsics.areEqual(objectArray, charSequence);
            int n4 = 8;
            Object object3 = this.a;
            if (bl3) {
                object3.setVisibility(0);
            } else {
                object3.setVisibility(n4);
            }
            boolean bl4 = ((CartDeliveryAddress)object).isReturnonHold();
            object3 = this.b;
            if (bl4) {
                object3.setVisibility(0);
            } else {
                object3.setVisibility(n4);
            }
            int n7 = R$string.return_pick_up_from;
            charSequence = hv3_0.K(n7);
            this.c.setText(charSequence);
            charSequence = new StringBuilder();
            objectArray = ((CartDeliveryAddress)object).getFirstName();
            if (objectArray != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                objectArray = ((CartDeliveryAddress)object).getFirstName();
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            if ((objectArray = ((CartDeliveryAddress)object).getLastName()) != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                ((StringBuilder)charSequence).append(" ");
                objectArray = ((CartDeliveryAddress)object).getLastName();
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            objectArray = hv3_0.u(((StringBuilder)charSequence).toString());
            object3 = this.d;
            object3.setText((CharSequence)objectArray);
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            ((StringBuilder)charSequence).setLength(0);
            objectArray = ((CartDeliveryAddress)object).getLine1();
            if (objectArray != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getLine1());
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            objectArray = ((CartDeliveryAddress)object).getLine2();
            object3 = ",";
            if (objectArray != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                ((StringBuilder)charSequence).append((String)object3);
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getLine2());
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            objectArray = ((CartDeliveryAddress)object).getLandmark();
            String string2 = "\n";
            if (objectArray != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                ((StringBuilder)charSequence).append(string2);
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getLandmark());
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            ((StringBuilder)charSequence).append(string2);
            objectArray = ((CartDeliveryAddress)object).getTown();
            if (objectArray != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getTown());
                ((StringBuilder)charSequence).append((String)objectArray);
                ((StringBuilder)charSequence).append(string2);
            }
            if ((objectArray = ((CartDeliveryAddress)object).getDistrict()) != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getDistrict());
                ((StringBuilder)charSequence).append((String)objectArray);
                objectArray = ", ";
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            if ((objectArray = ((CartDeliveryAddress)object).getState()) != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                ((StringBuilder)charSequence).append(string2);
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getState());
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            if ((objectArray = ((CartDeliveryAddress)object).getCountry().getName()) != null && (n4 = objectArray.length()) != 0) {
                ((StringBuilder)charSequence).append((String)object3);
                objectArray = hv3_0.u(((CartDeliveryAddress)object).getCountry().getName());
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            if ((objectArray = ((CartDeliveryAddress)object).getPostalCode()) != null && (n4 = (int)(kotlin.text.b.k((CharSequence)objectArray) ? 1 : 0)) == 0) {
                objectArray = ((CartDeliveryAddress)object).getPostalCode();
                string2 = " - ";
                object3 = new StringBuilder(string2);
                ((StringBuilder)object3).append((String)objectArray);
                objectArray = ((StringBuilder)object3).toString();
                ((StringBuilder)charSequence).append((String)objectArray);
            }
            objectArray = this.e;
            charSequence = ((StringBuilder)charSequence).toString();
            objectArray.setText(charSequence);
            charSequence = ((CartDeliveryAddress)object).getPhone();
            if (charSequence != null && !(bl2 = kotlin.text.b.k(charSequence))) {
                int n8 = R$string.phone_format;
                object = ((CartDeliveryAddress)object).getPhone();
                n4 = 1;
                objectArray = new Object[n4];
                objectArray[0] = object;
                object = hv3_0.L(n8, objectArray);
                object2 = this.f;
                object2.setText((CharSequence)object);
            }
        }
    }
}

