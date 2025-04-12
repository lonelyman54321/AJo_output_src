/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiRequestBody;
import com.ril.ajio.services.data.fleek.seen_components.SesActionApiRequestBody;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import com.ril.ajio.services.network.api.FleekApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CQ0
 */
public final class cq0_1 {
    public final FleekApi a;

    public cq0_1(FleekApi fleekApi) {
        Intrinsics.checkNotNullParameter(fleekApi, "fleekService");
        this.a = fleekApi;
    }

    public final Object a(String string2, String string3, String string4, LinkedHashMap linkedHashMap, int n3, int n4, String string5, f80_0 f80_02) {
        return this.a.getAllBrandsPageData(string2, string3, "Android", string4, n3, n4, string5, linkedHashMap, f80_02);
    }

    public final Object b(String string2, String string3, String string4, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        return this.a.getBrandPageData(string2, string3, "Android", string4, "brandPageApi", linkedHashMap, f80_02);
    }

    public final Object c(String string2, String string3, String string4, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        return this.a.getExploreBrandsPageData(string2, string3, "Android", string4, "exploreBrandsApi", linkedHashMap, f80_02);
    }

    public final Object d(String string2, String string3, String string4, LinkedHashMap linkedHashMap, int n3, int n4, f80_0 f80_02) {
        return this.a.getFeed(string2, string3, "Android", string4, "fleekFeedApi", linkedHashMap, n3, n4, f80_02);
    }

    public final Object e(String string2, JsonObject jsonObject, f80_0 f80_02) {
        return this.a.getFleekBottomNavigation(string2, jsonObject, "BackGround_FLEEK_BOTTOM_TABS_REQUEST", f80_02);
    }

    public final Object f(String string2, String string3, String string4, LinkedHashMap linkedHashMap, f80_0 f80_02) {
        return this.a.getPostDetails(string2, string3, "Android", string4, "postDetailsApi", linkedHashMap, f80_02);
    }

    public final Object g(String string2, String string3, String string4, LinkedHashMap linkedHashMap, int n3, f80_0 f80_02) {
        return this.a.getRecentPostData(string2, string3, "Android", string4, n3, 10, "recentPostApi", linkedHashMap, f80_02);
    }

    public final Object h(String string2, String string3, f80_0 f80_02) {
        return this.a.getStoreMetadata(string2, string3, "BackGround_StoreMetaData", f80_02);
    }

    public final Object i(String string2, String string3, String string4, LinkedHashMap linkedHashMap, int n3, int n4, f80_0 f80_02) {
        return this.a.getStories(string2, string3, "Android", string4, "fleekStoriesApi", linkedHashMap, n3, n4, f80_02);
    }

    public final Object j(String string2, String string3, String string4, SeenApiRequestBody seenApiRequestBody, f80_0 f80_02) {
        return this.a.postSeenStatusContent(string2, string3, "Android", string4, "seenStatusApi", seenApiRequestBody, f80_02);
    }

    public final Object k(String string2, String string3, String string4, SesActionApiRequestBody sesActionApiRequestBody, f80_0 f80_02) {
        return this.a.postSesActionStatus(string2, string3, "Android", string4, "sesActionApi", sesActionApiRequestBody, f80_02);
    }

    public final Object l(String string2, String string3, String string4, ShareActionRequestBody shareActionRequestBody, f80_0 f80_02) {
        return this.a.shareContentAction(string2, string3, "Android", string4, "sesShareActionApi", shareActionRequestBody, f80_02);
    }
}

