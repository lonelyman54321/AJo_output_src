/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class DP1 {
    public final OQ1 a;
    public final DP1$a b;

    public DP1(LI0$c object) {
        OQ1 oQ1 = new OQ1((LI0$c)object);
        this.b = object = new DP1$a();
        this.a = oQ1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList a(Class serializable) {
        synchronized (this) {
            OQ1 oQ1 = this.a;
            return oQ1.e((Class)serializable);
        }
    }
}

