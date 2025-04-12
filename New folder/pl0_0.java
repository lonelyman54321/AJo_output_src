/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Pl0
 */
public final class pl0_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ rS0 b;
    public final /* synthetic */ kj1 c;

    public pl0_0(rS0 rS02, kj1 kj12, f80_0 f80_02) {
        this.b = rS02;
        this.c = kj12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rS0 rS02 = this.b;
        kj1 kj12 = this.c;
        object = new pl0_0(rS02, kj12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pl0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pl0_0)object).invokeSuspend(object2);
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
            kj1 kj12 = this.c;
            object = ((rS0)object).a(kj12, this);
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

