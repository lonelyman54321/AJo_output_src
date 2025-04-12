/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ej
 */
public final class ej_2
extends Lambda
implements gx0_2 {
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;

    public ej_2(Function0 function0, boolean bl2) {
        this.c = function0;
        this.d = bl2;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        object2.K(-196777734);
        object3 = tm3.a;
        object3 = (sm3)object2.j((H30)object3);
        long l2 = ((sm3)object3).a;
        boolean bl2 = object2.d(l2);
        Function0 function0 = this.c;
        boolean bl3 = object2.J(function0);
        bl2 |= bl3;
        bl3 = this.d;
        boolean bl4 = object2.a(bl3);
        Object object4 = object2.v();
        if ((bl2 |= bl4) || object4 == (object3 = b30$a.a)) {
            object4 = new dj_2(l2, function0, bl3);
            object2.o(object4);
        }
        object4 = (Function1)object4;
        object = a.b((LP1)object, (Function1)object4);
        object2.E();
        return object;
    }
}

