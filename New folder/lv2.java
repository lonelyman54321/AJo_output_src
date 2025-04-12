/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class lv2
implements Serializable {
    public final Product a;
    public final String b;
    public final int c;
    public int d;
    public String e;

    public lv2(Product product, int n3, String string2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(string2, "imageUrl");
        this.a = product;
        this.b = string2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof lv2;
        if (n3 == 0) {
            return false;
        }
        object = (lv2)object;
        Object object2 = this.a;
        Object object3 = ((lv2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((lv2)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((lv2)object).c;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        int n4 = this.c;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlpPeek(product=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", imageUrl=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adapterPosition=");
        return g30.a(this.c, ")", stringBuilder);
    }
}

