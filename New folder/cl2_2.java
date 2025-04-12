/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cL2
 */
public final class cl2_2
implements Closeable {
    public final kj2_2 a;
    public final ib2_2 b;
    public final String c;
    public final int d;
    public final k21_0 e;
    public final m41_0 f;
    public final il2_2 g;
    public final cl2_2 h;
    public final cl2_2 i;
    public final cl2_2 j;
    public final long k;
    public final long l;
    public final zc0_2 m;
    public ti_1 n;

    public cl2_2(kj2_2 kj2_22, ib2_2 ib2_22, String string2, int n3, k21_0 k21_02, m41_0 m41_02, il2_2 il2_22, cl2_2 cl2_22, cl2_2 cl2_23, cl2_2 cl2_24, long l2, long l3, zc0_2 zc0_22) {
        Intrinsics.checkNotNullParameter(kj2_22, "request");
        Intrinsics.checkNotNullParameter((Object)ib2_22, "protocol");
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(m41_02, "headers");
        this.a = kj2_22;
        this.b = ib2_22;
        this.c = string2;
        this.d = n3;
        this.e = k21_02;
        this.f = m41_02;
        this.g = il2_22;
        this.h = cl2_22;
        this.i = cl2_23;
        this.j = cl2_24;
        this.k = l2;
        this.l = l3;
        this.m = zc0_22;
    }

    public static String c(cl2_2 object, String string2) {
        object.getClass();
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        object = ((cl2_2)object).f.a(string2);
        if (object == null) {
            object = null;
        }
        return object;
    }

    public final ti_1 a() {
        ti_1 ti_12 = this.n;
        if (ti_12 == null) {
            ti_12 = ti_1.n;
            this.n = ti_12 = TI$b.a(this.f);
        }
        return ti_12;
    }

    public final String b(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return cl2_2.c(this, string2);
    }

    public final void close() {
        Object object = this.g;
        if (object != null) {
            ((il2_2)object).close();
            return;
        }
        String string2 = "response is not eligible for a body and must not be closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final boolean d() {
        int n3 = 200;
        boolean bl2 = false;
        int n4 = this.d;
        if (n3 <= n4 && n4 < (n3 = 300)) {
            bl2 = true;
        }
        return bl2;
    }

    public final cl2$a_0 h() {
        long l2;
        int n3;
        Object object;
        Intrinsics.checkNotNullParameter(this, "response");
        cl2$a_0 cl2$a_0 = new Object();
        cl2$a_0.a = object = this.a;
        object = this.b;
        cl2$a_0.b = object;
        cl2$a_0.c = n3 = this.d;
        object = this.c;
        cl2$a_0.d = object;
        object = this.e;
        cl2$a_0.e = object;
        object = this.f.e();
        cl2$a_0.f = object;
        object = this.g;
        cl2$a_0.g = object;
        object = this.h;
        cl2$a_0.h = object;
        object = this.i;
        cl2$a_0.i = object;
        object = this.j;
        cl2$a_0.j = object;
        cl2$a_0.k = l2 = this.k;
        cl2$a_0.l = l2 = this.l;
        object = this.m;
        cl2$a_0.m = object;
        return cl2$a_0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", code=");
        int n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(", message=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", url=");
        object = this.a.a;
        stringBuilder.append(object);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

