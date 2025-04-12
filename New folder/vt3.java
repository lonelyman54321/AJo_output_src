/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class vt3
extends Lambda
implements Function1 {
    public final /* synthetic */ wt3 c;
    public final /* synthetic */ ut3 d;

    public vt3(wt3 wt32, ut3 ut32) {
        this.c = wt32;
        this.d = ut32;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        object = (xt3)object;
        Object object2 = this.c;
        x30_0 x30_02 = ((wt3)object2).a;
        ut3 ut32 = this.d;
        synchronized (x30_02) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            boolean bl2 = object.b();
                            if (!bl2) break block3;
                            object2 = ((wt3)object2).b;
                            ((UC1)object2).b(ut32, object);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = ((wt3)object2).b;
                    ((UC1)object).c(ut32);
                }
                return Unit.a;
            }
            throw throwable2;
        }
    }
}

