/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from I72
 */
public final class i72_0
implements Function1 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ se_1 b;
    public final /* synthetic */ eb1_2 c;
    public final /* synthetic */ CoroutineContext d;

    public /* synthetic */ i72_0(Ref$IntRef ref$IntRef, se_1 se_12, eb1_2 eb1_22, CoroutineContext coroutineContext) {
        this.a = ref$IntRef;
        this.b = se_12;
        this.c = eb1_22;
        this.d = coroutineContext;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = this.d;
        object = (ByteBuffer)object;
        try {
            int n3;
            this.a.element = n3 = object2.read((ByteBuffer)object);
            return Unit.a;
        }
        catch (Throwable throwable) {
            Object object4;
            boolean bl2;
            object2 = tl2_2.b;
            object2 = mm0.e((CoroutineContext)object3);
            try {
                object2 = object2.w();
            }
            catch (Throwable throwable2) {
                object3 = tl2_2.b;
                object2 = vl2_2.a(throwable2);
            }
            object3 = tl2_2.b;
            boolean bl3 = object2 instanceof tL2$b;
            if (bl3) {
                bl2 = false;
                object2 = null;
            }
            if ((object2 = (CancellationException)object2) != null) {
                object4 = object2;
            }
            if (bl2 = object4 instanceof SocketTimeoutException) {
                object2 = this.c;
                object4 = yb1_2.a((eb1_2)object2, (Throwable)object4);
            }
            throw object4;
        }
    }
}

