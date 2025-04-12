/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.util.CommonFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from u9
 */
public final class u9_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ q9_0 a;

    public u9_0(q9_0 q9_02, f80_0 f80_02) {
        this.a = q9_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q9_0 q9_02 = this.a;
        object = new u9_0(q9_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u9_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u9_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = q9_0.Companion;
        object = this.a;
        object2 = ((xw0_2)((q9_0)object).k0.getValue()).b;
        t9_0 t9_02 = new t9_0(object, 0);
        ((CommonFlow)object2).watch(t9_02);
        return Unit.a;
    }
}

