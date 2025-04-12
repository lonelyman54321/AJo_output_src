/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.IntConsumer;

public final class hm
implements Runnable {
    public final /* synthetic */ IntConsumer a;
    public final /* synthetic */ int b;

    public /* synthetic */ hm(IntConsumer intConsumer, int n3) {
        this.a = intConsumer;
        this.b = n3;
    }

    public final void run() {
        IntConsumer intConsumer = this.a;
        int n3 = this.b;
        gm.a(intConsumer, n3);
    }
}

