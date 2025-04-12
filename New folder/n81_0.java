/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import java.util.concurrent.Callable;

/*
 * Renamed from n81
 */
public final class n81_0
implements Callable {
    public final /* synthetic */ HomeRepo a;

    public /* synthetic */ n81_0(HomeRepo homeRepo) {
        this.a = homeRepo;
    }

    public final Object call() {
        return HomeRepo.P(this.a);
    }
}

