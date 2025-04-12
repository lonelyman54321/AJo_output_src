/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from aJ0
 */
public final class aj0_1
extends ov0_2 {
    public final Function1 b;
    public boolean c;

    public aj0_1(y63_0 y63_02, qq0_0 qq0_02) {
        super(y63_02);
        this.b = qq0_02;
    }

    public final void close() {
        try {
            super.close();
        }
        catch (IOException iOException) {
            boolean bl2;
            this.c = bl2 = true;
            Function1 function1 = this.b;
            function1.invoke(iOException);
        }
    }

    public final void flush() {
        try {
            super.flush();
        }
        catch (IOException iOException) {
            boolean bl2;
            this.c = bl2 = true;
            Function1 function1 = this.b;
            function1.invoke(iOException);
        }
    }

    public final void s0(ce_2 ce_22, long l2) {
        boolean bl2 = this.c;
        if (bl2) {
            ce_22.skip(l2);
            return;
        }
        try {
            super.s0(ce_22, l2);
        }
        catch (IOException iOException) {
            boolean bl3;
            this.c = bl3 = true;
            Function1 function1 = this.b;
            function1.invoke(iOException);
        }
    }
}

