/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.StringsKt;

/*
 * Renamed from Lp
 */
public final class lp_2 {
    public static final int a;

    static {
        Object object;
        Object object2;
        int n3;
        block7: {
            block6: {
                n3 = 0;
                object2 = null;
                try {
                    object = tl2_2.b;
                    object = "kotlinx.serialization.json.pool.size";
                }
                catch (Throwable throwable) {}
                object = System.getProperty((String)object);
                if (object == null) break block6;
                try {
                    object = StringsKt.toIntOrNull((String)object);
                }
                finally {
                    break block7;
                }
            }
            object = null;
        }
        boolean bl2 = object instanceof tL2$b;
        if (!bl2) {
            object2 = object;
        }
        object2 = (Integer)object2;
        n3 = object2 != null ? (Integer)object2 : 0x200000;
        a = n3;
    }
}

