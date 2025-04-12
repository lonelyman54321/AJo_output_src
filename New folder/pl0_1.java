/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pl0
 */
public final class pl0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wr1_1 b;
    public final /* synthetic */ p83_0 c;

    public pl0_1(wr1_1 wr1_12, p83_0 p83_02, f80_0 f80_02) {
        this.b = wr1_12;
        this.c = p83_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        p83_0 p83_02 = this.c;
        wr1_1 wr1_12 = this.b;
        object = new pl0_1(wr1_12, p83_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pl0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pl0_1)object).invokeSuspend(object2);
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
            i23_0 i23_02 = this.b.b();
            p83_0 p83_02 = this.c;
            pl0$a pl0$a = new pl0$a(p83_02);
            this.a = n4;
            i23_02.getClass();
            j90_0 j90_03 = i23_0.l(i23_02, pl0$a, this);
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

