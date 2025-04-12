/*
 * Decompiled with CFR 0.152.
 */
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.connection.a;

/*
 * Renamed from ME2
 */
public final class me2_2
extends ri3_1 {
    public final /* synthetic */ a e;

    public me2_2(a a2, String string2) {
        this.e = a2;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        Object object;
        boolean bl2;
        long l2;
        int n3 = 1;
        a a2 = this.e;
        long l3 = System.nanoTime();
        Object object2 = a2.e.iterator();
        int n4 = 0;
        long l4 = l2 = Long.MIN_VALUE;
        je2_2 je2_22 = null;
        int n7 = 0;
        while (bl2 = object2.hasNext()) {
            je2_2 je2_23 = (je2_2)object2.next();
            Object object3 = "connection";
            Intrinsics.checkNotNullExpressionValue(je2_23, (String)object3);
            synchronized (je2_23) {
                int n8 = a2.b(je2_23, l3);
                if (n8 > 0) {
                    n7 += n3;
                } else {
                    n4 += n3;
                    long l7 = je2_23.q;
                    long l8 = (l7 = l3 - l7) - l4;
                    Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object4 > 0) {
                        je2_22 = je2_23;
                        l4 = l7;
                    }
                    object3 = Unit.a;
                }
            }
        }
        long l12 = a2.b;
        long l14 = l4 - l12;
        Object object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object5 < 0 && n4 <= (object5 = (Object)a2.a)) {
            if (n4 > 0) {
                return l12 -= l4;
            }
            if (n7 <= 0) return -1;
            return l12;
        }
        Intrinsics.checkNotNull(je2_22);
        synchronized (je2_22) {
            object2 = je2_22.p;
            object5 = ((ArrayList)object2).isEmpty() ^ n3;
            l12 = 0L;
            if (object5 != false) {
                return l12;
            }
            long l15 = je2_22.q + l4;
            long l16 = l15 - l3;
            n7 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
            if (n7 != 0) {
                return l12;
            }
            je2_22.j = n3;
            object = a2.e;
            ((ConcurrentLinkedQueue)object).remove(je2_22);
        }
        object = je2_22.d;
        Intrinsics.checkNotNull(object);
        ez3.d((Socket)object);
        object = a2.e;
        n3 = (int)(((ConcurrentLinkedQueue)object).isEmpty() ? 1 : 0);
        if (n3 == 0) return l12;
        object = a2.c;
        ((b)object).a();
        return l12;
    }
}

