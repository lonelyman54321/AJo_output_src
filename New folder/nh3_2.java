/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from NH3
 */
public final class nh3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ MH3 b;
    public final /* synthetic */ EI3 c;
    public final /* synthetic */ t82 d;

    public nh3_2(MH3 mH3, EI3 eI3, t82 t822, f80_0 f80_02) {
        this.b = mH3;
        this.c = eI3;
        this.d = t822;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        EI3 eI3 = this.c;
        t82 t822 = this.d;
        MH3 mH3 = this.b;
        object = new nh3_2(mH3, eI3, t822, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nh3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nh3_2)object).invokeSuspend(object2);
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
            object = this.b;
            EI3 eI3 = this.c;
            object = ((MH3)object).b(eI3);
            t82 t822 = this.d;
            NH3$a nH3$a = new NH3$a(t822, eI3);
            this.a = n4;
            object = object.collect(nH3$a, this);
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

