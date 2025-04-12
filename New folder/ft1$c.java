/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class ft1$c
implements Zs1 {
    public final /* synthetic */ ft1_2 a;

    public ft1$c(ft1_2 ft1_22) {
        this.a = ft1_22;
    }

    public final xs1$b a(int n3) {
        ft1_2 ft1_22 = this.a;
        v83_0 v83_02 = v83$a.a();
        Function1 function1 = v83_02 != null ? v83_02.f() : null;
        v83_0 v83_03 = v83$a.b(v83_02);
        try {
            Object object = ft1_22.f;
            object = ((h83_0)object).getValue();
            object = (Ws1)object;
            long l2 = ((Ws1)object).i;
            return ft1_22.p.a(n3, l2);
        }
        finally {
            v83$a.e(v83_02, v83_03, function1);
        }
    }
}

