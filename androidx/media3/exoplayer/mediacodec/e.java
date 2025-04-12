/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.media.MediaCodecInfo$AudioCapabilities
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.util.Pair
 */
package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.f;
import androidx.media3.exoplayer.mediacodec.f$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.AbstractCollection;
import java.util.Objects;

public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public e(String string2, String string3, String string4, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        boolean bl6;
        string2.getClass();
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = codecCapabilities;
        this.g = bl2;
        this.e = bl3;
        this.f = bl4;
        this.h = bl5;
        this.i = bl6 = ip1_0.k(string3);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int n3, int n4, double d2) {
        double d5;
        int n7 = videoCapabilities.getWidthAlignment();
        int n8 = videoCapabilities.getHeightAlignment();
        n3 = gz3.e(n3, n7) * n7;
        n4 = gz3.e(n4, n8) * n8;
        Point point = new Point(n3, n4);
        n3 = point.x;
        n4 = point.y;
        double d7 = -1.0;
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object != false && (object = (d5 = d2 - (d7 = 1.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) >= 0) {
            d2 = Math.floor(d2);
            return videoCapabilities.areSizeAndRateSupported(n3, n4, d2);
        }
        return videoCapabilities.isSizeSupported(n3, n4);
    }

    public static e h(String string2, String string3, String string4, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        String string5;
        int n3;
        String string6;
        int n4;
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
        boolean bl6 = codecCapabilities != null && (n4 = codecCapabilities.isFeatureSupported(string6 = "adaptive-playback")) != 0 && ((n4 = gz3.a) > (n3 = 22) || (n3 = (int)((string5 = "ODROID-XU3").equals(string6 = gz3.d) ? 1 : 0)) == 0 && (n4 = (int)((string5 = "Nexus 10").equals(string6) ? 1 : 0)) == 0 || (n4 = (int)((string6 = "OMX.Exynos.AVC.Decoder").equals(string2) ? 1 : 0)) == 0 && (n4 = (int)((string6 = "OMX.Exynos.AVC.Decoder.secure").equals(string2) ? 1 : 0)) == 0);
        if (codecCapabilities2 != null) {
            string6 = "tunneled-playback";
            n4 = (int)(codecCapabilities.isFeatureSupported(string6) ? 1 : 0);
        }
        boolean bl7 = bl5 || codecCapabilities2 != null && (n4 = (int)(codecCapabilities.isFeatureSupported(string6 = "secure-playback") ? 1 : 0)) != 0;
        n4 = gz3.a;
        n3 = 35;
        boolean bl8 = n4 >= n3 && codecCapabilities2 != null && (n4 = (int)(codecCapabilities.isFeatureSupported(string6 = "detached-surface") ? 1 : 0)) != 0;
        string6 = string4;
        codecCapabilities2 = codecCapabilities;
        n3 = (int)(bl2 ? 1 : 0);
        e e2 = new e(string2, string3, string4, codecCapabilities, bl2, bl6, bl7, bl8);
        return e2;
    }

    public final hj0 b(d d2, d d5) {
        Object object = d2.o;
        Object object2 = d5.o;
        int n3 = Objects.equals(object, object2);
        if (n3 == 0) {
            n3 = 8;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = this.i;
        if (n4 != 0) {
            String string2;
            n4 = d2.y;
            int n7 = d5.y;
            if (n4 != n7) {
                n3 |= 0x400;
            }
            if ((n4 = (int)(this.e ? 1 : 0)) == 0 && ((n4 = d2.v) != (n7 = d5.v) || (n4 = d2.w) != (n7 = d5.w))) {
                n3 |= 0x200;
            }
            object2 = d2.C;
            n7 = (int)(VX.e((VX)object2) ? 1 : 0);
            Object object3 = d5.C;
            if ((n7 == 0 || (n7 = (int)(VX.e((VX)object3) ? 1 : 0)) == 0) && (n4 = (int)(Objects.equals(object2, object3) ? 1 : 0)) == 0) {
                n3 |= 0x800;
            }
            if ((n4 = (int)(((String)(object2 = gz3.d)).startsWith(string2 = "SM-T230") ? 1 : 0)) != 0 && (n4 = (int)(((String)(object2 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER")).equals(string2 = this.a) ? 1 : 0)) != 0 && (n4 = (int)(d2.c(d5) ? 1 : 0)) == 0) {
                n3 |= 2;
            }
            if (n3 == 0) {
                int n8;
                n4 = (int)(d2.c(d5) ? 1 : 0);
                if (n4 != 0) {
                    n4 = 3;
                    n8 = 3;
                } else {
                    n4 = 2;
                    n8 = 2;
                }
                string2 = this.a;
                object2 = object;
                object3 = d2;
                object = new hj0(string2, d2, d5, n8, 0);
                return object;
            }
        } else {
            Object object4;
            Object object5;
            n4 = d2.D;
            int n10 = d5.D;
            if (n4 != n10) {
                n3 |= 0x1000;
            }
            if ((n4 = d2.E) != (n10 = d5.E)) {
                n3 |= 0x2000;
            }
            if ((n4 = d2.F) != (n10 = d5.F)) {
                n3 |= 0x4000;
            }
            object2 = this.b;
            if (n3 == 0 && (n10 = (int)(((String)(object5 = "audio/mp4a-latm")).equals(object2) ? 1 : 0)) != 0) {
                object5 = MediaCodecUtil.d(d2);
                object4 = MediaCodecUtil.d(d5);
                if (object5 != null && object4 != null) {
                    object5 = (Integer)((Pair)object5).first;
                    n10 = (Integer)object5;
                    object4 = (Integer)((Pair)object4).first;
                    int n14 = (Integer)object4;
                    int n15 = 42;
                    if (n10 == n15 && n14 == n15) {
                        String string3 = this.a;
                        d d7 = d5;
                        object = new hj0(string3, d2, d5, 3, 0);
                        return object;
                    }
                }
            }
            if ((n10 = (int)(d2.c(d5) ? 1 : 0)) == 0) {
                n3 |= 0x20;
            }
            if ((n4 = (int)(((String)(object5 = "audio/opus")).equals(object2) ? 1 : 0)) != 0) {
                n3 |= 2;
            }
            if (n3 == 0) {
                object5 = this.a;
                object2 = object;
                object4 = d2;
                object = new hj0((String)object5, d2, d5, 1, 0);
                return object;
            }
        }
        String string4 = this.a;
        object = new hj0(string4, d2, d5, 0, n3);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(d d2, boolean bl2) {
        StringBuilder stringBuilder;
        String string2;
        int n3;
        int n4;
        Object object;
        int n7;
        int n8;
        int n10;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray;
        int n14;
        String string3;
        int n15;
        String string4;
        String string5;
        Object object2;
        int n16;
        int n17;
        Object object3;
        e e2;
        block43: {
            Object object4;
            block45: {
                block44: {
                    Object object5;
                    e2 = this;
                    object3 = d2;
                    n17 = 4;
                    n16 = 3;
                    object2 = MediaCodecUtil.d(d2);
                    string5 = this.c;
                    string4 = "video/hevc";
                    n15 = 1;
                    string3 = d2.o;
                    if (string3 != null && (n14 = string3.equals(codecProfileLevelArray = "video/mv-hevc")) != 0) {
                        String string6 = ip1_0.l(string5);
                        n10 = string6.equals(codecProfileLevelArray);
                        if (n10) {
                            return n15 != 0;
                        }
                        n10 = string6.equals(string4);
                        if (n10) {
                            Object object6;
                            block42: {
                                object2 = d2.r;
                                n10 = 0;
                                codecProfileLevelArray = null;
                                while (n10 < (n14 = object2.size())) {
                                    int n18;
                                    byte[] byArray = (byte[])object2.get(n10);
                                    n8 = byArray.length;
                                    if (n8 > n16) {
                                        object6 = new boolean[n16];
                                        Object object7 = ImmutableList.builder();
                                        n7 = 0;
                                        object = null;
                                        while (n7 < (n4 = byArray.length)) {
                                            n4 = byArray.length;
                                            if ((n4 = DS1.b(byArray, n7, n4, (boolean[])object6)) != (n7 = byArray.length)) {
                                                object = n4;
                                                ((ImmutableList$Builder)object7).add(object);
                                            }
                                            n7 = n4 + 3;
                                        }
                                        object4 = ((ImmutableList$Builder)object7).build();
                                        object = null;
                                        for (n7 = 0; n7 < (n18 = ((AbstractCollection)object4).size()); n7 += n18) {
                                            object6 = (Integer)object4.get(n7);
                                            n18 = (Integer)object6 + n16;
                                            if (n18 < n8) {
                                                int n19 = (Integer)object4.get(n7) + n16;
                                                object6 = new Ym2(byArray, n19, n8);
                                                object7 = DS1.d((Ym2)object6);
                                                n15 = ((DS1$b)object7).a;
                                                n16 = 33;
                                                if (n15 == n16 && (n16 = ((DS1$b)object7).b) == 0) break block42;
                                                n16 = 3;
                                            }
                                            n18 = 1;
                                            n15 = 1;
                                        }
                                    }
                                    n18 = 1;
                                    n10 += n18;
                                    n15 = 1;
                                }
                                return true;
                            }
                            ((Ym2)object6).l(n17);
                            n16 = ((Ym2)object6).f(3);
                            ((Ym2)object6).k();
                            n15 = 0;
                            object5 = DS1.e((Ym2)object6, true, n16, null);
                            n4 = ((DS1$c)object5).c;
                            n7 = ((DS1$c)object5).d;
                            n3 = ((DS1$c)object5).a;
                            n10 = (int)(((DS1$c)object5).b ? 1 : 0);
                            int[] nArray = ((DS1$c)object5).e;
                            n16 = ((DS1$c)object5).f;
                            object5 = LW.a(n3, n10 != 0, n4, n7, nArray, n16);
                            if (object5 == null) {
                                return true;
                            }
                            object4 = ((String)object5).trim();
                            n7 = -1;
                            object2 = "\\.";
                            object4 = ((String)object4).split((String)object2, n7);
                            object = ((d)object3).C;
                            object4 = LW.b((String)object5, (String[])object4, (VX)object);
                            object2 = object4;
                        }
                    }
                    if (object2 == null) {
                        return true;
                    }
                    object5 = (Integer)((Pair)object2).first;
                    n16 = (Integer)object5;
                    object4 = (Integer)((Pair)object2).second;
                    n4 = (Integer)object4;
                    object = "video/dolby-vision";
                    n7 = ((String)object).equals(string3);
                    n3 = 8;
                    n15 = 2;
                    string3 = e2.b;
                    if (n7 == 0) break block43;
                    object = "video/avc";
                    n7 = ((String)object).equals(string3);
                    if (n7 == 0) break block44;
                    n16 = 8;
                    break block45;
                }
                n7 = (int)(string4.equals(string3) ? 1 : 0);
                if (n7 == 0) break block43;
                n16 = 2;
            }
            n4 = 0;
            object4 = null;
        }
        if ((n7 = e2.i) == 0 && n16 != (n7 = 42)) {
            return true;
        }
        object = e2.d;
        if (object == null || (codecProfileLevelArray = ((MediaCodecInfo.CodecCapabilities)object).profileLevels) == null) {
            n10 = 0;
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArray2 = new MediaCodecInfo.CodecProfileLevel[]{};
            codecProfileLevelArray = codecProfileLevelArray2;
        }
        if ((n14 = gz3.a) <= (n8 = 23) && (n14 = (int)((string2 = "video/x-vnd.on2.vp9").equals(string3) ? 1 : 0)) != 0 && (n14 = codecProfileLevelArray.length) == 0) {
            if (object != null && (object = object.getVideoCapabilities()) != null) {
                object = (Integer)object.getBitrateRange().getUpper();
                n7 = (Integer)object;
            } else {
                n7 = 0;
                object = null;
            }
            n10 = 180000000;
            if (n7 >= n10) {
                n17 = 1024;
            } else {
                n10 = 120000000;
                if (n7 >= n10) {
                    n17 = 512;
                } else {
                    n10 = 60000000;
                    if (n7 >= n10) {
                        n17 = 256;
                    } else {
                        n10 = 30000000;
                        if (n7 >= n10) {
                            n17 = 128;
                        } else {
                            n10 = 18000000;
                            if (n7 >= n10) {
                                n17 = 64;
                            } else {
                                n10 = 12000000;
                                if (n7 >= n10) {
                                    n17 = 32;
                                } else {
                                    n10 = 0x6DDD00;
                                    if (n7 >= n10) {
                                        n17 = 16;
                                    } else {
                                        n10 = 3600000;
                                        if (n7 >= n10) {
                                            n17 = 8;
                                        } else {
                                            n3 = 1800000;
                                            if (n7 < n3) {
                                                n17 = 800000;
                                                n17 = n7 >= n17 ? 2 : 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            object = new MediaCodecInfo.CodecProfileLevel();
            ((MediaCodecInfo.CodecProfileLevel)object).profile = n3 = 1;
            ((MediaCodecInfo.CodecProfileLevel)object).level = n17;
            codecProfileLevelArray = new MediaCodecInfo.CodecProfileLevel[n3];
            n17 = 0;
            stringBuilder = null;
            codecProfileLevelArray[0] = object;
        }
        n17 = codecProfileLevelArray.length;
        n7 = 0;
        object = null;
        while (true) {
            if (n7 >= n17) {
                stringBuilder = new StringBuilder("codec.profileLevel, ");
                object3 = ((d)object3).k;
                stringBuilder.append((String)object3);
                stringBuilder.append(", ");
                stringBuilder.append(string5);
                object3 = stringBuilder.toString();
                e2.g((String)object3);
                return false;
            }
            object2 = codecProfileLevelArray[n7];
            n14 = ((MediaCodecInfo.CodecProfileLevel)object2).profile;
            if (!(n14 != n16 || (n3 = ((MediaCodecInfo.CodecProfileLevel)object2).level) < n4 && bl2)) {
                n3 = (int)(string4.equals(string3) ? 1 : 0);
                if (n3 == 0) return true;
                if (n15 != n16) return true;
                String string7 = "sailfish";
                object2 = gz3.b;
                n14 = (int)(string7.equals(object2) ? 1 : 0);
                if (n14 == 0) {
                    String string8 = "marlin";
                    n3 = (int)(string8.equals(object2) ? 1 : 0);
                    if (n3 == 0) return true;
                }
            }
            n3 = 1;
            n7 += n3;
        }
    }

    public final boolean d(d object) {
        int n3;
        block14: {
            block12: {
                CharSequence charSequence;
                int n4;
                int n7;
                int n8;
                int n10;
                String string2;
                CharSequence charSequence2;
                block16: {
                    block15: {
                        block10: {
                            MediaCodecInfo.AudioCapabilities audioCapabilities;
                            block13: {
                                block11: {
                                    charSequence2 = ((d)object).o;
                                    string2 = this.b;
                                    n10 = string2.equals(charSequence2);
                                    n3 = 1;
                                    if (n10 == 0 && (n10 = string2.equals(charSequence2 = MediaCodecUtil.b((d)object))) == 0) {
                                        n10 = 0;
                                        charSequence2 = null;
                                    } else {
                                        n10 = 1;
                                    }
                                    if (n10 == 0) {
                                        return false;
                                    }
                                    n10 = this.c((d)object, n3 != 0);
                                    if (n10 == 0) {
                                        return false;
                                    }
                                    n10 = this.i;
                                    if (n10 != 0) {
                                        int n14;
                                        n10 = ((d)object).v;
                                        if (n10 > 0 && (n14 = ((d)object).w) > 0) {
                                            double d2 = ((d)object).x;
                                            return this.f(n10, n14, d2);
                                        }
                                        return n3 != 0;
                                    }
                                    charSequence2 = this.d;
                                    n8 = ((d)object).E;
                                    n7 = -1;
                                    if (n8 == n7) break block10;
                                    if (charSequence2 != null) break block11;
                                    object = "sampleRate.caps";
                                    this.g((String)object);
                                    break block12;
                                }
                                audioCapabilities = charSequence2.getAudioCapabilities();
                                if (audioCapabilities != null) break block13;
                                object = "sampleRate.aCaps";
                                this.g((String)object);
                                break block12;
                            }
                            boolean bl2 = audioCapabilities.isSampleRateSupported(n8);
                            if (bl2) break block10;
                            charSequence2 = "sampleRate.support, ";
                            object = new StringBuilder((String)charSequence2);
                            ((StringBuilder)object).append(n8);
                            object = ((StringBuilder)object).toString();
                            this.g((String)object);
                            break block12;
                        }
                        if ((n4 = ((d)object).D) == n7) break block14;
                        if (charSequence2 != null) break block15;
                        object = "channelCount.caps";
                        this.g((String)object);
                        break block12;
                    }
                    if ((charSequence2 = charSequence2.getAudioCapabilities()) != null) break block16;
                    object = "channelCount.aCaps";
                    this.g((String)object);
                    break block12;
                }
                n10 = charSequence2.getMaxInputChannelCount();
                if (n10 <= n3 && ((n7 = gz3.a) < (n8 = 26) || n10 <= 0) && (n7 = (int)(((String)(charSequence = "audio/mpeg")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/3gpp")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/amr-wb")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/mp4a-latm")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/vorbis")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/opus")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/raw")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/flac")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/g711-alaw")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/g711-mlaw")).equals(string2) ? 1 : 0)) == 0 && (n7 = (int)(((String)(charSequence = "audio/gsm")).equals(string2) ? 1 : 0)) == 0) {
                    int n15;
                    charSequence = "audio/ac3";
                    n7 = (int)(((String)charSequence).equals(string2) ? 1 : 0);
                    n15 = n7 != 0 ? 6 : ((n15 = (int)(((String)(charSequence = "audio/eac3")).equals(string2) ? 1 : 0)) != 0 ? 16 : 30);
                    charSequence = new StringBuilder("AssumedMaxChannelAdjustment: ");
                    String string3 = this.a;
                    ((StringBuilder)charSequence).append(string3);
                    string3 = ", [";
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append(n10);
                    ((StringBuilder)charSequence).append(" to ");
                    ((StringBuilder)charSequence).append(n15);
                    ((StringBuilder)charSequence).append("]");
                    charSequence2 = ((StringBuilder)charSequence).toString();
                    Cx.f((String)charSequence2);
                    n10 = n15;
                }
                if (n10 >= n4) break block14;
                string2 = "channelCount.support, ";
                charSequence2 = new StringBuilder(string2);
                ((StringBuilder)charSequence2).append(n4);
                object = ((StringBuilder)charSequence2).toString();
                this.g((String)object);
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public final boolean e(d object) {
        int n3;
        int n4 = this.i;
        if (n4 != 0) {
            return this.e;
        }
        if ((object = MediaCodecUtil.d((d)object)) != null && (n3 = ((Integer)(object = (Integer)((Pair)object).first)).intValue()) == (n4 = 42)) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean f(int var1_1, int var2_2, double var3_3) {
        block18: {
            block20: {
                block19: {
                    block17: {
                        var5_4 = null;
                        var6_5 = this.d;
                        if (var6_5 == null) {
                            this.g("sizeAndRate.caps");
                            return false;
                        }
                        if ((var6_5 = var6_5.getVideoCapabilities()) == null) {
                            this.g("sizeAndRate.vCaps");
                            return false;
                        }
                        var7_6 = gz3.a;
                        var8_7 = 1;
                        var9_8 = 29;
                        var10_9 = "@";
                        var11_10 = "x";
                        if (var7_6 < var9_8) break block18;
                        var12_11 = 2;
                        if (var7_6 < var9_8 || (var13_12 = androidx.media3.exoplayer.mediacodec.f.a) != null && (var9_8 = (int)var13_12.booleanValue()) != 0 || (var13_12 = HL1.a((MediaCodecInfo.VideoCapabilities)var6_5)) == null || (var14_13 = var13_12.isEmpty()) != 0) break block19;
                        LL1.a();
                        var14_13 = (int)var3_3;
                        var15_14 /* !! */  = ML1.a(var1_1, var2_2, var14_13);
                        for (var16_15 = 0; var16_15 < (var17_16 = var13_12.size()); ++var16_15) {
                            var18_17 = IL1.a(var13_12.get(var16_15));
                            var17_16 = (int)JL1.a(var18_17, var15_14 /* !! */ );
                            if (var17_16 == 0) continue;
                            var9_8 = 2;
                            break block17;
                        }
                        var9_8 = 1;
                    }
                    if (var9_8 != var8_7 || (var15_14 /* !! */  = androidx.media3.exoplayer.mediacodec.f.a) != null) break block20;
                    var14_13 = 35;
                    if (var7_6 >= var14_13) {
                        while (true) {
                            var7_6 = 0;
                            var19_18 = null;
                            break;
                        }
                    } else {
                        var7_6 = f$a.a(false);
                        var14_13 = f$a.a((boolean)var8_7);
                        if (var7_6 == 0) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var7_6 = 1;
                                break;
                            }
                        } else {
                            if (!(var14_13 == 0 ? var7_6 != var12_11 : var7_6 != var12_11 || var14_13 != var12_11)) ** continue;
                            ** continue;
                        }
                    }
                    var15_14 /* !! */  = Boolean.valueOf((boolean)var7_6);
                    androidx.media3.exoplayer.mediacodec.f.a = var15_14 /* !! */ ;
                    if (var7_6 == 0) break block20;
                }
                var9_8 = 0;
                var13_12 = null;
            }
            if (var9_8 == var12_11) {
                return (boolean)var8_7;
            }
            if (var9_8 == var8_7) {
                var20_19 /* !! */  = fQ2.a("sizeAndRate.cover, ", var11_10, var10_9, var1_1, var2_2);
                var20_19 /* !! */ .append(var3_3);
                var20_19 /* !! */  = var20_19 /* !! */ .toString();
                this.g((String)var20_19 /* !! */ );
                return false;
            }
        }
        if ((var7_6 = (int)androidx.media3.exoplayer.mediacodec.e.a((MediaCodecInfo.VideoCapabilities)var6_5, var1_1, var2_2, var3_3)) == 0) {
            if (var1_1 < var2_2 && ((var7_6 = (int)(var19_18 = "OMX.MTK.VIDEO.DECODER.HEVC").equals(var13_12 = this.a)) == 0 || (var7_6 = (int)(var19_18 = "mcv5a").equals(var21_22 = gz3.b)) == 0) && (var22_23 = androidx.media3.exoplayer.mediacodec.e.a((MediaCodecInfo.VideoCapabilities)var6_5, var2_2, var1_1, var3_3))) {
                var5_4 = "sizeAndRate.rotated, ";
                var20_20 = fQ2.a(var5_4, var11_10, var10_9, var1_1, var2_2);
                var20_20.append(var3_3);
                var20_20 = var20_20.toString();
                var23_24 = "] [";
                var24_25 = ", ";
                var20_20 = og_1.a("AssumedSupport [", (String)var20_20, var23_24, (String)var13_12, var24_25);
                var25_26 = this.b;
                var20_20.append(var25_26);
                var20_20.append(var23_24);
                var25_26 = gz3.e;
                var20_20.append(var25_26);
                var25_26 = "]";
                var20_20.append(var25_26);
                var20_20 = var20_20.toString();
                Cx.b((String)var20_20);
            } else {
                var20_21 /* !! */  = fQ2.a("sizeAndRate.support, ", var11_10, var10_9, var1_1, var2_2);
                var20_21 /* !! */ .append(var3_3);
                var20_21 /* !! */  = var20_21 /* !! */ .toString();
                this.g((String)var20_21 /* !! */ );
                return false;
            }
        }
        return (boolean)var8_7;
    }

    public final void g(String charSequence) {
        String string2 = "] [";
        charSequence = Gn.a("NoSupport [", (String)charSequence, string2);
        String string3 = this.a;
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", ");
        string3 = this.b;
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string2);
        string3 = gz3.e;
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append("]");
        Cx.b(((StringBuilder)charSequence).toString());
    }

    public final String toString() {
        return this.a;
    }
}

