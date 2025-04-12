/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Je$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hx0_2 c;
    public final /* synthetic */ Re d;

    public Je$b(De$a de$a, Re re, f80_0 f80_02) {
        this.c = de$a;
        this.d = re;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Re re = this.d;
        De$a de$a = (De$a)this.c;
        Je$b je$b = new Je$b(de$a, re, f80_02);
        je$b.b = object;
        return je$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Pair)object;
        object2 = (f80_0)object2;
        object = (Je$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Je$b)object).invokeSuspend(object2);
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
            object = (Pair)this.b;
            Xs0 xs0 = (Xs0)((Pair)object).a;
            Ke ke = this.d.n;
            this.a = n4;
            hx0_2 hx0_22 = this.c;
            object = ((Pair)object).b;
            object = hx0_22.invoke(ke, xs0, object, this);
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

