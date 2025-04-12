/*
 * Decompiled with CFR 0.152.
 */
import androidx.room.f;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class Q90 {
    public static final Object a(ChuckerDatabase object, Callable callable, f80_0 f80_02) {
        boolean bl2 = ((FP2)object).isOpenInternal();
        if (bl2 && (bl2 = ((FP2)object).inTransaction())) {
            object = callable.call();
        } else {
            Object object2;
            Object object3 = f80_02.getContext();
            Object object4 = f.a;
            if ((object3 = (f)object3.get((CoroutineContext$a)object4)) != null) {
                object3.getClass();
            }
            if ((object2 = (object3 = ((FP2)object).getBackingFieldMap()).get(object4 = "TransactionDispatcher")) == null) {
                object = ((FP2)object).getTransactionExecutor();
                object2 = h83.a((Executor)object);
                object3.put(object4, object2);
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            object2 = (c)object2;
            bl2 = false;
            object3 = null;
            object = new n90_0(callable, null);
            object = Ae3.g(f80_02, object2, (Function2)object);
        }
        return object;
    }
}

