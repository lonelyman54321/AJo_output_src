/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l90
extends Lambda
implements Function0 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ ou0_0 d;
    public final /* synthetic */ Se1 e;
    public final /* synthetic */ qt1_0 f;

    public l90(Vt1 vt1, ou0_0 ou0_02, Se1 se1, qt1_0 qt1_02) {
        this.c = vt1;
        this.d = ou0_02;
        this.e = se1;
        this.f = qt1_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        boolean bl2 = ((Vt1)object).b();
        if (!bl2) {
            object = this.d;
            ((ou0_0)object).b();
        }
        object = this.e;
        int n3 = ((Se1)object).d;
        int n4 = 7;
        if ((n3 = (int)(zo1_0.a(n3, n4) ? 1 : 0)) == 0 && !(bl2 = zo1_0.a(((Se1)object).d, n3 = 8))) {
            object = this.f;
            ((qt1_0)object).i();
        }
        return Boolean.TRUE;
    }
}

