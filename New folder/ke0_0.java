/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.services.query.ProductListQuery;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ke0
 */
public final class ke0_0 {
    public static String a;

    public static boolean b(ProductListQuery object, boolean bl2) {
        boolean bl3;
        block7: {
            block8: {
                String string2;
                boolean bl4;
                int n3;
                Object object2;
                Intrinsics.checkNotNullParameter(object, "productListQuery");
                boolean bl5 = h40_0.a.K1();
                bl3 = false;
                if (!bl5) break block7;
                bl5 = true;
                if (!bl2) break block8;
                Object object3 = "";
                if (object == null || (object2 = ((ProductListQuery)object).getQueryText()) == null) {
                    object2 = object3;
                }
                if ((n3 = ((String)object2).length()) > 0 && (bl4 = StringsKt.F((CharSequence)object2, string2 = "autoSuggestSearchTerm", bl5))) break block8;
                if (object != null) {
                    object2 = ((ProductListQuery)object).getAdaptiveSearchReplayResponse();
                } else {
                    bl4 = false;
                    object2 = null;
                }
                if (object2 == null) break block7;
                if ((object = ((ProductListQuery)object).getAdaptiveSearchReplayResponse().getAutoSuggestSearchTerm()) != null) {
                    object3 = object;
                }
                int n4 = ((String)object3).length();
                if (n4 <= 0) break block7;
            }
            bl3 = true;
        }
        return bl3;
    }

    public static void c(PLPRequest object, LinkedHashMap linkedHashMap, ProductListQuery object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "plpRequest");
        Intrinsics.checkNotNullParameter(linkedHashMap, "queryMap");
        String string2 = "productListQuery";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n3 = ke0_0.b((ProductListQuery)object2, bl2);
        if (n3 != 0) {
            object2 = "personalisedUserRelevancy";
            String string3 = "true";
            linkedHashMap.put(object2, string3);
            n3 = ((PLPRequest)object).getCurrentPage();
            object = ((PLPRequest)object).getPrevProductListsOffset();
            if (object != null && (bl2 = ((String)object).length()) && n3 > 0) {
                object2 = "prevProductListsOffset";
                linkedHashMap.put(object2, object);
            }
        }
    }

    public em0_2 a() {
        return em0_2.b;
    }
}

