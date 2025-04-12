/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Cs1$a
 */
public final class cs1$a_0
extends Lambda
implements Function0 {
    public final /* synthetic */ cs1_1 c;

    public cs1$a_0(cs1_1 cs1_12) {
        this.c = cs1_12;
        super(0);
    }

    public final Object invoke() {
        cs1_1 cs1_12 = this.c;
        int n3 = cs1_12.o.e();
        int n4 = cs1_12.o.a();
        return Float.valueOf(n3 - n4);
    }
}

