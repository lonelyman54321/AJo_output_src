/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PlpProductUIModel;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.entity.BannerAdData;
import kotlin.jvm.internal.Intrinsics;

public final class cB2 {
    public final Product a;
    public final db2_0 b;
    public final PlpExtendedBanner c;
    public final String d;
    public final Integer e;
    public final BannerAdData f;
    public final Facet g;
    public final PlpProductUIModel h;

    public cB2() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public cB2(Product product, db2_0 db2_02, PlpExtendedBanner plpExtendedBanner, String string2, Integer n3, BannerAdData bannerAdData, Facet facet, PlpProductUIModel plpProductUIModel, int n4) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            product = null;
        }
        if ((n7 = n4 & 2) != 0) {
            db2_02 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            plpExtendedBanner = null;
        }
        if ((n7 = n4 & 8) != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 0x10) != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 0x20) != 0) {
            bannerAdData = null;
        }
        if ((n7 = n4 & 0x40) != 0) {
            facet = null;
        }
        if ((n4 &= 0x80) != 0) {
            plpProductUIModel = null;
        }
        this.a = product;
        this.b = db2_02;
        this.c = plpExtendedBanner;
        this.d = string2;
        this.e = n3;
        this.f = bannerAdData;
        this.g = facet;
        this.h = plpProductUIModel;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof cB2;
        if (!bl3) {
            return false;
        }
        object = (cB2)object;
        Object object2 = this.a;
        Object object3 = ((cB2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((cB2)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object2 = ((cB2)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((cB2)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((cB2)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object2 = ((cB2)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.g;
        object2 = ((cB2)object).g;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.h;
        object = ((cB2)object).h;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Product product = this.a;
        if (product == null) {
            n4 = 0;
            product = null;
        } else {
            n4 = product.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((BannerAdData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object != null) {
            n7 = ((PlpProductUIModel)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProductWrapper(product=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", type=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", plpExtendedBanner=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", bannerImageUrl=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", productIndex=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", bannerAdData=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", facetData=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", plpProductUiModel=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

