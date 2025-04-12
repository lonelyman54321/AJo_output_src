/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl.background.greedy;

class DelayedWorkTracker$1
implements Runnable {
    public final /* synthetic */ EI3 a;
    public final /* synthetic */ eo0_0 b;

    public DelayedWorkTracker$1(eo0_0 eo0_02, EI3 eI3) {
        this.b = eo0_02;
        this.a = eI3;
    }

    public final void run() {
        Object object = qx1.a();
        EI3 eI3 = this.a;
        EI3[] eI3Array = eI3.a;
        object.getClass();
        object = this.b.a;
        eI3Array = new EI3[]{eI3};
        object.c(eI3Array);
    }
}

