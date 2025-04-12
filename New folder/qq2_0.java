/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qq2
 */
public final class qq2_0
extends Sq2
implements rq2_1 {
    public static final qq2_0 g;

    static {
        qq2_0 qq2_02;
        hs3_0 hs3_02 = hs3_0.e;
        Intrinsics.checkNotNull(hs3_02, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        g = qq2_02 = new Sq2(hs3_02, 0);
    }

    public final Object a(H30 h30) {
        return N30.a(this, h30);
    }

    public final Qq2$a b() {
        Qq2$a qq2$a = new Qq2$a(this);
        return qq2$a;
    }

    public final Object c(vc3_1 vc3_12) {
        return N30.a(this, vc3_12);
    }

    public final qq2_0 u(H30 object, pa3_0 object2) {
        int n3 = object.hashCode();
        int n4 = 0;
        hs3_0 hs3_02 = this.d;
        if ((object = hs3_02.u(object, n3, 0, object2)) == null) {
            return this;
        }
        hs3_0 hs3_03 = ((hs3$a)object).a;
        int n7 = ((hs3$a)object).b;
        n4 = this.e + n7;
        object2 = new Sq2(hs3_03, n4);
        return object2;
    }
}

