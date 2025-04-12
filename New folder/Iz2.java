/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public final class Iz2
implements Runnable {
    public final /* synthetic */ kz2_0 a;
    public final /* synthetic */ ListenableFuture b;
    public final /* synthetic */ WI3 c;

    public /* synthetic */ Iz2(kz2_0 kz2_02, eK$d eK$d, WI3 wI3) {
        this.a = kz2_02;
        this.b = eK$d;
        this.c = wI3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2;
        Iterator iterator = this.a;
        Object object = this.b;
        Object object2 = this.c;
        iterator.getClass();
        try {
            object = object.get();
            object = (Boolean)object;
            bl2 = (Boolean)object;
        }
        catch (InterruptedException | ExecutionException exception) {
            bl2 = true;
        }
        Object object3 = ((kz2_0)((Object)iterator)).k;
        synchronized (object3) {
            Throwable throwable2;
            block9: {
                Object object4;
                block8: {
                    String string2;
                    try {
                        object4 = ((WI3)object2).a;
                        object4 = JI3.a((EI3)object4);
                        string2 = ((gI3)object4).a;
                        WI3 wI3 = ((kz2_0)((Object)iterator)).d(string2);
                        if (wI3 != object2) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    ((kz2_0)((Object)iterator)).b(string2);
                }
                object2 = qx1.a();
                object2.getClass();
                iterator = ((kz2_0)((Object)iterator)).j;
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (true) {
                    boolean bl3;
                    if (!(bl3 = iterator.hasNext())) {
                        return;
                    }
                    object2 = iterator.next();
                    object2 = (fe0_0)object2;
                    object2.a((gI3)object4, bl2);
                }
            }
            throw throwable2;
        }
    }
}

