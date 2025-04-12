/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

public final class G60$c
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ G60 c;
    public final /* synthetic */ tw3 d;
    public final /* synthetic */ UD e;

    public G60$c(G60 g60, tw3 tw32, UD uD, f80_0 f80_02) {
        this.c = g60;
        this.d = tw32;
        this.e = uD;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tw3 tw32 = this.d;
        UD uD = this.e;
        G60 g60 = this.c;
        G60$c g60$c = new G60$c(g60, tw32, uD, f80_02);
        g60$c.b = object;
        return g60$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (G60$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((G60$c)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        CancellationException cancellationException;
        G60 g60;
        block9: {
            block8: {
                j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n3 = this.a;
                g60 = this.c;
                int n4 = 1;
                cancellationException = null;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                object = ((i90_0)this.b).getCoroutineContext();
                i i3 = mm0.e((CoroutineContext)object);
                g60.w = n4;
                object = g60.o;
                aS1 aS12 = aS1.Default;
                tw3 tw32 = this.d;
                UD uD = this.e;
                G60$c$a g60$c$a = new G60$c$a(tw32, g60, uD, i3, null);
                this.a = n4;
                object = ((ku2_0)object).e(aS12, g60$c$a, this);
                if (object != j90_02) break block8;
                return j90_02;
            }
            try {
                object = g60.r;
                ((LD)object).b();
            }
            catch (Throwable throwable2) {
                break block9;
            }
            catch (CancellationException cancellationException2) {
                cancellationException = cancellationException2;
            }
            g60.w = false;
            g60.r.a(null);
            g60.u = false;
            return Unit.a;
            {
                throw cancellationException2;
            }
        }
        g60.w = false;
        g60.r.a(cancellationException);
        g60.u = false;
        throw throwable2;
    }
}

