/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nR1
 */
public final class nr1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Rv1 d;
    public final /* synthetic */ mr1_1 e;

    public nr1_2(Rv1 rv1, mr1_1 mr1_12) {
        this.c = false;
        this.d = rv1;
        this.e = mr1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        Qv1 qv1;
        if ((object = (wZ)object) == null || (qv1 = ((wZ)object).d) == null) {
            qv1 = Qv1.f;
        }
        Qv1 qv12 = object != null ? ((wZ)object).e : null;
        boolean bl2 = this.c;
        Rv1 rv1 = this.d;
        if (bl2) {
            qv12 = Qv1.f.b(rv1);
        } else {
            qv1 = qv1.b(rv1);
        }
        return mr1_1.a(this.e, (wZ)object, qv1, qv12);
    }
}

