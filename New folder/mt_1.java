/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mT
 */
public final class mt_1
extends rw_2
implements View.OnClickListener {
    public OnCheckoutClickListener b;
    public TextView c;
    public View d;
    public View e;
    public ImageView f;
    public TextView g;
    public ConstraintLayout h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;

    public final void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.relative_address_change;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4 && (object = this.b) != null) {
            object.m1();
        }
    }

    public final void w(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = this.f;
        Object object4 = this.g;
        Object object5 = this.e;
        Object object6 = this.c;
        int n4 = 8;
        if (object == null) {
            object6.setVisibility(n4);
            object5.setVisibility(n4);
            object = this.d;
            object.setVisibility(n4);
            if (object4 != null) {
                object4.setVisibility(n4);
            }
            if (object3 != null) {
                object3.setVisibility(n4);
            }
            return;
        }
        boolean bl2 = object instanceof CartDeliveryAddress;
        if (bl2) {
            boolean bl3;
            object = (CartDeliveryAddress)object;
            object3 = hv3_0.u(((CartDeliveryAddress)object).getDistrict());
            object4 = ((CartDeliveryAddress)object).getPostalCode();
            object5 = "<b>";
            object6 = " ";
            String string2 = "</b>";
            object3 = uc0_0.a((String)object5, (String)object3, (String)object6, (String)object4, string2);
            int n7 = R$string.cart_delivery_header_text;
            String string3 = hv3_0.u(((CartDeliveryAddress)object).getFirstName());
            int n8 = 2;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string3;
            n3 = 1;
            objectArray[n3] = object3;
            object2 = hv3_0.f(hv3_0.L(n7, objectArray));
            object3 = this.h;
            if (object3 != null) {
                object3.setContentDescription((CharSequence)object2);
            }
            object2 = Ft2.a(((CartDeliveryAddress)object).getFirstName(), " |");
            this.j.setText((CharSequence)object2);
            object2 = ((CartDeliveryAddress)object).getPostalCode();
            this.k.setText((CharSequence)object2);
            object2 = ((CartDeliveryAddress)object).getCompleteAddress();
            object3 = ((CartDeliveryAddress)object).getDistrict();
            object4 = ", ";
            object2 = n1.a((String)object2, (String)object4, (String)object3);
            object3 = this.i;
            object3.setText((CharSequence)object2);
            object2 = cp_1.Companion;
            n3 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            if (n3 != 0) {
                object2 = hv3_0.u(((CartDeliveryAddress)object).getDistrict());
                object = cp$a.B(((CartDeliveryAddress)object).getPostalCode());
                object = uc0_0.a((String)object5, (String)object2, (String)object6, (String)object, string2);
                object3.setContentDescription((CharSequence)object);
            }
            if ((bl3 = og1_1.c()) && (object = this.l) != null) {
                object.getPaintFlags();
                n3 = object.getPaintFlags();
                object3 = n3;
                Intrinsics.checkNotNull(object3);
                object.setPaintFlags(n3 |= n4);
            }
        } else {
            n4 = object instanceof StoreNode;
            if (n4 != 0) {
                int n10;
                object = (StoreNode)object;
                object6.setVisibility(0);
                object5.setVisibility(0);
                if (object3 != null) {
                    object3.setVisibility(0);
                }
                if (object4 != null) {
                    object4.setVisibility(0);
                }
                object = "Home Delivery Available";
                object6.setText((CharSequence)object);
                if (object3 != null) {
                    n10 = R$drawable.ic_spc_home;
                    object = hv3_0.r(n10);
                    object3.setImageDrawable((Drawable)object);
                }
                if (object4 != null) {
                    n10 = R$string.order_will_be_delivered;
                    object = hv3_0.K(n10);
                    object4.setText((CharSequence)object);
                }
            }
        }
    }
}

