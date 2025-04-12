/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;

/*
 * Renamed from UJ
 */
public final class uj_2
implements Runnable {
    public final /* synthetic */ Supplier a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ uj_2(Supplier supplier, Runnable runnable2) {
        this.a = supplier;
        this.b = runnable2;
    }

    public final void run() {
        Supplier supplier = this.a;
        Runnable runnable2 = this.b;
        Callables.a(supplier, runnable2);
    }
}

