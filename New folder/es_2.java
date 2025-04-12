/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eS
 */
public final class es_2 {
    public static final p62_0 a;

    static {
        boolean bl2;
        Object object = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (object != null) {
            bl2 = Boolean.parseBoolean((String)object);
        } else {
            bl2 = false;
            object = null;
        }
        if (bl2) {
            object = new Object();
        } else {
            int n3 = 4096;
            object = new mm0_2(n3);
        }
        a = object;
    }
}

