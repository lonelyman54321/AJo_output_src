/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cL2$a
 */
public final class cl2$a_0 {
    public kj2_2 a;
    public ib2_2 b;
    public int c = -1;
    public String d;
    public k21_0 e;
    public m41$a_0 f;
    public il2_2 g;
    public cl2_2 h;
    public cl2_2 i;
    public cl2_2 j;
    public long k;
    public long l;
    public zc0_2 m;

    public cl2$a_0() {
        m41$a_0 m41$a_0;
        this.f = m41$a_0 = new m41$a_0();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(cl2_2 object, String object2) {
        if (object == null) return;
        il2_2 il2_22 = ((cl2_2)object).g;
        if (il2_22 == null) {
            cl2_2 cl2_22 = ((cl2_2)object).h;
            if (cl2_22 == null) {
                cl2_2 cl2_23 = ((cl2_2)object).i;
                if (cl2_23 == null) {
                    object = ((cl2_2)object).j;
                    if (object == null) return;
                    object = ((String)object2).concat(".priorResponse != null");
                    object = object.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
                object = ((String)object2).concat(".cacheResponse != null");
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            object = ((String)object2).concat(".networkResponse != null");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = ((String)object2).concat(".body != null");
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final cl2_2 a() {
        int n3 = this.c;
        if (n3 >= 0) {
            Object object = this.a;
            if (object != null) {
                ib2_2 ib2_22 = this.b;
                if (ib2_22 != null) {
                    String string2 = this.d;
                    if (string2 != null) {
                        cl2_2 cl2_22;
                        k21_0 k21_02 = this.e;
                        m41_0 m41_02 = this.f.e();
                        il2_2 il2_22 = this.g;
                        cl2_2 cl2_23 = this.h;
                        cl2_2 cl2_24 = this.i;
                        cl2_2 cl2_25 = this.j;
                        long l2 = this.k;
                        long l3 = this.l;
                        Object object2 = this.m;
                        zc0_2 zc0_22 = object2;
                        object2 = cl2_22;
                        cl2_22 = new cl2_2((kj2_2)object, ib2_22, string2, n3, k21_02, m41_02, il2_22, cl2_23, cl2_24, cl2_25, l2, l3, zc0_22);
                        return cl2_22;
                    }
                    object = "message == null".toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
                object = "protocol == null".toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            object = "request == null".toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        CharSequence charSequence = new StringBuilder("code < 0: ");
        int n4 = this.c;
        ((StringBuilder)charSequence).append(n4);
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final void c(m41_0 object) {
        Intrinsics.checkNotNullParameter(object, "headers");
        this.f = object = ((m41_0)object).e();
    }

    public final void d(ib2_2 ib2_22) {
        Intrinsics.checkNotNullParameter((Object)ib2_22, "protocol");
        this.b = ib2_22;
    }
}

