/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class WD$b
extends Lambda
implements Function1 {
    public final /* synthetic */ WD c;
    public final /* synthetic */ WD$a d;

    public WD$b(WD wD, WD$a wD$a) {
        this.c = wD;
        this.d = wD$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c;
        Object object2 = ((WD)object).b;
        Object object3 = this.d;
        synchronized (object2) {
            Throwable throwable2;
            block8: {
                block7: {
                    List list;
                    try {
                        list = ((WD)object).d;
                    }
                    catch (Throwable throwable2) {}
                    list.remove(object3);
                    object3 = ((WD)object).d;
                    boolean bl2 = object3.isEmpty();
                    if (!bl2) break block7;
                    object = ((WD)object).f;
                    bl2 = false;
                    object3 = null;
                    ((AtomicInteger)object).set(0);
                    break block8;
                }
                return Unit.a;
            }
            throw throwable2;
        }
    }
}

