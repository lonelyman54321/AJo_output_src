/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vI0
 */
public final class vi0_1
implements kJ0$a {
    public final void b(boolean bl2) {
        Object throwable = FacebookSdk.a;
        if (bl2) {
            int n3 = to.a;
            Class<to> clazz = to.class;
            boolean bl3 = td0.b(clazz);
            if (!bl3) {
                throwable = new Object();
                Object object = dl0_2.a;
                object = "callback";
                Intrinsics.checkNotNullParameter(throwable, (String)object);
                object = dl0_2.e;
                try {
                    ((ConcurrentLinkedQueue)object).add(throwable);
                    dl0_2.d();
                }
                catch (Throwable throwable2) {
                    td0.a(clazz, throwable2);
                }
            }
        }
    }
}

