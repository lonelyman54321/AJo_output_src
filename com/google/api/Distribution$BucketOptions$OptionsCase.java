/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

public final class Distribution$BucketOptions$OptionsCase
extends Enum {
    private static final /* synthetic */ Distribution$BucketOptions$OptionsCase[] $VALUES;
    public static final /* enum */ Distribution$BucketOptions$OptionsCase EXPLICIT_BUCKETS;
    public static final /* enum */ Distribution$BucketOptions$OptionsCase EXPONENTIAL_BUCKETS;
    public static final /* enum */ Distribution$BucketOptions$OptionsCase LINEAR_BUCKETS;
    public static final /* enum */ Distribution$BucketOptions$OptionsCase OPTIONS_NOT_SET;
    private final int value;

    static {
        Distribution$BucketOptions$OptionsCase distribution$BucketOptions$OptionsCase;
        Distribution$BucketOptions$OptionsCase distribution$BucketOptions$OptionsCase2;
        Distribution$BucketOptions$OptionsCase distribution$BucketOptions$OptionsCase3;
        Distribution$BucketOptions$OptionsCase distribution$BucketOptions$OptionsCase4;
        int n3 = 1;
        LINEAR_BUCKETS = distribution$BucketOptions$OptionsCase4 = new Distribution$BucketOptions$OptionsCase("LINEAR_BUCKETS", 0, n3);
        int n4 = 2;
        EXPONENTIAL_BUCKETS = distribution$BucketOptions$OptionsCase3 = new Distribution$BucketOptions$OptionsCase("EXPONENTIAL_BUCKETS", n3, n4);
        int n7 = 3;
        EXPLICIT_BUCKETS = distribution$BucketOptions$OptionsCase2 = new Distribution$BucketOptions$OptionsCase("EXPLICIT_BUCKETS", n4, n7);
        OPTIONS_NOT_SET = distribution$BucketOptions$OptionsCase = new Distribution$BucketOptions$OptionsCase("OPTIONS_NOT_SET", n7, 0);
        Distribution$BucketOptions$OptionsCase[] distribution$BucketOptions$OptionsCaseArray = new Distribution$BucketOptions$OptionsCase[4];
        distribution$BucketOptions$OptionsCaseArray[0] = distribution$BucketOptions$OptionsCase4;
        distribution$BucketOptions$OptionsCaseArray[n3] = distribution$BucketOptions$OptionsCase3;
        distribution$BucketOptions$OptionsCaseArray[n4] = distribution$BucketOptions$OptionsCase2;
        distribution$BucketOptions$OptionsCaseArray[n7] = distribution$BucketOptions$OptionsCase;
        $VALUES = distribution$BucketOptions$OptionsCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Distribution$BucketOptions$OptionsCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Distribution$BucketOptions$OptionsCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        return null;
                    }
                    return EXPLICIT_BUCKETS;
                }
                return EXPONENTIAL_BUCKETS;
            }
            return LINEAR_BUCKETS;
        }
        return OPTIONS_NOT_SET;
    }

    public static Distribution$BucketOptions$OptionsCase valueOf(int n3) {
        return Distribution$BucketOptions$OptionsCase.forNumber(n3);
    }

    public static Distribution$BucketOptions$OptionsCase valueOf(String string2) {
        return Enum.valueOf(Distribution$BucketOptions$OptionsCase.class, string2);
    }

    public static Distribution$BucketOptions$OptionsCase[] values() {
        return (Distribution$BucketOptions$OptionsCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

