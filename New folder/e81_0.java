/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.ApiFetchAndCallConditions;
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from e81
 */
public final class e81_0
implements Function1 {
    public final /* synthetic */ HomeRepo a;
    public final /* synthetic */ zr1_1 b;

    public /* synthetic */ e81_0(HomeRepo homeRepo, zr1_1 zr1_12) {
        this.a = homeRepo;
        this.b = zr1_12;
    }

    public final Object invoke(Object object) {
        zr1_1 zr1_12 = this.b;
        object = (ApiFetchAndCallConditions)((Object)object);
        return HomeRepo.D(this.a, zr1_12, (ApiFetchAndCallConditions)((Object)object));
    }
}

