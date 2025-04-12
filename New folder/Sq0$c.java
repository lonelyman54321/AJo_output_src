/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import kotlin.Unit;

public final class Sq0$c
implements Closeable {
    public final Sq0$b a;
    public boolean b;
    public final /* synthetic */ Sq0 c;

    public Sq0$c(Sq0 sq0, Sq0$b sq0$b) {
        this.c = sq0;
        this.a = sq0$b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        boolean bl2 = this.b;
        if (bl2) return;
        this.b = bl2 = true;
        Sq0 sq0 = this.c;
        synchronized (sq0) {
            int n3;
            Object object = this.a;
            ((Sq0$b)object).h = n3 = ((Sq0$b)object).h + -1;
            if (n3 == 0 && (n3 = (int)(((Sq0$b)object).f ? 1 : 0)) != 0) {
                sq0.z((Sq0$b)object);
            }
            object = Unit.a;
            return;
        }
    }
}

