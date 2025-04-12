/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.KYPMedia;
import java.util.Comparator;

public final class Z02
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((KYPMedia)object).getKypSequence();
        object2 = ((KYPMedia)object2).getKypSequence();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

