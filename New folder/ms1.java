/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class ms1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Cl2 c;

    public ms1(hm0_0 hm0_02, f80_0 f80_02) {
        this.c = hm0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hm0_0 hm0_02 = (hm0_0)this.c;
        ms1 ms12 = new ms1(hm0_02, f80_02);
        ms12.b = object;
        return ms12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (ms1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ms1)object).invokeSuspend(object2);
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
            object = (hw2_0)this.b;
            hm0_0 hm0_02 = (hm0_0)this.c;
            ms1$a ms1$a = new ms1$a((hw2_0)object, hm0_02, null);
            this.a = n4;
            object = d.c(ms1$a, this);
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

