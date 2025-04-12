/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class LT
extends RecyclerView$f
implements View.OnClickListener {
    public final List a;
    public CartDeliveryAddress b;
    public final s72_0 c;

    public LT(ArrayList arrayList, s72_0 s72_02) {
        Intrinsics.checkNotNullParameter(arrayList, "values");
        Intrinsics.checkNotNullParameter(s72_02, "addressClickListener");
        this.a = arrayList;
        this.c = s72_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String g(CartDeliveryAddress object, boolean bl2) {
        Object object2 = ((CartDeliveryAddress)object).getLine1();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        object2 = !bl3 ? ((CartDeliveryAddress)object).getLine1() : "";
        String string2 = ((CartDeliveryAddress)object).getLine2();
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        String string3 = ",";
        if (!bl4) {
            string2 = ((CartDeliveryAddress)object).getLine2();
            object2 = n1.a((String)object2, string3, string2);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getLandmark())))) {
            string2 = ((CartDeliveryAddress)object).getLandmark();
            object2 = n1.a((String)object2, string3, string2);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getTown())))) {
            string2 = ((CartDeliveryAddress)object).getTown();
            object2 = n1.a((String)object2, string3, string2);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getDistrict())))) {
            string2 = ((CartDeliveryAddress)object).getDistrict();
            object2 = n1.a((String)object2, string3, string2);
        }
        if (!(bl4 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getState())))) {
            string2 = ((CartDeliveryAddress)object).getState();
            object2 = n1.a((String)object2, string3, string2);
        }
        if (bl4 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getPostalCode()))) return object2;
        string2 = "-";
        if (bl2) {
            cp$a cp$a = cp_1.Companion;
            object = ((CartDeliveryAddress)object).getPostalCode();
            cp$a.getClass();
            object = cp$a.B((String)object);
            return object = n1.a((String)object2, string2, (String)object);
        }
        object = ((CartDeliveryAddress)object).getPostalCode();
        return object = n1.a((String)object2, string2, (String)object);
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2;
        int n4;
        Object object;
        recyclerView$B = (LT$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object2 = this.a;
        CartDeliveryAddress cartDeliveryAddress = (CartDeliveryAddress)object2.get(n3);
        int n7 = object2.size();
        int n8 = og1_1.b();
        if (n8 != 0) {
            object = ((LT$a)recyclerView$B).b;
            ((AjioTextView)object).underlineText();
        }
        if ((n8 = cartDeliveryAddress.isDefaultAddress()) != 0) {
            object = ((LT$a)recyclerView$B).d;
            object.setVisibility(0);
        } else {
            object = ((LT$a)recyclerView$B).d;
            n4 = 8;
            object.setVisibility(n4);
        }
        object = ((LT$a)recyclerView$B).g;
        Object object3 = n3;
        object.setTag(object3);
        object = this.b;
        object3 = ((LT$a)recyclerView$B).a;
        Object object4 = ((LT$a)recyclerView$B).g;
        int n10 = 1;
        if (object != null && (n8 = Intrinsics.areEqual(object = ((CartDeliveryAddress)object).getId(), string2 = cartDeliveryAddress.getId())) != 0) {
            if (n7 == n10) {
                object4.setOnClickListener((View.OnClickListener)this);
            } else {
                n7 = 0;
                object2 = null;
                object4.setOnClickListener(null);
            }
            if (object3 != null) {
                object3.setChecked(n10 != 0);
            }
        } else {
            object4.setOnClickListener((View.OnClickListener)this);
            if (object3 != null) {
                object3.setChecked(false);
            }
        }
        object2 = n3;
        object = ((LT$a)recyclerView$B).b;
        object.setTag(object2);
        object2 = cartDeliveryAddress.getFirstName();
        Intrinsics.checkNotNullExpressionValue(object2, "getFirstName(...)");
        object2 = ((Object)StringsKt.m0((CharSequence)object2)).toString();
        object3 = cartDeliveryAddress.getLastName();
        Intrinsics.checkNotNullExpressionValue(object3, "getLastName(...)");
        object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
        object4 = new StringBuilder();
        ((StringBuilder)object4).append((String)object2);
        ((StringBuilder)object4).append(" ");
        ((StringBuilder)object4).append((String)object3);
        object2 = hv3_0.u(((StringBuilder)object4).toString());
        object3 = ((LT$a)recyclerView$B).c;
        object3.setText((CharSequence)object2);
        object3.setVisibility(0);
        object2 = LT.g(cartDeliveryAddress, false);
        object3 = ((LT$a)recyclerView$B).e;
        object3.setText((CharSequence)object2);
        object2 = cp_1.Companion;
        n7 = km_1.b((cp$a)object2);
        if (n7 != 0) {
            object2 = LT.g(cartDeliveryAddress, n10 != 0);
            object3.setContentDescription((CharSequence)object2);
        }
        n7 = R$string.edit_text;
        object2 = hv3_0.K(n7);
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object2);
        object2 = " index ";
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(n3);
        Object object5 = ((StringBuilder)object3).toString();
        object.setContentDescription((CharSequence)object5);
        object5 = cartDeliveryAddress.getPhone();
        if (object5 != null) {
            object5 = cartDeliveryAddress.getPhone();
            object2 = "getPhone(...)";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
            n7 = ((String)object5).length() - n10;
            n8 = 0;
            object = null;
            n4 = 0;
            object3 = null;
            while (n8 <= n7) {
                int n14 = n4 == 0 ? n8 : n7;
                n14 = ((String)object5).charAt(n14);
                int n15 = 32;
                if ((n14 = Intrinsics.compare(n14, n15)) <= 0) {
                    n14 = 1;
                } else {
                    n14 = 0;
                    object4 = null;
                }
                if (n4 == 0) {
                    if (n14 == 0) {
                        n4 = 1;
                        continue;
                    }
                    ++n8;
                    continue;
                }
                if (n14 == 0) break;
                n7 += -1;
            }
            if ((n3 = ((String)(object5 = ((Object)((String)object5).subSequence(n8, n7 += n10)).toString())).length()) > 0) {
                object5 = cartDeliveryAddress.getPhone();
                recyclerView$B = ((LT$a)recyclerView$B).f;
                recyclerView$B.setText((CharSequence)object5);
                object5 = cp_1.Companion;
                object2 = cartDeliveryAddress.getPhone();
                object5.getClass();
                object5 = cp$a.B((String)object2);
                recyclerView$B.setContentDescription((CharSequence)object5);
            }
        }
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = object.getTag();
        int n3 = object2 instanceof Integer;
        if (n3 != 0) {
            object2 = object.getTag();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Int");
            n3 = (Integer)object2;
            Object object3 = this.a;
            object2 = (CartDeliveryAddress)object3.get(n3);
            int n4 = object.getId();
            int n7 = R$id.shipping_address_lbl_edit;
            s72_0 s72_02 = this.c;
            String string2 = "single page checkout";
            String string3 = "Select Address Button";
            if (n4 == n7) {
                object = AnalyticsManager.Companion;
                object3 = "Edit Address";
                tj2_0.e((AnalyticsManager$Companion)object, (String)object3, string3, string2);
                s72_02.y5((CartDeliveryAddress)object2);
            } else {
                n7 = R$id.row_shipping_address;
                if (n4 == n7) {
                    object = AnalyticsManager.Companion;
                    object3 = "Select Address";
                    tj2_0.e((AnalyticsManager$Companion)object, (String)object3, string3, string2);
                    s72_02.W0((CartDeliveryAddress)object2);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.row_shipping_address_lux;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_shipping_address_revamp;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new LT$a(this, (View)viewGroup);
        return object;
    }
}

