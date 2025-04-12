/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 */
import android.text.Layout;

public final class Eg1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3 = Layout.Alignment.values().length;
        int[] nArray = new int[n3];
        try {
            int n4;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            int n7 = alignment.ordinal();
            nArray[n7] = n4 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

