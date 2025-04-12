/*
 * Decompiled with CFR 0.152.
 */
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$b;
import java.io.Serializable;

/*
 * Renamed from dp1
 */
public final class dp1_2
implements Serializable {
    private static final long serialVersionUID = 2L;
    public final int a;
    public final int b;

    public dp1_2(int n3, int n4) {
        this.a = n3;
        this.b = n4;
        PrivateMaxEntriesMap$b privateMaxEntriesMap$b = new PrivateMaxEntriesMap$b();
        boolean bl2 = false;
        boolean bl3 = n3 >= 0;
        if (bl3) {
            privateMaxEntriesMap$b.b = n3;
            long l2 = n4;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            object = object >= 0 ? (Object)1 : (Object)0;
            if (object != false) {
                privateMaxEntriesMap$b.c = l2;
                privateMaxEntriesMap$b.a = 4;
                object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (object >= 0) {
                    bl2 = true;
                }
                if (bl2) {
                    new PrivateMaxEntriesMap(privateMaxEntriesMap$b);
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            throw illegalArgumentException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public Object readResolve() {
        int n3 = this.a;
        int n4 = this.b;
        dp1_2 dp1_22 = new dp1_2(n3, n4);
        return dp1_22;
    }
}

