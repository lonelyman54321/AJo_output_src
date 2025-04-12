/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class TS0$c
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;

    public TS0$c(ge2_2 ge2_22, f80_0 f80_02) {
        this.c = ge2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ge2_2 ge2_22 = (ge2_2)this.c;
        TS0$c tS0$c = new TS0$c(ge2_22, f80_02);
        tS0$c.b = object;
        return tS0$c;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (TS0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((TS0$c)object).invokeSuspend(object2);
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
            object = (pz2_2)this.b;
            TS0$c$a tS0$c$a = new TS0$c$a((pz2_2)object);
            this.a = n4;
            object = this.c.collect(tS0$c$a, this);
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

