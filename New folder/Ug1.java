/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ug1
implements Gl {
    public final xw0_1 a;
    public final xJ2 b;
    public final long c;

    public Ug1() {
        throw null;
    }

    public Ug1(xw0_1 xw0_12, xJ2 xJ22, long l2) {
        this.a = xw0_12;
        this.b = xJ22;
        this.c = l2;
    }

    public final JA3 b(Vs3 object) {
        object = this.a.b((Vs3)object);
        long l2 = this.c;
        xJ2 xJ22 = this.b;
        qa3_0 qa3_02 = new qa3_0((ma3_0)object, xJ22, l2);
        return qa3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Ug1;
        boolean bl3 = false;
        if (bl2) {
            long l2;
            long l3;
            long l4;
            long l7;
            object = (Ug1)object;
            Object object2 = ((Ug1)object).a;
            Object object3 = this.a;
            bl2 = Intrinsics.areEqual(object2, object3);
            if (bl2 && (object2 = ((Ug1)object).b) == (object3 = this.b) && (l7 = (l4 = (l3 = ((Ug1)object).c) - (l2 = this.c)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (((Object)((Object)this.b)).hashCode() + n3) * 31;
        long l2 = this.c;
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^ l3);
        return n4 + n3;
    }
}

