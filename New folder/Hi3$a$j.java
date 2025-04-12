/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Hi3$a$j
extends rl2_2
implements Function2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Ref$ObjectRef g;
    public final /* synthetic */ dy2_1 h;

    public Hi3$a$j(i90_0 i90_02, Function1 function1, Function1 function12, Ref$ObjectRef ref$ObjectRef, dy2_1 dy2_12, f80_0 f80_02) {
        this.d = i90_02;
        this.e = function1;
        this.f = function12;
        this.g = ref$ObjectRef;
        this.h = dy2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.g;
        dy2_1 dy2_12 = this.h;
        i90_0 i90_02 = this.d;
        Function1 function1 = this.e;
        Function1 function12 = this.f;
        Hi3$a$j hi3$a$j = new Hi3$a$j(i90_02, function1, function12, ref$ObjectRef, dy2_12, f80_02);
        hi3$a$j.c = object;
        return hi3$a$j;
    }

    public final Object invoke(Object object, Object object2) {
        object = (ru_0)object;
        object2 = (f80_0)object2;
        object = (Hi3$a$j)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Hi3$a$j)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.b;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = (ru_0)this.c;
            this.b = n4;
            Di3$a di3$a = Di3.a;
            Nv2 nv2 = Nv2.Main;
            object = Di3.e((ru_0)object, nv2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (aw2_0)object;
        i90_0 i90_02 = this.d;
        n3 = 3;
        n4 = 0;
        Object object2 = null;
        dy2_1 dy2_12 = this.h;
        if (object != null) {
            ((aw2_0)object).a();
            Hi3$a$j$a hi3$a$j$a = new Hi3$a$j$a(dy2_12, null);
            Ae3.d(i90_02, null, null, hi3$a$j$a, n3);
            long l2 = ((aw2_0)object).c;
            e72 e722 = new e72(l2);
            object = this.e;
            object.invoke(e722);
            return Unit.a;
        }
        object = new Hi3$a$j$b(dy2_12, null);
        Ae3.d(i90_02, null, null, (Function2)object, n3);
        object = this.f;
        if (object == null) return object2;
        aw2_0 aw2_02 = (aw2_0)this.g.element;
        long l3 = aw2_02.c;
        object2 = new e72(l3);
        object.invoke(object2);
        return Unit.a;
    }
}

