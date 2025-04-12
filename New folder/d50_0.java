/*
 * Decompiled with CFR 0.152.
 */
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.connection.a;

/*
 * Renamed from d50
 */
public final class d50_0 {
    public final a a;

    public d50_0() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter((Object)timeUnit, "timeUnit");
        c c2 = c.h;
        a a2 = new a(c2, timeUnit);
        Intrinsics.checkNotNullParameter(a2, "delegate");
        this.a = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        Object object = this.a;
        Object object2 = ((a)object).e.iterator();
        Object object3 = "connections.iterator()";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        while (true) {
            Object object4;
            block6: {
                boolean bl2;
                block5: {
                    boolean bl3;
                    if (!(bl3 = object2.hasNext())) {
                        object2 = ((a)object).e;
                        boolean bl4 = ((ConcurrentLinkedQueue)object2).isEmpty();
                        if (!bl4) return;
                        object = ((a)object).c;
                        ((b)object).a();
                        return;
                    }
                    object3 = (je2_2)object2.next();
                    object4 = "connection";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    // MONITORENTER : object3
                    object4 = ((je2_2)object3).p;
                    bl2 = ((ArrayList)object4).isEmpty();
                    if (!bl2) break block5;
                    object2.remove();
                    ((je2_2)object3).j = bl2 = true;
                    object4 = ((je2_2)object3).d;
                    Intrinsics.checkNotNull(object4);
                    break block6;
                }
                bl2 = false;
                object4 = null;
            }
            // MONITOREXIT : object3
            if (object4 == null) continue;
            ez3.d((Socket)object4);
        }
    }
}

