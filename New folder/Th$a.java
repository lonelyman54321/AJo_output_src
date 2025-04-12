/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Th$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ At2 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Uh e;
    public final /* synthetic */ Qt1$a f;

    public Th$a(At2 at2, Sh sh, Uh uh, Qt1$a qt1$a, f80_0 f80_02) {
        this.c = at2;
        this.d = sh;
        this.e = uh;
        this.f = qt1$a;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Th$a th$a;
        fx0_2 fx0_22;
        Function1 function1 = fx0_22 = this.d;
        function1 = (Sh)fx0_22;
        At2 at2 = this.c;
        Uh uh = this.e;
        Qt1$a qt1$a = this.f;
        fx0_22 = th$a;
        th$a = new Th$a(at2, (Sh)function1, uh, qt1$a, f80_02);
        th$a.b = object;
        return th$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Th$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Th$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        block8: {
            j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.a;
            int n4 = 1;
            Uh uh = this.e;
            if (n3 != 0) {
                if (n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                break block8;
            }
            vl2_2.b(object);
            object = (i90_0)this.b;
            Object object2 = Rt1.a;
            At2 at2 = this.c;
            Object object3 = at2.getView();
            object2.getClass();
            object2 = new Sh1((View)object3);
            Object object4 = at2.getView();
            Qt1$a qt1$a = this.f;
            Th$a$b th$a$b = new Th$a$b(qt1$a);
            object3 = new xt1_0((View)object4, th$a$b, (Sh1)object2);
            boolean bl2 = ef3_0.a;
            if (bl2) {
                object4 = new Th$a$a(uh, (Sh1)object2, null);
                n3 = 3;
                Ae3.d((i90_0)object, null, null, (Function2)object4, n3);
            }
            if ((object = this.d) != null) {
                object.invoke(object3);
            }
            uh.c = object3;
            try {
                this.a = n4;
                object = at2.a((xt1_0)object3, this);
                if (object != j90_02) break block8;
                return j90_02;
            }
            catch (Throwable throwable2) {}
        }
        object = new KotlinNothingValueException();
        throw object;
        uh.c = null;
        throw throwable2;
    }
}

