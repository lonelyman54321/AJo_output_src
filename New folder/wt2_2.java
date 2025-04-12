/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;

/*
 * Renamed from WT2
 */
public final class wt2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku2_0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Ref$FloatRef e;

    public wt2_2(ku2_0 ku2_02, long l2, Ref$FloatRef ref$FloatRef, f80_0 f80_02) {
        this.c = ku2_02;
        this.d = l2;
        this.e = ref$FloatRef;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.d;
        Ref$FloatRef ref$FloatRef = this.e;
        ku2_0 ku2_02 = this.c;
        wt2_2 wt2_22 = new wt2_2(ku2_02, l2, ref$FloatRef, f80_02);
        wt2_22.b = object;
        return wt2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (wt2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wt2_2)object).invokeSuspend(object2);
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
            object = (tU1)this.b;
            ku2_0 ku2_02 = this.c;
            long l2 = this.d;
            float f5 = ku2_02.f(l2);
            Ref$FloatRef ref$FloatRef = this.e;
            WT2$a wT2$a = new WT2$a(ref$FloatRef, ku2_02, (tU1)object);
            this.a = n4;
            int n7 = 12;
            object = mg3_0.c(0.0f, f5, null, wT2$a, this, n7);
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

