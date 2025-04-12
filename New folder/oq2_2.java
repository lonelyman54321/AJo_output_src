/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from oq2
 */
public final class oq2_2
implements a93_0 {
    public final se_1 a;
    public final ce_2 b;
    public vx2_2 c;
    public int d;
    public boolean e;
    public long f;

    public oq2_2(se_1 object) {
        String string2 = "upstream";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        object = object.e();
        this.b = object;
        this.c = object = ((ce_2)object).a;
        int n3 = object != null ? ((vx2_2)object).b : -1;
        this.d = n3;
    }

    public final long a0(ce_2 object, long l2) {
        block6: {
            block7: {
                ce_2 ce_22;
                Object object2;
                long l3;
                long l4;
                Object object3;
                block8: {
                    block9: {
                        object3 = "sink";
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        l4 = 0L;
                        l3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                        if (l3 < 0) break block6;
                        int n3 = this.e ^ 1;
                        if (n3 == 0) break block7;
                        object2 = this.c;
                        ce_22 = this.b;
                        if (object2 == null) break block8;
                        vx2_2 vx2_22 = ce_22.a;
                        if (object2 != vx2_22) break block9;
                        n3 = this.d;
                        Intrinsics.checkNotNull(vx2_22);
                        int n4 = vx2_22.b;
                        if (n3 == n4) break block8;
                    }
                    String string2 = "Peek source is invalid because upstream source was used".toString();
                    object = new IllegalStateException(string2);
                    throw object;
                }
                if (l3 == false) {
                    return l4;
                }
                l4 = this.f;
                se_1 se_12 = this.a;
                long l7 = 1L;
                int n7 = se_12.request(l4 += l7);
                if (n7 == 0) {
                    return -1;
                }
                object3 = this.c;
                if (object3 == null && (object3 = ce_22.a) != null) {
                    this.c = object3;
                    Intrinsics.checkNotNull(object3);
                    this.d = n7 = ((vx2_2)object3).b;
                }
                l4 = ce_22.b;
                l7 = this.f;
                l2 = Math.min(l2, l4 -= l7);
                se_12 = this.b;
                long l8 = this.f;
                object2 = object;
                ((ce_2)se_12).k((ce_2)object, l8, l2);
                this.f = l4 = this.f + l2;
                return l2;
            }
            String string3 = "closed".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        object = Wm2.a(l2, "byteCount < 0: ");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public final void close() {
        this.e = true;
    }

    public final a timeout() {
        return this.a.timeout();
    }
}

