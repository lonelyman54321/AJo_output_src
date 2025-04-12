/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

/*
 * Renamed from cE$b
 */
public final class ce$b_0
implements Closeable {
    public ce_2 a;

    public final void close() {
        Object object = this.a;
        if (object != null) {
            this.a = null;
            return;
        }
        String string2 = "not attached to a buffer".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

