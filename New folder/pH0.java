/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class pH0
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ ExploreBrandsPageModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ pH0(dr0_0 dr0_02, ExploreBrandsPageModel exploreBrandsPageModel, boolean bl2, String string2) {
        this.a = dr0_02;
        this.b = exploreBrandsPageModel;
        this.c = bl2;
        this.d = string2;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        boolean bl2 = this.c ^ true;
        ExploreBrandsPageModel exploreBrandsPageModel = this.b;
        String string2 = this.d;
        dr0_02.O(exploreBrandsPageModel, bl2, string2);
        return Unit.a;
    }
}

