/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

public final class zzwe {
    public static Object zza(Object object, String object2) {
        if (object != null) {
            return object;
        }
        object = ((String)object2).concat(" must not be null");
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     */
    public static String zzb(String object) {
        boolean n3 = ((String)object).isEmpty();
        if (!n3) {
            IllegalArgumentException illegalArgumentException = null;
            boolean bl2 = zzwe.zzc(((String)object).charAt(0));
            if (bl2) {
                int n4;
                void var1_4;
                boolean bl3 = true;
                while (var1_4 < (n4 = ((String)object).length())) {
                    n4 = ((String)object).charAt((int)var1_4);
                    int n7 = zzwe.zzc((char)n4);
                    if (n7 == 0 && (n4 < (n7 = 48) || n4 > (n7 = 57)) && n4 != (n7 = 95)) {
                        object = "identifier must contain only ASCII letters, digits or underscore: ".concat((String)object);
                        illegalArgumentException = new IllegalArgumentException((String)object);
                        throw illegalArgumentException;
                    }
                    ++var1_4;
                }
                return object;
            }
            object = "identifier must start with an ASCII letter: ".concat((String)object);
            illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        object = new IllegalArgumentException("identifier must not be empty");
        throw object;
    }

    private static boolean zzc(char n3) {
        int n4 = 97;
        boolean bl2 = true;
        if (n3 < n4 || n3 > (n4 = 122)) {
            n4 = 65;
            if (n3 >= n4) {
                n4 = 90;
                if (n3 > n4) {
                    return false;
                }
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }
}

