/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.AffiliateData;
import com.ril.ajio.services.data.user.LocationData;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jo
 */
public final class jo_2
extends sw_0 {
    public static final Jo$a Companion;

    static {
        Jo$a jo$a;
        Companion = jo$a = new Object();
    }

    public jo_2(Context context) {
        Intrinsics.checkNotNullParameter(context, "application");
        super("com.ril.ajio_preferences", context);
    }

    public final void A(boolean bl2) {
        this.putPreference("pd_zsr", bl2);
    }

    public final void B() {
        this.putPreference("PRICE_DROP_CART_COUNTER", 0);
    }

    public final void C(int n3) {
        this.putPreference("RTO_DIALOG_VISIBILITY_COUNT", n3);
    }

    public final void D(boolean bl2) {
        this.putPreference("SHOULD_REFRESH_HOME_PAGE", bl2);
    }

    public final void E(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeType");
        this.putPreference("STORE_TYPE", string2);
    }

    public final void F(CartDeliveryAddress object) {
        String string2 = "USER_ADDRESS";
        if (object != null) {
            this.putPreference(string2, object);
        } else {
            object = "";
            this.putPreference(string2, (String)object);
        }
    }

    public final void G(String string2) {
        String string3 = "USER_PINCODE";
        if (string2 != null) {
            this.putPreference(string3, string2);
        } else {
            string2 = "";
            this.putPreference(string3, string2);
        }
    }

    public final String a() {
        return this.getPreference("adId", "");
    }

    public final AffiliateData b() {
        return (AffiliateData)JsonUtils.fromJson(this.getPreference("AFFILIATE_DATA", ""), AffiliateData.class);
    }

    public final float c() {
        return this.getPreference("cart_total_amount", 0.0f);
    }

    public final int d() {
        return this.getPreference("cart_count", 0);
    }

    public final String e() {
        return this.getPreference("CORE_CATEGORY_NAME", "");
    }

    public final String f() {
        return this.getPreference("customer_type", "");
    }

    public final String g() {
        return this.getPreference("FACEBOOK_PROFILE_EMAIL", "");
    }

    public final String h() {
        return this.getPreference("FACEBOOK_PROFILE_USERID", "");
    }

    public final LocationData i() {
        return (LocationData)JsonUtils.fromJson(this.getPreference("LOCATION_DATA", ""), LocationData.class);
    }

    public final String j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeId");
        StringBuilder stringBuilder = new StringBuilder("store_logo_");
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        return this.getPreference(string2, "");
    }

    public final String k() {
        String string2 = ld3_2.STORE_AJIO.getStoreId();
        return this.getPreference("STORE_TYPE", string2);
    }

    public final CartDeliveryAddress l() {
        return (CartDeliveryAddress)JsonUtils.fromJson(this.getPreference("USER_ADDRESS", ""), CartDeliveryAddress.class);
    }

    public final String m() {
        return this.getPreference("USER_PINCODE", "");
    }

    public final boolean n() {
        return this.getPreference("SALE_BTN_CLICKED", false);
    }

    public final void o(float f5) {
        this.putPreference("cart_total_amount", f5);
    }

    public final void p(int n3) {
        this.putPreference("cart_count", n3);
    }

    public final void q(String string2) {
        if (string2 != null) {
            String string3 = "customer_type";
            this.putPreference(string3, string2);
        }
    }

    public final void r(LocationData locationData) {
        this.putPreference("LOCATION_DATA", locationData);
    }

    public final void s(boolean bl2) {
        this.putPreference("IS_MANDATORY_PERMISSIONS_DIALOG_SHOWN", bl2);
    }

    public final void t(long l2) {
        this.putPreference("MANDATORY_PERMISSIONS_DIALOG_TIME", l2);
    }

    public final void u() {
        this.putPreference("IS_MANUALPRICE_SELECTED", false);
    }

    public final void v() {
        this.putPreference("MAX_PRICE", -1);
    }

    public final void w() {
        this.putPreference("MIN_PRICE", -1);
    }

    public final void x(String string2) {
        if (string2 != null) {
            String string3 = "NAVIGATION_HIERARCHY_KEY";
            this.putPreference(string3, string2);
        }
    }

    public final void y(int n3) {
        this.putPreference("Notification_Count", n3);
    }

    public final void z(String string2) {
        Intrinsics.checkNotNullParameter(string2, "pcGrp");
        this.putPreference("pc_grp", string2);
    }
}

