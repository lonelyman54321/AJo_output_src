/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class Jz2
implements Runnable {
    public final /* synthetic */ kz2_0 a;
    public final /* synthetic */ gI3 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ Jz2(kz2_0 kz2_02, gI3 gI32) {
        this.a = kz2_02;
        this.b = gI32;
        this.c = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Iterator iterator = this.a;
        gI3 gI32 = this.b;
        boolean bl2 = this.c;
        Object object = ((kz2_0)((Object)iterator)).k;
        synchronized (object) {
            try {
                iterator = ((kz2_0)((Object)iterator)).j;
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (true) {
                    boolean bl3;
                    if (!(bl3 = iterator.hasNext())) {
                        return;
                    }
                    Object object2 = iterator.next();
                    object2 = (fe0_0)object2;
                    object2.a(gI32, bl2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

