/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LaunchStage$1;
import com.google.api.LaunchStage$LaunchStageVerifier;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;

public final class LaunchStage
extends Enum
implements Internal$EnumLite {
    private static final /* synthetic */ LaunchStage[] $VALUES;
    public static final /* enum */ LaunchStage ALPHA;
    public static final int ALPHA_VALUE = 2;
    public static final /* enum */ LaunchStage BETA;
    public static final int BETA_VALUE = 3;
    public static final /* enum */ LaunchStage DEPRECATED;
    public static final int DEPRECATED_VALUE = 5;
    public static final /* enum */ LaunchStage EARLY_ACCESS;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final /* enum */ LaunchStage GA;
    public static final int GA_VALUE = 4;
    public static final /* enum */ LaunchStage LAUNCH_STAGE_UNSPECIFIED;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE;
    public static final /* enum */ LaunchStage UNRECOGNIZED;
    private static final Internal$EnumLiteMap internalValueMap;
    private final int value;

    static {
        LaunchStage launchStage;
        LaunchStage launchStage2;
        LaunchStage launchStage3;
        LaunchStage launchStage4;
        LaunchStage launchStage5;
        LaunchStage launchStage6;
        Object object = new LaunchStage("LAUNCH_STAGE_UNSPECIFIED", 0, 0);
        LAUNCH_STAGE_UNSPECIFIED = object;
        int n3 = 1;
        EARLY_ACCESS = launchStage6 = new LaunchStage("EARLY_ACCESS", n3, n3);
        int n4 = 2;
        ALPHA = launchStage5 = new LaunchStage("ALPHA", n4, n4);
        int n7 = 3;
        BETA = launchStage4 = new LaunchStage("BETA", n7, n7);
        int n8 = 4;
        GA = launchStage3 = new LaunchStage("GA", n8, n8);
        int n10 = 5;
        DEPRECATED = launchStage2 = new LaunchStage("DEPRECATED", n10, n10);
        int n14 = 6;
        UNRECOGNIZED = launchStage = new LaunchStage("UNRECOGNIZED", n14, -1);
        LaunchStage[] launchStageArray = new LaunchStage[7];
        launchStageArray[0] = object;
        launchStageArray[n3] = launchStage6;
        launchStageArray[n4] = launchStage5;
        launchStageArray[n7] = launchStage4;
        launchStageArray[n8] = launchStage3;
        launchStageArray[n10] = launchStage2;
        launchStageArray[n14] = launchStage;
        $VALUES = launchStageArray;
        internalValueMap = object = new LaunchStage$1();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LaunchStage() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static LaunchStage forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = 5;
                            if (n3 != n4) {
                                return null;
                            }
                            return DEPRECATED;
                        }
                        return GA;
                    }
                    return BETA;
                }
                return ALPHA;
            }
            return EARLY_ACCESS;
        }
        return LAUNCH_STAGE_UNSPECIFIED;
    }

    public static Internal$EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal$EnumVerifier internalGetVerifier() {
        return LaunchStage$LaunchStageVerifier.INSTANCE;
    }

    public static LaunchStage valueOf(int n3) {
        return LaunchStage.forNumber(n3);
    }

    public static LaunchStage valueOf(String string2) {
        return Enum.valueOf(LaunchStage.class, string2);
    }

    public static LaunchStage[] values() {
        return (LaunchStage[])$VALUES.clone();
    }

    public final int getNumber() {
        Object object = UNRECOGNIZED;
        if (this != object) {
            return this.value;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

