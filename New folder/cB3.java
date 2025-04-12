/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class cB3 {
    public static final Map a;

    static {
        WeakHashMap weakHashMap = new WeakHashMap();
        a = Collections.synchronizedMap(weakHashMap);
    }
}

