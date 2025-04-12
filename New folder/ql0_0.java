/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ql0
 */
public final class ql0_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wr1_1 c;
    public final /* synthetic */ rS0 d;

    public ql0_0(wr1_1 wr1_12, rS0 rS02, f80_0 f80_02) {
        this.c = wr1_12;
        this.d = rS02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rS0 rS02 = this.d;
        wr1_1 wr1_12 = this.c;
        ql0_0 ql0_02 = new ql0_0(wr1_12, rS02, f80_02);
        ql0_02.b = object;
        return ql0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ql0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ql0_0)object).invokeSuspend(object2);
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
            i90_0 i90_02 = (i90_0)this.b;
            ArrayList arrayList = new ArrayList();
            i23_0 i23_02 = this.c.b();
            rS0 rS02 = this.d;
            Ql0$a ql0$a = new Ql0$a(arrayList, i90_02, rS02);
            this.a = n4;
            i23_02.getClass();
            j90_0 j90_03 = i23_0.l(i23_02, ql0$a, this);
            if (j90_03 != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw illegalStateException;
    }
}

