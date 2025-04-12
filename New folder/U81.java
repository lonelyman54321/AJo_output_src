/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import kotlin.jvm.internal.Intrinsics;

public final class U81
implements View.OnClickListener {
    public final /* synthetic */ HotSpotT a;
    public final /* synthetic */ g71_0 b;
    public final /* synthetic */ BannerData c;
    public final /* synthetic */ String d;

    public /* synthetic */ U81(HotSpotT hotSpotT, g71_0 g71_02, BannerData bannerData, String string2) {
        this.a = hotSpotT;
        this.b = g71_02;
        this.c = bannerData;
        this.d = string2;
    }

    public final void onClick(View object) {
        boolean bl2;
        HotSpotT hotSpotT = this.a;
        Intrinsics.checkNotNullParameter(hotSpotT, "$hotSpot");
        g71_0 g71_02 = this.b;
        Intrinsics.checkNotNullParameter(g71_02, "$homeComponentClickListener");
        BannerData bannerData = this.c;
        Intrinsics.checkNotNullParameter(bannerData, "$banner");
        String string2 = this.d;
        object = "$creativeSlot";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        String string3 = hotSpotT.getType();
        if (string3 != null && !(bl2 = string3.equalsIgnoreCase((String)(object = "HOTSPOT"))) && !(bl2 = string3.equalsIgnoreCase((String)(object = "NOTIFY_ME")))) {
            object = "VIDEO";
            bl2 = string3.equalsIgnoreCase((String)object);
            if (bl2) {
                object = hotSpotT.getHotspotUrl();
                g71_02.m((String)object);
            }
        } else {
            String string4 = hotSpotT.getHotspotUrl();
            g71_02.c4(string3, hotSpotT, string4, bannerData, null, string2);
        }
    }
}

