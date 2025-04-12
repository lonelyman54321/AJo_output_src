/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import java.util.concurrent.Callable;

/*
 * Renamed from u81
 */
public final class u81_0
implements Callable {
    public final /* synthetic */ HomeRepo a;

    public /* synthetic */ u81_0(HomeRepo homeRepo) {
        this.a = homeRepo;
    }

    public final Object call() {
        return HomeRepo.J(this.a);
    }
}

