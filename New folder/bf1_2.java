/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bF1
 */
public final class bf1_2
extends Hj {
    public final Application a;
    public final t30_0 b;
    public final hh3_2 c;
    public final CategoryNavigationRepo d;
    public final hh3_2 e;
    public final zr1_1 f;
    public AjioHomeActivity g;
    public AjioHomeActivity h;
    public String i;
    public String j;
    public String k;
    public String l;

    public bf1_2(Application object) {
        Intrinsics.checkNotNullParameter(object, "mApplication");
        super((Application)object);
        this.a = object;
        Object object2 = new t30_0();
        this.b = object2;
        object2 = new eq0_1(this, 1);
        this.c = object2 = yr1_2.b((Function0)object2);
        this.d = object2 = new CategoryNavigationRepo((Context)object);
        super(this, 0);
        object = yr1_2.b((Function0)object);
        this.e = object;
        J83.g(null);
        super();
        this.f = object;
        object = "";
        this.i = object;
        this.j = object;
        this.k = object;
        this.l = object;
    }

    public final void b() {
        int n3;
        Object object = (jo_2)this.c.getValue();
        Object object2 = "";
        object = ((sw_0)object).getPreference("luxe_cms_navigation_nodes", (String)object2);
        Object object3 = "just(...)";
        if (object != null && (n3 = ((String)object).length()) != 0 && (object = (NavigationParent)JsonUtils.fromJson((String)object, (Class)(object2 = NavigationParent.class))) != null) {
            object = g53_0.d(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        } else {
            object = g53_0.d(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        }
        object3 = new ft_1(this, 1);
        object2 = new xe1_1((ft_1)object3);
        object3 = new n53_0((q63_0)object, (bx0_2)object2);
        object = qt2_2.c;
        object = ((g53_0)object3).h((Scheduler)object);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = new ht_1(this, 1);
        object2 = new ye1_1((ht_1)object3);
        object3 = new ze1_1(this, 0);
        af1_2 af1_22 = new af1_2((ze1_1)object3);
        object = ((g53_0)object).f((o60_0)object2, af1_22);
        this.b.b((yr0_2)object);
    }

    public final void c(bf1_2 object, CMSNavigation cMSNavigation) {
        int n3;
        String string2;
        Intrinsics.checkNotNullParameter(object, "viewModel");
        String string3 = null;
        if (cMSNavigation != null) {
            string2 = cMSNavigation.getUrl();
        } else {
            n3 = 0;
            string2 = null;
        }
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = ((bf1_2)object).i;
            Object object2 = ((bf1_2)object).j;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
            Object object3 = "-";
            if (!bl2) {
                object2 = ((bf1_2)object).j;
                string2 = n1.a(string2, (String)object3, object2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((bf1_2)object).k)))) {
                object2 = ((bf1_2)object).k;
                string2 = n1.a(string2, (String)object3, object2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((bf1_2)object).l)))) {
                object = ((bf1_2)object).l;
                string2 = n1.a(string2, (String)object3, (String)object);
            }
            object = bv2_0.Companion;
            object2 = kv2_0.PLP_MENU;
            object.getClass();
            bv2_0.a2 = object2;
            bv2_0.Z1 = string2;
            object3 = kj0_1.g();
            AjioHomeActivity ajioHomeActivity = this.h;
            if (cMSNavigation != null) {
                string3 = cMSNavigation.getUrl();
            }
            String string4 = "nav";
            boolean bl3 = true;
            ((kj0_1)object3).v(ajioHomeActivity, string3, null, bl3, false, string4, 0);
        }
    }

    public final void onCleared() {
        super.onCleared();
        this.b.d();
    }
}

