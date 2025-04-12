/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.AddressRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.services.query.QueryAddress;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h5
 */
public final class h5_0
extends jD3 {
    public final AddressRepo a;
    public final zr1_1 b;
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
    public QueryAddress q;

    public h5_0(BaseRepo object) {
        Intrinsics.checkNotNullParameter(object, "repo");
        object = (AddressRepo)object;
        this.a = object;
        this.b = object = new zr1_1();
        this.c = object = new zr1_1();
        this.d = object = new zr1_1();
        this.e = object = new zr1_1();
        this.f = object = new zr1_1();
        this.g = object = new zr1_1();
        this.h = object = new zr1_1();
        this.i = object = new zr1_1();
        this.j = object = new zr1_1();
        this.k = object = new zr1_1();
        this.l = object = new zr1_1();
        this.m = object = new zr1_1();
        this.n = object = new zr1_1();
        this.o = object = new zr1_1();
        this.p = object = new zr1_1();
        this.q = object = new QueryAddress();
    }

    public final void b(String string2, String string3, HashMap hashMap) {
        Intrinsics.checkNotNullParameter("", "requestID");
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "queryParam");
        Intrinsics.checkNotNullParameter(string3, "addressId");
        aW aW2 = md3_0.c(this);
        x4_0 x4_02 = new x4_0(this, string2, hashMap, string3, null);
        Ae3.d(aW2, null, null, x4_02, 3);
    }

    public final void c(String string2, String string3, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(string2, "userId");
        Intrinsics.checkNotNullParameter("CreateAddress", "requestID");
        Intrinsics.checkNotNullParameter(string3, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        aW aW2 = md3_0.c(this);
        y4_0 y4_02 = new y4_0(this, string2, string3, hashMap, hashMap2, null);
        Ae3.d(aW2, null, null, y4_02, 3);
    }

    public final void d(String string2, String string3, HashMap hashMap) {
        Intrinsics.checkNotNullParameter("GetAddresses", "requestID");
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "queryParam");
        Intrinsics.checkNotNullParameter(string3, "userId");
        aW aW2 = md3_0.c(this);
        a5_0 a5_02 = new a5_0(this, string2, hashMap, string3, null);
        Ae3.d(aW2, null, null, a5_02, 3);
    }

    public final void e(String string2, String string3, HashMap hashMap, String string4) {
        Intrinsics.checkNotNullParameter("GET_DROP_AT_STORE_LIST", "requestID");
        Intrinsics.checkNotNullParameter(string2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(string3, "userId");
        Intrinsics.checkNotNullParameter(string4, "pincode");
        aW aW2 = md3_0.c(this);
        b5_0 b5_02 = new b5_0(this, null, string2, string3, string4, hashMap);
        Ae3.d(aW2, null, null, b5_02, 3);
    }

    public final void f(String string2, String string3, String string4, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(string2, "userId");
        Intrinsics.checkNotNullParameter("UpdateAddress", "requestID");
        Intrinsics.checkNotNullParameter(string3, "accessToken");
        Intrinsics.checkNotNullParameter(string4, "addressID");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        aW aW2 = md3_0.c(this);
        f5_0 f5_02 = new f5_0(this, string2, string3, string4, hashMap, hashMap2, null);
        Ae3.d(aW2, null, null, f5_02, 3);
    }
}

