/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.CategoryNavigationRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d7
 */
public final class d7_0
implements Function1 {
    public final /* synthetic */ j7_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ d7_0(j7_0 j7_02, String string2) {
        this.a = j7_02;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        j7_0 j7_02 = this.a;
        Intrinsics.checkNotNullParameter(j7_02, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$store");
        Intrinsics.checkNotNullParameter(object, "isNavPresentInPref");
        CategoryNavigationRepo categoryNavigationRepo = j7_02.d;
        zr1_1 zr1_12 = j7_02.e;
        boolean bl2 = (Boolean)object;
        return categoryNavigationRepo.getCMSCategoryNavigation(zr1_12, bl2, string2, false, true);
    }
}

