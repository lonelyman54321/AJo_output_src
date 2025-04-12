/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.landingpage.fragment.HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from K71
 */
public final class k71_0
implements R71 {
    public final /* synthetic */ i71_0 a;

    public k71_0(i71_0 i71_02) {
        this.a = i71_02;
    }

    public final void a(float f5, int n3, Object object) {
        Object object2 = object;
        object2 = (UserUnratedItem)object;
        Intrinsics.checkNotNullParameter(object2, "data");
        i71_0 i71_02 = this.a;
        i71_02.g = n3;
        String string2 = ((UserUnratedItem)object2).getImageUrl();
        String string3 = ((UserUnratedItem)object2).getBrandTitle();
        Object object3 = ((UserUnratedItem)object2).getBrandName();
        String string4 = ((UserUnratedItem)object2).getSkuId();
        Object object4 = object2;
        Float f6 = Float.valueOf(f5);
        int n4 = 16320;
        String string5 = "LP";
        object2 = new RatingsModel((String)object3, string3, string2, f6, string4, string5, null, null, null, null, null, null, null, null, n4, null);
        object2 = wD2$a.b(wd2_0.Companion, (RatingsModel)object2);
        object4 = i71_02.k;
        if (object4 != null) {
            ((Timer)object4).cancel();
        }
        i71_02.k = object4 = new Timer();
        object3 = new HomePageRatingFragment$setAdapterForRecyclerView$2$onRatingsClicked$1(i71_02, (wd2_0)object2);
        ((Timer)object4).schedule((TimerTask)object3, 500L);
    }
}

