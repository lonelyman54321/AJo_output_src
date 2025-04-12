/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from Pn0
 */
public final class pn0_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ kb1_2 c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        pn0_2 pn0_22 = new qg3_2(3, (f80_0)object3);
        pn0_22.b = object;
        pn0_22.c = object2;
        object = Unit.a;
        return pn0_22.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = this.c;
        at3_0 at3_02 = ((kb1_2)object2).a;
        object2 = ((kb1_2)object2).b;
        boolean bl2 = object2 instanceof uf_1;
        if (!bl2) {
            return Unit.a;
        }
        Object object3 = at3_02.a;
        Object object4 = Reflection.getOrCreateKotlinClass(InputStream.class);
        bl2 = Intrinsics.areEqual(object3, object4);
        if (!bl2) return Unit.a;
        object2 = (uf_1)object2;
        object3 = ((ea1_2)((is2_2)object).a).getCoroutineContext();
        object4 = i$a.a;
        object3 = (i)object3.get((CoroutineContext$a)object4);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = new ny_2((uf_1)object2);
        object2 = new Pn0$a((ny_2)object3);
        object3 = new kb1_2(at3_02, object2);
        n3 = 0;
        object2 = null;
        this.b = null;
        this.a = n4;
        object = ((is2_2)object).d(this, object3);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

