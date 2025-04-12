/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class ms0$b
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ jb1_2 c;
    public final /* synthetic */ boolean d;

    public ms0$b(f80_0 f80_02) {
        this.d = false;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (jb1_2)object2;
        object3 = (f80_0)object3;
        ms0$b ms0$b = new ms0$b((f80_0)object3);
        ms0$b.b = object;
        ms0$b.c = object2;
        object = Unit.a;
        return ms0$b.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
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
        Object object3 = this.c;
        boolean bl2 = this.d;
        if (bl2) {
            return Unit.a;
        }
        Object object4 = ((jb1_2)object3).a().getAttributes();
        bl2 = object4.f((xq_2)(object2 = ms0_2.a));
        if (bl2) {
            return Unit.a;
        }
        object2 = ((jb1_2)object3).b();
        object4 = new mf_2((uf_1)object2);
        object3 = ((jb1_2)object3).a();
        object2 = new ns0_2((mf_2)object4);
        Intrinsics.checkNotNullParameter(object3, "<this>");
        Intrinsics.checkNotNullParameter(object2, "block");
        Object object5 = ((ea1_2)object3).a;
        l41_0 l41_02 = ((ea1_2)object3).d().getHeaders();
        object4 = new io0_2((da1_2)object5, (Function0)object2, (ea1_2)object3, l41_02);
        object3 = ((ea1_2)object4).getAttributes();
        object2 = ms0_2.b;
        object5 = Unit.a;
        object3.d((xq_2)object2, object5);
        object3 = ((ea1_2)object4).d();
        bl2 = false;
        object4 = null;
        this.b = null;
        this.a = n4;
        object = ((is2_2)object).d(this, object3);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

