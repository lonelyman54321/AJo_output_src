/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P03
 */
public class p03_0
extends O03 {
    public static vz0_2 c() {
        return vz0_2.a;
    }

    public static HashSet d(Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        int n3 = eh1_2.c(objectArray.length);
        HashSet hashSet = new HashSet(n3);
        tp_2.L(objectArray, hashSet);
        return hashSet;
    }

    public static Set e(Object ... objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        int n3 = eh1_2.c(objectArray.length);
        LinkedHashSet linkedHashSet = new LinkedHashSet(n3);
        tp_2.L(objectArray, linkedHashSet);
        return linkedHashSet;
    }

    public static Set f(Object ... object) {
        String string2 = "elements";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        object = n3 > 0 ? tp_2.O(object) : vz0_2.a;
        return object;
    }
}

