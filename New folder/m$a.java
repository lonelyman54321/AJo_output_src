/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 */
import android.widget.ImageView;

public final class m$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        ri0 ri02;
        int n4;
        int n7;
        Enum enum_;
        int n8;
        int n10 = ri0.values().length;
        int[] nArray = new int[n10];
        int n14 = 1;
        try {
            ri0 ri03 = ri0.MEMORY_CACHE;
            n8 = ri03.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            enum_ = ri0.MEMORY;
            n7 = enum_.ordinal();
            nArray[n7] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            ri0 ri04 = ri0.DISK;
            n4 = ri04.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 4;
        try {
            ri02 = ri0.NETWORK;
            n3 = ri02.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n10 = ImageView.ScaleType.values().length;
        nArray = new int[n10];
        try {
            ri02 = ImageView.ScaleType.FIT_START;
            n3 = ri02.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ri02 = ImageView.ScaleType.FIT_CENTER;
            n3 = ri02.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ri02 = ImageView.ScaleType.FIT_END;
            n3 = ri02.ordinal();
            nArray[n3] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = ImageView.ScaleType.CENTER_INSIDE;
            n7 = enum_.ordinal();
            nArray[n7] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n10 = WS2.values().length;
        nArray = new int[n10];
        try {
            enum_ = WS2.FILL;
            n7 = enum_.ordinal();
            nArray[n7] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            WS2 wS2 = WS2.FIT;
            n14 = wS2.ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
    }
}

