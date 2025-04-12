/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Jk3
 */
public final class jk3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ wr1_1 d;

    public jk3_0(tr1_0 tr1_02, wr1_1 wr1_12) {
        this.c = tr1_02;
        this.d = wr1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        tr1_0 tr1_02 = this.c;
        wr1_1 wr1_12 = this.d;
        object = new ik3_0(tr1_02, wr1_12);
        return object;
    }
}

