/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from MR
 */
public final class mr_1 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object a(CoroutineContext object, Object object2, Object object3, Function2 object4, f80_0 f80_02) {
        Throwable throwable2;
        block6: {
            hb3_2 hb3_22;
            object3 = bn3_0.c(object, object3);
            try {
                hb3_22 = new hb3_2(f80_02, (CoroutineContext)object);
            }
            catch (Throwable throwable2) {
                break block6;
            }
            int n3 = object4 instanceof xv_1;
            if (n3 == 0) {
                object2 = zj1_2.c((Function2)object4, object2, hb3_22);
            } else {
                n3 = 2;
                object4 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, n3);
                object4 = (Function2)object4;
                object2 = object4.invoke(object2, hb3_22);
            }
            bn3_0.a(object, object3);
            object = j90_0.COROUTINE_SUSPENDED;
            if (object2 == object) {
                object = "frame";
                Intrinsics.checkNotNullParameter(f80_02, (String)object);
            }
            return object2;
        }
        bn3_0.a(object, object3);
        throw throwable2;
    }
}

