/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cR1
 */
public final class cr1_2
extends pj2_2 {
    public static final jn1_0 e;
    public static final jn1_0 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final ff_2 a;
    public final List b;
    public final jn1_0 c;
    public long d;

    static {
        int n3 = 2;
        Object object = jn1_0.d;
        e = JN1$a.a("multipart/mixed");
        JN1$a.a("multipart/alternative");
        JN1$a.a("multipart/digest");
        JN1$a.a("multipart/parallel");
        f = JN1$a.a("multipart/form-data");
        Object object2 = object = (Object)new byte[n3];
        object2[0] = 58;
        object2[1] = 32;
        g = (byte[])object;
        Object object3 = object = (Object)new byte[n3];
        object3[0] = 13;
        object3[1] = 10;
        h = (byte[])object;
        byte[] byArray = new byte[n3];
        byArray[0] = 45;
        byArray[1] = 45;
        i = byArray;
    }

    public cr1_2(ff_2 object, jn1_0 jn1_02, List object2) {
        Intrinsics.checkNotNullParameter(object, "boundaryByteString");
        Intrinsics.checkNotNullParameter(jn1_02, "type");
        Intrinsics.checkNotNullParameter(object2, "parts");
        this.a = object;
        this.b = object2;
        object2 = jn1_0.d;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(jn1_02);
        ((StringBuilder)object2).append("; boundary=");
        object = ((ff_2)object).q();
        ((StringBuilder)object2).append((String)object);
        this.c = object = JN1$a.a(((StringBuilder)object2).toString());
        this.d = -1;
    }

    public final long a(re_2 re_22, boolean bl2) {
        byte[] byArray;
        Object object;
        Object object2;
        re_2 re_23;
        re_2 re_24;
        cr1_2 cr1_22 = this;
        if (bl2) {
            re_23 = re_24 = new ce_2();
        } else {
            re_23 = null;
            re_24 = re_22;
        }
        List list = cr1_22.b;
        int n3 = list.size();
        long l2 = 0L;
        int n4 = 0;
        while (true) {
            long l3;
            long l4;
            long l7;
            int n7;
            object2 = cr1_22.a;
            object = i;
            byArray = h;
            if (n4 >= n3) break;
            Object object3 = (cr1$c_0)list.get(n4);
            m41_0 m41_02 = ((cr1$c_0)object3).a;
            Intrinsics.checkNotNull(re_24);
            re_24.write((byte[])object);
            re_24.V((ff_2)object2);
            re_24.write(byArray);
            if (m41_02 != null) {
                int n8 = m41_02.size();
                object = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    Object object4 = m41_02.c(n7);
                    object4 = re_24.D((String)object4);
                    Object object5 = g;
                    object4 = object4.write((byte[])object5);
                    object5 = m41_02.g(n7);
                    object4 = object4.D((String)object5);
                    object4.write(byArray);
                }
            }
            if ((object = (Object)((pj2_2)(object2 = ((cr1$c_0)object3).b)).contentType()) != null) {
                object3 = re_24.D("Content-Type: ");
                object = ((jn1_0)object).a;
                object = object3.D((String)object);
                object.write(byArray);
            }
            if ((n7 = (int)((l7 = (l4 = ((pj2_2)object2).contentLength()) - (l3 = (long)-1)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0) {
                object = re_24.D("Content-Length: ").Y(l4);
                object.write(byArray);
            } else if (bl2) {
                Intrinsics.checkNotNull(re_23);
                ((ce_2)re_23).b();
                return l3;
            }
            re_24.write(byArray);
            if (bl2) {
                l2 += l4;
            } else {
                ((pj2_2)object2).writeTo(re_24);
            }
            re_24.write(byArray);
            ++n4;
        }
        Intrinsics.checkNotNull(re_24);
        re_24.write((byte[])object);
        re_24.V((ff_2)object2);
        re_24.write((byte[])object);
        re_24.write(byArray);
        if (bl2) {
            Intrinsics.checkNotNull(re_23);
            long l8 = ((ce_2)re_23).b;
            l2 += l8;
            ((ce_2)re_23).b();
        }
        return l2;
    }

    public final long contentLength() {
        long l2 = this.d;
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            boolean bl2 = true;
            this.d = l2 = this.a(null, bl2);
        }
        return l2;
    }

    public final jn1_0 contentType() {
        return this.c;
    }

    public final void writeTo(re_2 re_22) {
        Intrinsics.checkNotNullParameter(re_22, "sink");
        this.a(re_22, false);
    }
}

