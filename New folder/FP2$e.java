/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

public final class FP2$e {
    public final LinkedHashMap a;

    public FP2$e() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final void a(XO1 ... xO1Array) {
        String string2 = "migrations";
        Intrinsics.checkNotNullParameter(xO1Array, string2);
        for (XO1 xO1 : xO1Array) {
            int n3 = xO1.startVersion;
            int n4 = xO1.endVersion;
            LinkedHashMap linkedHashMap = this.a;
            Integer n7 = n3;
            Object object = linkedHashMap.get(n7);
            if (object == null) {
                object = new TreeMap();
                linkedHashMap.put(n7, object);
            }
            if ((n3 = (int)((object = (TreeMap)object).containsKey(n7 = Integer.valueOf(n4)) ? 1 : 0)) != 0) {
                n7 = n4;
                n7 = ((TreeMap)object).get(n7);
                Objects.toString(n7);
                xO1.toString();
            }
            n7 = n4;
            object.put(n7, xO1);
        }
    }
}

