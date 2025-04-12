/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.SearchApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from e43
 */
public final class e43_0
extends Hj {
    public final hh3_2 a;
    public final SearchApi b;
    public final HashMap c;
    public final ServiceErrorEventTracker d;
    public final i23_0 e;
    public final ee2_2 f;
    public final zr1_1 g;
    public final BH3 h;
    public final hh3_2 i;

    public e43_0(Application object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        super();
        this.a = object2 = yr1_2.b((Function0)object2);
        this.b = object2 = AjioApiConnector.INSTANCE.getSearchApi();
        object2 = new HashMap();
        this.c = object2;
        this.d = object2 = ServiceErrorEventTracker.INSTANCE;
        this.e = object2 = k23_0.b(0, 0, null, 7);
        this.f = object2 = ms0_1.a((i23_0)object2);
        this.g = object2 = new zr1_1();
        WishListRepo wishListRepo = new WishListRepo((Context)object);
        this.h = object2 = new BH3(wishListRepo);
        object2 = new o33_0((Application)object);
        object = yr1_2.b((Function0)object2);
        this.i = object;
    }

    public static final String b(e43_0 object, String string2) {
        object.getClass();
        object = "?";
        int n3 = StringsKt.F(string2, (CharSequence)object, false);
        String string3 = "/";
        int n4 = 6;
        String string4 = "substring(...)";
        if (n3 != 0) {
            n3 = StringsKt.R(string2, string3, 0, n4) + 1;
            int n7 = StringsKt.O(string2, (String)object, 0, false, n4);
            object = string2.substring(n3, n7);
            Intrinsics.checkNotNullExpressionValue(object, string4);
        } else {
            int n8 = StringsKt.R(string2, string3, 0, n4) + 1;
            object = string2.substring(n8);
            Intrinsics.checkNotNullExpressionValue(object, string4);
        }
        return object;
    }

    public static ArrayList d(List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "productList");
        ArrayList<Product> arrayList = new ArrayList<Product>();
        ArrayList<Product> arrayList2 = new ArrayList<Product>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Boolean bl3;
            boolean bl4;
            Product product = (Product)object.next();
            Boolean bl5 = product.getInStockFlag();
            if (bl5 != null && (bl4 = Intrinsics.areEqual(bl5 = product.getInStockFlag(), bl3 = Boolean.FALSE))) {
                arrayList2.add(product);
                continue;
            }
            arrayList.add(product);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static void h(e43_0 e43_02, String string2) {
        e43_02.getClass();
        Intrinsics.checkNotNullParameter("BackGround_ProductListDetails", "requestID");
        Intrinsics.checkNotNullParameter(string2, "errorMessage");
        String string3 = "";
        Intrinsics.checkNotNullParameter(string3, "flowType");
        aW aW2 = md3_0.c(e43_02);
        r33_0 r33_02 = new r33_0(e43_02, string2, null, false, string3, string3, null);
        Ae3.d(aW2, null, null, r33_02, 3);
    }

    public final void c(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        aW aW2 = md3_0.c(this);
        p33_0 p33_02 = new p33_0(n3, this, string2, null);
        Ae3.d(aW2, null, null, p33_02, 3);
    }

    public final Object e(String object, boolean bl2, f80_0 f80_02) {
        Object object2 = UrlHelper.Companion.getInstance();
        Boolean bl3 = (Boolean)this.i.getValue();
        bl3.getClass();
        Object object3 = bl2;
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = bl3;
        int n4 = 2;
        objectArray[n4] = object3;
        String string2 = ((UrlHelper)object2).getApiUrl("homepage", "products_list_detail", objectArray);
        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        object = this.a;
        object3 = ((hh3_2)object).getValue();
        object2 = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object3 = ((UserInformation)object3).getUserSegementIds();
        if (object3 != null && (bl2 = ((String)object3).length())) {
            object = ((hh3_2)object).getValue();
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = ((UserInformation)object).getUserSegementIds();
            object3 = "segmentIds";
            linkedHashMap.put(object3, object);
        }
        object = ww0_2.a;
        object = ScreenType.SCREEN_PDP;
        String string3 = ww0_2.b((ScreenType)((Object)object));
        n4 = (int)(mz3_0.y(string3) ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(ww0_2.c() ? 1 : 0)) != 0 && (n4 = string3.length()) != 0) {
            object = "userClusterId";
            linkedHashMap.put(object, string3);
        }
        TU2.a(linkedHashMap);
        return this.b.getProductListDetails(string2, linkedHashMap, "BackGround_ProductListDetails", string3, f80_02);
    }

    public final List f(String string2) {
        Object object = "uuid";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n3 = string2.length();
        Object object2 = null;
        if (n3 == 0 || (n3 = (int)(Intrinsics.areEqual(string2, object = "") ? 1 : 0)) != 0) {
            return null;
        }
        object = this.c;
        boolean bl2 = ((HashMap)object).containsKey(string2);
        if (bl2) {
            string2 = ((HashMap)object).get(string2);
            object2 = string2;
            object2 = (List)((Object)string2);
        }
        return object2;
    }

    public final void g(BannerData object, List object2) {
        Object object3;
        Intrinsics.checkNotNullParameter(object, "selectedBanner");
        Object object4 = "bannersList";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        int n3 = object2.indexOf(object);
        int n4 = 2;
        int n7 = -1;
        if (n3 != n7) {
            Integer n8;
            object3 = new ArrayList();
            int n10 = object2.size();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            int n14 = n3 + -1;
            if (n14 < n10 && n14 >= 0) {
                n8 = n14;
                ((ArrayList)object3).add(n8);
            }
            if ((n14 = n3 + -2) < n10 && n14 >= 0) {
                n8 = n14;
                ((ArrayList)object3).add(n8);
            }
            if ((n14 = n3 + 1) < n10 && n14 >= 0) {
                n8 = n14;
                ((ArrayList)object3).add(n8);
            }
            if ((n3 += n4) < n10 && n3 >= 0) {
                object4 = n3;
                ((ArrayList)object3).add(object4);
            }
            object4 = ((ArrayList)object3).iterator();
            while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                n7 = ((Number)object4.next()).intValue();
                object3 = object2.get(n7);
                arrayList.add(object3);
            }
            object2 = md3_0.c(this);
            object4 = new q33_0(this, arrayList, null);
            n7 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object4, n7);
        }
        if ((object2 = ((BannerData)object).getUuid()) == null) {
            if ((object = ((BannerData)object).getProductIds()) != null) {
                object2 = md3_0.c(this);
                object4 = new u33_0(this);
                object3 = new s33_0(this, (String)object, null);
                Ae3.d((i90_0)object2, (CoroutineContext)object4, null, (Function2)object3, n4);
            }
        } else {
            object2 = this.c;
            object4 = ((BannerData)object).getUuid();
            if ((object4 = (List)((HashMap)object2).get(object4)) == null) {
                object4 = ((BannerData)object).getUuid();
                Intrinsics.checkNotNull(object4);
                boolean bl2 = ((HashMap)object2).containsKey(object4);
                if (!bl2 && (object2 = ((BannerData)object).getProductIds()) != null) {
                    object4 = md3_0.c(this);
                    object3 = new v33_0(this);
                    t33_0 t33_02 = new t33_0((BannerData)object, this, (String)object2, null);
                    Ae3.d((i90_0)object4, (CoroutineContext)object3, null, t33_02, n4);
                }
            }
        }
    }

    public final void i(String string2) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        aW aW2 = md3_0.c(this);
        b43_0 b43_02 = new b43_0(this, string2, null);
        Ae3.d(aW2, null, null, b43_02, 3);
    }
}

