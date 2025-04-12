/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from XY2
 */
public final class xy2_2
implements gx0_2 {
    public final /* synthetic */ yy2_2 a;

    public /* synthetic */ xy2_2(yy2_2 yy2_22) {
        this.a = yy2_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object2 = (Unit)object2;
        object3 = (CoroutineContext)object3;
        this.a.release();
        return Unit.a;
    }
}

