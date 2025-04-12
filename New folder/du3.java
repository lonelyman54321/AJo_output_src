/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Payment.UpiAppData;
import java.util.Comparator;

public final class du3
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = ((UpiAppData)object).getPriority();
        object2 = ((UpiAppData)object2).getPriority();
        return q00_0.a((Comparable)object, (Comparable)object2);
    }
}

