/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqk;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

public final class zzfqx {
    protected static final byte[] zza;
    protected static final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static {
        byte[] byArray;
        byte[] byArray2;
        int n3 = 32;
        byte[] byArray3 = byArray2 = new byte[n3];
        byte[] byArray4 = byArray2;
        byArray3[0] = 61;
        byArray4[1] = 122;
        byArray3[2] = 18;
        byArray4[3] = 35;
        byArray3[4] = 1;
        byArray4[5] = -102;
        byArray3[6] = -93;
        byArray4[7] = -99;
        byArray3[8] = -98;
        byArray4[9] = -96;
        byArray3[10] = -29;
        byArray4[11] = 67;
        byArray3[12] = 106;
        byArray4[13] = -73;
        byArray3[14] = -64;
        byArray4[15] = -119;
        byArray3[16] = 107;
        byArray4[17] = -5;
        byArray3[18] = 79;
        byArray4[19] = -74;
        byArray3[20] = 121;
        byArray4[21] = -12;
        byArray3[22] = -34;
        byArray4[23] = 95;
        byArray3[24] = -25;
        byArray4[25] = -62;
        byArray3[26] = 63;
        byArray4[27] = 50;
        byArray3[28] = 108;
        byArray4[29] = -113;
        byArray3[30] = -103;
        byArray4[31] = 74;
        zza = byArray2;
        byte[] byArray5 = byArray = new byte[n3];
        byte[] byArray6 = byArray;
        byArray5[0] = -110;
        byArray6[1] = -13;
        byArray5[2] = -34;
        byArray6[3] = 70;
        byArray5[4] = -83;
        byArray6[5] = 43;
        byArray5[6] = 97;
        byArray6[7] = 21;
        byArray5[8] = -44;
        byArray6[9] = 16;
        byArray5[10] = -54;
        byArray6[11] = -125;
        byArray5[12] = -28;
        byArray6[13] = -57;
        byArray5[14] = -125;
        byArray6[15] = -127;
        byArray5[16] = -7;
        byArray6[17] = 17;
        byArray5[18] = 102;
        byArray6[19] = -69;
        byArray5[20] = 116;
        byArray6[21] = -121;
        byArray5[22] = -79;
        byArray6[23] = 43;
        byArray5[24] = -13;
        byArray6[25] = 120;
        byArray5[26] = 58;
        byArray6[27] = 55;
        byArray5[28] = -29;
        byArray6[29] = -108;
        byArray5[30] = 95;
        byArray6[31] = 83;
        zzb = byArray;
    }

    public zzfqx() {
        byte[] byArray = zzb;
        this.zzc = byArray;
        byArray = zza;
        this.zzd = byArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza(File object) {
        void var1_4;
        block5: {
            object = object.getAbsolutePath();
            try {
                object = zzaqk.zza((String)object);
            }
            catch (RuntimeException runtimeException) {
                break block5;
            }
            catch (IOException iOException) {
                // empty catch block
                break block5;
            }
            catch (zzaqh zzaqh2) {
                GeneralSecurityException generalSecurityException2 = new GeneralSecurityException("Package is not signed", zzaqh2);
                throw generalSecurityException2;
            }
            boolean bl2 = ((Object)object).length;
            boolean bl3 = true;
            if (bl2 != bl3) {
                object = new GeneralSecurityException("APK has more than one signature.");
                throw object;
            }
            bl2 = false;
            Object var4_8 = null;
            object = object[0][0];
            Object object2 = MessageDigest.getInstance("SHA-256");
            object = object.getEncoded();
            object2 = this.zzd;
            boolean bl4 = Arrays.equals((byte[])object2, (byte[])(object = (Object)((MessageDigest)object2).digest((byte[])object)));
            if (bl4) return bl3;
            object2 = "user";
            String string2 = Build.TYPE;
            bl4 = ((String)object2).equals(string2);
            if (bl4) return false;
            object2 = this.zzc;
            boolean bl5 = Arrays.equals((byte[])object2, (byte[])object);
            if (!bl5) return false;
            return bl3;
        }
        GeneralSecurityException generalSecurityException = new GeneralSecurityException("Failed to verify signatures", (Throwable)var1_4);
        throw generalSecurityException;
    }
}

