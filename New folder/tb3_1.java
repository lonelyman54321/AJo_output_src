/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tb3
 */
public final class tb3_1
implements Gl {
    public final Gl a;
    public final long b;

    public tb3_1(un0_0 un0_02, long l2) {
        this.a = un0_02;
        this.b = l2;
    }

    public final JA3 b(Vs3 object) {
        object = this.a.b((Vs3)object);
        long l2 = this.b;
        ub3_0 ub3_02 = new ub3_0((JA3)object, l2);
        return ub3_02;
    }

    public final boolean equals(Object object) {
        Gl gl;
        boolean bl2;
        Object object2 = object instanceof tb3_1;
        boolean bl3 = false;
        if (!object2) {
            return false;
        }
        object = (tb3_1)object;
        long l2 = ((tb3_1)object).b;
        long l3 = this.b;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (!object2 && (bl2 = Intrinsics.areEqual(object = ((tb3_1)object).a, gl = this.a))) {
            bl3 = true;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = this.b;
        long l3 = l2 >>> 32;
        int n4 = (int)(l2 ^ l3);
        return n3 + n4;
    }
}

