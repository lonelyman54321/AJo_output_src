/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import java.util.concurrent.Callable;

public final class Y71
implements Callable {
    public final /* synthetic */ HomeRepo a;

    public /* synthetic */ Y71(HomeRepo homeRepo) {
        this.a = homeRepo;
    }

    public final Object call() {
        return HomeRepo.f(this.a);
    }
}

