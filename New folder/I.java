/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class I
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ g_0 b;

    public I(g_0 g_02, f80_0 f80_02) {
        this.b = g_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        g_0 g_02 = this.b;
        object = new I(g_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (I)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((I)object).invokeSuspend(object2);
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
        object = this.b;
        Object object2 = ((g_0)object).d;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acTransferableAdapter");
            n3 = 0;
            object2 = null;
        }
        object2 = ((Ql2)object2).c;
        I$a i$a = new I$a((g_0)object, null);
        this.a = n4;
        object = ms0_1.f((es0_2)object2, i$a, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

