/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from k23
 */
public final class k23_0 {
    public static final gh3_2 a;

    static {
        gh3_2 gh3_22;
        a = gh3_22 = new gh3_2("NO_VALUE");
    }

    public static final i23_0 a(int n3, int n4, he_2 he_22) {
        if (n3 >= 0) {
            if (n4 >= 0) {
                Object object;
                if (n3 <= 0 && n4 <= 0 && he_22 != (object = he_2.SUSPEND)) {
                    CharSequence charSequence = new StringBuilder("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    ((StringBuilder)charSequence).append((Object)he_22);
                    charSequence = ((StringBuilder)charSequence).toString();
                    charSequence = ((Object)charSequence).toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)charSequence);
                    throw illegalArgumentException;
                }
                if ((n4 += n3) < 0) {
                    n4 = -1 >>> 1;
                }
                object = new i23_0(n3, n4, he_22);
                return object;
            }
            String string2 = hj0_0.a(n4, "extraBufferCapacity cannot be negative, but was ");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        String string3 = hj0_0.a(n3, "replay cannot be negative, but was ");
        string3 = string3.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static /* synthetic */ i23_0 b(int n3, int n4, he_2 he_22, int n7) {
        int n8 = n7 & 1;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n8 = n7 & 2) != 0) {
            n4 = 0;
        }
        if ((n7 &= 4) != 0) {
            he_22 = he_2.SUSPEND;
        }
        return k23_0.a(n3, n4, he_22);
    }

    public static final Object c(Object[] objectArray, long l2) {
        int n3 = (int)l2;
        int n4 = objectArray.length + -1 & n3;
        return objectArray[n4];
    }

    public static final void d(Object[] objectArray, long l2, Object object) {
        int n3 = (int)l2;
        int n4 = objectArray.length + -1 & n3;
        objectArray[n4] = object;
    }

    public static final es0_2 e(h23_0 h23_02, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        Object object;
        int n4;
        if ((n3 == 0 || n3 == (n4 = -3)) && he_22 == (object = he_2.SUSPEND)) {
            return h23_02;
        }
        object = new or_2(n3, he_22, h23_02, coroutineContext);
        return object;
    }
}

