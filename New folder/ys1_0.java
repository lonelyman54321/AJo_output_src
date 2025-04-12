/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from Ys1
 */
public abstract class ys1_0
implements hs1_0 {
    public final Ks1 a;
    public final es1 b;
    public final long c;

    public ys1_0(long l2, boolean bl2, Ks1 ks1, es1 es12) {
        this.a = ks1;
        this.b = es12;
        int n3 = -1 >>> 1;
        int n4 = bl2 ? c60.i(l2) : -1 >>> 1;
        if (!bl2) {
            n3 = c60.h(l2);
        }
        this.c = l2 = f60.b(n4, n3, 5);
    }

    public static xs1_0 c(rs1_1 rs1_12, int n3) {
        Object object = rs1_12.a;
        Object object2 = object.c(n3);
        Object object3 = object.e(n3);
        object = rs1_12.b;
        long l2 = rs1_12.c;
        List list = object.R(n3, l2);
        return rs1_12.b(n3, object2, object3, list, l2);
    }

    public final gs1_0 a(int n3, int n4, int n7, long l2) {
        Ks1 ks1 = this.a;
        Object object = ks1.c(n3);
        Object object2 = ks1.e(n3);
        List list = this.b.R(n3, l2);
        return this.b(n3, object, object2, list, l2);
    }

    public abstract xs1_0 b(int var1, Object var2, Object var3, List var4, long var5);
}

