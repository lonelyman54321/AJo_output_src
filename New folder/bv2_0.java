/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  org.json.JSONObject
 */
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.ExtraImage;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PlpExtendedBannerComponent;
import com.ril.ajio.services.data.Product.PlpExtendedBannerData;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.Product.ProductQuickFilterItem;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Product.ProductsList$Companion;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.data.prioritydelivery.PlpDelivery;
import com.ril.ajio.services.data.prioritydelivery.PlpFilters;
import com.ril.ajio.services.data.prioritydelivery.PriorityDeliveryP2Config;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.d;
import org.json.JSONObject;

/*
 * Renamed from bv2
 */
public final class bv2_0 {
    public static final bv2$a Companion;
    public static String Z1 = "";
    public static kv2_0 a2;
    public static boolean b2;
    public String A;
    public int A0;
    public String A1;
    public boolean B;
    public final int B0;
    public Integer B1;
    public String C;
    public final int C0;
    public String C1;
    public String D;
    public boolean D0;
    public String D1;
    public String E;
    public boolean E0;
    public final LinkedHashSet E1;
    public String F;
    public int F0;
    public final hh3_2 F1;
    public final ArrayList G;
    public int G0;
    public ArrayList G1;
    public final ArrayList H;
    public int H0;
    public int H1;
    public Boolean I;
    public String I0;
    public int I1;
    public Boolean J;
    public String J0;
    public int J1;
    public final ArrayList K;
    public String K0;
    public int K1;
    public Integer L;
    public String L0;
    public List L1;
    public ProductsList M;
    public Boolean M0;
    public int M1;
    public ProductsList N;
    public PLPExtras N0;
    public final LinkedHashMap N1;
    public boolean O;
    public final hh3_2 O0;
    public final hh3_2 O1;
    public ProductListQuery P;
    public final hh3_2 P0;
    public int P1;
    public ProductListQuery Q;
    public String Q0;
    public final int Q1;
    public final HashMap R;
    public String R0;
    public boolean R1;
    public final HashMap S;
    public String S0;
    public final ArrayList S1;
    public final ArrayList T;
    public String T0;
    public ArrayList T1;
    public final ArrayList U;
    public String U0;
    public final HashMap U1;
    public HashMap V;
    public boolean V0;
    public final String V1;
    public HashMap W;
    public boolean W0;
    public final ArrayList W1;
    public Facet X;
    public String X0;
    public final ArrayList X1;
    public String Y;
    public boolean Y0;
    public HashMap Y1;
    public ArrayList Z;
    public String Z0;
    public final Application a;
    public String a0;
    public StoreInfo a1;
    public final NewPlpRepo b;
    public int b0;
    public Long b1;
    public final F12$a c;
    public int c0;
    public Long c1;
    public final UserInformation d;
    public int d0;
    public Uri d1;
    public final c80 e;
    public int e0;
    public boolean e1;
    public final zr1_1 f;
    public final hh3_2 f0;
    public String f1;
    public final zr1_1 g;
    public boolean g0;
    public final NewCustomEventsRevamp g1;
    public final zr1_1 h;
    public boolean h0;
    public String h1;
    public final zr1_1 i;
    public HashMap i0;
    public String i1;
    public final zr1_1 j;
    public boolean j0;
    public final t30_0 j1;
    public final zr1_1 k;
    public Facet k0;
    public boolean k1;
    public final zr1_1 l;
    public String l0;
    public boolean l1;
    public final zr1_1 m;
    public String m0;
    public boolean m1;
    public final zr1_1 n;
    public boolean n0;
    public boolean n1;
    public final zr1_1 o;
    public boolean o0;
    public String o1;
    public final zr1_1 p;
    public boolean p0;
    public boolean p1;
    public final zr1_1 q;
    public String q0;
    public boolean q1;
    public BrandDetails r;
    public String r0;
    public String r1;
    public boolean s;
    public Bundle s0;
    public String s1;
    public String t;
    public boolean t0;
    public String t1;
    public Boolean u;
    public boolean u0;
    public String u1;
    public final jo_2 v;
    public String v0;
    public Boolean v1;
    public Boolean w;
    public String w0;
    public String w1;
    public boolean x;
    public String x0;
    public String x1;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public Sort z;
    public boolean z0;
    public String z1;

    static {
        bv2$a bv2$a;
        Companion = bv2$a = new Object();
        a2 = kv2_0.PLP_DEFAULT;
    }

    public bv2_0(Application object, NewPlpRepo cloneable, F12$b object2) {
        int n3;
        Object object3;
        int n4;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "mApplication");
        Intrinsics.checkNotNullParameter(cloneable, "plpRepo");
        Intrinsics.checkNotNullParameter(object2, "rtbDelegateCallback");
        this.a = object;
        this.b = cloneable;
        this.c = object2;
        cloneable = UserInformation.getInstance((Context)object);
        this.d = cloneable;
        cloneable = ir0_2.a;
        cloneable = kotlinx.coroutines.d.a(bg1_1.a);
        this.e = cloneable;
        cloneable = new Cloneable();
        this.f = cloneable;
        cloneable = new Cloneable();
        this.g = cloneable;
        cloneable = new Cloneable();
        this.h = cloneable;
        cloneable = new Cloneable();
        this.i = cloneable;
        cloneable = new Cloneable();
        this.j = cloneable;
        cloneable = new Cloneable();
        this.k = cloneable;
        cloneable = new Cloneable();
        this.l = cloneable;
        cloneable = new Cloneable();
        this.m = cloneable;
        cloneable = new Cloneable();
        this.n = cloneable;
        cloneable = new Cloneable();
        this.o = cloneable;
        cloneable = new Cloneable();
        this.p = cloneable;
        cloneable = new Cloneable();
        this.q = cloneable;
        cloneable = new Cloneable((Context)object);
        this.v = cloneable;
        cloneable = "";
        this.A = cloneable;
        this.B = n7;
        object2 = new ArrayList();
        this.G = object2;
        object2 = new ArrayList();
        this.H = object2;
        object2 = Boolean.TRUE;
        this.I = object2;
        object2 = Boolean.FALSE;
        this.J = object2;
        object2 = new ArrayList();
        this.K = object2;
        this.R = object2;
        super();
        this.S = object2;
        object2 = new ArrayList();
        this.T = object2;
        object2 = new ArrayList();
        this.U = object2;
        this.b0 = n4 = -1;
        this.c0 = n4;
        this.d0 = n4;
        this.e0 = n4;
        super();
        this.f0 = object3 = yr1_2.b((Function0)object3);
        this.l0 = cloneable;
        this.m0 = cloneable;
        this.x0 = cloneable;
        z40_0.Companion.getClass();
        this.B0 = n3 = Math.max(z40$a.a((Context)object).a.g("ad_start_index"), 2);
        this.C0 = n3 = z40$a.a((Context)object).a.g("ad_end_index");
        this.F0 = n4;
        this.J0 = cloneable;
        object2 = new Object();
        this.O0 = object2 = yr1_2.b((Function0)object2);
        object2 = new Object();
        this.P0 = object2 = yr1_2.b((Function0)object2);
        this.U0 = "Saas";
        this.X0 = cloneable;
        cloneable = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.g1 = cloneable;
        cloneable = new Cloneable();
        this.j1 = cloneable;
        this.q1 = n7;
        this.y1 = n7;
        cloneable = new Cloneable();
        this.E1 = cloneable;
        cloneable = new Cloneable(this);
        cloneable = yr1_2.b((Function0)((Object)cloneable));
        this.F1 = cloneable;
        cloneable = Ga4Events.INSTANCE;
        cloneable = new Cloneable();
        this.G1 = cloneable;
        cloneable = new Cloneable();
        this.L1 = cloneable;
        super();
        this.N1 = cloneable;
        cloneable = new Cloneable(n7);
        cloneable = yr1_2.b((Function0)((Object)cloneable));
        this.O1 = cloneable;
        this.Q1 = 3;
        this.S1 = cloneable = new Cloneable();
        this.T1 = cloneable = new Cloneable();
        super();
        this.U1 = cloneable;
        object = z40$a.a((Context)object).a.b("banner_ad_variant_type");
        this.V1 = object;
        super();
        this.W1 = object;
        super();
        this.X1 = object;
        super();
        this.Y1 = object;
    }

    public static void A(List object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2;
            Object object3;
            int n3;
            Object object4 = "category";
            Facet facet = (Facet)object.next();
            Object object5 = facet.getName();
            boolean bl4 = ((String)object4).equalsIgnoreCase((String)object5);
            if (!bl4 && !(bl4 = ((String)(object4 = "l1l3nestedcategory")).equalsIgnoreCase((String)(object5 = facet.getCode())))) continue;
            object5 = new Object();
            object4 = facet.getValues();
            if (object4 == null) continue;
            object4 = facet.getValues();
            Intrinsics.checkNotNull(object4);
            int n4 = ((ArrayList)object4).size();
            if (n4 <= 0) continue;
            object4 = facet.getValues();
            Intrinsics.checkNotNull(object4);
            object4 = ((ArrayList)object4).iterator();
            Object object6 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
            while ((n3 = object4.hasNext()) != 0) {
                int n7;
                object3 = object4.next();
                Intrinsics.checkNotNullExpressionValue(object3, "next(...)");
                object3 = (FacetValue)object3;
                object2 = ((FacetValue)object3).getCode();
                Serializable serializable = "";
                if (object2 == null) {
                    object2 = serializable;
                }
                Object object7 = new String[]{"-"};
                int n8 = 0;
                int n10 = 2;
                object2 = StringsKt.a0((CharSequence)object2, (String[])object7, false, n10, n10);
                n10 = yx_2.o((Iterable)object2, 10);
                object7 = new ArrayList(n10);
                object2 = object2.iterator();
                while ((n10 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    String string2 = ((Object)StringsKt.m0((String)object2.next())).toString();
                    ((ArrayList)object7).add(string2);
                }
                object2 = (String)((ArrayList)object7).get(0);
                n10 = ((ArrayList)object7).size();
                if (n10 > (n7 = 1)) {
                    serializable = (String)((ArrayList)object7).get(n7);
                }
                ((FacetValue)object3).setDisplayName((String)((Object)serializable));
                serializable = facet.getCategoryFacetValues();
                boolean bl5 = ((HashMap)serializable).containsKey(object2);
                serializable = bl5 ? (ArrayList)facet.getCategoryFacetValues().get(object2) : new ArrayList();
                Intrinsics.checkNotNull(serializable);
                ((ArrayList)serializable).add(object3);
                object7 = facet.getCategoryFacetValues();
                object7.put(object2, serializable);
                bl5 = ((HashMap)object5).containsKey(object2);
                if (bl5) {
                    serializable = ((HashMap)object5).get(object2);
                    Intrinsics.checkNotNull(serializable);
                    serializable = (Number)serializable;
                    n8 = ((Number)serializable).intValue();
                }
                n3 = ((FacetValue)object3).getCount() + n8;
                object3 = n3;
                ((HashMap)object5).put(object2, object3);
            }
            object5 = ((HashMap)object5).entrySet();
            object4 = new LinkedList(object5);
            object5 = new Object();
            bx_2.q(object4, (Comparator)object5);
            object5 = new Object();
            object4 = ((AbstractCollection)object4).iterator();
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
            while (bl3 = object4.hasNext()) {
                object6 = (Map.Entry)object4.next();
                Intrinsics.checkNotNull(object6);
                object3 = object6.getKey();
                Intrinsics.checkNotNullExpressionValue(object3, "component1(...)");
                object3 = (String)object3;
                object6 = object6.getValue();
                object2 = "component2(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object2);
                object6 = (Integer)object6;
                object5.put(object3, object6);
            }
            facet.setCategoryGenderItemCount((HashMap)object5);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void B(bv2_0 var0, ProductsList var1_1, boolean var2_2, boolean var3_3, Boolean var4_4, ym0_0 var5_5, Boolean var6_6, int var7_7) {
        block106: {
            block103: {
                block109: {
                    block108: {
                        block101: {
                            var8_8 = var0;
                            var9_9 = 4;
                            var10_10 = 1;
                            var11_11 = var7_7 & 4;
                            var12_12 = 0;
                            var13_13 = null;
                            var11_11 = var11_11 != 0 ? 0 : (int)var3_3;
                            var14_14 = var7_7 & 8;
                            var15_15 = var14_14 != 0 ? Boolean.FALSE : var4_4;
                            var16_16 = var7_7 & 16;
                            if (var16_16 != 0) {
                                var16_16 = 0;
                                var17_17 = null;
                            } else {
                                var17_17 = var5_5;
                            }
                            var18_18 = var7_7 & 32;
                            var19_19 = var18_18 != 0 ? Boolean.FALSE : var6_6;
                            var0.getClass();
                            var20_20 = var1_1;
                            Intrinsics.checkNotNullParameter(var1_1, "productsList");
                            var21_21 = Boolean.TRUE;
                            var8_8.V0 = var22_22 = Intrinsics.areEqual(var19_19, var21_21);
                            var21_21 = var1_1.getCurrentQuery();
                            if (var21_21 != null && (var21_21 = var21_21.getQuery()) != null) {
                                var21_21 = var21_21.getValue();
                            } else {
                                var22_22 = 0;
                                var21_21 = null;
                            }
                            var23_23 = var8_8.y;
                            var24_24 = 6;
                            var25_25 = "substring(...)";
                            if (var23_23 != 0) {
                                var20_20 = var1_1.getCurrentQuery();
                                if (var20_20 != null) {
                                    var20_20 = var20_20.getUrl();
                                } else {
                                    var26_26 = 0;
                                    var20_20 = null;
                                }
                                if (var20_20 != null) {
                                    var22_22 = StringsKt.R((CharSequence)var20_20, "=", 0, var24_24) + var10_10;
                                    var21_21 = var20_20.substring(var22_22);
                                    Intrinsics.checkNotNullExpressionValue(var21_21, (String)var25_25);
                                }
                            }
                            if (var21_21 == null) break block106;
                            var20_20 = var8_8.R;
                            var27_27 = var20_20.entrySet().iterator();
                            var29_29 = var28_28 = "";
                            block0: while (true) {
                                block107: {
                                    var30_30 = var27_27.hasNext();
                                    var31_31 = ":";
                                    var32_32 = "<get-value>(...)";
                                    var33_33 = "next(...)";
                                    if (!var30_30) break block101;
                                    var34_34 = var27_27.next();
                                    Intrinsics.checkNotNullExpressionValue(var34_34, var33_33);
                                    var34_34 = ((Map.Entry)var34_34).getValue();
                                    Intrinsics.checkNotNullExpressionValue(var34_34, (String)var32_32);
                                    var34_34 = (FacetValue)var34_34;
                                    var32_32 = var34_34.getQuery();
                                    if (var32_32 != null && (var32_32 = var32_32.getQuery()) != null) {
                                        var32_32 = var32_32.getValue();
                                    } else {
                                        var9_9 = 0;
                                        var32_32 = null;
                                    }
                                    if (var32_32 == null) break;
                                    var33_33 = var34_34.getFacetCode();
                                    var13_13 = var34_34.getCode();
                                    var1_1 = var27_27;
                                    var27_27 = new StringBuilder();
                                    var27_27.append(var33_33);
                                    var27_27.append((String)var31_31);
                                    var27_27.append((String)var13_13);
                                    var13_13 = var27_27.toString();
                                    var23_23 = 0;
                                    var27_27 = null;
                                    var12_12 = (int)StringsKt.F((CharSequence)var21_21, (CharSequence)var13_13, false);
                                    if (var12_12 != 0) break block107;
                                    var13_13 = "relevance";
                                    var12_12 = (int)StringsKt.F((CharSequence)var32_32, (CharSequence)var13_13, false);
                                    if (var12_12 != 0) {
                                        var32_32 = Boolean.FALSE;
                                        var9_9 = (int)Intrinsics.areEqual(var19_19, var32_32);
                                        if (var9_9 != 0) {
                                            var32_32 = var34_34.getFacetCode();
                                            var34_34 = var34_34.getCode();
                                            var32_32 = UX.c((String)var31_31, var32_32, (String)var31_31, (String)var34_34);
                                        } else {
                                            var32_32 = StringsKt.U((String)var21_21, (String)var31_31);
                                        }
lbl92:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var10_10 = 1;
                                    var12_12 = (int)kotlin.text.b.s((String)var32_32, (String)var21_21, (boolean)var10_10);
                                    if (var12_12 == 0 || (var10_10 = var32_32.length()) <= (var12_12 = var21_21.length())) ** GOTO lbl92
                                    var10_10 = var21_21.length();
                                    var32_32 = var32_32.substring(var10_10);
                                    Intrinsics.checkNotNullExpressionValue(var32_32, (String)var25_25);
                                    ** continue;
                                    var10_10 = 0;
                                    var34_34 = null;
                                    var12_12 = (int)kotlin.text.b.s(var32_32, (String)var31_31, false);
                                    if (var12_12 == 0 && (var10_10 = (int)Intrinsics.areEqual(var19_19, var34_34 = Boolean.TRUE)) == 0) {
                                        var32_32 = var31_31.concat((String)var32_32);
                                    }
                                    var29_29 = Ft2.a((String)var29_29, var32_32);
                                }
lbl108:
                                // 2 sources

                                while (true) {
                                    var27_27 = var1_1;
                                    var9_9 = 4;
                                    var10_10 = 1;
                                    var12_12 = 0;
                                    var13_13 = null;
                                    var24_24 = 6;
                                    continue block0;
                                    break;
                                }
                                break;
                            }
                            var1_1 = var27_27;
                            ** while (true)
                        }
                        var34_34 = var8_8.S;
                        var13_13 = var34_34.entrySet().iterator();
                        while ((var18_18 = (int)var13_13.hasNext()) != 0) {
                            var19_19 = var13_13.next();
                            Intrinsics.checkNotNullExpressionValue(var19_19, var33_33);
                            var19_19 = ((Map.Entry)var19_19).getValue();
                            Intrinsics.checkNotNullExpressionValue(var19_19, (String)var32_32);
                            var19_19 = (FacetValue)var19_19;
                            var27_27 = var19_19.getCode();
                            var19_19 = var19_19.getFacetCode();
                            var25_25 = "newcategory";
                            var35_35 = var25_25.equalsIgnoreCase((String)var19_19);
                            if (var35_35) {
                                var19_19 = "category";
                            }
                            var25_25 = new StringBuilder((String)var31_31);
                            var25_25.append((String)var19_19);
                            var25_25.append((String)var31_31);
                            var25_25.append((String)var27_27);
                            var19_19 = var25_25.toString();
                            Intrinsics.checkNotNull(var21_21);
                            var23_23 = 0;
                            var27_27 = null;
                            var35_35 = StringsKt.F((CharSequence)var21_21, (CharSequence)var19_19, false);
                            if (!var35_35) continue;
                            var21_21 = kotlin.text.b.n((String)var21_21, (String)var19_19, (String)var28_28, false);
                        }
                        var23_23 = 0;
                        var27_27 = null;
                        var32_32 = var21_21 == null ? var28_28 : var21_21;
                        var9_9 = (int)StringsKt.F((CharSequence)var29_29, (CharSequence)var32_32, false);
                        if (var9_9 == 0) {
                            var29_29 = Ft2.a((String)var21_21, (String)var29_29);
                        }
                        if ((var9_9 = (int)var8_8.g0) != 0) {
                            var9_9 = var8_8.b0;
                            var13_13 = ":price:";
                            var18_18 = -1;
                            if (var9_9 != var18_18 && (var9_9 = var8_8.c0) != var18_18) {
                                block102: {
                                    block4: while (true) {
                                        var32_32 = ":pricerange:";
                                        var22_22 = 0;
                                        var21_21 = null;
                                        var23_23 = StringsKt.F((CharSequence)var29_29, (CharSequence)var32_32, false);
                                        if (var23_23 == 0) break block102;
                                        var9_9 = StringsKt.O((CharSequence)var29_29, (String)var32_32, 0, false, 6);
                                        var23_23 = var9_9 + 12;
                                        var24_24 = 4;
                                        if ((var23_23 = StringsKt.O((CharSequence)var29_29, (String)var31_31, var23_23, false, var24_24)) == var18_18) break;
                                        var32_32 = StringsKt.X((CharSequence)var29_29, var9_9, var23_23, (CharSequence)var28_28).toString();
lbl170:
                                        // 2 sources

                                        while (true) {
                                            var29_29 = var32_32;
                                            continue block4;
                                            break;
                                        }
                                        break;
                                    }
                                    var23_23 = var29_29.length();
                                    var32_32 = StringsKt.X((CharSequence)var29_29, var9_9, var23_23, (CharSequence)var28_28).toString();
                                    ** continue;
                                }
                                var9_9 = (int)StringsKt.F((CharSequence)var29_29, (CharSequence)var13_13, false);
                                if (var9_9 != 0) {
                                    var9_9 = StringsKt.O((CharSequence)var29_29, (String)var13_13, 0, false, 6);
                                    var23_23 = var9_9 + 7;
                                    var36_36 = StringsKt.O((CharSequence)var29_29, (String)var31_31, var23_23, false, var24_24 = 4);
                                    if (var36_36 != var18_18) {
                                        var32_32 = StringsKt.X((CharSequence)var29_29, var9_9, var36_36, (CharSequence)var28_28).toString();
lbl184:
                                        // 2 sources

                                        while (true) {
                                            var29_29 = var32_32;
                                            break;
                                        }
                                    } else {
                                        var36_36 = var29_29.length();
                                        var32_32 = StringsKt.X((CharSequence)var29_29, var9_9, var36_36, (CharSequence)var28_28).toString();
                                        ** continue;
                                    }
                                }
                                var9_9 = var8_8.b0;
                                var36_36 = var8_8.c0;
                                var19_19 = new StringBuilder();
                                var19_19.append((String)var29_29);
                                var19_19.append((String)var13_13);
                                var19_19.append(var9_9);
                                var32_32 = ",";
                                var19_19.append((String)var32_32);
                                var19_19.append(var36_36);
                                var29_29 = var19_19.toString();
                            } else {
                                var9_9 = 0;
                                var32_32 = null;
                                var22_22 = (int)StringsKt.F((CharSequence)var29_29, (CharSequence)var13_13, false);
                                if (var22_22 != 0) {
                                    var12_12 = StringsKt.O((CharSequence)var29_29, (String)var13_13, 0, false, 6);
                                    var22_22 = var12_12 + 7;
                                    var36_36 = StringsKt.O((CharSequence)var29_29, (String)var31_31, var22_22, false, var23_23 = 4);
                                    if (var36_36 != var18_18) {
                                        var32_32 = StringsKt.X((CharSequence)var29_29, var12_12, var36_36, (CharSequence)var28_28).toString();
lbl215:
                                        // 2 sources

                                        while (true) {
                                            var29_29 = var32_32;
                                            break;
                                        }
                                    } else {
                                        var9_9 = var29_29.length();
                                        var32_32 = StringsKt.X((CharSequence)var29_29, var12_12, var9_9, (CharSequence)var28_28).toString();
                                        ** continue;
                                    }
                                }
                            }
                        }
                        var32_32 = h40_0.a;
                        var9_9 = (int)h40_0.P0(var0.c());
                        if ((var9_9 == 0 || (var9_9 = (int)var8_8.y) != 0) && (var9_9 = (int)h40_0.M1()) == 0) break block108;
                        var9_9 = (int)var20_20.isEmpty();
                        var13_13 = var8_8.U;
                        var31_31 = var8_8.T;
                        var19_19 = var8_8.l;
                        if (var9_9 == 0 || (var9_9 = (int)var34_34.isEmpty()) == 0) break block109;
                        var31_31.clear();
                        var13_13.clear();
                        var19_19.k(var31_31);
                    }
lbl233:
                    // 2 sources

                    while (true) {
                        var37_37 = 0;
                        var28_28 = null;
                        break block103;
                        break;
                    }
                }
                var9_9 = (int)var20_20.isEmpty();
                var22_22 = 1;
                var21_21 = var8_8.W1;
                var27_27 = var8_8.X1;
                var33_33 = "more";
                var25_25 = "<get-values>(...)";
                if ((var9_9 ^= var22_22) != 0) {
                    var32_32 = var20_20.values();
                    Intrinsics.checkNotNullExpressionValue(var32_32, (String)var25_25);
                    var32_32 = ((Iterable)var32_32).iterator();
                    while ((var26_26 = (int)var32_32.hasNext()) != 0) {
                        block104: {
                            var20_20 = (FacetValue)var32_32.next();
                            var28_28 = var27_27.iterator();
                            while ((var38_38 = var28_28.hasNext()) != 0) {
                                var39_39 = var28_28.next();
                                var40_40 /* !! */  = var39_39;
                                var40_40 /* !! */  = (FacetValue)var39_39;
                                var1_1 = var32_32;
                                var32_32 = var40_40 /* !! */ .getCode();
                                var4_4 = var28_28;
                                if (var32_32 != null) {
                                    var28_28 = var20_20.getCode();
                                    var9_9 = var32_32.equals(var28_28);
                                    if (var9_9 == (var37_37 = 1)) {
                                        break block104;
                                    }
                                } else {
                                    var37_37 = 1;
                                }
                                var32_32 = var1_1;
                                var28_28 = var4_4;
                            }
                            var1_1 = var32_32;
                            var37_37 = 1;
                            var38_38 = 0;
                            var39_39 = null;
                        }
                        var32_32 = var39_39;
                        var32_32 = (FacetValue)var39_39;
                        if (var32_32 != null) {
                            var32_32.setSelected((boolean)var37_37);
                        }
                        var20_20.setSelected((boolean)var37_37);
                        var9_9 = (int)var21_21.contains(var20_20);
                        if (var9_9 == 0 && (var9_9 = (int)var8_8.V0) == 0) {
                            Intrinsics.checkNotNull(var20_20);
                            var21_21.add((Object)var20_20);
                        }
                        if ((var9_9 = var31_31.size()) < (var37_37 = var0.j())) {
                            var41_41 = 4;
                            var42_42 = "facet";
                            var40_40 /* !! */  = var32_32;
                            var43_43 = var20_20;
                            var32_32 = new AppliedFacetValue((String)var42_42, (FacetValue)var20_20, 0, var41_41, null);
                            var26_26 = (int)var31_31.isEmpty();
                            var37_37 = 1;
                            if ((var26_26 ^= var37_37) != 0) {
                                var26_26 = 0;
                                var20_20 = null;
                                var31_31.add(0, var32_32);
                            } else {
                                var26_26 = 0;
                                var20_20 = null;
                                var31_31.add(0, var32_32);
                            }
                        } else {
                            var41_41 = 4;
                            var42_42 = "facet";
                            var40_40 /* !! */  = var32_32;
                            var43_43 = var20_20;
                            var32_32 = new AppliedFacetValue((String)var42_42, (FacetValue)var20_20, 0, var41_41, null);
                            var13_13.add(var32_32);
                        }
                        var32_32 = var1_1;
                    }
                    var9_9 = var31_31.size();
                    if (var9_9 >= (var26_26 = var0.j())) {
                        var32_32 = ((AppliedFacetValue)CollectionsKt.S((List)var31_31)).getType();
                        var9_9 = (int)Intrinsics.areEqual(var32_32, var33_33);
                        if (var9_9 == 0) {
                            var9_9 = (int)var13_13.isEmpty();
                            var26_26 = 1;
                            if ((var9_9 ^= var26_26) != 0) {
                                var26_26 = var13_13.size();
                                var37_37 = 0;
                                var28_28 = null;
                                var32_32 = new AppliedFacetValue(var33_33, null, var26_26);
                                var31_31.add(var32_32);
                            }
                        } else {
                            var32_32 = (AppliedFacetValue)CollectionsKt.S((List)var31_31);
                            var26_26 = var13_13.size();
                            var32_32.setSize(var26_26);
                        }
                    }
                    var32_32 = var8_8.T;
                    var19_19.k(var32_32);
                }
                var9_9 = (int)var34_34.isEmpty();
                ** while ((var9_9 ^= (var26_26 = 1)) == 0)
lbl331:
                // 1 sources

                var32_32 = new ArrayList(var31_31);
                var20_20 = var34_34.values();
                Intrinsics.checkNotNullExpressionValue(var20_20, (String)var25_25);
                var20_20 = ((Iterable)var20_20).iterator();
                while ((var37_37 = var20_20.hasNext()) != 0) {
                    var28_28 = (FacetValue)var20_20.next();
                    var38_38 = var21_21.size();
                    if (var38_38 > 0) {
                        block105: {
                            var21_21.remove(var28_28);
                            var39_39 = var27_27.iterator();
                            while ((var44_44 = var39_39.hasNext()) != 0) {
                                var40_40 /* !! */  = var39_39.next();
                                var42_42 = var40_40 /* !! */ ;
                                var42_42 = (FacetValue)var40_40 /* !! */ ;
                                var43_43 = var21_21;
                                var21_21 = var42_42.getCode();
                                var1_1 = var20_20;
                                if (var21_21 == null || (var22_22 = (int)var21_21.equals(var20_20 = var28_28.getCode())) != (var26_26 = 1)) {
                                    var20_20 = var1_1;
                                    var21_21 = var43_43;
                                    continue;
                                }
                                break block105;
                            }
                            var43_43 = var21_21;
                            var1_1 = var20_20;
                            var44_44 = 0;
                            var40_40 /* !! */  = null;
                        }
                        var21_21 = var40_40 /* !! */ ;
                        var21_21 = (FacetValue)var40_40 /* !! */ ;
                        if (var21_21 != null) {
                            var26_26 = 0;
                            var20_20 = null;
                            var21_21.setSelected(false);
                        }
                    } else {
                        var43_43 = var21_21;
                        var1_1 = var20_20;
                    }
                    var21_21 = var31_31.iterator();
                    var26_26 = 0;
                    var20_20 = null;
                    while ((var38_38 = (int)var21_21.hasNext()) != 0) {
                        var39_39 = var21_21.next();
                        var30_30 = true;
                        var44_44 = var26_26 + 1;
                        if (var26_26 >= 0) {
                            var39_39 = (AppliedFacetValue)var39_39;
                            var4_4 = var21_21;
                            var21_21 = var28_28.getCode();
                            if ((var39_39 = var39_39.getFacetValue()) != null) {
                                var45_45 = var39_39.getCode();
                                var39_39 = var27_27;
                                var27_27 = var45_45;
                            } else {
                                var39_39 = var27_27;
                                var23_23 = 0;
                                var27_27 = null;
                            }
                            var22_22 = (int)Intrinsics.areEqual(var21_21, var27_27);
                            if (var22_22 != 0 && var26_26 < (var22_22 = var32_32.size())) {
                                var32_32.remove(var26_26);
                            }
                            var21_21 = var4_4;
                            var27_27 = var39_39;
                            var26_26 = var44_44;
                            continue;
                        }
                        xx_2.n();
                        throw null;
                    }
                    var20_20 = var1_1;
                    var21_21 = var43_43;
                }
                var31_31.clear();
                var31_31.addAll(var32_32);
                var32_32 = var34_34.values();
                Intrinsics.checkNotNullExpressionValue(var32_32, (String)var25_25);
                var32_32 = ((Iterable)var32_32).iterator();
                while ((var10_10 = (int)var32_32.hasNext()) != 0) {
                    var34_34 = (FacetValue)var32_32.next();
                    var26_26 = 1;
                    var21_21 = new xw1_0(var34_34, var26_26);
                    cx_2.w((List)var13_13, (Function1)var21_21);
                }
                var26_26 = 1;
                var9_9 = var31_31.isEmpty() ^ var26_26;
                if (var9_9 != 0 && (var9_9 = var31_31.size()) <= (var10_10 = var0.j() + var26_26) && (var9_9 = var13_13.isEmpty() ^ var26_26) != 0) {
                    var32_32 = new ArrayList(var13_13);
                    var10_10 = xx_2.h((List)var31_31);
                    var31_31.remove(var10_10);
                    var34_34 = var13_13.iterator();
                    while ((var22_22 = (int)var34_34.hasNext()) != 0) {
                        var21_21 = (AppliedFacetValue)var34_34.next();
                        var26_26 = var31_31.size();
                        if (var26_26 >= (var23_23 = var0.j())) continue;
                        var31_31.add(var21_21);
                        var32_32.remove(var21_21);
                        var22_22 = var31_31.size();
                        if (var22_22 < (var26_26 = var0.j())) continue;
                        var21_21 = ((AppliedFacetValue)CollectionsKt.S((List)var31_31)).getType();
                        var22_22 = (int)Intrinsics.areEqual(var21_21, var33_33);
                        if (var22_22 == 0) {
                            var22_22 = (int)var32_32.isEmpty();
                            var26_26 = 1;
                            if ((var22_22 ^= var26_26) == 0) continue;
                            var26_26 = var32_32.size();
                            var23_23 = 0;
                            var27_27 = null;
                            var21_21 = new AppliedFacetValue(var33_33, null, var26_26);
                            var31_31.add(var21_21);
                            continue;
                        }
                        var21_21 = (AppliedFacetValue)CollectionsKt.S((List)var31_31);
                        var26_26 = var32_32.size();
                        var21_21.setSize(var26_26);
                    }
                    var13_13.clear();
                    var13_13.addAll(var32_32);
                } else {
                    var9_9 = (int)var31_31.isEmpty();
                    var10_10 = 1;
                    if ((var9_9 ^= var10_10) != 0) {
                        var9_9 = (int)var13_13.isEmpty();
                        if (var9_9 != 0) {
                            var32_32 = ((AppliedFacetValue)CollectionsKt.S((List)var31_31)).getType();
                            var9_9 = (int)Intrinsics.areEqual(var32_32, var33_33);
                            if (var9_9 != 0) {
                                var32_32 = CollectionsKt.S((List)var31_31);
                                var31_31.remove(var32_32);
                            }
                        } else {
                            var32_32 = (AppliedFacetValue)CollectionsKt.S((List)var31_31);
                            var10_10 = var13_13.size();
                            var32_32.setSize(var10_10);
                        }
                    }
                }
                var9_9 = (int)var13_13.isEmpty();
                var10_10 = 1;
                if ((var9_9 ^= var10_10) != 0 && (var9_9 = (int)Intrinsics.areEqual(var32_32 = ((AppliedFacetValue)CollectionsKt.S((List)var31_31)).getType(), var33_33)) == 0 && (var9_9 = var13_13.isEmpty() ^ var10_10) != 0) {
                    var10_10 = var13_13.size();
                    var37_37 = 0;
                    var28_28 = null;
                    var32_32 = new AppliedFacetValue(var33_33, null, var10_10);
                    var31_31.add(var32_32);
                } else {
                    var37_37 = 0;
                    var28_28 = null;
                }
                var32_32 = var8_8.T;
                var19_19.k(var32_32);
            }
            if (var2_2) {
                var8_8.Q = var32_32 = new ProductListQuery();
                var34_34 = var8_8.P;
                if (var34_34 != null) {
                    var34_34 = var34_34.getSelectedSort();
                } else {
                    var10_10 = 0;
                    var34_34 = null;
                }
                var32_32.setSelectedSort((Sort)var34_34);
                var32_32 = var8_8.Q;
                if (var32_32 != null) {
                    var10_10 = 0;
                    var34_34 = null;
                    var32_32.setCurrentPage(0);
                }
                if ((var32_32 = var8_8.Q) != null) {
                    var32_32.setQueryText((String)var29_29);
                }
                if ((var32_32 = var8_8.Q) != null) {
                    var34_34 = var8_8.P;
                    if (var34_34 != null) {
                        var34_34 = var34_34.getCategoryId();
                    } else {
                        var10_10 = 0;
                        var34_34 = null;
                    }
                    var32_32.setCategoryId((String)var34_34);
                }
                if ((var32_32 = var8_8.Q) != null) {
                    var34_34 = var8_8.P;
                    if (var34_34 != null) {
                        var34_34 = var34_34.getPageType();
                    } else {
                        var10_10 = 0;
                        var34_34 = null;
                    }
                    var32_32.setPageType((String)var34_34);
                }
                if ((var32_32 = var8_8.P) != null) {
                    var9_9 = var32_32.getPageSize();
                    var32_32 = var9_9;
                } else {
                    var9_9 = 0;
                    var32_32 = null;
                }
                if (var32_32 != null && (var32_32 = var8_8.Q) != null) {
                    var34_34 = var8_8.P;
                    Intrinsics.checkNotNull(var34_34);
                    var10_10 = var34_34.getPageSize();
                    var32_32.setPageSize(var10_10);
                }
                if ((var32_32 = var8_8.Q) != null) {
                    var34_34 = var8_8.P;
                    if (var34_34 != null) {
                        var31_31 = var34_34.getWidgetRecord();
                    } else {
                        var36_36 = 0;
                        var31_31 = null;
                    }
                    var32_32.setWidgetRecord((WidgetRecord)var31_31);
                }
                var9_9 = 1 ^ var11_11;
                var8_8.e1 = var9_9;
                if (var17_17 != null && (var9_9 = (int)var17_17.a) != 0 && (var34_34 = var8_8.Q) != null) {
                    var34_34.setAppendProductsQueryParam((boolean)var9_9);
                }
                if (var17_17 != null && (var32_32 = var17_17.b) != null && (var10_10 = var32_32.length()) > 0 && (var34_34 = var8_8.Q) != null) {
                    var34_34.setPincode((String)var32_32);
                }
                if ((var9_9 = (int)var8_8.B) != 0) {
                    var32_32 = var8_8.Q;
                    Intrinsics.checkNotNull(var32_32);
                    var8_8.n((ProductListQuery)var32_32);
                } else {
                    var32_32 = var8_8.Q;
                    Intrinsics.checkNotNull(var32_32);
                    var8_8.h((ProductListQuery)var32_32, (Boolean)var15_15);
                }
            } else {
                var32_32 = var8_8.P;
                if (var32_32 != null) {
                    var10_10 = 0;
                    var34_34 = null;
                    var32_32.setCurrentPage(0);
                }
                if ((var32_32 = var8_8.P) != null) {
                    var32_32.setQueryText((String)var29_29);
                }
                if ((var9_9 = (int)var8_8.B) != 0) {
                    var32_32 = var8_8.P;
                    Intrinsics.checkNotNull(var32_32);
                    var8_8.n((ProductListQuery)var32_32);
                } else {
                    var32_32 = var8_8.P;
                    Intrinsics.checkNotNull(var32_32);
                    var34_34 = Boolean.TRUE;
                    var8_8.h((ProductListQuery)var32_32, (Boolean)var34_34);
                }
            }
        }
    }

    public static int d(int n3, List object) {
        int n4;
        block7: {
            boolean bl2;
            Object object2;
            block6: {
                n4 = 0;
                object2 = object.subList(0, n3);
                bl2 = object2 instanceof Collection;
                if (!bl2) break block6;
                object = object2;
                object = (Collection)object2;
                bl2 = object.isEmpty();
                if (bl2) break block7;
            }
            object2 = object2.iterator();
            while (bl2 = object2.hasNext()) {
                db2_0 db2_02;
                object = (cB2)object2.next();
                Object object3 = object != null ? ((cB2)object).a : null;
                if (object3 != null || (object3 = object != null ? ((cB2)object).b : null) == (db2_02 = db2_0.IS_VISUAL_FILTER) || (object3 = object != null ? ((cB2)object).b : null) == (db2_02 = db2_0.IS_FILTER_NUDGE) || (object3 = object != null ? ((cB2)object).b : null) == (db2_02 = db2_0.IS_FULL_JIO_AD_BANNER)) continue;
                if (object != null) {
                    object = ((cB2)object).b;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object == (object3 = db2_0.IS_HALF_JIO_AD_BANNER) || ++n4 >= 0) continue;
                xx_2.m();
                throw null;
            }
        }
        return n4;
    }

    public static boolean x(PlpExtendedBanner object) {
        String string2 = "STANDARD";
        Object[] objectArray = new String[]{"IMAGE", string2};
        if ((object = object != null && (object = ((PlpExtendedBanner)object).getData()) != null && (object = ((PlpExtendedBannerData)object).getComponent()) != null ? ((PlpExtendedBannerComponent)object).getType() : null) != null) {
            return tp_2.w(objectArray, object);
        }
        return false;
    }

    public final void C(ProductsList productsList, List list) {
        block23: {
            Object object;
            ArrayList arrayList;
            Object object2;
            int n3;
            int n4;
            List list2;
            block26: {
                boolean bl2;
                block25: {
                    String string2;
                    block24: {
                        boolean bl3;
                        int n7;
                        Iterator iterator;
                        int n8;
                        Object object3;
                        int n10;
                        int n14;
                        Object object4;
                        boolean bl4;
                        int n15;
                        Object object5;
                        Object object6;
                        Object object7;
                        int n16;
                        Object object8;
                        boolean bl5;
                        Object object9;
                        Collection<Object> collection;
                        int n17;
                        int n18;
                        String string3;
                        Object object10;
                        Object object11;
                        int n19;
                        bv2_0 bv2_02;
                        block22: {
                            bv2_02 = this;
                            list2 = list;
                            n4 = 1;
                            n3 = productsList.isFromImageSearch();
                            if (n3 != 0) {
                                return;
                            }
                            if (list == null) break block23;
                            n3 = 0;
                            object2 = null;
                            this.W0 = false;
                            arrayList = list.iterator();
                            do {
                                n18 = arrayList.hasNext();
                                string3 = "sla";
                                if (n18 == 0) break block22;
                            } while ((n19 = Intrinsics.areEqual(object11 = ((Facet)(object10 = (Facet)arrayList.next())).getCode(), string3)) == 0);
                            bv2_02.W0 = n4;
                            arrayList = ((Facet)object10).getValues();
                            if (arrayList != null) {
                                object10 = h40_0.a;
                                n18 = h40_0.Q1();
                                if (n18 == 0 || (object10 = h40_0.k0(false)) == null || (object10 = ((PriorityDeliveryP2Config)object10).getPlpDelivery()) == null || (object10 = ((PlpDelivery)object10).getPlpFilters()) == null || (object10 = ((PlpFilters)object10).getEnableFacetValues()) == null || (n19 = object10.isEmpty() ^ n4) == 0) {
                                    n18 = 0;
                                    object10 = null;
                                }
                                if (object10 == null) {
                                    object10 = fh1_2.f();
                                }
                                if ((n19 = h40_0.Q1()) == 0 || (object11 = h40_0.k0(false)) == null || (object11 = ((PriorityDeliveryP2Config)object11).getPlpDelivery()) == null || (object11 = ((PlpDelivery)object11).getPlpFilters()) == null || (object11 = ((PlpFilters)object11).getDisplayFacetSequence()) == null || (n17 = object11.isEmpty() ^ n4) == 0) {
                                    n19 = 0;
                                    object11 = null;
                                }
                                if (object11 == null) {
                                    object11 = mz0_2.a;
                                }
                                collection = new Collection<Object>();
                                object9 = arrayList.iterator();
                                while (bl5 = object9.hasNext()) {
                                    object8 = ((FacetValue)object9.next()).getCode();
                                    if (object8 == null) continue;
                                    ((ArrayList)collection).add(object8);
                                }
                                collection = CollectionsKt.o0(collection);
                                object9 = new ArrayList();
                                object8 = arrayList.iterator();
                                while ((n16 = object8.hasNext()) != 0) {
                                    object6 = object7 = (Object)object8.next();
                                    object6 = (FacetValue)object7;
                                    object5 = object10.keySet();
                                    n15 = (int)(CollectionsKt.F((Iterable)object5, object6 = ((FacetValue)object6).getCode()) ? 1 : 0);
                                    if (n15 == 0) continue;
                                    ((ArrayList)object9).add(object7);
                                }
                                n16 = 10;
                                n15 = yx_2.o(object9, n16);
                                object8 = new ArrayList(n15);
                                object9 = ((ArrayList)object9).iterator();
                                while ((n15 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                                    object6 = (FacetValue)object9.next();
                                    object5 = ((FacetValue)object6).getCode();
                                    if ((object5 = (String)object10.get(object5)) == null) {
                                        object5 = ((FacetValue)object6).getName();
                                    }
                                    ((FacetValue)object6).setName((String)object5);
                                    ((FacetValue)object6).setEnabled(n4 != 0);
                                    ((ArrayList)object8).add(object6);
                                }
                                object9 = object10.keySet();
                                object6 = new ArrayList();
                                object9 = object9.iterator();
                                while (bl4 = object9.hasNext()) {
                                    object4 = object5 = object9.next();
                                    object4 = (String)object5;
                                    n14 = collection.contains(object4) ^ n4;
                                    if (n14 == 0) continue;
                                    ((ArrayList)object6).add(object5);
                                }
                                n10 = yx_2.o(object6, n16);
                                collection = new Collection<Object>(n10);
                                object9 = ((ArrayList)object6).iterator();
                                while ((n16 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                                    object7 = (String)object9.next();
                                    object6 = (String)object10.get(object7);
                                    if (object6 == null) {
                                        object6 = "";
                                    }
                                    object3 = object6;
                                    bl4 = false;
                                    object5 = null;
                                    n8 = 0;
                                    int n20 = 3999;
                                    object6 = object4;
                                    object = object4;
                                    n14 = 0;
                                    object4 = null;
                                    iterator = null;
                                    n7 = 0;
                                    object6 = new FacetValue(null, null, false, false, 0, (String)object7, (String)object3, null, null, null, false, false, false, n20, null);
                                    ((ArrayList)collection).add(object6);
                                }
                                object10 = CollectionsKt.W(collection, object8);
                                object = new ArrayList();
                                object10 = object10.iterator();
                                while ((n17 = (int)(object10.hasNext() ? 1 : 0)) != 0) {
                                    collection = object10.next();
                                    object9 = collection;
                                    object9 = (FacetValue)((Object)collection);
                                    object8 = object11;
                                    object8 = (Iterable)object11;
                                    n10 = (int)(CollectionsKt.F((Iterable)object8, object9 = ((FacetValue)object9).getCode()) ? 1 : 0);
                                    if (n10 == 0) continue;
                                    ((ArrayList)object).add(collection);
                                }
                                object10 = new bv2$c((List)object11);
                                object10 = CollectionsKt.e0(object, (Comparator)object10);
                                arrayList.clear();
                                object10 = (Collection)object10;
                                arrayList.addAll(object10);
                            }
                        }
                        if ((bl3 = bv2_02.W0) || (arrayList = h40_0.a.v()) == null) break block23;
                        iterator = null;
                        n19 = 0;
                        object11 = null;
                        n17 = 0;
                        collection = null;
                        n10 = 0;
                        object9 = null;
                        bl5 = false;
                        object8 = null;
                        n16 = 0;
                        object7 = null;
                        n15 = 0;
                        object6 = null;
                        bl4 = false;
                        object5 = null;
                        n14 = 0;
                        object4 = null;
                        n7 = 1023;
                        object = arrayList;
                        arrayList = new ArrayList(false, false, null, null, null, null, null, null, null, null, n7, null);
                        n18 = h40_0.Q1();
                        if (n18 == 0 || (object10 = h40_0.k0(false)) == null || (object10 = ((PriorityDeliveryP2Config)object10).getPlpDelivery()) == null || (object10 = ((PlpDelivery)object10).getPlpFilters()) == null || (object10 = ((PlpFilters)object10).getDisableFacetValues()) == null || !(bl2 = object10.isEmpty() ^ n4)) {
                            n18 = 0;
                            object10 = null;
                        }
                        if (object10 != null) {
                            object = new ArrayList();
                            n19 = object10.size();
                            collection = null;
                            for (n17 = 0; n17 < n19; n17 += n4) {
                                object9 = ((ArrayList)object10).get(n17);
                                iterator = object9;
                                iterator = (String)object9;
                                bl5 = false;
                                object8 = null;
                                n16 = 0;
                                object7 = null;
                                n15 = 0;
                                object6 = null;
                                bl4 = false;
                                object5 = null;
                                object9 = object4;
                                object2 = object4;
                                n14 = 0;
                                object4 = null;
                                n7 = 0;
                                object3 = null;
                                n8 = 6079;
                                object9 = new FacetValue(null, null, false, false, 0, null, (String)((Object)iterator), null, null, null, false, false, false, n8, null);
                                ((ArrayList)object).add(object9);
                                n3 = 0;
                                object2 = null;
                            }
                            ((Facet)((Object)arrayList)).setValues((ArrayList)object);
                        }
                        ((Facet)((Object)arrayList)).setCommonFilter(n4 != 0);
                        ((Facet)((Object)arrayList)).setCode(string3);
                        string2 = h40_0.a.v();
                        ((Facet)((Object)arrayList)).setName(string2);
                        n4 = h40_0.Q1();
                        if (n4 == 0) break block24;
                        n4 = 0;
                        string2 = null;
                        object2 = h40_0.k0(false);
                        if (object2 == null || (object2 = ((PriorityDeliveryP2Config)object2).getPlpDelivery()) == null || (object2 = ((PlpDelivery)object2).getPlpFilters()) == null || (object2 = ((PlpFilters)object2).getFacetPosition()) == null || (n3 = ((Number)object2).intValue()) <= (n18 = -1)) break block25;
                        object = n3;
                        break block26;
                    }
                    n4 = 0;
                    string2 = null;
                }
                bl2 = false;
                object = null;
            }
            if (object != null) {
                n3 = (Integer)object;
            } else {
                n3 = 0;
                object2 = null;
            }
            n4 = list.size();
            if (n3 < n4) {
                list2.add(n3, arrayList);
            } else {
                list2.add(arrayList);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void D() {
        block125: {
            block134: {
                block135: {
                    block124: {
                        block133: {
                            block132: {
                                block129: {
                                    block128: {
                                        block126: {
                                            block127: {
                                                var1_1 = this;
                                                var2_2 = 1;
                                                var3_3 = 0;
                                                var4_4 = null;
                                                var5_5 = this.v;
                                                var6_6 = "";
                                                var7_7 /* !! */  = var5_5.getPreference("NAVIGATION_HIERARCHY_KEY", (String)var6_6);
                                                if (var7_7 /* !! */  != null && (var8_9 = var7_7 /* !! */ .length()) != 0) {
                                                    var9_10 = "->";
                                                    var10_11 = StringsKt.F(var7_7 /* !! */ , (CharSequence)var9_10, false);
                                                    if (var10_11 == 0 && (var12_13 = StringsKt.F(var7_7 /* !! */ , var11_12 /* !! */  = ">", false))) {
                                                        var7_7 /* !! */  = oo1_1.a(var11_12 /* !! */ , var7_7 /* !! */ , (String)var9_10);
                                                    }
                                                    if (var12_13 = StringsKt.F(var7_7 /* !! */ , var11_12 /* !! */  = "/", false)) {
                                                        var7_7 /* !! */  = oo1_1.a(var11_12 /* !! */ , var7_7 /* !! */ , (String)var9_10);
                                                    }
                                                }
                                                var5_5.x((String)var6_6);
                                                var9_10 = bv2_0.Z1;
                                                var11_12 /* !! */  = "user completed search";
                                                var13_14 = "search";
                                                if (var9_10 != null && (var8_9 = var9_10.length()) != 0 && (var9_10 = bv2_0.a2) == (var14_15 = kv2_0.PLP_SEARCH)) {
                                                    var1_1.h1 = var13_14;
                                                    var1_1.i1 = var11_12 /* !! */ ;
                                                }
                                                if ((var9_10 = bv2_0.a2) == (var14_15 = kv2_0.PLP_HISTORY)) {
                                                    var1_1.h1 = var13_14;
                                                    var9_10 = "history search";
                                                    var1_1.i1 = var9_10;
                                                }
                                                if ((var8_9 = (int)var1_1.o0) != 0) {
                                                    var9_10 = "video banner plp";
                                                } else {
                                                    var9_10 = var1_1.M;
                                                    if (var9_10 != null) {
                                                        var9_10 = var9_10.getFreeTextSearch();
                                                    } else {
                                                        var8_9 = 0;
                                                        var9_10 = null;
                                                    }
                                                    if (var9_10 != null && (var8_9 = var9_10.length()) != 0 && (var9_10 = var1_1.M) != null) {
                                                        var9_10 = var9_10.getFreeTextSearch();
                                                    } else {
                                                        var8_9 = 0;
                                                        var9_10 = null;
                                                    }
                                                }
                                                var15_16 = var1_1.n0;
                                                if (!var15_16 && (var16_17 = var1_1.m0) != null && (var15_16 = var16_17.length())) {
                                                    var16_17 = var1_1.m0;
                                                } else {
                                                    var15_16 = false;
                                                    var16_17 = null;
                                                }
                                                var17_18 = var1_1.n0;
                                                var18_19 = "image upload";
                                                if (!var17_18) ** GOTO lbl90
                                                var19_20 = var1_1.C;
                                                var20_21 = var1_1.D;
                                                var21_22 = yn3_0.a;
                                                var22_23 = "searchType : %s";
                                                var14_15 = new Object[var2_2];
                                                var14_15[0] = var20_21;
                                                var21_22.a((String)var22_23, (Object[])var14_15);
                                                var1_1.h1 = var13_14;
                                                if (var20_21 != null && (var23_24 = Intrinsics.areEqual(var20_21, var14_15 = "auto suggested search"))) {
                                                    var1_1.i1 = var14_15;
                                                } else {
                                                    var14_15 = "auto correction user completed search";
                                                    if (var20_21 != null && (var23_24 = Intrinsics.areEqual(var20_21, var11_12 /* !! */ ))) {
                                                        var20_21 = var1_1.M;
                                                        if (var20_21 != null && (var20_21 = var20_21.getOriginalSearchTerm()) != null && (var24_25 = var20_21.length()) != 0) {
                                                            var1_1.i1 = var14_15;
                                                            var19_20 = var1_1.E;
                                                        } else {
                                                            var1_1.i1 = var11_12 /* !! */ ;
                                                        }
                                                    } else {
                                                        var10_11 = TextUtils.isEmpty((CharSequence)var19_20);
                                                        if (var10_11 == 0 && (var10_11 = TextUtils.isEmpty((CharSequence)var20_21)) != 0) {
                                                            var11_12 /* !! */  = var1_1.M;
                                                            if (var11_12 /* !! */  != null && (var11_12 /* !! */  = var11_12 /* !! */ .getOriginalSearchTerm()) != null && (var10_11 = var11_12 /* !! */ .length()) != 0) {
                                                                var1_1.i1 = var14_15;
                                                                var19_20 = var1_1.E;
                                                            } else {
                                                                var11_12 /* !! */  = "history SearchBar search";
                                                                var1_1.i1 = var11_12 /* !! */ ;
                                                            }
                                                        } else {
                                                            var10_11 = var1_1.y;
                                                            if (var10_11 == 0) {
                                                                var11_12 /* !! */  = var1_1.M;
                                                                if (var11_12 /* !! */  != null && (var11_12 /* !! */  = var11_12 /* !! */ .getOriginalSearchTerm()) != null && (var10_11 = var11_12 /* !! */ .length()) != 0) {
                                                                    var1_1.i1 = var14_15;
                                                                    var19_20 = var1_1.E;
                                                                } else {
                                                                    var1_1.i1 = var20_21;
                                                                    var19_20 = var1_1.E;
                                                                }
                                                            } else {
                                                                var1_1.i1 = var18_19;
lbl90:
                                                                // 2 sources

                                                                var17_18 = false;
                                                                var19_20 = null;
                                                            }
                                                        }
                                                    }
                                                }
                                                var10_11 = var1_1.y;
                                                if (var10_11 != 0) {
                                                    var1_1.i1 = var18_19;
                                                }
                                                var11_12 /* !! */  = var1_1.X0;
                                                var10_11 = TextUtils.isEmpty((CharSequence)var11_12 /* !! */ );
                                                var14_15 = "menu";
                                                if (var10_11 != 0) break block126;
                                                var11_12 /* !! */  = var1_1.X0;
                                                var18_19 = "nav";
                                                var10_11 = kotlin.text.b.i(var11_12 /* !! */ , (String)var18_19, (boolean)var2_2);
                                                if (var10_11 == 0) break block127;
                                                var1_1.h1 = var14_15;
                                                var10_11 = TextUtils.isEmpty((CharSequence)var7_7 /* !! */ );
                                                if (var10_11 == 0) {
                                                    var1_1.i1 = var7_7 /* !! */ ;
                                                    break block128;
                                                } else {
                                                    var7_7 /* !! */  = bv2_0.a2;
                                                    var11_12 /* !! */  = kv2_0.PLP_MENU;
                                                    if (var7_7 /* !! */  == var11_12 /* !! */ ) {
                                                        var7_7 /* !! */  = bv2_0.Z1;
                                                        var1_1.i1 = var7_7 /* !! */ ;
                                                    }
                                                }
                                                break block128;
                                            }
                                            var7_7 /* !! */  = "Trending categories";
                                            var11_12 /* !! */  = var1_1.X0;
                                            var25_26 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var11_12 /* !! */ );
                                            if (var25_26 != 0) {
                                                var1_1.h1 = var13_14;
                                            } else {
                                                var7_7 /* !! */  = "banner";
                                                var1_1.h1 = var7_7 /* !! */ ;
                                            }
                                            var7_7 /* !! */  = var1_1.X0;
                                            var1_1.i1 = var7_7 /* !! */ ;
                                            break block128;
                                        }
                                        var11_12 /* !! */  = var1_1.Z0;
                                        if (var11_12 /* !! */  != null && (var10_11 = var1_1.n0) == 0) {
                                            var1_1.h1 = var14_15;
                                            var10_11 = TextUtils.isEmpty((CharSequence)var7_7 /* !! */ );
                                            if (var10_11 == 0) {
                                                var1_1.i1 = var7_7 /* !! */ ;
                                            } else {
                                                var7_7 /* !! */  = bv2_0.a2;
                                                var11_12 /* !! */  = kv2_0.PLP_MENU;
                                                if (var7_7 /* !! */  == var11_12 /* !! */ ) {
                                                    var7_7 /* !! */  = bv2_0.Z1;
                                                    var1_1.i1 = var7_7 /* !! */ ;
                                                }
                                            }
                                        }
                                    }
                                    var25_26 = var1_1.p0;
                                    if (var25_26 != 0) {
                                        var7_7 /* !! */  = "notification";
                                        var1_1.h1 = var7_7 /* !! */ ;
                                        var11_12 /* !! */  = var1_1.q0;
                                        if (var11_12 /* !! */  != null && (var10_11 = var11_12 /* !! */ .length()) != 0) {
                                            var7_7 /* !! */  = var1_1.q0;
                                        }
                                        var1_1.i1 = var7_7 /* !! */ ;
                                    }
                                    if (((var7_7 /* !! */  = var1_1.h1) != null && (var25_26 = var7_7 /* !! */ .length()) != 0 || (var25_26 = (int)var1_1.z0) != 0) && (var7_7 /* !! */  = bv2_0.a2) != (var11_12 /* !! */  = kv2_0.PLP_MORE)) {
                                        var7_7 /* !! */  = var1_1.h1;
                                        if ((var7_7 /* !! */  == null || (var25_26 = var7_7 /* !! */ .length()) == 0) && (var25_26 = (int)var1_1.z0) != 0) {
                                            var1_1.h1 = var13_14;
                                        }
                                    } else {
                                        var1_1.h1 = "other";
                                        var7_7 /* !! */  = bv2_0.Z1;
                                        var1_1.i1 = var7_7 /* !! */ ;
                                    }
                                    if ((var25_26 = (int)var1_1.y) != 0) {
                                        var1_1.h1 = var13_14;
                                    }
                                    if ((var7_7 /* !! */  = var1_1.Z0) != null) {
                                        Intrinsics.checkNotNull(var7_7 /* !! */ );
                                    }
                                    if ((var25_26 = (int)var1_1.o0) != 0) {
                                        var1_1.h1 = var7_7 /* !! */  = "video";
                                    }
                                    if ((var25_26 = (int)var1_1.m1) != 0 || (var7_7 /* !! */  = bv2_0.a2) == (var11_12 /* !! */  = kv2_0.PLP_COUPON)) {
                                        var1_1.h1 = "coupon";
                                        var7_7 /* !! */  = bv2_0.Z1;
                                        var1_1.i1 = var7_7 /* !! */ ;
                                    }
                                    if ((var25_26 = (int)var1_1.n1) != 0 || (var10_11 = (int)var1_1.p1) != 0) {
                                        var11_12 /* !! */  = var25_26 != 0 ? "jio ads plp" : "jio ads lp";
                                        var1_1.h1 = var11_12 /* !! */ ;
                                        var1_1.i1 = var11_12 /* !! */  = var1_1.r1;
                                    }
                                    var11_12 /* !! */  = "<set-?>";
                                    if (var25_26 == 0 && (var25_26 = (int)var1_1.p1) == 0) {
                                        var7_7 /* !! */  = var1_1.h1;
                                        var13_14 = new StringBuilder();
                                        var13_14.append(var7_7 /* !! */ );
                                        var13_14.append(" plp screen");
                                        var7_7 /* !! */  = var13_14.toString();
                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , var11_12 /* !! */ );
                                        o72_0.a = var7_7 /* !! */ ;
                                    } else {
                                        var7_7 /* !! */  = "banner plp screen";
                                        Intrinsics.checkNotNullParameter(var7_7 /* !! */ , var11_12 /* !! */ );
                                        o72_0.a = var7_7 /* !! */ ;
                                    }
                                    var7_7 /* !! */  = var1_1.t1;
                                    if (var7_7 /* !! */  != null && (var25_26 = var7_7 /* !! */ .length()) != 0) {
                                        var1_1.h1 = "widget";
                                        var7_7 /* !! */  = var1_1.A1;
                                        var25_26 = (int)Intrinsics.areEqual(var7_7 /* !! */ , "CURATED_WIDGET");
                                        var13_14 = "_";
                                        if (var25_26 != 0) {
                                            var7_7 /* !! */  = var1_1.D1;
                                            var14_15 = var1_1.C1;
                                            var18_19 = "cw_";
                                            var1_1.i1 = var7_7 /* !! */  = UX.c((String)var18_19, var7_7 /* !! */ , (String)var13_14, (String)var14_15);
                                        } else {
                                            var7_7 /* !! */  = var1_1.u1;
                                            var14_15 = "USER";
                                            var25_26 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var14_15);
                                            var7_7 /* !! */  = var25_26 != 0 ? "user_level" : "dynamic";
                                            var14_15 = "widget plp screen";
                                            Intrinsics.checkNotNullParameter(var14_15, var11_12 /* !! */ );
                                            o72_0.a = var14_15;
                                            var14_15 = var1_1.x1;
                                            var1_1.i1 = var7_7 /* !! */  = n1.a(var7_7 /* !! */ , (String)var13_14, (String)var14_15);
                                        }
                                    }
                                    var7_7 /* !! */  = var1_1.K0;
                                    var13_14 = "brand plp screen";
                                    if (var7_7 /* !! */  != null && (var25_26 = var7_7 /* !! */ .length()) != 0 && (var7_7 /* !! */  = var1_1.L0) != null && (var25_26 = var7_7 /* !! */ .length()) != 0) {
                                        var1_1.h1 = var7_7 /* !! */  = var1_1.K0;
                                        var1_1.i1 = var7_7 /* !! */  = var1_1.L0;
                                        Intrinsics.checkNotNullParameter(var13_14, var11_12 /* !! */ );
                                        o72_0.a = var13_14;
                                    }
                                    if ((var7_7 /* !! */  = var1_1.Q0) != null && (var25_26 = var7_7 /* !! */ .length()) != 0 && (var7_7 /* !! */  = var1_1.R0) != null && (var25_26 = var7_7 /* !! */ .length()) != 0) {
                                        var1_1.h1 = var7_7 /* !! */  = var1_1.Q0;
                                        var1_1.i1 = var7_7 /* !! */  = var1_1.R0;
                                    }
                                    if ((var7_7 /* !! */  = var1_1.M) != null) {
                                        var7_7 /* !! */  = var7_7 /* !! */ .getResponseSource();
                                    } else {
                                        var25_26 = 0;
                                        var7_7 /* !! */  = null;
                                    }
                                    var1_1.U0 = var7_7 /* !! */  = String.valueOf(var7_7 /* !! */ );
                                    var25_26 = (int)var1_1.x;
                                    if (var25_26 != 0) return;
                                    var7_7 /* !! */  = var1_1.M;
                                    if (var7_7 /* !! */  != null) {
                                        var7_7 /* !! */  = var7_7 /* !! */ .getFreeTextSearch();
                                    } else {
                                        var25_26 = 0;
                                        var7_7 /* !! */  = null;
                                    }
                                    if (var7_7 /* !! */  == null) return;
                                    var25_26 = var7_7 /* !! */ .length();
                                    if (var25_26 == 0) {
                                        return;
                                    }
                                    var1_1.x = var2_2;
                                    var14_15 = var1_1.h1;
                                    var18_19 = var1_1.i1;
                                    var7_7 /* !! */  = var1_1.P;
                                    if (var7_7 /* !! */  != null) {
                                        var25_26 = var7_7 /* !! */ .getTotalResults();
                                        var20_21 = var7_7 /* !! */  = Integer.valueOf(var25_26);
                                    } else {
                                        var24_25 = 0;
                                        var20_21 = null;
                                    }
                                    var7_7 /* !! */  = var1_1.M;
                                    if (var7_7 /* !! */  != null) {
                                        var7_7 /* !! */  = var7_7 /* !! */ .getProducts();
                                    } else {
                                        var25_26 = 0;
                                        var7_7 /* !! */  = null;
                                    }
                                    var22_23 = "category";
                                    var21_22 = E1.a("ecomm_pageType", (String)var22_23);
                                    if (var7_7 /* !! */  == null) break block129;
                                    var22_23 = var7_7 /* !! */ ;
                                    var22_23 = (Iterable)var7_7 /* !! */ ;
                                    var25_26 = var7_7 /* !! */ .size();
                                    if (var25_26 > (var3_3 = 3)) {
                                        var25_26 = 3;
                                    }
                                    var7_7 /* !! */  = CollectionsKt.f0((Iterable)var22_23, var25_26);
                                    var4_4 = new ArrayList();
                                    var7_7 /* !! */  = (Iterable)var7_7 /* !! */ ;
                                    var22_23 = var7_7 /* !! */ .iterator();
                                    var28_28 = var26_27 = 0.0;
                                    while ((var25_26 = (int)var22_23.hasNext()) != 0) {
                                        block131: {
                                            block130: {
                                                block123: {
                                                    block122: {
                                                        block121: {
                                                            var7_7 /* !! */  = (Product)var22_23.next();
                                                            var30_29 = var7_7 /* !! */ .getCode();
                                                            if (var30_29 != null) {
                                                                var4_4.add(var30_29);
                                                            }
                                                            try {
                                                                var30_29 = var7_7 /* !! */ .getPrice();
                                                                if (var30_29 == null) break block121;
                                                                var30_29 = var30_29.getValue();
                                                                break block122;
                                                            }
                                                            catch (NumberFormatException var7_8) {
                                                                break block123;
                                                            }
                                                        }
                                                        var2_2 = 0;
                                                        var30_29 = null;
                                                    }
                                                    if (var30_29 == null || (var7_7 /* !! */  = var7_7 /* !! */ .getPrice()) == null || (var7_7 /* !! */  = var7_7 /* !! */ .getValue()) == null) break block130;
                                                    var31_30 = Double.parseDouble(var7_7 /* !! */ );
                                                    break block131;
                                                }
                                                var30_29 = yn3_0.a;
                                                var30_29.e(var7_8);
                                            }
                                            var31_30 = var26_27;
                                        }
                                        var28_28 += var31_30;
                                        var2_2 = 1;
                                    }
                                    var7_7 /* !! */  = new Gson();
                                    var7_7 /* !! */  = var7_7 /* !! */ .toJson(var4_4);
                                    var21_22.putString("ecomm_prodid", var7_7 /* !! */ );
                                    var7_7 /* !! */  = "ecomm_total_value";
                                    var30_29 = String.valueOf(var28_28);
                                    var21_22.putString(var7_7 /* !! */ , (String)var30_29);
                                }
                                var7_7 /* !! */  = h40_0.a;
                                var25_26 = (int)h40_0.z1();
                                if (var25_26 != 0 && (var25_26 = (int)bv2_0.b2) != 0) {
                                    var7_7 /* !! */  = "user_search_term";
                                    var21_22.putString(var7_7 /* !! */ , (String)var9_10);
                                }
                                var7_7 /* !! */  = "search_term";
                                var21_22.putString(var7_7 /* !! */ , (String)var9_10);
                                var30_29 = "plp_page_title";
                                if (var9_10 != null && (var3_3 = var9_10.length()) != 0) {
                                    var21_22.putString((String)var30_29, (String)var9_10);
                                }
                                if (var19_20 != null && (var3_3 = var19_20.length()) != 0) {
                                    var21_22.putString(var7_7 /* !! */ , var19_20);
                                }
                                var4_4 = "plp_category_id";
                                if (var16_17 != null && (var33_31 = var16_17.length()) != 0) {
                                    var22_23 = var1_1.m0;
                                    var21_22.putString((String)var4_4, (String)var22_23);
                                }
                                var22_23 = "plp_source_details";
                                if (var18_19 != null && (var34_32 = var18_19.length()) != 0) {
                                    var21_22.putString((String)var22_23, (String)var18_19);
                                }
                                var18_19 = "number_results";
                                if (var20_21 != null) {
                                    var24_25 = var20_21.intValue();
                                    var21_22.putInt((String)var18_19, var24_25);
                                }
                                if ((var20_21 = var1_1.L) != null) {
                                    Intrinsics.checkNotNull(var20_21);
                                    var24_25 = var20_21.intValue();
                                    var34_32 = 1;
                                    var35_33 = var18_19;
                                    var18_19 = "auto_suggestion_index";
                                    var21_22.putInt((String)var18_19, ++var24_25);
                                } else {
                                    var35_33 = var18_19;
                                }
                                var18_19 = var1_1.M;
                                if (var18_19 != null) {
                                    var18_19 = var18_19.getPlpExtendedBanner();
                                } else {
                                    var36_34 = false;
                                    var18_19 = null;
                                }
                                var20_21 = "banner_theme_extended";
                                var37_35 = var6_6;
                                var6_6 = "no";
                                var38_36 = var30_29;
                                var30_29 = "yes";
                                if (var18_19 == null) ** GOTO lbl-1000
                                var36_34 = false;
                                var18_19 = null;
                                var39_37 = var1_1.v(false);
                                if (!var39_37 && (var36_34 = h40_0.G1())) {
                                    var21_22.putString((String)var20_21, (String)var30_29);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var21_22.putString((String)var20_21, (String)var6_6);
                                }
                                var18_19 = this.k();
                                var20_21 = "Search";
                                var40_38 = var9_10;
                                var9_10 = "Search|";
                                var41_39 = var7_7 /* !! */ ;
                                var7_7 /* !! */  = "type_of_redirection";
                                var42_40 = var19_20;
                                var19_20 = "redirection";
                                if (var18_19 == null) break block132;
                                var18_19 = this.k();
                                var43_41 = ProductsList.Companion;
                                var44_42 = var4_4;
                                var4_4 = var43_41.getSEARCH_PAGE();
                                var43_41 = var16_17;
                                var15_16 = true;
                                var3_3 = (int)kotlin.text.b.i((String)var18_19, (String)var4_4, var15_16);
                                if (var3_3 == 0) break block133;
                                var2_2 = h40_0.z1();
                                if (var2_2 != 0 && (var2_2 = bv2_0.b2) != 0) {
                                    var21_22.putString(var19_20, (String)var6_6);
                                    var30_29 = var1_1.U0;
                                    k01_0.a((String)var9_10, (String)var30_29, (Bundle)var21_22, var7_7 /* !! */ );
                                    break block124;
                                } else {
                                    var21_22.putString(var19_20, (String)var6_6);
                                    var21_22.putString(var7_7 /* !! */ , (String)var20_21);
                                }
                                break block124;
                            }
                            var44_42 = var4_4;
                            var43_41 = var16_17;
                        }
                        if ((var4_4 = this.k()) != null && (var3_3 = (int)kotlin.text.b.i((String)(var4_4 = this.k()), (String)(var16_17 = ProductsList.Companion.getCATEGORY_PAGE()), var36_34 = true)) != 0) {
                            var3_3 = (int)h40_0.z1();
                            if (var3_3 != 0 && (var3_3 = (int)bv2_0.b2) != 0) {
                                var21_22.putString(var19_20, (String)var30_29);
                                var30_29 = var1_1.U0;
                                var4_4 = "c|";
                                k01_0.a((String)var4_4, (String)var30_29, (Bundle)var21_22, var7_7 /* !! */ );
                            } else {
                                var21_22.putString(var19_20, (String)var30_29);
                                var30_29 = "c";
                                var21_22.putString(var7_7 /* !! */ , (String)var30_29);
                            }
                        } else {
                            var4_4 = this.k();
                            if (var4_4 != null && (var3_3 = (int)kotlin.text.b.i((String)(var4_4 = this.k()), (String)(var16_17 = ProductsList.Companion.getCURATED_PAGE()), var36_34 = true)) != 0) {
                                var3_3 = (int)h40_0.z1();
                                if (var3_3 != 0 && (var3_3 = (int)bv2_0.b2) != 0) {
                                    var21_22.putString(var19_20, (String)var30_29);
                                    var30_29 = var1_1.U0;
                                    var4_4 = "s|";
                                    k01_0.a((String)var4_4, (String)var30_29, (Bundle)var21_22, var7_7 /* !! */ );
                                } else {
                                    var21_22.putString(var19_20, (String)var30_29);
                                    var30_29 = "s";
                                    var21_22.putString(var7_7 /* !! */ , (String)var30_29);
                                }
                            } else {
                                var4_4 = this.k();
                                if (var4_4 != null && (var3_3 = (int)kotlin.text.b.i((String)(var4_4 = this.k()), (String)(var16_17 = ProductsList.Companion.getBRAND_PAGE()), var36_34 = true)) != 0) {
                                    var3_3 = (int)h40_0.z1();
                                    if (var3_3 != 0 && (var3_3 = (int)bv2_0.b2) != 0) {
                                        var21_22.putString(var19_20, (String)var30_29);
                                        var30_29 = var1_1.U0;
                                        var4_4 = "b|";
                                        k01_0.a((String)var4_4, (String)var30_29, (Bundle)var21_22, var7_7 /* !! */ );
                                    } else {
                                        var21_22.putString(var19_20, (String)var30_29);
                                        var30_29 = "b";
                                        var21_22.putString(var7_7 /* !! */ , (String)var30_29);
                                    }
                                } else {
                                    var2_2 = h40_0.z1();
                                    if (var2_2 != 0 && (var2_2 = bv2_0.b2) != 0) {
                                        var21_22.putString(var19_20, (String)var6_6);
                                        var30_29 = var1_1.U0;
                                        k01_0.a((String)var9_10, (String)var30_29, (Bundle)var21_22, var7_7 /* !! */ );
                                    } else {
                                        var21_22.putString(var19_20, (String)var6_6);
                                        var21_22.putString(var7_7 /* !! */ , (String)var20_21);
                                    }
                                }
                            }
                        }
                    }
                    var7_7 /* !! */  = "plp_source";
                    if (var14_15 != null && (var2_2 = var14_15.length()) != 0) {
                        var21_22.putString(var7_7 /* !! */ , (String)var14_15);
                    }
                    var30_29 = new Bundle();
                    var1_1.s0 = var30_29;
                    var30_29.putAll((Bundle)var21_22);
                    var2_2 = (int)this.c();
                    if (var2_2 != 0) {
                        var30_29 = var1_1.t;
                        var4_4 = "plp screen";
                        var6_6 = "screen_type";
                        if (var30_29 != null) {
                            var21_22.putString((String)var6_6, (String)var4_4);
                            Intrinsics.checkNotNullParameter(var13_14, var11_12 /* !! */ );
                            o72_0.a = var13_14;
                        } else {
                            var21_22.putString((String)var6_6, (String)var4_4);
                        }
                    }
                    if ((var2_2 = (int)Intrinsics.areEqual(var30_29 = var1_1.M0, var4_4 = Boolean.TRUE)) != 0) {
                        var30_29 = "fleek curated plp screen ";
                        Intrinsics.checkNotNullParameter(var30_29, var11_12 /* !! */ );
                        o72_0.a = var30_29;
                    }
                    if ((var30_29 = var1_1.I0) != null && (var2_2 = var30_29.length()) > 0) {
                        var30_29 = "akamai_personalization";
                        var4_4 = var1_1.I0;
                        var21_22.putString((String)var30_29, (String)var4_4);
                    }
                    var2_2 = (int)og1_1.c();
                    var2_2 = var1_1.v((boolean)var2_2);
                    var4_4 = "sale price not revealed";
                    var6_6 = "bbs_widget";
                    var9_10 = "bbs_widget_state";
                    if (var2_2 == 0) break block134;
                    var21_22.putString((String)var6_6, "visible");
                    var30_29 = tr2_2.a;
                    var30_29 = tr2_2.e();
                    var21_22.putString("bbs_widget_title", (String)var30_29);
                    var30_29 = CustomerStoreType.a;
                    var30_29 = od3_2.a();
                    var6_6 = ScreenType.SCREEN_PLP;
                    var30_29 = CustomerStoreType.a((String)var30_29, (ScreenType)var6_6);
                    var45_43 = (int)tr2_2.p(og1_1.c());
                    var11_12 /* !! */  = "sale price revealed";
                    if (var45_43 == 0) break block135;
                    var6_6 = tr2_2.b;
                    var45_43 = (int)var6_6.n();
                    if (var45_43 != 0) {
                        var21_22.putString((String)var9_10, var11_12 /* !! */ );
                        break block125;
                    } else {
                        var45_43 = (int)ww0_2.c();
                        if (var45_43 != 0 && (var2_2 = mz3_0.y((String)var30_29)) != 0) {
                            var21_22.putString((String)var9_10, var11_12 /* !! */ );
                            break block125;
                        } else {
                            var21_22.putString((String)var9_10, (String)var4_4);
                        }
                    }
                    break block125;
                }
                var21_22.putString((String)var9_10, var11_12 /* !! */ );
                break block125;
            }
            var30_29 = tr2_2.a;
            var2_2 = tr2_2.w(og1_1.c());
            if (var2_2 != 0) {
                var30_29 = "not visible";
                var21_22.putString((String)var6_6, (String)var30_29);
                var21_22.putString((String)var9_10, (String)var4_4);
            }
        }
        var30_29 = CustomerStoreType.a;
        var30_29 = var1_1.Z0;
        var4_4 = od3_2.a();
        if (var30_29 == null || (var45_43 = var30_29.length()) == 0) {
            var30_29 = var4_4;
        }
        if ((var3_3 = (int)Intrinsics.areEqual(var30_29, var4_4 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
            var30_29 = "rilfnl";
        }
        var4_4 = ScreenType.SCREEN_PLP;
        var30_29 = CustomerStoreType.a((String)var30_29, (ScreenType)var4_4);
        if (var30_29 != null && (var3_3 = var30_29.length()) != 0) {
            var4_4 = "user_personalization_bucket";
            var21_22.putString((String)var4_4, (String)var30_29);
        }
        var30_29 = String.valueOf(var1_1.q1);
        var4_4 = "jio_ads_enabled";
        var21_22.putString((String)var4_4, (String)var30_29);
        var30_29 = "number_of_items_on_cart";
        var46_44 = var5_5.d();
        var21_22.putInt((String)var30_29, var46_44);
        var2_2 = h40_0.V0();
        if (var2_2 != 0) {
            var30_29 = AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp();
            var5_5 = var1_1.J0;
            var30_29.addCohortLInkData((Bundle)var21_22, (String)var5_5);
        }
        var14_15 = new Bundle();
        var30_29 = var1_1.h1;
        var14_15.putString(var7_7 /* !! */ , (String)var30_29);
        var7_7 /* !! */  = var1_1.i1;
        if (var7_7 /* !! */  == null) ** GOTO lbl-1000
        Intrinsics.checkNotNull(var7_7 /* !! */ );
        var25_26 = var7_7 /* !! */ .length();
        var2_2 = 100;
        if (var25_26 > var2_2) {
            var7_7 /* !! */  = var1_1.i1;
            if (var7_7 /* !! */  != null) {
                var46_44 = 0;
                var5_5 = null;
                var7_7 /* !! */  = var7_7 /* !! */ .substring(0, var2_2);
                var30_29 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , (String)var30_29);
            } else {
                var25_26 = 0;
                var7_7 /* !! */  = null;
            }
            var14_15.putString((String)var22_23, var7_7 /* !! */ );
        } else lbl-1000:
        // 2 sources

        {
            var7_7 /* !! */  = var1_1.i1;
            var14_15.putString((String)var22_23, var7_7 /* !! */ );
        }
        var7_7 /* !! */  = var1_1.S0;
        if (var7_7 /* !! */  != null) {
            var30_29 = "dress_tool_ingress";
            var14_15.putString((String)var30_29, var7_7 /* !! */ );
        }
        var16_17 = var43_41;
        var7_7 /* !! */  = var44_42;
        var14_15.putString((String)var44_42, (String)var43_41);
        var7_7 /* !! */  = var41_39;
        var19_20 = var42_40;
        var14_15.putString(var41_39, var42_40);
        var7_7 /* !! */  = var38_36;
        var9_10 = var40_38;
        var14_15.putString((String)var38_36, (String)var40_38);
        var30_29 = var37_35;
        var14_15.putString("business_plp_type", var37_35);
        var7_7 /* !! */  = var1_1.P;
        if (var7_7 /* !! */  != null) {
            var25_26 = var7_7 /* !! */ .getTotalResults();
            var7_7 /* !! */  = Integer.valueOf(var25_26);
        } else {
            var25_26 = 0;
            var7_7 /* !! */  = null;
        }
        var7_7 /* !! */  = String.valueOf(var7_7 /* !! */ );
        var30_29 = var35_33;
        var14_15.putString((String)var35_33, var7_7 /* !! */ );
        var25_26 = (int)var1_1.q1;
        var7_7 /* !! */  = String.valueOf((boolean)var25_26);
        var14_15.putString((String)var4_4, var7_7 /* !! */ );
        var9_10 = o72_0.a;
        var7_7 /* !! */  = AnalyticsManager.Companion;
        var13_14 = bv_0.a((AnalyticsManager$Companion)var7_7 /* !! */ );
        var16_17 = cv_0.a((AnalyticsManager$Companion)var7_7 /* !! */ );
        var6_6 = var1_1.g1;
        var11_12 /* !! */  = "plp screen";
        var6_6.newPushCustomScreenView((String)var9_10, var11_12 /* !! */ , (String)var13_14, (Bundle)var14_15, (String)var16_17);
        var30_29 = var7_7 /* !! */ .getInstance().getGtmEvents();
        var4_4 = o72_0.a;
        var30_29.pushOpenScreenEvent((String)var4_4, (Bundle)var21_22);
        var30_29 = new HashMap();
        var4_4 = var1_1.Q0;
        var5_5 = "Name";
        if (var4_4 != null && (var3_3 = var4_4.length()) != 0) {
            var4_4 = var1_1.Q0;
            var30_29.put(var5_5, var4_4);
            var4_4 = "redirection_url";
            var5_5 = var1_1.T0;
            var30_29.put(var4_4, var5_5);
        } else {
            var4_4 = var1_1.M;
            var14_15 = var4_4 != null ? var4_4.getFreeTextSearch() : null;
            var30_29.put(var5_5, var14_15);
        }
        var7_7 /* !! */  = var7_7 /* !! */ .getInstance().getCt();
        var4_4 = new AnalyticsData$Builder();
        var30_29 = var4_4.eventMap((HashMap)var30_29).build();
        var7_7 /* !! */ .plpViewed((AnalyticsData)var30_29);
    }

    public final void E(List list) {
        bv2_0 bv2_02 = this;
        int n3 = 1;
        if (list == null) {
            return;
        }
        ArrayList arrayList = this.X1;
        arrayList.clear();
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            int n4;
            Object object = list;
            object = ((Iterable)list).iterator();
            while ((n4 = object.hasNext()) != 0) {
                int n7;
                String string2;
                String string3;
                int n8;
                Object object2;
                Facet facet;
                Object object3;
                Object object4;
                Iterator iterator;
                block19: {
                    boolean bl3;
                    iterator = (ProductQuickFilterItem)object.next();
                    object4 = ((ProductQuickFilterItem)((Object)iterator)).getCode();
                    object3 = bv2_02.G.iterator();
                    while (bl3 = object3.hasNext()) {
                        facet = (Facet)object3.next();
                        object2 = facet.getCode();
                        n8 = kotlin.text.b.i((String)object2, (String)object4, n3 != 0);
                        if (n8 == 0) continue;
                        break block19;
                    }
                    bl3 = false;
                    facet = null;
                }
                if ((object4 = ((ProductQuickFilterItem)((Object)iterator)).getValues()) == null) continue;
                if (facet != null) {
                    object2 = facet.getCode();
                    string3 = object2;
                } else {
                    string3 = null;
                }
                if (facet != null) {
                    object2 = facet.getName();
                    string2 = object2;
                } else {
                    string2 = null;
                }
                int n10 = 0;
                String string4 = null;
                int n14 = 0;
                Object object5 = null;
                JSONObject jSONObject = null;
                boolean bl4 = false;
                String string5 = null;
                int n15 = 831;
                object2 = object3;
                object3 = new Facet(false, false, null, null, null, null, string3, string2, null, null, n15, null);
                object2 = new ArrayList();
                ((Facet)object3).setValues((ArrayList)object2);
                object2 = h40_0.a;
                iterator = ((ProductQuickFilterItem)((Object)iterator)).getCode();
                object2 = h40_0.h0().optJSONArray("priority");
                boolean bl5 = false;
                Object object6 = null;
                if (object2 != null) {
                    n10 = object2.length();
                    object5 = null;
                    for (n14 = 0; n14 < n10; n14 += n3) {
                        jSONObject = object2.optJSONObject(n14);
                        if (jSONObject == null || !(bl4 = kotlin.text.b.i(string5 = jSONObject.optString("code"), (String)((Object)iterator), n3 != 0))) continue;
                        iterator = "count";
                        n4 = jSONObject.optInt((String)((Object)iterator));
                        break;
                    }
                } else {
                    n4 = 0;
                    iterator = null;
                }
                n8 = object4.size();
                if (n4 > n8) {
                    n4 = object4.size();
                }
                iterator = object4.subList(0, n4);
                object4 = new HashSet();
                object2 = new ArrayList();
                iterator = iterator.iterator();
                while (bl5 = iterator.hasNext()) {
                    object6 = iterator.next();
                    string4 = object6;
                    string4 = (String)object6;
                    object5 = Locale.ROOT;
                    string4 = string4.toLowerCase((Locale)object5);
                    object5 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(string4, (String)object5);
                    n10 = (int)(((HashSet)object4).add(string4) ? 1 : 0);
                    if (n10 == 0) continue;
                    ((ArrayList)object2).add(object6);
                }
                iterator = ((ArrayList)object2).iterator();
                while ((n7 = iterator.hasNext()) != 0) {
                    object4 = (String)iterator.next();
                    if (facet != null && (object2 = facet.getValues()) != null) {
                        object2 = object2.iterator();
                        while (bl5 = object2.hasNext()) {
                            object6 = (FacetValue)object2.next();
                            string4 = ((FacetValue)object6).getCode();
                            n10 = (int)(kotlin.text.b.i(string4, (String)object4, n3 != 0) ? 1 : 0);
                            if (n10 == 0) continue;
                            break;
                        }
                    } else {
                        bl5 = false;
                        object6 = null;
                    }
                    if (object6 == null) continue;
                    object4 = ((Facet)object3).getValues();
                    if (object4 != null) {
                        ((ArrayList)object4).add(object6);
                    }
                    if ((object4 = ((FacetValue)object6).getFacetCode()) == null || (n7 = ((String)object4).length()) == 0) {
                        object4 = ((Facet)object3).getCode();
                        ((FacetValue)object6).setFacetCode((String)object4);
                    }
                    ((FacetValue)object6).setQuickFilter(n3 != 0);
                    arrayList.add(object6);
                }
            }
        }
    }

    public final void F(ArrayList object, Integer serializable) {
        int n3;
        ArrayList arrayList = this.S1;
        int n4 = arrayList.isEmpty();
        if (n4 != 0 || serializable != null && (n3 = ((Integer)serializable).intValue()) == 0) {
            boolean bl2;
            boolean bl3;
            serializable = this.U1;
            ((HashMap)serializable).clear();
            arrayList.clear();
            Object object2 = h40_0.a;
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            Object object3 = "android_slp_visual_gender_filter_min_item_count";
            n4 = ((ao0_0)object2).g((String)object3);
            if (object != null && !(bl3 = this.c())) {
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    boolean bl4;
                    int n7;
                    object3 = (Facet)object.next();
                    ArrayList<Object> arrayList2 = ((Facet)object3).getValues();
                    if (arrayList2 == null) continue;
                    arrayList2 = ((Facet)object3).getValues();
                    Intrinsics.checkNotNull(arrayList2);
                    int n8 = arrayList2.size();
                    if (n8 < (n7 = 2)) continue;
                    arrayList2 = new ArrayList<Object>();
                    Object object4 = ((Facet)object3).getValues();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ArrayList)object4).iterator();
                    Object object5 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    while (bl4 = object4.hasNext()) {
                        object5 = object4.next();
                        String string2 = "next(...)";
                        Intrinsics.checkNotNullExpressionValue(object5, string2);
                        int n10 = ((FacetValue)(object5 = (FacetValue)object5)).getCount();
                        if (n10 <= n4) continue;
                        arrayList2.add(object5);
                    }
                    int n14 = arrayList2.size();
                    if (n14 < n7) continue;
                    String string3 = ((Facet)object3).getCode();
                    if (string3 != null) {
                        string3 = ((Facet)object3).getCode();
                        if (string3 == null) {
                            string3 = "";
                        }
                        ((HashMap)serializable).put(string3, arrayList2);
                    }
                    arrayList.add(object3);
                }
            }
            if ((object = this.T1) != null) {
                ((ArrayList)object).addAll(arrayList);
            }
            this.R1 = bl2 = ((HashMap)serializable).isEmpty() ^ true;
        }
    }

    public final boolean G(int n3) {
        int n4;
        block13: {
            String string2;
            block12: {
                int n7;
                String string3;
                block9: {
                    block11: {
                        block10: {
                            string3 = od3_2.a;
                            n4 = string3.length();
                            if (n4 == 0) {
                                string3 = od3_2.a();
                            }
                            string2 = ld3_2.STORE_LUXE.getStoreId();
                            n7 = Intrinsics.areEqual(string3, string2);
                            n4 = 1;
                            if (n7 == 0) break block9;
                            n3 = this.s();
                            if (n3 <= 0 || (n3 = (int)(this.i() ? 1 : 0)) == 0 || (n3 = (int)(this.R1 ? 1 : 0)) == 0) break block10;
                            n3 = this.H1 + n4;
                            n7 = this.s();
                            int n8 = this.Q1;
                            if ((n3 %= (n7 = n7 <= n4 ? n8 : this.s())) != 0) break block10;
                            n3 = this.H1;
                            n7 = this.s();
                            if (n7 > n4) {
                                n8 = this.s();
                            }
                            n7 = this.P1;
                            if ((n3 /= n8) < n7) break block11;
                        }
                        n4 = 0;
                        string2 = null;
                    }
                    return n4 != 0;
                }
                string3 = this.V1;
                String string4 = "A";
                n7 = Intrinsics.areEqual(string3, string4);
                if (n7 != 0) {
                    n3 = this.I1;
                }
                if ((n7 = this.s()) <= 0) break block12;
                n7 = this.H1 + n4;
                int n10 = this.s();
                if ((n7 %= n10) == 0 && (n7 = this.H1 - n3) < (n3 = this.P1)) break block13;
            }
            n4 = 0;
            string2 = null;
        }
        return n4 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n3, List list) {
        cB2 cB22;
        Object object;
        int n4;
        int n7;
        int n8;
        bv2_0 bv2_02 = this;
        List list2 = list;
        int n10 = 1;
        db2_0 db2_02 = ((cB2)on_2.d((int)n10, (List)list)).b;
        db2_0 db2_03 = db2_0.IS_VISUAL_FILTER;
        if (db2_02 == db2_03) return;
        db2_0 db2_04 = db2_0.IS_FILTER_NUDGE;
        if (db2_02 == db2_04) return;
        this.H1 = n8 = this.H1 + n10;
        String string2 = this.V1;
        Object object2 = "A";
        n8 = (int)(Intrinsics.areEqual(string2, object2) ? 1 : 0);
        n8 = n8 != 0 ? this.I1 : n3;
        object2 = this.t();
        BE3 bE3 = BE3.FILTER_NUDGE;
        Object object3 = bv2_02.S1;
        if (object2 == bE3) {
            String string3;
            object2 = od3_2.a;
            n7 = ((String)object2).length();
            if (n7 == 0) {
                object2 = od3_2.a();
            }
            if ((n4 = (int)(Intrinsics.areEqual(object2, string3 = ld3_2.STORE_LUXE.getStoreId()) ? 1 : 0)) == 0) {
                Object object4;
                n7 = bv2_02.H1 - n8 - n10;
                Object object5 = object4 = CollectionsKt.N(n7, (List)object3);
                object5 = (Facet)object4;
                boolean bl2 = false;
                Object var18_24 = null;
                int n14 = 189;
                object3 = object2;
                object2 = new cB2(null, db2_04, null, null, null, null, (Facet)object5, null, n14);
                list2.add(object2);
                return;
            }
        }
        n4 = bv2_02.H1 - n8 - n10;
        Object object6 = object = CollectionsKt.N(n4, (List)object3);
        object6 = (Facet)object;
        n7 = 0;
        Object var11_14 = null;
        object3 = null;
        db2_04 = null;
        int n15 = 189;
        object2 = cB22;
        cB22 = new cB2(null, db2_03, null, null, null, null, (Facet)object6, null, n15);
        list2.add(cB22);
    }

    public final void b(String string2) {
        Object object;
        Object object2 = string2;
        Object object3 = "category:8302";
        HashMap<Object, String> hashMap = null;
        boolean bl2 = StringsKt.F(string2, (CharSequence)object3, false);
        Object object4 = "8302";
        if (!(bl2 || (bl2 = StringsKt.F(string2, (CharSequence)(object = "category:8303"), false)) || (bl2 = kotlin.text.b.s(string2, (String)object4, false)) || (bl2 = kotlin.text.b.s(string2, (String)(object = "8303"), false)))) {
            object = this;
        } else {
            boolean bl3;
            boolean bl4 = StringsKt.F((CharSequence)object2, (CharSequence)object3, false);
            if (!bl4 && !(bl3 = kotlin.text.b.s((String)object2, (String)object4, false))) {
                object2 = "Women";
                object3 = "/shop/women";
            } else {
                object2 = "Men";
                object3 = "/shop/men";
            }
            object = this;
            object4 = this.v;
            ((sw_0)object4).putPreference("CORE_CATEGORY_NAME", (String)object2);
            ((sw_0)object4).putPreference("CORE_CATEGORY_ID", (String)object3);
            object3 = AnalyticsManager.Companion;
            ((AnalyticsManager$Companion)object3).getInstance().getCt().pushCategorySelectionData(null);
            hashMap = new HashMap<Object, String>();
            object2 = ((String)object2).concat("_core");
            object4 = "Name";
            hashMap.put(object4, (String)object2);
            object2 = ((AnalyticsManager$Companion)object3).getInstance().getCt();
            long l2 = 0L;
            int n3 = 65279;
            object3 = new AnalyticsData(null, null, null, l2, null, null, null, null, hashMap, null, null, null, null, null, null, null, n3, null);
            ((CleverTapEvents)object2).categoryAutoSet((AnalyticsData)object3);
        }
    }

    public final boolean c() {
        String string2 = this.l();
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        return Intrinsics.areEqual(string2, string3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final ArrayList e(ImmutableList var1_1, PlpExtendedBanner var2_2, boolean var3_3, String var4_4, boolean var5_5, boolean var6_6, boolean var7_7, List var8_8, List var9_9) {
        block58: {
            block57: {
                block56: {
                    block53: {
                        block50: {
                            block54: {
                                block55: {
                                    block52: {
                                        var10_10 = this;
                                        var11_11 = var1_1;
                                        var12_12 = var9_9;
                                        Intrinsics.checkNotNullParameter(var1_1, "productList");
                                        var13_13 /* !! */  = "bannerAdList";
                                        Intrinsics.checkNotNullParameter(var9_9, var13_13 /* !! */ );
                                        this.L1 = var9_9;
                                        this.M1 = var14_14 = var9_9.size();
                                        var14_14 = this.J1;
                                        var15_15 = -1;
                                        var16_16 = this.B0;
                                        var17_17 = "A";
                                        var18_18 = this.V1;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var21_21 = 1;
                                        if (var14_14 == 0 || var14_14 >= (var22_22 = var1_1.size())) break block52;
                                        var11_11 = var18_18;
                                        break block53;
                                    }
                                    var10_10.J1 = 0;
                                    var10_10.H1 = 0;
                                    var10_10.I1 = 0;
                                    var12_12 = new ArrayList();
                                    var10_10.G1 = var12_12;
                                    var12_12 = new ArrayList();
                                    var10_10.T1 = var12_12;
                                    var12_12 = var10_10.N1;
                                    var12_12.clear();
                                    var14_14 = (int)Intrinsics.areEqual(var18_18, var17_17);
                                    var14_14 = var14_14 != 0 ? this.g() : this.g() + var16_16;
                                    var10_10.A0 = var14_14;
                                    var10_10.G0 = 0;
                                    var14_14 = var16_16 > 0 ? var16_16 : this.g() - var21_21;
                                    var10_10.H0 = var14_14;
                                    var10_10.F0 = var15_15;
                                    if (var7_7) {
                                        var12_12 = var10_10.G1;
                                        var23_23 = db2_0.IS_IMAGE_SEARCH;
                                        var24_24 = null;
                                        var25_25 = 0;
                                        var26_26 = null;
                                        var27_27 = null;
                                        var28_28 = 253;
                                        var13_13 /* !! */  = new cB2(null, var23_23, null, null, null, null, null, null, var28_28);
                                        var12_12.add(var13_13 /* !! */ );
                                    }
                                    if ((var14_14 = (int)var10_10.s) != 0) {
                                        var12_12 = var10_10.r;
                                        if (var12_12 != null) {
                                            var12_12 = var12_12.getPageHeader();
                                        } else {
                                            var14_14 = 0;
                                            var12_12 = null;
                                        }
                                        if (var12_12 != null && (var14_14 = var12_12.length()) != 0) {
                                            var12_12 = var10_10.G1;
                                            var23_23 = db2_0.IS_VIDEO_BANNER;
                                            var28_28 = 253;
                                            var25_25 = 0;
                                            var26_26 = null;
                                            var27_27 = null;
                                            var24_24 = null;
                                            var13_13 /* !! */  = new cB2(null, var23_23, null, null, null, null, null, null, var28_28);
                                            var12_12.add(var13_13 /* !! */ );
                                        }
                                        var12_12 = var10_10.G1;
                                        var23_23 = db2_0.IS_SEARCH_WIDGET;
                                        var28_28 = 253;
                                        var25_25 = 0;
                                        var26_26 = null;
                                        var27_27 = null;
                                        var24_24 = null;
                                        var13_13 /* !! */  = new cB2(null, var23_23, null, null, null, null, null, null, var28_28);
                                        var12_12.add(var13_13 /* !! */ );
lbl76:
                                        // 2 sources

                                        while (true) {
                                            var11_11 = var18_18;
                                            break block50;
                                            break;
                                        }
                                    }
                                    var14_14 = (int)og1_1.c();
                                    if (var14_14 != 0) break block54;
                                    ** while (var7_7)
lbl82:
                                    // 1 sources

                                    if (var8_8 != null) {
                                        var12_12 = var10_10.G1;
                                        var23_23 = db2_0.IS_CMS_BANNER;
                                        var28_28 = 253;
                                        var25_25 = 0;
                                        var26_26 = null;
                                        var27_27 = null;
                                        var24_24 = null;
                                        var13_13 /* !! */  = new cB2(null, var23_23, null, null, null, null, null, null, var28_28);
                                        var12_12.add(var13_13 /* !! */ );
                                    }
                                    if (var2_2 == null || var3_3) ** GOTO lbl-1000
                                    var12_12 = h40_0.a;
                                    var14_14 = (int)h40_0.G1();
                                    if (var14_14 != 0 && (var14_14 = (int)bv2_0.x(var2_2)) != 0) {
                                        var29_29 = var10_10.G1;
                                        var30_30 = db2_0.IS_PLP_EXTENDED_BANNER;
                                        var25_25 = 249;
                                        var22_22 = 0;
                                        var13_13 /* !! */  = null;
                                        var32_32 = 0;
                                        var33_33 = null;
                                        var23_23 = null;
                                        var26_26 = null;
                                        var12_12 = var31_31;
                                        var34_34 /* !! */  = var2_2;
                                        var35_35 = var31_31;
                                        var36_36 = 0;
                                        var31_31 = null;
                                        var37_37 = var29_29;
                                        var38_38 = 0;
                                        var29_29 = null;
                                        var21_21 = 0;
                                        var39_39 = null;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var11_11 = var18_18;
                                        var40_40 = var25_25;
                                        var12_12 = new cB2(null, var30_30, var2_2, null, null, null, null, null, var25_25);
                                        var37_37.add(var12_12);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var11_11 = var18_18;
                                    }
                                    if (var6_6) {
                                        var12_12 = var10_10.G1;
                                        var34_34 /* !! */  = db2_0.IS_AUTO_CORRECT;
                                        var21_21 = 0;
                                        var39_39 = null;
                                        var41_41 = 253;
                                        var42_42 = 0;
                                        var30_30 = null;
                                        var32_32 = 0;
                                        var33_33 = null;
                                        var36_36 = 0;
                                        var31_31 = null;
                                        var38_38 = 0;
                                        var29_29 = null;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var40_40 = 0;
                                        var18_18 = null;
                                        var13_13 /* !! */  = var37_37;
                                        var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                                        var12_12.add(var37_37);
                                    }
                                    if (var5_5) {
                                        var12_12 = var10_10.G1;
                                        var34_34 /* !! */  = db2_0.IS_BRAND_DESCRIPTION;
                                        var21_21 = 0;
                                        var39_39 = null;
                                        var41_41 = 253;
                                        var42_42 = 0;
                                        var30_30 = null;
                                        var32_32 = 0;
                                        var33_33 = null;
                                        var36_36 = 0;
                                        var31_31 = null;
                                        var38_38 = 0;
                                        var29_29 = null;
                                        var19_19 = 0;
                                        var20_20 = null;
                                        var40_40 = 0;
                                        var18_18 = null;
                                        var13_13 /* !! */  = var37_37;
                                        var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                                        var12_12.add(var37_37);
                                    }
                                    if (var2_2 == null) break block55;
                                    var12_12 = h40_0.a;
                                    var14_14 = (int)h40_0.G1();
                                    if (var14_14 != 0) break block50;
                                }
                                if (var4_4 != null && (var14_14 = var4_4.length()) != 0) {
                                    var12_12 = var10_10.G1;
                                    var34_34 /* !! */  = db2_0.IS_NEW_USER_BANNER;
                                    var21_21 = 0;
                                    var39_39 = null;
                                    var41_41 = 245;
                                    var42_42 = 0;
                                    var30_30 = null;
                                    var32_32 = 0;
                                    var33_33 = null;
                                    var38_38 = 0;
                                    var29_29 = null;
                                    var19_19 = 0;
                                    var20_20 = null;
                                    var40_40 = 0;
                                    var18_18 = null;
                                    var13_13 /* !! */  = var37_37;
                                    var31_31 = var4_4;
                                    var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, var4_4, null, null, null, null, var41_41);
                                    var12_12.add(var37_37);
                                }
                                break block50;
                            }
                            var11_11 = var18_18;
                            var12_12 = var10_10.G1;
                            var34_34 /* !! */  = db2_0.IS_HEADER;
                            var21_21 = 0;
                            var39_39 = null;
                            var41_41 = 253;
                            var42_42 = 0;
                            var30_30 = null;
                            var32_32 = 0;
                            var33_33 = null;
                            var36_36 = 0;
                            var31_31 = null;
                            var38_38 = 0;
                            var29_29 = null;
                            var19_19 = 0;
                            var20_20 = null;
                            var40_40 = 0;
                            var18_18 = null;
                            var13_13 /* !! */  = var37_37;
                            var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                            var12_12.add(var37_37);
                            var14_14 = (int)h40_0.Q1();
                            if (var14_14 != 0) {
                                var12_12 = var10_10.G1;
                                var34_34 /* !! */  = db2_0.IS_ADDRESS_VIEW;
                                var21_21 = 0;
                                var39_39 = null;
                                var41_41 = 253;
                                var42_42 = 0;
                                var30_30 = null;
                                var32_32 = 0;
                                var33_33 = null;
                                var36_36 = 0;
                                var31_31 = null;
                                var38_38 = 0;
                                var29_29 = null;
                                var19_19 = 0;
                                var20_20 = null;
                                var40_40 = 0;
                                var18_18 = null;
                                var13_13 /* !! */  = var37_37;
                                var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                                var12_12.add(var37_37);
                            }
                            if (var3_3) {
                                var12_12 = var10_10.G1;
                                var34_34 /* !! */  = db2_0.IS_SALE_BANNER;
                                var21_21 = 0;
                                var39_39 = null;
                                var41_41 = 253;
                                var42_42 = 0;
                                var30_30 = null;
                                var32_32 = 0;
                                var33_33 = null;
                                var36_36 = 0;
                                var31_31 = null;
                                var38_38 = 0;
                                var29_29 = null;
                                var19_19 = 0;
                                var20_20 = null;
                                var40_40 = 0;
                                var18_18 = null;
                                var13_13 /* !! */  = var37_37;
                                var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                                var12_12.add(var37_37);
                            }
                            if (var2_2 != null && !var3_3) {
                                var12_12 = h40_0.a;
                                var14_14 = (int)h40_0.G1();
                                if (var14_14 != 0 && (var14_14 = (int)bv2_0.x(var2_2)) != 0) {
                                    var35_35 = var10_10.G1;
                                    var30_30 = db2_0.IS_PLP_EXTENDED_BANNER;
                                    var38_38 = 0;
                                    var29_29 = null;
                                    var40_40 = 249;
                                    var22_22 = 0;
                                    var13_13 /* !! */  = null;
                                    var32_32 = 0;
                                    var33_33 = null;
                                    var36_36 = 0;
                                    var31_31 = null;
                                    var21_21 = 0;
                                    var39_39 = null;
                                    var19_19 = 0;
                                    var20_20 = null;
                                    var12_12 = var37_37;
                                    var34_34 /* !! */  = var2_2;
                                    var37_37 = new cB2(null, var30_30, var2_2, null, null, null, null, null, var40_40);
                                    var35_35.add(var37_37);
                                }
                            }
                            if (var6_6) {
                                var12_12 = var10_10.G1;
                                var34_34 /* !! */  = db2_0.IS_AUTO_CORRECT;
                                var21_21 = 0;
                                var39_39 = null;
                                var41_41 = 253;
                                var42_42 = 0;
                                var30_30 = null;
                                var32_32 = 0;
                                var33_33 = null;
                                var36_36 = 0;
                                var31_31 = null;
                                var38_38 = 0;
                                var29_29 = null;
                                var19_19 = 0;
                                var20_20 = null;
                                var40_40 = 0;
                                var18_18 = null;
                                var13_13 /* !! */  = var37_37;
                                var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                                var12_12.add(var37_37);
                            }
                        }
                        var12_12 = h40_0.a;
                        var14_14 = (int)h40_0.M1();
                        if (var14_14 != 0 && (var14_14 = (int)this.c()) == 0) {
                            var12_12 = var10_10.G1;
                            var34_34 /* !! */  = db2_0.IS_QUICK_FILTER_WIDGET;
                            var19_19 = 0;
                            var20_20 = null;
                            var40_40 = 0;
                            var18_18 = null;
                            var42_42 = 0;
                            var30_30 = null;
                            var32_32 = 0;
                            var33_33 = null;
                            var36_36 = 0;
                            var31_31 = null;
                            var38_38 = 0;
                            var29_29 = null;
                            var21_21 = 0;
                            var39_39 = null;
                            var41_41 = 253;
                            var13_13 /* !! */  = var37_37;
                            var37_37 = new cB2(null, (db2_0)var34_34 /* !! */ , null, null, null, null, null, null, var41_41);
                            var12_12.add(var37_37);
                        }
                    }
                    var12_12 = this.t();
                    var13_13 /* !! */  = BE3.FILTER_NUDGE;
                    if (var12_12 != var13_13 /* !! */ ) break block56;
                    var14_14 = var1_1.size();
                    var22_22 = this.s();
                    var22_22 = var22_22 <= (var42_42 = 1) ? var10_10.Q1 : this.s();
                    if (var14_14 < var22_22 || (var14_14 = (int)this.c()) != 0 || (var14_14 = (int)var10_10.y) != 0) break block57;
                    var19_19 = 1;
                    break block58;
                }
                var42_42 = 1;
            }
            if ((var14_14 = (int)var10_10.R1) != 0) {
                var12_12 = var10_10.S1;
                var19_19 = var12_12.size();
            } else {
                var19_19 = 0;
                var20_20 = null;
            }
        }
        var10_10.P1 = var19_19;
        var22_22 = var1_1.size();
        for (var14_14 = var10_10.J1; var14_14 < var22_22; var14_14 += var42_42) {
            block59: {
                block62: {
                    block60: {
                        block61: {
                            block51: {
                                if (var7_7) break block59;
                                var43_43 = Intrinsics.areEqual(var11_11, var17_17);
                                var33_33 = "B";
                                var36_36 = var10_10.C0;
                                if (var43_43 != 0) {
                                    var43_43 = var10_10.I1;
                                    if (var43_43 > 0 && var43_43 == (var38_38 = var10_10.H0)) {
                                        var34_34 /* !! */  = el1_2.a;
                                        var34_34 /* !! */  = this.k();
                                        var43_43 = (int)el1_2.n((String)var34_34 /* !! */ );
                                        if (var43_43 != 0 && (var43_43 = var10_10.I1 - var14_14) < (var38_38 = var10_10.M1) && var14_14 <= var36_36) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                var19_19 = 1;
                                                break block51;
                                                break;
                                            }
                                        }
                                    }
lbl373:
                                    // 7 sources

                                    while (true) {
                                        var19_19 = 0;
                                        var20_20 = null;
                                        break block51;
                                        break;
                                    }
                                }
                                var43_43 = (int)Intrinsics.areEqual(var11_11, var33_33);
                                if (var43_43 == 0) ** GOTO lbl373
                                var43_43 = var10_10.I1;
                                var21_21 = var43_43 == var16_16 ? 1 : this.g();
                                var10_10.G0 = var21_21;
                                var43_43 = var10_10.I1;
                                if (var43_43 <= 0 || (var21_21 = var43_43 + 1) != (var38_38 = var10_10.A0) && var43_43 != var16_16) ** GOTO lbl373
                                var34_34 /* !! */  = el1_2.a;
                                var34_34 /* !! */  = this.k();
                                var43_43 = (int)el1_2.n((String)var34_34 /* !! */ );
                                if (var43_43 != 0 && (var43_43 = var10_10.I1 - var14_14) < (var38_38 = var10_10.M1) && var14_14 <= var36_36) ** break;
                                ** continue;
                                ** continue;
                            }
                            var10_10.D0 = var19_19;
                            var43_43 = (int)var10_10.G(var14_14);
                            var10_10.E0 = var43_43;
                            var43_43 = (int)Intrinsics.areEqual(var11_11, var17_17);
                            var43_43 = var43_43 != 0 ? var10_10.I1 : var14_14;
                            var36_36 = var1_1.size();
                            var29_29 = h40_0.a;
                            var29_29 = od3_2.a;
                            var21_21 = var29_29.length();
                            if (var21_21 == 0) {
                                var29_29 = od3_2.a();
                            }
                            var29_29 = (var21_21 = (int)s20.a) == 0 && (var21_21 = (int)Intrinsics.areEqual(var39_39 = od3_2.a(), var18_18 = (var20_20 = ld3_2.STORE_AJIOGRAM).getStoreId())) == 0 && (var38_38 = (int)Intrinsics.areEqual(var29_29, var39_39 = var20_20.getStoreId())) == 0 ? "PlpRatingCollection" : "PlpRatingCollectionGram";
                            var39_39 = z40_0.Companion;
                            var20_20 = AJIOApplication.Companion;
                            var39_39 = Q.a((AJIOApplication$a)var20_20, (z40$a)var39_39).a;
                            var38_38 = (int)var39_39.a((String)var29_29);
                            if (var38_38 == 0 || (var38_38 = (int)h40_0.Y1()) == 0 || (var38_38 = (int)(var29_29 = UserInformation.getInstance((Context)AJIOApplication$a.a())).isUserOnline()) == 0 || (var38_38 = (int)og1_1.c()) != 0) break block60;
                            var29_29 = z40$a.a((Context)AJIOApplication$a.a()).a;
                            var39_39 = "PlpRatingCollectionWidgetPosition";
                            var38_38 = var29_29.g((String)var39_39);
                            if (var38_38 <= var36_36) break block61;
                            var38_38 = var36_36 + 1;
                            break block62;
                        }
                        if (var43_43 == var38_38 && (var43_43 = (int)var10_10.D0) == 0 && (var43_43 = (int)var10_10.E0) == 0) break block62;
                    }
                    var38_38 = -1;
                }
                var10_10.F0 = var38_38;
                var43_43 = (int)var10_10.E0;
                if (var43_43 != 0) {
                    var34_34 /* !! */  = var10_10.G1;
                    var10_10.a(var14_14, (List)var34_34 /* !! */ );
                }
                if ((var43_43 = var10_10.K1) > 0 && (var36_36 = var10_10.I1) == var43_43) {
                    var10_10.f(var14_14, (boolean)var42_42);
                    var43_43 = var10_10.K1;
                    var10_10.A0 = var36_36 = this.g() + var43_43 + var42_42;
                    var43_43 = 0;
                    var34_34 /* !! */  = null;
                    var10_10.K1 = 0;
                } else {
                    var43_43 = 0;
                    var34_34 /* !! */  = null;
                }
                var36_36 = (int)var10_10.D0;
                if (var36_36 != 0) {
                    var36_36 = (int)Intrinsics.areEqual(var11_11, var17_17);
                    if (var36_36 != 0) {
                        var32_32 = var10_10.H0;
                        var36_36 = var10_10.A0;
                        var10_10.H0 = var32_32 += var36_36;
                        var10_10.f(var14_14, false);
                    } else {
                        var32_32 = (int)Intrinsics.areEqual(var11_11, var33_33);
                        if (var32_32 != 0) {
                            var32_32 = (int)var10_10.D0;
                            var36_36 = (int)var10_10.E0;
                            if (var32_32 == var36_36) {
                                var33_33 = var10_10.G1;
                                var10_10.a(var14_14, (List)var33_33);
                                var10_10.K1 = var32_32 = var10_10.I1 + 2;
                            } else {
                                var32_32 = var10_10.A0;
                                var36_36 = var10_10.G0;
                                var10_10.A0 = var32_32 += var36_36;
                                var10_10.f(var14_14, (boolean)var42_42);
                            }
                        }
                    }
                }
                if ((var32_32 = var10_10.F0) > 0 && var32_32 == var14_14) {
                    var33_33 = var10_10.G1;
                    var27_27 = db2_0.IS_REVIEW_BANNER;
                    var28_28 = 0;
                    var44_44 = 253;
                    var26_26 = null;
                    var24_24 = null;
                    var31_31 = new cB2(null, var27_27, null, null, null, null, null, null, var44_44);
                    var33_33.add(var31_31);
                }
                var10_10.H1 = var32_32 = var10_10.H1 + var42_42;
                var10_10.I1 = var32_32 = var10_10.I1 + var42_42;
lbl468:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var43_43 = 0;
            var34_34 /* !! */  = null;
            ** continue;
            var33_33 = var11_11;
            var11_11 = var1_1;
            var31_31 = (Product)var1_1.get(var14_14);
            var29_29 = var10_10.m(var14_14, (Product)var31_31);
            if (var31_31 != null) {
                var31_31 = var31_31.getCatalogName();
            } else {
                var36_36 = 0;
                var31_31 = null;
            }
            var39_39 = "ajioGram";
            var31_31 = Intrinsics.areEqual(var31_31, var39_39);
            var29_29.setAjiogramProduct((Boolean)var31_31);
            var36_36 = (int)Intrinsics.areEqual(var33_33, var17_17);
            if (var36_36 != 0) {
                var31_31 = var10_10.G1;
                var27_27 = db2_0.IS_PRODUCT;
                var26_26 = var39_39 = var11_11.get(var14_14);
                var26_26 = (Product)var39_39;
                var21_21 = var10_10.I1 - var42_42;
                var24_24 = var21_21;
                var28_28 = 0;
                var44_44 = 108;
                var20_20 = new cB2((Product)var26_26, var27_27, null, null, var24_24, null, null, (PlpProductUIModel)var29_29, var44_44);
                var31_31.add(var20_20);
            } else {
                var31_31 = var10_10.G1;
                var27_27 = db2_0.IS_PRODUCT;
                var26_26 = var39_39 = var11_11.get(var14_14);
                var26_26 = (Product)var39_39;
                var24_24 = var14_14;
                var28_28 = 0;
                var44_44 = 108;
                var39_39 = new cB2((Product)var26_26, var27_27, null, null, var24_24, null, null, (PlpProductUIModel)var29_29, var44_44);
                var31_31.add(var39_39);
            }
            var11_11 = var33_33;
        }
        var11_11 = var1_1;
        var14_14 = var10_10.F0;
        var45_45 = var1_1.size();
        if (var14_14 > var45_45 && (var45_45 = (int)this.u()) != 0 && (var45_45 = (int)og1_1.c()) == 0) {
            var11_11 = var10_10.G1;
            var30_30 = db2_0.IS_REVIEW_BANNER;
            var38_38 = 0;
            var29_29 = null;
            var40_40 = 253;
            var22_22 = 0;
            var13_13 /* !! */  = null;
            var43_43 = 0;
            var34_34 /* !! */  = null;
            var32_32 = 0;
            var33_33 = null;
            var36_36 = 0;
            var31_31 = null;
            var21_21 = 0;
            var39_39 = null;
            var19_19 = 0;
            var20_20 = null;
            var12_12 = var35_35;
            var35_35 = new cB2(null, var30_30, null, null, null, null, null, null, var40_40);
            var11_11.add(var35_35);
        }
        return var10_10.G1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void f(int n3, boolean bl2) {
        Integer n4;
        Serializable serializable;
        int n7;
        this.I1 = n7 = this.I1 + 1;
        String string2 = this.V1;
        Object object = "A";
        int n8 = Intrinsics.areEqual(string2, object);
        Object object2 = this.N1;
        int n10 = 10;
        if (n8 != 0) {
            n8 = this.I1 + -1;
            int n14 = this.H1 - n8 + n8;
            serializable = this.G1;
            if (n3 < n10) {
                n10 = n3;
            }
            n8 = bv2_0.d(n10, (List)((Object)serializable)) + n14;
            serializable = Integer.valueOf(n8);
            n10 = this.I1 - n3;
            n4 = n10;
            object2.put(serializable, n4);
        } else {
            n8 = this.I1 + -1;
            int n15 = this.H1 - n3 + n8;
            serializable = this.G1;
            if (n3 < n10) {
                n10 = n3;
            }
            n8 = bv2_0.d(n10, (List)((Object)serializable)) + n15;
            serializable = Integer.valueOf(n8);
            n10 = this.I1 - n3;
            n4 = n10;
            object2.put(serializable, n4);
        }
        n8 = this.I1 - n3 + -1;
        object2 = this.L1;
        int n16 = object2.size();
        if (n8 < n16) {
            Object e2;
            void var4_8;
            serializable = this.G1;
            object2 = "variantType";
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            int n17 = Intrinsics.areEqual(string2, object);
            if (n17 != 0) {
                db2_0 db2_02 = db2_0.IS_HALF_JIO_AD_BANNER;
            } else {
                object = "B";
                n7 = (int)(Intrinsics.areEqual(string2, object) ? 1 : 0);
                if (n7 != 0) {
                    db2_0 db2_03 = db2_0.IS_FULL_JIO_AD_BANNER;
                } else {
                    db2_0 db2_04 = db2_0.IS_PRODUCT;
                }
            }
            void var14_23 = var4_8;
            List list = this.L1;
            n17 = this.I1 - n3 + -1;
            Object e5 = e2 = list.get(n17);
            BannerAdData bannerAdData = (BannerAdData)e2;
            n7 = this.I1 + -1;
            Integer n18 = n7;
            n10 = 0;
            n4 = null;
            int n19 = 205;
            object2 = object;
            object = new cB2(null, (db2_0)var14_23, null, null, n18, bannerAdData, null, null, n19);
            ((ArrayList)serializable).add(object);
        }
        if (!bl2) {
            int n20;
            this.H1 = n20 = this.H1 + 1;
            boolean bl3 = this.G(n3);
            if (bl3) {
                ArrayList arrayList = this.G1;
                this.a(n3, arrayList);
            }
        }
    }

    public final int g() {
        return ((Number)this.O0.getValue()).intValue();
    }

    public final void h(ProductListQuery productListQuery, Boolean bl2) {
        Object object;
        boolean bl3;
        boolean bl4;
        bv2_0 bv2_02 = this;
        ProductListQuery productListQuery2 = productListQuery;
        Boolean bl5 = bl2;
        Object object2 = this.l();
        Object object3 = od3_2.a();
        if (object2 == null || !(bl4 = ((String)object2).length())) {
            object2 = object3;
        }
        if (bl3 = Intrinsics.areEqual(object2, object3 = ld3_2.STORE_AJIO.getStoreId())) {
            object2 = "rilfnl";
        }
        productListQuery2.setStoreId((String)object2);
        object2 = bv2_02.t;
        if (object2 != null) {
            productListQuery2.setBrandCode((String)object2);
        }
        int n3 = this.w();
        object2 = n3 != 0;
        productListQuery2.setUrgencyDriverEnabled((Boolean)object2);
        object2 = productListQuery.getWidgetRecord();
        if ((object2 == null || (object2 = productListQuery.getWidgetRecord().getWidgetID()) == null) && (object2 = bv2_02.t1) != null && (n3 = ((String)object2).length()) != 0) {
            int n4 = 1023;
            object2 = new WidgetRecord(null, null, null, null, null, null, null, null, null, null, n4, null);
            object3 = bv2_02.t1;
            if (object3 != null) {
                ((WidgetRecord)object2).setWidgetID((String)object3);
            }
            if ((object3 = bv2_02.u1) != null) {
                ((WidgetRecord)object2).setWidgetType((String)object3);
            }
            if ((object3 = bv2_02.v1) != null) {
                ((WidgetRecord)object2).setShowDefault((Boolean)object3);
            }
            if ((object3 = bv2_02.z1) != null) {
                ((WidgetRecord)object2).setWidgetFilters((String)object3);
            }
            if ((object3 = bv2_02.A1) != null) {
                ((WidgetRecord)object2).setBannerType((String)object3);
            }
            if ((object3 = bv2_02.x1) != null) {
                ((WidgetRecord)object2).setWidgetName((String)object3);
            }
            if ((object3 = bv2_02.w1) != null) {
                ((WidgetRecord)object2).setWidgetMinProdCount((String)object3);
            }
            if ((object3 = bv2_02.B1) != null) {
                ((WidgetRecord)object2).setAdapterPositionOfWidget((Integer)object3);
            }
            boolean bl6 = bv2_02.y1;
            object3 = bl6;
            ((WidgetRecord)object2).setShowViewAllWidget((Boolean)object3);
            productListQuery2.setWidgetRecord((WidgetRecord)object2);
        }
        z40_0.Companion.getClass();
        object2 = z40$a.a((Context)bv2_02.a).a;
        object3 = "plp_variant";
        Object object4 = ((ao0_0)object2).b((String)object3);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object4) ? 1 : 0);
        if (n3 == 0) {
            object2 = new HashMap();
            object3 = "Event";
            object = "PLPExperiment";
            ((HashMap)object2).put(object3, object);
            bv2_02.y((HashMap)object2);
        }
        object2 = ke0_0.a;
        int n7 = productListQuery.getCurrentPage();
        PLPRequest pLPRequest = new PLPRequest((String)object2, n7);
        object2 = bv2_02.d;
        bl4 = ((UserInformation)object2).isUserOnline();
        String string2 = ((UserInformation)object2).getCustomerUUID();
        boolean bl7 = bv2_02.l1;
        object2 = bv2_02.b;
        object3 = productListQuery;
        object2 = NewPlpRepo.getCategoryProduct$default((NewPlpRepo)object2, productListQuery, bl4, (String)object4, string2, bl7, false, false, pLPRequest, 96, null);
        object3 = new fu2_0(bv2_02, productListQuery2, bl5);
        object = new gu2_0(0, (Function1)object3);
        object3 = new hu2_1(bv2_02, productListQuery2, bl5);
        object4 = new iu2_0(0, (Function1)object3);
        object2 = ((g53_0)object2).f((o60_0)object, (o60_0)object4);
        bv2_02.j1.b((yr0_2)object2);
    }

    public final boolean i() {
        return (Boolean)this.P0.getValue();
    }

    public final int j() {
        return ((Number)this.f0.getValue()).intValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String k() {
        boolean bl2;
        Object object = this.M;
        if (object == null) return "";
        String string2 = null;
        if (object != null) {
            object = ((ProductsList)object).getPageType();
        } else {
            bl2 = false;
            object = null;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) return "";
        object = this.M;
        if (object == null) return string2;
        return ((ProductsList)object).getPageType();
    }

    public final String l() {
        int n3;
        Object object = this.N0;
        String string2 = null;
        if (object != null) {
            object = ((PLPExtras)object).H;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = object.length()) != 0) {
            object = this.N0;
            if (object == null || (object = ((PLPExtras)object).H) == null) {
                object = od3_2.a();
            }
            return object;
        }
        object = this.N0;
        if (object != null) {
            string2 = ((PLPExtras)object).e;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            object = this.N0;
            if (object == null || (object = ((PLPExtras)object).e) == null) {
                object = od3_2.a();
            }
            return object;
        }
        return od3_2.a();
    }

    /*
     * Unable to fully structure code
     */
    public final PlpProductUIModel m(int var1_1, Product var2_2) {
        block203: {
            block202: {
                block201: {
                    block200: {
                        block199: {
                            var3_3 = var1_1;
                            var4_4 = var2_2;
                            var5_5 = 2;
                            var6_6 = 2.8E-45f;
                            var7_7 = 1;
                            var8_8 = "shortText";
                            var10_10 = var9_9;
                            var11_11 = -1;
                            var12_12 = -1;
                            var13_13 = 0;
                            var14_14 = 0;
                            var15_15 = null;
                            var16_16 = 0;
                            var17_17 = null;
                            var18_18 = 0;
                            var19_19 = 0.0f;
                            var20_20 = null;
                            var21_21 = 0;
                            var22_22 = 0.0f;
                            var23_23 = null;
                            var24_24 = 0;
                            var25_25 = null;
                            var26_26 = 0;
                            var27_27 = null;
                            var28_28 = var9_9;
                            var29_29 = 0;
                            var9_9 = null;
                            var30_30 = 0L;
                            var32_31 = -1;
                            var33_32 = -1;
                            var34_33 = -1 >>> 4;
                            var10_10(null, null, null, null, null, null, 0, false, null, null, null, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, null, null, false, null, null, null, null, false, false, false, null, null, false, false, false, false, false, null, false, null, false, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, null, false, null, null, false, null, null, false, null, null, null, null, null, false, var30_30, null, false, null, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, var32_31, var33_32, var11_11, var12_12, var34_33, null);
                            var10_10 = h40_0.a;
                            var10_10 = z40_0.Companion;
                            AJIOApplication.Companion.getClass();
                            var35_34 = AJIOApplication$a.a();
                            var10_10.getClass();
                            var10_10 = z40$a.a((Context)var35_34).a;
                            var35_34 = "enable_urgency_driver_plp";
                            var36_35 = var10_10.a((String)var35_34);
                            if (var2_2 != null) {
                                var35_34 = var2_2.getName();
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var28_28.setProductName((String)var35_34);
                            if (var4_4 != null) {
                                var35_34 = var2_2.getFnlColorVariantData();
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var28_28.setFnlColorVariantData((ProductFnlColorVariantData)var35_34);
                            if (var4_4 != null && (var35_34 = var2_2.getFnlColorVariantData()) != null) {
                                var35_34 = var35_34.getBrandName();
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var28_28.setBrandName((String)var35_34);
                            if (var4_4 != null && (var35_34 = var2_2.getFnlColorVariantData()) != null) {
                                var35_34 = var35_34.getColorGroup();
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var28_28.setProductCode((String)var35_34);
                            if (var4_4 != null) {
                                var35_34 = var2_2.getImages();
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var35_34 = (Collection)var35_34;
                            if (var35_34 != null && !(var13_13 = var35_34.isEmpty()) && var4_4 != null && (var35_34 = var2_2.getImages()) != null) {
                                block196: {
                                    var35_34 = var35_34.iterator();
                                    while (var14_14 = var35_34.hasNext()) {
                                        var20_20 = "mobileProductListingImage";
                                        var15_15 = (ProductImage)var35_34.next();
                                        var17_17 = var15_15.getFormat();
                                        var16_16 = var20_20.equalsIgnoreCase((String)var17_17);
                                        if (!var16_16) continue;
                                        var35_34 = var15_15.getUrl();
                                        break block196;
                                    }
                                    var13_13 = 0;
                                    var35_34 = null;
                                }
                                var15_15 = var28_28.getProductImageUrl();
                                if (var15_15 == null) {
                                    var35_34 = var2_2.getImages();
                                    if (var35_34 != null && (var35_34 = (ProductImage)CollectionsKt.N(0, (List)var35_34)) != null) {
                                        var35_34 = var35_34.getUrl();
                                    } else {
                                        var13_13 = 0;
                                        var35_34 = null;
                                    }
                                }
                                var15_15 = Unit.a;
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            var15_15 = UrlHelper.Companion.getInstance();
                            var35_34 = var15_15.getImageUrl((String)var35_34);
                            var28_28.setProductImageUrl((String)var35_34);
                            var13_13 = R$string.product_image;
                            var35_34 = hv3_0.K(var13_13);
                            if (var4_4 != null && (var15_15 = var2_2.getFnlColorVariantData()) != null) {
                                var15_15 = var15_15.getBrandName();
                            } else {
                                var14_14 = 0;
                                var15_15 = null;
                            }
                            var17_17 = "";
                            if (var4_4 == null || (var20_20 = var2_2.getName()) == null) {
                                var20_20 = var17_17;
                            }
                            var23_23 = " of ";
                            var25_25 = "-";
                            var35_34 = KW.a((String)var35_34, (String)var23_23, (String)var15_15, (String)var25_25, (String)var20_20);
                            var28_28.setProductImageContentDescription((String)var35_34);
                            var35_34 = new ArrayList();
                            if (var4_4 != null && (var15_15 = var2_2.getExtraImages()) != null) {
                                var15_15 = ((Iterable)var15_15).iterator();
                                while (var18_18 = var15_15.hasNext()) {
                                    var20_20 = (ExtraImage)var15_15.next();
                                    var23_23 = var20_20.getImages();
                                    if (var23_23 != null) {
                                        var21_21 = var23_23.size();
                                    } else {
                                        var21_21 = 0;
                                        var22_22 = 0.0f;
                                        var23_23 = null;
                                    }
                                    if (var21_21 <= 0) continue;
                                    var20_20 = var20_20.getImages();
                                    Intrinsics.checkNotNull(var20_20);
                                    var20_20 = var20_20.iterator();
                                    while ((var21_21 = (int)var20_20.hasNext()) != 0) {
                                        var23_23 = (ProductImage)var20_20.next();
                                        var27_27 = UrlHelper.Companion.getInstance();
                                        var23_23 = var23_23.getUrl();
                                        var23_23 = var27_27.getImageUrl((String)var23_23);
                                        var35_34.add(var23_23);
                                    }
                                }
                                var15_15 = Unit.a;
                            }
                            var28_28.setExtraImagesUrlList((ArrayList)var35_34);
                            var35_34 = h40_0.a;
                            var13_13 = (int)h40_0.W0();
                            if (!var13_13) ** GOTO lbl-1000
                            if (var4_4 != null && (var13_13 = (int)var2_2.isComingSoonProduct()) == var7_7) {
                                var13_13 = 1;
                            } else {
                                var13_13 = 0;
                                var35_34 = null;
                            }
                            if (var13_13) {
                                var28_28.setSimilarProductEnabled(false);
                            } else lbl-1000:
                            // 2 sources

                            {
                                var35_34 = this.l();
                                Intrinsics.checkNotNullParameter(var35_34, "storeId");
                                var15_15 = ld3_2.STORE_LUXE.getStoreId();
                                var14_14 = Intrinsics.areEqual(var35_34, var15_15);
                                if (var14_14) {
                                    var35_34 = z40_0.Companion;
                                    var35_34 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var35_34).a;
                                    var15_15 = "showSimilarOptionOnPLPLuxe";
                                    var13_13 = (int)var35_34.a((String)var15_15);
                                } else {
                                    var15_15 = ld3_2.STORE_AJIOGRAM.getStoreId();
                                    var13_13 = (int)Intrinsics.areEqual(var35_34, var15_15);
                                    if (var13_13) {
                                        var35_34 = z40_0.Companion;
                                        var35_34 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var35_34).a;
                                        var15_15 = "showSimilarOptionOnPLPAjiogram";
                                        var13_13 = var35_34.a((String)var15_15);
                                    } else {
                                        var35_34 = z40_0.Companion;
                                        var35_34 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var35_34).a;
                                        var15_15 = "showSimilarOptionOnPLPAjio";
                                        var13_13 = var35_34.a((String)var15_15);
                                    }
                                }
                                var28_28.setSimilarProductEnabled((boolean)var13_13);
                            }
                            var35_34 = var28_28.getBrandName();
                            var15_15 = var28_28.getProductName();
                            if (var15_15 == null) {
                                var15_15 = var17_17;
                            }
                            var20_20 = "VIEW SIMILAR of ";
                            var23_23 = " index ";
                            var35_34 = og_1.a(var20_20, (String)var35_34, (String)var25_25, (String)var15_15, (String)var23_23);
                            var35_34.append(var3_3);
                            var35_34 = var35_34.toString();
                            var28_28.setSimilarIconContentDescription((String)var35_34);
                            var13_13 = var28_28.isSimilarProductEnabled();
                            if (var13_13) {
                                var35_34 = z40_0.Companion;
                                var35_34 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var35_34).a.b("showIconOrTextForSimilarOnPLP");
                                var15_15 = Locale.ROOT;
                                var35_34 = var35_34.toLowerCase((Locale)var15_15);
                                Intrinsics.checkNotNullExpressionValue(var35_34, "toLowerCase(...)");
                                var15_15 = "icon";
                                var18_18 = Intrinsics.areEqual(var35_34, var15_15);
                                if (var18_18) {
                                    var28_28.setSimilarProductType((String)var15_15);
                                } else {
                                    var15_15 = "text";
                                    var13_13 = (int)Intrinsics.areEqual(var35_34, var15_15);
                                    if (var13_13) {
                                        var28_28.setSimilarProductType((String)var15_15);
                                    }
                                }
                            }
                            var35_34 = ih3_1.b;
                            if (var4_4 != null && (var15_15 = var2_2.getFnlColorVariantData()) != null) {
                                var15_15 = var15_15.getColorGroup();
                            } else {
                                var14_14 = 0;
                                var15_15 = null;
                            }
                            var13_13 = CollectionsKt.F((Iterable)var35_34, var15_15);
                            var28_28.setProductWishlisted((boolean)var13_13);
                            var13_13 = R$string.added_wishlist_txt;
                            var15_15 = var28_28.getBrandName();
                            if (var15_15 == null) {
                                var15_15 = var17_17;
                            }
                            if ((var20_20 = var28_28.getProductName()) == null) {
                                var20_20 = var17_17;
                            }
                            var25_25 = new Object[var5_5];
                            var25_25[0] = var15_15;
                            var25_25[var7_7] = var20_20;
                            var35_34 = hv3_0.L(var13_13, var25_25);
                            var15_15 = new StringBuilder();
                            var15_15.append((String)var35_34);
                            var15_15.append((String)var23_23);
                            var15_15.append(var3_3);
                            var35_34 = var15_15.toString();
                            var28_28.setClosetButtonContentDescription((String)var35_34);
                            var13_13 = R$string.removed_wishlist_txt;
                            var15_15 = var28_28.getBrandName();
                            if (var15_15 == null) {
                                var15_15 = var17_17;
                            }
                            if ((var20_20 = var28_28.getProductName()) != null) {
                                var17_17 = var20_20;
                            }
                            var20_20 = new Object[var5_5];
                            var20_20[0] = var15_15;
                            var20_20[var7_7] = var17_17;
                            var35_34 = hv3_0.L(var13_13, (Object[])var20_20);
                            var15_15 = new StringBuilder();
                            var15_15.append((String)var35_34);
                            var15_15.append((String)var23_23);
                            var15_15.append(var3_3);
                            var37_36 = var15_15.toString();
                            var28_28.setClosetAddedButtonContentDescription((String)var37_36);
                            var3_3 = (int)h40_0.I1();
                            if (var3_3 != 0) {
                                if (var4_4 != null && (var37_36 = var2_2.getTags()) != null && (var37_36 = var37_36.getCategoryTags()) != null) {
                                    var37_36 = ((Iterable)var37_36).iterator();
                                    while (var13_13 = (int)var37_36.hasNext()) {
                                        var35_34 = (CategoryTags)var37_36.next();
                                        if (var35_34 != null && (var15_15 = var35_34.getCategory()) != null && (var14_14 = var15_15.equalsIgnoreCase((String)(var17_17 = "SOCIAL_PROOFING"))) == var7_7) {
                                            var14_14 = 1;
                                        } else {
                                            var14_14 = 0;
                                            var15_15 = null;
                                        }
                                        if (var14_14) {
                                            block198: {
                                                block197: {
                                                    var15_15 = var35_34.getPrimary();
                                                    if (var15_15 != null) {
                                                        var15_15 = var15_15.getValue();
                                                    } else {
                                                        var14_14 = 0;
                                                        var15_15 = null;
                                                    }
                                                    var15_15 = String.valueOf(var15_15);
                                                    try {
                                                        var17_17 = cp_1.Companion;
                                                    }
                                                    catch (Exception v0) {}
                                                    var35_34 = var35_34.getPrimary();
                                                    if (var35_34 == null) break block197;
                                                    var35_34 = var35_34.getName();
                                                    break block198;
                                                }
                                                var13_13 = 0;
                                                var35_34 = null;
                                            }
                                            var17_17.getClass();
                                            var13_13 = cp$a.x((String)var35_34);
                                            if (var13_13) continue;
                                            var35_34 = JsonParser.parseString((String)var15_15);
                                            if ((var35_34 = var35_34.getAsJsonObject()) == null) continue;
                                            var14_14 = var35_34.has((String)var8_8);
                                            if (!var14_14) continue;
                                            var15_15 = var35_34.get((String)var8_8);
                                            var15_15 = var15_15.getAsString();
                                            var28_28.setWishlistCountShortText((String)var15_15);
                                            var15_15 = "longText";
                                            var35_34 = var35_34.get((String)var15_15);
                                            var35_34 = var35_34.getAsString();
                                            var28_28.setWishlistCountLongText((String)var35_34);
                                            var28_28.setWishlistCountAvailable((boolean)var7_7);
                                            continue;
                                        }
                                        var28_28.setWishlistCountAvailable(false);
                                    }
                                    var37_36 = Unit.a;
                                }
                            } else {
                                var28_28.setWishlistCountAvailable(false);
                                var37_36 = Unit.a;
                            }
                            var37_36 = el1_2.a;
                            var3_3 = (int)el1_2.l();
                            if (var3_3 == 0) ** GOTO lbl-1000
                            if (var4_4 != null) {
                                var37_36 = var2_2.getAdsData();
                            } else {
                                var3_3 = 0;
                                var37_36 = null;
                            }
                            if (var37_36 != null) {
                                var28_28.setShowAdTag((boolean)var7_7);
                                var28_28.setShowProductTags(false);
                                var16_16 = 0;
                                var17_17 = null;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var28_28.setShowAdTag(false);
                                var37_36 = hv3_0.a;
                                if (var4_4 != null) {
                                    var8_8 = var2_2.getFnlColorVariantData();
                                } else {
                                    var38_37 = false;
                                    var39_38 = 0.0f;
                                    var8_8 = null;
                                }
                                var37_36.getClass();
                                var37_36 = hv3_0.z((Product)var4_4, (ProductFnlColorVariantData)var8_8);
                                if (var4_4 != null) {
                                    var8_8 = var2_2.getFnlColorVariantData();
                                } else {
                                    var38_37 = false;
                                    var39_38 = 0.0f;
                                    var8_8 = null;
                                }
                                var8_8 = hv3_0.A((ProductFnlColorVariantData)var8_8);
                                if (var36_35 != 0 && var4_4 != null && (var35_34 = var2_2.getTags()) != null && (var35_34 = var35_34.getCategoryTags()) != null) {
                                    var35_34 = ((Iterable)var35_34).iterator();
                                    while (var14_14 = var35_34.hasNext()) {
                                        var15_15 = (CategoryTags)var35_34.next();
                                        if (var15_15 == null || (var17_17 = var15_15.getCategory()) == null || (var16_16 = var17_17.equalsIgnoreCase((String)(var20_20 = "SELLING_POINT"))) != var7_7) continue;
                                        var17_17 = Boolean.TRUE;
                                        if ((var15_15 = var15_15.getPrimary()) != null) {
                                            var15_15 = var15_15.getValue();
                                        } else {
                                            var14_14 = 0;
                                            var15_15 = null;
                                        }
                                        var35_34 = new Pair(var17_17, var15_15);
                                        var16_16 = 0;
                                        var17_17 = null;
                                        break;
                                    }
                                } else {
                                    var15_15 = Boolean.FALSE;
                                    var16_16 = 0;
                                    var17_17 = null;
                                    var35_34 = new Pair(var15_15, null);
                                }
                                var15_15 = var35_34.a;
                                var20_20 = h40_0.a;
                                var18_18 = h40_0.W0();
                                var21_21 = (int)hv3_0.V(var2_2);
                                if (!var18_18 || var21_21 == 0) {
                                    var37_36 = var8_8;
                                }
                                if (!var18_18 || var21_21 == 0) {
                                    var23_23 = var15_15;
                                    var23_23 = (Boolean)var15_15;
                                    var21_21 = (int)var23_23.booleanValue();
                                    if (var21_21 != 0) {
                                        var8_8 = (String)var35_34.b;
                                    }
                                }
                                if (var37_36 == null && !(var13_13 = (var15_15 = (Boolean)var15_15).booleanValue())) {
                                    var28_28.setShowProductTags(false);
                                } else {
                                    if (!var18_18) {
                                        var37_36 = var8_8;
                                    }
                                    var28_28.setProductTagViewContentDescription((String)var37_36);
                                    var28_28.setProductTagValue((String)var8_8);
                                    var28_28.setShowProductTags((boolean)var7_7);
                                }
                            }
                            var37_36 = h40_0.a;
                            var3_3 = (int)h40_0.H1();
                            if (var3_3 != 0) {
                                var28_28.setPlpUrgencyTagEnabled(false);
                                if (var4_4 != null && (var37_36 = var2_2.getTags()) != null && (var37_36 = var37_36.getCategoryTags()) != null) {
                                    var37_36 = ((Iterable)var37_36).iterator();
                                    var38_37 = false;
                                    var39_38 = 0.0f;
                                    var8_8 = null;
                                    while (var13_13 = var37_36.hasNext()) {
                                        var35_34 = (CategoryTags)var37_36.next();
                                        if (var35_34 != null && (var15_15 = var35_34.getCategory()) != null && (var14_14 = var15_15.equalsIgnoreCase((String)(var20_20 = "URGENCY"))) == var7_7) {
                                            var14_14 = 1;
                                        } else {
                                            var14_14 = 0;
                                            var15_15 = null;
                                        }
                                        if (var14_14) {
                                            var28_28.setPlpUrgencyTagEnabled((boolean)var7_7);
                                            var8_8 = var35_34.getPrimary();
                                            if (var8_8 != null) {
                                                var8_8 = var8_8.getValue();
                                            } else {
                                                var38_37 = false;
                                                var8_8 = null;
                                                var39_38 = 0.0f;
                                            }
                                            var8_8 = String.valueOf(var8_8);
                                            var28_28.setUrgencyTagValue((String)var8_8);
                                            var38_37 = true;
                                            var39_38 = 1.4E-45f;
                                            continue;
                                        }
                                        if (var38_37) continue;
                                        var28_28.setPlpUrgencyTagEnabled(false);
                                    }
                                    var37_36 = Unit.a;
                                }
                            } else {
                                var28_28.setPlpUrgencyTagEnabled(false);
                                var37_36 = Unit.a;
                            }
                            if (var36_35 != 0 && var4_4 != null && (var37_36 = var2_2.getTags()) != null && (var37_36 = var37_36.getCategoryTags()) != null) {
                                var37_36 = ((Iterable)var37_36).iterator();
                                while (var38_37 = var37_36.hasNext()) {
                                    var8_8 = (CategoryTags)var37_36.next();
                                    if (var8_8 != null && (var10_10 = var8_8.getCategory()) != null && (var36_35 = var10_10.equalsIgnoreCase((String)(var35_34 = "BARGAIN"))) == var7_7) {
                                        var36_35 = 1;
                                        var40_39 = 1.4E-45f;
                                    } else {
                                        var36_35 = 0;
                                        var40_39 = 0.0f;
                                        var10_10 = null;
                                    }
                                    if (var36_35 == 0) continue;
                                    var28_28.setPlpBargainUrgencyTagEnabled((boolean)var7_7);
                                    var8_8 = var8_8.getPrimary();
                                    if (var8_8 != null) {
                                        var8_8 = var8_8.getValue();
                                    } else {
                                        var38_37 = false;
                                        var8_8 = null;
                                        var39_38 = 0.0f;
                                    }
                                    var28_28.setBargainUrgencyTagValue((String)var8_8);
                                }
                                var37_36 = Unit.a;
                            }
                            var37_36 = h40_0.a;
                            var8_8 = z40_0.Companion;
                            var10_10 = AJIOApplication.Companion;
                            var8_8 = Q.a((AJIOApplication$a)var10_10, (z40$a)var8_8).a;
                            var35_34 = "plp_sizes_enable";
                            var38_37 = var8_8.a((String)var35_34);
                            if (!var38_37) ** GOTO lbl-1000
                            if (var4_4 != null && (var8_8 = var2_2.getProductSizeData()) != null) {
                                var8_8 = var8_8.getSizeVariants();
                            } else {
                                var38_37 = false;
                                var8_8 = null;
                                var39_38 = 0.0f;
                            }
                            if (var8_8 != null && !(var38_37 = var8_8.isEmpty())) {
                                var38_37 = false;
                                var39_38 = 0.0f;
                                var8_8 = null;
                            } else {
                                var38_37 = true;
                                var39_38 = 1.4E-45f;
                            }
                            if (!var38_37) {
                                var28_28.setShowSizeLayout((boolean)var7_7);
                                if (var4_4 != null && (var8_8 = var2_2.getProductSizeData()) != null && (var8_8 = var8_8.getSizeVariants()) != null) {
                                    var35_34 = (String)CollectionsKt.N(0, (List)var8_8);
                                    if (var35_34 != null) {
                                        var13_13 = var35_34.length();
                                    } else {
                                        var13_13 = 0;
                                        var35_34 = null;
                                    }
                                    var28_28.setShowSizeFirstView((boolean)var7_7);
                                    var15_15 = (String)CollectionsKt.N(0, (List)var8_8);
                                    var28_28.setSizeFirstViewText((String)var15_15);
                                    var14_14 = var8_8.size();
                                    if (var14_14 > var7_7 && var13_13 <= (var14_14 = 6)) {
                                        var35_34 = (String)var8_8.get(var7_7);
                                        if (var35_34 != null) {
                                            var13_13 = var35_34.length();
                                            var35_34 = var13_13;
                                        } else {
                                            var13_13 = 0;
                                            var35_34 = null;
                                        }
                                        Intrinsics.checkNotNull(var35_34);
                                        var13_13 = var35_34.intValue();
                                        var28_28.setShowSizeSecondView((boolean)var7_7);
                                        var15_15 = (String)CollectionsKt.N(var7_7, (List)var8_8);
                                        var28_28.setSizeSecondViewText((String)var15_15);
                                        var14_14 = 2;
                                    } else {
                                        var14_14 = 1;
                                    }
                                    var18_18 = var8_8.size();
                                    if (var18_18 > var5_5) {
                                        var18_18 = 4;
                                        var19_19 = 5.6E-45f;
                                        if (var13_13 < var18_18) {
                                            var35_34 = (String)var8_8.get(var5_5);
                                            if (var35_34 != null) {
                                                var13_13 = var35_34.length();
                                                var35_34 = var13_13;
                                            } else {
                                                var13_13 = 0;
                                                var35_34 = null;
                                            }
                                            Intrinsics.checkNotNull(var35_34);
                                            var13_13 = var35_34.intValue();
                                            var28_28.setShowSizeThirdView((boolean)var7_7);
                                            var41_40 = (String)CollectionsKt.N(var5_5, (List)var8_8);
                                            var28_28.setSizeThirdViewText((String)var41_40);
                                            var14_14 += var7_7;
                                        }
                                    }
                                    var5_5 = var8_8.size();
                                    var18_18 = 3;
                                    var19_19 = 4.2E-45f;
                                    if (var5_5 > var18_18 && var13_13 < var18_18) {
                                        var28_28.setShowSizeFourthView((boolean)var7_7);
                                        var41_40 = (String)CollectionsKt.N(var18_18, (List)var8_8);
                                        var28_28.setSizeFourthViewText((String)var41_40);
                                        var14_14 += var7_7;
                                    }
                                    if ((var5_5 = var8_8.size() - var14_14) > 0) {
                                        var35_34 = "+";
                                        var8_8 = new StringBuilder((String)var35_34);
                                        var8_8.append(var5_5);
                                        var41_40 = var8_8.toString();
                                        var28_28.setShowSizeCount((boolean)var7_7);
                                        var28_28.setSizeCountText((String)var41_40);
                                    } else {
                                        var28_28.setShowSizeCount(false);
                                    }
                                    var41_40 = Unit.a;
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var28_28.setShowSizeLayout(false);
                                var41_40 = Unit.a;
                            }
                            if (var4_4 != null) {
                                var41_40 = var2_2.getPrice();
                            } else {
                                var5_5 = 0;
                                var41_40 = null;
                                var6_6 = 0.0f;
                            }
                            var38_37 = false;
                            var39_38 = 0.0f;
                            var8_8 = null;
                            var35_34 = "format(...)";
                            var15_15 = "getString(...)";
                            if (var41_40 == null) break block199;
                            var28_28.setShowFinalPrice((boolean)var7_7);
                            var41_40 = qz2_0.r(var2_2.getPrice());
                            var28_28.setFinalPriceValue((String)var41_40);
                            var41_40 = StringCompanionObject.INSTANCE;
                            var10_10.getClass();
                            var41_40 = AJIOApplication$a.a().getResources();
                            var18_18 = R$string.acc_plp_final_price;
                            var41_40 = var41_40.getString(var18_18);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var15_15);
                            var20_20 = qz2_0.r(var2_2.getPrice());
                            var23_23 = new Object[var7_7];
                            var23_23[0] = var20_20;
                            var20_20 = Arrays.copyOf(var23_23, var7_7);
                            var41_40 = String.format((String)var41_40, (Object[])var20_20);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var35_34);
                            var28_28.setFinalPriceContentDescription((String)var41_40);
                            var41_40 = var2_2.getWasPriceData();
                            if (var41_40 == null) ** GOTO lbl-1000
                            var20_20 = var41_40.getValue();
                            if (var20_20 != null) {
                                var19_19 = Float.parseFloat((String)var20_20);
                            } else {
                                var18_18 = 0;
                                var19_19 = 0.0f;
                                var20_20 = null;
                            }
                            var23_23 = var2_2.getPrice();
                            if (var23_23 != null && (var23_23 = var23_23.getValue()) != null) {
                                var22_22 = Float.parseFloat((String)var23_23);
                            } else {
                                var21_21 = 0;
                                var22_22 = 0.0f;
                                var23_23 = null;
                            }
                            var18_18 = Float.compare(var19_19, var22_22);
                            if (var18_18 > 0) {
                                var20_20 = qz2_0.s(mz3_0.h(var41_40.getValue()));
                                var23_23 = new SpannableString((CharSequence)var20_20);
                                var25_25 = new StrikethroughSpan();
                                var26_26 = var20_20.length();
                                var29_29 = 33;
                                var23_23.setSpan((Object)var25_25, 0, var26_26, var29_29);
                                var41_40 = qz2_0.g(var2_2.getPrice(), (Price)var41_40);
                                var28_28.setShowDiscountPrice((boolean)var7_7);
                                var28_28.setShowMrpPrice((boolean)var7_7);
                                var28_28.setMrpPriceValue((SpannableString)var23_23);
                                var23_23 = AJIOApplication$a.a().getResources();
                                var24_24 = R$string.acc_plp_original_price;
                                var23_23 = var23_23.getString(var24_24);
                                Intrinsics.checkNotNullExpressionValue(var23_23, (String)var15_15);
                                var25_25 = new Object[var7_7];
                                var25_25[0] = var20_20;
                                var20_20 = Arrays.copyOf(var25_25, var7_7);
                                var20_20 = String.format((String)var23_23, (Object[])var20_20);
                                Intrinsics.checkNotNullExpressionValue(var20_20, (String)var35_34);
                                var28_28.setMrpPriceContentDescription((String)var20_20);
                                var20_20 = var2_2.getDiscountPercent();
                                var18_18 = TextUtils.isEmpty((CharSequence)var20_20);
                                if (!var18_18) {
                                    var20_20 = AJIOApplication$a.a().getResources();
                                    var21_21 = R$string.acc_plp_discount_price;
                                    var20_20 = var20_20.getString(var21_21);
                                    Intrinsics.checkNotNullExpressionValue(var20_20, (String)var15_15);
                                    var23_23 = new Object[var7_7];
                                    var23_23[0] = var41_40;
                                    var41_40 = Arrays.copyOf(var23_23, var7_7);
                                    var41_40 = String.format((String)var20_20, (Object[])var41_40);
                                    Intrinsics.checkNotNullExpressionValue(var41_40, (String)var35_34);
                                    var28_28.setDiscountPriceContentDescription((String)var41_40);
                                    var41_40 = var2_2.getDiscountPercent();
                                    var28_28.setDiscountPriceValue((String)var41_40);
                                } else {
                                    var18_18 = TextUtils.isEmpty((CharSequence)var41_40);
                                    if (!var18_18) {
                                        var20_20 = AJIOApplication$a.a().getResources();
                                        var21_21 = R$string.acc_plp_discount_price;
                                        var20_20 = var20_20.getString(var21_21);
                                        Intrinsics.checkNotNullExpressionValue(var20_20, (String)var15_15);
                                        var23_23 = new Object[var7_7];
                                        var23_23[0] = var41_40;
                                        var23_23 = Arrays.copyOf(var23_23, var7_7);
                                        var20_20 = String.format((String)var20_20, (Object[])var23_23);
                                        Intrinsics.checkNotNullExpressionValue(var20_20, (String)var35_34);
                                        var28_28.setDiscountPriceContentDescription((String)var20_20);
                                        var20_20 = new StringBuilder();
                                        var20_20.append((String)var41_40);
                                        var20_20.append("% OFF");
                                        var41_40 = var20_20.toString();
                                        var28_28.setDiscountPriceValue((String)var41_40);
                                    } else {
                                        var28_28.setShowDiscountPrice(false);
                                    }
                                }
                            } else lbl-1000:
                            // 2 sources

                            {
                                var28_28.setShowMrpPrice(false);
                                var28_28.setShowDiscountPrice(false);
                            }
                            break block200;
                        }
                        var28_28.setShowFinalPrice(false);
                    }
                    if (var4_4 != null && (var5_5 = (int)var2_2.isDODEnabled()) == var7_7) {
                        var5_5 = 1;
                        var6_6 = 1.4E-45f;
                    } else {
                        var5_5 = 0;
                        var6_6 = 0.0f;
                        var41_40 = null;
                    }
                    if (var5_5) {
                        var42_41 = var2_2.getDodEndTime();
                        var28_28.setDodEndTime(var42_41);
                        var28_28.setDodEnabled((boolean)var7_7);
                        var41_40 = Calendar.getInstance(TimeZone.getTimeZone("IST"));
                        var42_41 = var41_40.getTimeInMillis();
                        var44_42 = var2_2.getDodEndTime();
                        var5_5 = var42_41 == var44_42 ? 0 : (var42_41 < var44_42 ? -1 : 1);
                        if (var5_5 < 0) {
                            var41_40 = qz2_0.r(var2_2.getDodPriceData());
                            var20_20 = StringCompanionObject.INSTANCE;
                            var10_10.getClass();
                            var20_20 = AJIOApplication$a.a();
                            var21_21 = R$string.deal_price_plp;
                            var20_20 = var20_20.getString(var21_21);
                            Intrinsics.checkNotNullExpressionValue(var20_20, (String)var15_15);
                            var23_23 = new Object[var7_7];
                            var23_23[0] = var41_40;
                            var41_40 = Arrays.copyOf(var23_23, var7_7);
                            var41_40 = String.format((String)var20_20, (Object[])var41_40);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var35_34);
                            var28_28.setOfferPriceValue((String)var41_40);
                            var28_28.setShowOfferPrice((boolean)var7_7);
                            var41_40 = AJIOApplication$a.a().getResources();
                            var18_18 = R$string.acc_plp_offer_price;
                            var41_40 = var41_40.getString(var18_18);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var15_15);
                            var20_20 = var2_2.getDodPriceData();
                            var23_23 = new Object[var7_7];
                            var23_23[0] = var20_20;
                            var20_20 = Arrays.copyOf(var23_23, var7_7);
                            var41_40 = String.format((String)var41_40, (Object[])var20_20);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var35_34);
                            var28_28.setOfferPriceContentDescription((String)var41_40);
                            var28_28.setSetDiscountColor((boolean)var7_7);
                        } else {
                            var28_28.setDodEnabled(false);
                            var28_28.setSetOfferPrice((boolean)var7_7);
                        }
                    } else {
                        var28_28.setDodEnabled(false);
                        var28_28.setSetOfferPrice((boolean)var7_7);
                    }
                    var5_5 = h40_0.L1();
                    if (var4_4 != null && (var20_20 = var2_2.getOfferPrice()) != null) {
                        var20_20 = var20_20.getFormattedValue();
                    } else {
                        var18_18 = 0;
                        var20_20 = null;
                        var19_19 = 0.0f;
                    }
                    var20_20 = qz2_0.n((String)var20_20);
                    var21_21 = (int)var28_28.getSetOfferPrice();
                    if (var21_21 == 0) break block201;
                    var23_23 = this;
                    var24_24 = this.v(false);
                    if (var24_24 != 0) break block202;
                    if (var4_4 != null) {
                        var25_25 = var2_2.getOfferPrice();
                    } else {
                        var24_24 = 0;
                        var25_25 = null;
                    }
                    if (var25_25 == null || !var5_5) break block202;
                    var41_40 = var2_2.getPrice();
                    if (var41_40 != null) {
                        var41_40 = var41_40.getFormattedValue();
                    } else {
                        var5_5 = 0;
                        var41_40 = null;
                        var6_6 = 0.0f;
                    }
                    var41_40 = qz2_0.n((String)var41_40);
                    var5_5 = (int)Intrinsics.areEqual(var20_20, var41_40);
                    if (var5_5) break block202;
                    var5_5 = (int)var28_28.isPlpBargainUrgencyTagEnabled();
                    if (var5_5) {
                        var41_40 = var28_28.getBargainUrgencyTagValue();
                        if (var41_40 != null) {
                            var41_40 = cP.a((String)var41_40, " :", (String)var20_20);
                            var10_10 = Unit.a;
                        } else {
                            var41_40 = StringCompanionObject.INSTANCE;
                            var10_10.getClass();
                            var41_40 = AJIOApplication$a.a();
                            var36_35 = R$string.plp_offer_price;
                            var41_40 = var41_40.getString(var36_35);
                            Intrinsics.checkNotNullExpressionValue(var41_40, (String)var15_15);
                            var10_10 = new Object[var7_7];
                            var10_10[0] = var20_20;
                            var41_40 = xh2_0.a((Object[])var10_10, var7_7, (String)var41_40, (String)var35_34);
                            var10_10 = Unit.a;
                        }
                    } else {
                        var41_40 = StringCompanionObject.INSTANCE;
                        var10_10.getClass();
                        var41_40 = AJIOApplication$a.a();
                        var36_35 = R$string.plp_offer_price;
                        var41_40 = var41_40.getString(var36_35);
                        Intrinsics.checkNotNullExpressionValue(var41_40, (String)var15_15);
                        var10_10 = new Object[var7_7];
                        var10_10[0] = var20_20;
                        var41_40 = xh2_0.a((Object[])var10_10, var7_7, (String)var41_40, (String)var35_34);
                    }
                    var10_10 = cp_1.Companion;
                    var10_10.getClass();
                    var36_35 = (int)cp$a.o();
                    if (var36_35 != 0) {
                        var5_5 = var28_28.isPlpBargainUrgencyTagEnabled();
                        if (var5_5) {
                            var41_40 = var28_28.getBargainUrgencyTagValue();
                            if (var41_40 == null) {
                                var5_5 = R$string.offer_price_message;
                                var41_40 = hv3_0.K(var5_5);
                            }
                        } else {
                            var5_5 = R$string.offer_price_message;
                            var41_40 = hv3_0.K(var5_5);
                        }
                        if ((var10_10 = var2_2.getOfferPrice()) != null) {
                            var10_10 = var10_10.getFormattedValue();
                        } else {
                            var36_35 = 0;
                            var10_10 = null;
                            var40_39 = 0.0f;
                        }
                        var40_39 = Float.parseFloat(mz3_0.h((String)var10_10));
                        var10_10 = qz2_0.x(Float.valueOf(var40_39));
                        var35_34 = new StringBuilder();
                        var35_34.append((String)var41_40);
                        var35_34.append(" ");
                        var35_34.append((String)var10_10);
                        var41_40 = var35_34.toString();
                        var28_28.setSetOfferPriceDrawable((boolean)var7_7);
                    }
                    var28_28.setOfferPriceValue((String)var41_40);
                    var28_28.setShowOfferPrice((boolean)var7_7);
                    var28_28.setSetDiscountColor((boolean)var7_7);
                    var28_28.setOfferPriceContentDescription((String)var41_40);
                    break block203;
                }
                var23_23 = this;
            }
            var28_28.setShowOfferPrice(false);
            var28_28.setSetDiscountColor((boolean)var7_7);
        }
        var28_28.setShowOODEnable((boolean)var7_7);
        var28_28.setSellingFastTag((boolean)var7_7);
        var28_28.setShowAjiogramTag((boolean)var7_7);
        var28_28.setShowSizeView((boolean)var7_7);
        var28_28.setEnableWishlistView((boolean)var7_7);
        var28_28.setShowPlpGrid((boolean)var7_7);
        var28_28.setProductClicklisteners((boolean)var7_7);
        var28_28.setEnableRatingView((boolean)var7_7);
        var28_28.setEnableFreebie((boolean)var7_7);
        var5_5 = (int)mz3_0.z();
        if (var5_5) {
            var28_28.setGwpEnabled((boolean)var7_7);
            if (var4_4 != null && (var41_40 = var2_2.getOfferPrice()) != null) {
                var41_40 = var41_40.getGiftAvailable();
                var10_10 = Boolean.TRUE;
                var5_5 = Intrinsics.areEqual(var41_40, var10_10);
            } else {
                var5_5 = 0;
                var6_6 = 0.0f;
                var41_40 = null;
            }
            var28_28.setGiftAvailable((boolean)var5_5);
            var41_40 = h40_0.D(false).getFreebiesOne();
            var28_28.setGwpFreebiesOneText((String)var41_40);
            var5_5 = (int)og1_1.c();
            var28_28.setLuxeEnabled((boolean)var5_5);
            var5_5 = mz3_0.z();
            var28_28.setGWPFeatureEnabledAjioLuxe((boolean)var5_5);
        } else {
            var28_28.setGwpEnabled(false);
        }
        if (var4_4 != null) {
            var41_40 = var2_2.getWasPriceData();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        if (var41_40 != null) {
            if (var4_4 != null && (var41_40 = var2_2.getWasPriceData()) != null) {
                var41_40 = var41_40.getValue();
            } else {
                var5_5 = 0;
                var41_40 = null;
                var6_6 = 0.0f;
            }
            var5_5 = (int)TextUtils.isEmpty((CharSequence)var41_40);
            if (!var5_5) {
                var41_40 = var2_2.getWasPriceData();
                if (var41_40 != null && (var41_40 = var41_40.getValue()) != null && (var41_40 = je3_2.e((String)var41_40)) != null) {
                    var6_6 = var41_40.floatValue();
                } else {
                    var5_5 = 0;
                    var6_6 = 0.0f;
                    var41_40 = null;
                }
                var41_40 = Float.valueOf(var6_6);
                var28_28.setWasPriceValue((Float)var41_40);
            }
        }
        if (var4_4 != null) {
            var41_40 = var2_2.getPrice();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        if (var41_40 != null) {
            if (var4_4 != null && (var41_40 = var2_2.getPrice()) != null) {
                var41_40 = var41_40.getValue();
            } else {
                var5_5 = 0;
                var41_40 = null;
                var6_6 = 0.0f;
            }
            var5_5 = (int)TextUtils.isEmpty((CharSequence)var41_40);
            if (!var5_5) {
                if (var4_4 != null && (var41_40 = var2_2.getPrice()) != null && (var41_40 = var41_40.getValue()) != null && (var41_40 = je3_2.e((String)var41_40)) != null) {
                    var39_38 = var41_40.floatValue();
                }
                var41_40 = Float.valueOf(var39_38);
                var28_28.setPriceValue((Float)var41_40);
            }
        }
        if (var4_4 != null && (var41_40 = var2_2.getOfferPrice()) != null && (var41_40 = var41_40.getPriceReveal()) != null) {
            var41_40 = var41_40.getBestPrice();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        if (var41_40 != null) {
            var41_40 = var2_2.getOfferPrice();
            if (var41_40 != null && (var41_40 = var41_40.getPriceReveal()) != null) {
                var41_40 = var41_40.getBestPrice();
            } else {
                var5_5 = 0;
                var41_40 = null;
                var6_6 = 0.0f;
            }
            var28_28.setBestPriceValue((Float)var41_40);
        }
        if (var4_4 != null && (var41_40 = var2_2.getOfferPrice()) != null) {
            var41_40 = var41_40.getValue();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        var28_28.setOfferPrice((String)var41_40);
        if (var4_4 != null && (var41_40 = var2_2.getOfferPrice()) != null && (var41_40 = var41_40.getPriceReveal()) != null) {
            var41_40 = var41_40.getDiscountPercent();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        var28_28.setDiscountPercentValue((String)var41_40);
        var5_5 = tr2_2.p(false);
        var28_28.setPreSalePlp((boolean)var5_5);
        var5_5 = h40_0.T1();
        var28_28.setRatingEnabledPlp((boolean)var5_5);
        if (var4_4 != null) {
            var41_40 = var2_2.getAverageRating();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        var28_28.setAverageRating((Double)var41_40);
        if (var4_4 != null) {
            var41_40 = var2_2.getRatingCount();
        } else {
            var5_5 = 0;
            var41_40 = null;
            var6_6 = 0.0f;
        }
        if (var41_40 == null) {
            if (var4_4 != null) {
                var4_4 = var2_2.getNumUserRatings();
            } else {
                var46_43 = false;
                var4_4 = null;
            }
        } else {
            var4_4 = var2_2.getRatingCount();
        }
        var28_28.setProductRatingCount((String)var4_4);
        var46_43 = h40_0.Q1();
        var28_28.setPrioritydeliveryFeatureEnable(var46_43);
        var37_36 = var37_36.g0();
        if (var37_36 != null) {
            var4_4 = var28_28.getFnlColorVariantData();
            if (var4_4 != null) {
                var4_4 = var4_4.getDeliverySlaTag();
            } else {
                var46_43 = false;
                var4_4 = null;
            }
            var37_36 = (String)var37_36.get(var4_4);
        } else {
            var3_3 = 0;
            var37_36 = null;
        }
        var28_28.setDeliverySlaTag((String)var37_36);
        var37_36 = od3_2.a();
        var4_4 = ld3_2.STORE_AJIOGRAM.getStoreId();
        var3_3 = (int)Intrinsics.areEqual(var37_36, var4_4);
        if (var3_3 != 0) {
            var28_28.setAjiogramStoreId((boolean)var7_7);
        }
        return var28_28;
    }

    public final void n(ProductListQuery productListQuery) {
        Object object;
        Object object2;
        int n3;
        int n4;
        Object object3 = this.l();
        Object object4 = od3_2.a();
        if (object3 == null || (n4 = ((String)object3).length()) == 0) {
            object3 = object4;
        }
        if ((n3 = Intrinsics.areEqual(object3, object4 = ld3_2.STORE_AJIO.getStoreId())) != 0) {
            object3 = "rilfnl";
        }
        productListQuery.setStoreId((String)object3);
        object3 = this.r;
        if (object3 != null && (object3 = ((BrandDetails)object3).getBrandCode()) != null) {
            productListQuery.setBrandCode((String)object3);
        }
        boolean bl2 = this.w();
        object3 = bl2;
        productListQuery.setUrgencyDriverEnabled((Boolean)object3);
        z40_0.Companion.getClass();
        object3 = this.a;
        Object object5 = z40$a.a((Context)object3).a.b("SearchAPI_Exp");
        object4 = z40$a.a((Context)object3).a;
        Object object6 = ((ao0_0)object4).b("plp_variant");
        n3 = TextUtils.isEmpty((CharSequence)object6);
        if (n3 == 0) {
            object4 = new HashMap();
            object2 = "Event";
            object = "PLPExperiment";
            ((HashMap)object4).put(object2, object);
            this.y((HashMap)object4);
        }
        n3 = this.y;
        object2 = this.d;
        if (n3 != 0) {
            Intrinsics.checkNotNullParameter(productListQuery, "productListQuery");
            n4 = 0;
            object6 = null;
            object3 = object3.getSharedPreferences("PREFERENCE_NAME", 0);
            object5 = "";
            object3 = object3.getString("IMAGE_SEARCH_URL", (String)object5);
            object4 = h40_0.a;
            n3 = (int)(h40_0.m2() ? 1 : 0);
            object4 = n3 != 0 ? "more_image_search_url_v2" : "more_image_search_url";
            object5 = UrlHelper.Companion.getInstance();
            object = "plp";
            object6 = new Object[]{};
            object4 = ((UrlHelper)object5).getApiUrl((String)object, (String)object4, object6);
            n4 = (int)(h40_0.M1() ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0)) != 0) {
                object6 = ((UserInformation)object2).getCustomerUUID();
                object5 = "&userId=";
                object3 = y02.a((String)object4, (String)object3, (String)object5, (String)object6);
            } else {
                object3 = Ft2.a((String)object4, (String)object3);
            }
            this.o((String)object3, productListQuery);
        } else {
            object3 = ke0_0.a;
            n3 = productListQuery.getCurrentPage();
            PLPRequest pLPRequest = new PLPRequest((String)object3, n3);
            n3 = (int)(((UserInformation)object2).isUserOnline() ? 1 : 0);
            object2 = ((UserInformation)object2).getCustomerUUID();
            object3 = this.I;
            object = Boolean.TRUE;
            boolean bl3 = Intrinsics.areEqual(object3, object);
            boolean bl4 = b2;
            object3 = this.b;
            object = null;
            int n7 = 32;
            Object object7 = productListQuery;
            object3 = NewPlpRepo.getProducts$default((NewPlpRepo)object3, productListQuery, n3 != 0, (String)object6, (String)object5, (String)object2, false, bl3, bl4, pLPRequest, n7, null);
            n3 = 2;
            object7 = new pw1_1(this, n3);
            object4 = new lu2_1((pw1_1)object7);
            object7 = new nu2_1(this);
            object6 = new ou2_1(object7);
            object3 = ((g53_0)object3).f((o60_0)object4, (o60_0)object6);
            object7 = this.j1;
            ((t30_0)object7).b((yr0_2)object3);
        }
    }

    public final void o(String string2, ProductListQuery productListQuery) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(productListQuery, "productListQuery");
        this.y = true;
        bv2$b bv2$b = new bv2$b(this, string2, productListQuery, null);
        Ae3.d(this.e, null, null, bv2$b, 3);
    }

    public final Bundle p(String object) {
        Object object2;
        int n3;
        Bundle bundle = new Bundle();
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = "user_search_term";
            bundle.putString((String)object2, (String)object);
        }
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object2 = "search_term";
            bundle.putString((String)object2, (String)object);
        }
        object = this.k();
        object2 = ProductsList.Companion;
        String string2 = ((ProductsList$Companion)object2).getSEARCH_PAGE();
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i((String)object, string2, bl2);
        string2 = "Search";
        String string3 = "Search|";
        String string4 = "no";
        String string5 = "type_of_redirection";
        String string6 = "redirection";
        if (bl3) {
            object = h40_0.a;
            bl3 = h40_0.z1();
            if (bl3 && (bl3 = b2)) {
                bundle.putString(string6, string4);
                object = this.U0;
                k01_0.a(string3, (String)object, bundle, string5);
            } else {
                bundle.putString(string6, string4);
                bundle.putString(string5, string2);
            }
        } else {
            object = this.k();
            String string7 = ((ProductsList$Companion)object2).getCATEGORY_PAGE();
            bl3 = kotlin.text.b.i((String)object, string7, bl2);
            string7 = "yes";
            if (bl3) {
                object = h40_0.a;
                bl3 = h40_0.z1();
                if (bl3 && (bl3 = b2)) {
                    bundle.putString(string6, string7);
                    object = this.U0;
                    object2 = "c|";
                    k01_0.a((String)object2, (String)object, bundle, string5);
                } else {
                    bundle.putString(string6, string7);
                    object = "c";
                    bundle.putString(string5, (String)object);
                }
            } else {
                String string8;
                object = this.k();
                bl3 = kotlin.text.b.i((String)object, string8 = ((ProductsList$Companion)object2).getCURATED_PAGE(), bl2);
                if (bl3) {
                    object = h40_0.a;
                    bl3 = h40_0.z1();
                    if (bl3 && (bl3 = b2)) {
                        bundle.putString(string6, string7);
                        object = this.U0;
                        object2 = "s|";
                        k01_0.a((String)object2, (String)object, bundle, string5);
                    } else {
                        bundle.putString(string6, string7);
                        object = "s";
                        bundle.putString(string5, (String)object);
                    }
                } else {
                    object = this.k();
                    bl3 = kotlin.text.b.i((String)object, (String)(object2 = ((ProductsList$Companion)object2).getBRAND_PAGE()), bl2);
                    if (bl3) {
                        object = h40_0.a;
                        bl3 = h40_0.z1();
                        if (bl3 && (bl3 = b2)) {
                            bundle.putString(string6, string7);
                            object = this.U0;
                            object2 = "b|";
                            k01_0.a((String)object2, (String)object, bundle, string5);
                        } else {
                            bundle.putString(string6, string7);
                            object = "b";
                            bundle.putString(string5, (String)object);
                        }
                    } else {
                        object = h40_0.a;
                        bl3 = h40_0.z1();
                        if (bl3 && (bl3 = b2)) {
                            bundle.putString(string6, string4);
                            object = this.U0;
                            k01_0.a(string3, (String)object, bundle, string5);
                        } else {
                            bundle.putString(string6, string4);
                            bundle.putString(string5, string2);
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public final void q(ProductListQuery productListQuery, boolean bl2) {
        String string2;
        boolean bl3;
        int n3;
        Object object = this.l();
        Object object2 = od3_2.a();
        if (object == null || (n3 = ((String)object).length()) == 0) {
            object = object2;
        }
        if (bl3 = Intrinsics.areEqual(object, object2 = ld3_2.STORE_AJIO.getStoreId())) {
            object = "rilfnl";
        }
        productListQuery.setStoreId((String)object);
        object = this.t;
        if (object != null) {
            productListQuery.setBrandId((String)object);
        }
        object = this.w();
        productListQuery.setUrgencyDriverEnabled((Boolean)object);
        z40_0.Companion.getClass();
        object = this.a;
        String string3 = z40$a.a((Context)object).a.b("SearchAPI_Exp");
        object = z40$a.a((Context)object).a;
        object2 = "plp_variant";
        Object object3 = ((ao0_0)object).b((String)object2);
        boolean bl4 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl4) {
            object = new HashMap();
            object2 = "Event";
            string2 = "PLPExperiment";
            ((HashMap)object).put(object2, string2);
            this.y((HashMap)object);
        }
        object = ke0_0.a;
        int n4 = productListQuery.getCurrentPage();
        PLPRequest pLPRequest = new PLPRequest((String)object, n4);
        object = this.d;
        boolean bl5 = ((UserInformation)object).isUserOnline();
        string2 = ((UserInformation)object).getCustomerUUID();
        object = this.b;
        Object object4 = productListQuery;
        object = NewPlpRepo.getProducts$default((NewPlpRepo)object, productListQuery, bl5, (String)object3, string3, string2, false, false, bl2, pLPRequest, 96, null);
        object4 = new eu2_0(this);
        object2 = new mu2_1((eu2_0)object4);
        object4 = new yw1_0(this, 1);
        object3 = new vu2_0((Function1)object4);
        object = ((g53_0)object).f((o60_0)object2, (o60_0)object3);
        this.j1.b((yr0_2)object);
    }

    public final int r() {
        Object object = this.W;
        int n3 = 0;
        if (object != null) {
            int n4;
            object = object.entrySet().iterator();
            while ((n4 = object.hasNext()) != 0) {
                Number number = (Number)((Map.Entry)object.next()).getValue();
                n4 = number.intValue();
                if (n4 <= 0) continue;
                ++n3;
            }
        }
        return n3;
    }

    public final int s() {
        return ((Number)this.O1.getValue()).intValue();
    }

    public final BE3 t() {
        z40_0.Companion.getClass();
        Object object = z40$a.a((Context)this.a).a;
        String string2 = "enable_filter_nudge";
        int n3 = object.g(string2);
        int n4 = 1;
        object = n3 == n4 ? BE3.FILTER_NUDGE : BE3.FILTER_NORMAL;
        return object;
    }

    public final boolean u() {
        Object object = this.M;
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
                object = this.M;
                if (object != null) {
                    object = ((ProductsList)object).getPagination();
                } else {
                    n4 = 0;
                    object = null;
                }
                Intrinsics.checkNotNull(object);
                n4 = ((Pagination)object).getCurrentPage();
                ProductsList productsList = this.M;
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

    public final boolean v(boolean bl2) {
        boolean bl3;
        boolean bl4 = false;
        if (!bl2) {
            long l2;
            long l3 = k7.p();
            Long l4 = this.b1;
            long l7 = 0L;
            long l8 = l4 != null ? l4 : l7;
            long l12 = 1L;
            l8 += l12;
            l4 = this.c1;
            if (l4 != null) {
                l7 = l4;
            }
            if ((l2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) < 0 && (l2 = l8 == l3 ? 0 : (l8 < l3 ? -1 : 1)) <= 0) {
                return false;
            }
        }
        if (((bl3 = tr2_2.v(bl2)) || (bl2 = tr2_2.n(bl2))) && !(bl2 = this.c())) {
            bl4 = true;
        }
        return bl4;
    }

    public final boolean w() {
        return (Boolean)this.F1.getValue();
    }

    public final void y(HashMap hashMap) {
        String string2 = this.k();
        Object object = ProductsList.Companion;
        String string3 = ((ProductsList$Companion)object).getSEARCH_PAGE();
        boolean bl2 = true;
        boolean bl3 = kotlin.text.b.i(string2, string3, bl2);
        string3 = "PageType";
        if (bl3) {
            string2 = "SearchListingPage";
            hashMap.put(string3, string2);
        } else {
            String string4;
            string2 = this.k();
            bl3 = kotlin.text.b.i(string2, string4 = ((ProductsList$Companion)object).getCATEGORY_PAGE(), bl2);
            if (bl3) {
                string2 = "CategoryListingPage";
                hashMap.put(string3, string2);
            } else {
                string2 = this.k();
                bl3 = kotlin.text.b.i(string2, string4 = ((ProductsList$Companion)object).getCURATED_PAGE(), bl2);
                if (bl3) {
                    string2 = "CuratedListingPage";
                    hashMap.put(string3, string2);
                } else {
                    string2 = this.k();
                    bl3 = kotlin.text.b.i(string2, (String)(object = ((ProductsList$Companion)object).getBRAND_PAGE()), bl2);
                    if (bl3) {
                        string2 = "BrandListingPage";
                        hashMap.put(string3, string2);
                    } else {
                        string2 = "WebCategoryListingPage";
                        hashMap.put(string3, string2);
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z(boolean bl2) {
        int n3;
        Object object;
        Object object2;
        bv2_0 bv2_02 = this;
        HashMap hashMap = this.V;
        if (hashMap == null) return;
        Intrinsics.checkNotNull(hashMap);
        boolean bl3 = hashMap.isEmpty();
        if (bl3) {
            return;
        }
        HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
        bl3 = false;
        hashMap = null;
        Object object3 = "";
        if (bl2) {
            object2 = this.M;
            if (object2 == null || (object2 = ((ProductsList)object2).getFreeTextSearch()) == null) {
                object2 = object3;
            }
            object = "Name";
            hashMap2.put(object, object2);
            object2 = bv2_02.V;
            if (object2 != null) {
                n3 = ((HashMap)object2).size();
                object2 = n3;
            } else {
                n3 = 0;
                object2 = null;
            }
            object = "count";
            hashMap2.put(object, object2);
        }
        object2 = new StringBuilder();
        object = new StringBuilder();
        if (bl2) {
            hashMap = new Bundle();
        }
        Object object4 = bv2_02.V;
        Intrinsics.checkNotNull(object4);
        object4 = ((HashMap)object4).keySet().iterator();
        Object object5 = object3;
        while (true) {
            Object object6;
            boolean bl4;
            boolean bl5;
            int n4;
            Object object7;
            Object object8;
            boolean bl6;
            Iterator iterator;
            String string2;
            String string3;
            int n7 = object4.hasNext();
            String string4 = "/";
            String string5 = "-";
            String string6 = ",";
            if (n7 != 0) {
                Object e2 = object4.next();
                string3 = "next(...)";
                Intrinsics.checkNotNullExpressionValue(e2, string3);
                string2 = (String)e2;
                iterator = bv2_02.V;
                Intrinsics.checkNotNull(iterator);
                iterator = (HashSet)((HashMap)((Object)iterator)).get(string2);
                if (bl2) {
                    bl6 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl6) {
                        ((StringBuilder)object2).append(string6);
                    }
                    ((StringBuilder)object2).append(string2);
                }
                object8 = new StringBuilder();
                Intrinsics.checkNotNull(iterator);
                iterator = ((HashSet)((Object)iterator)).iterator();
                Intrinsics.checkNotNullExpressionValue(iterator, "iterator(...)");
                object7 = object3;
            } else {
                int n8;
                object3 = bv2_02.V;
                Intrinsics.checkNotNull(object3);
                object4 = "pricerange";
                n4 = ((HashMap)object3).containsKey(object4);
                if (n4 && (n4 = bv2_02.d0) != (n8 = -1) && (n7 = bv2_02.e0) != n8) {
                    object4 = "PRICE-";
                    object3 = D70.b(n4, n7, (String)object4, string6);
                    n8 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                    if (!n8) {
                        object3 = n1.a((String)object5, string4, (String)object3);
                    }
                    object5 = object3;
                    if (bl2 && hashMap != null) {
                        n4 = bv2_02.d0;
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append(n4);
                        ((StringBuilder)object4).append(string5);
                        ((StringBuilder)object4).append(n4);
                        object3 = ((StringBuilder)object4).toString();
                        object4 = "Price";
                        hashMap.putString((String)object4, (String)object3);
                    }
                }
                iterator = bv2_02.g1;
                object3 = "number_of_filters";
                object4 = "plp_source_details";
                String string7 = "plp_source";
                if (bl2) {
                    String string8;
                    Object object9;
                    int n10;
                    String string9;
                    string4 = "Section";
                    object2 = ((StringBuilder)object2).toString();
                    hashMap2.put(string4, object2);
                    object2 = "Values";
                    object = ((StringBuilder)object).toString();
                    hashMap2.put(object2, object);
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                    if (n3 == 0) {
                        object2 = new Bundle();
                        object = bv2_02.h1;
                        object2.putString(string7, (String)object);
                        object = bv2_02.i1;
                        object2.putString((String)object4, (String)object);
                        n8 = this.r();
                        object2.putInt("no_of_filters", n8);
                        object = new Bundle();
                        n8 = this.r();
                        object4 = String.valueOf(n8);
                        object.putString((String)object3, (String)object4);
                        n4 = (int)(bv2_02.k1 ? 1 : 0);
                        object3 = String.valueOf(n4 != 0);
                        object.putString("top_category_used", (String)object3);
                        object8 = object3;
                        bl5 = false;
                        bl4 = false;
                        long l2 = 0L;
                        int n14 = 65023;
                        object3 = new AnalyticsData(null, null, null, l2, null, null, null, null, null, (Bundle)object, null, null, null, null, null, null, n14, null);
                        object = AnalyticsManager.Companion;
                        object8 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                        object4 = "/APPLY";
                        object6 = Ft2.a((String)object5, (String)object4);
                        string9 = o72_0.a;
                        n10 = 16;
                        object9 = object3;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object8, "Filter", object6, string9, (AnalyticsData)object3, null, n10, null);
                        object8 = ((NewCustomEventsRevamp)((Object)iterator)).getEC_PRODUCT_LIST_INTERACTIONS();
                        object9 = o72_0.a;
                        String string10 = bv_0.a((AnalyticsManager$Companion)object);
                        String string11 = cv_0.a((AnalyticsManager$Companion)object);
                        object7 = "filter applied";
                        string9 = "plp_filter_apply";
                        string8 = "plp screen";
                        int n15 = 1536;
                        object6 = object5;
                        NewCustomEventsRevamp.newPushCustomEvent$default(iterator, (String)object8, (String)object7, (String)object5, string9, (String)object9, string8, string10, (Bundle)object2, string11, false, null, n15, null);
                    }
                    object7 = AnalyticsManager.Companion.getInstance().getCt();
                    object3 = object8;
                    object9 = null;
                    string8 = null;
                    n3 = 0;
                    boolean bl7 = false;
                    object = null;
                    n8 = 0;
                    object4 = null;
                    long l3 = 0L;
                    string4 = null;
                    string5 = null;
                    string6 = null;
                    string3 = null;
                    iterator = null;
                    bl5 = false;
                    object6 = null;
                    Object object10 = object8;
                    bl6 = false;
                    object8 = null;
                    Object object11 = object7;
                    object7 = null;
                    bl4 = false;
                    string9 = null;
                    n10 = 65279;
                    object2 = object3 = new AnalyticsData(null, null, null, l3, null, null, null, null, hashMap2, null, null, null, null, null, null, null, n10, null);
                    object3 = object11;
                    ((CleverTapEvents)object11).filterApplied((AnalyticsData)object10);
                    object3 = FirebaseEvents.Companion.getInstance();
                    object2 = "filter_applied";
                    ((FirebaseEvents)object3).sendEvent((String)object2, (Bundle)hashMap);
                } else {
                    hashMap = new Bundle();
                    object2 = bv2_02.h1;
                    hashMap.putString(string7, (String)object2);
                    object2 = bv2_02.i1;
                    hashMap.putString((String)object4, (String)object2);
                    object2 = new Bundle();
                    int n16 = this.r();
                    object = String.valueOf(n16);
                    object2.putString((String)object3, (String)object);
                    object8 = object3;
                    bl5 = false;
                    bl4 = false;
                    long l4 = 0L;
                    int n17 = 65023;
                    object3 = new AnalyticsData(null, null, null, l4, null, null, null, null, null, (Bundle)object2, null, null, null, null, null, null, n17, null);
                    object2 = AnalyticsManager.Companion;
                    object8 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
                    object = "/RESET";
                    object6 = Ft2.a((String)object5, (String)object);
                    String string12 = o72_0.a;
                    int n18 = 16;
                    Object object12 = object3;
                    GTMEvents.pushButtonTapEvent$default((GTMEvents)object8, "Filter", object6, string12, (AnalyticsData)object3, null, n18, null);
                    object8 = ((NewCustomEventsRevamp)((Object)iterator)).getEC_PRODUCT_LIST_INTERACTIONS();
                    object12 = o72_0.a;
                    String string13 = bv_0.a((AnalyticsManager$Companion)object2);
                    String string14 = cv_0.a((AnalyticsManager$Companion)object2);
                    object7 = "filter remove all";
                    string12 = "plp_filter_remove";
                    String string15 = "plp screen";
                    int n19 = 1536;
                    object6 = object5;
                    NewCustomEventsRevamp.newPushCustomEvent$default(iterator, (String)object8, (String)object7, (String)object5, string12, (String)object12, string15, string13, (Bundle)hashMap, string14, false, null, n19, null);
                }
                bl3 = false;
                hashMap = null;
                bv2_02.k1 = false;
                return;
            }
            while (bl5 = iterator.hasNext()) {
                object6 = object3;
                object3 = iterator.next();
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                object3 = (String)object3;
                bl4 = TextUtils.isEmpty((CharSequence)object7);
                object7 = !bl4 ? n1.a((String)object7, string6, (String)object3) : object3;
                if (bl2) {
                    bl4 = TextUtils.isEmpty((CharSequence)object);
                    if (!bl4) {
                        ((StringBuilder)object).append(string6);
                    }
                    if (!(bl4 = TextUtils.isEmpty((CharSequence)object8))) {
                        ((StringBuilder)object8).append(string6);
                    }
                    ((StringBuilder)object).append((String)object3);
                    ((StringBuilder)object8).append((String)object3);
                }
                object3 = object6;
            }
            object6 = object3;
            n4 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
            if (!n4) {
                n4 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                object3 = n4 == 0 ? KW.a((String)object5, string4, string2, string5, (String)object7) : n1.a(string2, string5, (String)object7);
                object5 = object3;
            }
            if (bl2 && hashMap != null) {
                object3 = ((StringBuilder)object8).toString();
                hashMap.putString(string2, (String)object3);
            }
            object3 = object6;
        }
    }
}

