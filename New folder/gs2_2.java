/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Payment.BannerInfo;

/*
 * Renamed from gs2
 */
public final class gs2_2
implements View.OnClickListener {
    public final /* synthetic */ BannerInfo a;
    public final /* synthetic */ hs2_1 b;

    public gs2_2(hs2_1 hs2_12, BannerInfo bannerInfo) {
        this.b = hs2_12;
        this.a = bannerInfo;
    }

    public final void onClick(View object) {
        object = this.b.c;
        String string2 = this.a.getTncUrl();
        ((es2_2)object).Oa(string2);
    }
}

