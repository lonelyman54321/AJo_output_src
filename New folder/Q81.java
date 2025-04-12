/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.sis.StoreInfo;
import java.util.Comparator;

public final class Q81
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((StoreInfo)object).getPosition();
        object2 = ((StoreInfo)object2).getPosition();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

