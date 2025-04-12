/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.Callables;
import java.util.concurrent.Callable;

/*
 * Renamed from TJ
 */
public final class tj_2
implements Callable {
    public final /* synthetic */ Object a;

    public /* synthetic */ tj_2(Object object) {
        this.a = object;
    }

    public final Object call() {
        return Callables.d(this.a);
    }
}

