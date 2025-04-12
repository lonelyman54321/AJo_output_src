/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nu1
 */
public final class nu1_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final l a(mu1_1 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getLifecycle();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        while ((object2 = (l)((i)object).a.get()) == null) {
            Object v4;
            Object object3 = be_1.a();
            wm0_2 wm0_22 = ir0_2.a;
            d21_0 d21_02 = bg1_1.a.N0();
            object3 = CoroutineContext$Element$a.d(d21_02, (CoroutineContext$Element)object3);
            object2 = new l((i)object, (CoroutineContext)object3);
            object3 = ((i)object).a;
            do {
                Object var3_7 = null;
                int n3 = ((AtomicReference)object3).compareAndSet(null, object2);
                if (n3 == 0) continue;
                object = ir0_2.a;
                object = bg1_1.a.N0();
                object3 = new k((l)object2, null);
                n3 = 2;
                Ae3.d((i90_0)object2, (CoroutineContext)object, null, (Function2)object3, n3);
                return object2;
            } while ((v4 = ((AtomicReference)object3).get()) == null);
        }
        return object2;
    }
}

