/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ul0
 */
public final class ul0_2
implements Runnable {
    public final /* synthetic */ vl0$a$a a;
    public final /* synthetic */ vj_2 b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ ul0_2(vl0$a$a vl0$a$a, vj_2 vj_22, Throwable throwable) {
        this.a = vl0$a$a;
        this.b = vj_22;
        this.c = throwable;
    }

    public final void run() {
        vl0$a vl0$a = this.a.b;
        vj_2 vj_22 = this.b;
        Throwable throwable = this.c;
        vj_22.b(vl0$a, throwable);
    }
}

