/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import java.util.concurrent.Callable;

public final class h81
implements Callable {
    public final /* synthetic */ HomeRepo a;

    public /* synthetic */ h81(HomeRepo homeRepo) {
        this.a = homeRepo;
    }

    public final Object call() {
        return HomeRepo.l(this.a);
    }
}

