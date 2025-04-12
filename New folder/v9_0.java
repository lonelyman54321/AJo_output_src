/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from v9
 */
public final class v9_0
implements uw3_0,
g71_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ v9_0(Object object) {
        this.a = object;
    }

    public gw_2 D6() {
        return null;
    }

    public void Y9(String string2, String string3, String string4, String string5, String string6) {
        Intrinsics.checkNotNullParameter(string2, "orderStatus");
        Intrinsics.checkNotNullParameter(string4, "returnId");
        Intrinsics.checkNotNullParameter(string5, "orderId");
        Intrinsics.checkNotNullParameter(string6, "position");
    }

    public void Z6(BannerData bannerData, List list) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(list, "bannerList");
    }

    public void a() {
        gj2_1 gj2_12 = ((q9_0)this.a).Y;
        if (gj2_12 != null) {
            gj2_12.a = false;
        }
    }

    public void c4(String object, HotSpotT hotSpotT, String string2, BannerData bannerData, String string3, String string4) {
        Intrinsics.checkNotNullParameter(hotSpotT, "hotspot");
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        Intrinsics.checkNotNullParameter(string4, "creativeSlot");
        object = kj0_1.g();
        hotSpotT = (Activity)this.a;
        ((kj0_1)object).w((Activity)hotSpotT, string2);
    }

    public void e0() {
    }

    public void m(String string2) {
    }
}

