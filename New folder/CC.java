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

public final class CC
implements g71_0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public CC(Activity activity, ArrayList arrayList, String string2, int n3) {
        this.a = activity;
        this.b = arrayList;
        this.c = string2;
        this.d = n3;
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

    public final void c4(String object, HotSpotT object2, String charSequence, BannerData object3, String object4, String string2) {
        String string3;
        int n3;
        Intrinsics.checkNotNullParameter(object2, "hotspot");
        Intrinsics.checkNotNullParameter(object3, "bannerData");
        Intrinsics.checkNotNullParameter(string2, "creativeSlot");
        object = kj0_1.g();
        object2 = this.a;
        ((kj0_1)object).w((Activity)object2, (String)charSequence);
        int n4 = ((BannerData)object3).getBannerAdIndex();
        object2 = ((BannerData)this.b.get(n4)).getBannerUrl();
        charSequence = "/";
        int n7 = 6;
        object4 = null;
        string2 = "substring(...)";
        int n8 = 1;
        if (object2 != null && (n3 = StringsKt.F((CharSequence)object2, string3 = "?", false)) == n8) {
            int n10 = StringsKt.R((CharSequence)object2, (String)charSequence, 0, n7) + n8;
            n7 = StringsKt.O((CharSequence)object2, string3, 0, false, n7);
            object2 = ((String)object2).substring(n10, n7);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
        } else if (object2 != null) {
            int n14 = StringsKt.R((CharSequence)object2, (String)charSequence, 0, n7) + n8;
            object2 = ((String)object2).substring(n14);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
        } else {
            object2 = null;
        }
        charSequence = new StringBuilder("fleek_insert_contentonly_");
        object3 = this.c;
        ((StringBuilder)charSequence).append((String)object3);
        charSequence = ((StringBuilder)charSequence).toString();
        object4 = sq0_1.a;
        object4 = "";
        if (object3 == null) {
            object3 = object4;
        }
        if (object2 == null) {
            object2 = object4;
        }
        object4 = new StringBuilder();
        int n15 = this.d;
        object = Xd0.a("|", n15, n4, (StringBuilder)object4);
        sq0_1.h((String)object3, (String)charSequence, (String)object2, (String)object);
    }

    public final void e0() {
    }

    public final void m(String string2) {
    }
}

