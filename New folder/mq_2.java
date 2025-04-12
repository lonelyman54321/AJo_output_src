/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from mQ
 */
public final class mq_2
implements Function1 {
    public final /* synthetic */ CategoryNavigationRepo a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zr1_1 c;

    public /* synthetic */ mq_2(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, zr1_1 zr1_12) {
        this.a = categoryNavigationRepo;
        this.b = bl2;
        this.c = zr1_12;
    }

    public final Object invoke(Object object) {
        zr1_1 zr1_12 = this.c;
        object = (dl2_2)object;
        CategoryNavigationRepo categoryNavigationRepo = this.a;
        boolean bl2 = this.b;
        return CategoryNavigationRepo.i(categoryNavigationRepo, bl2, zr1_12, (dl2_2)object);
    }
}

