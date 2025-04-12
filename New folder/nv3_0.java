/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Nv3
 */
public final class nv3_0 {
    public static final /* synthetic */ int a;

    public static final Object a(ut2_2 ut2_22, ut2_2 object, Function2 object2) {
        block7: {
            block6: {
                gh3_2 gh3_22;
                int n3 = 2;
                object2 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(object2, n3);
                object2 = (Function2)object2;
                try {
                    object = object2.invoke(object, ut2_22);
                }
                catch (Throwable throwable) {
                    n3 = 0;
                    gh3_22 = null;
                    object = object2 = new m00_0(throwable, false);
                }
                object2 = j90_0.COROUTINE_SUSPENDED;
                if (object == object2 || (object = ut2_22.m0(object)) == (gh3_22 = y61.b)) break block6;
                ut2_22.D0();
                boolean bl2 = object instanceof m00_0;
                if (bl2) break block7;
                object2 = y61.b(object);
            }
            return object2;
        }
        throw ((m00_0)object).a;
    }
}

