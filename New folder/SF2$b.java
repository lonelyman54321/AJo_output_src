/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class SF2$b
implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ SF2 b;

    public SF2$b(SF2 sF2, long l2) {
        this.b = sF2;
        this.a = l2;
    }

    public final Object call() {
        Object object = this.b;
        RF2 rF2 = ((SF2)object).c;
        bg3_0 bg3_02 = rF2.acquire();
        int n3 = 1;
        long l2 = this.a;
        bg3_02.m0(n3, l2);
        object = ((SF2)object).a;
        ((FP2)object).beginTransaction();
        try {
            bg3_02.q();
            ((FP2)object).setTransactionSuccessful();
            Unit unit = Unit.a;
            return unit;
        }
        finally {
            ((FP2)object).endTransaction();
            rF2.release(bg3_02);
        }
    }
}

