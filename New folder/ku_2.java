/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from kU
 */
public final class ku_2
extends cl1_2
implements ju_2 {
    public final mu_2 e;

    public ku_2(JobSupport jobSupport) {
        this.e = jobSupport;
    }

    public final boolean a(Throwable throwable) {
        return this.h().T(throwable);
    }

    public final boolean i() {
        return true;
    }

    public final void j(Throwable object) {
        object = this.e;
        JobSupport jobSupport = this.h();
        object.U(jobSupport);
    }
}

