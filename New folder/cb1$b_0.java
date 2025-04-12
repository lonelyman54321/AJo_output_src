/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import kotlin.Unit;

/*
 * Renamed from Cb1$b
 */
public final class cb1$b_0
implements Callable {
    public final /* synthetic */ Cb1 a;

    public cb1$b_0(Cb1 cb1) {
        this.a = cb1;
    }

    public final Object call() {
        Object object = this.a;
        Fb1 fb1 = ((Cb1)object).d;
        bg3_0 bg3_02 = fb1.acquire();
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
            fb1.release(bg3_02);
        }
    }
}

