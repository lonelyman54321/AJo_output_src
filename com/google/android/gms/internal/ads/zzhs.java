/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhq;
import com.google.android.gms.internal.ads.zzhr;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class zzhs
extends zzgv {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzhs() {
        super(false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        block5: {
            RandomAccessFile randomAccessFile;
            if (n4 == 0) {
                return 0;
            }
            long l2 = this.zzc;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                return -1;
            }
            try {
                randomAccessFile = this.zza;
            }
            catch (IOException iOException) {
                zzhr zzhr2 = new zzhr(iOException, 2000);
                throw zzhr2;
            }
            long l7 = n4;
            {
                l2 = Math.min(l2, l7);
                n4 = (int)l2;
                n7 = randomAccessFile.read(byArray, n3, n4);
                if (n7 <= 0) break block5;
                long l8 = this.zzc;
            }
            l2 = n7;
            this.zzc = l8 -= l2;
            this.zzg(n7);
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh object) {
        FileNotFoundException fileNotFoundException2;
        int n3;
        int n4;
        int n7;
        Object object2;
        block16: {
            SecurityException securityException2;
            block15: {
                block12: {
                    IOException iOException2;
                    block13: {
                        long l2;
                        long l3;
                        RandomAccessFile randomAccessFile;
                        object2 = ((zzhh)object).zza;
                        this.zzb = object2;
                        this.zzi((zzhh)object);
                        n7 = 2006;
                        n4 = 2000;
                        n3 = 1;
                        String string2 = object2.getPath();
                        if (string2 == null) break block12;
                        String string3 = "r";
                        this.zza = randomAccessFile = new RandomAccessFile(string2, string3);
                        try {
                            l3 = ((zzhh)object).zze;
                            randomAccessFile.seek(l3);
                            l3 = ((zzhh)object).zzf;
                            l2 = -1;
                            long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                            if (l4 == false) {
                                object2 = this.zza;
                                l3 = ((RandomAccessFile)object2).length();
                                l2 = ((zzhh)object).zze;
                                l3 -= l2;
                            }
                            this.zzc = l3;
                            l2 = 0L;
                        }
                        catch (IOException iOException2) {
                            break block13;
                        }
                        n4 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                        if (n4 >= 0) {
                            this.zzd = n3;
                            this.zzj((zzhh)object);
                            return this.zzc;
                        }
                        object = new zzhr(null, null, 2008);
                        throw object;
                    }
                    object2 = new zzhr(iOException2, n4);
                    throw object2;
                }
                try {
                    throw null;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (SecurityException securityException2) {
                    break block15;
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block16;
                }
                object2 = new zzhr(runtimeException, n4);
                throw object2;
            }
            object2 = new zzhr(securityException2, n7);
            throw object2;
        }
        Object object3 = object2.getQuery();
        n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object3 = object2.getFragment())) ? 1 : 0)) != 0) {
            n4 = zzgd.zza;
            object3 = fileNotFoundException2.getCause();
            n4 = (int)(zzhq.zza((Throwable)object3) ? 1 : 0);
            if (n3 != n4) {
                n7 = 2005;
            }
            object2 = new zzhr(fileNotFoundException2, n7);
            throw object2;
        }
        object3 = object2.getPath();
        String string4 = object2.getQuery();
        object2 = object2.getFragment();
        object3 = og_1.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", (String)object3, ",query=", string4, ",fragment=");
        ((StringBuilder)object3).append((String)object2);
        object2 = ((StringBuilder)object3).toString();
        zzhr zzhr2 = new zzhr((String)object2, fileNotFoundException2, 1004);
        throw zzhr2;
    }

    public final Uri zzc() {
        return this.zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Throwable throwable2;
        boolean bl2;
        block6: {
            bl2 = false;
            this.zzb = null;
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (IOException iOException) {}
            bl2 = this.zzd;
            if (!bl2) return;
            this.zzd = false;
            this.zzh();
            return;
            {
                int n3 = 2000;
                zzhr zzhr2 = new zzhr(iOException, n3);
                throw zzhr2;
            }
        }
        this.zza = null;
        bl2 = this.zzd;
        if (!bl2) {
            throw throwable2;
        }
        this.zzd = false;
        this.zzh();
        throw throwable2;
    }
}

