/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zd
 */
public final class zd_1
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ BrandItemData b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ zd_1(boolean bl2, BrandItemData brandItemData, dr0_0 dr0_02, p83_0 p83_02, int n3) {
        this.a = bl2;
        this.b = brandItemData;
        this.c = dr0_02;
        this.d = p83_02;
        this.e = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        pq0_2 pq0_22;
        Object object = this;
        BrandItemData brandItemData = this.b;
        Intrinsics.checkNotNullParameter(brandItemData, "$item");
        dr0_0 dr0_02 = this.c;
        Object object2 = "$fleekViewModel";
        Intrinsics.checkNotNullParameter(dr0_02, (String)object2);
        boolean bl2 = this.a;
        object2 = bl2 ? "follow brand" : "unfollow brand";
        String string2 = object2;
        object2 = sq0_1.a;
        object2 = brandItemData.getName();
        if (object2 == null) {
            object2 = "";
        }
        Object object3 = object2;
        Object object4 = object2 = dr0_02.M0.a.getValue();
        object4 = (String)object2;
        p83_0 p83_02 = ((zd_1)object).d;
        String string3 = String.valueOf(p83_02.size());
        Intrinsics.checkNotNullParameter(object3, "label");
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(object4, "searchTerm");
        Intrinsics.checkNotNullParameter(string3, "customMetric");
        object2 = sq0_1.d;
        Object object5 = pq0_22;
        pq0_22 = new pq0_2(string2, (String)object3, (String)object4, string3, null);
        Ae3.d((i90_0)object2, null, null, pq0_22, 3);
        bl2 = brandItemData.isFollowed();
        boolean bl3 = bl2 ^ true;
        Intrinsics.checkNotNullParameter(p83_02, "allBrandsData");
        Intrinsics.checkNotNullParameter(brandItemData, "item");
        brandItemData.setFollowed(bl3);
        boolean bl4 = ((zd_1)object).e;
        p83_02.remove((int)(bl4 ? 1 : 0));
        int n3 = 2047;
        string2 = null;
        boolean bl5 = false;
        object3 = null;
        object4 = null;
        string3 = null;
        pq0_22 = null;
        object2 = brandItemData;
        boolean bl6 = bl4;
        boolean bl7 = false;
        boolean bl8 = bl3;
        bl3 = false;
        object = dr0_02;
        dr0_02 = null;
        object2 = BrandItemData.copy$default(brandItemData, null, null, null, null, null, null, null, null, null, null, false, n3, null);
        boolean bl9 = bl6;
        object5 = p83_02;
        p83_02.add((int)(bl6 ? 1 : 0), object2);
        object2 = new HD$d(p83_02);
        ((dr0_0)object).B.setValue(object2);
        object2 = brandItemData.getId();
        object5 = "BRAND_DIRECTORY";
        bl9 = bl8;
        object2 = dr0_0.h((String)object2, (String)object5, bl8);
        boolean bl10 = true;
        ((dr0_0)object).V(bl10, (SesActionApiRequestBody)object2);
        object2 = brandItemData.getId();
        if (object2 == null) {
            return Unit.a;
        }
        object5 = ((dr0_0)object).z;
        object3 = ((h83_0)object5).getValue();
        bl5 = object3 instanceof HK0$d;
        if (bl5) {
            object5 = ((h83_0)object5).getValue();
            object3 = "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.feed.FeedViewState.SUCCESS";
            Intrinsics.checkNotNull(object5, (String)object3);
            object5 = ((HK0$d)object5).a;
            ((dr0_0)object).L((FeedEngineData)object5, bl8, (String)object2);
        }
        if (bl5 = (object3 = ((h83_0)(object5 = ((dr0_0)object).E)).getValue()) instanceof GH0$d) {
            object5 = ((h83_0)object5).getValue();
            object3 = "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.explorebrands.ExploreBrandsViewState.SUCCESS";
            Intrinsics.checkNotNull(object5, (String)object3);
            object5 = ((GH0$d)object5).a;
            ((dr0_0)object).e0((ExploreBrandsPageModel)object5, bl9, (String)object2);
        }
        if (!(bl5 = (object3 = ((h83_0)(object5 = ((dr0_0)object).G)).getValue()) instanceof uD$e)) return Unit.a;
        object5 = ((h83_0)object5).getValue();
        object3 = "null cannot be cast to non-null type com.ril.ajio.fleek.ui.composable.home.brand_page.BrandPageViewState.SUCCESS";
        Intrinsics.checkNotNull(object5, (String)object3);
        object5 = ((uD$e)object5).a;
        ((dr0_0)object).I((BrandPageModel)object5, bl9, (String)object2);
        return Unit.a;
    }
}

