/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Qz2
 */
public final class qz2_2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (ProductImage)object;
        object2 = (ProductImage)object2;
        return Product.b((ProductImage)object, (ProductImage)object2);
    }
}

