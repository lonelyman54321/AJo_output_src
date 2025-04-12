/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

/*
 * Renamed from bg3
 */
public final class bg3_1
extends ee0_0 {
    public final e92 b;

    public bg3_1(Executor executor, e92 e922) {
        super(executor);
        this.b = e922;
    }

    public final void a(Object object) {
        ag3_2 ag3_22 = new ag3_2(0, this, object);
        this.a.execute(ag3_22);
    }
}

