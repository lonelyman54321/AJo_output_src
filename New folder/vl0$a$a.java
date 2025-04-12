/*
 * Decompiled with CFR 0.152.
 */
public final class vl0$a$a
implements vj_2 {
    public final /* synthetic */ vj_2 a;
    public final /* synthetic */ vl0$a b;

    public vl0$a$a(vl0$a vl0$a, vj_2 vj_22) {
        this.b = vl0$a;
        this.a = vj_22;
    }

    public final void a(jj_2 object, dl2_2 dl2_22) {
        object = this.b.a;
        vj_2 vj_22 = this.a;
        tl0_2 tl0_22 = new tl0_2(this, 0, vj_22, dl2_22);
        object.execute(tl0_22);
    }

    public final void b(jj_2 object, Throwable throwable) {
        object = this.b.a;
        vj_2 vj_22 = this.a;
        ul0_2 ul0_22 = new ul0_2(this, vj_22, throwable);
        object.execute(ul0_22);
    }
}

