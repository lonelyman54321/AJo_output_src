/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hh
 */
public final class hh_0
extends Lambda
implements gx0_2 {
    public static final hh_0 c;

    static {
        hh_0 hh_02;
        c = hh_02 = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        b30$a$a b30$a$a;
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = -2126899193;
        object2.K(n3);
        object3 = tm3.a;
        long l2 = ((sm3)object2.j((H30)object3)).a;
        object3 = LP1$a.b;
        boolean bl2 = object2.d(l2);
        Object object4 = object2.v();
        if (bl2 || object4 == (b30$a$a = b30$a.a)) {
            object4 = new gh_0(l2);
            object2.o(object4);
        }
        object4 = (Function1)object4;
        object3 = a.b((LP1)object3, (Function1)object4);
        object = object.then((LP1)object3);
        object2.E();
        return object;
    }
}

