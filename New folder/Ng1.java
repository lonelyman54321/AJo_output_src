/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;

public final class Ng1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Lg1 c;
    public final /* synthetic */ wr1_1 d;

    public Ng1(Lg1 lg1, wr1_1 wr1_12) {
        this.c = lg1;
        this.d = wr1_12;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = -353972293;
        object2.K(n3);
        object = this.c;
        object3 = this.d;
        object = object.b((wr1_1)object3, (b30_0)object2);
        boolean bl2 = object2.J(object);
        Object object4 = object2.v();
        if (bl2 || object4 == (object3 = b30$a.a)) {
            object4 = new Og1((Mg1)object);
            object2.o(object4);
        }
        object4 = (Og1)object4;
        object2.E();
        return object4;
    }
}

