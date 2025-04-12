/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from k81
 */
public final class k81_0
implements Function1 {
    public final /* synthetic */ HomeRepo a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ k81_0(HomeRepo homeRepo, String string2, String string3) {
        this.a = homeRepo;
        this.b = string2;
        this.c = string3;
    }

    public final Object invoke(Object object) {
        String string2 = this.c;
        object = (dl2_2)object;
        HomeRepo homeRepo = this.a;
        String string3 = this.b;
        return HomeRepo.A(homeRepo, string3, string2, (dl2_2)object);
    }
}

