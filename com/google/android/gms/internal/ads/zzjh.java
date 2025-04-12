/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzjg;
import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzvo;
import java.io.IOException;
import java.io.Serializable;

public final class zzjh
extends zzcj {
    public static final zzn zzd;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    private static final String zzq;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzan zzh;
    public final int zzi;
    public final zzvo zzj;
    final boolean zzk;

    static {
        zzjg zzjg2 = new zzjg();
        zzd = zzjg2;
        int n3 = 36;
        zzl = Integer.toString(1001, n3);
        zzm = Integer.toString(1002, n3);
        zzn = Integer.toString(1003, n3);
        zzo = Integer.toString(1004, n3);
        zzp = Integer.toString(1005, n3);
        zzq = Integer.toString(1006, n3);
    }

    private zzjh(int n3, Throwable throwable, int n4) {
        this(n3, throwable, null, n4, null, -1, null, 4, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private zzjh(int n3, Throwable throwable, String string2, int n4, String string3, int n7, zzan zzan2, int n8, boolean bl2) {
        Serializable serializable;
        String string4;
        Object object;
        block9: {
            block7: {
                block6: {
                    block10: {
                        block11: {
                            int n10;
                            block8: {
                                if (n3 == 0) break block7;
                                n10 = 1;
                                if (n3 == n10) break block8;
                                object = "Unexpected runtime error";
                                break block9;
                            }
                            string4 = String.valueOf(zzan2);
                            if (n8 == 0) break block10;
                            if (n8 == n10) break block11;
                            n10 = 2;
                            if (n8 != n10) {
                                n10 = 3;
                                if (n8 != n10) {
                                    n10 = 4;
                                    if (n8 != n10) {
                                        IllegalStateException illegalStateException = new IllegalStateException();
                                        throw illegalStateException;
                                    }
                                    object = "YES";
                                    break block6;
                                } else {
                                    object = "NO_EXCEEDS_CAPABILITIES";
                                }
                                break block6;
                            } else {
                                object = "NO_UNSUPPORTED_DRM";
                            }
                            break block6;
                        }
                        object = "NO_UNSUPPORTED_TYPE";
                        break block6;
                    }
                    object = "NO";
                }
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(string3);
                ((StringBuilder)serializable).append(" error, index=");
                ((StringBuilder)serializable).append(n7);
                String string5 = ", format=";
                ((StringBuilder)serializable).append(string5);
                ((StringBuilder)serializable).append(string4);
                string4 = ", format_supported=";
                object = h30_0.a((StringBuilder)serializable, string4, (String)object);
                break block9;
            }
            object = "Source error";
        }
        string4 = null;
        boolean bl3 = TextUtils.isEmpty(null);
        if (!bl3) {
            string4 = ": null";
            object = ((String)object).concat(string4);
        }
        string4 = object;
        long l2 = SystemClock.elapsedRealtime();
        object = this;
        serializable = throwable;
        this(string4, throwable, n4, n3, string3, n7, zzan2, n8, null, l2, bl2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private zzjh(String string2, Throwable throwable, int n3, int n4, String string3, int n7, zzan zzan2, int n8, zzvo zzvo2, long l2, boolean bl2) {
        void var15_17;
        int n10;
        int n14;
        boolean bl3;
        block4: {
            block3: {
                block1: {
                    block2: {
                        zzjh zzjh2 = this;
                        bl3 = bl2;
                        int n15 = n3;
                        super(string2, throwable, n3, l2);
                        n14 = 0;
                        int n16 = 1;
                        if (!bl2) break block1;
                        n10 = n4;
                        if (n4 != n16) break block2;
                        n10 = 1;
                        break block3;
                    }
                    boolean bl4 = false;
                    break block4;
                }
                n10 = n4;
            }
            boolean bl5 = true;
        }
        zzeq.zzd((boolean)var15_17);
        if (throwable != null) {
            n14 = 1;
        }
        zzeq.zzd(n14 != 0);
        zzjh2.zze = n10;
        zzjh2.zzf = string3;
        n14 = n7;
        zzjh2.zzg = n7;
        zzjh2.zzh = zzan2;
        n14 = n8;
        zzjh2.zzi = n8;
        zzjh2.zzj = zzvo2;
        zzjh2.zzk = bl3;
    }

    public static zzjh zzb(Throwable throwable, String string2, int n3, zzan zzan2, int n4, boolean bl2, int n7) {
        int n8 = zzan2 == null ? 4 : n4;
        zzjh zzjh2 = new zzjh(1, throwable, null, n7, string2, n3, zzan2, n8, bl2);
        return zzjh2;
    }

    public static zzjh zzc(IOException iOException, int n3) {
        zzjh zzjh2 = new zzjh(0, iOException, n3);
        return zzjh2;
    }

    public static zzjh zzd(RuntimeException runtimeException, int n3) {
        zzjh zzjh2 = new zzjh(2, runtimeException, n3);
        return zzjh2;
    }

    public final zzjh zza(zzvo zzvo2) {
        String string2 = this.getMessage();
        long l2 = this.zzc;
        boolean bl2 = this.zzk;
        Throwable throwable = this.getCause();
        int n3 = this.zzb;
        int n4 = this.zze;
        String string3 = this.zzf;
        int n7 = this.zzg;
        zzan zzan2 = this.zzh;
        int n8 = this.zzi;
        zzjh zzjh2 = new zzjh(string2, throwable, n3, n4, string3, n7, zzan2, n8, zzvo2, l2, bl2);
        return zzjh2;
    }
}

