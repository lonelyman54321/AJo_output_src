/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iu3
 */
public final class iu3_0
implements Serializable {
    public static final iu3_0 c;
    public static final LinkedHashMap d;
    public final String a;
    public final int b;

    static {
        int n3 = 80;
        Object object = new Object("http", n3);
        c = object;
        int n4 = 443;
        iu3_0 iu3_02 = new iu3_0("https", n4);
        Object object2 = new iu3_0("ws", n3);
        Serializable serializable = new iu3_0("wss", n4);
        iu3_0 iu3_03 = new iu3_0("socks", 1080);
        int n7 = 5;
        Object[] objectArray = new iu3_0[n7];
        objectArray[0] = object;
        objectArray[1] = iu3_02;
        objectArray[2] = object2;
        objectArray[3] = serializable;
        int n8 = 4;
        objectArray[n8] = iu3_03;
        object = xx_2.i(objectArray);
        int n10 = eh1_2.c(yx_2.o((Iterable)object, 10));
        if (n10 < (n3 = 16)) {
            n10 = 16;
        }
        serializable = new LinkedHashMap(n10);
        object = object.iterator();
        while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            iu3_02 = object.next();
            object2 = iu3_02;
            object2 = iu3_02.a;
            serializable.put(object2, iu3_02);
        }
        d = serializable;
    }

    public iu3_0(String object, int n3) {
        char c2;
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = n3;
        String string3 = null;
        for (n3 = 0; n3 < (c2 = ((String)object).length()); ++n3) {
            c2 = ((String)object).charAt(n3);
            char c3 = Character.toLowerCase(c2);
            if (c3 == c2) {
                continue;
            }
            string3 = "All characters should be lower case".toString();
            object = new IllegalArgumentException(string3);
            throw object;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof iu3_0;
        if (n3 == 0) {
            return false;
        }
        object = (iu3_0)object;
        String string2 = this.a;
        String string3 = ((iu3_0)object).a;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((iu3_0)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("URLProtocol(name=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", defaultPort=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

