/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.ProductsList;

public final class AM0 {
    public static AM0 b;
    public ProductsList a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AM0 a() {
        Object object = b;
        if (object != null) return b;
        object = AM0.class;
        synchronized (object) {
            try {
                AM0 aM0 = b;
                if (aM0 != null) return b;
                b = aM0 = new AM0();
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

