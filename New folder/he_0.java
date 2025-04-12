/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from He
 */
public final class he_0
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Re b;
    public final /* synthetic */ gx0_2 c;

    public he_0(me_0 me_02, Re re, f80_0 f80_02) {
        this.b = re;
        this.c = me_02;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        me_0 me_02 = (me_0)this.c;
        Re re = this.b;
        he_0 he_02 = new he_0(me_02, re, f80_02);
        return he_02;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (he_0)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((he_0)object).invokeSuspend(unit);
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
            Re re = this.b;
            object = new He$a(re);
            me_0 me_02 = (me_0)this.c;
            He$b he$b = new He$b(me_02, re, null);
            this.a = n4;
            object = de_0.a((Function0)object, he$b, this);
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

