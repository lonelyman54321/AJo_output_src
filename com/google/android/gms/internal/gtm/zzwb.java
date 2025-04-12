/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

final class zzwb
extends Enum {
    public static final /* enum */ zzwb zza;
    public static final /* enum */ zzwb zzb;
    public static final /* enum */ zzwb zzc;
    public static final /* enum */ zzwb zzd;
    private static final /* synthetic */ zzwb[] zze;

    static {
        zzwb zzwb2;
        zzwb zzwb3;
        zzwb zzwb4;
        zzwb zzwb5;
        zza = zzwb5 = new zzwb("BOOLEAN", 0);
        int n3 = 1;
        zzb = zzwb4 = new zzwb("STRING", n3);
        int n4 = 2;
        zzc = zzwb3 = new zzwb("LONG", n4);
        int n7 = 3;
        zzd = zzwb2 = new zzwb("DOUBLE", n7);
        zzwb[] zzwbArray = new zzwb[4];
        zzwbArray[0] = zzwb5;
        zzwbArray[n3] = zzwb4;
        zzwbArray[n4] = zzwb3;
        zzwbArray[n7] = zzwb2;
        zze = zzwbArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzwb() {
        void var2_-1;
        void var1_-1;
    }

    public static zzwb[] values() {
        return (zzwb[])zze.clone();
    }

    public static /* bridge */ /* synthetic */ zzwb zza(Object object) {
        block6: {
            block3: {
                boolean bl2;
                block5: {
                    block4: {
                        block2: {
                            bl2 = object instanceof String;
                            if (!bl2) break block2;
                            object = zzb;
                            break block3;
                        }
                        bl2 = object instanceof Boolean;
                        if (!bl2) break block4;
                        object = zza;
                        break block3;
                    }
                    bl2 = object instanceof Long;
                    if (!bl2) break block5;
                    object = zzc;
                    break block3;
                }
                bl2 = object instanceof Double;
                if (!bl2) break block6;
                object = zzd;
            }
            return object;
        }
        object = String.valueOf(object.getClass());
        object = "invalid tag type: ".concat((String)object);
        AssertionError assertionError = new AssertionError(object);
        throw assertionError;
    }
}

