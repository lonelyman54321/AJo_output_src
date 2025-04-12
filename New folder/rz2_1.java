/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.Product;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Rz2
 */
public final class rz2_1
implements Comparator {
    public final /* synthetic */ Function2 a;

    public /* synthetic */ rz2_1(qz2_2 qz2_22) {
        this.a = qz2_22;
    }

    public final int compare(Object object, Object object2) {
        return Product.a((qz2_2)this.a, object, object2);
    }
}

