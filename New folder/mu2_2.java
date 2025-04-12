/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.c;

/*
 * Renamed from mU2
 */
public final class mu2_2
implements yp1_2 {
    public static final mu2_2 a;

    static {
        mu2_2 mu2_22;
        a = mu2_22 = new Object();
    }

    public final Object R(Function1 function1, f80_0 f80_02) {
        c c2 = ir0_2.a;
        c2 = bg1_1.a;
        mu2$a_1 mu2$a_1 = new mu2$a_1(function1, null);
        return Ae3.g(f80_02, c2, mu2$a_1);
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return YP1$a.a;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

