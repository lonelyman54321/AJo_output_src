/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

public final class XK
implements Runnable {
    public final /* synthetic */ WorkDatabase a;
    public final /* synthetic */ ni3_1 b;

    public /* synthetic */ XK(WorkDatabase workDatabase, ni3_1 ni3_12) {
        this.a = workDatabase;
        this.b = ni3_12;
    }

    public final void run() {
        boolean bl2;
        Iterator iterator = this.a.f().o().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            ni3_1 ni3_12 = this.b;
            YK.a(ni3_12, string2);
        }
    }
}

