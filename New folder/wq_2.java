/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;

/*
 * Renamed from wQ
 */
public final class wq_2
implements bx0_2 {
    public final /* synthetic */ CategoryNavigationRepo a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zr1_1 c;

    public /* synthetic */ wq_2(CategoryNavigationRepo categoryNavigationRepo, boolean bl2, zr1_1 zr1_12) {
        this.a = categoryNavigationRepo;
        this.b = bl2;
        this.c = zr1_12;
    }

    public final Object apply(Object object) {
        object = (Throwable)object;
        CategoryNavigationRepo categoryNavigationRepo = this.a;
        boolean bl2 = this.b;
        zr1_1 zr1_12 = this.c;
        return CategoryNavigationRepo.l(categoryNavigationRepo, bl2, zr1_12, (Throwable)object);
    }
}

