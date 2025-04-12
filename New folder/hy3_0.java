/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.GPSLocationData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.query.QueryCustomer;
import io.reactivex.Scheduler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Hy3
 */
public final class hy3_0
extends Hj {
    public static final Hy3$a Companion;
    public final zr1_1 A;
    public final zr1_1 B;
    public double a;
    public double b;
    public int c;
    public int d;
    public final jo_2 e;
    public final jH2 f;
    public final UserRepo g;
    public final hh3_2 h;
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
    public final zr1_1 w;
    public final t30_0 x;
    public final zr1_1 y;
    public final zr1_1 z;

    static {
        Hy3$a hy3$a;
        Companion = hy3$a = new Object();
    }

    public hy3_0(Application object, BaseRepo object2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "application");
        super((Application)object);
        this.c = n3 = 101;
        this.d = n3;
        Context context = object.getApplicationContext();
        String string2 = "getApplicationContext(...)";
        Intrinsics.checkNotNullExpressionValue(context, string2);
        Object object3 = new jo_2(context);
        this.e = object3;
        context = object.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context, string2);
        this.f = object3 = new jH2(context);
        if (object2 == null) {
            super((Application)object);
        } else {
            object2 = (UserRepo)object2;
        }
        this.g = object2;
        object2 = new ra2_1(object, 1);
        object = yr1_2.b((Function0)object2);
        this.h = object;
        super();
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
        super();
        this.q = object;
        super();
        this.r = object;
        new zr1_1();
        super();
        this.s = object;
        new zr1_1();
        super();
        this.t = object;
        super();
        this.u = object;
        super();
        this.v = object;
        new zr1_1();
        super();
        this.w = object;
        super();
        this.x = object;
        super();
        this.y = object;
        this.z = object;
        super();
        this.A = object;
        this.B = object;
    }

    public /* synthetic */ hy3_0(Application application, BaseRepo baseRepo, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            baseRepo = null;
        }
        this(application, baseRepo);
    }

    public final void b(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "userPhoneNo");
        Intrinsics.checkNotNullParameter(object2, "userEmailId");
        object2 = new QueryCustomer();
        ((QueryCustomer)object2).setMobileNumber((String)object);
        object = this.m().getUserEmailId();
        ((QueryCustomer)object2).setEmail((String)object);
        object = this.g.requestOtpAccessProfile((QueryCustomer)object2);
        object2 = new ym_2(this, 2);
        fa2_0 fa2_02 = new fa2_0(object2);
        object2 = new rj0_1(this, 2);
        u33 u332 = new u33(1, (Function1)object2);
        object = ((g53_0)object).f(fa2_02, u332);
        this.x.b((yr0_2)object);
    }

    public final void c() {
        String string2;
        Object object = yn3_0.a;
        int n3 = this.c;
        String string3 = "STATE_IDLE";
        Object object2 = "STATE_SUCCESS";
        Object object3 = "STATE_FAILURE";
        Object object4 = "INVALID_STATE";
        switch (n3) {
            default: {
                string2 = object4;
                break;
            }
            case 103: {
                string2 = object3;
                break;
            }
            case 102: {
                string2 = object2;
                break;
            }
            case 101: {
                string2 = string3;
            }
        }
        int n4 = this.d;
        switch (n4) {
            default: {
                string3 = object4;
                break;
            }
            case 103: {
                string3 = object3;
                break;
            }
            case 102: {
                string3 = object2;
            }
            case 101: 
        }
        object3 = ", gps state: ";
        string2 = UX.c("locale pincode state: ", string2, (String)object3, string3);
        string3 = null;
        object2 = new Object[]{};
        ((yn3$a)object).a(string2, object2);
        int n7 = this.c;
        n3 = 103;
        if (n7 == n3 && (n7 = this.d) == (n3 = 102)) {
            double d2 = this.a;
            object3 = d2;
            double d5 = this.b;
            object4 = d5;
            n4 = 0;
            int n8 = 4;
            object2 = object;
            object = new GPSLocationData((Double)object3, (Double)object4, null, n8, null);
            this.j((GPSLocationData)object, false);
        }
    }

    public final void d() {
        aW aW2 = md3_0.c(this);
        Hy3$b hy3$b = new qg3_2(2, null);
        Ae3.d(aW2, null, null, hy3$b, 3);
    }

    public final void e() {
        aW aW2 = md3_0.c(this);
        Hy3$c hy3$c = new qg3_2(2, null);
        Ae3.d(aW2, null, null, hy3$c, 3);
    }

    public final void f() {
        aW aW2 = md3_0.c(this);
        Hy3$d hy3$d = new qg3_2(2, null);
        Ae3.d(aW2, null, null, hy3$d, 3);
    }

    public final void g() {
        aW aW2 = md3_0.c(this);
        Hy3$e hy3$e = new qg3_2(2, null);
        Ae3.d(aW2, null, null, hy3$e, 3);
    }

    public final void h() {
        this.g.deleteUserInformation();
    }

    public final void i() {
        int n3 = 2;
        Object object = h40_0.a;
        boolean bl2 = h40_0.Y0();
        object = bl2 ? "User_Unique_Id_v3" : "User_Unique_Id";
        g53_0 g53_02 = this.g.getCohortBasedOnDeviceId((String)object);
        Z5 z5 = new Z5(this, n3);
        a6 a62 = new a6(n3, z5);
        Object object2 = new xy3_0(this, (String)object);
        object = new d6((Function1)object2);
        object2 = g53_02.f(a62, (o60_0)object);
        this.x.b((yr0_2)object2);
    }

    public final void j(GPSLocationData object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "GPSLocationData");
        object = this.g.getGpsDataPd((GPSLocationData)object);
        Function1 function1 = new sy3_0(bl2, this);
        m33 m332 = new m33(function1);
        function1 = new ah0_1(this, 1);
        om_2 om_22 = new om_2(function1);
        object = ((g53_0)object).f(m332, om_22);
        this.x.b((yr0_2)object);
    }

    public final String k() {
        return this.m().getUserStatusMessage();
    }

    public final void l() {
        Object object = this.y;
        object = this.f.c((zr1_1)object);
        Object object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new Object();
        qy3_0 qy3_02 = new qy3_0((ky3_0)object2);
        object2 = new Object();
        vy3_0 vy3_02 = new vy3_0((ty3_0)object2);
        object = ((g53_0)object).f(qy3_02, vy3_02);
        this.x.b((yr0_2)object);
    }

    public final UserInformation m() {
        Object object = this.h.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void n() {
        Object object = this.g.getUserProfile(false);
        Function1 function1 = new oy3_0(this);
        py3_0 py3_02 = new py3_0((oy3_0)function1);
        function1 = new w4_0(this, 1);
        nx1_0 nx1_02 = new nx1_0(1, function1);
        object = ((g53_0)object).f(py3_02, nx1_02);
        this.x.b((yr0_2)object);
    }

    public final void o(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(object2, "requestId");
        object = this.g.getUserType((String)object, (String)object2);
        Function1 function1 = new yy3_0(this);
        zy3_0 zy3_02 = new zy3_0((yy3_0)function1);
        function1 = new ay3_0(this, (String)object2);
        object2 = new by3_0((ay3_0)function1);
        object = ((g53_0)object).f(zy3_02, (o60_0)object2);
        this.x.b((yr0_2)object);
    }

    public final void onCleared() {
        super.onCleared();
        this.x.d();
    }

    public final boolean p() {
        return this.m().isUserOnline();
    }

    public final void q() {
        Object object = this.g.logoutUser();
        Function1 function1 = new Object();
        my3_0 my3_02 = new my3_0((ly3_0)function1);
        function1 = new Object();
        kw0_0 kw0_02 = new kw0_0(function1);
        object = ((g53_0)object).f(my3_02, kw0_02);
        this.x.b((yr0_2)object);
    }

    public final void r(String object, String object2, String object3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "firstName");
        Intrinsics.checkNotNullParameter(object2, "lastName");
        Intrinsics.checkNotNullParameter(object3, "mobileNumber");
        QueryCustomer queryCustomer = new QueryCustomer();
        queryCustomer.setFirstName((String)object);
        object = ((Object)StringsKt.m0((CharSequence)object3)).toString();
        queryCustomer.setMobileNumber((String)object);
        queryCustomer.setLastName((String)object2);
        if (bl2) {
            boolean bl3 = true;
            queryCustomer.setEmailUpdateWithoutPassword(bl3);
        }
        object = this.g.requestOtpTokenForMobileUpdate(queryCustomer);
        object2 = new if1_2(this, 2);
        object3 = new w01_0(object2);
        object2 = new wm_2(this, 1);
        k5 k53 = new k5(object2, 2);
        object = ((g53_0)object).f((o60_0)object3, k53);
        this.x.b((yr0_2)object);
    }

    public final void s(int n3) {
        String string2;
        this.c = n3;
        yn3$a yn3$a = yn3_0.a;
        switch (n3) {
            default: {
                string2 = "INVALID_STATE";
                break;
            }
            case 103: {
                string2 = "STATE_FAILURE";
                break;
            }
            case 102: {
                string2 = "STATE_SUCCESS";
                break;
            }
            case 101: {
                string2 = "STATE_IDLE";
            }
        }
        string2 = "locale pincode state: ".concat(string2);
        Object[] objectArray = new Object[]{};
        yn3$a.a(string2, objectArray);
        this.c();
    }

    public final void t(String object, String object2) {
        Intrinsics.checkNotNullParameter(object, "userPhoneNo");
        Intrinsics.checkNotNullParameter(object2, "userEmailId");
        object2 = new QueryCustomer();
        ((QueryCustomer)object2).setMobileNumber((String)object);
        object = this.m().getUserEmailId();
        ((QueryCustomer)object2).setEmail((String)object);
        object = this.g.requestOtpVerifyRILEmplProfile((QueryCustomer)object2);
        object2 = new xy1_2(this, 2);
        uy3_0 uy3_02 = new uy3_0((xy1_2)object2);
        object2 = new gf1_2(this, 1);
        bw bw4 = new bw(object2);
        object = ((g53_0)object).f(uy3_02, bw4);
        this.x.b((yr0_2)object);
    }
}

