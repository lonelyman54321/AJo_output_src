/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nY2
 */
public final class ny2_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function1 d;

    public ny2_1(Function0 function0, Function1 function1) {
        this.c = function0;
        this.d = function1;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        e72 e722;
        Object object4;
        Object object5;
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = 759876635;
        object2.K(n3);
        object = object2.v();
        object3 = b30$a.a;
        if (object == object3) {
            object = J83.e(this.c);
            object2.o(object);
        }
        object = (ib3_0)object;
        Object object6 = object2.v();
        if (object6 == object3) {
            long l2 = ((e72)object.getValue()).a;
            object5 = new e72(l2);
            object4 = ly2_0.b;
            long l3 = ly2_0.c;
            e722 = new e72(l3);
            int n4 = 8;
            object6 = new Lj(object5, (Ws3)object4, (Object)e722, n4);
            object2.o(object6);
        }
        object6 = (Lj)object6;
        object4 = Unit.a;
        boolean bl2 = object2.x(object6);
        object5 = object2.v();
        if (bl2 || object5 == object3) {
            bl2 = false;
            e722 = null;
            object5 = new oy2_2((ib3_0)object, (Lj)object6, null);
            object2.o(object5);
        }
        object5 = (Function2)object5;
        ly0_0.d((b30_0)object2, object4, (Function2)object5);
        object = ((Lj)object6).c;
        boolean bl3 = object2.J(object);
        object4 = object2.v();
        if (bl3 || object4 == object3) {
            object4 = new my2_2((ib3_0)object);
            object2.o(object4);
        }
        object4 = (Function0)object4;
        object = (LP1)this.d.invoke(object4);
        object2.E();
        return object;
    }
}

