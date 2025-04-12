/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Zj1
 */
public class zj1_2 {
    public static f80_0 a(Function2 object, Object object2, f80_0 f80_02) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object3 = "completion";
        Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        Intrinsics.checkNotNullParameter(f80_02, (String)object3);
        boolean bl2 = object instanceof xv_1;
        if (bl2) {
            object = ((xv_1)object).create(object2, f80_02);
        } else {
            Serializable serializable;
            object3 = f80_02.getContext();
            if (object3 == (serializable = f.a)) {
                object = object3 = new Zj1$a((Function2)object, object2, f80_02);
            } else {
                serializable = new Zj1$b(f80_02, (CoroutineContext)object3, (Function2)object, object2);
                object = serializable;
            }
        }
        return object;
    }

    public static f80_0 b(f80_0 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof h80_0;
        if (bl2) {
            object2 = object;
            object2 = (h80_0)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && (object2 = ((h80_0)object2).intercepted()) != null) {
            object = object2;
        }
        return object;
    }

    public static Object c(Function2 function2, Object object, f80_0 f80_02) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Object object2 = "completion";
        Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        object2 = f80_02.getContext();
        Serializable serializable = f.a;
        if (object2 == serializable) {
            object2 = new ak1_2(f80_02);
        } else {
            serializable = new bk1_2(f80_02, (CoroutineContext)object2);
            object2 = serializable;
        }
        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(object, object2);
    }
}

