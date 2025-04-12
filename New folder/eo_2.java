/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.CountDownTimer
 */
import android.content.Context;
import android.os.CountDownTimer;
import com.google.firebase.perf.metrics.Trace;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.launch.DynamicIconChangeWorker;
import com.ril.ajio.services.data.appsflyer.AppsflyerSessionEvent;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eo
 */
public final class eo_2
implements jm0_1 {
    public CountDownTimer a;
    public long b;
    public long c;
    public jo_2 d;

    public final void A(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        im0.a(mu1_12);
    }

    public final void onDestroy(mu1_1 mu1_12) {
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        Intrinsics.checkNotNullParameter(mu1_12, string2);
    }

    public final void onStart(mu1_1 object) {
        long l2;
        Intrinsics.checkNotNullParameter(object, "owner");
        im0.c(object);
        boolean bl2 = false;
        object = null;
        bo1_1.e = false;
        Class<AppsflyerSessionEvent> clazz = AJIOApplication.Companion;
        clazz.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object2 = new jo_2((Context)aJIOApplication);
        this.d = object2;
        object2 = DynamicIconChangeWorker.Companion;
        object2.getClass();
        DynamicIconChangeWorker.b = true;
        long l3 = this.b;
        long l4 = 0L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0 && (l7 = (l2 = (l3 = this.c) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)((Object)clazz), (z40$a)object2).a.b("appsflyerSessionEvent");
            clazz = AppsflyerSessionEvent.class;
            if ((object2 = (AppsflyerSessionEvent)JsonUtils.fromJson((String)object2, clazz)) != null && (object2 = ((AppsflyerSessionEvent)object2).isEnabled()) != null) {
                bl2 = (Boolean)object2;
            }
            if (bl2) {
                long l8 = this.b;
                object = new do_1(this, l8);
                object = object.start();
                this.a = object;
            }
        }
    }

    public final void onStop(mu1_1 object) {
        boolean bl2;
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        AjioHomeActivity.Companion.getClass();
        object = AjioHomeActivity.D1;
        if (object != null) {
            ((AbstractCollection)object).clear();
        }
        object = null;
        AjioHomeActivity.D1 = null;
        fq2_1.a.stop();
        object2 = fq2_1.c;
        if (object2 != null) {
            ((Trace)object2).stop();
        }
        fq2_1.c = null;
        object2 = fq2_1.d;
        if (object2 != null) {
            ((Trace)object2).stop();
        }
        fq2_1.d = null;
        fq2_1.e.stop();
        object2 = fq2_1.f;
        if (object2 != null) {
            ((Trace)object2).stop();
        }
        fq2_1.f = null;
        fq2_1.g.stop();
        object2 = fq2_1.b;
        if (object2 != null) {
            ((Trace)object2).stop();
        }
        fq2_1.b = null;
        fq2_1.a();
        bo1_1.a = false;
        bo1_1.e = bl2 = true;
        bo1_1.b = false;
        DynamicIconChangeWorker.Companion.getClass();
        DynamicIconChangeWorker.b = false;
        jo_2 jo_22 = this.d;
        String string2 = "";
        mz3_0.b(jo_22, false, string2);
        object2 = this.a;
        if (object2 != null) {
            object2.cancel();
        }
        this.a = null;
        this.d = null;
    }

    public final void p(mu1_1 mu1_12) {
        Intrinsics.checkNotNullParameter(mu1_12, "owner");
        im0.b(mu1_12);
    }

    public final void w(mu1_1 mu1_12) {
        String string2 = "owner";
        Intrinsics.checkNotNullParameter(mu1_12, string2);
        Intrinsics.checkNotNullParameter(mu1_12, string2);
    }
}

