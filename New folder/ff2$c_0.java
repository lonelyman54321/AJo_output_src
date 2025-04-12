/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fF2$c
 */
public final class ff2$c_0
extends ff2_1 {
    public final BrandPageModel a;

    public ff2$c_0(BrandPageModel brandPageModel) {
        this.a = brandPageModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ff2$c_0;
        if (!bl3) {
            return false;
        }
        object = (ff2$c_0)object;
        BrandPageModel brandPageModel = this.a;
        object = ((ff2$c_0)object).a;
        boolean bl4 = Intrinsics.areEqual(brandPageModel, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        BrandPageModel brandPageModel = this.a;
        if (brandPageModel == null) {
            n3 = 0;
            brandPageModel = null;
        } else {
            n3 = brandPageModel.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(recentPostData=");
        BrandPageModel brandPageModel = this.a;
        stringBuilder.append(brandPageModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

