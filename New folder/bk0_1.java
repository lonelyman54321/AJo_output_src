/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from BK0
 */
public final class bk0_1
implements g71_0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;

    public bk0_1(Activity activity, ArrayList arrayList, int n3) {
        this.a = activity;
        this.b = arrayList;
        this.c = n3;
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

    public final void c4(String object, HotSpotT object2, String object3, BannerData object4, String string2, String string3) {
        String string4;
        int n3;
        Intrinsics.checkNotNullParameter(object2, "hotspot");
        Intrinsics.checkNotNullParameter(object4, "bannerData");
        Intrinsics.checkNotNullParameter(string3, "creativeSlot");
        object = kj0_1.g();
        object2 = this.a;
        ((kj0_1)object).w((Activity)object2, (String)object3);
        int n4 = ((BannerData)object4).getBannerAdIndex();
        object2 = ((BannerData)this.b.get(n4)).getBannerUrl();
        object3 = "/";
        int n7 = 6;
        int n8 = 0;
        string3 = "substring(...)";
        int n10 = 1;
        if (object2 != null && (n3 = StringsKt.F((CharSequence)object2, string4 = "?", false)) == n10) {
            int n14 = StringsKt.R((CharSequence)object2, (String)object3, 0, n7) + n10;
            n7 = StringsKt.O((CharSequence)object2, string4, 0, false, n7);
            object2 = ((String)object2).substring(n14, n7);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else if (object2 != null) {
            int n15 = StringsKt.R((CharSequence)object2, (String)object3, 0, n7) + n10;
            object2 = ((String)object2).substring(n15);
            Intrinsics.checkNotNullExpressionValue(object2, string3);
        } else {
            object2 = null;
        }
        object3 = sq0_1.a;
        object3 = "";
        object4 = object2 == null ? object3 : object2;
        if (object2 == null) {
            object2 = object3;
        }
        object3 = new StringBuilder();
        n8 = this.c;
        object = Xd0.a("|", n8, n4, (StringBuilder)object3);
        sq0_1.h((String)object4, "fleek_insert_banner", (String)object2, (String)object);
    }

    public final void e0() {
    }

    public final void m(String string2) {
    }
}

