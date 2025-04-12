/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Lv3$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fs0_2 c;

    public Lv3$a(fs0_2 fs0_22, f80_0 f80_02) {
        this.c = fs0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs0_2 fs0_22 = this.c;
        Lv3$a lv3$a = new Lv3$a(fs0_22, f80_02);
        lv3$a.b = object;
        return lv3$a;
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (f80_0)object2;
        object = (Lv3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Lv3$a)object).invokeSuspend(object2);
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
            object = this.b;
            this.a = n4;
            fs0_2 fs0_22 = this.c;
            object = fs0_22.emit(object, this);
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

