/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Q93 {
    public static final ux1_2 a(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        object = wx1_2.b().a().a((String)object);
        Intrinsics.checkNotNullExpressionValue(object, "getLogger(...)");
        return object;
    }

    public static final void b(b30_0 b30_02, LP1 object) {
        Object object2 = R93.a;
        int n3 = b30_02.F();
        object = a30_0.c(b30_02, (LP1)object);
        Object object3 = b30_02.m();
        N20.W.getClass();
        Lambda lambda = N20$a.b;
        mp mp2 = b30_02.i();
        boolean bl2 = mp2 instanceof mp;
        if (bl2) {
            b30_02.A();
            bl2 = b30_02.e();
            if (bl2) {
                b30_02.C((Function0)((Object)lambda));
            } else {
                b30_02.n();
            }
            lambda = N20$a.e;
            Ow3.a(b30_02, object2, (Function2)((Object)lambda));
            object2 = N20$a.d;
            Ow3.a(b30_02, object3, (Function2)object2);
            object2 = N20$a.c;
            Ow3.a(b30_02, object, (Function2)object2);
            object = N20$a.f;
            boolean bl3 = b30_02.e();
            if (bl3 || !(bl3 = Intrinsics.areEqual(object2 = b30_02.v(), object3 = Integer.valueOf(n3)))) {
                re0_0.a(n3, b30_02, n3, (N20$a$a)object);
            }
            b30_02.p();
            return;
        }
        s20.a();
        throw null;
    }
}

