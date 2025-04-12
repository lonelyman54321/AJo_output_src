/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhc;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzib;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class zzic
extends zzgv {
    private final Context zza;
    private zzhh zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzic(Context context) {
        super(false);
        this.zza = context = context.getApplicationContext();
    }

    public static Uri buildRawResourceUri(int n3) {
        StringBuilder stringBuilder = new StringBuilder("rawresource:///");
        stringBuilder.append(n3);
        return Uri.parse((String)stringBuilder.toString());
    }

    private static int zzk(String object) {
        try {
            return Integer.parseInt((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            object = new zzib("Resource identifier must be an integer.", null, 1004);
            throw object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AssetFileDescriptor zzl(Context object, zzhh object2) {
        object2 = ((zzhh)object2).zza.normalizeScheme();
        Object object3 = object2.getScheme();
        String string3 = "rawresource";
        int n4 = TextUtils.equals((CharSequence)string3, (CharSequence)object3);
        int n7 = 1;
        int n3 = 2005;
        if (n4 != 0) {
            object = object.getResources();
            object3 = object2.getPathSegments();
            int n8 = object3.size();
            if (n8 != n7) {
                object2 = hj0_0.a(object3.size(), "rawresource:// URI must have exactly one path element, found ");
                object = new zzib((String)object2);
                throw object;
            }
            n7 = 0;
            string3 = null;
            object3 = (String)object3.get(0);
            n4 = zzic.zzk((String)object3);
        } else {
            String string2 = "android.resource";
            object3 = object2.getScheme();
            n4 = TextUtils.equals((CharSequence)string2, (CharSequence)object3);
            if (n4 == 0) {
                object2 = object2.getScheme();
                object2 = cP.a("Unsupported URI scheme (", (String)object2, "). Only android.resource is supported.");
                object = new zzib((String)object2, null, 1004);
                throw object;
            }
            object3 = object2.getPath();
            object3.getClass();
            string2 = "/";
            boolean bl2 = ((String)object3).startsWith(string2);
            if (bl2) {
                object3 = ((String)object3).substring(n7);
            }
            if (bl2 = (string3 = (n7 = (int)(TextUtils.isEmpty((CharSequence)(string3 = object2.getHost())) ? 1 : 0)) != 0 ? object.getPackageName() : object2.getHost()).equals(string2 = object.getPackageName())) {
                object = object.getResources();
            } else {
                try {
                    object = object.getPackageManager();
                    object = object.getResourcesForApplication(string3);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object2 = new zzib("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", nameNotFoundException, n3);
                    throw object2;
                }
            }
            string2 = "\\d+";
            bl2 = ((String)object3).matches(string2);
            if (bl2) {
                n4 = zzic.zzk((String)object3);
            } else {
                string2 = ":";
                n4 = object.getIdentifier((String)(object3 = n1.a(string3, string2, (String)object3)), string3 = "raw", null);
                if (n4 == 0) {
                    object = new zzib("Resource not found.", null, n3);
                    throw object;
                }
            }
        }
        try {
            object = object.openRawResourceFd(n4);
            if (object != null) {
                return object;
            }
        }
        catch (Resources.NotFoundException notFoundException) {
            object2 = new zzib(null, notFoundException, n3);
            throw object2;
        }
        object2 = String.valueOf(object2);
        object2 = "Resource is compressed: ".concat((String)object2);
        object = new zzib((String)object2, null, 2000);
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza(byte[] object, int n3, int n4) {
        IOException iOException2;
        int n7;
        block8: {
            int n8;
            long l2;
            long l3;
            block9: {
                if (n4 == 0) {
                    return 0;
                }
                l3 = this.zze;
                long l4 = 0L;
                int n10 = -1;
                Object object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object2 == false) {
                    return n10;
                }
                n7 = 2000;
                l2 = -1;
                long l7 = l3 - l2;
                Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object3 != false) {
                    long l8 = n4;
                    try {
                        l3 = Math.min(l3, l8);
                        n4 = (int)l3;
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                }
                InputStream inputStream = this.zzd;
                {
                    n8 = inputStream.read((byte[])object, n3, n4);
                    if (n8 != n10) break block9;
                }
                long l12 = this.zze;
                long l14 = l12 - l2;
                n4 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                if (n4 == 0) {
                    return n10;
                }
                object = new zzib;
                EOFException eOFException = new EOFException();
                object("End of stream reached having not read sufficient data.", eOFException, n7);
                throw object;
            }
            long l15 = this.zze;
            long l16 = l15 - l2;
            Object object4 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object4 != false) {
                l3 = n8;
                this.zze = l15 -= l3;
            }
            this.zzg(n8);
            return n8;
        }
        zzib zzib2 = new zzib(null, iOException2, n7);
        throw zzib2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(zzhh var1_1) {
        block14: {
            block15: {
                block16: {
                    this.zzb = var1_1;
                    this.zzi((zzhh)var1_1);
                    var2_4 = zzic.zzl(this.zza, (zzhh)var1_1);
                    this.zzc = var2_4;
                    var3_5 = var2_4.getLength();
                    var6_7 = this.zzc.getFileDescriptor();
                    var5_6 = new FileInputStream(var6_7);
                    this.zzd = var5_6;
                    var7_8 = 2008;
                    var8_9 = -1;
                    var10_10 /* !! */  = var3_5 == var8_9 ? 0 : (var3_5 < var8_9 ? -1 : 1);
                    if (var10_10 /* !! */  != false) {
                        try {
                            var11_11 = var1_1.zze;
                            var13_12 = var11_11 == var3_5 ? 0 : (var11_11 < var3_5 ? -1 : 1);
                            if (var13_12 > 0) {
                                var1_1 = new zzib(null, null, var7_8);
                                throw var1_1;
                            }
                        }
                        catch (IOException var1_2) {
                            break block14;
                        }
                        catch (zzib var1_3) {
                            throw var1_3;
                        }
                    }
                    var14_13 = this.zzc;
                    var11_11 = var14_13.getStartOffset();
                    var15_14 = var1_1.zze + var11_11;
                    cfr_temp_0 = (var15_14 = var5_6.skip(var15_14) - var11_11) - (var11_11 = var1_1.zze);
                    var17_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var17_15 /* !! */  != false) ** GOTO lbl70
                    var11_11 = 0L;
                    if (var10_10 /* !! */  != false) break block16;
                    var2_4 = var5_6.getChannel();
                    var18_16 = var2_4.size();
                    cfr_temp_1 = var18_16 - var11_11;
                    var10_10 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var10_10 /* !! */  == false) {
                        this.zze = var8_9;
                        var18_16 = var8_9;
                        break block15;
                    } else {
                        var18_16 = var2_4.size();
                        var15_14 = var2_4.position();
                        {
                            this.zze = var18_16 -= var15_14;
                            var20_17 /* !! */  = (long)(var18_16 == var11_11 ? 0 : (var18_16 < var11_11 ? -1 : 1));
                            if (var20_17 /* !! */  < 0) {
                                var1_1 = new zzib(null, null, var7_8);
                                throw var1_1;
                            }
                            break block15;
                        }
                    }
                }
                var18_16 = var3_5 - var15_14;
                {
                    this.zze = var18_16;
                    var20_17 /* !! */  = (long)(var18_16 == var11_11 ? 0 : (var18_16 < var11_11 ? -1 : 1));
                    if (var20_17 /* !! */  < 0) ** GOTO lbl-1000
                }
            }
            var21_18 = var1_1.zzf;
            var20_17 /* !! */  = var21_18 == var8_9 ? 0 : (var21_18 < var8_9 ? -1 : 1);
            if (var20_17 /* !! */  != false) {
                var20_17 /* !! */  = (long)(var18_16 == var8_9 ? 0 : (var18_16 < var8_9 ? -1 : 1));
                if (var20_17 /* !! */  != false) {
                    var21_18 = Math.min(var18_16, var21_18);
                }
                this.zze = var21_18;
            }
            var20_17 /* !! */  = 1;
            this.zzf = var20_17 /* !! */ ;
            this.zzj((zzhh)var1_1);
            var3_5 = var1_1.zzf;
            var23_19 = var3_5 == var8_9 ? 0 : (var3_5 < var8_9 ? -1 : 1);
            if (var23_19 == false) return this.zze;
            return var3_5;
lbl-1000:
            // 1 sources

            {
                var1_1 = new zzhc(var7_8);
                throw var1_1;
lbl70:
                // 1 sources

                var1_1 = new zzib(null, null, var7_8);
                throw var1_1;
            }
        }
        var2_4 = new zzib(null, var1_2, 2000);
        throw var2_4;
    }

    public final Uri zzc() {
        zzhh zzhh2 = this.zzb;
        if (zzhh2 != null) {
            return zzhh2.zza;
        }
        return null;
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
                InputStream inputStream = this.zzd;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzd = null;
                inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
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
                    zzib zzib2 = new zzib(null, iOException, n3);
                    throw zzib2;
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
                zzib zzib3 = new zzib(null, iOException, n3);
                throw zzib3;
            }
            catch (IOException iOException) {}
            {
                zzib zzib4 = new zzib(null, iOException, n3);
                throw zzib4;
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

