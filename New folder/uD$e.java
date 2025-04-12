/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import kotlin.jvm.internal.Intrinsics;

public final class uD$e
extends ud_1 {
    public final BrandPageModel a;

    public uD$e(BrandPageModel brandPageModel) {
        this.a = brandPageModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof uD$e;
        if (!bl3) {
            return false;
        }
        object = (uD$e)object;
        BrandPageModel brandPageModel = this.a;
        object = ((uD$e)object).a;
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
        StringBuilder stringBuilder = new StringBuilder("SUCCESS(brandPageData=");
        BrandPageModel brandPageModel = this.a;
        stringBuilder.append(brandPageModel);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

