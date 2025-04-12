/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IT1
 */
public final class it1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ib3_0 c;
    public final /* synthetic */ A20 d;

    public it1_0(ib3_0 ib3_02, A20 a20) {
        this.c = ib3_02;
        this.d = a20;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        ib3_0 ib3_02 = this.c;
        A20 a20 = this.d;
        object = new HT1(ib3_02, a20);
        return object;
    }
}

