/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ts1
 */
public final class ts1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ rs1_0 c;

    public ts1_1(rs1_0 rs1_02) {
        this.c = rs1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        rs1_0 rs1_02 = this.c;
        object = new ss1(rs1_02);
        return object;
    }
}

