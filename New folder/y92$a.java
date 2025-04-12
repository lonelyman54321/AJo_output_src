/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class y92$a
extends CI3$a {
    public y92$a() {
        Class<DiagnosticsWorker> clazz = DiagnosticsWorker.class;
        Intrinsics.checkNotNullParameter(clazz, "workerClass");
        super(clazz);
    }

    public final CI3 b() {
        Intrinsics.checkNotNullParameter(this, "builder");
        UUID uUID = this.a;
        EI3 eI3 = this.b;
        Set set = this.c;
        y92 y922 = new CI3(uUID, eI3, set);
        return y922;
    }

    public final CI3$a c() {
        return this;
    }
}

