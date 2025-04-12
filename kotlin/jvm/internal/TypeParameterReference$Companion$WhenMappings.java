/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class TypeParameterReference$Companion$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        nn1_1 nn1_12;
        int n7 = nn1_1.values().length;
        int[] nArray = new int[n7];
        try {
            nn1_12 = nn1_1.INVARIANT;
            n4 = nn1_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nn1_12 = nn1_1.IN;
            n4 = nn1_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nn1_12 = nn1_1.OUT;
            n4 = nn1_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

