/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 */
import android.app.Application;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.model.ClosetComponentTimeTrack;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.permission.PermissionTrigger;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.PriceReveal;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.QueryCart;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.c;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from KY1
 */
public final class ky1_0
extends Hj {
    public final LinkedHashSet A;
    public int B;
    public String C;
    public String D;
    public HashMap E;
    public boolean F;
    public final t30_0 G;
    public final zr1_1 H;
    public String I;
    public final ArrayList J;
    public String K;
    public final hh3_2 a;
    public final CartApiRepo b;
    public final WishListRepo c;
    public final NewCustomEventsRevamp d;
    public final NewEEcommerceEventsRevamp e;
    public final String f;
    public final String g;
    public final jo_2 h;
    public final BH3 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public final zr1_1 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final zr1_1 q;
    public Product r;
    public ProductOptionItem s;
    public ProductOptionItem t;
    public ArrayList u;
    public ArrayList v;
    public int w;
    public ProductsList x;
    public final ArrayList y;
    public final ArrayList z;

    public ky1_0(Application application) {
        Object object = application;
        Intrinsics.checkNotNullParameter(application, "application");
        super(application);
        Object object2 = new fy1_1(0);
        this.a = object2 = yr1_2.b((Function0)object2);
        Object object3 = this.getApplication();
        this.b = object2 = new CartApiRepo((Context)object3);
        this.c = object2 = new WishListRepo((Context)application);
        object3 = AnalyticsManager.Companion;
        Object object4 = ((AnalyticsManager$Companion)object3).getInstance().getNewCustomEventsRevamp();
        this.d = object4;
        this.e = object3 = ((AnalyticsManager$Companion)object3).getInstance().getNewEEcommerceEventsRevamp();
        this.f = object4 = ((NewEEcommerceEventsRevamp)object3).getPrevScreen();
        this.g = object3 = ((NewEEcommerceEventsRevamp)object3).getPrevScreenType();
        object = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        this.h = object3 = new jo_2((Context)object);
        super((WishListRepo)object2);
        this.i = object;
        super();
        this.j = object;
        super();
        this.k = object;
        super();
        this.l = object;
        super();
        this.m = object;
        super();
        this.n = object;
        super();
        this.o = object;
        super();
        this.p = object;
        this.q = object;
        super();
        this.r = object;
        object2 = object;
        super(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, 0, false, 0x1FFFFFF, null);
        this.s = object;
        this.w = -1;
        super();
        this.y = object;
        super();
        this.z = object;
        super();
        this.A = object;
        super();
        this.E = object;
        super();
        this.G = object;
        super();
        this.H = object;
        super();
        this.J = object;
        this.K = "";
    }

    public static ArrayList g(HashMap object, ArrayList arrayList) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "savedClosetData");
        Intrinsics.checkNotNullParameter(arrayList, "products");
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            Iterator iterator = arrayList.iterator();
            block1: while (bl3 = iterator.hasNext()) {
                boolean bl4;
                Object object3 = (Product)iterator.next();
                Object object4 = ((Product)object3).getCode();
                boolean bl5 = kotlin.text.b.i(string2, (String)object4, bl4 = true);
                if (!bl5) continue;
                object4 = iw_1.a;
                object4.getClass();
                bl5 = iw_1.e((Product)object3, (String)object2);
                if (!bl5 || (object3 = ((Product)object3).getImages()) == null) continue;
                object3 = object3.iterator();
                while (bl5 = object3.hasNext()) {
                    String string3;
                    object4 = (ProductImage)object3.next();
                    String string4 = ((ProductImage)object4).getFormat();
                    bl4 = TextUtils.isEmpty((CharSequence)string4);
                    if (bl4 || !(bl4 = Intrinsics.areEqual(string4 = ((ProductImage)object4).getFormat(), string3 = "product"))) continue;
                    object3 = ((ProductImage)object4).getUrl();
                    if (object3 == null) {
                        object3 = "";
                    }
                    arrayList2.add(object3);
                    continue block1;
                }
            }
        }
        return arrayList2;
    }

    public final void b(String string2, String string3) {
        aW aW2 = md3_0.c(this);
        KY1$a kY1$a = new KY1$a(string2, string3, null);
        Ae3.d(aW2, null, null, kY1$a, 3);
    }

    public final void c(Product product) {
        Object object = "product";
        Intrinsics.checkNotNullParameter(product, (String)object);
        Intrinsics.checkNotNullParameter(product, (String)object);
        boolean bl2 = og1_1.b();
        if (!bl2) {
            object = h40_0.a;
            bl2 = h40_0.Y1();
            if (bl2 && (bl2 = h40_0.T0())) {
                object = product.getAverageRating();
                String string2 = product.getNumUserRatings();
                kp_1 kp_12 = new kp_1(product);
                ai0_2.r(kp_12, object, string2);
            }
        }
        this.r = product;
    }

    public final void d(String object, String object2, String string2) {
        QueryCart queryCart = new QueryCart();
        queryCart.setProductCode((String)object);
        int n3 = 1;
        queryCart.setQuantity(n3);
        queryCart.setCommercialType(string2);
        if (object2 != null) {
            queryCart.setImsBatchId((String)object2);
        }
        object = md3_0.c(this);
        object2 = new ly1_2(this, queryCart, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public final void e(String string2, String string3, String string4) {
        Object object = "commercialType";
        Intrinsics.checkNotNullParameter(string4, (String)object);
        boolean bl2 = ap_0.b();
        if (bl2) {
            this.d(string2, string3, string4);
        } else {
            object = md3_0.c(this);
            KY1$b kY1$b = new KY1$b(this, string2, string3, string4, null);
            int n3 = 3;
            string3 = null;
            Ae3.d((i90_0)object, null, null, kY1$b, n3);
        }
    }

    public final void f(String string2, String string3, String object) {
        Intrinsics.checkNotNullParameter(string2, "productCode");
        Intrinsics.checkNotNullParameter(string3, "sourceStoreId");
        object = md3_0.c(this);
        KY1$c kY1$c = new KY1$c(this, string2, string3, null);
        Ae3.d((i90_0)object, null, null, kY1$c, 3);
    }

    public final boolean h() {
        Object object = this.x;
        int n3 = 1;
        if (object != null) {
            int n4;
            int n7 = 0;
            Pagination pagination = null;
            if (object != null) {
                object = ((ProductsList)object).getPagination();
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null) {
                object = this.x;
                if (object != null) {
                    object = ((ProductsList)object).getPagination();
                } else {
                    n4 = 0;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                n4 = ((Pagination)object).getCurrentPage();
                ProductsList productsList = this.x;
                if (productsList != null) {
                    pagination = productsList.getPagination();
                }
                Intrinsics.checkNotNull(pagination);
                n7 = pagination.getTotalPages() - n3;
                if (n4 < n7) {
                    n3 = 0;
                }
            }
        }
        return n3 != 0;
    }

    public final boolean i() {
        Iterable iterable = this.u;
        if (iterable != null) {
            int n3;
            if (iterable != null) {
                iterable = xx_2.g(iterable);
            } else {
                n3 = 0;
                iterable = null;
            }
            Intrinsics.checkNotNull(iterable);
            int n4 = ((c)iterable).a;
            n3 = ((c)iterable).b;
            if (n4 <= n3) {
                while (true) {
                    Cloneable cloneable = this.u;
                    Intrinsics.checkNotNull(cloneable);
                    cloneable = (ProductOptionVariant)((ArrayList)cloneable).get(n4);
                    boolean bl2 = ((ProductOptionVariant)cloneable).isStockAvailable();
                    if (bl2) {
                        return true;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        Object object = this.a.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return ((UserInformation)object).isUserOnline();
    }

    public final boolean k() {
        int n3;
        Object object = this.x;
        int n4 = 0;
        if (object == null) {
            return false;
        }
        if ((object = ((ProductsList)object).getPagination()) != null) {
            n3 = ((Pagination)object).getCurrentPage();
        } else {
            n3 = 0;
            object = null;
        }
        Object object2 = this.x;
        int n7 = 1;
        int n8 = object2 != null && (object2 = ((ProductsList)object2).getPagination()) != null ? ((Pagination)object2).getTotalPages() : 1;
        if (n3 < (n8 -= n7)) {
            object = this.x;
            if (object != null && (object = ((ProductsList)object).getPagination()) != null) {
                n4 = ((Pagination)object).getCurrentPage();
            }
            this.o(n4 += n7);
            n4 = 1;
        }
        return n4 != 0;
    }

    public final void l(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) > 0) {
            aW aW2 = md3_0.c(this);
            py1_2 py1_22 = new py1_2(this, string2, null);
            int n4 = 3;
            Ae3.d(aW2, null, null, py1_22, n4);
        }
    }

    public final void m(String string2) {
        Intrinsics.checkNotNullParameter(string2, "date4Closet");
        jo_2 jo_22 = this.h;
        String string3 = "closet_card_in_home";
        Object object = jo_22.getPreference(string3, "");
        if (object != null) {
            Gson gson = new Gson();
            Class<ClosetComponentTimeTrack> clazz = ClosetComponentTimeTrack.class;
            object = (ClosetComponentTimeTrack)gson.fromJson((String)object, clazz);
            int n3 = 1;
            if (object == null) {
                object = new ClosetComponentTimeTrack(string2, n3);
            } else {
                String string4 = ((ClosetComponentTimeTrack)object).getDdMmYyyy();
                boolean bl2 = Intrinsics.areEqual(string4, string2);
                if (bl2) {
                    int n4 = ((ClosetComponentTimeTrack)object).getCount() + n3;
                    ((ClosetComponentTimeTrack)object).setCount(n4);
                } else {
                    ((ClosetComponentTimeTrack)object).setDdMmYyyy(string2);
                    ((ClosetComponentTimeTrack)object).setCount(n3);
                }
            }
            string2 = gson.toJson(object);
            if (string2 != null) {
                jo_22.putPreference(string3, string2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final boolean n() {
        var1_1 = h40_0.a;
        var2_2 = h40_0.k1();
        var3_3 = false;
        var4_4 = true;
        if (!var2_2) ** GOTO lbl-1000
        var1_1 = h40_0.E().getTouchPointList();
        if (var1_1 != null) {
            var5_5 = PermissionTrigger.WISHLIST.getValue();
            var2_2 = StringsKt.F((CharSequence)var1_1, var5_5, false);
        } else {
            var2_2 = false;
            var1_1 = null;
        }
        if (var2_2) {
            var2_2 = true;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = false;
            var1_1 = null;
        }
        if (var2_2) {
            var1_1 = this.y;
            if (var1_1 == null) {
                var6_6 = true;
            } else {
                var6_6 = false;
                var5_5 = null;
            }
            if (!var6_6 && (var2_2 = var1_1.isEmpty() ^ var4_4)) {
                var3_3 = true;
            }
        }
        return var3_3;
    }

    public final void o(int n3) {
        Object object = cp_1.Companion;
        object.getClass();
        boolean bl2 = cp$a.y();
        if (!bl2) {
            return;
        }
        Object object2 = WishListRepo.getWishList$default(this.c, n3, 10, false, 4, null);
        object = new zz1_0(this, 1);
        gy1_1 gy1_12 = new gy1_1(object, 0);
        object = new hy1_2(this, 0);
        iy1_0 iy1_02 = new iy1_0(object, 0);
        object2 = ((g53_0)object2).f(gy1_12, iy1_02);
        this.G.b((yr0_2)object2);
    }

    public final void onCleared() {
        super.onCleared();
        this.G.d();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void p(ProductsList productsList, boolean bl2) {
        boolean bl3;
        int n3;
        ky1_0 ky1_02 = this;
        Object object = productsList;
        int n4 = 2;
        float f5 = 2.8E-45f;
        int n7 = 0;
        Object object2 = null;
        int n8 = 1;
        if (productsList == null) {
            return;
        }
        this.x = productsList;
        Object object3 = productsList.getPagination();
        if (object3 != null) {
            object3 = productsList.getPagination();
            Intrinsics.checkNotNull(object3);
            this.B = n3 = ((Pagination)object3).getTotalResults();
        }
        object3 = productsList.getPagination();
        Object object4 = ky1_02.A;
        Object object5 = ky1_02.y;
        if (object3 != null && (n3 = ((Pagination)object3).getCurrentPage()) == 0) {
            ((AbstractCollection)object4).clear();
            ((ArrayList)object5).clear();
        }
        if ((object3 = productsList.getProducts()) == null) {
            return;
        }
        object = productsList.getProducts();
        Intrinsics.checkNotNull(object);
        object = (Collection)object;
        ((AbstractCollection)object4).addAll(object);
        ((ArrayList)object5).clear();
        ((ArrayList)object5).addAll(object4);
        object = ky1_02.z;
        ((ArrayList)object).clear();
        n3 = 0;
        object3 = null;
        if (bl2) {
            boolean bl4;
            Iterator iterator = ((ArrayList)object5).iterator();
            while (bl4 = iterator.hasNext()) {
                object4 = iterator.next();
                int n10 = n7 + 1;
                if (n7 < 0) {
                    xx_2.n();
                    throw null;
                }
                object4 = (Product)object4;
                object2 = n00.a;
                object2 = n00.b((Product)object4);
                ((ArrayList)object).add(object2);
                n7 = n10;
            }
            return;
        }
        object4 = ((ArrayList)object5).iterator();
        int n14 = 0;
        object5 = null;
        while (bl3 = object4.hasNext()) {
            Object object6;
            boolean bl5;
            float f6;
            int n15;
            Object[] objectArray;
            int n16;
            Object object7;
            block91: {
                block93: {
                    block92: {
                        block90: {
                            boolean bl6;
                            Object object8;
                            boolean bl7;
                            block85: {
                                block88: {
                                    block89: {
                                        Object object9;
                                        float f7;
                                        boolean bl8;
                                        Object object10;
                                        float f8;
                                        int n17;
                                        PlpProductUIModel plpProductUIModel;
                                        block87: {
                                            block84: {
                                                block86: {
                                                    void var30_43;
                                                    void var30_40;
                                                    void var30_37;
                                                    object7 = object4.next();
                                                    n16 = n14 + 1;
                                                    if (n14 < 0) {
                                                        xx_2.n();
                                                        throw null;
                                                    }
                                                    object7 = (Product)object7;
                                                    object5 = n00.a;
                                                    object5 = "product";
                                                    Intrinsics.checkNotNullParameter(object7, (String)object5);
                                                    objectArray = plpProductUIModel;
                                                    int n18 = -1;
                                                    int n19 = -1;
                                                    int n20 = -1;
                                                    int n21 = -1;
                                                    int n22 = -1 >>> 4;
                                                    bl7 = false;
                                                    object8 = null;
                                                    bl6 = false;
                                                    Object var30_34 = null;
                                                    n17 = 0;
                                                    f8 = 0.0f;
                                                    object10 = null;
                                                    bl8 = false;
                                                    f7 = 0.0f;
                                                    object9 = null;
                                                    object3 = plpProductUIModel;
                                                    plpProductUIModel = null;
                                                    long l2 = 0L;
                                                    objectArray(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, l2, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, n18, n19, n20, n21, n22, null);
                                                    objectArray.setProductTextWrap(n8 != 0);
                                                    objectArray = ((Product)object7).getName();
                                                    ((PlpProductUIModel)object3).setProductName((String)objectArray);
                                                    objectArray = ((Product)object7).getFnlColorVariantData();
                                                    if (objectArray != null) {
                                                        objectArray = objectArray.getColorGroup();
                                                    } else {
                                                        n15 = 0;
                                                        f6 = 0.0f;
                                                        objectArray = null;
                                                    }
                                                    ((PlpProductUIModel)object3).setColorGroup((String)objectArray);
                                                    objectArray = ((Product)object7).getFnlColorVariantData();
                                                    if (objectArray != null) {
                                                        objectArray = objectArray.getBrandName();
                                                    } else {
                                                        n15 = 0;
                                                        f6 = 0.0f;
                                                        objectArray = null;
                                                    }
                                                    ((PlpProductUIModel)object3).setBrandName((String)objectArray);
                                                    objectArray = ((Product)object7).getFnlColorVariantData();
                                                    if (objectArray != null) {
                                                        objectArray = objectArray.getColorGroup();
                                                    } else {
                                                        n15 = 0;
                                                        f6 = 0.0f;
                                                        objectArray = null;
                                                    }
                                                    ((PlpProductUIModel)object3).setProductCode((String)objectArray);
                                                    objectArray = ((Product)object7).getCode();
                                                    ((PlpProductUIModel)object3).setProductColorCode((String)objectArray);
                                                    n15 = R$string.removed_wishlist_txt;
                                                    object8 = ((PlpProductUIModel)object3).getBrandName();
                                                    String string2 = ((PlpProductUIModel)object3).getProductName();
                                                    object10 = "";
                                                    if (string2 == null) {
                                                        Object[] objectArray2 = object10;
                                                    }
                                                    object9 = new Object[bl5];
                                                    object9[0] = object8;
                                                    object9[n8] = var30_37;
                                                    objectArray = hv3_0.L(n15, (Object[])object9);
                                                    ((PlpProductUIModel)object3).setDeleteWishlistContentDescription((String)objectArray);
                                                    n15 = R$string.add_to_bag_txt;
                                                    object8 = ((PlpProductUIModel)object3).getBrandName();
                                                    String string3 = ((PlpProductUIModel)object3).getProductName();
                                                    if (string3 == null) {
                                                        Object[] objectArray3 = object10;
                                                    }
                                                    object9 = new Object[bl5];
                                                    object9[0] = object8;
                                                    object9[n8] = var30_40;
                                                    objectArray = hv3_0.L(n15, (Object[])object9);
                                                    ((PlpProductUIModel)object3).setAddToBagContentDescription((String)objectArray);
                                                    n15 = R$string.acc_wishlist_show_similar_products;
                                                    objectArray = hv3_0.K(n15);
                                                    object8 = ((PlpProductUIModel)object3).getBrandName();
                                                    String string4 = ((PlpProductUIModel)object3).getProductName();
                                                    if (string4 == null) {
                                                        Object[] objectArray4 = object10;
                                                    }
                                                    object9 = new StringBuilder();
                                                    ((StringBuilder)object9).append((String)objectArray);
                                                    objectArray = " of ";
                                                    ((StringBuilder)object9).append((String)objectArray);
                                                    ((StringBuilder)object9).append((String)object8);
                                                    ((StringBuilder)object9).append((String)var30_43);
                                                    object8 = ((StringBuilder)object9).toString();
                                                    ((PlpProductUIModel)object3).setOosSimilarContentDescription((String)object8);
                                                    object8 = ((Product)object7).getImages();
                                                    if (object8 != null && !(bl7 = object8.isEmpty()) && (object8 = ((Product)object7).getImages()) != null) {
                                                        block83: {
                                                            object8 = object8.iterator();
                                                            while (bl6 = object8.hasNext()) {
                                                                ProductImage productImage = (ProductImage)object8.next();
                                                                object9 = productImage.getFormat();
                                                                bl8 = ((String)object5).equalsIgnoreCase((String)object9);
                                                                if (!bl8) continue;
                                                                object5 = productImage.getUrl();
                                                                break block83;
                                                            }
                                                            n14 = 0;
                                                            object5 = null;
                                                        }
                                                        object8 = ((PlpProductUIModel)object3).getProductImageUrl();
                                                        if (object8 == null) {
                                                            object5 = ((Product)object7).getImages();
                                                            if (object5 != null && (object5 = (ProductImage)CollectionsKt.N(0, (List)object5)) != null) {
                                                                object5 = ((ProductImage)object5).getUrl();
                                                            } else {
                                                                n14 = 0;
                                                                object5 = null;
                                                            }
                                                        }
                                                        object8 = Unit.a;
                                                    } else {
                                                        n14 = 0;
                                                        object5 = null;
                                                    }
                                                    object5 = UrlHelper.Companion.getInstance().getImageUrl((String)object5);
                                                    ((PlpProductUIModel)object3).setProductImageUrl((String)object5);
                                                    n14 = R$string.product_image;
                                                    object5 = hv3_0.K(n14);
                                                    object8 = ((Product)object7).getFnlColorVariantData();
                                                    if (object8 != null) {
                                                        object8 = ((ProductFnlColorVariantData)object8).getBrandName();
                                                    } else {
                                                        bl7 = false;
                                                        object8 = null;
                                                    }
                                                    String string5 = ((Product)object7).getName();
                                                    if (string5 != null) {
                                                        object10 = string5;
                                                    }
                                                    String string6 = "-";
                                                    object5 = KW.a((String)object5, (String)objectArray, (String)object8, string6, (String)object10);
                                                    ((PlpProductUIModel)object3).setProductImageContentDescription((String)object5);
                                                    ((PlpProductUIModel)object3).setCartClickListners(n8 != 0);
                                                    ((PlpProductUIModel)object3).setEnableRatingView(false);
                                                    ((PlpProductUIModel)object3).setEnableAddtoCart(n8 != 0);
                                                    object5 = n00.a;
                                                    n14 = (int)(n00.a((Product)object7) ? 1 : 0);
                                                    if (n14 == 0) break block86;
                                                    ((PlpProductUIModel)object3).setAllOutOfStock(n8 != 0);
                                                    n14 = (int)(((PlpProductUIModel)object3).isComingSoonEnable() ? 1 : 0);
                                                    if (n14 != 0) {
                                                        ((PlpProductUIModel)object3).setComingSoonEnable(n8 != 0);
                                                        ((PlpProductUIModel)object3).setEnabledeleteImg(n8 != 0);
                                                        n14 = (int)(og1_1.b() ? 1 : 0);
                                                        if (n14 != 0) {
                                                            ((PlpProductUIModel)object3).setAfterCartLuxEnabled(n8 != 0);
                                                        }
                                                        break block84;
                                                    } else {
                                                        object5 = (Boolean)n00.d.getValue();
                                                        n14 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                                                        if (n14 == 0 && (n14 = (int)(((Boolean)(object5 = (Boolean)n00.c.getValue())).booleanValue() ? 1 : 0)) == 0) {
                                                            ((PlpProductUIModel)object3).setEnableDeleteOssContainer(n8 != 0);
                                                            break block84;
                                                        } else {
                                                            ((PlpProductUIModel)object3).setEnableOOSTV(n8 != 0);
                                                            ((PlpProductUIModel)object3).setSimilarOOSWishlistEnabled(n8 != 0);
                                                            n14 = (int)(og1_1.c() ? 1 : 0);
                                                            if (n14 == 0 && (n14 = (int)(km_1.b((cp$a)(object5 = cp_1.Companion)) ? 1 : 0)) == 0) {
                                                                object5 = cp$a.e();
                                                                object5.getClass();
                                                                n14 = (int)(cp_1.f() ? 1 : 0);
                                                                ((PlpProductUIModel)object3).setCheckIfTalkbackServiceEnabled(n14 != 0);
                                                                ((PlpProductUIModel)object3).setEnableOOSBG(n8 != 0);
                                                            }
                                                            ((PlpProductUIModel)object3).setEnableSimilarCartClosetCLick(n8 != 0);
                                                            ((PlpProductUIModel)object3).setEnabledeleteImg(n8 != 0);
                                                        }
                                                    }
                                                    break block84;
                                                }
                                                object5 = (Boolean)n00.d.getValue();
                                                n14 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
                                                if (n14 != 0 || (n14 = (int)(((Boolean)(object5 = (Boolean)n00.c.getValue())).booleanValue() ? 1 : 0)) != 0) {
                                                    ((PlpProductUIModel)object3).setSimilarOOSWishlistEnabled(n8 != 0);
                                                }
                                                if ((n14 = (int)(((Product)object7).isAddedToCart() ? 1 : 0)) != 0) {
                                                    ((PlpProductUIModel)object3).setShowAddedToCart(n8 != 0);
                                                    n14 = (int)(og1_1.c() ? 1 : 0);
                                                    if (n14 != 0) {
                                                        ((PlpProductUIModel)object3).setLuxeEnabled(n8 != 0);
                                                    }
                                                } else {
                                                    ((PlpProductUIModel)object3).setEnabledeleteImg(n8 != 0);
                                                    ((PlpProductUIModel)object3).setEnableAddToBagCartClosetClick(n8 != 0);
                                                }
                                            }
                                            object5 = Unit.a;
                                            n14 = (int)(og1_1.c() ? 1 : 0);
                                            if (n14 == 0) {
                                                ((PlpProductUIModel)object3).setClosetSelectionEnable(n8 != 0);
                                                ((PlpProductUIModel)object3).setSelectionMode(false);
                                            }
                                            if ((n14 = (int)(og1_1.c() ? 1 : 0)) == 0) break block87;
                                            ((PlpProductUIModel)object3).setLuxeCartPriceEnable(n8 != 0);
                                            break block85;
                                        }
                                        object5 = ((Product)object7).getPrice();
                                        if (object5 == null) break block88;
                                        ((PlpProductUIModel)object3).setShowFinalPrice(n8 != 0);
                                        object5 = qz2_0.r(((Product)object7).getPrice());
                                        ((PlpProductUIModel)object3).setFinalPriceValue((String)object5);
                                        object5 = StringCompanionObject.INSTANCE;
                                        AJIOApplication.Companion.getClass();
                                        object5 = AJIOApplication$a.a().getResources();
                                        bl7 = R$string.acc_plp_final_price;
                                        object5 = object5.getString((int)(bl7 ? 1 : 0));
                                        object8 = "getString(...)";
                                        Intrinsics.checkNotNullExpressionValue(object5, (String)object8);
                                        String string7 = qz2_0.r(((Product)object7).getPrice());
                                        object10 = new Object[n8];
                                        object10[0] = string7;
                                        Object[] objectArray5 = Arrays.copyOf(object10, n8);
                                        object5 = String.format((String)object5, objectArray5);
                                        String string8 = "format(...)";
                                        Intrinsics.checkNotNullExpressionValue(object5, string8);
                                        ((PlpProductUIModel)object3).setFinalPriceContentDescription((String)object5);
                                        object5 = ((Product)object7).getWasPriceData();
                                        if (object5 == null) break block89;
                                        object10 = ((Price)object5).getValue();
                                        if (object10 != null) {
                                            f8 = Float.parseFloat((String)object10);
                                        } else {
                                            n17 = 0;
                                            f8 = 0.0f;
                                            object10 = null;
                                        }
                                        object9 = ((Product)object7).getPrice();
                                        if (object9 != null && (object9 = ((Price)object9).getValue()) != null) {
                                            f7 = Float.parseFloat((String)object9);
                                        } else {
                                            bl8 = false;
                                            f7 = 0.0f;
                                            object9 = null;
                                        }
                                        n17 = Float.compare(f8, f7);
                                        if (n17 <= 0) break block89;
                                        object10 = qz2_0.s(mz3_0.h(((Price)object5).getValue()));
                                        object9 = new SpannableString((CharSequence)object10);
                                        plpProductUIModel = new StrikethroughSpan();
                                        bl5 = ((String)object10).length();
                                        f6 = 4.6E-44f;
                                        object9.setSpan((Object)plpProductUIModel, 0, (int)(bl5 ? 1 : 0), 33);
                                        object6 = qz2_0.g(((Product)object7).getPrice(), (Price)object5);
                                        ((PlpProductUIModel)object3).setShowDiscountPrice(n8 != 0);
                                        ((PlpProductUIModel)object3).setShowMrpPrice(n8 != 0);
                                        ((PlpProductUIModel)object3).setMrpPriceValue((SpannableString)object9);
                                        object5 = AJIOApplication$a.a().getResources();
                                        n15 = R$string.acc_plp_original_price;
                                        object5 = object5.getString(n15);
                                        Intrinsics.checkNotNullExpressionValue(object5, (String)object8);
                                        objectArray = new Object[n8];
                                        objectArray[0] = object10;
                                        objectArray = Arrays.copyOf(objectArray, n8);
                                        object5 = String.format((String)object5, objectArray);
                                        Intrinsics.checkNotNullExpressionValue(object5, string8);
                                        ((PlpProductUIModel)object3).setMrpPriceContentDescription((String)object5);
                                        object5 = ((Product)object7).getDiscountPercent();
                                        n14 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                                        if (n14 == 0) {
                                            object5 = AJIOApplication$a.a().getResources();
                                            n15 = R$string.acc_plp_discount_price;
                                            object5 = object5.getString(n15);
                                            Intrinsics.checkNotNullExpressionValue(object5, (String)object8);
                                            objectArray = new Object[n8];
                                            objectArray[0] = object6;
                                            object6 = Arrays.copyOf(objectArray, n8);
                                            object6 = String.format((String)object5, (Object[])object6);
                                            Intrinsics.checkNotNullExpressionValue(object6, string8);
                                            ((PlpProductUIModel)object3).setDiscountPriceContentDescription((String)object6);
                                            object6 = ((Product)object7).getDiscountPercent();
                                            ((PlpProductUIModel)object3).setDiscountPriceValue((String)object6);
                                            break block85;
                                        } else {
                                            n14 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                                            if (n14 == 0) {
                                                object5 = AJIOApplication$a.a().getResources();
                                                n15 = R$string.acc_plp_discount_price;
                                                object5 = object5.getString(n15);
                                                Intrinsics.checkNotNullExpressionValue(object5, (String)object8);
                                                objectArray = new Object[n8];
                                                objectArray[0] = object6;
                                                objectArray = Arrays.copyOf(objectArray, n8);
                                                object5 = String.format((String)object5, objectArray);
                                                Intrinsics.checkNotNullExpressionValue(object5, string8);
                                                ((PlpProductUIModel)object3).setDiscountPriceContentDescription((String)object5);
                                                object5 = new StringBuilder();
                                                ((StringBuilder)object5).append((String)object6);
                                                ((StringBuilder)object5).append("% OFF");
                                                object6 = ((StringBuilder)object5).toString();
                                                ((PlpProductUIModel)object3).setDiscountPriceValue((String)object6);
                                                break block85;
                                            } else {
                                                ((PlpProductUIModel)object3).setShowDiscountPrice(false);
                                            }
                                        }
                                        break block85;
                                    }
                                    ((PlpProductUIModel)object3).setShowMrpPrice(false);
                                    ((PlpProductUIModel)object3).setShowDiscountPrice(false);
                                    break block85;
                                }
                                ((PlpProductUIModel)object3).setShowFinalPrice(false);
                            }
                            object6 = el1_2.a;
                            bl5 = el1_2.l();
                            if (bl5 && (object6 = ((Product)object7).getAdsData()) != null) {
                                ((PlpProductUIModel)object3).setShowAdTag(n8 != 0);
                                ((PlpProductUIModel)object3).setShowProductTags(false);
                            } else {
                                object6 = hv3_0.a;
                                object5 = ((Product)object7).getFnlColorVariantData();
                                object6.getClass();
                                object6 = hv3_0.z((Product)object7, (ProductFnlColorVariantData)object5);
                                object5 = hv3_0.A(((Product)object7).getFnlColorVariantData());
                                objectArray = n00.f((Product)object7);
                                object8 = h40_0.a;
                                bl7 = h40_0.W0();
                                bl6 = hv3_0.V((Product)object7);
                                if (!bl7 || !bl6) {
                                    object6 = object5;
                                }
                                object5 = n00.d((Pair)objectArray, (String)object5, bl7, bl6);
                                if (object6 == null && (n15 = (int)((objectArray = (Boolean)objectArray.a).booleanValue() ? 1 : 0)) == 0) {
                                    ((PlpProductUIModel)object3).setShowProductTags(false);
                                } else {
                                    if (!bl7) {
                                        object6 = object5;
                                    }
                                    ((PlpProductUIModel)object3).setProductTagViewContentDescription((String)object6);
                                    ((PlpProductUIModel)object3).setProductTagValue((String)object5);
                                    ((PlpProductUIModel)object3).setShowProductTags(n8 != 0);
                                }
                            }
                            bl5 = og1_1.c();
                            if (!bl5) break block90;
                            object6 = tr2_2.a;
                            bl5 = ((tr2_2)object6).x(n8 != 0);
                            if (bl5) {
                                ((PlpProductUIModel)object3).setEnableSaleContainer(n8 != 0);
                                ((PlpProductUIModel)object3).setLuxeAfercartAndLuxeEnable(n8 != 0);
                                ((PlpProductUIModel)object3).setSaleContainerSpaceRetained(false);
                            }
                            break block91;
                        }
                        object6 = tr2_2.a;
                        object6 = ((Product)object7).getSourceStoreId();
                        n14 = tr2_2.y(false);
                        if (n14 == 0 || (n14 = tr2_2.q()) == 0) break block92;
                        object5 = tr2_2.d();
                        n14 = ((kr2_2)object5).b;
                        if (n14 != 0 || !(bl5 = kotlin.text.b.i((String)object6, (String)(object5 = "luxe"), n8 != 0))) break block93;
                    }
                    if (!(bl5 = tr2_2.l((ScreenType)((Object)(object6 = ScreenType.SCREEN_WISHLIST))))) break block91;
                }
                ((PlpProductUIModel)object3).setEnableSaleContainer(n8 != 0);
                ((PlpProductUIModel)object3).setLuxeAfercartAndLuxeEnable(false);
                ((PlpProductUIModel)object3).setSaleContainerSpaceRetained(false);
            }
            if ((object6 = ((Product)object7).getWasPriceData()) != null) {
                object6 = ((Product)object7).getWasPriceData();
                if (object6 != null) {
                    object6 = ((Price)object6).getValue();
                } else {
                    bl5 = false;
                    f5 = 0.0f;
                    object6 = null;
                }
                bl5 = TextUtils.isEmpty((CharSequence)object6);
                if (!bl5) {
                    object6 = ((Product)object7).getWasPriceData();
                    if (object6 != null && (object6 = ((Price)object6).getValue()) != null && (object6 = je3_2.e((String)object6)) != null) {
                        f5 = ((Float)object6).floatValue();
                    } else {
                        bl5 = false;
                        f5 = 0.0f;
                        object6 = null;
                    }
                    object6 = Float.valueOf(f5);
                    ((PlpProductUIModel)object3).setWasPriceValue((Float)object6);
                }
            }
            if ((object6 = ((Product)object7).getPrice()) != null) {
                object6 = ((Product)object7).getPrice();
                if (object6 != null) {
                    object6 = ((Price)object6).getValue();
                } else {
                    bl5 = false;
                    f5 = 0.0f;
                    object6 = null;
                }
                bl5 = TextUtils.isEmpty((CharSequence)object6);
                if (!bl5) {
                    object6 = ((Product)object7).getPrice();
                    if (object6 != null && (object6 = ((Price)object6).getValue()) != null && (object6 = je3_2.e((String)object6)) != null) {
                        f6 = ((Float)object6).floatValue();
                    } else {
                        n15 = 0;
                        f6 = 0.0f;
                        objectArray = null;
                    }
                    object6 = Float.valueOf(f6);
                    ((PlpProductUIModel)object3).setPriceValue((Float)object6);
                }
            }
            if ((object6 = ((Product)object7).getOfferPrice()) != null && (object6 = ((Price)object6).getPriceReveal()) != null) {
                object6 = ((PriceReveal)object6).getBestPrice();
            } else {
                bl5 = false;
                f5 = 0.0f;
                object6 = null;
            }
            if (object6 != null) {
                object6 = ((Product)object7).getOfferPrice();
                if (object6 != null && (object6 = ((Price)object6).getPriceReveal()) != null) {
                    object6 = ((PriceReveal)object6).getBestPrice();
                } else {
                    bl5 = false;
                    f5 = 0.0f;
                    object6 = null;
                }
                ((PlpProductUIModel)object3).setBestPriceValue((Float)object6);
            }
            if ((object6 = ((Product)object7).getOfferPrice()) != null) {
                object6 = ((Price)object6).getValue();
            } else {
                bl5 = false;
                f5 = 0.0f;
                object6 = null;
            }
            ((PlpProductUIModel)object3).setOfferPrice((String)object6);
            object6 = ((Product)object7).getOfferPrice();
            if (object6 != null && (object6 = ((Price)object6).getPriceReveal()) != null) {
                object6 = ((PriceReveal)object6).getDiscountPercent();
            } else {
                bl5 = false;
                f5 = 0.0f;
                object6 = null;
            }
            ((PlpProductUIModel)object3).setDiscountPercentValue((String)object6);
            object6 = h40_0.a;
            bl5 = h40_0.c2();
            ((PlpProductUIModel)object3).setRatingEnabledPlp(bl5);
            object6 = ((Product)object7).getAverageRating();
            ((PlpProductUIModel)object3).setAverageRating((Double)object6);
            object6 = ((Product)object7).getRatingCount();
            object6 = object6 == null ? ((Product)object7).getNumUserRatings() : ((Product)object7).getRatingCount();
            ((PlpProductUIModel)object3).setProductRatingCount((String)object6);
            bl5 = mz3_0.z();
            if (bl5) {
                ((PlpProductUIModel)object3).setGwpEnabled(n8 != 0);
                object6 = ((Product)object7).getOfferPrice();
                if (object6 != null) {
                    object6 = ((Price)object6).getGiftAvailable();
                    object5 = Boolean.TRUE;
                    bl5 = Intrinsics.areEqual(object6, object5);
                } else {
                    bl5 = false;
                    f5 = 0.0f;
                    object6 = null;
                }
                ((PlpProductUIModel)object3).setGiftAvailable(bl5);
                object6 = (String)n00.e.getValue();
                ((PlpProductUIModel)object3).setGwpFreebiesOneText((String)object6);
                bl5 = og1_1.c();
                ((PlpProductUIModel)object3).setLuxeEnabled(bl5);
                bl5 = mz3_0.z();
                ((PlpProductUIModel)object3).setGWPFeatureEnabledAjioLuxe(bl5);
            } else {
                ((PlpProductUIModel)object3).setGwpEnabled(false);
            }
            ((ArrayList)object).add(object3);
            n14 = n16;
            bl5 = 2 != 0;
            f5 = 2.8E-45f;
            n3 = 0;
            object3 = null;
        }
    }
}

