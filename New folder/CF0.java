/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

public final class CF0
implements Supplier {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ CF0(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final Object get() {
        return this.a.get();
    }
}

