/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Callables;
import java.util.concurrent.Callable;

/*
 * Renamed from RJ
 */
public final class rj_2
implements Callable {
    public final /* synthetic */ Supplier a;
    public final /* synthetic */ Callable b;

    public /* synthetic */ rj_2(Supplier supplier, Callable callable) {
        this.a = supplier;
        this.b = callable;
    }

    public final Object call() {
        Supplier supplier = this.a;
        Callable callable = this.b;
        return Callables.c(supplier, callable);
    }
}

