/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zziy;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zztr;
import com.google.android.gms.internal.ads.zzuj;

public final class zztp {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zztp(String string2, String string3, String string4, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        boolean bl8;
        string2.getClass();
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = codecCapabilities;
        this.zzg = bl2;
        this.zze = bl5;
        this.zzf = bl7;
        this.zzh = bl8 = zzcg.zzh(string3);
    }

    /*
     * Unable to fully structure code
     */
    public static zztp zzc(String var0, String var1_1, String var2_2, MediaCodecInfo.CodecCapabilities var3_3, boolean var4_4, boolean var5_5, boolean var6_6, boolean var7_7, boolean var8_8) {
        var9_9 = var3_3;
        if (var3_3 == null || (var12_12 = var3_3.isFeatureSupported(var11_11 = "adaptive-playback")) == 0) ** GOTO lbl10
        var12_12 = zzgd.zza;
        var13_13 = 22;
        if (var12_12 > var13_13 || (var13_13 = (int)(var14_14 = "ODROID-XU3").equals(var11_11 = zzgd.zzd)) == 0 && (var12_12 = (int)(var14_14 = "Nexus 10").equals(var11_11)) == 0) {
            while (true) {
                var15_15 = true;
                break;
            }
        } else {
            if ((var12_12 = (int)(var11_11 = "OMX.Exynos.AVC.Decoder").equals(var0)) == 0 && (var12_12 = (int)(var11_11 = "OMX.Exynos.AVC.Decoder.secure").equals(var0)) == 0) ** continue;
lbl10:
            // 2 sources

            var15_15 = false;
        }
        if (var9_9 == null) ** GOTO lbl-1000
        var12_12 = zzgd.zza;
        var11_11 = "tunneled-playback";
        var12_12 = (int)var3_3.isFeatureSupported(var11_11);
        if (var12_12 != 0) {
            var16_16 = true;
        } else lbl-1000:
        // 2 sources

        {
            var16_16 = false;
        }
        if (var8_8) ** GOTO lbl-1000
        if (var9_9 != null) {
            var12_12 = zzgd.zza;
            var11_11 = "secure-playback";
            var12_12 = (int)var3_3.isFeatureSupported(var11_11);
            ** if (var12_12 == 0) goto lbl-1000
        }
        ** GOTO lbl-1000
lbl-1000:
        // 2 sources

        {
            var17_17 = true;
            ** GOTO lbl29
        }
lbl-1000:
        // 2 sources

        {
            var17_17 = false;
        }
lbl29:
        // 2 sources

        var11_11 = var2_2;
        var9_9 = var3_3;
        var13_13 = (int)var4_4;
        var10_10 = new zztp(var0, var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var15_15, var16_16, var17_17);
        return var10_10;
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int n3, int n4) {
        int n7 = videoCapabilities.getWidthAlignment();
        int n8 = videoCapabilities.getHeightAlignment();
        n3 = (n3 + n7 + -1) / n7 * n7;
        n4 = (n4 + n8 + -1) / n8 * n8;
        Point point = new Point(n3, n4);
        return point;
    }

    private final void zzj(String charSequence) {
        String string2 = zzgd.zze;
        String string3 = "] [";
        charSequence = Gn.a("NoSupport [", (String)charSequence, string3);
        String string4 = this.zza;
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", ");
        string4 = this.zzb;
        charSequence = ko_0.a((StringBuilder)charSequence, string4, string3, string2, "]");
        zzfk.zzb("MediaCodecInfo", (String)charSequence);
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int n3, int n4, double d2) {
        double d5;
        Point point = zztp.zzi(videoCapabilities, n3, n4);
        n4 = point.x;
        n3 = point.y;
        double d7 = -1.0;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object != false && (object = (d5 = d2 - (d7 = 1.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) >= 0) {
            d2 = Math.floor(d2);
            return videoCapabilities.areSizeAndRateSupported(n4, n3, d2);
        }
        return videoCapabilities.isSizeSupported(n4, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean zzl(zzan object, boolean bl2) {
        String string2;
        String string3;
        Object object2 = zzuj.zza((zzan)object);
        int n3 = 1;
        if (object2 == null) return n3 != 0;
        Integer n4 = (Integer)((Pair)object2).first;
        int n7 = n4;
        object2 = (Integer)((Pair)object2).second;
        int n8 = (Integer)object2;
        Object object3 = ((zzan)object).zzn;
        int n10 = "video/dolby-vision".equals(object3);
        String string4 = "video/hevc";
        int n14 = 8;
        int n15 = 2;
        if (n10 != 0) {
            string3 = "video/avc";
            object3 = this.zzb;
            n10 = (int)(string3.equals(object3) ? 1 : 0);
            if (n10 != 0) {
                n8 = 0;
                object2 = null;
                n7 = 8;
            } else {
                object3 = this.zzb;
                n10 = (int)(string4.equals(object3) ? 1 : 0);
                if (n10 != 0) {
                    n8 = 0;
                    object2 = null;
                    n7 = 2;
                }
            }
        }
        if ((n10 = this.zzh) == 0) {
            n10 = 42;
            if (n7 != n10) return n3 != 0;
            n7 = 42;
        }
        object3 = this.zzh();
        int n16 = zzgd.zza;
        int n17 = 23;
        if (n16 <= n17 && (n16 = (int)((string2 = "video/x-vnd.on2.vp9").equals(string3 = this.zzb) ? 1 : 0)) != 0 && (n16 = ((MediaCodecInfo.CodecProfileLevel[])object3).length) == 0) {
            object3 = this.zzd;
            if (object3 != null && (object3 = object3.getVideoCapabilities()) != null) {
                object3 = (Integer)object3.getBitrateRange().getUpper();
                n10 = (Integer)object3;
            } else {
                n10 = 0;
                object3 = null;
            }
            n16 = 180000000;
            if (n10 >= n16) {
                n14 = 1024;
            } else {
                n16 = 120000000;
                if (n10 >= n16) {
                    n14 = 512;
                } else {
                    n16 = 60000000;
                    if (n10 >= n16) {
                        n14 = 256;
                    } else {
                        n16 = 30000000;
                        if (n10 >= n16) {
                            n14 = 128;
                        } else {
                            n16 = 18000000;
                            if (n10 >= n16) {
                                n14 = 64;
                            } else {
                                n16 = 12000000;
                                if (n10 >= n16) {
                                    n14 = 32;
                                } else {
                                    n16 = 0x6DDD00;
                                    if (n10 >= n16) {
                                        n14 = 16;
                                    } else {
                                        n16 = 3600000;
                                        if (n10 < n16) {
                                            n14 = 1800000;
                                            n14 = n10 >= n14 ? 4 : (n10 >= (n14 = 800000) ? 2 : 1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            object3 = new MediaCodecInfo.CodecProfileLevel();
            ((MediaCodecInfo.CodecProfileLevel)object3).profile = n3;
            ((MediaCodecInfo.CodecProfileLevel)object3).level = n14;
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray = new MediaCodecInfo.CodecProfileLevel[n3];
            codecProfileLevelArray[0] = object3;
            object3 = codecProfileLevelArray;
        }
        n14 = ((MediaCodecInfo.CodecProfileLevel[])object3).length;
        string3 = null;
        for (n16 = 0; n16 < n14; ++n16) {
            String string5;
            string2 = object3[n16];
            int n18 = ((MediaCodecInfo.CodecProfileLevel)string2).profile;
            if (n18 != n7 || (n17 = ((MediaCodecInfo.CodecProfileLevel)string2).level) < n8 && bl2 || (n17 = (int)(string4.equals(string2 = this.zzb) ? 1 : 0)) != 0 && n7 == n15 && ((n18 = (int)((string5 = "sailfish").equals(string2 = zzgd.zzb) ? 1 : 0)) != 0 || (n17 = (int)((string5 = "marlin").equals(string2) ? 1 : 0)) != 0)) continue;
            return n3 != 0;
        }
        object = ((zzan)object).zzk;
        String string6 = this.zzc;
        object = UX.c("codec.profileLevel, ", (String)object, ", ", string6);
        this.zzj((String)object);
        return false;
    }

    private final boolean zzm(zzan object) {
        boolean bl2;
        String string2 = this.zzb;
        String string3 = ((zzan)object).zzn;
        boolean bl3 = string2.equals(string3);
        return bl3 || (bl2 = (string2 = this.zzb).equals(object = zzuj.zzc((zzan)object)));
        {
        }
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int n3, int n4) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities != null && (codecCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return zztp.zzi((MediaCodecInfo.VideoCapabilities)codecCapabilities, n3, n4);
        }
        return null;
    }

    public final zziy zzb(zzan zzan2, zzan zzan3) {
        int n3 = 1;
        Object object = zzan2.zzn;
        Object object2 = zzan3.zzn;
        int n4 = zzgd.zzG(object, object2);
        if (n3 != n4) {
            n4 = 8;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = this.zzh;
        if (n7 != 0) {
            Object object3;
            Object object4;
            n7 = zzan2.zzv;
            int n8 = zzan3.zzv;
            if (n7 != n8) {
                n4 |= 0x400;
            }
            if ((n7 = (int)(this.zze ? 1 : 0)) == 0 && ((n7 = zzan2.zzs) != (n8 = zzan3.zzs) || (n7 = zzan2.zzt) != (n8 = zzan3.zzt))) {
                n4 |= 0x200;
            }
            if (((n7 = (int)(zzt.zzg((zzt)(object4 = zzan2.zzz)) ? 1 : 0)) == 0 || (n7 = (int)(zzt.zzg((zzt)(object4 = zzan3.zzz)) ? 1 : 0)) == 0) && (n7 = (int)(zzgd.zzG(object4 = zzan2.zzz, object3 = zzan3.zzz) ? 1 : 0)) == 0) {
                n4 |= 0x800;
            }
            object4 = this.zza;
            object3 = zzgd.zzd;
            Object object5 = "SM-T230";
            n8 = (int)(((String)object3).startsWith((String)object5) ? 1 : 0);
            if (n8 != 0 && (n7 = (int)(((String)(object3 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER")).equals(object4) ? 1 : 0)) != 0 && (n7 = (int)(zzan2.zzd(zzan3) ? 1 : 0)) == 0) {
                n4 |= 2;
            }
            if (n4 == 0) {
                int n10;
                object3 = this.zza;
                n7 = (int)(zzan2.zzd(zzan3) ? 1 : 0);
                if (n3 != n7) {
                    n3 = 2;
                    n10 = 2;
                } else {
                    n3 = 3;
                    n10 = 3;
                }
                object4 = object;
                object5 = zzan2;
                zzan zzan4 = zzan3;
                object = new zziy((String)object3, zzan2, zzan3, n10, 0);
                return object;
            }
        } else {
            Object object6;
            n3 = zzan2.zzA;
            n7 = zzan3.zzA;
            if (n3 != n7) {
                n4 |= 0x1000;
            }
            if ((n3 = zzan2.zzB) != (n7 = zzan3.zzB)) {
                n4 |= 0x2000;
            }
            if ((n3 = zzan2.zzC) != (n7 = zzan3.zzC)) {
                n4 |= 0x4000;
            }
            if (n4 == 0 && (n3 = (int)(((String)(object6 = "audio/mp4a-latm")).equals(object2 = this.zzb) ? 1 : 0)) != 0) {
                object2 = zzuj.zza(zzan2);
                object6 = zzuj.zza(zzan3);
                if (object2 != null && object6 != null) {
                    object2 = (Integer)((Pair)object2).first;
                    n3 = (Integer)object2;
                    object6 = (Integer)((Pair)object6).first;
                    n7 = (Integer)object6;
                    int n14 = 42;
                    if (n3 == n14 && n7 == n14) {
                        String string2 = this.zza;
                        Object object7 = object;
                        object = new zziy(string2, zzan2, zzan3, 3, 0);
                        return object;
                    }
                }
            }
            if ((n3 = (int)(zzan2.zzd(zzan3) ? 1 : 0)) == 0) {
                n4 |= 0x20;
            }
            if ((n3 = (int)(((String)(object6 = "audio/opus")).equals(object2 = this.zzb) ? 1 : 0)) != 0) {
                n4 |= 2;
            }
            if (n4 == 0) {
                object6 = this.zza;
                object2 = object;
                zzan zzan5 = zzan2;
                zzan zzan6 = zzan3;
                object = new zziy((String)object6, zzan2, zzan3, 1, 0);
                return object;
            }
        }
        String string3 = this.zza;
        object = new zziy(string3, zzan2, zzan3, 0, n4);
        return object;
    }

    public final boolean zzd(zzan zzan2) {
        boolean bl2;
        boolean bl3 = this.zzm(zzan2);
        return bl3 && (bl2 = this.zzl(zzan2, false));
    }

    public final boolean zze(zzan object) {
        int n3;
        block10: {
            block12: {
                block14: {
                    String string2;
                    int n4;
                    int n7;
                    Object object2;
                    int n8;
                    int n10;
                    Object object3;
                    int n14;
                    int n15;
                    block15: {
                        block13: {
                            int n16;
                            block8: {
                                block11: {
                                    block9: {
                                        n15 = this.zzm((zzan)object);
                                        n3 = 0;
                                        if (n15 == 0) {
                                            return false;
                                        }
                                        n15 = 1;
                                        n14 = this.zzl((zzan)object, n15 != 0);
                                        if (n14 == 0) {
                                            return false;
                                        }
                                        n14 = this.zzh;
                                        if (n14 != 0) {
                                            n3 = ((zzan)object).zzs;
                                            if (n3 > 0 && (n14 = ((zzan)object).zzt) > 0) {
                                                n15 = zzgd.zza;
                                                double d2 = ((zzan)object).zzu;
                                                return this.zzg(n3, n14, d2);
                                            }
                                            return n15 != 0;
                                        }
                                        n14 = zzgd.zza;
                                        n14 = ((zzan)object).zzB;
                                        n16 = -1;
                                        if (n14 == n16) break block8;
                                        object3 = this.zzd;
                                        if (object3 != null) break block9;
                                        object = "sampleRate.caps";
                                        this.zzj((String)object);
                                        break block10;
                                    }
                                    if ((object3 = object3.getAudioCapabilities()) != null) break block11;
                                    object = "sampleRate.aCaps";
                                    this.zzj((String)object);
                                    break block10;
                                }
                                n10 = object3.isSampleRateSupported(n14);
                                if (n10 != 0) break block8;
                                object = hj0_0.a(n14, "sampleRate.support, ");
                                this.zzj((String)object);
                                break block10;
                            }
                            if ((n8 = ((zzan)object).zzA) == n16) break block12;
                            object2 = this.zzd;
                            if (object2 != null) break block13;
                            object = "channelCount.caps";
                            this.zzj((String)object);
                            break block14;
                        }
                        if ((object2 = object2.getAudioCapabilities()) != null) break block15;
                        object = "channelCount.aCaps";
                        this.zzj((String)object);
                        break block14;
                    }
                    String string3 = this.zza;
                    object3 = this.zzb;
                    n14 = object2.getMaxInputChannelCount();
                    if (n14 <= n15 && ((n7 = zzgd.zza) < (n4 = 26) || n14 <= 0) && (n7 = (int)((string2 = "audio/mpeg").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/3gpp").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/amr-wb").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/mp4a-latm").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/vorbis").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/opus").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/raw").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/flac").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/g711-alaw").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/g711-mlaw").equals(object3) ? 1 : 0)) == 0 && (n7 = (int)((string2 = "audio/gsm").equals(object3) ? 1 : 0)) == 0) {
                        string2 = "audio/ac3";
                        n7 = (int)(string2.equals(object3) ? 1 : 0);
                        n10 = n7 != 0 ? 6 : ((n10 = (int)((string2 = "audio/eac3").equals(object3) ? 1 : 0)) != 0 ? 16 : 30);
                        string2 = "AssumedMaxChannelAdjustment: ";
                        String string4 = ", [";
                        String string5 = " to ";
                        object2 = oe3_0.a(n14, string2, string3, string4, string5);
                        ((StringBuilder)object2).append(n10);
                        ((StringBuilder)object2).append("]");
                        object2 = ((StringBuilder)object2).toString();
                        string3 = "MediaCodecInfo";
                        zzfk.zzf(string3, (String)object2);
                        n14 = n10;
                    }
                    if (n14 >= n8) break block12;
                    String string6 = "channelCount.support, ";
                    object = hj0_0.a(n8, string6);
                    this.zzj((String)object);
                }
                return false;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public final boolean zzf(zzan object) {
        int n3;
        int n4 = this.zzh;
        if (n4 != 0) {
            return this.zze;
        }
        return (object = zzuj.zza((zzan)object)) != null && (n3 = ((Integer)(object = (Integer)((Pair)object).first)).intValue()) == (n4 = 42);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean zzg(int n3, int n4, double d2) {
        boolean bl2;
        String string2;
        String string3;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        String string4 = null;
        if (codecCapabilities == null) {
            this.zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            this.zzj("sizeAndRate.vCaps");
            return false;
        }
        int n7 = zzgd.zza;
        int n8 = 29;
        int n10 = 1;
        String string5 = "@";
        String string6 = "x";
        if (n7 >= n8) {
            n7 = zztr.zza(videoCapabilities, n3, n4, d2);
            if (n7 == (n8 = 2)) return n10 != 0;
            if (n7 == n10) {
                StringBuilder stringBuilder = fQ2.a("sizeAndRate.cover, ", string6, string5, n3, n4);
                stringBuilder.append(d2);
                String string7 = stringBuilder.toString();
                this.zzj(string7);
                return false;
            }
        }
        if ((n7 = (int)(zztp.zzk(videoCapabilities, n3, n4, d2) ? 1 : 0)) != 0) return n10 != 0;
        if (n3 < n4 && ((n7 = (int)((string3 = "OMX.MTK.VIDEO.DECODER.HEVC").equals(string2 = this.zza) ? 1 : 0)) == 0 || (n7 = (int)((string2 = "mcv5a").equals(string3 = zzgd.zzb) ? 1 : 0)) == 0) && (bl2 = zztp.zzk(videoCapabilities, n4, n3, d2))) {
            StringBuilder stringBuilder = fQ2.a("sizeAndRate.rotated, ", string6, string5, n3, n4);
            stringBuilder.append(d2);
            String string8 = stringBuilder.toString();
            String string9 = this.zza;
            String string10 = this.zzb;
            String string11 = zzgd.zze;
            String string12 = "AssumedSupport [";
            string4 = "] [";
            string2 = ", ";
            String string13 = ko_0.a(og_1.a(string12, string8, string4, string9, string2), string10, string4, string11, "]");
            string9 = "MediaCodecInfo";
            zzfk.zzb(string9, string13);
            return n10 != 0;
        } else {
            StringBuilder stringBuilder = fQ2.a("sizeAndRate.support, ", string6, string5, n3, n4);
            stringBuilder.append(d2);
            String string14 = stringBuilder.toString();
            this.zzj(string14);
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray = this.zzd;
        if (codecProfileLevelArray == null || (codecProfileLevelArray = codecProfileLevelArray.profileLevels) == null) {
            codecProfileLevelArray = new MediaCodecInfo.CodecProfileLevel[]{};
        }
        return codecProfileLevelArray;
    }
}

