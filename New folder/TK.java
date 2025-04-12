/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.WorkDatabase;

public final class TK
implements Runnable {
    public final /* synthetic */ WorkDatabase a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ni3_1 c;

    public /* synthetic */ TK(WorkDatabase workDatabase, String string2, ni3_1 ni3_12) {
        this.a = workDatabase;
        this.b = string2;
        this.c = ni3_12;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a.f();
        String string2 = this.b;
        object = object.g(string2).iterator();
        while (bl2 = object.hasNext()) {
            string2 = (String)object.next();
            ni3_1 ni3_12 = this.c;
            YK.a(ni3_12, string2);
        }
    }
}

