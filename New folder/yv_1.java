/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.kmm.shared.model.home.transform.BannerAdsMetaData;
import com.ril.ajio.services.entity.Banner;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yv
 */
public final class yv_1
implements View.OnClickListener {
    public final /* synthetic */ zv_1 a;
    public final /* synthetic */ Banner b;
    public final /* synthetic */ int c;

    public /* synthetic */ yv_1(zv_1 zv_12, Banner banner, int n3) {
        this.a = zv_12;
        this.b = banner;
        this.c = n3;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Banner banner = this.b;
        String string2 = "$banner";
        Intrinsics.checkNotNullParameter(banner, string2);
        object = ((zv_1)object).d;
        if (object != null) {
            int n3 = this.c + 1;
            Object object2 = banner.getBannerAdsMetaData();
            object2 = object2 != null ? ((BannerAdsMetaData)object2).getCtaFb() : null;
            object.I4(banner, n3, (String)object2);
        }
    }
}

