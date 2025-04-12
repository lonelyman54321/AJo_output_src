/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from zl0
 */
public final class zl0_0
implements W60 {
    public static final zl0_0 c;
    public int a;
    public final Map b;

    static {
        zl0_0 zl0_02;
        Map map2 = Collections.emptyMap();
        c = zl0_02 = new zl0_0(map2);
    }

    public zl0_0() {
        Map map2 = Collections.emptyMap();
        this(map2);
    }

    public zl0_0(Map map2) {
        this.b = map2 = Collections.unmodifiableMap(map2);
    }

    public static boolean b(Map object, Map map2) {
        int n3;
        int n4 = object.size();
        if (n4 != (n3 = map2.size())) {
            return false;
        }
        object = object.entrySet().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object object2 = (Map.Entry)object.next();
            byte[] byArray = (byte[])object2.getValue();
            object2 = object2.getKey();
            n4 = (int)(Arrays.equals(byArray, (byte[])(object2 = (Object)((byte[])map2.get(object2)))) ? 1 : 0);
            if (n4 != 0) continue;
            return false;
        }
        return true;
    }

    public final zl0_0 a(X60 object) {
        boolean bl2;
        Object object2;
        int n3;
        int n4;
        Map map2 = this.b;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>(map2);
        Map.Entry entry = ((X60)object).b;
        Object object3 = new ArrayList(entry);
        object3 = Collections.unmodifiableList(object3);
        entry = null;
        for (n4 = 0; n4 < (n3 = object3.size()); ++n4) {
            object2 = object3.get(n4);
            hashMap.remove(object2);
        }
        object = ((X60)object).a;
        object3 = new HashMap(object);
        object = ((HashMap)object3).entrySet().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = object.next();
            object2 = entry.getValue();
            int n7 = object2 instanceof byte[];
            if (n7 == 0) continue;
            object2 = (byte[])object2;
            n7 = ((E)object2).length;
            object2 = Arrays.copyOf(object2, n7);
            entry.setValue(object2);
        }
        object = Collections.unmodifiableMap(object3).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            block10: {
                block8: {
                    block9: {
                        block7: {
                            object3 = object.next();
                            entry = (String)object3.getKey();
                            n3 = (object3 = object3.getValue()) instanceof Long;
                            if (n3 == 0) break block7;
                            n3 = 8;
                            object2 = ByteBuffer.allocate(n3);
                            long l2 = (Long)object3;
                            object3 = ((ByteBuffer)object2).putLong(l2).array();
                            break block8;
                        }
                        n3 = object3 instanceof String;
                        if (n3 == 0) break block9;
                        object3 = (String)object3;
                        object2 = StandardCharsets.UTF_8;
                        object3 = ((String)object3).getBytes((Charset)object2);
                        break block8;
                    }
                    n3 = object3 instanceof byte[];
                    if (n3 == 0) break block10;
                    object3 = (byte[])object3;
                }
                hashMap.put(entry, object3);
                continue;
            }
            object = new IllegalArgumentException();
            throw object;
        }
        boolean bl3 = zl0_0.b(map2, hashMap);
        if (bl3) {
            return this;
        }
        object = new zl0_0(hashMap);
        return object;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<zl0_0> clazz2;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz2 = zl0_0.class) == (clazz = object.getClass())) {
            object = ((zl0_0)object).b;
            return zl0_0.b(this.b, (Map)object);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        if (n3 == 0) {
            int n4;
            Iterator iterator = this.b.entrySet().iterator();
            int n7 = 0;
            while ((n4 = iterator.hasNext()) != 0) {
                Object object = iterator.next();
                String string2 = (String)object.getKey();
                int n8 = string2.hashCode();
                object = (byte[])object.getValue();
                n4 = Arrays.hashCode((byte[])object) ^ n8;
                n7 += n4;
            }
            this.a = n7;
        }
        return this.a;
    }
}

