/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f90
extends Lambda
implements Function0 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ Se1 d;

    public f90(Vt1 vt1, Se1 se1) {
        this.c = vt1;
        this.d = se1;
        super(0);
    }

    public final Object invoke() {
        Vt1$a vt1$a = this.c.u;
        int n3 = this.d.e;
        Qe1 qe1 = new Qe1(n3);
        vt1$a.invoke(qe1);
        return Boolean.TRUE;
    }
}

