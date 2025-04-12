/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZI0
 */
public final class zi0_2
extends ov0_2 {
    public final Function1 b;
    public boolean c;

    public zi0_2(y63_0 y63_02, Function1 function1) {
        Intrinsics.checkNotNullParameter(y63_02, "delegate");
        Intrinsics.checkNotNullParameter(function1, "onException");
        super(y63_02);
        this.b = function1;
    }

    public final void close() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        try {
            super.close();
        }
        catch (IOException iOException) {
            boolean bl3;
            this.c = bl3 = true;
            Function1 function1 = this.b;
            function1.invoke(iOException);
        }
    }

    public final void flush() {
        boolean bl2 = this.c;
        if (bl2) {
            return;
        }
        try {
            super.flush();
        }
        catch (IOException iOException) {
            boolean bl3;
            this.c = bl3 = true;
            Function1 function1 = this.b;
            function1.invoke(iOException);
        }
    }

    public final void s0(ce_2 ce_22, long l2) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(ce_22, string2);
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

