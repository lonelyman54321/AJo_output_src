/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class EU0$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ EU0 b;

    public EU0$b(EU0 eU0, f80_0 f80_02) {
        this.b = eU0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        EU0 eU0 = this.b;
        object = new EU0$b(eU0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (EU0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((EU0$b)object).invokeSuspend(object2);
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
            object = this.b;
            n3 = 0;
            object = ym1_1.c((fo0)object, null, this);
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

