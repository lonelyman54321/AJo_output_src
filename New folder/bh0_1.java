/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.navigation.e;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from BH0
 */
public final class bh0_1
implements g71_0 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Activity d;

    public bh0_1(Component component, yT1 yT12, int n3, Activity activity) {
        this.a = component;
        this.b = yT12;
        this.c = n3;
        this.d = activity;
    }

    public final gw_2 D6() {
        return null;
    }

    public final void Y9(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        Intrinsics.checkNotNullParameter(string5, "orderId");
        Intrinsics.checkNotNullParameter(string6, "position");
    }

    public final void Z6(BannerData bannerData, List list) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
    }

    public final void c4(String object, HotSpotT object2, String string2, BannerData object3, String string3, String string4) {
        int n3;
        Intrinsics.checkNotNullParameter(object2, "hotspot");
        Intrinsics.checkNotNullParameter(object3, "bannerData");
        object = "creativeSlot";
        Intrinsics.checkNotNullParameter(string4, (String)object);
        int n4 = ((BannerData)object3).getBannerAdIndex();
        object2 = this.a;
        object3 = ((Component)object2).getSubcomponents();
        int n7 = 0;
        object3 = object3 != null ? (Subcomponent)CollectionsKt.N(n4, (List)object3) : null;
        int n8 = 6;
        String string5 = "";
        if (object3 != null) {
            if ((object3 = ((Subcomponent)object3).getMedia()) == null || (object3 = ((Media)object3).getUrl()) == null) {
                object3 = string5;
            }
            n3 = StringsKt.Q((CharSequence)object3, '/', 0, n8) + 1;
            int n10 = ((String)object3).length();
            object3 = ((String)object3).substring(n3, n10);
            String string6 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string6);
        } else {
            object3 = string5;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            object2 = sq0_1.a;
            object2 = new StringBuilder();
            n7 = this.c;
            string4 = "|";
            object = Xd0.a(string4, n7, n4, (StringBuilder)object2);
            sq0_1.h((String)object3, "fleek_insert_banner_static", (String)object3, (String)object);
            object = kj0_1.g();
            object2 = this.d;
            ((kj0_1)object).w((Activity)object2, string2);
        } else {
            object = ((Component)object2).getTemplate();
            n4 = (int)(Intrinsics.areEqual(object, object2 = "INSERT_SINGLE-BANNER_DEFAULT") ? 1 : 0);
            if (n4 != 0) {
                sq0_1.a.a(string5, string5);
                object = this.b;
                object2 = "brands";
                e.p((e)object, (String)object2, null, n8);
            }
        }
    }

    public final void e0() {
    }

    public final void m(String string2) {
    }
}

