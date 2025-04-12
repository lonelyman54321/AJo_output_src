/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.SortedMapDifference;
import java.util.Map;

/*
 * Renamed from y93
 */
public final class y93_0 {
    public static /* bridge */ /* synthetic */ Map a(SortedMapDifference sortedMapDifference) {
        return sortedMapDifference.entriesDiffering();
    }

    public static /* bridge */ /* synthetic */ Map b(SortedMapDifference sortedMapDifference) {
        return sortedMapDifference.entriesInCommon();
    }

    public static /* bridge */ /* synthetic */ Map c(SortedMapDifference sortedMapDifference) {
        return sortedMapDifference.entriesOnlyOnLeft();
    }

    public static /* bridge */ /* synthetic */ Map d(SortedMapDifference sortedMapDifference) {
        return sortedMapDifference.entriesOnlyOnRight();
    }
}

