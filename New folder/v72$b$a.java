/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class v72$b$a
extends pv0_2 {
    public final /* synthetic */ v72$b b;

    public v72$b$a(v72$b v72$b, se_1 se_12) {
        this.b = v72$b;
        super(se_12);
    }

    public final long a0(ce_2 ce_22, long l2) {
        try {
            return super.a0(ce_22, l2);
        }
        catch (IOException iOException) {
            this.b.d = iOException;
            throw iOException;
        }
    }
}

