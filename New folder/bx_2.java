/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BX
 */
public class bx_2
extends ax_2 {
    public static void p(List list) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        int n3 = list.size();
        int n4 = 1;
        if (n3 > n4) {
            Collections.sort(list);
        }
    }

    public static void q(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        String string2 = "comparator";
        Intrinsics.checkNotNullParameter(comparator, string2);
        int n3 = list.size();
        int n4 = 1;
        if (n3 > n4) {
            Collections.sort(list, comparator);
        }
    }
}

