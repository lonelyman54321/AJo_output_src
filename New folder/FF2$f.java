/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.i;

public final class FF2$f
extends Lambda
implements Function1 {
    public final /* synthetic */ FF2 c;

    public FF2$f(FF2 fF2) {
        this.c = fF2;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        object = (Throwable)object;
        Object object2 = xc0_2.a("Recomposer effect job completed", (Throwable)object);
        FF2 fF2 = this.c;
        Object object3 = fF2.b;
        synchronized (object3) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            i i3 = fF2.c;
                            if (i3 == null) break block3;
                            kb3_2 kb3_22 = fF2.r;
                            FF2$d fF2$d = FF2$d.ShuttingDown;
                            kb3_22.setValue((Object)fF2$d);
                            kb3_22 = FF2.v;
                            i3.d((CancellationException)object2);
                            object2 = null;
                            fF2.o = null;
                            object2 = new gf2_0(fF2, (Throwable)object);
                            i3.G((Function1)object2);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    fF2.d = object2;
                    object = fF2.r;
                    object2 = FF2$d.ShutDown;
                    ((kb3_2)object).setValue(object2);
                    object = Unit.a;
                }
                return Unit.a;
            }
            throw throwable2;
        }
    }
}

