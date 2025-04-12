/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

public final class G60$c$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tw3 c;
    public final /* synthetic */ G60 d;
    public final /* synthetic */ UD e;
    public final /* synthetic */ i f;

    public G60$c$a(tw3 tw32, G60 g60, UD uD, i i3, f80_0 f80_02) {
        this.c = tw32;
        this.d = g60;
        this.e = uD;
        this.f = i3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        UD uD = this.e;
        i i3 = this.f;
        tw3 tw32 = this.c;
        G60 g60 = this.d;
        G60$c$a g60$c$a = new G60$c$a(tw32, g60, uD, i3, f80_02);
        g60$c$a.b = object;
        return g60$c$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (G60$c$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((G60$c$a)object).invokeSuspend(object2);
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
            G60 g60 = this.d;
            UD uD = this.e;
            float f5 = G60.r1(g60, uD);
            tw3 tw32 = this.c;
            tw32.e = f5;
            i i3 = this.f;
            G60$c$a$a g60$c$a$a = new G60$c$a$a(g60, i3, (tU1)object);
            object = new G60$c$a$b(g60, tw32, uD);
            this.a = n4;
            object = tw32.a(g60$c$a$a, (G60$c$a$b)object, this);
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

