/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pq2
 */
public final class pq2_1
implements we2_2 {
    public final b93_0 a;
    public final ee_2 b;
    public ux2_2 c;
    public int d;
    public boolean e;
    public long f;

    public pq2_1(b93_0 object) {
        String string2 = "upstream";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        object = object.e();
        this.b = object;
        this.c = object = ((ee_2)object).a;
        int n3 = object != null ? ((ux2_2)object).b : -1;
        this.d = n3;
    }

    public final void close() {
        this.e = true;
    }

    public final long i0(ee_2 ee_22, long l2) {
        Object object;
        block11: {
            block12: {
                int n3;
                int n4;
                Object object2;
                Object object3;
                Object object4;
                long l3;
                long l4;
                pq2_1 pq2_12;
                block13: {
                    block14: {
                        pq2_12 = this;
                        object = ee_22;
                        l4 = l2;
                        String string2 = "sink";
                        Intrinsics.checkNotNullParameter(ee_22, string2);
                        boolean bl2 = this.e ^ true;
                        if (!bl2) break block11;
                        l3 = 0L;
                        long l7 = l2 - l3;
                        object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                        if (object4 < 0) break block12;
                        ux2_2 ux2_22 = this.c;
                        object3 = this.b;
                        if (ux2_22 == null) break block13;
                        object2 = ((ee_2)object3).a;
                        if (ux2_22 != object2) break block14;
                        n4 = this.d;
                        Intrinsics.checkNotNull(object2);
                        n3 = ((ux2_2)object2).b;
                        if (n4 == n3) break block13;
                    }
                    String string3 = "Peek source is invalid because upstream source was used".toString();
                    object = new IllegalStateException(string3);
                    throw object;
                }
                if (object4 == false) {
                    return l3;
                }
                long l8 = pq2_12.f;
                object2 = pq2_12.a;
                long l12 = 1L;
                object4 = object2.request(l8 += l12);
                if (object4 == false) {
                    return -1;
                }
                ux2_2 ux2_23 = pq2_12.c;
                if (ux2_23 == null && (ux2_23 = ((ee_2)object3).a) != null) {
                    pq2_12.c = ux2_23;
                    Intrinsics.checkNotNull(ux2_23);
                    object4 = ux2_23.b;
                    pq2_12.d = (int)object4;
                }
                l8 = ((ee_2)object3).c;
                l12 = pq2_12.f;
                l4 = Math.min(l4, l8 -= l12);
                l8 = pq2_12.f;
                long l14 = l8 + l4;
                object2 = "out";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                l12 = ((ee_2)object3).c;
                xj3_1.a(l12, l8, l14);
                n3 = (int)(l8 == l14 ? 0 : (l8 < l14 ? -1 : 1));
                if (n3 != 0) {
                    long l15;
                    ((ee_2)object).c = l12 = ((ee_2)object).c + (l14 -= l8);
                    object3 = ((ee_2)object3).a;
                    while (true) {
                        Intrinsics.checkNotNull(object3);
                        n3 = ((ux2_2)object3).c;
                        int n7 = ((ux2_2)object3).b;
                        l12 = n3 -= n7;
                        l15 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                        if (l15 < 0) break;
                        l8 -= l12;
                        object3 = ((ux2_2)object3).f;
                    }
                    l12 = l14;
                    while ((l15 = l12 == l3 ? 0 : (l12 < l3 ? -1 : 1)) > 0) {
                        Intrinsics.checkNotNull(object3);
                        ux2_2 ux2_24 = ((ux2_2)object3).f();
                        int n8 = ux2_24.b;
                        n4 = (int)l8;
                        ux2_24.b = n8 += n4;
                        object4 = (int)l12;
                        n8 += object4;
                        object4 = ux2_24.c;
                        object4 = Math.min(n8, (int)object4);
                        ux2_24.c = (int)object4;
                        ux2_23 = ((ee_2)object).a;
                        if (ux2_23 == null) {
                            ((ee_2)object).a = ux2_24;
                            ((ee_2)object).b = ux2_24;
                        } else {
                            ux2_23 = ((ee_2)object).b;
                            Intrinsics.checkNotNull(ux2_23);
                            ux2_23.e(ux2_24);
                            ((ee_2)object).b = ux2_24;
                        }
                        object4 = ux2_24.c;
                        n4 = ux2_24.b;
                        l8 = object4 -= n4;
                        l12 -= l8;
                        object3 = ((ux2_2)object3).f;
                        l8 = l3;
                    }
                }
                pq2_12.f = l3 = pq2_12.f + l4;
                return l4;
            }
            object = Ov2.a(l2, "byteCount (", ") < 0");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        String string4 = "Source is closed.".toString();
        object = new IllegalStateException(string4);
        throw object;
    }
}

