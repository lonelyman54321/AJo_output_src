/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.c;

/*
 * Renamed from RI
 */
public final class ri_2
implements Closeable,
Flushable {
    public final rq0_2 a;

    public ri_2(File file, long l2) {
        Object object = "directory";
        Intrinsics.checkNotNullParameter(file, (String)object);
        Object object2 = gm0_2.a;
        Intrinsics.checkNotNullParameter(file, (String)object);
        Intrinsics.checkNotNullParameter(object2, "fileSystem");
        object2 = c.h;
        this.a = object = new rq0_2(file, l2, (c)object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(kj2_2 object) {
        Intrinsics.checkNotNullParameter(object, "request");
        rq0_2 rq0_22 = this.a;
        object = RI$c.a(((kj2_2)object).a);
        synchronized (rq0_22) {
            Throwable throwable2;
            block5: {
                Object object2 = "key";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    rq0_22.h();
                    rq0_22.a();
                    rq0_2.C((String)object);
                    object2 = rq0_22.i;
                    object = ((LinkedHashMap)object2).get(object);
                    object = (rq0$b_0)object;
                    if (object != null) break block5;
                }
                catch (Throwable throwable2) {}
                return;
            }
            rq0_22.z((rq0$b_0)object);
            long l2 = rq0_22.g;
            long l3 = rq0_22.c;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 > 0) return;
            l4 = 0;
            object = null;
            rq0_22.o = false;
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final void close() {
        this.a.close();
    }

    public final void flush() {
        this.a.flush();
    }
}

