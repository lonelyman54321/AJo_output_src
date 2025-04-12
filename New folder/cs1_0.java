/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.d;

/*
 * Renamed from cS1
 */
public final class cs1_0 {
    public final AtomicReference a;
    public final ks1_1 b;

    public cs1_0() {
        Object object = new AtomicReference(null);
        this.a = object;
        this.b = object = ls1_2.a();
    }

    public static Object a(cs1_0 cs1_02, Function1 function1, f80_0 f80_02) {
        bs1_0 bs1_02 = bs1_0.Default;
        cs1_02.getClass();
        es1_1 es1_12 = new es1_1(bs1_02, cs1_02, function1, null);
        return d.c(es1_12, f80_02);
    }
}

