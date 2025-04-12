/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;

public final class Cb1$c
implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Cb1 b;

    public Cb1$c(Cb1 cb1, long l2) {
        this.b = cb1;
        this.a = l2;
    }

    public final Object call() {
        Object object = this.b;
        Gb1 gb1 = ((Cb1)object).e;
        bg3_0 bg3_02 = gb1.acquire();
        int n3 = 1;
        long l2 = this.a;
        bg3_02.m0(n3, l2);
        object = ((Cb1)object).a;
        ((FP2)object).beginTransaction();
        try {
            bg3_02.q();
            ((FP2)object).setTransactionSuccessful();
            Unit unit = Unit.a;
            return unit;
        }
        finally {
            ((FP2)object).endTransaction();
            gb1.release(bg3_02);
        }
    }
}

