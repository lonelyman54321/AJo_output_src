/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from j7
 */
public final class j7_0
extends Hj {
    public final Application a;
    public AjioHomeActivity b;
    public final hh3_2 c;
    public final CategoryNavigationRepo d;
    public final zr1_1 e;
    public final hh3_2 f;
    public AjioHomeActivity g;
    public final t30_0 h;
    public String i;
    public String j;
    public String k;

    public j7_0(Application object) {
        Intrinsics.checkNotNullParameter(object, "mApplication");
        super((Application)object);
        this.a = object;
        Object object2 = new b7_0(this, 0);
        this.c = object2 = yr1_2.b((Function0)object2);
        this.d = object2 = new CategoryNavigationRepo((Context)object);
        super();
        this.e = object;
        super(this);
        object = yr1_2.b((Function0)object);
        this.f = object;
        super();
        this.h = object;
        object = "";
        this.i = object;
        this.j = object;
        this.k = object;
    }

    public final void b(String object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "store");
        Object object2 = (jo_2)this.f.getValue();
        Object object3 = "";
        object2 = ((sw_0)object2).getPreference("cms_navigation_nodes", (String)object3);
        Object object4 = "just(...)";
        if (object2 != null && (n3 = ((String)object2).length()) != 0 && (object2 = (NavigationParent)JsonUtils.fromJson((String)object2, (Class)(object3 = NavigationParent.class))) != null) {
            object2 = g53_0.d(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        } else {
            object2 = g53_0.d(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        }
        object2 = g53_0.d(Boolean.FALSE);
        object4 = new d7_0(this, (String)object);
        object = new e7_0((d7_0)object4);
        object4 = new n53_0((q63_0)object2, (bx0_2)object);
        object = qt2_2.c;
        object = ((g53_0)object4).h((Scheduler)object);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new f7_0(this);
        object4 = new g7_0(object2);
        object2 = new h7_0(this, 0);
        object3 = new i7((h7_0)object2);
        object = ((g53_0)object).f((o60_0)object4, (o60_0)object3);
        this.h.b((yr0_2)object);
    }

    public final List c(List object) {
        ArrayList<lq_2> arrayList = new ArrayList<lq_2>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                CMSNavigation cMSNavigation = (CMSNavigation)object.next();
                lq_2 lq_22 = new lq_2(cMSNavigation, false);
                arrayList.add(lq_22);
            }
        }
        return arrayList;
    }

    public final void d(j7_0 j7_02, CMSNavigation cMSNavigation) {
        int n3;
        Object object;
        Object object2 = j7_02;
        Intrinsics.checkNotNullParameter(j7_02, "viewModel");
        String string2 = null;
        if (cMSNavigation != null) {
            object = cMSNavigation.getUrl();
        } else {
            n3 = 0;
            object = null;
        }
        if (object == null || (n3 = ((String)object).length()) == 0) {
            object = this;
        } else {
            Object object3 = kj0_1.g();
            object = this;
            Object object4 = this.b;
            String string3 = cMSNavigation != null ? cMSNavigation.getUrl() : null;
            Boolean bl2 = Boolean.TRUE;
            Boolean bl3 = Boolean.FALSE;
            String string4 = "nav";
            boolean bl4 = true;
            ((kj0_1)object3).q((Activity)object4, string3, 0, null, 0, null, bl4, null, null, null, null, string4, bl2, bl3, 0);
            object3 = ((j7_0)object2).i;
            object4 = ((j7_0)object2).j;
            boolean bl5 = TextUtils.isEmpty((CharSequence)object4);
            string3 = "-";
            if (!bl5) {
                object4 = ((j7_0)object2).j;
                object3 = n1.a((String)object3, string3, (String)object4);
            }
            if (!(bl5 = TextUtils.isEmpty((CharSequence)(object4 = ((j7_0)object2).k)))) {
                object2 = ((j7_0)object2).k;
                object3 = n1.a((String)object3, string3, (String)object2);
            }
            object2 = bv2_0.Companion;
            object4 = kv2_0.PLP_MENU;
            object2.getClass();
            bv2_0.a2 = object4;
            bv2_0.Z1 = object3;
            if (cMSNavigation != null) {
                string2 = cMSNavigation.getName();
            }
            jq_1.a(string2);
        }
    }
}

