/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.earlyaccess.entity.EarlyAccessBannerData;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.user.ScreenType;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ww0
 */
public final class ww0_2 {
    public static List a;
    public static final hh3_2 b;

    static {
        j00 j002 = new j00(1);
        b = yr1_2.b(j002);
    }

    public static String a(ScreenType screenType) {
        Intrinsics.checkNotNullParameter((Object)screenType, "screenType");
        Object object = CustomerStoreType.a;
        object = od3_2.a();
        String string2 = "";
        int n3 = string2.length();
        if (n3 != 0) {
            object = string2;
        }
        string2 = ld3_2.STORE_AJIO.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (bl2) {
            object = "rilfnl";
        }
        return CustomerStoreType.a((String)object, screenType);
    }

    public static String b(ScreenType object) {
        Intrinsics.checkNotNullParameter(object, "screenType");
        Object object2 = CustomerStoreType.a;
        object2 = od3_2.a();
        String string2 = "";
        int n3 = string2.length();
        if (n3 != 0) {
            object2 = string2;
        }
        string2 = ld3_2.STORE_AJIO.getStoreId();
        boolean bl2 = Intrinsics.areEqual(object2, string2);
        if (bl2) {
            object2 = "rilfnl";
        }
        object = URLEncoder.encode(CustomerStoreType.a((String)object2, object), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(object, "encode(...)");
        return object;
    }

    public static boolean c() {
        boolean bl2;
        Object object = (EarlyAccessBannerData)b.getValue();
        if (object != null) {
            object = ((EarlyAccessBannerData)object).getEnableEarlyAccess();
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, bl3);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static String d(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object = b;
        Object object2 = (EarlyAccessBannerData)((hh3_2)object).getValue();
        boolean bl3 = false;
        if (object2 != null) {
            object2 = ((EarlyAccessBannerData)object2).getEnableEarlyAccess();
            Boolean bl4 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object2, bl4);
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2) {
            int n3;
            if ((object = (EarlyAccessBannerData)((hh3_2)object).getValue()) != null) {
                object = ((EarlyAccessBannerData)object).getCartVariant();
            } else {
                n3 = 0;
                object = null;
            }
            bl2 = true;
            if (object == null || (n3 = ((String)object).length()) == 0) {
                bl3 = true;
            }
            if (!bl3) {
                object = "?";
                n3 = (int)(StringsKt.F(string2, (CharSequence)object, bl2) ? 1 : 0);
                if (n3 != 0) {
                    object = "&variant=22.08.02";
                    string2 = string2.concat((String)object);
                } else {
                    object = "?variant=22.08.02";
                    string2 = string2.concat((String)object);
                }
            }
        }
        return string2;
    }
}

