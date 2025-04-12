/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from tt1
 */
public final class tt1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ iS2 c;

    public tt1_2(iS2 iS22) {
        this.c = iS22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Map)object;
        iS2 iS22 = this.c;
        rt1_0 rt1_02 = new rt1_0(iS22, (Map)object);
        return rt1_02;
    }
}

