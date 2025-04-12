/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import kotlin.jvm.internal.Intrinsics;

public final class GH0$d
extends gh0_0 {
    public final ExploreBrandsPageModel a;

    public GH0$d(ExploreBrandsPageModel exploreBrandsPageModel) {
        this.a = exploreBrandsPageModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GH0$d;
        if (!bl3) {
            return false;
        }
        object = (GH0$d)object;
        ExploreBrandsPageModel exploreBrandsPageModel = this.a;
        object = ((GH0$d)object).a;
        boolean bl4 = Intrinsics.areEqual(exploreBrandsPageModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        ExploreBrandsPageModel exploreBrandsPageModel = this.a;
        if (exploreBrandsPageModel == null) {
            n3 = 0;
            exploreBrandsPageModel = null;
        } else {
            n3 = exploreBrandsPageModel.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(exploreBrandsData=");
        ExploreBrandsPageModel exploreBrandsPageModel = this.a;
        stringBuilder.append(exploreBrandsPageModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

