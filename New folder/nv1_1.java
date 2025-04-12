/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from nv1
 */
public final class nv1_1
implements Runnable {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ nv1_1(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void run() {
        this.a.set(true);
    }
}

