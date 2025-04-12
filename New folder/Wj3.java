/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class Wj3
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wf0_0 b;

    public Wj3(wf0_0 wf0_02, f80_0 f80_02) {
        this.b = wf0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wf0_0 wf0_02 = this.b;
        object = new Wj3(wf0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Wj3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Wj3)object).invokeSuspend(object2);
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
        object = this.b;
        object.getClass();
        n4 = 0;
        vf0_1 vf0_12 = new vf0_1((wf0_0)object, null);
        object = d.c(vf0_12, this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

