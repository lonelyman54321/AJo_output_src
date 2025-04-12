/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class SF2$a
implements Callable {
    public final /* synthetic */ SF2 a;

    public SF2$a(SF2 sF2) {
        this.a = sF2;
    }

    public final Object call() {
        Object object = this.a;
        QF2 qF2 = ((SF2)object).b;
        bg3_0 bg3_02 = qF2.acquire();
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
            qF2.release(bg3_02);
        }
    }
}

