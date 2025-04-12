/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzcfp;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftv;
import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.ads.zzfue;
import com.google.android.gms.internal.ads.zzfup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Set;

public final class zzcfs
extends zzcfp {
    public static final /* synthetic */ int zzd;
    private static final Set zze;
    private static final DecimalFormat zzf;
    private File zzg;
    private boolean zzh;

    static {
        Cloneable cloneable = new Cloneable();
        zze = Collections.synchronizedSet(cloneable);
        cloneable = new Cloneable("#,###");
        zzf = cloneable;
    }

    public zzcfs(zzcee object) {
        super((zzcee)object);
        File file;
        object = this.zza.getCacheDir();
        if (object == null) {
            zzm.zzj("Context.getCacheDir() returned null");
            return;
        }
        zzftw zzftw2 = zzftu.zza();
        String string2 = "admobVideoStreams";
        object = zzftv.zza(zzftw2, (File)object, string2);
        this.zzg = file = new File((String)object);
        boolean bl2 = file.isDirectory();
        file = null;
        if (!bl2 && !(bl2 = ((File)(object = this.zzg)).mkdirs())) {
            object = String.valueOf(this.zzg.getAbsolutePath());
            zzm.zzj("Could not create preload cache directory at ".concat((String)object));
            this.zzg = null;
            return;
        }
        object = this.zzg;
        boolean bl3 = true;
        string2 = null;
        bl2 = ((File)object).setReadable(bl3, false);
        if (bl2 && (bl2 = ((File)(object = this.zzg)).setExecutable(bl3, false))) {
            return;
        }
        object = String.valueOf(this.zzg.getAbsolutePath());
        zzm.zzj("Could not set cache file permissions at ".concat((String)object));
        this.zzg = null;
    }

    private final File zza(File object) {
        zzftw zzftw2 = zzftu.zza();
        File file = this.zzg;
        object = String.valueOf(((File)object).getName()).concat(".done");
        object = zzftv.zza(zzftw2, file, (String)object);
        File file2 = new File((String)object);
        return file2;
    }

    public final void zzf() {
        this.zzh = true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzt(String var1_1) {
        block76: {
            block74: {
                block68: {
                    block80: {
                        block67: {
                            block66: {
                                block65: {
                                    block78: {
                                        block64: {
                                            var2_2 = this;
                                            var3_3 = var1_1;
                                            var4_4 = this.zzg;
                                            var5_27 = null;
                                            var6_28 = null;
                                            if (var4_4 == null) {
                                                var4_4 = "noCacheDir";
                                                var9_32 = false;
                                                var15_39 = null;
                                                this.zzg(var1_1, null, (String)var4_4, null);
                                                return false;
                                            }
                                            do {
                                                if ((var4_4 = var2_2.zzg) == null) {
                                                    var7_29 = 0;
                                                    var8_30 = null;
                                                } else {
                                                    var4_4 = var4_4.listFiles();
                                                    var9_31 = ((File[])var4_4).length;
                                                    var11_34 = null;
                                                    var7_29 = 0;
                                                    var8_30 = null;
                                                    for (var10_33 = 0; var10_33 < var9_31; ++var10_33) {
                                                        var12_35 = var4_4[var10_33].getName();
                                                        var14_37 = var12_35.endsWith((String)(var13_36 = ".done"));
                                                        if (var14_37 != 0) continue;
                                                        ++var7_29;
                                                    }
                                                }
                                                var4_4 = zzbep.zzu;
                                                var15_38 = zzba.zzc();
                                                var4_4 = (Integer)var15_38.zza((zzbeg)var4_4);
                                                var16_40 = var4_4.intValue();
                                                if (var7_29 <= var16_40) break block64;
                                                var4_4 = var2_2.zzg;
                                                if (var4_4 == null) break;
                                                var4_4 = var4_4.listFiles();
                                                var9_31 = ((Object)var4_4).length;
                                                var17_41 = 0x7FFFFFFFFFFFFFFFL;
                                                var19_42 = 0;
                                                var13_36 = null;
                                                var12_35 = null;
                                                for (var14_37 = 0; var14_37 < var9_31; ++var14_37) {
                                                    var20_43 = var4_4[var14_37];
                                                    var21_44 = var20_43.getName();
                                                    var23_46 = var21_44.endsWith((String)(var22_45 = ".done"));
                                                    if (var23_46 != 0 || (var23_46 = (cfr_temp_0 = (var24_47 = var20_43.lastModified()) - var17_41) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0) continue;
                                                    var13_36 = var20_43;
                                                    var17_41 = var24_47;
                                                }
                                                if (var13_36 != null) {
                                                    var16_40 = (int)var13_36.delete();
                                                    var15_38 = var2_2.zza((File)var13_36);
                                                    var10_33 = (int)var15_38.isFile();
                                                    if (var10_33 == 0) continue;
                                                    var9_31 = (int)var15_38.delete();
                                                    var16_40 &= var9_31;
                                                    continue;
                                                }
                                                var16_40 = 0;
                                                var4_4 = null;
                                            } while (var16_40 != 0);
                                            zzm.zzj("Unable to expire stream cache");
                                            var2_2.zzg(var3_3, null, "expireFailed", null);
                                            return false;
                                        }
                                        var4_4 = com.google.android.gms.ads.internal.util.client.zzf.zzf(var1_1);
                                        var15_38 = zzftu.zza();
                                        var11_34 = var2_2.zzg;
                                        var4_4 = zzftv.zza((zzftw)var15_38, (File)var11_34, (String)var4_4);
                                        var22_45 = new File((String)var4_4);
                                        var4_4 = var2_2.zza((File)var22_45);
                                        var9_31 = (int)var22_45.isFile();
                                        var26_48 = 1;
                                        if (var9_31 != 0 && (var9_31 = (int)var4_4.isFile()) != 0) {
                                            var9_31 = (int)var22_45.length();
                                            var4_4 = String.valueOf(var1_1);
                                            zzm.zze("Stream cache hit at ".concat((String)var4_4));
                                            var4_4 = var22_45.getAbsolutePath();
                                            var2_2.zzh(var3_3, (String)var4_4, var9_31);
                                            return (boolean)var26_48;
                                        }
                                        var15_38 = String.valueOf(var2_2.zzg.getAbsolutePath());
                                        var11_34 = String.valueOf(var1_1);
                                        var8_30 = zzcfs.zze;
                                        var27_49 = var15_38.concat((String)var11_34);
                                        synchronized (var8_30) {
                                            var9_31 = (int)var8_30.contains(var27_49);
                                            if (var9_31 != 0) {
                                                var4_4 = new StringBuilder();
                                                var15_38 = "Stream cache already in progress at ";
                                                var4_4.append((String)var15_38);
                                                var4_4.append(var3_3);
                                                var4_4 = var4_4.toString();
                                                zzm.zzj((String)var4_4);
                                                var4_4 = var22_45.getAbsolutePath();
                                                var15_38 = "inProgress";
                                                var2_2.zzg(var3_3, (String)var4_4, (String)var15_38, null);
                                                return false;
                                            }
                                            var8_30.add(var27_49);
                                            // MONITOREXIT @DISABLED, blocks:[0, 22] lbl101 : MonitorExitStatement: MONITOREXIT : var8_30
                                            var28_50 = "error";
                                        }
                                        var15_38 = zzfue.zza();
                                        var11_34 = new zzcfr(var3_3);
                                        var14_37 = 265;
                                        var19_42 = -1;
                                        var15_38 = var15_38.zzn((zzfup)var11_34, var14_37, var19_42);
                                        var10_33 = var15_38 instanceof HttpURLConnection;
                                        if (var10_33 == 0) break block65;
                                        var10_33 = ((HttpURLConnection)var15_38).getResponseCode();
                                        var14_37 = 400;
                                        if (var10_33 < var14_37) break block65;
                                        var28_50 = "badUrl";
                                        var4_4 = Integer.toString(var10_33);
                                        var15_38 = new StringBuilder();
                                        var8_30 = "HTTP request failed. Code: ";
                                        var15_38.append((String)var8_30);
                                        var15_38.append((String)var4_4);
                                        var15_38 = var15_38.toString();
                                        try {
                                            var8_30 = new StringBuilder();
                                            var12_35 = "HTTP status code ";
                                            var8_30.append((String)var12_35);
                                            var8_30.append(var10_33);
                                            var11_34 = " at ";
                                            var8_30.append((String)var11_34);
                                            var8_30.append(var3_3);
                                            var11_34 = var8_30.toString();
                                            var4_4 = new IOException((String)var11_34);
                                            throw var4_4;
                                        }
                                        catch (RuntimeException var4_6) {
                                        }
                                        catch (IOException var4_7) {
                                            // empty catch block
                                        }
                                        var11_34 = var15_38;
                                        break block78;
                                        catch (RuntimeException var4_9) {
                                        }
                                        catch (IOException var4_10) {
                                            // empty catch block
                                        }
                                        var10_33 = 0;
                                        var11_34 = null;
                                    }
                                    var15_38 = var27_49;
                                    break block76;
                                }
                                try {
                                    var23_46 = ((URLConnection)var15_38).getContentLength();
                                    if (var23_46 < 0) {
                                        var4_4 = new StringBuilder();
                                        var15_38 = "Stream cache aborted, missing content-length header at ";
                                        var4_4.append((String)var15_38);
                                        var4_4.append(var3_3);
                                        var4_4 = var4_4.toString();
                                        zzm.zzj((String)var4_4);
                                        var4_4 = var22_45.getAbsolutePath();
                                        var15_38 = "contentLengthMissing";
                                        var2_2.zzg(var3_3, (String)var4_4, (String)var15_38, null);
                                        var8_30.remove(var27_49);
                                        return false;
                                    }
                                }
                                catch (RuntimeException var4_11) {}
                                ** GOTO lbl-1000
                                catch (IOException var4_12) {}
lbl-1000:
                                // 2 sources

                                {
                                    var15_38 = var27_49;
                                    var29_51 = var28_50;
                                    break block66;
                                }
                                var11_34 = zzcfs.zzf;
                                var30_53 = var23_46;
                                var11_34 = var11_34.format(var30_53);
                                var12_35 = zzbep.zzv;
                                var13_36 = zzba.zzc();
                                var12_35 = var13_36.zza((zzbeg)var12_35);
                                var32_54 = (var12_35 = (Integer)var12_35).intValue();
                                if (var23_46 > var32_54) {
                                    var4_4 = new StringBuilder();
                                    var15_38 = "Content length ";
                                    var4_4.append((String)var15_38);
                                    var4_4.append((String)var11_34);
                                    var15_38 = " exceeds limit at ";
                                    var4_4.append((String)var15_38);
                                    var4_4.append(var3_3);
                                    var4_4 = var4_4.toString();
                                    zzm.zzj((String)var4_4);
                                    var4_4 = new StringBuilder();
                                    var15_38 = "File too big for full file cache. Size: ";
                                    var4_4.append((String)var15_38);
                                    var4_4.append((String)var11_34);
                                    var4_4 = var4_4.toString();
                                    var15_38 = var22_45.getAbsolutePath();
                                    var11_34 = "sizeExceeded";
                                    var2_2.zzg(var3_3, (String)var15_38, (String)var11_34, (String)var4_4);
                                    var8_30.remove(var27_49);
                                    return false;
                                }
                                var8_30 = new StringBuilder();
                                var12_35 = "Caching ";
                                var8_30.append((String)var12_35);
                                var8_30.append((String)var11_34);
                                var11_34 = " bytes from ";
                                var8_30.append((String)var11_34);
                                var8_30.append(var3_3);
                                var11_34 = var8_30.toString();
                                zzm.zze((String)var11_34);
                                var15_38 = ((URLConnection)var15_38).getInputStream();
                                var13_36 = Channels.newChannel((InputStream)var15_38);
                                var12_35 = new FileOutputStream((File)var22_45);
                                try {
                                    var8_30 = var12_35.getChannel();
                                    var9_31 = 0x100000;
                                    var11_34 = ByteBuffer.allocate(var9_31);
                                    var33_55 = zzu.zzB();
                                    var34_56 = var33_55.currentTimeMillis();
                                    var15_38 = zzbep.zzy;
                                    var6_28 = zzba.zzc();
                                    var15_38 = var6_28.zza((zzbeg)var15_38);
                                    var15_38 = (Long)var15_38;
                                    var36_57 = var15_38.longValue();
                                    var15_38 = new zzcb(var36_57);
                                    var5_27 = zzbep.zzx;
                                    var6_28 = zzba.zzc();
                                    var5_27 = var6_28.zza((zzbeg)var5_27);
                                    var5_27 = (Long)var5_27;
                                    var36_57 = var5_27.longValue();
                                    var26_48 = 0;
                                    break block67;
                                }
                                catch (RuntimeException var4_25) {}
                                ** GOTO lbl-1000
                                catch (IOException var4_26) {}
lbl-1000:
                                // 2 sources

                                {
                                    var49_67 = var12_35;
                                    var15_38 = var27_49;
                                    var29_52 = var28_50;
                                    break block68;
                                }
                            }
                            var10_33 = 0;
                            var11_34 = null;
                            var6_28 = null;
                            break block76;
                            {
                                catch (Throwable var4_5) {}
                                throw var4_5;
                            }
                        }
                        while ((var38_58 = var13_36.read((ByteBuffer)var11_34)) >= 0) {
                            block72: {
                                block79: {
                                    block69: {
                                        block71: {
                                            block70: {
                                                if ((var26_48 += var38_58) > var32_54) break block79;
                                                var11_34.flip();
                                                while ((var38_58 = var8_30.write((ByteBuffer)var11_34)) > 0) {
                                                }
                                                var11_34.clear();
                                                var39_59 = var33_55.currentTimeMillis() - var34_56;
                                                var41_60 = 1000L * var36_57;
                                                var43_61 = var39_59 == var41_60 ? 0 : (var39_59 < var41_60 ? -1 : 1);
                                                if (var43_61 > 0) ** GOTO lbl342
                                                var44_62 = var11_34;
                                                var10_33 = var2_2.zzh;
                                                if (var10_33 != 0) break block69;
                                                var10_33 = var15_38.zzb();
                                                if (var10_33 == 0) break block70;
                                                var45_63 = var22_45.getAbsolutePath();
                                                var11_34 = com.google.android.gms.ads.internal.util.client.zzf.zza;
                                                var29_52 = var28_50;
                                                var46_64 = var15_38;
                                                var15_38 = var28_50;
                                                var47_65 = var27_49;
                                                var27_49 = var11_34;
                                                var11_34 = this;
                                                var48_66 = var8_30;
                                                var8_30 = var1_1;
                                                var49_67 = var12_35;
                                                var12_35 = var45_63;
                                                var45_63 = var13_36;
                                                var19_42 = var26_48;
                                                var50_68 = var32_54;
                                                var32_54 = var23_46;
                                                var51_69 = var23_46;
                                                var23_46 = 0;
                                                var21_44 = null;
                                                var28_50 = new zzcfj(this, var1_1, (String)var12_35, var26_48, var32_54, false);
                                                var27_49.post((Runnable)var28_50);
                                                break block71;
                                                catch (RuntimeException var4_17) {}
                                                ** GOTO lbl-1000
                                                catch (IOException var4_18) {}
lbl-1000:
                                                // 2 sources

                                                {
                                                    var49_67 = var12_35;
                                                    var47_65 = var27_49;
                                                    var29_52 = var28_50;
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                            var46_64 = var15_38;
                                            var48_66 = var8_30;
                                            var49_67 = var12_35;
                                            var45_63 = var13_36;
                                            var50_68 = var32_54;
                                            var51_69 = var23_46;
                                            var47_65 = var27_49;
                                            var29_52 = var28_50;
                                        }
                                        var11_34 = var44_62;
                                        var13_36 = var45_63;
                                        var28_50 = var29_52;
                                        var15_38 = var46_64;
                                        var27_49 = var47_65;
                                        var8_30 = var48_66;
                                        var12_35 = var49_67;
                                        var32_54 = var50_68;
                                        var23_46 = var51_69;
                                        continue;
                                    }
                                    var49_67 = var12_35;
                                    var47_65 = var27_49;
                                    var29_52 = var28_50;
                                    var28_50 = "externalAbort";
                                    var15_38 = "abort requested";
                                    var4_4 = new IOException((String)var15_38);
                                    throw var4_4;
lbl342:
                                    // 1 sources

                                    var49_67 = var12_35;
                                    var47_65 = var27_49;
                                    var29_52 = var28_50;
                                    var28_50 = "downloadTimeout";
                                    var4_4 = Long.toString(var36_57);
                                    var15_38 = new StringBuilder();
                                    var11_34 = "Timeout exceeded. Limit: ";
                                    var15_38.append((String)var11_34);
                                    var15_38.append((String)var4_4);
                                    var4_4 = " sec";
                                    var15_38.append((String)var4_4);
                                    var6_28 = var15_38.toString();
                                    var15_38 = "stream cache time limit exceeded";
                                    var4_4 = new IOException((String)var15_38);
                                    throw var4_4;
                                }
                                var49_67 = var12_35;
                                var47_65 = var27_49;
                                var29_52 = var28_50;
                                var28_50 = "sizeExceeded";
                                try {
                                    var4_4 = Integer.toString(var26_48);
                                    var15_38 = new StringBuilder();
                                    var11_34 = "File too big for full file cache. Size: ";
                                    var15_38.append((String)var11_34);
                                    var15_38.append((String)var4_4);
                                    var6_28 = var15_38.toString();
                                    break block72;
                                }
                                catch (RuntimeException var4_19) {
                                }
                                catch (IOException var4_20) {
                                    // empty catch block
                                }
                                var15_38 = var47_65;
                                break block74;
                            }
                            try {
                                var15_38 = "stream cache file size limit exceeded";
                                var4_4 = new IOException((String)var15_38);
                                throw var4_4;
                            }
                            catch (RuntimeException var4_21) {
                            }
                            catch (IOException var4_22) {
                                // empty catch block
                            }
                            var11_34 = var6_28;
                            var15_38 = var47_65;
                            var6_28 = var49_67;
                            break block76;
                        }
                        var49_67 = var12_35;
                        var47_65 = var27_49;
                        var29_52 = var28_50;
                        try {
                            ** try [egrp 16[TRYBLOCK] [244 : 1959->2107)] { 
lbl402:
                            // 1 sources

                        }
                        catch (RuntimeException var4_13) {}
                        ** GOTO lbl-1000
lbl405:
                        // 2 sources

                        catch (IOException var4_14) {}
lbl-1000:
                        // 3 sources

                        {
                            var15_38 = var47_65;
                            break block68;
                        }
                        var12_35.close();
                        var9_31 = 3;
                        var9_31 = (int)zzm.zzm(var9_31);
                        if (var9_31 != 0) {
                            var15_38 = zzcfs.zzf;
                            var17_41 = var26_48;
                            var15_38 = var15_38.format(var17_41);
                            var11_34 = new StringBuilder();
                            var8_30 = "Preloaded ";
                            var11_34.append((String)var8_30);
                            var11_34.append((String)var15_38);
                            var15_38 = " bytes from ";
                            var11_34.append((String)var15_38);
                            var11_34.append(var3_3);
                            var15_38 = var11_34.toString();
                            zzm.zze((String)var15_38);
                        }
                        var9_31 = 0;
                        var15_38 = null;
                        var10_33 = 1;
                        var22_45.setReadable((boolean)var10_33, false);
                        var9_31 = var4_4.isFile();
                        if (var9_31 == 0) break block80;
                        var52_70 = System.currentTimeMillis();
                        var4_4.setLastModified(var52_70);
                        ** GOTO lbl-1000
                    }
                    try {
                        var4_4.createNewFile();
                    }
                    catch (IOException v0) {}
lbl-1000:
                    // 3 sources

                    {
                        var4_4 = var22_45.getAbsolutePath();
                        var2_2.zzh(var3_3, (String)var4_4, var26_48);
                        var4_4 = zzcfs.zze;
                        var15_38 = var47_65;
                    }
                    try {
                        var4_4.remove(var47_65);
                        return true;
                    }
                    catch (RuntimeException var4_23) {
                    }
                    catch (IOException var4_24) {}
                }
                var28_50 = var29_52;
            }
            var6_28 = var49_67;
            var10_33 = 0;
            var11_34 = null;
        }
        var7_29 = var4_8 instanceof RuntimeException;
        if (var7_29 != 0) {
            var8_30 = "VideoStreamFullFileCache.preload";
            var12_35 = zzu.zzo();
            var12_35.zzw((Throwable)var4_8, (String)var8_30);
        }
        try {
            var6_28.close();
        }
        catch (IOException | NullPointerException v1) {}
        var7_29 = (int)var2_2.zzh;
        if (var7_29 != 0) {
            var4_8 = new StringBuilder("Preload aborted for URL \"");
            var4_8.append(var3_3);
            var8_30 = "\"";
            var4_8.append((String)var8_30);
            var4_8 = var4_8.toString();
            zzm.zzi((String)var4_8);
        } else {
            var8_30 = new StringBuilder("Preload failed for URL \"");
            var8_30.append(var3_3);
            var12_35 = "\"";
            var8_30.append((String)var12_35);
            var8_30 = var8_30.toString();
            zzm.zzk((String)var8_30, (Throwable)var4_8);
        }
        var16_40 = (int)var22_45.exists();
        if (var16_40 != 0 && (var16_40 = (int)var22_45.delete()) == 0) {
            var4_8 = String.valueOf(var22_45.getAbsolutePath());
            var8_30 = "Could not delete partial cache file at ";
            var4_8 = var8_30.concat((String)var4_8);
            zzm.zzj((String)var4_8);
        }
        var4_8 = var22_45.getAbsolutePath();
        var2_2.zzg(var3_3, (String)var4_8, (String)var28_50, (String)var11_34);
        var4_8 = zzcfs.zze;
        var4_8.remove(var15_38);
        return false;
    }
}

