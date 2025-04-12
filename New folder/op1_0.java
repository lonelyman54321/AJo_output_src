/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from op1
 */
public final class op1_0
implements ti2_0 {
    public final Function2 a;
    public final c80 b;
    public mb3_2 c;

    public op1_0(CoroutineContext object, Function2 function2) {
        this.a = function2;
        this.b = object = d.a((CoroutineContext)object);
    }

    public final void onAbandoned() {
        mb3_2 mb3_22 = this.c;
        if (mb3_22 != null) {
            It1 it1 = new It1();
            mb3_22.K(it1);
        }
        this.c = null;
    }

    public final void onForgotten() {
        mb3_2 mb3_22 = this.c;
        if (mb3_22 != null) {
            It1 it1 = new It1();
            mb3_22.K(it1);
        }
        this.c = null;
    }

    public final void onRemembered() {
        Object object;
        mb3_2 mb3_22 = this.c;
        if (mb3_22 != null) {
            object = xc0_2.a("Old job was still running!", null);
            mb3_22.d((CancellationException)object);
        }
        object = this.a;
        this.c = mb3_22 = Ae3.d(this.b, null, null, (Function2)object, 3);
    }
}

