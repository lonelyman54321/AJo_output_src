/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from vf0
 */
public final class vf0_1
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wf0_0 b;

    public vf0_1(wf0_0 wf0_02, f80_0 f80_02) {
        this.b = wf0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wf0_0 wf0_02 = this.b;
        vf0_1 vf0_12 = new vf0_1(wf0_02, f80_02);
        vf0_12.a = object;
        return vf0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vf0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vf0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        block1: {
            Object object2 = j90_0.COROUTINE_SUSPENDED;
            vl2_2.b(object);
            object = (i90_0)this.a;
            object2 = this.b;
            i i3 = ((wf0_0)object2).a.getAndSet(null);
            AtomicReference atomicReference = ((wf0_0)object2).a;
            vf0$a vf0$a = new vf0$a(i3, (wf0_0)object2, null);
            int n3 = 3;
            object = Ae3.d((i90_0)object, null, null, vf0$a, n3);
            do {
                if ((n3 = (int)(atomicReference.compareAndSet(null, object) ? 1 : 0)) == 0) continue;
                bl2 = true;
                break block1;
            } while ((object2 = atomicReference.get()) == null);
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

