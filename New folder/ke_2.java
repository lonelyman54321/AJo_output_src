/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from kE
 */
public final class ke_2
implements gx0_2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ le_2 b;
    public final /* synthetic */ gx2_2 c;

    public /* synthetic */ ke_2(Object object, le_2 le_22, gx2_2 gx2_22) {
        this.a = object;
        this.b = le_22;
        this.c = gx2_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object3 = (CoroutineContext)object3;
        object2 = this.a;
        object = pe_2.l;
        if (object2 != object) {
            object = this.b.b;
            object3 = this.c.getContext();
            hz0_2.a((Function1)object, object2, (CoroutineContext)object3);
        }
        return Unit.a;
    }
}

