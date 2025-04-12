/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import com.ril.ajio.services.data.Product.SimilarProducts;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import com.ril.ajio.services.data.options.CuratedWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OZ
 */
public final class oz_2
extends jD3 {
    public gw_2 a;
    public final HashMap b;
    public final HashMap c;
    public final zr1_1 d;
    public final zr1_1 e;
    public RecentlyViewedProducts f;
    public final t30_0 g;
    public boolean h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;

    public oz_2() {
        Object object = new gw_2(null);
        this.a = object;
        object = new HashMap();
        this.b = object;
        object = new HashMap();
        this.c = object;
        this.d = object = new zr1_1();
        this.e = object;
        this.g = object = new t30_0();
        this.i = object = new zr1_1();
        this.j = object;
        this.k = object = new zr1_1();
        this.l = object;
    }

    public static void h(String string2, String string3, String string4, boolean bl2) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "linkURL");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "creativeSlot");
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        object = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp();
        String string5 = analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp().getEE_SELECT_PROMOTION();
        String string6 = av_0.a(analyticsManager$Companion);
        String string7 = bv_0.a(analyticsManager$Companion);
        String string8 = cv_0.a(analyticsManager$Companion);
        NewEEcommerceEventsRevamp.pushEESelectPromotion$default((NewEEcommerceEventsRevamp)object, string5, string3, string6, string7, "home landing screen", string8, true, false, null, null, string4, bl2, 896, null);
    }

    public final void b(int n3) {
        Product product;
        int n4;
        int n7 = 1;
        RecentlyViewedProducts recentlyViewedProducts = new RecentlyViewedProducts();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n8 = 0;
        PlpProductUIModel plpProductUIModel = null;
        Object object = null;
        for (int i3 = 0; i3 < (n4 = 4); i3 += n7) {
            product = new Product();
            HomeWidgetTypes homeWidgetTypes = HomeWidgetTypes.HOME_WIDGET_TYPE_SHIMMER;
            product.setProductType(homeWidgetTypes);
            arrayList.add(product);
        }
        recentlyViewedProducts.setProducts(arrayList);
        arrayList = new ArrayList<Object>();
        arrayList.clear();
        object = recentlyViewedProducts.getProducts();
        if (object != null) {
            object = ((Iterable)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                product = object.next();
                int n10 = n8 + 1;
                if (n8 >= 0) {
                    Intrinsics.checkNotNull(product);
                    int n14 = 500;
                    plpProductUIModel = n00.e(product, n8, n7 != 0, null, n14);
                    arrayList.add(plpProductUIModel);
                    n8 = n10;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        recentlyViewedProducts.setProductUIModelList(arrayList);
        Integer n15 = n3;
        this.b.put(n15, recentlyViewedProducts);
    }

    public final void c(int n3) {
        boolean bl2 = true;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        RecentlyViewedProducts recentlyViewedProducts = new RecentlyViewedProducts();
        Object object = new ArrayList();
        Object object2 = new Product();
        Object object3 = HomeWidgetTypes.HOME_WIDGET_TYPE_HIDE;
        ((Product)object2).setProductType((HomeWidgetTypes)((Object)object3));
        ((ArrayList)object).add(object2);
        recentlyViewedProducts.setProducts((List)object);
        arrayList.clear();
        object = recentlyViewedProducts.getProducts();
        if (object != null) {
            boolean bl3;
            object = ((Iterable)object).iterator();
            int n4 = 0;
            object2 = null;
            while (bl3 = object.hasNext()) {
                object3 = object.next();
                int n7 = n4 + 1;
                if (n4 >= 0) {
                    object3 = (Product)object3;
                    Intrinsics.checkNotNull(object3);
                    int n8 = 500;
                    object2 = n00.e((Product)object3, n4, bl2, null, n8);
                    arrayList.add(object2);
                    n4 = n7;
                    continue;
                }
                xx_2.n();
                throw null;
            }
        }
        recentlyViewedProducts.setProductUIModelList(arrayList);
        Integer n10 = n3;
        this.b.put(n10, recentlyViewedProducts);
    }

    public final void d(CuratedWidget object, int n3) {
        HashMap hashMap = this.c;
        if (object == null) {
            int n4 = 15;
            boolean bl2 = false;
            Object object2 = object;
            object = new CuratedWidget(null, null, null, null, n4, null);
            object2 = CuratedLayoutType.HOME_WIDGET_TYPE_HIDE;
            ((CuratedWidget)object).setLayoutType((CuratedLayoutType)((Object)object2));
            object2 = n3;
            hashMap.put(object2, object);
        } else {
            Object object3 = ((CuratedWidget)object).getCuratedWidgetItemList();
            boolean bl3 = object3.isEmpty();
            if (bl3) {
                boolean bl4 = false;
                int n7 = 15;
                object = new CuratedWidget(null, null, null, null, n7, null);
                object3 = CuratedLayoutType.HOME_WIDGET_TYPE_HIDE;
                ((CuratedWidget)object).setLayoutType((CuratedLayoutType)((Object)object3));
                object3 = n3;
                hashMap.put(object3, object);
            } else {
                object3 = CuratedLayoutType.HOME_WIDGET_TYPE_CURATED;
                ((CuratedWidget)object).setLayoutType((CuratedLayoutType)((Object)object3));
                object3 = n3;
                hashMap.put(object3, object);
            }
        }
        object = this.k;
        Integer n8 = n3;
        ((LiveData)object).k(n8);
    }

    public final void e(ArrayList arrayList, int n3, int n4) {
        boolean bl2;
        Serializable serializable = arrayList;
        int n7 = n4;
        zr1_1 zr1_12 = this.i;
        HashMap hashMap = this.b;
        if (arrayList != null && !(bl2 = arrayList.isEmpty())) {
            RecentlyViewedProducts recentlyViewedProducts = new RecentlyViewedProducts();
            int n8 = arrayList.size();
            int n10 = 0;
            if (n4 >= n8) {
                n7 = arrayList.size();
                serializable = arrayList.subList(0, n7);
                recentlyViewedProducts.setProducts((List)((Object)serializable));
            } else {
                serializable = arrayList.subList(0, n4);
                recentlyViewedProducts.setProducts((List)((Object)serializable));
            }
            serializable = new ArrayList();
            ((ArrayList)serializable).clear();
            Object object = recentlyViewedProducts.getProducts();
            Object object2 = "getProducts(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = ((Iterable)object).iterator();
            while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = object.next();
                int n14 = n10 + 1;
                if (n10 >= 0) {
                    Object object3 = object2;
                    object3 = (Product)object2;
                    object2 = n00.a;
                    Intrinsics.checkNotNull(object3);
                    String string2 = "Similar Products";
                    int n15 = 40;
                    object2 = n00.c((Product)object3, n3, null, string2, false, n15);
                    ((ArrayList)serializable).add(object2);
                    n10 = n14;
                    continue;
                }
                xx_2.n();
                throw null;
            }
            recentlyViewedProducts.setProductUIModelList((List)((Object)serializable));
            serializable = Integer.valueOf(n3);
            hashMap.put(serializable, recentlyViewedProducts);
            serializable = Integer.valueOf(n3);
            zr1_12.k(serializable);
        } else {
            serializable = Integer.valueOf(n3);
            hashMap.put(serializable, null);
            serializable = Integer.valueOf(n3);
            zr1_12.k(serializable);
        }
    }

    public final void f(DataCallback object, int n3) {
        boolean bl2 = true;
        ArrayList<PlpProductUIModel> arrayList = new ArrayList<PlpProductUIModel>();
        zr1_1 zr1_12 = this.i;
        HashMap hashMap = this.b;
        if (object != null) {
            Object object2;
            object = (RecentlyViewedProducts)((DataCallback)object).getData();
            arrayList.clear();
            if (object != null && (object2 = ((RecentlyViewedProducts)object).getProducts()) != null) {
                boolean bl3;
                object2 = ((Iterable)object2).iterator();
                int n4 = 0;
                PlpProductUIModel plpProductUIModel = null;
                while (bl3 = object2.hasNext()) {
                    Object object3 = object2.next();
                    int n7 = n4 + 1;
                    if (n4 >= 0) {
                        object3 = (Product)object3;
                        Intrinsics.checkNotNull(object3);
                        int n8 = 500;
                        plpProductUIModel = n00.e(object3, n4, bl2, null, n8);
                        arrayList.add(plpProductUIModel);
                        n4 = n7;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
            }
            if (object != null) {
                ((RecentlyViewedProducts)object).setProductUIModelList(arrayList);
            }
            if (object != null) {
                Object object4 = n3;
                hashMap.put(object4, object);
                object = ((RecentlyViewedProducts)object).getPriceRevealMetaInfo();
                if (object != null) {
                    object4 = tr2_2.a;
                    object4 = ((PriceRevealMetaInfo)object).getSaleStartTime();
                    object = ((PriceRevealMetaInfo)object).getSaleEndTime();
                    tr2_2.B((Long)object4, (Long)object);
                }
                object = n3;
                zr1_12.k(object);
            }
        } else {
            object = n3;
            hashMap.put(object, null);
            object = n3;
            zr1_12.k(object);
        }
    }

    public final void g(SimilarProducts similarProducts, int n3) {
        zr1_1 zr1_12 = this.i;
        Serializable serializable = this.b;
        Integer n4 = null;
        if (similarProducts == null) {
            Integer n7 = n3;
            ((HashMap)serializable).put(n7, null);
            serializable = Integer.valueOf(n3);
            zr1_12.k(serializable);
        } else {
            RecentlyViewedProducts recentlyViewedProducts = new RecentlyViewedProducts();
            ArrayList<Object> arrayList = similarProducts.getSimilarProducts();
            recentlyViewedProducts.setProducts(arrayList);
            arrayList = new ArrayList<Object>();
            arrayList.clear();
            Object object = recentlyViewedProducts.getProducts();
            if (object != null) {
                boolean bl2;
                object = ((Iterable)object).iterator();
                int n8 = 0;
                Object object2 = null;
                while (bl2 = object.hasNext()) {
                    Object e2 = object.next();
                    int n10 = n8 + 1;
                    if (n8 >= 0) {
                        Object object3 = e2;
                        object3 = (Product)e2;
                        object2 = n00.a;
                        Intrinsics.checkNotNull(object3);
                        String string2 = "Similar Products";
                        int n14 = 40;
                        object2 = n00.c(object3, n3, null, string2, false, n14);
                        arrayList.add(object2);
                        n8 = n10;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
            }
            recentlyViewedProducts.setProductUIModelList(arrayList);
            n4 = n3;
            ((HashMap)serializable).put(n4, recentlyViewedProducts);
            serializable = Integer.valueOf(n3);
            zr1_12.k(serializable);
        }
    }
}

