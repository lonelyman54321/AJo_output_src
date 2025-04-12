/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class TR$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ es0_2 b;
    public final /* synthetic */ nz2_1 c;

    public TR$a(es0_2 es0_22, nz2_1 nz2_12, f80_0 f80_02) {
        this.b = es0_22;
        this.c = nz2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.b;
        nz2_1 nz2_12 = this.c;
        object = new TR$a(es0_22, nz2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (TR$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((TR$a)object).invokeSuspend(object2);
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
            nz2_1 nz2_12 = this.c;
            object = object.collect(nz2_12, this);
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

