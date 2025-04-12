/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Cg2$b
extends Cg2 {
    public final aG2 a;

    public Cg2$b(aG2 aG22) {
        this.a = aG22;
    }

    public final aG2 a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Cg2$b;
        if (!bl3) {
            return false;
        }
        aG2 aG22 = this.a;
        object = ((Cg2$b)object).a;
        boolean bl4 = Intrinsics.areEqual(aG22, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

