/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.util.CommonFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from B9
 */
public final class b9_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ q9_0 a;

    public b9_0(q9_0 q9_02, f80_0 f80_02) {
        this.a = q9_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q9_0 q9_02 = this.a;
        object = new b9_0(q9_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (b9_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((b9_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((q9_0)object).X;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ajiohomeViewModel");
            object2 = null;
        }
        object2 = ((x9_0)object2).l;
        A9 a9 = new A9(object, 0);
        ((CommonFlow)object2).watch(a9);
        return Unit.a;
    }
}

