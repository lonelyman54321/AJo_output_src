/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m60
 */
public final class m60_0
implements pp1_0 {
    public final Function1 b;
    public lg3_0 c;

    public m60_0(Function1 function1) {
        this.b = function1;
    }

    public final void a(TP1 object) {
        Object object2 = dh3_0.a;
        boolean bl2 = Intrinsics.areEqual(object = (lg3_0)object.U((OP1)object2), object2 = this.c);
        if (!bl2) {
            this.c = object;
            object2 = this.b;
            object2.invoke(object);
        }
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof m60_0;
        if (!bl3) {
            return false;
        }
        object = ((m60_0)object).b;
        Function1 function1 = this.b;
        if (object != function1) {
            bl2 = false;
        }
        return bl2;
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

