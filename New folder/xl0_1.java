/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from xl0
 */
public final class xl0_1
implements yp1_2 {
    public static final xl0_1 a;
    public static final Choreographer b;

    static {
        CoroutineContext$Element coroutineContext$Element;
        a = coroutineContext$Element = new Object();
        coroutineContext$Element = ir0_2.a;
        coroutineContext$Element = bg1_1.a.N0();
        xl0$a_0 xl0$a_0 = new qg3_2(2, null);
        b = (Choreographer)Ae3.e(coroutineContext$Element, xl0$a_0);
    }

    public final Object R(Function1 object, f80_0 f80_02) {
        Object object2 = zj1_2.b(f80_02);
        int n3 = 1;
        Object object3 = new CancellableContinuationImpl(n3, (f80_0)object2);
        object3.r();
        object2 = new xl0$c((Function1)object, (CancellableContinuationImpl)object3);
        b.postFrameCallback((Choreographer.FrameCallback)object2);
        object = new xl0$b_0((xl0$c)object2);
        object3.x((Function1)object);
        object = object3.q();
        object3 = j90_0.COROUTINE_SUSPENDED;
        if (object == object3) {
            object3 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        }
        return object;
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

