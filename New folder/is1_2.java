/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from iS1
 */
public final class is1_2
implements gx0_2 {
    public final /* synthetic */ ks1_1 a;
    public final /* synthetic */ kS1$a b;

    public /* synthetic */ is1_2(ks1_1 ks1_12, kS1$a kS1$a) {
        this.a = ks1_12;
        this.b = kS1$a;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object2 = (Unit)object2;
        object3 = (CoroutineContext)object3;
        object = ks1_1.h;
        object2 = this.b;
        object3 = ((kS1$a)object2).b;
        ks1_1 ks1_12 = this.a;
        ((AtomicReferenceFieldUpdater)object).set(ks1_12, object3);
        object = ((kS1$a)object2).b;
        ks1_12.b(object);
        return Unit.a;
    }
}

