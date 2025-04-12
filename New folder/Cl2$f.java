/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Cl2$f
extends Lambda
implements Function0 {
    public final /* synthetic */ Cl2 c;

    public Cl2$f(Cl2 cl2) {
        this.c = cl2;
        super(0);
    }

    public final Object invoke() {
        int n3;
        Object object = this.c;
        xm0_0 xm0_02 = ((Cl2)object).j;
        boolean bl2 = xm0_02.b();
        if (bl2) {
            object = ((Cl2)object).s;
            n3 = ((e83_0)object).o();
        } else {
            n3 = ((Cl2)object).j();
        }
        return n3;
    }
}

