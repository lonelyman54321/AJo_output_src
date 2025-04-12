/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.RxWorker;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class hR2
implements t53_0 {
    public final /* synthetic */ eK$a a;

    public hR2(eK$a eK$a) {
        this.a = eK$a;
    }

    public final void a(yr0_2 object) {
        Objects.requireNonNull(object);
        gr2_0 gr2_02 = new gr2_0((yr0_2)object);
        object = RxWorker.b;
        tk2_0 tk2_02 = this.a.c;
        if (tk2_02 != null) {
            tk2_02.addListener(gr2_02, (Executor)object);
        }
    }

    public final void onError(Throwable throwable) {
        this.a.b(throwable);
    }

    public final void onSuccess(Object object) {
        this.a.a(object);
    }
}

