/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from GF2
 */
public final class gf2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ FF2 c;
    public final /* synthetic */ Throwable d;

    public gf2_0(FF2 fF2, Throwable throwable) {
        this.c = fF2;
        this.d = throwable;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        object = (Throwable)object;
        Object object2 = this.c;
        Object object3 = object2.b;
        Throwable throwable = this.d;
        synchronized (object3) {
            Throwable throwable22;
            block9: {
                if (throwable != null) {
                    if (object != null) {
                        boolean bl2 = object instanceof CancellationException;
                        if (bl2) {
                            object = null;
                        }
                        if (object != null) {
                            try {
                                yc0_2.a(throwable, (Throwable)object);
                            }
                            catch (Throwable throwable22) {
                                break block9;
                            }
                        }
                    }
                } else {
                    throwable = null;
                }
                object2.d = throwable;
                object = object2.r;
                object2 = FF2$d.ShutDown;
                ((kb3_2)object).setValue(object2);
                return Unit.a;
            }
            throw throwable22;
        }
    }
}

