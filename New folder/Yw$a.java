/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class Yw$a
extends InheritableThreadLocal {
    public final Object childValue(Object hashMap) {
        HashMap hashMap2;
        hashMap = (hashMap = (Map)hashMap) == null ? null : (hashMap2 = new HashMap(hashMap));
        return hashMap;
    }
}

