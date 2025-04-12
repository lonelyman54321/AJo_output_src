/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ym3
 */
public final class ym3_0
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        int n3 = (object2 = (CoroutineContext$Element)object2) instanceof xm3_0;
        if (n3 != 0) {
            int n4;
            n3 = object instanceof Integer;
            if (n3 != 0) {
                object = (Integer)object;
            } else {
                n4 = 0;
                object = null;
            }
            n3 = 1;
            n4 = object != null ? (Integer)object : 1;
            object = n4 == 0 ? object2 : Integer.valueOf(n4 += n3);
        }
        return object;
    }
}

