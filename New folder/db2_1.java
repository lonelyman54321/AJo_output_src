/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from db2
 */
public class db2_1
extends jD3 {
    public UserRepo A;
    public final hh3_2 B;
    public final zr1_1 C;
    public final NewCustomEventsRevamp D;
    public final ux2_1 a;
    public final t30_0 b;
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
    public final zr1_1 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final zr1_1 q;
    public final zr1_1 r;
    public final zr1_1 s;
    public final zr1_1 t;
    public final zr1_1 u;
    public final zr1_1 v;
    public boolean w;
    public String x;
    public RtbRepo y;
    public jH2 z;

    public db2_1(ux2_1 object) {
        Intrinsics.checkNotNullParameter(object, "postOrderUseCase");
        this.a = object;
        this.b = object = new t30_0();
        this.c = object = new zr1_1();
        this.d = object;
        this.e = object = new zr1_1();
        this.f = object;
        this.g = object = new zr1_1();
        this.h = object;
        new zr1_1();
        this.i = object = new zr1_1();
        this.j = object;
        this.k = object = new zr1_1();
        this.l = object;
        this.m = object = new zr1_1();
        this.n = object;
        this.o = object = new zr1_1();
        this.p = object;
        this.q = object = new zr1_1();
        this.r = object;
        this.s = object = new zr1_1();
        this.t = object;
        this.u = object = new zr1_1();
        this.v = object;
        this.x = "return";
        object = new ra2_1(this, 0);
        this.B = object = yr1_2.b((Function0)object);
        this.C = object = new zr1_1();
        this.D = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "orderId");
        aW aW2 = md3_0.c(this);
        db2$a db2$a = new db2$a(this, string2, null);
        Ae3.d(aW2, null, null, db2$a, 3);
    }

    public final UserInformation c() {
        return (UserInformation)this.B.getValue();
    }

    public final void d(String string2, String string3, Bundle bundle, String string4) {
        String string5 = "return_debug";
        Intrinsics.checkNotNullParameter(string5, "eventName");
        Intrinsics.checkNotNullParameter(string2, "eventCategory");
        Intrinsics.checkNotNullParameter(string3, "eventAction");
        Intrinsics.checkNotNullParameter(string4, "eventLabel");
        String string6 = "return reason selection screen";
        Intrinsics.checkNotNullParameter(string6, "screenName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object object = AnalyticsManager.Companion;
        String string7 = bv_0.a((AnalyticsManager$Companion)object);
        String string8 = cv_0.a((AnalyticsManager$Companion)object);
        object = this;
        NewCustomEventsRevamp.newPushCustomEvent$default(this.D, string2, string3, string4, string5, string6, string6, string7, bundle, string8, false, null, 1536, null);
    }
}

