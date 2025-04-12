/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ul2
 */
public final class ul2_0
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Sl2 b;
    public final /* synthetic */ Ml2 c;

    public ul2_0(Sl2 sl2, Ml2 ml2, f80_0 f80_02) {
        this.b = sl2;
        this.c = ml2;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Sl2 sl2 = this.b;
        Ml2 ml2 = this.c;
        ul2_0 ul2_02 = new ul2_0(sl2, ml2, f80_02);
        return ul2_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (ul2_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((ul2_0)object).invokeSuspend(unit);
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
            object = this.c;
            Object object2 = ((Ml2)object).b;
            object2 = this.b;
            object2.getClass();
            es0_2 es0_22 = ((Ml2)object).a;
            Ul2$a ul2$a = new Ul2$a((Sl2)object2, (Ml2)object);
            this.a = n4;
            object = es0_22.collect(ul2$a, this);
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

