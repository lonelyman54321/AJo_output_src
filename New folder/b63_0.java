/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from b63
 */
public final class b63_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ X53 c;

    public b63_0(X53 x53, f80_0 f80_02) {
        this.c = x53;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        X53 x53 = this.c;
        b63_0 b63_02 = new b63_0(x53, f80_02);
        b63_02.b = object;
        return b63_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (b63_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((b63_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Y43 y43;
        Object object2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (fs0_2)this.b;
        X53 x53 = this.c;
        Object object3 = (gb3_0)x53.h.getValue();
        boolean bl2 = object3 instanceof Yh0;
        if (!bl2) {
            object2 = new X53$a$a((gb3_0)object3);
            y43 = x53.j;
            y43.a((X53$a)object2);
        }
        y43 = null;
        object2 = new b63$a((gb3_0)object3, null);
        this.a = n4;
        n4 = object instanceof qn3_0;
        if (n4 != 0) throw ((qn3_0)object).a;
        c63_0 c63_02 = new c63_0((fs0_2)object);
        object = new Ref$BooleanRef();
        object3 = new ht0_2((Ref$BooleanRef)object, c63_02, (Function2)object2);
        if ((object = x53.h.collect((fs0_2)object3, this)) != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

