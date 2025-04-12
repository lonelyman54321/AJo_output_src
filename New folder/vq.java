/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class vq {
    public final Object a;
    public final PA0 b;
    public final ce1_0 c;

    public vq(String string2, PA0 pA0, ce1_0 ce1_02) {
        this.a = string2;
        this.b = pA0;
        this.c = ce1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof vq;
                if (!bl4) break block4;
                object = (vq)object;
                Object object2 = ((vq)object).a;
                PA0 pA0 = this.b;
                String string2 = (String)this.a;
                bl4 = pA0.b(string2, (String)(object2 = (String)object2));
                if (bl4 && (bl3 = Intrinsics.areEqual(object2 = this.c, object = ((vq)object).c))) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        String string2 = (String)this.a;
        int n3 = this.b.a(string2) * 31;
        return this.c.hashCode() + n3;
    }
}

