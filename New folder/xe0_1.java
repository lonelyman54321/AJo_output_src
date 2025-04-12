/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.base.Function;

/*
 * Renamed from Xe0
 */
public final class xe0_1
implements Function {
    public final Object apply(Object object) {
        object = (We0)object;
        long l2 = ((We0)object).b;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) {
            l2 = 0L;
        }
        return l2;
    }
}

