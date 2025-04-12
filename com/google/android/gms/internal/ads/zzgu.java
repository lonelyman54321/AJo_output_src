/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzgt;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class zzgu
extends zzgv {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgu(Context context) {
        super(false);
        context = context.getAssets();
        this.zza = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(byte[] byArray, int n3, int n4) {
        IOException iOException2;
        block7: {
            int n7;
            block8: {
                if (n4 == 0) {
                    return 0;
                }
                long l2 = this.zzd;
                long l3 = 0L;
                int n8 = -1;
                Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (object == false) {
                    return n8;
                }
                l3 = -1;
                long l4 = l2 - l3;
                object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object != false) {
                    long l7 = n4;
                    try {
                        l2 = Math.min(l2, l7);
                        n4 = (int)l2;
                    }
                    catch (IOException iOException2) {
                        break block7;
                    }
                }
                InputStream inputStream = this.zzc;
                {
                    n7 = inputStream.read(byArray, n3, n4);
                    if (n7 == n8) {
                        return n8;
                    }
                    long l8 = this.zzd;
                    long l12 = l8 - l3;
                    Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 == false) break block8;
                }
                l2 = n7;
                this.zzd = l8 -= l2;
            }
            this.zzg(n7);
            return n7;
        }
        zzgt zzgt2 = new zzgt(iOException2, 2000);
        throw zzgt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh object) {
        IOException iOException2;
        int n3;
        Object object2;
        int n4;
        block11: {
            String string2;
            block10: {
                int n7;
                block9: {
                    n4 = 1;
                    try {
                        object2 = ((zzhh)object).zza;
                        this.zzb = object2;
                        object2 = object2.getPath();
                        n3 = 0;
                        if (object2 == null) throw null;
                        string2 = "/android_asset/";
                        n7 = ((String)object2).startsWith(string2);
                        if (n7 == 0) break block9;
                        n7 = 15;
                        object2 = ((String)object2).substring(n7);
                        break block10;
                    }
                    catch (IOException iOException2) {
                        break block11;
                    }
                    catch (zzgt zzgt2) {
                        throw zzgt2;
                    }
                }
                string2 = "/";
                n7 = (int)(((String)object2).startsWith(string2) ? 1 : 0);
                if (n7 != 0) {
                    object2 = ((String)object2).substring(n4);
                }
            }
            this.zzi((zzhh)object);
            string2 = this.zza;
            this.zzc = object2 = string2.open((String)object2, n4);
            long l2 = ((zzhh)object).zze;
            l2 = ((InputStream)object2).skip(l2);
            long l3 = ((zzhh)object).zze;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 >= 0) {
                long l7 = ((zzhh)object).zzf;
                l2 = -1;
                long l8 = l7 - l2;
                Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object3 != false) {
                    this.zzd = l7;
                } else {
                    object2 = this.zzc;
                    l4 = ((InputStream)object2).available();
                    this.zzd = l7 = (long)l4;
                    l3 = Integer.MAX_VALUE;
                    long l12 = l7 - l3;
                    Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object4 == false) {
                        this.zzd = l2;
                    }
                }
                this.zze = n4;
                this.zzj((zzhh)object);
                return this.zzd;
            }
            l4 = 2008;
            object = new zzgt(null, (int)l4);
            throw object;
        }
        n3 = iOException2 instanceof FileNotFoundException;
        n4 = n4 != n3 ? 2000 : 2005;
        object2 = new zzgt(iOException2, n4);
        throw object2;
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
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
            }
            catch (Throwable throwable2) {
                break block6;
            }
            catch (IOException iOException) {}
            bl2 = this.zze;
            if (!bl2) return;
            this.zze = false;
            this.zzh();
            return;
            {
                int n3 = 2000;
                zzgt zzgt2 = new zzgt(iOException, n3);
                throw zzgt2;
            }
        }
        this.zzc = null;
        bl2 = this.zze;
        if (!bl2) {
            throw throwable2;
        }
        this.zze = false;
        this.zzh();
        throw throwable2;
    }
}

