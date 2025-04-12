/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UM
 */
public final class um_1
extends RecyclerView$B
implements View.OnClickListener {
    public final j82_0 a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final RelativeLayout h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;

    public um_1(j82_0 object, Context object2, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object, "onCartClickListener");
        super(view);
        this.a = object;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.parent_layout;
        object = (ConstraintLayout)view.findViewById(n3);
        this.b = object;
        n3 = R$id.id_address_name;
        object = (TextView)view.findViewById(n3);
        this.d = object;
        n3 = R$id.id_address_pincode;
        object = (TextView)view.findViewById(n3);
        this.e = object;
        n3 = R$id.id_address_details;
        object = (TextView)view.findViewById(n3);
        this.c = object;
        n3 = R$id.id_address_change;
        object = (TextView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.relative_address_change;
        object = (RelativeLayout)view.findViewById(n3);
        this.h = object;
        n3 = R$id.id_check_pincode;
        object = (TextView)view.findViewById(n3);
        this.g = object;
        n3 = R$id.id_address_details_constraint;
        object = (ConstraintLayout)view.findViewById(n3);
        this.i = object;
        n3 = R$id.id_enter_pincode_constraint;
        object = (ConstraintLayout)view.findViewById(n3);
        this.j = object;
        object = this.g;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idPinCodeCheck");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener(this);
        object = this.h;
        if (object == null) {
            object = "layoutAddressChange";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        object = this.b;
        if (object != null) {
            object.setOnClickListener(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.relative_address_change;
        j82_0 j82_02 = this.a;
        if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
            n7 = R$id.parent_layout;
            if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
                n7 = R$id.id_check_pincode;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n7) return;
                object = AnalyticsManager.Companion.getInstance();
                GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
                String string2 = "address interaction";
                String string3 = "enter new pincode";
                String string4 = "";
                String string5 = "address_interaction";
                String string6 = "Check out Address delivery";
                gTMEvents.pushCartInteractionsEvent(string3, string4, string5, string6, string2, null);
                j82_02.E8();
                return;
            }
        }
        object = AnalyticsManager.Companion.getInstance();
        GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
        String string7 = "bag interactions";
        String string8 = "change address";
        String string9 = "";
        String string10 = "bag_interaction";
        String string11 = "bag screen";
        gTMEvents.pushCartInteractionsEvent(string8, string9, string10, string11, string7, null);
        j82_02.F6();
    }

    public final void w(CartDeliveryAddress cartDeliveryAddress, String string2) {
        int n3;
        Object object;
        Object object2;
        um_1 um_12 = this;
        Object object3 = string2;
        Object object4 = this.f;
        Object object5 = this.d;
        Object object6 = this.j;
        TextView textView = this.e;
        TextView textView2 = this.c;
        Object object7 = this.i;
        String string3 = "idAddressDetailsConstraint";
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            object2 = null;
        } else {
            object2 = object7;
        }
        ai0_2.i((View)object2);
        object2 = "idEnterAddressConstraint";
        if (object6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        } else {
            object = object6;
        }
        ai0_2.i((View)object);
        object = "idAddressPinCode";
        String string4 = "idAddressDetails";
        String string5 = "toString(...)";
        CharSequence charSequence = "idAddressName";
        if (object3 != null && (n3 = string2.length()) != 0) {
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object7 = null;
            }
            ai0_2.B((View)object7);
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                boolean bl2 = false;
                object5 = null;
            }
            object4 = "Pincode | ";
            Intrinsics.checkNotNullExpressionValue(object4, string5);
            object5.setText((CharSequence)object4);
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                textView2 = null;
            }
            textView2.setText((CharSequence)object3);
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                textView = null;
            }
            ai0_2.i((View)textView);
        } else {
            int n4;
            if (cartDeliveryAddress != null) {
                object3 = cartDeliveryAddress.getPostalCode();
            } else {
                n4 = 0;
                object3 = null;
            }
            if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                int n7;
                String string6;
                int n8;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object7 = null;
                }
                ai0_2.B((View)object7);
                if (cartDeliveryAddress != null) {
                    object3 = cartDeliveryAddress.getDistrict();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                object3 = hv3_0.u((String)object3);
                if (cartDeliveryAddress != null) {
                    object6 = cartDeliveryAddress.getPostalCode();
                } else {
                    n8 = 0;
                    object6 = null;
                }
                object7 = "<b>";
                string3 = " ";
                object2 = "</b>";
                object3 = uc0_0.a((String)object7, (String)object3, string3, (String)object6, (String)object2);
                n8 = R$string.cart_delivery_header_text;
                if (cartDeliveryAddress != null) {
                    string6 = cartDeliveryAddress.getFirstName();
                } else {
                    n3 = 0;
                    string6 = null;
                }
                string6 = hv3_0.u(string6);
                int n10 = 2;
                Object object8 = new Object[n10];
                object8[0] = string6;
                n3 = 1;
                object8[n3] = object3;
                object3 = hv3_0.f(hv3_0.L(n8, (Object[])object8));
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                    n7 = 0;
                    object5 = null;
                }
                object6 = new StringBuilder();
                if (cartDeliveryAddress != null) {
                    object8 = cartDeliveryAddress.getFirstName();
                } else {
                    n10 = 0;
                    object8 = null;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object8);
                ((StringBuilder)charSequence).append(" |");
                object8 = ((StringBuilder)charSequence).toString();
                ((StringBuilder)object6).append((String)object8);
                object6 = ((StringBuilder)object6).toString();
                Intrinsics.checkNotNullExpressionValue(object6, string5);
                object5.setText((CharSequence)object6);
                object5 = um_12.b;
                if (object5 != null) {
                    object5.setContentDescription((CharSequence)object3);
                }
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n4 = 0;
                    object3 = null;
                } else {
                    object3 = textView;
                }
                if (cartDeliveryAddress != null) {
                    object5 = cartDeliveryAddress.getPostalCode();
                } else {
                    n7 = 0;
                    object5 = null;
                }
                object3.setText((CharSequence)object5);
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object3 = null;
                } else {
                    object3 = textView2;
                }
                if (cartDeliveryAddress != null) {
                    object5 = cartDeliveryAddress.getCompleteAddress();
                } else {
                    n7 = 0;
                    object5 = null;
                }
                if (cartDeliveryAddress != null) {
                    object6 = cartDeliveryAddress.getDistrict();
                } else {
                    n8 = 0;
                    object6 = null;
                }
                object8 = new StringBuilder();
                ((StringBuilder)object8).append((String)object5);
                ((StringBuilder)object8).append(", ");
                ((StringBuilder)object8).append((String)object6);
                object5 = ((StringBuilder)object8).toString();
                object3.setText((CharSequence)object5);
                object3 = cp_1.Companion;
                n4 = (int)(km_1.b((cp$a)object3) ? 1 : 0);
                if (n4 != 0) {
                    if (cartDeliveryAddress != null) {
                        object3 = cartDeliveryAddress.getDistrict();
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    object3 = hv3_0.u((String)object3);
                    if (cartDeliveryAddress != null) {
                        object5 = cartDeliveryAddress.getPostalCode();
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                    object5 = cp$a.B((String)object5);
                    object3 = uc0_0.a((String)object7, (String)object3, string3, (String)object5, (String)object2);
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        textView2 = null;
                    }
                    textView2.setContentDescription((CharSequence)object3);
                }
                if ((n4 = (int)(og1_1.c() ? 1 : 0)) != 0) {
                    object3 = "idAddressChange";
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        n7 = 0;
                        object5 = null;
                    } else {
                        object5 = object4;
                    }
                    n7 = object5.getPaintFlags();
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        object4 = null;
                    }
                    n4 = n7 | 8;
                    object4.setPaintFlags(n4);
                }
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    textView = null;
                }
                ai0_2.B((View)textView);
            } else {
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    boolean bl3 = false;
                    object6 = null;
                }
                ai0_2.B((View)object6);
            }
        }
    }
}

