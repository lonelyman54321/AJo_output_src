/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzgx;
import com.google.android.gms.internal.ads.zzhh;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzgy
extends zzgv {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgy(Context context) {
        super(false);
        context = context.getContentResolver();
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
                long l2 = this.zze;
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
                FileInputStream fileInputStream = this.zzd;
                {
                    n7 = fileInputStream.read(byArray, n3, n4);
                    if (n7 == n8) {
                        return n8;
                    }
                    long l8 = this.zze;
                    long l12 = l8 - l3;
                    Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 == false) break block8;
                }
                l2 = n7;
                this.zze = l8 -= l2;
            }
            this.zzg(n7);
            return n7;
        }
        zzgx zzgx2 = new zzgx(iOException2, 2000);
        throw zzgx2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh zzhh2) {
        void var3_7;
        int n3;
        int n4;
        Object object;
        int n7;
        Object object2;
        Object object3;
        block23: {
            block24: {
                block27: {
                    long l2;
                    long l3;
                    zzgy zzgy2;
                    block26: {
                        long l4;
                        long l7;
                        block25: {
                            long l8;
                            long l12;
                            zzgy2 = this;
                            object3 = zzhh2;
                            object2 = "Could not open file descriptor for: ";
                            n7 = 1;
                            object = zzhh2.zza;
                            this.zzb = object = object.normalizeScheme();
                            this.zzi(zzhh2);
                            String string2 = "content";
                            String string3 = object.getScheme();
                            boolean bl2 = string2.equals(string3);
                            if (bl2) {
                                string2 = new Bundle();
                                string3 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT";
                                string2.putBoolean(string3, n7 != 0);
                                string3 = this.zza;
                                String string4 = "*/*";
                                string2 = string3.openTypedAssetFileDescriptor(object, string4, (Bundle)string2);
                            } else {
                                string2 = this.zza;
                                string3 = "r";
                                string2 = string2.openAssetFileDescriptor(object, string3);
                            }
                            zzgy2.zzc = string2;
                            if (string2 == null) break block23;
                            l7 = string2.getLength();
                            object = string2.getFileDescriptor();
                            zzgy2.zzd = object2 = new FileInputStream((FileDescriptor)object);
                            n4 = 2008;
                            l3 = -1;
                            long l14 = l7 - l3;
                            Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object4 != false && (l12 = (l8 = (l4 = ((zzhh)object3).zze) - l7) == 0L ? 0 : (l8 < 0L ? -1 : 1)) > 0) {
                                object3 = new zzgx(null, n4);
                                throw object3;
                            }
                            l4 = string2.getStartOffset();
                            l2 = ((zzhh)object3).zze + l4;
                            long l15 = (l2 = ((FileInputStream)object2).skip(l2) - l4) - (l4 = ((zzhh)object3).zze);
                            Object object5 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                            if (object5 != false) break block24;
                            l4 = 0L;
                            if (object4 != false) break block25;
                            l2 = ((FileChannel)(object2 = ((FileInputStream)object2).getChannel())).size();
                            long l16 = l2 - l4;
                            Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                            if (object6 == false) {
                                zzgy2.zze = l3;
                                l2 = l3;
                                break block26;
                            } else {
                                l7 = ((FileChannel)object2).position();
                                zzgy2.zze = l2 -= l7;
                                n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
                                if (n3 < 0) {
                                    object3 = new zzgx(null, n4);
                                    throw object3;
                                }
                            }
                            break block26;
                        }
                        l2 = l7 - l2;
                        zzgy2.zze = l2;
                        n3 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
                        if (n3 < 0) break block27;
                    }
                    long l17 = ((zzhh)object3).zzf;
                    n3 = (int)(l17 == l3 ? 0 : (l17 < l3 ? -1 : 1));
                    if (n3 != 0) {
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 != 0) {
                            l17 = Math.min(l2, l17);
                        }
                        zzgy2.zze = l17;
                    }
                    n3 = 1;
                    zzgy2.zzf = n3;
                    this.zzj(zzhh2);
                    long l18 = ((zzhh)object3).zzf;
                    long l19 = l18 == l3 ? 0 : (l18 < l3 ? -1 : 1);
                    if (l19 == false) return zzgy2.zze;
                    return l18;
                }
                try {
                    object3 = new zzgx(null, n4);
                    throw object3;
                }
                catch (IOException iOException) {
                    n3 = 2000;
                }
            }
            object3 = new zzgx(null, n4);
            throw object3;
        }
        String string5 = String.valueOf(object);
        object2 = ((String)object2).concat(string5);
        IOException iOException = new IOException((String)object2);
        n3 = 2000;
        try {
            object3 = new zzgx(iOException, n3);
            throw object3;
        }
        catch (IOException iOException2) {
            // empty catch block
        }
        n7 = var3_7 instanceof FileNotFoundException;
        n4 = 1;
        if (n4 == n7) {
            n3 = 2005;
        }
        iOException = new zzgx((IOException)var3_7, n3);
        throw iOException;
    }

    public final Uri zzc() {
        return this.zzb;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Throwable throwable322222;
        boolean bl2;
        block18: {
            Throwable throwable2222222;
            int n3;
            block17: {
                bl2 = false;
                this.zzb = null;
                n3 = 2000;
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                fileInputStream = this.zzc;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzc = null;
                bl2 = this.zzf;
                if (bl2) {
                    this.zzf = false;
                    this.zzh();
                }
                return;
                catch (Throwable throwable2222222) {
                    break block17;
                }
                catch (IOException iOException) {}
                {
                    zzgx zzgx2 = new zzgx(iOException, n3);
                    throw zzgx2;
                }
            }
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzc;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzc = null;
            }
            catch (Throwable throwable322222) {
                break block18;
            }
            bl2 = this.zzf;
            if (bl2) {
                this.zzf = false;
                this.zzh();
            }
            throw throwable2222222;
            catch (IOException iOException) {}
            {
                zzgx zzgx3 = new zzgx(iOException, n3);
                throw zzgx3;
            }
            catch (IOException iOException) {}
            {
                zzgx zzgx4 = new zzgx(iOException, n3);
                throw zzgx4;
            }
        }
        this.zzc = null;
        bl2 = this.zzf;
        if (bl2) {
            this.zzf = false;
            this.zzh();
        }
        throw throwable322222;
    }
}

