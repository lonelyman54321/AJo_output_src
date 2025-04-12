/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eH3
 */
public final class eh3_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function1 c;

    public eh3_0(Function1 function1) {
        this.c = function1;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        ((Number)object3).intValue();
        int n3 = -1608161351;
        object2.K(n3);
        object = this.c;
        boolean bl2 = object2.J(object);
        Object object4 = object2.v();
        if (bl2 || object4 == (object3 = b30$a.a)) {
            object4 = new m60_0((Function1)object);
            object2.o(object4);
        }
        object4 = (m60_0)object4;
        object2.E();
        return object4;
    }
}

