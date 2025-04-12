/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Tx2
 */
public final class tx2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ d82_0 c;
    public final /* synthetic */ mu1_1 d;
    public final /* synthetic */ px2_0 e;

    public tx2_1(d82_0 d82_02, mu1_1 mu1_12, px2_0 px2_02) {
        this.c = d82_02;
        this.d = mu1_12;
        this.e = px2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        mu1_1 mu1_12 = this.d;
        px2_0 px2_02 = this.e;
        ((d82_0)object).a(mu1_12, px2_02);
        object = new sx2_0(px2_02);
        return object;
    }
}

