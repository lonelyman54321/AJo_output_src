/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Predicate;
import java.util.Map;

public final class Xl0
implements Predicate {
    public final boolean apply(Object object) {
        boolean bl2;
        if ((object = ((Map.Entry)object).getKey()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

