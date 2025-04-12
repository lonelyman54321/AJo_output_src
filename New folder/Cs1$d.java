/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Cs1$d
extends Lambda
implements Function1 {
    public final /* synthetic */ cs1_1 c;

    public Cs1$d(cs1_1 cs1_12) {
        this.c = cs1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Number)object;
        int n4 = ((Number)object).intValue();
        Object object2 = this.c;
        Object object3 = (wr1_0)((cs1_1)object2).n.invoke();
        if (n4 >= 0 && n4 < (n3 = object3.getItemCount())) {
            object3 = ((LP1$c)object2).f1();
            es1_0 es1_02 = new es1_0((cs1_1)object2, n4, null);
            Ae3.d((i90_0)object3, null, null, es1_02, 3);
            return Boolean.TRUE;
        }
        object = wk0_0.a(n4, "Can't scroll to index ", ", it is out of bounds [0, ");
        int n7 = object3.getItemCount();
        ((StringBuilder)object).append(n7);
        ((StringBuilder)object).append(')');
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

