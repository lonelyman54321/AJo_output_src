/*
 * Decompiled with CFR 0.152.
 */
import kotlin.io.FileWalkDirection;

public final class iM0$b$d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FileWalkDirection fileWalkDirection;
        int n7 = FileWalkDirection.values().length;
        int[] nArray = new int[n7];
        try {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
            n4 = fileWalkDirection.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fileWalkDirection = FileWalkDirection.BOTTOM_UP;
            n4 = fileWalkDirection.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

