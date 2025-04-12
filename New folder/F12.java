/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FacebookEvents;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.query.CurrentQuery;
import com.ril.ajio.services.query.ProductListQuery;
import com.ril.ajio.services.query.Query;
import com.ril.mp.services.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class F12
extends Hj {
    public final hh3_2 a;
    public final yx3 b;
    public final qQ2 c;
    public final bv2_0 d;
    public final BH3 e;
    public final SU2 f;
    public boolean g;

    public F12(Application object, NewPlpRepo newPlpRepo, UserRepo object2, WishListRepo wishListRepo, RtbRepo rtbRepo) {
        yx3 yx32;
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(newPlpRepo, "plpRepo");
        Intrinsics.checkNotNullParameter(object2, "userRepo");
        Intrinsics.checkNotNullParameter(wishListRepo, "wishListRepo");
        Intrinsics.checkNotNullParameter(rtbRepo, "rtbRepo");
        super((Application)object);
        Object object3 = new sp0_2(object, 1);
        this.a = object3 = yr1_2.b((Function0)object3);
        object3 = new F12$b(this);
        this.b = yx32 = new yx3((Application)object, (UserRepo)object2, newPlpRepo);
        this.c = object2 = new qQ2(rtbRepo);
        this.d = object2 = new bv2_0((Application)object, newPlpRepo, (F12$b)object3);
        super(wishListRepo);
        this.e = object;
        super();
        this.f = object;
    }

    public static void j(F12 f12, ProductsList productsList, boolean bl2, Boolean bl3, ym0_0 ym0_02, Boolean bl4, int n3) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            bl3 = Boolean.FALSE;
        }
        Boolean bl5 = bl3;
        int n7 = n3 & 8;
        if (n7 != 0) {
            ym0_02 = null;
        }
        ym0_0 ym0_03 = ym0_02;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl4 = Boolean.FALSE;
        }
        f12.getClass();
        Intrinsics.checkNotNullParameter(productsList, "productsList");
        bv2_0.B(f12.d, productsList, bl2, false, bl5, ym0_03, bl4, 4);
    }

    public final boolean b() {
        String string2 = this.d.l();
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        return Intrinsics.areEqual(string2, string3);
    }

    public final ArrayList c(ImmutableList immutableList, PlpExtendedBanner plpExtendedBanner, boolean bl2, String string2, boolean bl3, boolean bl4, boolean bl5, List list, List list2) {
        Intrinsics.checkNotNullParameter(immutableList, "productList");
        Intrinsics.checkNotNullParameter(list2, "bannerAdList");
        return this.d.e(immutableList, plpExtendedBanner, bl2, string2, bl3, bl4, bl5, list, list2);
    }

    public final List d() {
        Object object = this.d.M;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object = ((ProductsList)object).getSorts();
        } else {
            object = null;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final ArrayList e() {
        Pagination pagination;
        bv2_0 bv2_02 = this.d;
        ProductsList object = bv2_02.M;
        Object object2 = null;
        if (object != null && (pagination = object.getPagination()) != null) {
            z40_0.Companion.getClass();
            ao0_0 ao0_02 = z40$a.a((Context)bv2_02.a).a;
            Object object3 = "android_slp_visual_filters_to_show";
            String string2 = ao0_02.b((String)object3);
            int n3 = TextUtils.isEmpty((CharSequence)string2);
            if (n3 == 0) {
                void var2_10;
                Object object4;
                object3 = "\\|";
                List list = fT1.a((String)object3, string2);
                n3 = list.isEmpty();
                int n4 = 1;
                if (n3 == 0) {
                    int n7;
                    n3 = list.size();
                    object3 = list.listIterator(n3);
                    while ((n7 = object3.hasPrevious()) != 0) {
                        object4 = (String)object3.previous();
                        n7 = ((String)object4).length();
                        if (n7 == 0) continue;
                        Iterable iterable = list;
                        n3 = object3.nextIndex() + n4;
                        List list2 = CollectionsKt.f0(iterable, n3);
                        break;
                    }
                } else {
                    mz0_2 mz0_22 = mz0_2.a;
                }
                Collection collection = (Collection)var2_10;
                object3 = null;
                object4 = new String[]{};
                String[] stringArray = collection.toArray((T[])object4);
                object4 = new ArrayList();
                for (String string3 : stringArray) {
                    boolean bl2;
                    Object object5;
                    Intrinsics.checkNotNullParameter(string3, "facetName");
                    Object object6 = bv2_02.M;
                    if (object6 != null && (object5 = ((ProductsList)object6).getFacets()) != null) {
                        object6 = ((ProductsList)object6).getFacets();
                        Intrinsics.checkNotNull(object6);
                        object6 = ((Iterable)object6).iterator();
                        while (bl2 = object6.hasNext()) {
                            object5 = (Facet)object6.next();
                            String string4 = ((Facet)object5).getName();
                            boolean bl3 = kotlin.text.b.i(string4, string3, n4 != 0);
                            if (!bl3) continue;
                            break;
                        }
                    } else {
                        bl2 = false;
                        object5 = null;
                    }
                    if (object5 == null) continue;
                    boolean bl4 = bv2_02.y;
                    if (bl4) {
                        string3 = ((Facet)object5).getName();
                        bl4 = kotlin.text.b.i(string3, (String)(object6 = "Category"), n4 != 0);
                        if (bl4) continue;
                        ((ArrayList)object4).add(object5);
                        continue;
                    }
                    ((ArrayList)object4).add(object5);
                }
                object2 = object4;
            }
        }
        return object2;
    }

    public final void f(PLPExtras object) {
        boolean bl2;
        String string2;
        String string3;
        String string4;
        int n3;
        Object object2;
        int n4;
        String[] stringArray;
        int n7;
        Object object3 = "plpExtras";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        bv2_0 bv2_02 = this.d;
        bv2_02.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object3);
        bv2_02.N0 = object;
        z40_0.Companion.getClass();
        object3 = z40$a.a((Context)bv2_02.a).a;
        int n8 = ((ao0_0)object3).g("plp_page_size");
        Object object4 = ((PLPExtras)object).e;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
        boolean bl4 = false;
        ProductListQuery productListQuery = null;
        if (!bl3) {
            object4 = ((PLPExtras)object).e;
            bv2_02.Z0 = object4;
            Object object5 = "luxe";
            bl3 = kotlin.text.b.i((String)object4, (String)object5, false);
            if (!bl3 && !(bl3 = kotlin.text.b.i((String)(object4 = bv2_02.Z0), (String)(object5 = "ajiogram"), false))) {
                object4 = bv2_02.Z0;
                Intrinsics.checkNotNull(object4);
                object4 = bv2_02.b.getStoreInfo((String)object4);
                n7 = 1;
                object5 = new lw1_1(bv2_02, n7);
                stringArray = new ju2_1(0, (Function1)object5);
                n4 = 1;
                object5 = new nw1_1(bv2_02, n4);
                object2 = new ku2_2((nw1_1)object5);
                object4 = ((g53_0)object4).f((o60_0)stringArray, (o60_0)object2);
                object5 = bv2_02.j1;
                ((t30_0)object5).b((yr0_2)object4);
            }
        }
        object4 = ((PLPExtras)object).F;
        int n10 = 1;
        if (object4 != null && (n4 = object4.containsKey((String)(stringArray = "brand_id"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.t = stringArray;
        }
        if (object4 != null && (n4 = object4.containsKey((String)(stringArray = "brand_name"))) == n10) {
            object4.getString((String)stringArray);
        }
        if (object4 != null && (n4 = object4.containsKey((String)(stringArray = "IS_FROM_SEARCH_TERM"))) == n10) {
            n7 = object4.getBoolean((String)stringArray);
            stringArray = n7 != 0;
            bv2_02.u = stringArray;
        }
        if ((n7 = Intrinsics.areEqual(stringArray = ((PLPExtras)object).G, object2 = Boolean.TRUE)) != 0) {
            bv2_02.u = object2;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "is_firebase_coupon_enabled"))) == n10) {
            n7 = object4.getBoolean((String)stringArray);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.l1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "isFromCouponScreen"))) == n10) {
            n7 = object4.getBoolean((String)stringArray);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.m1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "from_banner_ads"))) == n10) {
            n7 = object4.getBoolean((String)stringArray);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.n1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "banner_ad_ccb"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.o1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "from_landing_screen_banner_ads"))) == n10) {
            n7 = (int)(object4.getBoolean((String)stringArray) ? 1 : 0);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.p1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "enable_ads_on_plp"))) == n10) {
            n7 = (int)(object4.getBoolean((String)stringArray) ? 1 : 0);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.q1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "banner_ad_source_details"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.r1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "click_id"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.s1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "widgetID"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.t1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "widgetType"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.u1 = stringArray;
        }
        if (object4 != null && (n3 = (int)(object4.containsKey((String)(stringArray = "showDefaultWidget")) ? 1 : 0)) == n10) {
            n7 = (int)(object4.getBoolean((String)stringArray) ? 1 : 0);
            stringArray = n7 != 0;
            bv2_02.v1 = stringArray;
        }
        if (object4 != null && (n3 = (int)(object4.containsKey((String)(stringArray = "widgetName")) ? 1 : 0)) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.x1 = stringArray;
        }
        if (object4 != null && (n3 = (int)(object4.containsKey((String)(stringArray = "widgetMinProdCount")) ? 1 : 0)) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.w1 = stringArray;
        }
        if (object4 != null && (n3 = (int)(object4.containsKey((String)(stringArray = "widgetStore")) ? 1 : 0)) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.Z0 = stringArray;
        }
        if (object4 != null && (n3 = (int)(object4.containsKey((String)(stringArray = "showViewAllWidget")) ? 1 : 0)) == n10) {
            n7 = object4.getBoolean((String)stringArray);
            if (n7 == n10) {
                n7 = 1;
            } else {
                n7 = 0;
                stringArray = null;
            }
            bv2_02.y1 = n7;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "widgetFilters"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.z1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "bannerType"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.A1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "widgetOptionName"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.C1 = stringArray;
        }
        if (object4 != null && (n3 = object4.containsKey((String)(stringArray = "widgetComponentName"))) == n10) {
            stringArray = object4.getString((String)stringArray);
            bv2_02.D1 = stringArray;
        }
        stringArray = ((PLPExtras)object).d;
        n3 = TextUtils.isEmpty((CharSequence)stringArray);
        int n14 = 6;
        if (n3 == 0) {
            n3 = TextUtils.isEmpty((CharSequence)stringArray);
            if (n3 == 0) {
                Intrinsics.checkNotNull(stringArray);
                string4 = "/";
                int n15 = StringsKt.R((CharSequence)stringArray, string4, 0, n14);
                int n16 = -1;
                if (n15 != n16) {
                    string3 = "?";
                    n16 = (int)(StringsKt.F((CharSequence)stringArray, string3, false) ? 1 : 0);
                    string2 = "substring(...)";
                    if (n16 != 0) {
                        n3 = StringsKt.R((CharSequence)stringArray, string4, 0, n14) + n10;
                        n15 = StringsKt.O((CharSequence)stringArray, string3, 0, false, n14);
                        stringArray = stringArray.substring(n3, n15);
                        Intrinsics.checkNotNullExpressionValue(stringArray, string2);
                    } else {
                        n3 = StringsKt.R((CharSequence)stringArray, string4, 0, n14) + n10;
                        stringArray = stringArray.substring(n3);
                        Intrinsics.checkNotNullExpressionValue(stringArray, string2);
                    }
                }
            }
            Intrinsics.checkNotNull(stringArray);
            bv2_02.X0 = stringArray;
        }
        if ((stringArray = ((PLPExtras)object).s) != null) {
            bv2_02.p0 = n10;
            string4 = "noti_uri";
            stringArray = stringArray.getString(string4);
            bv2_02.q0 = stringArray;
        }
        stringArray = ((PLPExtras)object).v;
        bv2_02.L = stringArray;
        n7 = ((PLPExtras)object).D;
        if (n7 != 0) {
            bv2_02.o0 = n10;
        }
        stringArray = ((PLPExtras)object).l;
        string4 = ((PLPExtras)object).k;
        string3 = ((PLPExtras)object).j;
        String string5 = ((PLPExtras)object).g;
        if (string5 == null && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((PLPExtras)object).c)))) {
            bv2_02.B = n10;
            bv2_02.n0 = n10;
            bv2_02.P = object2 = new ProductListQuery();
            ((ProductListQuery)object2).setPageSize(n8);
            object3 = bv2_02.P;
            if (object3 != null) {
                ((ProductListQuery)object3).setQueryText(string2);
            }
            if ((object3 = bv2_02.P) != null) {
                object2 = ((PLPExtras)object).m;
                if (object2 != null) {
                    n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                } else {
                    n4 = 0;
                    object2 = null;
                }
                ((ProductListQuery)object3).setFromDidYouMean(n4 != 0);
            }
            bv2_02.A = object3 = ((PLPExtras)object).i;
            bv2_02.getClass();
            bv2_02.C = string3;
            bv2_02.D = string4;
            bv2_02.E = stringArray;
            object3 = bv2_02.P;
            Intrinsics.checkNotNull(object3);
            bv2_02.q((ProductListQuery)object3, false);
            bv2_02.l0 = string2;
        } else {
            string2 = ((PLPExtras)object).f;
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                bv2_02.m0 = string2;
                stringArray = new ProductListQuery();
                bv2_02.P = stringArray;
                stringArray.setPageSize(n8);
                object3 = bv2_02.P;
                if (object3 != null) {
                    ((ProductListQuery)object3).setCategoryId(string2);
                }
                if ((object3 = bv2_02.P) != null) {
                    stringArray = ((PLPExtras)object).t;
                    ((ProductListQuery)object3).setPageType((String)stringArray);
                }
                if ((object3 = ((PLPExtras)object).b) != null && (stringArray = bv2_02.P) != null) {
                    stringArray.setQueryText((String)object3);
                }
                if ((n7 = TextUtils.isEmpty((CharSequence)object3)) == 0) {
                    if (object3 != null) {
                        stringArray = new String[]{"&"};
                        object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n14);
                    } else {
                        n8 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (n7 = object3.size()) > n10) {
                        object3 = (CharSequence)on_2.d(n10, (List)object3);
                        stringArray = new String[]{"="};
                        n7 = (object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n14)).size();
                        if (n7 > n10) {
                            object3 = (String)object3.get(n10);
                        }
                    }
                    bv2_02.getClass();
                }
                object3 = bv2_02.P;
                Intrinsics.checkNotNull(object3);
                bv2_02.h((ProductListQuery)object3, (Boolean)object2);
                bv2_02.B = false;
                bv2_02.n0 = false;
            } else {
                String string6 = ((PLPExtras)object).n;
                if (string6 != null) {
                    bv2_02.m0 = string6;
                    stringArray = new ProductListQuery();
                    bv2_02.P = stringArray;
                    stringArray.setPageSize(n8);
                    object3 = bv2_02.P;
                    if (object3 != null) {
                        ((ProductListQuery)object3).setCategoryId(string6);
                    }
                    if ((object3 = ((PLPExtras)object).o) != null && (stringArray = bv2_02.P) != null) {
                        stringArray.setQueryText((String)object3);
                    }
                    bv2_02.B = false;
                    bv2_02.n0 = false;
                    object3 = bv2_02.m0;
                    bv2_02.getClass();
                    object3 = bv2_02.P;
                    Intrinsics.checkNotNull(object3);
                    bv2_02.h((ProductListQuery)object3, (Boolean)object2);
                } else {
                    string6 = ((PLPExtras)object).p;
                    if (string6 != null) {
                        bv2_02.m0 = string6;
                        stringArray = new ProductListQuery();
                        bv2_02.P = stringArray;
                        stringArray.setPageSize(n8);
                        object3 = bv2_02.P;
                        if (object3 != null) {
                            ((ProductListQuery)object3).setCategoryId(string6);
                        }
                        if ((object3 = ((PLPExtras)object).q) != null && (stringArray = bv2_02.P) != null) {
                            stringArray.setQueryText((String)object3);
                        }
                        bv2_02.B = false;
                        bv2_02.n0 = false;
                        object3 = bv2_02.m0;
                        bv2_02.getClass();
                        object3 = bv2_02.P;
                        Intrinsics.checkNotNull(object3);
                        bv2_02.h((ProductListQuery)object3, (Boolean)object2);
                    } else if (string5 != null) {
                        bv2_02.P = productListQuery = new ProductListQuery();
                        productListQuery.setPageSize(n8);
                        object3 = ((PLPExtras)object).h;
                        bl4 = TextUtils.isEmpty((CharSequence)object3);
                        if (!bl4) {
                            productListQuery = bv2_02.P;
                            if (productListQuery != null) {
                                productListQuery.setQueryText((String)object3);
                            }
                            bv2_02.l0 = object3;
                            bv2_02.A = object3;
                            bv2_02.B = n10;
                            bv2_02.n0 = n10;
                            bv2_02.C = string3;
                            bv2_02.D = string4;
                            bv2_02.E = stringArray;
                        }
                        object3 = bv2_02.P;
                        Intrinsics.checkNotNull(object3);
                        bl4 = bv2_0.b2;
                        bv2_02.q((ProductListQuery)object3, bl4);
                    } else {
                        bl4 = ((PLPExtras)object).C;
                        if (bl4) {
                            bv2_02.P = productListQuery = new ProductListQuery();
                            productListQuery.setPageSize(n8);
                        }
                    }
                }
            }
        }
        object = ((PLPExtras)object).x;
        if (object != null) {
            object = Uri.parse((String)object);
            bv2_02.d1 = object;
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "FLEEK_SOURCE")) ? 1 : 0)) == n10) {
            bv2_02.K0 = object = object4.getString((String)object);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "FLEEK_SOURCE_DETAILS")) ? 1 : 0)) == n10) {
            bv2_02.L0 = object = object4.getString((String)object);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "IS_AJIOGRAM_INTERVENTION")) ? 1 : 0)) == n10) {
            boolean bl5 = object4.getBoolean((String)object);
            bv2_02.M0 = object = Boolean.valueOf(bl5);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "dress_tool_source")) ? 1 : 0)) == n10) {
            bv2_02.Q0 = object = object4.getString((String)object);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "dress_tool_source_details")) ? 1 : 0)) == n10) {
            bv2_02.R0 = object = object4.getString((String)object);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "dress_tool_ingress")) ? 1 : 0)) == n10) {
            bv2_02.S0 = object = object4.getString((String)object);
        }
        if (object4 != null && (n8 = (int)(object4.containsKey((String)(object = "dress_tool_plp_url")) ? 1 : 0)) == n10) {
            bv2_02.T0 = object = object4.getString((String)object);
        }
    }

    public final boolean g() {
        return this.b.d.isUserOnline();
    }

    public final void h() {
        boolean bl2;
        Boolean bl3;
        bv2_0 bv2_02 = this.d;
        ProductListQuery productListQuery = bv2_02.P;
        if (productListQuery != null) {
            bl3 = null;
            productListQuery.setCurrentPage(0);
        }
        if (bl2 = bv2_02.B) {
            productListQuery = bv2_02.P;
            Intrinsics.checkNotNull(productListQuery);
            bv2_02.n(productListQuery);
        } else {
            productListQuery = bv2_02.P;
            Intrinsics.checkNotNull(productListQuery);
            bl3 = Boolean.TRUE;
            bv2_02.h(productListQuery, bl3);
        }
    }

    public final void i() {
        int n3;
        Object object;
        bv2_0 bv2_02 = this.d;
        bv2_02.getClass();
        Object object2 = h40_0.a;
        int n4 = h40_0.M1();
        if (n4 != 0) {
            bv2_02.X1.clear();
            object2 = bv2_02.W1;
            ((ArrayList)object2).clear();
        }
        bv2_02.Q = object2 = new ProductListQuery();
        Object object3 = bv2_02.P;
        Boolean bl2 = null;
        object3 = object3 != null ? object3.getSelectedSort() : null;
        ((ProductListQuery)object2).setSelectedSort((Sort)object3);
        object2 = bv2_02.Q;
        object3 = null;
        if (object2 != null) {
            ((ProductListQuery)object2).setCurrentPage(0);
        }
        if ((object2 = bv2_02.Q) != null) {
            object = bv2_02.F;
            ((ProductListQuery)object2).setQueryText((String)object);
        }
        if ((object2 = bv2_02.Q) != null) {
            object = bv2_02.P;
            if (object != null) {
                object = ((ProductListQuery)object).getCategoryId();
            } else {
                n3 = 0;
                object = null;
            }
            ((ProductListQuery)object2).setCategoryId((String)object);
        }
        if ((object2 = bv2_02.Q) != null) {
            object = bv2_02.P;
            if (object != null) {
                object = ((ProductListQuery)object).getPageType();
            } else {
                n3 = 0;
                object = null;
            }
            ((ProductListQuery)object2).setPageType((String)object);
        }
        if ((object2 = bv2_02.P) != null) {
            n4 = ((ProductListQuery)object2).getPageSize();
            object2 = n4;
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null && (object2 = bv2_02.Q) != null) {
            object = bv2_02.P;
            Intrinsics.checkNotNull(object);
            n3 = ((ProductListQuery)object).getPageSize();
            ((ProductListQuery)object2).setPageSize(n3);
        }
        if ((object2 = bv2_02.P) != null) {
            ((ProductListQuery)object2).setAdaptiveSearchReplayResponse(null);
        }
        bv2_02.e1 = true;
        n4 = (int)(bv2_02.B ? 1 : 0);
        if (n4 != 0) {
            object2 = bv2_02.Q;
            Intrinsics.checkNotNull(object2);
            bv2_02.n((ProductListQuery)object2);
        } else {
            object2 = bv2_02.Q;
            Intrinsics.checkNotNull(object2);
            bl2 = Boolean.FALSE;
            bv2_02.h((ProductListQuery)object2, bl2);
        }
        bv2_02.z(false);
    }

    public final void k(boolean bl2) {
        Boolean bl3;
        zr1_1 zr1_12 = this.d.n;
        Object object = zr1_12.d();
        boolean bl4 = Intrinsics.areEqual(object, bl3 = Boolean.valueOf(bl2));
        if (!bl4) {
            Boolean bl5 = bl2;
            zr1_12.i(bl5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(ProductsList object) {
        block24: {
            boolean bl2;
            boolean bl3;
            int n3;
            int n4;
            Object object2;
            bv2_0 bv2_02;
            int n7;
            block22: {
                int n8;
                String string2;
                String string3;
                block23: {
                    block21: {
                        n7 = h40_0.Q1();
                        bv2_02 = this.d;
                        if (n7 != 0 && object != null) {
                            ProductsList productsList;
                            n7 = ((ProductsList)object).isSlaNodesAvailable();
                            if (bv2_02 != null && (productsList = bv2_02.M) != null) {
                                productsList.setSlaNodesAvailable(n7 != 0);
                            }
                        }
                        bv2_02.getClass();
                        if (object == null) {
                            return;
                        }
                        object2 = ((ProductsList)object).getFacets();
                        if (object2 == null) {
                            object2 = bv2_02.G;
                            ((ProductsList)object).setFacets((List)object2);
                        }
                        object2 = ((ProductsList)object).getProducts();
                        string3 = ":price:";
                        n4 = 1;
                        n3 = -1;
                        string2 = null;
                        if (object2 == null || (object2 = ((ProductsList)object).getFacets()) == null) break block21;
                        object2 = ((ProductsList)object).getProducts();
                        Intrinsics.checkNotNull(object2);
                        object2 = (Collection)object2;
                        n7 = object2.isEmpty() ^ n4;
                        if (n7 == 0) break block21;
                        object2 = ((ProductsList)object).getFacets();
                        Intrinsics.checkNotNull(object2);
                        n7 = object2.isEmpty() ^ n4;
                        if (n7 == 0) break block21;
                        object2 = ((ProductsList)object).getFacets();
                        bv2_02.C((ProductsList)object, (List)object2);
                        bv2_02.N = object;
                        object2 = ((ProductsList)object).getFacets();
                        Intrinsics.checkNotNull(object2);
                        bv2_0.A((List)object2);
                        object2 = bv2_02.N;
                        if (object2 != null && (object2 = ((ProductsList)object2).getCurrentQuery()) != null && (object2 = ((CurrentQuery)object2).getQuery()) != null) {
                            object2 = ((Query)object2).getValue();
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        if (object2 != null && (n7 = (int)(StringsKt.F((CharSequence)object2, string3, false) ? 1 : 0)) == 0) {
                            bv2_02.c0 = n3;
                            bv2_02.b0 = n3;
                        }
                        if ((object2 = bv2_02.i0) != null) {
                            ((HashMap)object2).clear();
                        }
                        object2 = ((ProductsList)object).getFacets();
                        Intrinsics.checkNotNull(object2);
                        object2 = object2.iterator();
                        bl3 = false;
                        Object var4_6 = null;
                        break block22;
                    }
                    bv2_02.h0 = n4;
                    object = bv2_02.N;
                    if (object != null && (object = ((ProductsList)object).getCurrentQuery()) != null && (object = ((CurrentQuery)object).getQuery()) != null) {
                        string2 = ((Query)object).getValue();
                    }
                    if (string2 == null || (n8 = (int)(StringsKt.F(string2, string3, false) ? 1 : 0)) != 0) break block23;
                    bv2_02.c0 = n3;
                    bv2_02.b0 = n3;
                    break block24;
                }
                if (string2 == null) break block24;
                n8 = 6;
                n7 = StringsKt.O(string2, string3, 0, false, n8) + 7;
                String string4 = ":";
                int n10 = 4;
                int n14 = StringsKt.O(string2, string4, n7, false, n10);
                String string5 = "substring(...)";
                if (n14 != n3) {
                    object2 = string2.substring(n7, n14);
                    Intrinsics.checkNotNullExpressionValue(object2, string5);
                } else {
                    n14 = string2.length();
                    object2 = string2.substring(n7, n14);
                    Intrinsics.checkNotNullExpressionValue(object2, string5);
                }
                String[] stringArray = new String[]{","};
                object = StringsKt.a0((CharSequence)object2, stringArray, false, 0, n8);
                n7 = object.size();
                if (n7 > n4) {
                    object2 = (String)object.get(0);
                    object = (String)object.get(n4);
                    object2 = StringsKt.toIntOrNull(object2);
                    object = StringsKt.toIntOrNull((String)object);
                    if (object2 != null && object != null) {
                        bv2_02.b0 = n7 = ((Integer)object2).intValue();
                        bv2_02.c0 = n8 = ((Integer)object).intValue();
                    }
                }
                break block24;
            }
            while (bl2 = object2.hasNext()) {
                Object object3;
                boolean bl4;
                Object object4;
                Object object5 = (Facet)object2.next();
                Object object6 = ((Facet)object5).getCode();
                int n15 = kotlin.text.b.i((String)object6, (String)(object4 = bv2_02.Y), false);
                if (n15 != 0) {
                    bv2_02.X = object5;
                    bl3 = true;
                }
                if ((object6 = ((Facet)object5).getValues()) == null) continue;
                object6 = ((Facet)object5).getValues();
                Intrinsics.checkNotNull(object6);
                object6 = ((ArrayList)object6).iterator();
                Intrinsics.checkNotNullExpressionValue(object6, "iterator(...)");
                int n16 = 0;
                object4 = null;
                while (bl4 = object6.hasNext()) {
                    object3 = object6.next();
                    String string6 = "next(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, string6);
                    bl4 = ((FacetValue)(object3 = (FacetValue)object3)).getSelected();
                    if (!bl4) continue;
                    ++n16;
                }
                object3 = "pricerange";
                object6 = ((Facet)object5).getCode();
                n15 = ((String)object3).equalsIgnoreCase((String)object6);
                if (n15 != 0 && (n15 = bv2_02.b0) != n3 && (n15 = bv2_02.c0) != n3) {
                    ++n16;
                }
                if ((object6 = ((Facet)object5).getCode()) == null || (object6 = bv2_02.i0) == null) continue;
                object5 = ((Facet)object5).getCode();
                Intrinsics.checkNotNull(object5);
                object4 = n16;
                object5 = (Integer)((HashMap)object6).put(object5, object4);
            }
            if (!bl3) {
                object = ((ProductsList)object).getFacets();
                Intrinsics.checkNotNull(object);
                object = object.iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object2 = (Facet)object.next();
                    String string7 = ((Facet)object2).getCode();
                    Object object7 = bv2_02.X;
                    if (object7 != null) {
                        object7 = ((Facet)object7).getCode();
                    } else {
                        n4 = 0;
                        object7 = null;
                    }
                    if (!(bl3 = kotlin.text.b.i(string7, (String)object7, false))) continue;
                    bv2_02.X = object2;
                }
            }
            bv2_02.R.clear();
            object = bv2_02.S;
            ((HashMap)object).clear();
        }
        bv2_02.g0 = false;
    }

    public final void m(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "searchText");
        aW aW2 = md3_0.c(this);
        F12$c f12$c = new F12$c(this, string2, string3, null);
        Ae3.d(aW2, null, null, f12$c, 3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(ProductsList productsList, boolean bl2) {
        int n3;
        Object object;
        long l2;
        HashMap hashMap;
        Object object2;
        int n4;
        Object object3;
        int n7;
        int n8;
        int n10;
        Object object4;
        Object object5;
        int n14;
        Object object6;
        int n15;
        int n16;
        Object object7;
        String string2;
        Object object8;
        Object object9;
        Object object10;
        int n17;
        Object object11;
        block103: {
            Object object12;
            Object object13;
            Object object14;
            Object object15;
            Object object16;
            block105: {
                block104: {
                    block102: {
                        block101: {
                            block99: {
                                block100: {
                                    block97: {
                                        block98: {
                                            object11 = productsList;
                                            n17 = 1;
                                            object10 = "products";
                                            Intrinsics.checkNotNullParameter(productsList, (String)object10);
                                            object9 = this;
                                            object8 = this.d;
                                            object8.getClass();
                                            Intrinsics.checkNotNullParameter(productsList, (String)object10);
                                            object10 = ((bv2_0)object8).M;
                                            string2 = null;
                                            if (object10 == null) {
                                                object10 = productsList.getFreeTextSearch();
                                                object7 = h40_0.a;
                                                n16 = h40_0.e2();
                                                if (n16 != 0) {
                                                    if (bl2) {
                                                        ((bv2_0)object8).z0 = n17;
                                                    } else {
                                                        object7 = SV2.a;
                                                        if (object7 != null && (n15 = object7.isEmpty()) == 0) {
                                                            object7 = object7.iterator();
                                                            n15 = 0;
                                                            object6 = null;
                                                            while ((n14 = object7.hasNext()) != 0) {
                                                                object5 = ((String)object7.next()).toString();
                                                                object4 = Locale.ROOT;
                                                                object5 = ((String)object5).toLowerCase((Locale)object4);
                                                                object16 = "toLowerCase(...)";
                                                                Intrinsics.checkNotNullExpressionValue(object5, (String)object16);
                                                                object15 = String.valueOf(object10);
                                                                object4 = ((String)object15).toLowerCase((Locale)object4);
                                                                Intrinsics.checkNotNullExpressionValue(object4, (String)object16);
                                                                n14 = Intrinsics.areEqual(object5, object4);
                                                                if (n14 == 0) continue;
                                                                n15 = 1;
                                                            }
                                                            ((bv2_0)object8).z0 = n15;
                                                            SV2.b = n15;
                                                        }
                                                    }
                                                }
                                            }
                                            ((bv2_0)object8).M = object11;
                                            if (object11 == null) return;
                                            object10 = ((bv2_0)object8).P;
                                            if (object10 == null) {
                                                return;
                                            }
                                            object7 = productsList.getAdaptiveSearchReplayResponse();
                                            ((ProductListQuery)object10).setAdaptiveSearchReplayResponse((AdaptiveSearchReplayResponse)object7);
                                            ((bv2_0)object8).R.clear();
                                            ((bv2_0)object8).S.clear();
                                            object10 = ((bv2_0)object8).w;
                                            if (object10 != null) {
                                                object11 = ((bv2_0)object8).P;
                                                Intrinsics.checkNotNull(object11);
                                                ((ProductListQuery)object11).setShowAdsOnNextPage((Boolean)object10);
                                            } else {
                                                object10 = ((bv2_0)object8).P;
                                                if (object10 != null) {
                                                    object11 = productsList.getShowAdsOnNextPage();
                                                    ((ProductListQuery)object10).setShowAdsOnNextPage((Boolean)object11);
                                                }
                                            }
                                            object11 = ((bv2_0)object8).M;
                                            Intrinsics.checkNotNull(object11);
                                            object11 = ((ProductsList)object11).getFreeTextSearch();
                                            n10 = TextUtils.isEmpty((CharSequence)object11);
                                            if (n10 != 0 && (n10 = TextUtils.isEmpty((CharSequence)(object11 = ((bv2_0)object8).A))) == 0) {
                                                object11 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object11);
                                                object10 = ((bv2_0)object8).A;
                                                ((ProductsList)object11).setFreeTextSearch((String)object10);
                                            }
                                            object11 = ((bv2_0)object8).M;
                                            Intrinsics.checkNotNull(object11);
                                            object11 = ((ProductsList)object11).getProducts();
                                            object10 = ((bv2_0)object8).K;
                                            n16 = 0;
                                            object7 = null;
                                            n15 = -1;
                                            if (object11 == null) break block97;
                                            object11 = ((bv2_0)object8).F;
                                            if (object11 == null) {
                                                object11 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object11);
                                                object11 = ((ProductsList)object11).getCurrentQuery();
                                                if (object11 != null && (object11 = ((CurrentQuery)object11).getQuery()) != null) {
                                                    object11 = ((Query)object11).getValue();
                                                } else {
                                                    n10 = 0;
                                                    object11 = null;
                                                }
                                                ((bv2_0)object8).F = object11;
                                            }
                                            object11 = ((bv2_0)object8).M;
                                            Intrinsics.checkNotNull(object11);
                                            object11 = ((ProductsList)object11).getPagination();
                                            if (object11 != null) {
                                                object11 = ((bv2_0)object8).P;
                                                Intrinsics.checkNotNull(object11);
                                                object5 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object5);
                                                object5 = ((ProductsList)object5).getPagination();
                                                Intrinsics.checkNotNull(object5);
                                                n14 = ((Pagination)object5).getTotalResults();
                                                ((ProductListQuery)object11).setTotalResults(n14);
                                                object11 = ((bv2_0)object8).P;
                                                Intrinsics.checkNotNull(object11);
                                                object5 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object5);
                                                object5 = ((ProductsList)object5).getPagination();
                                                Intrinsics.checkNotNull(object5);
                                                n14 = ((Pagination)object5).getTotalPages();
                                                ((ProductListQuery)object11).setTotalPages(n14);
                                                object11 = ((bv2_0)object8).P;
                                                Intrinsics.checkNotNull(object11);
                                                object5 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object5);
                                                object5 = ((ProductsList)object5).getPagination();
                                                Intrinsics.checkNotNull(object5);
                                                n14 = ((Pagination)object5).getPageSize();
                                                ((ProductListQuery)object11).setPageSize(n14);
                                                object11 = ((bv2_0)object8).P;
                                                Intrinsics.checkNotNull(object11);
                                                object5 = ((bv2_0)object8).M;
                                                Intrinsics.checkNotNull(object5);
                                                object5 = ((ProductsList)object5).getPagination();
                                                Intrinsics.checkNotNull(object5);
                                                n14 = ((Pagination)object5).getCurrentPage();
                                                ((ProductListQuery)object11).setCurrentPage(n14);
                                            }
                                            object11 = ((bv2_0)object8).P;
                                            object5 = ((bv2_0)object8).G;
                                            object4 = ((bv2_0)object8).H;
                                            if (object11 == null || (n10 = ((ProductListQuery)object11).getCurrentPage()) != 0) break block98;
                                            ((ArrayList)object10).clear();
                                            object11 = ((bv2_0)object8).M;
                                            Intrinsics.checkNotNull(object11);
                                            object16 = ((bv2_0)object8).V;
                                            if (object16 == null) {
                                                object16 = new HashMap();
                                                ((bv2_0)object8).V = object16;
                                            } else {
                                                ((HashMap)object16).clear();
                                            }
                                            object16 = ((bv2_0)object8).W;
                                            if (object16 == null) {
                                                object16 = new HashMap();
                                                ((bv2_0)object8).W = object16;
                                            } else {
                                                ((HashMap)object16).clear();
                                            }
                                            ((bv2_0)object8).j0 = false;
                                            ((bv2_0)object8).k0 = null;
                                            object16 = ((ProductsList)object11).getFacets();
                                            if (object16 == null) break block99;
                                            object16 = ((ProductsList)object11).getFacets();
                                            ((bv2_0)object8).C((ProductsList)object11, (List)object16);
                                            object16 = ((ProductsList)object11).getFacets();
                                            Intrinsics.checkNotNull(object16);
                                            object16 = object16.iterator();
                                            break block100;
                                        }
                                        object11 = ((bv2_0)object8).M;
                                        if (object11 != null) {
                                            ((ProductsList)object11).setFacets((List)object5);
                                        }
                                        if ((object11 = ((bv2_0)object8).M) != null) {
                                            ((ProductsList)object11).setSorts((List)object4);
                                        }
                                        break block101;
                                    }
                                    ((ArrayList)object10).clear();
                                    break block102;
                                }
                                while ((n8 = object16.hasNext()) != 0) {
                                    object15 = (Facet)object16.next();
                                    n7 = ((Facet)object15).getHideIfCurated();
                                    if (n7 == 0) {
                                        object3 = ((Facet)object15).getCode();
                                        if (object3 != null && (n7 = kotlin.text.b.i((String)(object3 = ((Facet)object15).getCode()), object14 = "pricerange", n17 != 0)) != 0 && (n7 = ((bv2_0)object8).d0) != n15 && (n7 = ((bv2_0)object8).e0) != n15) {
                                            n7 = 1;
                                        } else {
                                            n7 = 0;
                                            object3 = null;
                                        }
                                        object14 = new HashSet();
                                        object13 = ((Facet)object15).getValues();
                                        if (object13 != null) {
                                            boolean bl3;
                                            object13 = ((Facet)object15).getValues();
                                            Intrinsics.checkNotNull(object13);
                                            object13 = ((ArrayList)object13).iterator();
                                            object12 = "iterator(...)";
                                            Intrinsics.checkNotNullExpressionValue(object13, (String)object12);
                                            while (bl3 = object13.hasNext()) {
                                                object12 = object13.next();
                                                object6 = "next(...)";
                                                Intrinsics.checkNotNullExpressionValue(object12, (String)object6);
                                                object12 = (FacetValue)object12;
                                                n15 = (int)(((FacetValue)object12).getSelected() ? 1 : 0);
                                                if (n15 != 0) {
                                                    object6 = ((FacetValue)object12).getName();
                                                    if (object6 != null) {
                                                        object6 = ((FacetValue)object12).getName();
                                                        Intrinsics.checkNotNull(object6);
                                                        ((HashSet)object14).add(object6);
                                                    }
                                                    n7 += n17;
                                                }
                                                n15 = -1;
                                            }
                                        }
                                        if ((object6 = ((Facet)object15).getName()) != null) {
                                            object6 = ((bv2_0)object8).V;
                                            Intrinsics.checkNotNull(object6);
                                            object13 = ((Facet)object15).getName();
                                            Intrinsics.checkNotNull(object13);
                                            ((HashMap)object6).put(object13, object14);
                                        }
                                        if ((object6 = ((Facet)object15).getCode()) != null && (n15 = ((String)object6).length()) != 0 && (object6 = ((bv2_0)object8).W) != null) {
                                            object14 = ((Facet)object15).getCode();
                                            Intrinsics.checkNotNull(object14);
                                            object3 = n7;
                                            object6 = (Integer)((HashMap)object6).put(object14, object3);
                                        }
                                    }
                                    if ((n15 = (int)(Intrinsics.areEqual(object6 = ProductsList.Companion.getCATEGORY_PAGE(), object3 = ((ProductsList)object11).getPageType()) ? 1 : 0)) == 0) {
                                        object3 = "category";
                                        object6 = ((Facet)object15).getName();
                                        n15 = (int)(((String)object3).equalsIgnoreCase((String)object6) ? 1 : 0);
                                        if (n15 != 0 || (n15 = (int)(((String)(object3 = "l1l3nestedcategory")).equalsIgnoreCase((String)(object6 = ((Facet)object15).getCode())) ? 1 : 0)) != 0) {
                                            ((bv2_0)object8).j0 = n17;
                                            ((bv2_0)object8).k0 = object15;
                                        }
                                    } else {
                                        object6 = ((bv2_0)object8).k0;
                                        if (object6 == null && (n15 = (int)(((Facet)object15).getCommonFilter() ? 1 : 0)) == 0) {
                                            ((bv2_0)object8).j0 = n17;
                                            ((bv2_0)object8).k0 = object15;
                                        }
                                    }
                                    n15 = -1;
                                }
                                ((ArrayList)object5).clear();
                                object6 = ((ProductsList)object11).getFacets();
                                if (object6 != null) {
                                    object6 = ((ProductsList)object11).getFacets();
                                    Intrinsics.checkNotNull(object6);
                                    object6 = (Collection)object6;
                                    ((ArrayList)object5).addAll(object6);
                                }
                                object6 = h40_0.a;
                                n15 = (int)(h40_0.P0(((bv2_0)object8).c()) ? 1 : 0);
                                if (n15 != 0 && (n15 = (int)(((bv2_0)object8).y ? 1 : 0)) == 0 || (n15 = (int)(h40_0.M1() ? 1 : 0)) != 0) {
                                    object6 = new hv2_1((bv2_0)object8, (ProductsList)object11, null);
                                    n14 = 3;
                                    object16 = ((bv2_0)object8).e;
                                    Ae3.d((i90_0)object16, null, null, (Function2)object6, n14);
                                }
                                object11 = ((ProductsList)object11).getFacets();
                                Intrinsics.checkNotNull(object11);
                                bv2_0.A((List)object11);
                            }
                            if ((n10 = ((bv2_0)object8).t0) != 0) {
                                ((bv2_0)object8).t0 = false;
                                ((bv2_0)object8).z(n17 != 0);
                            }
                            if ((object11 = ((bv2_0)object8).M) != null) {
                                object11 = ((ProductsList)object11).getSorts();
                            } else {
                                n10 = 0;
                                object11 = null;
                            }
                            if (object11 != null) {
                                ((ArrayList)object4).clear();
                                object11 = ((bv2_0)object8).M;
                                if (object11 != null) {
                                    object11 = ((ProductsList)object11).getSorts();
                                } else {
                                    n10 = 0;
                                    object11 = null;
                                }
                                Intrinsics.checkNotNull(object11);
                                object11 = (Collection)object11;
                                ((ArrayList)object4).addAll(object11);
                                object11 = ((bv2_0)object8).M;
                                Intrinsics.checkNotNull(object11);
                                object11 = ((ProductsList)object11).getSorts();
                                Intrinsics.checkNotNull(object11);
                                object11 = object11.iterator();
                                while ((n15 = (int)(object11.hasNext() ? 1 : 0)) != 0) {
                                    object6 = (Sort)object11.next();
                                    n14 = (int)(((Sort)object6).getSelected() ? 1 : 0);
                                    if (n14 == 0) continue;
                                    ((bv2_0)object8).z = object6;
                                    object11 = ((bv2_0)object8).P;
                                    Intrinsics.checkNotNull(object11);
                                    ((ProductListQuery)object11).setSelectedSort((Sort)object6);
                                    break;
                                }
                            }
                            if ((object11 = ((bv2_0)object8).M) != null) {
                                object11 = ((ProductsList)object11).getOriginalSearchTerm();
                            } else {
                                n10 = 0;
                                object11 = null;
                            }
                            if (object11 != null && (n10 = ((String)object11).length()) != 0) {
                                n10 = 0;
                                object11 = null;
                            } else {
                                n10 = 1;
                            }
                            ((bv2_0)object8).u0 = n10 ^= n17;
                            if (n10 != 0) {
                                object11 = ((bv2_0)object8).M;
                                Intrinsics.checkNotNull(object11);
                                ((bv2_0)object8).v0 = object11 = ((ProductsList)object11).getOriginalSearchTerm();
                                object11 = ((bv2_0)object8).M;
                                Intrinsics.checkNotNull(object11);
                                ((bv2_0)object8).w0 = object11 = ((ProductsList)object11).getFreeTextSearch();
                            }
                            object11 = ((bv2_0)object8).M;
                            Intrinsics.checkNotNull(object11);
                            n10 = (int)(((ProductsList)object11).getAutoAppliedFilter() ? 1 : 0);
                            if (n10 != 0) {
                                object11 = ((bv2_0)object8).M;
                                Intrinsics.checkNotNull(object11);
                                object11 = ((ProductsList)object11).getAppliedGenderFilter();
                                if (object11 != null && (n10 = ((String)object11).length()) != 0) {
                                    object11 = ((bv2_0)object8).M;
                                    Intrinsics.checkNotNull(object11);
                                    object11 = ((ProductsList)object11).getPageType();
                                    if (object11 != null) {
                                        object11 = ((bv2_0)object8).M;
                                        Intrinsics.checkNotNull(object11);
                                        object11 = ((ProductsList)object11).getPageType();
                                        Intrinsics.checkNotNull(object11);
                                        object6 = "Curated Page";
                                        n10 = (int)(kotlin.text.b.i((String)object11, (String)object6, n17 != 0) ? 1 : 0);
                                        if (n10 == 0) {
                                            object11 = ((bv2_0)object8).M;
                                            Intrinsics.checkNotNull(object11);
                                            ((bv2_0)object8).x0 = object11 = ((ProductsList)object11).getAppliedGenderFilter();
                                        }
                                    }
                                }
                            }
                        }
                        object11 = ((bv2_0)object8).M;
                        Intrinsics.checkNotNull(object11);
                        object11 = ((ProductsList)object11).getProducts();
                        Intrinsics.checkNotNull(object11);
                        object11 = (Collection)object11;
                        ((ArrayList)object10).addAll(object11);
                    }
                    object11 = ((bv2_0)object8).M;
                    if (object11 != null && (object11 = ((ProductsList)object11).getPagination()) != null && (n10 = ((Pagination)object11).getCurrentPage()) == 0) {
                        object11 = ((bv2_0)object8).M;
                        if (object11 != null) {
                            object11 = ((ProductsList)object11).getDealStartTime();
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        ((bv2_0)object8).b1 = object11;
                        object11 = ((bv2_0)object8).M;
                        if (object11 != null) {
                            object11 = ((ProductsList)object11).getDealEndTime();
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        ((bv2_0)object8).c1 = object11;
                    }
                    object11 = ((bv2_0)object8).M;
                    Intrinsics.checkNotNull(object11);
                    object11 = ((ProductsList)object11).getCurrentQuery();
                    if (object11 != null && (object11 = ((CurrentQuery)object11).getQuery()) != null) {
                        object11 = ((Query)object11).getValue();
                    } else {
                        n10 = 0;
                        object11 = null;
                    }
                    if (object11 != null && (object11 = ((bv2_0)object8).P) != null) {
                        object10 = ((bv2_0)object8).M;
                        Intrinsics.checkNotNull(object10);
                        object10 = ((ProductsList)object10).getCurrentQuery();
                        if (object10 != null && (object10 = ((CurrentQuery)object10).getQuery()) != null) {
                            object10 = ((Query)object10).getValue();
                        } else {
                            n4 = 0;
                            object10 = null;
                        }
                        ((ProductListQuery)object11).setQueryText((String)object10);
                    }
                    if ((object11 = ((bv2_0)object8).M) != null) {
                        object11 = ((ProductsList)object11).getCategoryCode();
                    } else {
                        n10 = 0;
                        object11 = null;
                    }
                    if (object11 != null) {
                        object11 = ((bv2_0)object8).M;
                        if (object11 != null && (object11 = ((ProductsList)object11).getCategoryCode()) != null) {
                            n10 = ((String)object11).length();
                            if (n10 > 0) {
                                n10 = 1;
                            } else {
                                n10 = 0;
                                object11 = null;
                            }
                            object11 = n10 != 0;
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        Intrinsics.checkNotNull(object11);
                        n10 = (int)(((Boolean)object11).booleanValue() ? 1 : 0);
                        if (n10 != 0 && (object11 = ((bv2_0)object8).P) != null) {
                            object11 = ((bv2_0)object8).M;
                            Intrinsics.checkNotNull(object11);
                            ((bv2_0)object8).m0 = object11 = ((ProductsList)object11).getCategoryCode();
                            object11 = ((bv2_0)object8).P;
                            Intrinsics.checkNotNull(object11);
                            object10 = ((bv2_0)object8).M;
                            Intrinsics.checkNotNull(object10);
                            object10 = ((ProductsList)object10).getCategoryCode();
                            ((ProductListQuery)object11).setCategoryId((String)object10);
                            ((bv2_0)object8).B = false;
                            ((bv2_0)object8).l0 = null;
                        }
                    }
                    if ((n10 = (int)(TextUtils.isEmpty((CharSequence)(object11 = ((sw_0)(object10 = ((bv2_0)object8).v)).getPreference("CORE_CATEGORY_ID", (String)(object6 = "")))) ? 1 : 0)) != 0) {
                        object11 = ((bv2_0)object8).M;
                        if (object11 != null) {
                            object11 = ((ProductsList)object11).getCategoryCode();
                        } else {
                            n10 = 0;
                            object11 = null;
                        }
                        if (object11 != null) {
                            object11 = ((bv2_0)object8).M;
                            if (object11 != null) {
                                object11 = ((ProductsList)object11).getCategoryCode();
                            } else {
                                n10 = 0;
                                object11 = null;
                            }
                            Intrinsics.checkNotNull(object11);
                            ((bv2_0)object8).b((String)object11);
                        } else {
                            object11 = ((bv2_0)object8).M;
                            Intrinsics.checkNotNull(object11);
                            object11 = ((ProductsList)object11).getCurrentQuery();
                            if (object11 != null) {
                                object11 = ((bv2_0)object8).M;
                                Intrinsics.checkNotNull(object11);
                                object11 = ((ProductsList)object11).getCurrentQuery();
                                if (object11 != null && (object11 = ((CurrentQuery)object11).getQuery()) != null) {
                                    object11 = ((Query)object11).getValue();
                                } else {
                                    n10 = 0;
                                    object11 = null;
                                }
                                n10 = TextUtils.isEmpty((CharSequence)object11);
                                if (n10 == 0) {
                                    object11 = ((bv2_0)object8).M;
                                    Intrinsics.checkNotNull(object11);
                                    object11 = ((ProductsList)object11).getCurrentQuery();
                                    Intrinsics.checkNotNull(object11);
                                    object11 = ((CurrentQuery)object11).getQuery();
                                    Intrinsics.checkNotNull(object11);
                                    object11 = ((Query)object11).getValue();
                                    Intrinsics.checkNotNull(object11);
                                    ((bv2_0)object8).b((String)object11);
                                }
                            }
                        }
                    }
                    object11 = ((bv2_0)object8).M;
                    Intrinsics.checkNotNull(object11);
                    object11 = ((ProductsList)object11).getCategoryCode();
                    if (object11 == null) break block103;
                    object11 = ((bv2_0)object8).M;
                    Intrinsics.checkNotNull(object11);
                    object11 = ((ProductsList)object11).getCategoryCode();
                    Intrinsics.checkNotNull(object11);
                    object10 = "category:8302";
                    n14 = (int)(StringsKt.F((CharSequence)object11, (CharSequence)object10, false) ? 1 : 0);
                    object4 = "8307";
                    object16 = "8306";
                    object15 = "8305";
                    object3 = "8304";
                    object14 = "category:8307";
                    object13 = "category:8306";
                    object12 = "category:8305";
                    object7 = "category:8304";
                    object2 = "8303";
                    string2 = "8302";
                    object9 = "category:8303";
                    if (n14 != 0) break block104;
                    n14 = 0;
                    object5 = null;
                    boolean bl4 = StringsKt.F((CharSequence)object11, (CharSequence)object9, false);
                    if (bl4 || (bl4 = kotlin.text.b.s(object11, string2, false)) || (bl4 = kotlin.text.b.s((String)object11, object2, false)) || (bl4 = StringsKt.F((CharSequence)object11, (CharSequence)object7, false)) || (bl4 = StringsKt.F((CharSequence)object11, (CharSequence)object12, false)) || (bl4 = StringsKt.F((CharSequence)object11, (CharSequence)object13, false)) || (bl4 = StringsKt.F((CharSequence)object11, (CharSequence)object14, false)) || (bl4 = kotlin.text.b.s((String)object11, (String)object3, false)) || (bl4 = kotlin.text.b.s((String)object11, (String)object15, false)) || (bl4 = kotlin.text.b.s((String)object11, (String)object16, false))) break block105;
                    boolean bl5 = kotlin.text.b.s((String)object11, (String)object4, false);
                    if (!bl5) break block103;
                }
                n14 = 0;
                object5 = null;
            }
            object11 = (n4 = StringsKt.F((CharSequence)object11, (CharSequence)object10, false)) == 0 && (n4 = kotlin.text.b.s(object11, string2, false)) == 0 ? ((n4 = StringsKt.F((CharSequence)object11, (CharSequence)object9, false)) == 0 && (n17 = kotlin.text.b.s((String)object11, (String)object2, false)) == 0 ? ((n17 = (int)(StringsKt.F((CharSequence)object11, (CharSequence)object7, false) ? 1 : 0)) == 0 && (n17 = (int)(kotlin.text.b.s((String)object11, (String)object3, false) ? 1 : 0)) == 0 && (n17 = (int)(StringsKt.F((CharSequence)object11, (CharSequence)object12, false) ? 1 : 0)) == 0 && (n17 = kotlin.text.b.s((String)object11, (String)object15, false)) == 0 && (n17 = StringsKt.F((CharSequence)object11, (CharSequence)object13, false)) == 0 && (n17 = kotlin.text.b.s((String)object11, (String)object16, false)) == 0 && (n17 = StringsKt.F((CharSequence)object11, (CharSequence)object14, false)) == 0 && (n10 = (int)(kotlin.text.b.s((String)object11, (String)object4, false) ? 1 : 0)) == 0 ? object6 : "Kids") : "Women") : "Men";
            hashMap = p3.a("CategoryName", (String)object11);
            object11 = AnalyticsManager.Companion.getInstance().getCt();
            l2 = 0L;
            object = null;
            n3 = 65279;
            object2 = new AnalyticsData(null, null, null, l2, null, null, null, null, hashMap, null, null, null, null, null, null, null, n3, null);
            ((CleverTapEvents)object11).lineOfBuisness((AnalyticsData)object2);
        }
        if ((object11 = ((bv2_0)object8).P) != null) {
            object11 = ((bv2_0)object8).M;
            if (object11 != null) {
                object11 = ((ProductsList)object11).getPagination();
            } else {
                n10 = 0;
                object11 = null;
            }
            if (object11 != null && (n10 = TextUtils.isEmpty((CharSequence)(object11 = ((bv2_0)object8).l0))) == 0) {
                object11 = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object11).getInstance().getFb();
                object9 = ((bv2_0)object8).l0;
                object = object9 == null ? object6 : object9;
                l2 = 0L;
                hashMap = null;
                n3 = -33;
                object10 = new AnalyticsData(null, null, null, l2, null, (String)object, null, null, null, null, null, null, null, null, null, null, n3, null);
                ((FacebookEvents)object2).productSearch((AnalyticsData)object10);
                Object object17 = object2;
                object2 = new Bundle();
                object9 = ((bv2_0)object8).l0;
                object2.putString("Searched for Product", (String)object9);
                object10 = ((bv2_0)object8).P;
                Intrinsics.checkNotNull(object10);
                object10 = ((ProductListQuery)object10).getCategoryId();
                object2.putString("Category", (String)object10);
                object10 = ((bv2_0)object8).M;
                Intrinsics.checkNotNull(object10);
                object10 = ((ProductsList)object10).getPagination();
                Intrinsics.checkNotNull(object10);
                n4 = ((Pagination)object10).getTotalResults();
                object9 = "No of Results";
                object2.putInt((String)object9, n4);
                object11 = ((AnalyticsManager$Companion)object11).getInstance().getGa();
                long l3 = 1L;
                int n18 = 65015;
                object2 = new AnalyticsData(null, null, null, l3, null, null, null, null, null, (Bundle)object17, null, null, null, null, null, null, n18, null);
                ((GoogleAnalyticsEvents)object11).productSearch((AnalyticsData)object2);
            }
        }
        if ((n10 = ((bv2_0)object8).x) == 0) {
            ((bv2_0)object8).D();
        }
        if ((object11 = ((bv2_0)object8).M) != null) {
            object7 = ((ProductsList)object11).getProducts();
        } else {
            n16 = 0;
            object7 = null;
        }
        object7 = (Collection)object7;
        if (object7 == null) return;
        n10 = object7.isEmpty();
        if (n10 != 0) {
            return;
        }
        n17 = R$string.rtb_url_product_list_page;
        object2 = hv3_0.K(n17);
        object11 = new StringBuilder((String)object2);
        object2 = ((bv2_0)object8).M;
        Intrinsics.checkNotNull(object2);
        object2 = ((ProductsList)object2).getProducts();
        Intrinsics.checkNotNull(object2);
        object2 = ((Iterable)object2).iterator();
        n4 = 0;
        object10 = null;
        n14 = 0;
        object5 = null;
        while (true) {
            block108: {
                block107: {
                    int n19;
                    block106: {
                        int n20 = object2.hasNext();
                        string2 = "substring(...)";
                        if (n20 == 0) break;
                        n20 = 1;
                        n16 = n14 + 1;
                        object9 = (Product)object2.next();
                        object6 = ((Product)object9).getOfferPrice();
                        if (object6 != null && n4 == 0) {
                            n4 = 1;
                        }
                        if (n14 >= (n15 = 5) || (object4 = ((Product)object9).getFnlColorVariantData()) == null) break block106;
                        object4 = ((Product)object9).getFnlColorVariantData();
                        Intrinsics.checkNotNull(object4);
                        object4 = ((ProductFnlColorVariantData)object4).getColorGroup();
                        Intrinsics.checkNotNull(object4);
                        char c2 = '_';
                        n8 = 6;
                        n7 = 0;
                        object3 = null;
                        int n21 = StringsKt.N((CharSequence)object4, c2, 0, false, n8);
                        n19 = -1;
                        if (n21 == n19) break block107;
                        object6 = ((Product)object9).getFnlColorVariantData();
                        Intrinsics.checkNotNull(object6);
                        object6 = ((ProductFnlColorVariantData)object6).getColorGroup();
                        Intrinsics.checkNotNull(object6);
                        object9 = ((Product)object9).getFnlColorVariantData();
                        Intrinsics.checkNotNull(object9);
                        object9 = ((ProductFnlColorVariantData)object9).getColorGroup();
                        Intrinsics.checkNotNull(object9);
                        n20 = StringsKt.N((CharSequence)object9, c2, 0, false, n8);
                        object9 = ((String)object6).substring(0, n20);
                        Intrinsics.checkNotNullExpressionValue(object9, string2);
                        ((StringBuilder)object11).append((String)object9);
                        object9 = ",";
                        ((StringBuilder)object11).append((String)object9);
                        break block108;
                    }
                    n19 = -1;
                }
                if (n14 >= n15) break;
            }
            n14 = n16;
        }
        n17 = ((StringBuilder)object11).length() - 1;
        n4 = 0;
        object11 = ((StringBuilder)object11).substring(0, n17);
        Intrinsics.checkNotNullExpressionValue(object11, string2);
        ((bv2_0)object8).c.a((String)object11);
        object11 = ((bv2_0)object8).M;
        Intrinsics.checkNotNull(object11);
        object2 = GAEcommerceEvents.INSTANCE;
        object10 = o72_0.a;
        object9 = ((bv2_0)object8).d.getUserStatusMessage();
        object8 = "getUserStatusMessage(...)";
        Intrinsics.checkNotNullExpressionValue(object9, (String)object8);
        ((GAEcommerceEvents)object2).pushProductFetchEvent((ProductsList)object11, (String)object10, (String)object9);
    }

    public final void o() {
        boolean bl2;
        Object object = this.d;
        ProductListQuery productListQuery = ((bv2_0)object).P;
        if (productListQuery != null) {
            productListQuery.setCurrentPage(0);
        }
        if ((productListQuery = ((bv2_0)object).P) != null) {
            Object object2 = ((bv2_0)object).Q;
            object2 = object2 != null ? ((ProductListQuery)object2).getQueryText() : null;
            productListQuery.setQueryText((String)object2);
        }
        ((bv2_0)object).t0 = bl2 = true;
        object = ((bv2_0)object).P;
        if (object != null) {
            ((ProductListQuery)object).setAdaptiveSearchReplayResponse(null);
        }
    }

    public final void onCleared() {
        super.onCleared();
        Object object = this.d;
        Object object2 = ((bv2_0)object).j1;
        boolean bl2 = ((t30_0)object2).b;
        if (!bl2) {
            object2 = ((bv2_0)object).j1;
            ((t30_0)object2).d();
        }
        object = ((bv2_0)object).e.a;
        object2 = i$a.a;
        if ((object = (i)object.get((CoroutineContext$a)object2)) != null && (object = object.b()) != null) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (i)object.next();
                object2.d(null);
            }
        }
        object = this.b;
        object2 = ((yx3)object).c;
        bl2 = ((t30_0)object2).b;
        if (!bl2) {
            object = ((yx3)object).c;
            ((t30_0)object).d();
        }
        object = this.c;
        object2 = ((qQ2)object).b;
        bl2 = ((t30_0)object2).b;
        if (!bl2) {
            object = ((qQ2)object).b;
            ((t30_0)object).d();
        }
    }
}

