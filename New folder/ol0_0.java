/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ol0
 */
public final class ol0_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ rS0 b;
    public final /* synthetic */ Rl0 c;

    public ol0_0(rS0 rS02, Rl0 rl0, f80_0 f80_02) {
        this.b = rS02;
        this.c = rl0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rS0 rS02 = this.b;
        Rl0 rl0 = this.c;
        object = new ol0_0(rS02, rl0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ol0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ol0_0)object).invokeSuspend(object2);
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
        object = this.c;
        float f5 = ((Rl0)object).a;
        float f6 = ((Rl0)object).b;
        float f7 = ((Rl0)object).c;
        float f8 = ((Rl0)object).d;
        this.a = n4;
        rS0 rS02 = this.b;
        rS02.a = f5;
        rS02.b = f6;
        rS02.c = f7;
        rS02.d = f8;
        object = rS02.b(this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

