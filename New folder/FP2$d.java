/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 */
import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class FP2$d
extends Enum {
    private static final /* synthetic */ FP2$d[] $VALUES;
    public static final /* enum */ FP2$d AUTOMATIC;
    public static final /* enum */ FP2$d TRUNCATE;
    public static final /* enum */ FP2$d WRITE_AHEAD_LOGGING;

    private static final /* synthetic */ FP2$d[] $values() {
        FP2$d fP2$d = AUTOMATIC;
        fP2$d = TRUNCATE;
        fP2$d = WRITE_AHEAD_LOGGING;
        FP2$d[] fP2$dArray = new FP2$d[]{fP2$d, fP2$d, fP2$d};
        return fP2$dArray;
    }

    static {
        FP2$d fP2$d;
        AUTOMATIC = fP2$d = new FP2$d("AUTOMATIC", 0);
        TRUNCATE = fP2$d = new FP2$d("TRUNCATE", 1);
        WRITE_AHEAD_LOGGING = fP2$d = new FP2$d("WRITE_AHEAD_LOGGING", 2);
        $VALUES = FP2$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FP2$d() {
        void var2_-1;
        void var1_-1;
    }

    private final boolean isLowRamDevice(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }

    public static FP2$d valueOf(String string2) {
        return Enum.valueOf(FP2$d.class, string2);
    }

    public static FP2$d[] values() {
        return (FP2$d[])$VALUES.clone();
    }

    public final FP2$d resolve$room_runtime_release(Context object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = AUTOMATIC;
        if (this != object2) {
            return this;
        }
        object2 = "activity";
        boolean bl3 = (object = object.getSystemService((String)object2)) instanceof ActivityManager;
        if (bl3) {
            object = (ActivityManager)object;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null && !(bl2 = this.isLowRamDevice((ActivityManager)object))) {
            return WRITE_AHEAD_LOGGING;
        }
        return TRUNCATE;
    }
}

