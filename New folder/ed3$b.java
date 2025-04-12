/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.util.CommonFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ed3$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ ed3_2 a;

    public ed3$b(ed3_2 ed3_22, f80_0 f80_02) {
        this.a = ed3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ed3_2 ed3_22 = this.a;
        object = new ed3$b(ed3_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ed3$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ed3$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ed3_2)object).j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStoreLPViewModel");
            object2 = null;
        }
        object2 = ((uc3_2)object2).h;
        fd3_2 fd3_22 = new fd3_2(object, 0);
        ((CommonFlow)object2).watch(fd3_22);
        return Unit.a;
    }
}

