/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.AdaptedFunctionReference;

/*
 * Renamed from Y03
 */
public final class y03_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ gx0_2 c;

    public y03_0(gx0_2 gx0_22, f80_0 f80_02) {
        this.c = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.c;
        object2 = new y03_0(gx0_22, (f80_0)object3);
        ((y03_0)object2).b = object;
        object = Unit.a;
        return ((y03_0)object2).invokeSuspend(object);
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
            is2_2 is2_22 = this.b;
            object = is2_22.a;
            String string2 = "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;";
            int n7 = 8;
            int n8 = 1;
            Class<is2_2> clazz = is2_2.class;
            String string3 = "proceed";
            Y03$a y03$a = new AdaptedFunctionReference(n8, is2_22, clazz, string3, string2, n7);
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            object = gx0_22.invoke(object, y03$a, this);
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

