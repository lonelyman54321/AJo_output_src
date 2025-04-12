/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

public final class BackendRule$AuthenticationCase
extends Enum {
    private static final /* synthetic */ BackendRule$AuthenticationCase[] $VALUES;
    public static final /* enum */ BackendRule$AuthenticationCase AUTHENTICATION_NOT_SET;
    public static final /* enum */ BackendRule$AuthenticationCase DISABLE_AUTH;
    public static final /* enum */ BackendRule$AuthenticationCase JWT_AUDIENCE;
    private final int value;

    static {
        BackendRule$AuthenticationCase backendRule$AuthenticationCase;
        BackendRule$AuthenticationCase backendRule$AuthenticationCase2;
        BackendRule$AuthenticationCase backendRule$AuthenticationCase3;
        JWT_AUDIENCE = backendRule$AuthenticationCase3 = new BackendRule$AuthenticationCase("JWT_AUDIENCE", 0, 7);
        int n3 = 1;
        DISABLE_AUTH = backendRule$AuthenticationCase2 = new BackendRule$AuthenticationCase("DISABLE_AUTH", n3, 8);
        int n4 = 2;
        AUTHENTICATION_NOT_SET = backendRule$AuthenticationCase = new BackendRule$AuthenticationCase("AUTHENTICATION_NOT_SET", n4, 0);
        BackendRule$AuthenticationCase[] backendRule$AuthenticationCaseArray = new BackendRule$AuthenticationCase[3];
        backendRule$AuthenticationCaseArray[0] = backendRule$AuthenticationCase3;
        backendRule$AuthenticationCaseArray[n3] = backendRule$AuthenticationCase2;
        backendRule$AuthenticationCaseArray[n4] = backendRule$AuthenticationCase;
        $VALUES = backendRule$AuthenticationCaseArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BackendRule$AuthenticationCase() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static BackendRule$AuthenticationCase forNumber(int n3) {
        if (n3 != 0) {
            int n4 = 7;
            if (n3 != n4) {
                n4 = 8;
                if (n3 != n4) {
                    return null;
                }
                return DISABLE_AUTH;
            }
            return JWT_AUDIENCE;
        }
        return AUTHENTICATION_NOT_SET;
    }

    public static BackendRule$AuthenticationCase valueOf(int n3) {
        return BackendRule$AuthenticationCase.forNumber(n3);
    }

    public static BackendRule$AuthenticationCase valueOf(String string2) {
        return Enum.valueOf(BackendRule$AuthenticationCase.class, string2);
    }

    public static BackendRule$AuthenticationCase[] values() {
        return (BackendRule$AuthenticationCase[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

