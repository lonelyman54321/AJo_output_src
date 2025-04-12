/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bc0
 */
public final class bc0_1
implements View.OnClickListener {
    public final String a;
    public String b;
    public String c;
    public int d;
    public zc0_0 e;

    public bc0_1(zc0_0 zc0_02, String string2) {
        Intrinsics.checkNotNullParameter(zc0_02, "couponOfferClickListener");
        this.d = -1;
        this.a = string2;
        this.e = zc0_02;
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.coupon_offer_layout_click_expanded;
        zc0_0 zc0_02 = this.e;
        if (n3 == n4) {
            if (zc0_02 != null) {
                int n7 = this.d;
                object = n7;
                zc0_02.c((Integer)object);
            }
        } else {
            n3 = object.getId();
            if (n3 == (n4 = R$id.coupon_share)) {
                if (zc0_02 != null) {
                    object = this.b;
                    string2 = this.c;
                    zc0_02.a((String)object, string2);
                }
            } else {
                n3 = object.getId();
                n4 = R$id.coupon_tnc;
                String string3 = this.a;
                if (n3 == n4) {
                    if (zc0_02 != null) {
                        zc0_02.d(string3);
                    }
                } else {
                    int n8;
                    n3 = object.getId();
                    if ((n3 == (n4 = R$id.coupon_shop_btn) || (n8 = object.getId()) == (n3 = R$id.coupon_offer_layout_shop_bank)) && zc0_02 != null) {
                        zc0_02.b(string3);
                    }
                }
            }
        }
    }
}

