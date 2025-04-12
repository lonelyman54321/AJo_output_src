/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from uQ
 */
public final class uq_1
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CategoryNavigationRepo c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zr1_1 e;

    public /* synthetic */ uq_1(boolean bl2, String string2, CategoryNavigationRepo categoryNavigationRepo, boolean bl3, zr1_1 zr1_12) {
        this.a = bl2;
        this.b = string2;
        this.c = categoryNavigationRepo;
        this.d = bl3;
        this.e = zr1_12;
    }

    public final Object invoke(Object object) {
        zr1_1 zr1_12 = this.e;
        Object object2 = object;
        object2 = (dl2_2)object;
        boolean bl2 = this.a;
        String string2 = this.b;
        CategoryNavigationRepo categoryNavigationRepo = this.c;
        boolean bl3 = this.d;
        return CategoryNavigationRepo.c(bl2, string2, categoryNavigationRepo, bl3, zr1_12, (dl2_2)object2);
    }
}

