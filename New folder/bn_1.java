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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from BN
 */
public final class bn_1
extends RecyclerView$f
implements View.OnClickListener {
    public final List a;
    public CartDeliveryAddress b;
    public final s72_0 c;

    public bn_1(ArrayList arrayList, s72_0 s72_02) {
        Intrinsics.checkNotNullParameter(arrayList, "values");
        Intrinsics.checkNotNullParameter(s72_02, "addressClickListener");
        this.a = arrayList;
        this.c = s72_02;
    }

    public static String g(CartDeliveryAddress object) {
        String string2 = ((CartDeliveryAddress)object).getLine1();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        string2 = !bl2 ? ((CartDeliveryAddress)object).getLine1() : "";
        String string3 = ((CartDeliveryAddress)object).getLine2();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        String string4 = ", ";
        if (!bl3) {
            string3 = ((CartDeliveryAddress)object).getLine2();
            string2 = n1.a(string2, string4, string3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((CartDeliveryAddress)object).getLandmark())))) {
            string3 = ((CartDeliveryAddress)object).getLandmark();
            string2 = n1.a(string2, string4, string3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((CartDeliveryAddress)object).getTown())))) {
            string3 = ((CartDeliveryAddress)object).getTown();
            string2 = n1.a(string2, string4, string3);
        }
        if (!(bl3 = TextUtils.isEmpty((CharSequence)(string3 = ((CartDeliveryAddress)object).getDistrict())))) {
            object = ((CartDeliveryAddress)object).getDistrict();
            string2 = n1.a(string2, string4, (String)object);
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String h(CartDeliveryAddress object, boolean bl2) {
        Object object2;
        String string2;
        Object object3 = ((CartDeliveryAddress)object).getState();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl3) {
            object3 = ((CartDeliveryAddress)object).getState();
            string2 = "<b>";
            String string3 = "</b>";
            object3 = cP.a(string2, (String)object3, string3);
        } else {
            object3 = "";
        }
        string2 = ((CartDeliveryAddress)object).getPostalCode();
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (bl4) return object3;
        if (bl2) {
            object2 = cp_1.Companion;
            object = ((CartDeliveryAddress)object).getPostalCode();
            object2.getClass();
            object = cp$a.B((String)object);
            object2 = "-";
            return object = n1.a((String)object3, (String)object2, (String)object);
        }
        object = ((CartDeliveryAddress)object).getPostalCode();
        object2 = " ";
        return object = n1.a((String)object3, (String)object2, (String)object);
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4;
        String string2;
        int n7;
        Object object2;
        object = (bn$a_1)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object3 = this.a;
        CartDeliveryAddress cartDeliveryAddress = (CartDeliveryAddress)object3.get(n3);
        int n8 = object3.size();
        int n10 = cartDeliveryAddress.isDefaultAddress();
        if (n10 != 0) {
            ((bn$a_1)object).b.setVisibility(0);
            object2 = ((bn$a_1)object).c;
            ai0_2.B((View)object2);
        } else {
            object2 = ((bn$a_1)object).b;
            n7 = 8;
            object2.setVisibility(n7);
            object2 = ((bn$a_1)object).c;
            ai0_2.i((View)object2);
        }
        object2 = ((bn$a_1)object).g;
        Object object4 = n3;
        object2.setTag(object4);
        object4 = this.b;
        object2 = ((bn$a_1)object).g;
        n7 = 1;
        if (object4 != null && (n3 = (int)(Intrinsics.areEqual(object4 = ((CartDeliveryAddress)object4).getId(), string2 = cartDeliveryAddress.getId()) ? 1 : 0)) != 0) {
            if (n8 == n7) {
                object2.setOnClickListener((View.OnClickListener)this);
            } else {
                n3 = 0;
                object4 = null;
                object2.setOnClickListener(null);
            }
        } else {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        object4 = cartDeliveryAddress.getFirstName();
        object3 = "";
        if (object4 == null || (n10 = ((String)object4).length()) == 0) {
            object4 = object3;
        }
        if ((object2 = cartDeliveryAddress.getLastName()) != null && (n4 = ((String)object2).length()) != 0) {
            object3 = object2;
        }
        object4 = ((Object)StringsKt.m0((CharSequence)object4)).toString();
        object3 = ((Object)StringsKt.m0((CharSequence)object3)).toString();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object4);
        ((StringBuilder)object2).append(" ");
        ((StringBuilder)object2).append((String)object3);
        object4 = hv3_0.u(((StringBuilder)object2).toString());
        object3 = ((bn$a_1)object).a;
        object3.setText((CharSequence)object4);
        object3.setVisibility(0);
        object4 = bn_1.g(cartDeliveryAddress);
        object3 = ((bn$a_1)object).d;
        object3.setText((CharSequence)object4);
        object4 = cp_1.Companion;
        n3 = (int)(km_1.b((cp$a)object4) ? 1 : 0);
        if (n3 != 0) {
            object4 = bn_1.g(cartDeliveryAddress);
            object3.setContentDescription((CharSequence)object4);
        }
        if ((object4 = cartDeliveryAddress.getPhone()) != null) {
            object4 = cartDeliveryAddress.getPhone();
            object2 = "getPhone(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            n10 = ((String)object4).length() - n7;
            n4 = 0;
            string2 = null;
            boolean bl2 = false;
            while (n4 <= n10) {
                int n14 = !bl2 ? n4 : n10;
                n14 = ((String)object4).charAt(n14);
                int n15 = 32;
                n14 = Intrinsics.compare(n14, n15);
                n14 = n14 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n14 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n4;
                    continue;
                }
                if (n14 == 0) break;
                n10 += -1;
            }
            if ((n3 = ((String)(object4 = ((Object)((String)object4).subSequence(n4, n10 += n7)).toString())).length()) > 0) {
                object4 = cartDeliveryAddress.getPhone();
                object2 = ((bn$a_1)object).e;
                object2.setText((CharSequence)object4);
                object4 = cp_1.Companion;
                string2 = cartDeliveryAddress.getPhone();
                object4.getClass();
                object4 = cp$a.B(string2);
                object2.setContentDescription((CharSequence)object4);
            }
        }
        object4 = hv3_0.f(bn_1.h(cartDeliveryAddress, false));
        ((bn$a_1)object).f.setText((CharSequence)object4);
        object = cp_1.Companion;
        boolean bl3 = km_1.b((cp$a)object);
        if (bl3) {
            object = bn_1.h(cartDeliveryAddress, n7 != 0);
            object3.setContentDescription((CharSequence)object);
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
            int n7 = R$id.row_shipping_address;
            if (n4 == n7) {
                object = AnalyticsManager.Companion;
                object3 = "single page checkout";
                String string2 = "Select Address";
                String string3 = "Select Address Button";
                tj2_0.e((AnalyticsManager$Companion)object, string2, string3, (String)object3);
                object = this.c;
                object.W0((CartDeliveryAddress)object2);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.cart_row_shipping_address_lux;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.cart_row_shipping_address_revamp;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new bn$a_1(this, (View)viewGroup);
        return object;
    }
}

