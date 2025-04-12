/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class SD
extends Lambda
implements Function0 {
    public final /* synthetic */ QD c;
    public final /* synthetic */ zp1 d;
    public final /* synthetic */ Function0 e;

    public SD(QD qD, w32_0 w32_02, Function0 function0) {
        this.c = qD;
        this.d = w32_02;
        this.e = function0;
        super(0);
    }

    public final Object invoke() {
        Object object = this.e;
        QD qD = this.c;
        Object object2 = (w32_0)this.d;
        if ((object = QD.r1(qD, (w32_0)object2, (Function0)object)) != null) {
            object2 = qD.n;
            object = object2.y((aG2)object);
        } else {
            object = null;
        }
        return object;
    }
}

