/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class vl0$a
implements jj_2 {
    public final Executor a;
    public final jj_2 b;

    public vl0$a(Executor executor, jj_2 jj_22) {
        this.a = executor;
        this.b = jj_22;
    }

    public final boolean a() {
        return this.b.a();
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final jj_2 clone() {
        jj_2 jj_22 = this.b.clone();
        Executor executor = this.a;
        vl0$a vl0$a = new vl0$a(executor, jj_22);
        return vl0$a;
    }

    public final dl2_2 execute() {
        return this.b.execute();
    }

    public final void h(vj_2 vj_22) {
        vl0$a$a vl0$a$a = new vl0$a$a(this, vj_22);
        this.b.h(vl0$a$a);
    }

    public final kj2_2 request() {
        return this.b.request();
    }
}

