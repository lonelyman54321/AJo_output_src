/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from L33
 */
public final class l33_0
implements View.OnClickListener {
    public final /* synthetic */ g71_0 a;
    public final /* synthetic */ BannerData b;
    public final /* synthetic */ List c;

    public /* synthetic */ l33_0(g71_0 g71_02, BannerData bannerData, List list) {
        this.a = g71_02;
        this.b = bannerData;
        this.c = list;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$homeComponentClickListener");
        BannerData bannerData = this.b;
        Intrinsics.checkNotNullParameter(bannerData, "$bannerData");
        List list = this.c;
        Intrinsics.checkNotNullParameter(list, "$bannerList");
        object.Z6(bannerData, list);
    }
}

