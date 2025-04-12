/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.entity.BannerAdData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vv
 */
public final class vv_0
implements View.OnClickListener {
    public final /* synthetic */ wv_0 a;
    public final /* synthetic */ BannerAdData b;

    public /* synthetic */ vv_0(wv_0 wv_02, BannerAdData bannerAdData) {
        this.a = wv_02;
        this.b = bannerAdData;
    }

    public final void onClick(View object) {
        int n3;
        String string2;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((wv_0)object2).b;
        BannerAdData bannerAdData = this.b;
        object.invoke(bannerAdData);
        object = zv0_2.b(((RecyclerView$B)object2).itemView.getContext());
        object2 = "null cannot be cast to non-null type android.app.Activity";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (Activity)object;
        if (bannerAdData == null || (object2 = bannerAdData.getCtafb()) == null) {
            object2 = "";
        }
        Bundle bundle = new Bundle();
        boolean bl2 = true;
        bundle.putBoolean("from_banner_ads", bl2);
        String string3 = null;
        if (bannerAdData != null) {
            string2 = bannerAdData.getCcbValue();
        } else {
            bl2 = false;
            string2 = null;
        }
        String string4 = "banner_ad_ccb";
        bundle.putString(string4, string2);
        if (bannerAdData != null) {
            string2 = bannerAdData.getDesc2();
        } else {
            bl2 = false;
            string2 = null;
        }
        if (bannerAdData != null) {
            string4 = bannerAdData.getCmpid();
        } else {
            n3 = 0;
            string4 = null;
        }
        String string5 = "JioAds - ";
        StringBuilder stringBuilder = new StringBuilder(string5);
        stringBuilder.append(string2);
        stringBuilder.append(" - ");
        stringBuilder.append(string4);
        string2 = stringBuilder.toString();
        n3 = 100;
        string2 = le3_2.E(n3, string2);
        string4 = "banner_ad_source_details";
        bundle.putString(string4, string2);
        if (bannerAdData != null) {
            string3 = bannerAdData.getClickId();
        }
        bundle.putString("click_id", string3);
        kj0_1.g().r((Activity)object, (String)object2, bundle);
    }
}

