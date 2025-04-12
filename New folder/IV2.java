/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.api.SearchApi;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class IV2 {
    public final SearchApi a;

    public IV2(SearchApi searchApi) {
        Intrinsics.checkNotNullParameter(searchApi, "searchApi");
        this.a = searchApi;
    }

    public final Object a(String string2, LinkedHashMap linkedHashMap, String string3, f80_0 f80_02) {
        return this.a.getRecentlyViewedProducts(string2, linkedHashMap, "BackGround_SearchRecentlyViewedProductList", string3, f80_02);
    }

    public final Object b(String string2, LinkedHashMap linkedHashMap, HashMap hashMap, f80_0 f80_02) {
        return this.a.getSearchProducts(string2, linkedHashMap, hashMap, f80_02);
    }

    public final Object c(String string2, HashMap hashMap, f80_0 f80_02) {
        return this.a.getSearchSuggestions(string2, hashMap, "BackGround_SearchSuggestions", f80_02);
    }

    public final Object d(String string2, String string3, f80_0 f80_02) {
        return this.a.getStoreMetadata(string2, string3, "BackGround_StoreMetaData", f80_02);
    }
}

