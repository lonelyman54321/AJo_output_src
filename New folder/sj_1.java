/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from sJ
 */
public final class sj_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ es0_2 b;
    public final /* synthetic */ vJ c;

    public sj_1(es0_2 es0_22, vJ vJ2, f80_0 f80_02) {
        this.b = es0_22;
        this.c = vJ2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        es0_2 es0_22 = this.b;
        vJ vJ2 = this.c;
        object = new sj_1(es0_22, vJ2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (sj_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sj_1)object).invokeSuspend(object2);
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
        vJ vJ2 = this.c;
        object = new sJ$a(vJ2);
        this.a = n4;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        wt0_2 wt0_22 = new wt0_2((fs0_2)object, ref$IntRef);
        object = this.b.collect(wt0_22, this);
        j90_0 j90_03 = j90_0.COROUTINE_SUSPENDED;
        if (object != j90_03) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

