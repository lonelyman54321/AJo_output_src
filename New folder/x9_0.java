/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.kmm.shared.model.request.HomeReq;
import com.ril.ajio.kmm.shared.util.CommonFlow;
import com.ril.ajio.kmm.shared.util.CommonFlowKt;
import com.ril.ajio.services.data.Home.CategoryPageDetail;
import com.ril.ajio.services.data.Home.HomeCategory;
import com.ril.ajio.services.data.Home.LuxeHomeFooter;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from X9
 */
public final class x9_0
extends Hj {
    public final LinkedHashMap A;
    public final LinkedHashMap B;
    public boolean C;
    public ArrayList D;
    public boolean E;
    public LuxeHomeFooter F;
    public oo_0 G;
    public Bundle H;
    public ArrayList I;
    public String J;
    public String K;
    public final n9_0 a;
    public final jo_2 b;
    public final t30_0 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final kb3_2 k;
    public final CommonFlow l;
    public final zr1_1 m;
    public final zr1_1 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final gw_2 q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public NativeCategoryNavigationListDetail y;
    public int z;

    public x9_0(n9_0 bundle, Application application) {
        int n3;
        Intrinsics.checkNotNullParameter(bundle, "ajioHomeRepo");
        Intrinsics.checkNotNullParameter(application, "application");
        super(application);
        this.a = bundle;
        application = this.getApplication();
        bundle = new jo_2((Context)application);
        this.b = bundle;
        bundle = new t30_0();
        this.c = bundle;
        bundle = new zr1_1();
        this.d = bundle;
        this.e = bundle;
        bundle = new zr1_1();
        this.f = bundle;
        this.g = bundle;
        bundle = new zr1_1();
        this.h = bundle;
        bundle = new zr1_1();
        this.i = bundle;
        this.j = bundle;
        ResponseStatusType responseStatusType = ResponseStatusType.API_LOADING;
        bundle = new BaseResponse(responseStatusType, null, null, null, null, null, 62, null);
        bundle = lb3_2.a(bundle);
        this.k = bundle;
        bundle = CommonFlowKt.asCommonFlow((es0_2)bundle);
        this.l = bundle;
        bundle = new zr1_1();
        this.m = bundle;
        this.n = bundle;
        bundle = new zr1_1();
        this.o = bundle;
        this.p = bundle;
        bundle = new gw_2(null);
        this.q = bundle;
        new LinkedHashMap();
        bundle = "";
        this.r = bundle;
        this.s = bundle;
        this.x = n3 = -1;
        this.z = n3;
        this.A = bundle = new LinkedHashMap();
        this.B = bundle = new LinkedHashMap();
        this.H = bundle = new Bundle();
    }

    public static String d() {
        String string2;
        boolean bl2;
        Object object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if (bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_LUXE.getStoreId())) {
            object = CMSConfigInitializer.INSTANCE.getLuxeDefaultHomePageUrl();
        } else {
            object = od3_2.a();
            bl2 = Intrinsics.areEqual(object, string2 = ld3_2.STORE_AJIOGRAM.getStoreId());
            if (bl2) {
                bl2 = hu1_2.e();
                if (bl2) {
                    object = "";
                } else {
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    string2 = "ajiogram_home_page_default_id";
                    object = ((ao0_0)object).b(string2);
                }
            } else {
                object = x9_0.h();
            }
        }
        return object;
    }

    public static String h() {
        boolean bl2 = hu1_2.e();
        if (bl2) {
            return "";
        }
        z40$a z40$a = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.b("unisex_home_page_id");
    }

    public final void b() {
        int n3;
        int n4 = this.z;
        int n7 = -1;
        if (n4 != n7) {
            return;
        }
        ArrayList<NativeCategoryNavigationListDetail> arrayList = new ArrayList<NativeCategoryNavigationListDetail>();
        Object object = new NativeCategoryNavigationListDetail();
        String string2 = x9_0.d();
        ((NativeCategoryNavigationListDetail)object).setNativeCategoryPageId(string2);
        string2 = "";
        ((NativeCategoryNavigationListDetail)object).setNativeCategoryName(string2);
        boolean bl2 = true;
        ((NativeCategoryNavigationListDetail)object).setDefaultNode(bl2);
        arrayList.add((NativeCategoryNavigationListDetail)object);
        object = null;
        for (n7 = 0; n7 < (n3 = 6); ++n7) {
            NativeCategoryNavigationListDetail nativeCategoryNavigationListDetail = new NativeCategoryNavigationListDetail();
            nativeCategoryNavigationListDetail.setShimmer(bl2);
            arrayList.add(nativeCategoryNavigationListDetail);
        }
        object = this.I;
        if (object == null) {
            object = this.m;
            bl2 = false;
            string2 = null;
            ((LiveData)object).i(null);
            ((LiveData)object).i(arrayList);
            this.I = arrayList;
        }
    }

    public final boolean c() {
        String string2;
        String string3;
        jo_2 jo_22;
        String string4;
        String string5 = this.r;
        boolean bl2 = w61_0.b(string5);
        boolean bl3 = true;
        if (bl2 ? !(bl2 = TextUtils.isEmpty((CharSequence)(string5 = this.r))) && (bl2 = (string5 = this.r).equals(string4 = (jo_22 = this.b).getPreference("CORE_CATEGORY_ID", string3 = ""))) : !(bl2 = TextUtils.isEmpty((CharSequence)(string5 = this.r))) && ((bl2 = kotlin.text.b.h(string5 = this.r, string2 = "/men", bl3)) || (bl2 = kotlin.text.b.h(string5 = this.r, string2 = "/women", bl3)) || (bl2 = kotlin.text.b.h(string5 = this.r, string2 = "/kids", bl3)))) {
            return bl3;
        }
        return false;
    }

    public final void e() {
        Object object;
        boolean bl2;
        Object object2;
        Object object3 = fq2_1.i;
        if (object3 == null) {
            object3 = FirebasePerformance.getInstance();
            object2 = "home_cms_top_bar_api_time";
            fq2_1.i = object3 = ((FirebasePerformance)object3).newTrace((String)object2);
        }
        if ((object3 = fq2_1.i) != null) {
            ((Trace)object3).start();
        }
        object3 = od3_2.a();
        object2 = od3_2.a;
        int n3 = ((String)object2).length();
        if (n3 == 0) {
            object2 = od3_2.a();
        }
        object2 = (bl2 = Intrinsics.areEqual(object2, object = ld3_2.STORE_LUXE.getStoreId())) ? "TOP_BAR_NAV_2.0" : ((bl2 = hu1_2.d()) ? "TOP_BAR_NAV_3.0" : "TOP_BAR");
        this.a.getClass();
        object3 = n9_0.a((String)object3, (String)object2);
        object2 = new s9_0(this, 0);
        object = new T9(0, (Function1)object2);
        object2 = new Object();
        V9 v9 = new V9(0, (Function1)object2);
        object3 = ((g53_0)object3).f((o60_0)object, v9);
        this.c.b((yr0_2)object3);
    }

    public final void f() {
        Object object = this.D;
        zr1_1 zr1_12 = this.d;
        if (object == null) {
            int n3;
            jo_2 jo_22 = this.b;
            Object object2 = "";
            object = jo_22.getPreference("LUXE_CMS_CATEGORY_RESPONSE", (String)object2);
            if (object != null && (n3 = ((String)object).length()) != 0 && (object = (HomeCategory)JsonUtils.fromJson((String)object, (Class)(object2 = HomeCategory.class))) != null) {
                n3 = (int)(this.C ? 1 : 0);
                if (n3 == 0) {
                    object2 = this.r;
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    this.t = n3;
                }
                object2 = DataCallback.Companion;
                object = ((DataCallback$Companion)object2).onSuccess(object);
                zr1_12.i(object);
            } else {
                this.g();
            }
        } else {
            boolean bl2 = this.C;
            if (!bl2) {
                object = this.r;
                this.t = bl2 = TextUtils.isEmpty((CharSequence)object);
            }
            object = DataCallback.Companion;
            HomeCategory homeCategory = new HomeCategory();
            Object object3 = new ArrayList();
            CategoryPageDetail categoryPageDetail = new CategoryPageDetail();
            categoryPageDetail.setPosition("Section2");
            ArrayList arrayList = this.D;
            categoryPageDetail.setNativeCategoryNavigationListDetails(arrayList);
            ((ArrayList)object3).add(categoryPageDetail);
            homeCategory.setPageDetails((ArrayList)object3);
            object3 = Unit.a;
            object = ((DataCallback$Companion)object).onSuccess(homeCategory);
            zr1_12.i(object);
        }
    }

    public final void fetchHomeData(ScreenInfo screenInfo, String string2, HomeReq homeReq, Map map2, Map map3) {
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(homeReq, "homeReq");
        aW aW2 = md3_0.c(this);
        X9$a x9$a = new X9$a(this);
        Map map4 = map2;
        map4 = (HashMap)map2;
        Map map5 = map3;
        map5 = (HashMap)map3;
        X9$b x9$b = new X9$b(screenInfo, string2, homeReq, (HashMap)map4, (HashMap)map5, this, null);
        Ae3.d(aW2, x9$a, null, x9$b, 2);
    }

    public final void g() {
        Object object;
        Object object2 = fq2_1.i;
        if (object2 == null) {
            object2 = FirebasePerformance.getInstance();
            object = "home_cms_top_bar_api_time";
            fq2_1.i = object2 = ((FirebasePerformance)object2).newTrace((String)object);
        }
        if ((object2 = fq2_1.i) != null) {
            ((Trace)object2).start();
        }
        object2 = n9_0.f;
        this.a.getClass();
        object2 = n9_0.a("LUXE", (String)object2);
        object = new O9(this);
        P9 p9 = new P9((Function1)object);
        object = new Object();
        R9 r9 = new R9((Q9)object);
        object2 = ((g53_0)object2).f(p9, r9);
        this.c.b((yr0_2)object2);
    }

    public final boolean i(String string2) {
        Intrinsics.checkNotNullParameter(string2, "storeType");
        Object object = ld3_2.STORE_LUXE.getStoreId();
        boolean bl2 = true;
        int n3 = kotlin.text.b.i(string2, (String)object, bl2);
        object = this.b;
        int n4 = -1;
        if (n3 != 0) {
            string2 = "LUXE_STORE_CHANGE_COACH_MARK";
            n3 = ((sw_0)object).getPreference(string2, n4);
        } else {
            string2 = "AJIO_STORE_CHANGE_COACH_MARK";
            n3 = ((sw_0)object).getPreference(string2, n4);
        }
        if (n3 != n4) {
            bl2 = false;
        }
        return bl2;
    }

    public final void j(Bundle object) {
        boolean bl2;
        String string2;
        String string3 = "CORE_CATEGORY_ID";
        boolean bl3 = true;
        Object object2 = "";
        if (object != null) {
            boolean bl4;
            boolean bl5 = object.containsKey(string3);
            if (bl5) {
                string2 = object.getString(string3);
                if (string2 == null) {
                    string2 = object2;
                }
                this.r = string2;
            }
            if (bl4 = object.containsKey(string2 = "CORE_CATEGORY_NAME")) {
                if ((string2 = object.getString(string2)) == null) {
                    string2 = object2;
                }
                this.s = string2;
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)(string2 = this.r))) && !(bl5 = TextUtils.isEmpty((CharSequence)(string2 = this.s)))) {
                this.t = bl3;
            }
            if (bl4 = object.containsKey(string2 = "search_landing_experiment")) {
                object.getString(string2);
            }
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)(object = this.r))) {
            bl2 = og1_1.c();
            if (bl2) {
                object = "LUXE";
                this.s = object;
            } else {
                object = this.b;
                string2 = ((jo_2)object).e();
                if (string2 == null) {
                    string2 = object2;
                }
                if ((object = ((sw_0)object).getPreference(string3, (String)object2)) != null) {
                    object2 = object;
                }
                this.r = object2;
                this.s = string2;
            }
            this.t = bl3;
        }
    }

    public final void onCleared() {
        super.onCleared();
        t30_0 t30_02 = this.c;
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.c;
            t30_02.dispose();
        }
    }
}

