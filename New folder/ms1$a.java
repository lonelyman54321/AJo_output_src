/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class ms1$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ hw2_0 b;
    public final /* synthetic */ Cl2 c;

    public ms1$a(hw2_0 hw2_02, hm0_0 hm0_02, f80_0 f80_02) {
        this.b = hw2_02;
        this.c = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.c;
        hw2_0 hw2_02 = this.b;
        object = new ms1$a(hw2_02, hm0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ms1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ms1$a)object).invokeSuspend(object2);
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
            n3 = 0;
            hm0_0 hm0_02 = (hm0_0)this.c;
            object = new ms1$a$a(hm0_02, null);
            this.a = n4;
            hw2_0 hw2_02 = this.b;
            object = vv0_0.b(hw2_02, (Function2)object, this);
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

