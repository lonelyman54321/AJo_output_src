/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.widget.ImageView
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.model.PLPRequest;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.sis.StoreInfo;
import com.ril.ajio.services.query.ProductListQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from yW2
 */
public final class yw2_0
extends ow_2 {
    public String A;
    public boolean B;
    public final zr1_1 C;
    public final zr1_1 D;
    public final zr1_1 E;
    public final zr1_1 F;
    public final zr1_1 G;
    public final zr1_1 H;
    public final hh3_2 I;
    public final dw2_0 a;
    public final SU2 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;
    public final zr1_1 j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public final hh3_2 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final zr1_1 q;
    public final zr1_1 r;
    public String s;
    public String t;
    public String u;
    public StoreInfo v;
    public String w;
    public List x;
    public List y;
    public final t30_0 z;

    public yw2_0(dw2_0 object, SU2 object2, Application object3) {
        zr1_1 zr1_12;
        zr1_1 zr1_13;
        zr1_1 zr1_14;
        Intrinsics.checkNotNullParameter(object, "searchUseCases");
        Intrinsics.checkNotNullParameter(object2, "searchedRepository");
        Intrinsics.checkNotNullParameter(object3, "application");
        super((Application)object3);
        this.a = object;
        this.b = object2;
        this.c = object = new zr1_1();
        this.d = object = new zr1_1();
        this.e = object = new zr1_1();
        this.f = object = new zr1_1();
        this.g = object = new zr1_1();
        this.h = object = new zr1_1();
        this.i = object2 = new zr1_1();
        new zr1_1();
        this.j = zr1_14 = new zr1_1();
        zr1_1 zr1_15 = new zr1_1();
        this.k = zr1_13 = new zr1_1();
        this.l = zr1_12 = new zr1_1();
        Object object4 = new zr1_1();
        this.m = object4;
        object4 = new pw2_0(object3, 0);
        object3 = yr1_2.b((Function0)object4);
        this.n = object3;
        super();
        this.o = object3;
        this.p = object3;
        super();
        this.q = object3;
        this.r = object3;
        object3 = ld3_2.STORE_AJIO.getStoreId();
        this.w = object3;
        super();
        this.x = object3;
        super();
        this.y = object3;
        super();
        this.z = object3;
        this.A = "";
        this.C = object;
        this.D = object2;
        this.E = zr1_14;
        this.F = zr1_15;
        this.G = zr1_13;
        this.H = zr1_12;
        new ArrayList();
        object = new Object();
        this.I = object = yr1_2.b((Function0)object);
    }

    public static void f(String object) {
        Object object2;
        boolean bl2;
        if (object != null && (bl2 = ((String)object).equalsIgnoreCase((String)(object2 = ProductsList.Companion.getSEARCH_PAGE())))) {
            object = AnalyticsManager.Companion.getInstance();
            object2 = ((AnalyticsManager)object).getNewCustomEventsRevamp();
            String string2 = "";
            String string3 = "";
            String string4 = "non_redirected_slp_load";
            String string5 = "search plp screen";
            String string6 = "";
            int n3 = 1764;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, string3, null, string4, string5, null, null, null, string6, false, null, n3, null);
        }
    }

    public final boolean b() {
        String string2 = this.w;
        String string3 = ld3_2.STORE_AJIOGRAM.getStoreId();
        boolean bl2 = Intrinsics.areEqual(string2, string3);
        boolean bl3 = false;
        string3 = null;
        if (bl2) {
            String string4;
            String string5;
            string2 = od3_2.a;
            int n3 = string2.length();
            if (n3 == 0) {
                string2 = od3_2.a();
            }
            if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string5 = od3_2.a(), string4 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0)) == 0) {
                n3 = 0;
                string5 = null;
            } else {
                n3 = 1;
            }
            if (n3 == 0 && !(bl2 = Intrinsics.areEqual(string2, string5 = ld3_2.STORE_AJIOGRAM.getStoreId()))) {
                bl2 = false;
                string2 = null;
            } else {
                bl2 = true;
            }
            if (bl2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final void c(String object, boolean bl2, zr1_1 zr1_12, String object2) {
        Object object3;
        Object object4;
        int n3;
        if (object == null || (n3 = ((String)(object4 = ((Object)StringsKt.m0((CharSequence)object)).toString())).length()) == 0) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (!bl2) {
            object4 = z40_0.Companion;
            object3 = this.getApplication();
            object4.getClass();
            object4 = z40$a.a((Context)object3).a;
            object3 = "SearchAPI_Exp";
            ref$ObjectRef.element = object4 = ((ao0_0)object4).b((String)object3);
        }
        ProductListQuery productListQuery = new ProductListQuery();
        productListQuery.setQueryText((String)object);
        object = od3_2.a();
        object4 = ld3_2.STORE_AJIO.getStoreId();
        int n4 = Intrinsics.areEqual(object, object4);
        if (n4 != 0) {
            productListQuery.setStoreId((String)object2);
        } else {
            if (object2 == null) {
                object2 = od3_2.a();
            }
            productListQuery.setStoreId((String)object2);
        }
        object = z40_0.Companion;
        object2 = this.getApplication();
        object.getClass();
        n4 = z40$a.a((Context)object2).a.g("plp_page_size");
        productListQuery.setPageSize(n4);
        object = (Boolean)this.n.getValue();
        object.getClass();
        productListQuery.setUrgencyDriverEnabled((Boolean)object);
        object = this.t;
        productListQuery.setBrandCode((String)object);
        String string2 = z40$a.a((Context)this.getApplication()).a.b("plp_variant");
        object = ke0_0.a;
        int n7 = productListQuery.getCurrentPage();
        PLPRequest pLPRequest = new PLPRequest((String)object, n7);
        object = md3_0.c(this);
        object3 = object2;
        object2 = new yW2$a(this, productListQuery, string2, ref$ObjectRef, bl2, pLPRequest, zr1_12, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
    }

    public final void d(ImageView imageView, String object) {
        Object object2 = ld3_2.STORE_LUXE;
        Object object3 = object2.getStoreId();
        int n3 = Intrinsics.areEqual(object, object3);
        hh3_2 hh3_22 = this.I;
        boolean bl2 = true;
        if (n3 != 0) {
            if (imageView != null) {
                object = new da$a();
                ((da$a)object).k = bl2;
                ((da$a)object).g = bl2;
                ((da$a)object).s = bl2;
                object3 = hv3_0.K(R$string.acc_luxe_logo);
                ((da$a)object).b((String)object3);
                ((da$a)object).b = n3 = R$drawable.ajio_luxe_logo;
                object3 = (jo_2)hh3_22.getValue();
                object2 = object2.getStoreId();
                ((da$a)object).n = object2 = ((jo_2)object3).j((String)object2);
                ((da$a)object).u = imageView;
                ((da$a)object).i = bl2;
                ((da$a)object).a();
            }
        } else {
            object2 = ld3_2.STORE_AJIOGRAM;
            object3 = object2.getStoreId();
            boolean bl3 = Intrinsics.areEqual(object, object3);
            if (bl3) {
                if (imageView != null) {
                    object = new da$a();
                    ((da$a)object).k = bl2;
                    ((da$a)object).g = bl2;
                    ((da$a)object).s = bl2;
                    object3 = hv3_0.K(R$string.acc_fleek_logo);
                    ((da$a)object).b((String)object3);
                    ((da$a)object).b = n3 = R$drawable.fleek_logo;
                    object3 = (jo_2)hh3_22.getValue();
                    object2 = object2.getStoreId();
                    ((da$a)object).n = object2 = ((jo_2)object3).j((String)object2);
                    ((da$a)object).u = imageView;
                    ((da$a)object).i = bl2;
                    ((da$a)object).a();
                }
            } else if (imageView != null) {
                int n4;
                object = new da$a();
                ((da$a)object).k = bl2;
                ((da$a)object).g = bl2;
                ((da$a)object).s = bl2;
                object2 = hv3_0.K(R$string.acc_ajio_logo);
                ((da$a)object).b((String)object2);
                ((da$a)object).b = n4 = R$drawable.ajio_logo;
                object2 = (jo_2)hh3_22.getValue();
                object3 = ld3_2.STORE_AJIO.getStoreId();
                ((da$a)object).n = object2 = ((jo_2)object2).j((String)object3);
                ((da$a)object).u = imageView;
                ((da$a)object).i = bl2;
                ((da$a)object).a();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(String string2, String string3, String string4, String string5) {
        Object object = string3;
        String string6 = string4;
        String string7 = string5;
        String string8 = "screenName";
        Intrinsics.checkNotNullParameter(string2, string8);
        String string9 = "eventType";
        Intrinsics.checkNotNullParameter(string3, string9);
        String string10 = "destinationStore";
        Intrinsics.checkNotNullParameter(string4, string10);
        String string11 = "currentQueryString";
        Intrinsics.checkNotNullParameter(string5, string11);
        dw2_0 dw2_02 = this.a;
        dw2_02.getClass();
        Intrinsics.checkNotNullParameter(string2, string8);
        Intrinsics.checkNotNullParameter(string3, string9);
        Intrinsics.checkNotNullParameter(string4, string10);
        Intrinsics.checkNotNullParameter(string5, string11);
        string8 = "rilfnl";
        boolean bl2 = Intrinsics.areEqual(string4, string8);
        if (bl2) {
            string6 = ld3_2.STORE_AJIO.getStoreId();
        }
        string8 = string6;
        string6 = "zsr_impression";
        boolean bl3 = Intrinsics.areEqual(object, string6);
        object = bl3 ? "redirection widget impression" : "redirection widget click";
        string9 = object;
        Bundle bundle = E1.a("SearchTerm", string7);
        object = dw2_02.g;
        String string12 = dw2_02.h;
        String string13 = dw2_02.i;
        string7 = string9;
        string9 = "zero_search_interactions";
        string10 = "search screen";
        string11 = string12;
        dw2_02 = bundle;
        String string14 = string13;
        int n3 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "zero search interactions", string7, string8, string9, string2, string10, string12, (Bundle)dw2_02, string13, false, null, n3, null);
    }

    public final void onCleared() {
        super.onCleared();
        this.z.d();
    }
}

