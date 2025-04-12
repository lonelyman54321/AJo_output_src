/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Je
 */
public final class je_1
extends qg3_2
implements Function1 {
    public int a;
    public final /* synthetic */ Re b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ hx0_2 d;

    public je_1(Re re, Object object, De$a de$a, f80_0 f80_02) {
        this.b = re;
        this.c = object;
        this.d = de$a;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Re re = this.b;
        De$a de$a = (De$a)this.d;
        Object object = this.c;
        je_1 je_12 = new je_1(re, object, de$a, f80_02);
        return je_12;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (je_1)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((je_1)object).invokeSuspend(unit);
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
            Re re = this.b;
            re.g(object);
            object = new Je$a(re);
            De$a de$a = (De$a)this.d;
            Je$b je$b = new Je$b(de$a, re, null);
            this.a = n4;
            object = de_0.a((Function0)object, je$b, this);
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

