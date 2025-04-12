/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Sg1
 */
public final class sg1_0
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Function1 b;

    public sg1_0(Function1 function1, f80_0 f80_02) {
        this.b = function1;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Function1 function1 = this.b;
        sg1_0 sg1_02 = new sg1_0(function1, f80_02);
        return sg1_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (sg1_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((sg1_0)object).invokeSuspend(unit);
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
            object = aQ1.a(this.getContext());
            Function1 function1 = this.b;
            object = object.R(function1, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

