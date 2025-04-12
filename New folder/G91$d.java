/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;

public final class G91$d
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ long f;

    public G91$d(String string2, g91_0 g91_02, long l2) {
        this.e = g91_02;
        this.f = l2;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a() {
        boolean bl2;
        Closeable closeable = this.e;
        // MONITORENTER : closeable
        g91_0 g91_02 = this.e;
        long l2 = g91_02.n;
        long l3 = g91_02.m;
        int n3 = 1;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            bl2 = true;
        } else {
            l2 = 1L;
            g91_02.m = l3 += l2;
            bl2 = false;
        }
        // MONITOREXIT : closeable
        if (bl2) {
            closeable = null;
            g91_02.b(null);
            return -1;
        }
        try {
            closeable = g91_02.y;
            ((t91_0)closeable).k(n3, 0, false);
            return this.f;
        }
        catch (IOException iOException) {
            g91_02.b(iOException);
        }
        return this.f;
    }
}

