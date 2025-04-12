/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from a30
 */
public final class a30_0 {
    public static final LP1 a(LP1 lP1, Function1 function1, gx0_2 gx0_22) {
        Z20 z20 = new Z20(function1, gx0_22);
        return lP1.then(z20);
    }

    public static final LP1 b(b30_0 b30_02, LP1 lP1) {
        Object object = a30$a.c;
        boolean bl2 = lP1.all((Function1)object);
        if (bl2) {
            return lP1;
        }
        b30_02.u(1219399079);
        object = LP1$a.b;
        a30$b a30$b = new a30$b(b30_02);
        lP1 = (LP1)lP1.foldIn(object, a30$b);
        b30_02.I();
        return lP1;
    }

    public static final LP1 c(b30_0 b30_02, LP1 lP1) {
        b30_02.K(439770924);
        lP1 = a30_0.b(b30_02, lP1);
        b30_02.E();
        return lP1;
    }
}

