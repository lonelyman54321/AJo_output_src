/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class mR1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ mr1_1 c;
    public final /* synthetic */ Qv1 d;
    public final /* synthetic */ Qv1 e;

    public mR1$a(mr1_1 mr1_12, Qv1 qv1, Qv1 qv12) {
        this.c = mr1_12;
        this.d = qv1;
        this.e = qv12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (wZ)object;
        Qv1 qv1 = this.e;
        mr1_1 mr1_12 = this.c;
        Qv1 qv12 = this.d;
        return mr1_1.a(mr1_12, (wZ)object, qv12, qv1);
    }
}

