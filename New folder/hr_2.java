/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from HR
 */
public final class hr_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ir_2 c;

    public hr_2(ir_2 ir_22, f80_0 f80_02) {
        this.c = ir_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ir_2 ir_22 = this.c;
        hr_2 hr_22 = new hr_2(ir_22, f80_02);
        hr_22.b = object;
        return hr_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pz2_2)object;
        object2 = (f80_0)object2;
        object = (hr_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hr_2)object).invokeSuspend(object2);
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
            this.a = n4;
            ir_2 ir_22 = this.c;
            object = ir_22.g((pz2_2)object, this);
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

