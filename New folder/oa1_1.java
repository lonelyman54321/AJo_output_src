/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserProfileData;
import com.ril.ajio.services.query.QueryCustomer;
import io.reactivex.Scheduler;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from OA1
 */
public final class oa1_1
extends jD3 {
    public boolean A;
    public String B;
    public QueryCustomer C;
    public String D;
    public String E;
    public boolean F;
    public String G;
    public boolean H;
    public String I;
    public UserProfileData J;
    public boolean K;
    public String L;
    public final zr1_1 M;
    public final zr1_1 N;
    public final LoginRepository a;
    public final jH2 b;
    public final UserRepo c;
    public final t30_0 d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
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
    public boolean v;
    public boolean w;
    public String x;
    public String y;
    public User z;

    public oa1_1(LoginRepository object, jH2 object2, UserRepo userRepo, t30_0 t30_02) {
        Intrinsics.checkNotNullParameter(object, "mLoginRepository");
        Intrinsics.checkNotNullParameter(object2, "referralRepo");
        Intrinsics.checkNotNullParameter(userRepo, "muserRepo");
        Intrinsics.checkNotNullParameter(t30_02, "compositeDisposable");
        this.a = object;
        this.b = object2;
        this.c = userRepo;
        this.d = t30_02;
        this.h = true;
        this.i = object = new zr1_1();
        this.j = object = new zr1_1();
        this.k = object = new zr1_1();
        this.l = object = new zr1_1();
        this.m = object = new zr1_1();
        this.n = object = new zr1_1();
        this.o = object = new zr1_1();
        this.p = object = new zr1_1();
        this.q = object = new zr1_1();
        this.r = object = new zr1_1();
        this.s = object = new zr1_1();
        this.t = object = new zr1_1();
        this.u = object = new zr1_1();
        this.x = object = "";
        this.y = object;
        this.z = object2 = new User();
        this.B = object;
        this.D = object;
        this.E = object;
        this.G = object;
        this.I = object;
        this.L = object;
        this.M = object = new zr1_1();
        this.N = object;
    }

    public static Pair c(String object, String object2) {
        int n3;
        String string2;
        int n4;
        boolean bl2 = false;
        if (object != null && (n4 = ((String)object).equalsIgnoreCase(string2 = "SIGIN_SOURCE_FACEBOOK")) == (n3 = 1)) {
            if (object2 == null || (n4 = ((String)object2).length()) == 0) {
                bl2 = true;
            }
        } else {
            string2 = "SIGIN_SOURCE_GOOGLE";
        }
        object2 = bl2;
        object = new Pair(string2, object2);
        return object;
    }

    public static String n(String string2) {
        Intrinsics.checkNotNullParameter(string2, "input");
        return ((Object)StringsKt.m0(kotlin.text.b.n(string2, "source - ", "", false))).toString();
    }

    public final void b(QueryCustomer queryCustomer, String string2) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        aW aW2 = md3_0.c(this);
        OA1$a oA1$a = new OA1$a(this, queryCustomer, string2, null);
        Ae3.d(aW2, null, null, oA1$a, 3);
    }

    public final xs3_0 d(AccountCheckResponse object, String object2, String string2, String object3) {
        boolean bl2;
        if (object != null) {
            object = ((AccountCheckResponse)object).getMaskedEmailId();
        } else {
            bl2 = false;
            object = null;
        }
        boolean bl3 = this.v;
        if (bl3) {
            int n3;
            if (string2 != null && (n3 = string2.length()) != 0) {
                object = this.x;
            }
            string2 = "facebook";
        } else {
            bl2 = this.w;
            if (bl2) {
                object = this.x;
                string2 = "google";
                object2 = object3;
            } else {
                object = object2 = "";
                string2 = object2;
            }
        }
        object3 = new xs3_0(object, string2, object2);
        return object3;
    }

    public final void e() {
        Intrinsics.checkNotNullParameter("login/signup screen", "screenName");
        aW aW2 = md3_0.c(this);
        qa1_1 qa1_12 = new qa1_1(this, null);
        Ae3.d(aW2, null, null, qa1_12, 3);
    }

    public final QueryCustomer f() {
        QueryCustomer queryCustomer = this.C;
        if (queryCustomer != null) {
            return queryCustomer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("queryCustomer");
        return null;
    }

    public final QueryCustomer g(String string2, String string3, String string4, String string5, String string6) {
        Object object = "loginviaInfo";
        Intrinsics.checkNotNullParameter(string3, (String)object);
        if (string2 != null) {
            int n3;
            this.y = string3;
            object = new QueryCustomer();
            Object object2 = Locale.getDefault();
            String string7 = "getDefault(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string7);
            string2 = string2.toLowerCase((Locale)object2);
            object2 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            ((QueryCustomer)object).setLogin(string2);
            if (string5 != null && (n3 = string5.length()) != 0) {
                ((QueryCustomer)object).setProfileId(string5);
            }
            ((QueryCustomer)object).setPassword("");
            ((QueryCustomer)object).setAdId(string6);
            ((QueryCustomer)object).setToken(string4);
            ((QueryCustomer)object).setLoginvia(string3);
            return object;
        }
        return null;
    }

    public final QueryCustomer h() {
        QueryCustomer queryCustomer = new QueryCustomer();
        Object object = this.f();
        boolean bl2 = ((QueryCustomer)object).isMobileNumberEnterered();
        if (bl2) {
            object = this.f().getLogin();
            queryCustomer.setMobileNumber((String)object);
            bl2 = true;
            queryCustomer.setMobileNumberEnterered(bl2);
        } else {
            object = this.f().getLogin();
            queryCustomer.setEmail((String)object);
            bl2 = false;
            object = null;
            queryCustomer.setMobileNumberEnterered(false);
        }
        return queryCustomer;
    }

    public final void i() {
        Object object = this.M;
        object = this.b.c((zr1_1)object);
        Object object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new l40_0(1);
        m40_0 m40_02 = new m40_0((Function1)object2);
        object2 = new jp_0(1);
        zz_0 zz_02 = new zz_0(object2);
        object = ((g53_0)object).f(m40_02, zz_02);
        this.d.b((yr0_2)object);
    }

    public final void j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        aW aW2 = md3_0.c(this);
        OA1$b oA1$b = new OA1$b(this, string2, null);
        Ae3.d(aW2, null, null, oA1$b, 3);
    }

    public final void k(QueryCustomer queryCustomer, String string2) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        aW aW2 = md3_0.c(this);
        OA1$c oA1$c = new OA1$c(this, queryCustomer, string2, null);
        Ae3.d(aW2, null, null, oA1$c, 3);
    }

    public final void l(QueryCustomer queryCustomer, String string2) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(queryCustomer, "<set-?>");
        this.C = queryCustomer;
        aW aW2 = md3_0.c(this);
        OA1$d oA1$d = new OA1$d(this, queryCustomer, string2, null);
        Ae3.d(aW2, null, null, oA1$d, 3);
    }

    public final void m(QueryCustomer queryCustomer, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        String string2 = "screenName";
        Intrinsics.checkNotNullParameter("signup - otp screen", string2);
        int n3 = 3;
        if (!bl2 && !bl3) {
            aW aW2 = md3_0.c(this);
            ta1_2 ta1_22 = new ta1_2(this, queryCustomer, null);
            Ae3.d(aW2, null, null, ta1_22, n3);
        } else {
            aW aW3 = md3_0.c(this);
            sa1_2 sa1_22 = new sa1_2(this, queryCustomer, null);
            Ae3.d(aW3, null, null, sa1_22, n3);
        }
    }

    public final void o(QueryCustomer queryCustomer, String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
        Intrinsics.checkNotNullParameter(string2, "screenName");
        aW aW2 = md3_0.c(this);
        OA1$e oA1$e = new OA1$e(this, queryCustomer, string2, bl2, null);
        Ae3.d(aW2, null, null, oA1$e, 3);
    }

    public final void onCleared() {
        super.onCleared();
        this.d.d();
    }
}

