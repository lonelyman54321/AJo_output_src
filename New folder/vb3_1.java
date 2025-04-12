/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from vB3
 */
public final class vb3_1
implements op1_1 {
    public final Pk3 b;
    public final int c;
    public final dr3 d;
    public final Function0 e;

    public vb3_1(Pk3 pk3, int n3, dr3 dr32, Function0 function0) {
        this.b = pk3;
        this.c = n3;
        this.d = dr32;
        this.e = function0;
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
        int n3 = object instanceof vb3_1;
        if (n3 == 0) {
            return false;
        }
        object = (vb3_1)object;
        Object object2 = this.b;
        Object object3 = ((vb3_1)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((vb3_1)object).c;
        if (n3 != n4) {
            return false;
        }
        object3 = this.d;
        object2 = ((vb3_1)object).d;
        n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object = ((vb3_1)object).e;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        int n4 = this.c;
        n3 = (n3 + n4) * 31;
        n4 = (this.d.hashCode() + n3) * 31;
        return this.e.hashCode() + n4;
    }

    public final /* synthetic */ int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.a(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.b(this, rj1, qj1, n3);
    }

    public final bl1_0 measure-3p2s80s(dl1_1 dl1_12, xk1_0 object, long l2) {
        long l3 = l2;
        l3 = c60.b(l2, 0, 0, 0, -1 >>> 1, 7);
        object = object.Q(l3);
        int n3 = ((Ns2)object).b;
        int n4 = c60.h(l2);
        n4 = Math.min(n3, n4);
        int n7 = ((Ns2)object).a;
        vB3$a vB3$a = new vB3$a(dl1_12, this, (Ns2)object, n4);
        return cl1_0.a(dl1_12, n7, n4, vB3$a);
    }

    public final /* synthetic */ int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.c(this, rj1, qj1, n3);
    }

    public final /* synthetic */ int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return np1_0.d(this, rj1, qj1, n3);
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VerticalScrollLayoutModifier(scrollerPosition=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", cursorOffset=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", transformedText=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", textLayoutResultProvider=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

