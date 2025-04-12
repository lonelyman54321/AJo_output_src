/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H$a
 */
public final class h$a_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g_0 c;

    public h$a_0(g_0 g_02, f80_0 f80_02) {
        this.c = g_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        g_0 g_02 = this.c;
        h$a_0 h$a_0 = new h$a_0(g_02, f80_02);
        h$a_0.b = object;
        return h$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Ml2)object;
        object2 = (f80_0)object2;
        object = (h$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((h$a_0)object).invokeSuspend(object2);
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
        object = (Ml2)this.b;
        D d2 = this.c.d;
        if (d2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("acTransferableAdapter");
            n3 = 0;
            d2 = null;
        }
        this.a = n4;
        if ((object = d2.i((Ml2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

