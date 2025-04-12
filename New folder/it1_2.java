/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from it1
 */
public final class it1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ft1_2 b;

    public it1_2(ft1_2 ft1_22, f80_0 f80_02) {
        this.b = ft1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.b;
        object = new it1_2(ft1_22, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (it1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((it1_2)object).invokeSuspend(object2);
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
            il_0 il_02 = this.b.w;
            Float f5 = new Float(0.0f);
            object = new Float(0.5f);
            n3 = 1137180672;
            float f6 = 400.0f;
            xa3_2 xa3_22 = Hl.b(f6, n4, object);
            this.a = n4;
            int n7 = 8;
            boolean bl2 = true;
            object = mg3_0.f(il_02, f5, xa3_22, bl2, null, this, n7);
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

