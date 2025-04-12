/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Cg2$c
extends Cg2 {
    public final NP2 a;
    public final ki b;

    public Cg2$c(NP2 nP2) {
        ki ki2;
        this.a = nP2;
        boolean bl2 = QP2.a(nP2);
        if (!bl2) {
            ki2 = ni.a();
            fn2.a(ki2, nP2);
        } else {
            bl2 = false;
            ki2 = null;
        }
        this.b = ki2;
    }

    public final aG2 a() {
        NP2 nP2 = this.a;
        float f5 = nP2.a;
        float f6 = nP2.c;
        float f7 = nP2.d;
        float f8 = nP2.b;
        aG2 aG22 = new aG2(f5, f8, f6, f7);
        return aG22;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Cg2$c;
        if (!bl3) {
            return false;
        }
        NP2 nP2 = this.a;
        object = ((Cg2$c)object).a;
        boolean bl4 = Intrinsics.areEqual(nP2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

