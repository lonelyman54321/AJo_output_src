/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class B50
implements Ep1 {
    public final t50 a;
    public final Function1 b;
    public final Object c;

    public B50(t50 object, Function1 function1) {
        this.a = object;
        this.b = function1;
        this.c = object = ((t50)object).b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof B50;
        if (!bl2) return false;
        Object object2 = this.a.b;
        object = (B50)object;
        Object object3 = ((B50)object).a.b;
        bl2 = Intrinsics.areEqual(object2, object3);
        if (!bl2) return false;
        object2 = this.b;
        object = ((B50)object).b;
        if (object2 != object) return false;
        return true;
    }

    public final int hashCode() {
        int n3 = this.a.b.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final Object r0() {
        return this.c;
    }
}

