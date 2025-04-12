/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class nB3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ nb3_1 c;

    public nB3$b(nb3_1 nb3_12) {
        this.c = nb3_12;
        super(0);
    }

    public final Object invoke() {
        Comparable comparable = this.c;
        BigInteger bigInteger = BigInteger.valueOf(comparable.a);
        int n3 = 32;
        bigInteger = bigInteger.shiftLeft(n3);
        BigInteger bigInteger2 = BigInteger.valueOf(comparable.b);
        bigInteger = bigInteger.or(bigInteger2).shiftLeft(n3);
        comparable = BigInteger.valueOf(comparable.c);
        return bigInteger.or((BigInteger)comparable);
    }
}

