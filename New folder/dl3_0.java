/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dl3
 */
public final class dl3_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Sk3 c;

    public dl3_0(Sk3 sk3) {
        this.c = sk3;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = 1980580247;
        object2.K(n3);
        object3 = O30.f;
        object3 = (Vo0)object2.j((H30)object3);
        Object object4 = object2.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object4 == b30$a$a) {
            long l2 = 0L;
            object4 = new bj1(l2);
            object4 = J83.g(object4);
            object2.o(object4);
        }
        object4 = (tr1_0)object4;
        Sk3 sk3 = this.c;
        boolean bl2 = object2.x(sk3);
        Object object5 = object2.v();
        if (bl2 || object5 == b30$a$a) {
            object5 = new Zk3(sk3, (tr1_0)object4);
            object2.o(object5);
        }
        object5 = (Function0)object5;
        boolean bl3 = object2.J(object3);
        Object object6 = object2.v();
        if (bl3 || object6 == b30$a$a) {
            object6 = new cl3_0((Vo0)object3, (tr1_0)object4);
            object2.o(object6);
        }
        object6 = (Function1)object6;
        object3 = ly2_0.a;
        object3 = new ny2_1((Function0)object5, (Function1)object6);
        object4 = ji1.a;
        object = a30_0.a((LP1)object, (Function1)object4, (gx0_2)object3);
        object2.E();
        return object;
    }
}

