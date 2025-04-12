/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yQ
 */
public final class yq_2
implements Function1 {
    public final /* synthetic */ hq_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ yq_2(hq_2 hq_22, String string2) {
        this.a = hq_22;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        hq_2 hq_22 = this.a;
        Intrinsics.checkNotNullParameter(hq_22, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$store");
        Intrinsics.checkNotNullParameter(object, "isNavPresentInPref");
        CategoryNavigationRepo categoryNavigationRepo = hq_22.a;
        zr1_1 zr1_12 = hq_22.f;
        boolean bl2 = (Boolean)object;
        return CategoryNavigationRepo.getCMSCategoryNavigation$default(categoryNavigationRepo, zr1_12, bl2, string2, false, false, 16, null);
    }
}

