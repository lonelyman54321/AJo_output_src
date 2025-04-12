/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tk2
 */
public final class tk2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sk2 c;

    public tk2_1(f80_0 f80_02, sk2 sk22) {
        this.c = sk22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        sk2 sk22 = this.c;
        tk2_1 tk2_12 = new tk2_1(f80_02, sk22);
        tk2_12.b = object;
        return tk2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (x53_0)object;
        object2 = (f80_0)object2;
        object = (tk2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tk2_1)object).invokeSuspend(object2);
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
            object = (x53_0)this.b;
            Object object2 = this.c;
            Object object3 = ((sk2)object2).d.b;
            Object object4 = new tk2$a_0(null);
            ys0_2 ys0_22 = new ys0_2((es0_2)object3, (Function2)object4);
            object3 = new tk2$b_0(null, (sk2)object2);
            Intrinsics.checkNotNullParameter(ys0_22, "<this>");
            Intrinsics.checkNotNullParameter(object3, "operation");
            object4 = new ks0_0(ys0_22, (tk2$b_0)object3, null);
            object3 = new br2_2((Function2)object4);
            object4 = new ut0_2((es0_2)object3);
            object3 = new tk2$e(null, (sk2)object2);
            object2 = LS0.a((es0_2)object4, (gx0_2)object3);
            object3 = new tk2$d((x53_0)object);
            this.a = n4;
            object = object2.collect((fs0_2)object3, this);
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

