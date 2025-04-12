/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ik3
 */
public final class ik3_0
implements Cr0 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ wr1_1 b;

    public ik3_0(tr1_0 tr1_02, wr1_1 wr1_12) {
        this.a = tr1_02;
        this.b = wr1_12;
    }

    public final void dispose() {
        tr1_0 tr1_02 = this.a;
        Object object = (Ey2$b)tr1_02.getValue();
        if (object != null) {
            Ey2$a ey2$a = new Ey2$a((Ey2$b)object);
            object = this.b;
            if (object != null) {
                object.c(ey2$a);
            }
            object = null;
            tr1_02.setValue(null);
        }
    }
}

