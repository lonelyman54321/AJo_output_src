/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import com.ril.ajio.services.utils.JsonUtils;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from HQ
 */
public final class hq_2
extends Hj {
    public final CategoryNavigationRepo a;
    public final zr1_1 b;
    public final zr1_1 c;
    public final zr1_1 d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final hh3_2 h;
    public final hh3_2 i;
    public final t30_0 j;

    public hq_2(Application object) {
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        Object object2 = new CategoryNavigationRepo((Context)object);
        this.a = object2;
        AjioApiConnector.INSTANCE.getNavigationTypeApi();
        this.b = object2 = new zr1_1();
        this.c = object2 = new zr1_1();
        this.d = object2 = new zr1_1();
        this.e = object2 = new zr1_1();
        this.f = object2 = new zr1_1();
        this.g = object2 = new zr1_1();
        object2 = new fq_2((Application)object);
        object = yr1_2.b((Function0)object2);
        this.h = object;
        super(this, 1);
        object = yr1_2.b((Function0)object);
        this.i = object;
        super();
        this.j = object;
    }

    public final void b(String object) {
        Intrinsics.checkNotNullParameter(object, "store");
        Object object2 = ld3_2.STORE_LUXE.getStoreId();
        int n3 = 1;
        boolean bl2 = kotlin.text.b.i((String)object, (String)object2, n3 != 0);
        Object object3 = "";
        Object object4 = this.i;
        Class<NavigationParent> clazz = NavigationParent.class;
        String string2 = "just(...)";
        if (bl2) {
            object2 = (jo_2)((hh3_2)object4).getValue();
            object4 = "luxe_cms_navigation_nodes";
            if ((object2 = ((sw_0)object2).getPreference((String)object4, (String)object3)) != null && (n3 = ((String)object2).length()) != 0 && (object2 = (NavigationParent)JsonUtils.fromJson((String)object2, clazz)) != null) {
                object3 = this.g;
                object4 = DataCallback.Companion;
                object2 = ((DataCallback$Companion)object4).onSuccess(object2);
                ((LiveData)object3).i(object2);
                object2 = g53_0.d(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
            } else {
                object2 = g53_0.d(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
            }
        } else {
            object2 = (jo_2)((hh3_2)object4).getValue();
            object4 = "cms_navigation_nodes";
            if ((object2 = ((sw_0)object2).getPreference((String)object4, (String)object3)) != null && (n3 = ((String)object2).length()) != 0 && (object2 = (NavigationParent)JsonUtils.fromJson((String)object2, clazz)) != null) {
                object3 = this.f;
                object4 = DataCallback.Companion;
                object2 = ((DataCallback$Companion)object4).onSuccess(object2);
                ((LiveData)object3).i(object2);
                object2 = g53_0.d(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
            } else {
                object2 = g53_0.d(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
            }
        }
        object3 = new yq_2(this, (String)object);
        object = new cq_2(0, (Function1)object3);
        object3 = new n53_0((q63_0)object2, (bx0_2)object);
        object = qt2_2.c;
        object = ((g53_0)object3).h((Scheduler)object);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new G8(this, 1);
        object3 = new dq_1(0, (Function1)object2);
        object2 = new I8(this, 1);
        object4 = new eq_1((I8)object2);
        object = ((g53_0)object).f((o60_0)object3, (o60_0)object4);
        this.j.b((yr0_2)object);
    }

    public final void onCleared() {
        super.onCleared();
        this.j.d();
    }
}

