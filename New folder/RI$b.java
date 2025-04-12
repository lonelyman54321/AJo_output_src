/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class RI$b
implements gj_1 {
    public final rq0$a_0 a;
    public final y63_0 b;
    public final RI$b$a c;
    public boolean d;
    public final /* synthetic */ ri_2 e;

    public RI$b(ri_2 ri_22, rq0$a_0 object) {
        RI$b$a rI$b$a;
        Intrinsics.checkNotNullParameter(object, "editor");
        this.e = ri_22;
        this.a = object;
        this.b = object = ((rq0$a_0)object).d(1);
        this.c = rI$b$a = new RI$b$a(ri_22, this, (y63_0)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.e;
        synchronized (object) {
            boolean bl2 = this.d;
            if (bl2) {
                return;
            }
            this.d = bl2 = true;
        }
        object = this.b;
        ez3.c((Closeable)object);
        try {
            object = this.a;
            ((rq0$a_0)object).a();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

