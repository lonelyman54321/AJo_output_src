/*
 * Decompiled with CFR 0.152.
 */
import com.jio.retargeting.TrackerType;

/*
 * Renamed from dK3
 */
public abstract class dk3_2 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        TrackerType trackerType;
        int n7 = TrackerType.values().length;
        int[] nArray = new int[n7];
        try {
            trackerType = TrackerType.IMPRESSION;
            n4 = trackerType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            trackerType = TrackerType.CLICK;
            n4 = trackerType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            trackerType = TrackerType.VIEWABLE;
            n4 = trackerType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

