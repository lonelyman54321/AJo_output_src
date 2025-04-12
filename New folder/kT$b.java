/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.pickfromstore.StoreNode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class kT$b
extends i {
    public final /* synthetic */ kt_2 j;

    public kT$b(kt_2 kt_22, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.j = kt_22;
        super(fragmentManager, 0);
    }

    public final int c() {
        return 2;
    }

    public final CharSequence e(int n3) {
        String string2;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                string2 = "";
            } else {
                n3 = R$string.store_pickup;
                string2 = hv3_0.K(n3);
            }
        } else {
            n3 = R$string.home_delivery;
            string2 = hv3_0.K(n3);
        }
        return string2;
    }

    public final Fragment n(int n3) {
        Object object = "checkoutAddressClickListener";
        kt_2 kt_22 = this.j;
        if (n3 == 0) {
            ot_2 ot_22 = kt_22.a;
            if (ot_22 == null) {
                kt_22.a = ot_22 = new ot_2();
                Intrinsics.checkNotNullParameter(kt_22, (String)object);
                ot_22.g = kt_22;
                ot_22 = kt_22.a;
                if (ot_22 != null) {
                    ot_22.e = object = kt_22.c;
                }
            }
            kt_22.Sa(0);
            ot_22 = kt_22.a;
            Intrinsics.checkNotNull(ot_22, "null cannot be cast to non-null type com.ril.ajio.payment.fragment.CheckoutHomeAddressFragment");
            return ot_22;
        }
        Object object2 = kt_22.b;
        if (object2 == null) {
            object2 = new du_1();
            kt_22.b = object2;
            Intrinsics.checkNotNullParameter(kt_22, (String)object);
            ((du_1)object2).h = kt_22;
            object2 = kt_22.d;
            if (object2 != null) {
                Intrinsics.checkNotNull(object2);
                object2 = ((StoreNode)object2).getStoreAddress();
                if (object2 != null) {
                    object2 = kt_22.d;
                    Intrinsics.checkNotNull(object2);
                    object2 = ((StoreNode)object2).getStoreAddress().getPostalCode();
                    if (object2 != null && (n3 = (int)(kotlin.text.b.k((CharSequence)object2) ? 1 : 0)) == 0 && (object2 = kt_22.b) != null) {
                        object = kt_22.d;
                        Intrinsics.checkNotNull(object);
                        object = ((StoreNode)object).getStoreAddress().getPostalCode();
                        Intrinsics.checkNotNullExpressionValue(object, "getPostalCode(...)");
                        String string2 = "pinCode";
                        Intrinsics.checkNotNullParameter(object, string2);
                        ((du_1)object2).g = object;
                    }
                }
            }
        }
        kt_22.Sa(1);
        object2 = kt_22.b;
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.payment.fragment.CheckoutStoreAddressFragment");
        return object2;
    }
}

