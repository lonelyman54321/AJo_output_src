/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from RS0
 */
public final class rs0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ es0_2 b;

    public rs0_2(vt0_2 vt0_22, f80_0 f80_02) {
        this.b = vt0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        vt0_2 vt0_22 = (vt0_2)this.b;
        object = new rs0_2(vt0_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rs0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rs0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        object = o42_0.a;
        es0_2 es0_22 = this.b;
        object = es0_22.collect((fs0_2)object, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

