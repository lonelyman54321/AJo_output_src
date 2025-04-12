/*
 * Decompiled with CFR 0.152.
 */
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from Th
 */
public final class th_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Uh d;
    public final /* synthetic */ Qt1$a e;

    public th_0(Sh sh, Uh uh, Qt1$a qt1$a, f80_0 f80_02) {
        this.c = sh;
        this.d = uh;
        this.e = qt1$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sh sh = (Sh)this.c;
        Uh uh = this.d;
        Qt1$a qt1$a = this.e;
        th_0 th_02 = new th_0(sh, uh, qt1$a, f80_02);
        th_02.b = object;
        return th_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (At2)object;
        object2 = (f80_0)object2;
        object = (th_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((th_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            Function1 function1;
            vl2_2.b(object);
            Object object2 = object = this.b;
            object2 = (At2)object;
            Uh uh = this.d;
            Function1 function12 = function1 = this.c;
            function12 = (Sh)function1;
            Qt1$a qt1$a = this.e;
            object = new Th$a((At2)object2, (Sh)function12, uh, qt1$a, null);
            this.a = n4;
            object = kotlinx.coroutines.d.c((Function2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = new KotlinNothingValueException();
        throw object;
    }
}

