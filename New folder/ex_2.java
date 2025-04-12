/*
 * Decompiled with CFR 0.152.
 */
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EX
 */
public class ex_2
extends dx_2 {
    public static SortedSet B(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        TreeSet treeSet = new TreeSet();
        CollectionsKt.h0(iterable, treeSet);
        return treeSet;
    }
}

