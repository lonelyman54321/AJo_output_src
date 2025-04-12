/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class ji0$a
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ gi0_1 b;

    public ji0$a(gi0_1 gi0_12, f80_0 f80_02) {
        this.b = gi0_12;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        gi0_1 gi0_12 = this.b;
        ji0$a ji0$a = new ji0$a(gi0_12, f80_02);
        return ji0$a;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (ji0$a)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((ji0$a)object).invokeSuspend(unit);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            this.a = n4;
            object = this.b.cleanUp();
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

