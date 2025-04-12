/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from a43
 */
public final class a43_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ BannerData b;
    public final /* synthetic */ long c;

    public a43_0(ArrayList arrayList, BannerData bannerData, long l2, f80_0 f80_02) {
        this.a = arrayList;
        this.b = bannerData;
        this.c = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.a;
        List list = object2;
        list = (ArrayList)object2;
        BannerData bannerData = this.b;
        long l2 = this.c;
        object2 = object;
        object = new a43_0((ArrayList)list, bannerData, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a43_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = AnalyticsManager.Companion;
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        List list = this.a;
        object2 = this.b;
        long l2 = this.c;
        NewEEcommerceEventsRevamp.pushEEProductImpression$default(newEEcommerceEventsRevamp, list, null, "shop the look video", null, "shop the look", false, string2, "shop the look", string3, null, null, null, false, null, (BannerData)object2, l2, null, null, null, null, null, null, false, 8338986, null);
        return Unit.a;
    }
}

