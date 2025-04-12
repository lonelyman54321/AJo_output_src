/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class xZ
implements LP1 {
    public final LP1 b;
    public final LP1 c;

    public xZ(LP1 lP1, LP1 lP12) {
        this.b = lP1;
        this.c = lP12;
    }

    public final boolean all(Function1 function1) {
        boolean bl2;
        LP1 lP1 = this.b;
        boolean bl3 = lP1.all(function1);
        if (bl3 && (bl2 = (lP1 = this.c).all(function1))) {
            bl2 = true;
        } else {
            bl2 = false;
            function1 = null;
        }
        return bl2;
    }

    public final boolean any(Function1 function1) {
        boolean bl2;
        LP1 lP1 = this.b;
        boolean bl3 = lP1.any(function1);
        if (!bl3 && !(bl2 = (lP1 = this.c).any(function1))) {
            bl2 = false;
            function1 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof xZ;
        if (!bl2) return false;
        object = (xZ)object;
        LP1 lP1 = this.b;
        LP1 lP12 = ((xZ)object).b;
        bl2 = Intrinsics.areEqual(lP1, lP12);
        if (!bl2) return false;
        lP12 = this.c;
        object = ((xZ)object).c;
        boolean bl3 = Intrinsics.areEqual(lP12, object);
        if (!bl3) return false;
        return true;
    }

    public final Object foldIn(Object object, Function2 function2) {
        object = this.b.foldIn(object, function2);
        return this.c.foldIn(object, function2);
    }

    public final int hashCode() {
        int n3 = this.b.hashCode();
        return this.c.hashCode() * 31 + n3;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        xZ$a xZ$a = xZ$a.c;
        String string2 = (String)this.foldIn("", xZ$a);
        return ui0_1.a(stringBuilder, string2, ']');
    }
}

