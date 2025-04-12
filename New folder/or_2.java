/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OR
 */
public abstract class or_2
extends ir_2 {
    public final es0_2 d;

    public or_2(int n3, he_2 he_22, es0_2 es0_22, CoroutineContext coroutineContext) {
        super(coroutineContext, n3, he_22);
        this.d = es0_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object collect(fs0_2 object, f80_0 object2) {
        j90_0 j90_02;
        int n3 = this.b;
        int n4 = -3;
        if (n3 == n4) {
            Object object3 = object2.getContext();
            Object object4 = Boolean.FALSE;
            CoroutineContext coroutineContext = this.a;
            Object object5 = new Object();
            n4 = (int)(((Boolean)(object4 = (Boolean)coroutineContext.fold(object4, (Function2)object5))).booleanValue() ? 1 : 0);
            if (n4 == 0) {
                object4 = object3.plus(coroutineContext);
            } else {
                n4 = 0;
                object4 = a90_0.a((CoroutineContext)object3, coroutineContext, false);
            }
            boolean bl2 = Intrinsics.areEqual(object4, object3);
            if (bl2) {
                j90_0 j90_03;
                if ((object = this.k((fs0_2)object, (f80_0)object2)) != (j90_03 = j90_0.COROUTINE_SUSPENDED)) return Unit.a;
                return object;
            }
            object5 = kotlin.coroutines.d.n0;
            coroutineContext = object4.get((CoroutineContext$a)object5);
            n3 = (int)(Intrinsics.areEqual(coroutineContext, object3 = object3.get((CoroutineContext$a)object5)) ? 1 : 0);
            if (n3 != 0) {
                j90_0 j90_04;
                object3 = object2.getContext();
                bl2 = object instanceof nz2_1;
                if (!bl2 && !(bl2 = object instanceof o42_0)) {
                    object = object5 = new lv3_0((fs0_2)object, (CoroutineContext)object3);
                }
                bl2 = false;
                object3 = new nr_2(this, null);
                object5 = bn3_0.b((CoroutineContext)object4);
                if ((object = mr_1.a((CoroutineContext)object4, object, object5, (Function2)object3, (f80_0)object2)) != (j90_04 = j90_0.COROUTINE_SUSPENDED)) return Unit.a;
                return object;
            }
        }
        if ((object = super.collect((fs0_2)object, (f80_0)object2)) != (j90_02 = j90_0.COROUTINE_SUSPENDED)) return Unit.a;
        return object;
    }

    public final Object g(pz2_2 object, f80_0 object2) {
        nz2_1 nz2_12 = new nz2_1((fz2_1)object);
        if ((object = this.k(nz2_12, (f80_0)object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }

    public abstract Object k(fs0_2 var1, f80_0 var2);

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(" -> ");
        object = super.toString();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

