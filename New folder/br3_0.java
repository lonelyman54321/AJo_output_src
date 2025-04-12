/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Br3
 */
public final class br3_0
implements Cr0 {
    public final /* synthetic */ gr3 a;
    public final /* synthetic */ gr3$a b;

    public br3_0(gr3 gr32, gr3$a gr3$a) {
        this.a = gr32;
        this.b = gr3$a;
    }

    public final void dispose() {
        Object object = this.a;
        object.getClass();
        ib3_0 ib3_02 = (gr3$a$a)this.b.b.getValue();
        if (ib3_02 != null && (ib3_02 = ib3_02.a) != null) {
            object = ((gr3)object).i;
            ((p83_0)object).remove(ib3_02);
        }
    }
}

