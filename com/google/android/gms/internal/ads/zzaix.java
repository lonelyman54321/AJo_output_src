/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaek;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzaiy;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class zzaix {
    public int zzA;
    public int zzB;
    public int zzC;
    public float zzD;
    public float zzE;
    public float zzF;
    public float zzG;
    public float zzH;
    public float zzI;
    public float zzJ;
    public float zzK;
    public float zzL;
    public float zzM;
    public byte[] zzN;
    public int zzO;
    public int zzP;
    public int zzQ;
    public long zzR;
    public long zzS;
    public zzafb zzT;
    public boolean zzU;
    public boolean zzV;
    public zzafa zzW;
    public int zzX;
    private int zzY;
    private String zzZ;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaez zzi;
    public byte[] zzj;
    public zzae zzk;
    public int zzl;
    public int zzm;
    public int zzn;
    public int zzo;
    public int zzp;
    public int zzq;
    public int zzr;
    public float zzs;
    public float zzt;
    public float zzu;
    public byte[] zzv;
    public int zzw;
    public boolean zzx;
    public int zzy;
    public int zzz;

    public zzaix() {
        long l2;
        int n3;
        float f5;
        int n4;
        this.zzl = n4 = -1;
        this.zzm = n4;
        this.zzn = n4;
        this.zzo = n4;
        this.zzp = n4;
        this.zzq = 0;
        this.zzr = n4;
        this.zzs = 0.0f;
        this.zzt = 0.0f;
        this.zzu = 0.0f;
        this.zzv = null;
        this.zzw = n4;
        this.zzx = false;
        this.zzy = n4;
        this.zzz = n4;
        this.zzA = n4;
        this.zzB = 1000;
        this.zzC = 200;
        this.zzD = f5 = -1.0f;
        this.zzE = f5;
        this.zzF = f5;
        this.zzG = f5;
        this.zzH = f5;
        this.zzI = f5;
        this.zzJ = f5;
        this.zzK = f5;
        this.zzL = f5;
        this.zzM = f5;
        this.zzO = n3 = 1;
        this.zzP = n4;
        this.zzQ = 8000;
        this.zzR = l2 = 0L;
        this.zzS = l2;
        this.zzV = n3;
        this.zzZ = "eng";
    }

    public static /* bridge */ /* synthetic */ int zza(zzaix zzaix2) {
        return zzaix2.zzY;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaix zzaix2, int n3) {
        zzaix2.zzY = n3;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzaix zzaix2, String string2) {
        zzaix2.zzZ = string2;
    }

    public static /* synthetic */ void zzd(zzaix zzaix2) {
        zzaix2.zzW.getClass();
    }

    private static Pair zzf(zzfu list) {
        long l2;
        long l3;
        int n3 = 16;
        try {
            ((zzfu)((Object)list)).zzL(n3);
            l3 = ((zzfu)((Object)list)).zzs();
            l2 = 1482049860L;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw zzch.zza("Error parsing FourCC private data", null);
        }
        n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n3 == 0) {
            String string2 = "video/divx";
            list = new List<Object>((Object)string2, null);
            return list;
        }
        l2 = 859189832L;
        long l4 = l3 - l2;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 == 0) {
            String string3 = "video/3gpp";
            list = new List<Object>((Object)string3, null);
            return list;
        }
        l2 = 826496599L;
        long l7 = l3 - l2;
        n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        if (n3 == 0) {
            n3 = ((zzfu)((Object)list)).zzd() + 20;
            list = (List<Object>)((zzfu)((Object)list)).zzM();
            while (true) {
                int n4;
                block23: {
                    int n7 = ((Object)list).length;
                    Object object = n7 + -4;
                    if (n3 >= object) break;
                    object = list[n3];
                    n4 = n3 + 1;
                    if (object != 0) break block23;
                    object = list[n4];
                    if (object != 0) break block23;
                    object = n3 + 2;
                    object = list[object];
                    Object object2 = 1;
                    if (object != object2) break block23;
                    object = n3 + 3;
                    object = list[object];
                    object2 = 15;
                    if (object != object2) break block23;
                    list = (List<Object>)Arrays.copyOfRange((byte[])list, n3, n7);
                    String string4 = "video/wvc1";
                    list = Collections.singletonList(list);
                    Pair pair = new Pair((Object)string4, list);
                    return pair;
                }
                n3 = n4;
            }
            list = "Failed to find FourCC VC1 initialization data";
            list = zzch.zza((String)((Object)list), null);
            throw list;
        }
        zzfk.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        list = new List<Object>((Object)"video/x-unknown", null);
        return list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static List zzg(byte[] object) {
        String string2;
        block27: {
            block28: {
                block29: {
                    Object object2;
                    Object object3;
                    Object object4;
                    string2 = "Error parsing vorbis codec private";
                    Object object5 = object[0];
                    int n3 = 2;
                    if (object5 != n3) break block27;
                    object5 = true;
                    int n4 = 1;
                    Object object6 = 0;
                    while (true) {
                        object4 = object[n4];
                        ++n4;
                        object3 = 255;
                        object4 = object4 & object3;
                        if (object4 != object3) break;
                        object6 += 255;
                    }
                    object6 += object4;
                    object4 = false;
                    byte[] byArray = null;
                    while (true) {
                        object2 = object[n4];
                        ++n4;
                        object2 = object2 & object3;
                        if (object2 != object3) break;
                        object4 += 255;
                    }
                    object4 += object2;
                    try {
                        object3 = object[n4];
                        if (object3 != object5) break block28;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw zzch.zza(string2, null);
                    }
                    byte[] byArray2 = new byte[object6];
                    System.arraycopy(object, n4, byArray2, 0, object6);
                    n4 += object6;
                    object6 = object[n4];
                    object3 = 3;
                    if (object6 != object3) break block29;
                    n4 += object4;
                    object6 = object[n4];
                    object4 = 5;
                    if (object6 == object4) {
                        object6 = ((Object)object).length - n4;
                        byArray = new byte[object6];
                        System.arraycopy(object, n4, byArray, 0, object6);
                        object = new ArrayList(n3);
                        ((ArrayList)object).add(byArray2);
                        ((ArrayList)object).add(byArray);
                        return object;
                    }
                    object = zzch.zza(string2, null);
                    throw object;
                }
                object = zzch.zza(string2, null);
                throw object;
            }
            object = zzch.zza(string2, null);
            throw object;
        }
        object = zzch.zza(string2, null);
        throw object;
    }

    private static boolean zzh(zzfu object) {
        block11: {
            int n3;
            int n4;
            block10: {
                try {
                    n4 = ((zzfu)object).zzk();
                    n3 = 1;
                    if (n4 != n3) break block10;
                    return n3;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw zzch.zza("Error parsing MS/ACM codec private", null);
                }
            }
            int n7 = -2;
            if (n4 == n7) {
                n4 = 24;
                ((zzfu)object).zzK(n4);
                long l2 = ((zzfu)object).zzt();
                UUID uUID = zzaiy.zzg();
                long l3 = uUID.getMostSignificantBits();
                n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                if (n4 == 0) {
                    l2 = ((zzfu)object).zzt();
                    object = zzaiy.zzg();
                    l3 = ((UUID)object).getLeastSignificantBits();
                    long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (l4 != false) break block11;
                    return n3;
                }
            }
        }
        return false;
    }

    private final byte[] zzi(String string2) {
        byte[] byArray = this.zzj;
        if (byArray != null) {
            return byArray;
        }
        string2 = String.valueOf(string2);
        throw zzch.zza("Missing CodecPrivate for codec ".concat(string2), null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zze(zzadx var1_1, int var2_2) {
        block102: {
            block103: {
                block104: {
                    block105: {
                        block101: {
                            block100: {
                                var3_3 = this;
                                var4_4 = this.zzb;
                                var5_5 = var4_4.hashCode();
                                var6_6 = 16;
                                var7_7 = 24;
                                var8_8 = 32;
                                var9_9 = 4;
                                var10_10 = 5.6E-45f;
                                var11_11 = 8;
                                var12_12 = 1.1E-44f;
                                var13_13 = 0;
                                var14_14 = 3;
                                var15_15 = 4.2E-45f;
                                switch (var5_5) {
                                    default: {
                                        break;
                                    }
                                    case 1951062397: {
                                        var16_16 = "A_OPUS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 12;
                                        break block100;
                                    }
                                    case 1950789798: {
                                        var16_16 = "A_FLAC";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 22;
                                        break block100;
                                    }
                                    case 1950749482: {
                                        var16_16 = "A_EAC3";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 17;
                                        break block100;
                                    }
                                    case 1809237540: {
                                        var16_16 = "V_MPEG2";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 3;
                                        break block100;
                                    }
                                    case 1422270023: {
                                        var16_16 = "S_TEXT/UTF8";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 27;
                                        break block100;
                                    }
                                    case 1045209816: {
                                        var16_16 = "S_TEXT/WEBVTT";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 29;
                                        break block100;
                                    }
                                    case 855502857: {
                                        var16_16 = "V_MPEGH/ISO/HEVC";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 8;
                                        break block100;
                                    }
                                    case 738597099: {
                                        var16_16 = "S_TEXT/ASS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 28;
                                        break block100;
                                    }
                                    case 725957860: {
                                        var16_16 = "A_PCM/INT/LIT";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 24;
                                        break block100;
                                    }
                                    case 725948237: {
                                        var16_16 = "A_PCM/INT/BIG";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 25;
                                        break block100;
                                    }
                                    case 635596514: {
                                        var16_16 = "A_PCM/FLOAT/IEEE";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 26;
                                        break block100;
                                    }
                                    case 542569478: {
                                        var16_16 = "A_DTS/EXPRESS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 20;
                                        break block100;
                                    }
                                    case 444813526: {
                                        var16_16 = "V_THEORA";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 10;
                                        break block100;
                                    }
                                    case 99146302: {
                                        var16_16 = "S_HDMV/PGS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 31;
                                        break block100;
                                    }
                                    case 82338134: {
                                        var16_16 = "V_VP9";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 1;
                                        break block100;
                                    }
                                    case 82338133: {
                                        var16_16 = "V_VP8";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 0;
                                        var16_16 = null;
                                        break block100;
                                    }
                                    case 82318131: {
                                        var16_16 = "V_AV1";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 2;
                                        break block100;
                                    }
                                    case 62927045: {
                                        var16_16 = "A_DTS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 19;
                                        break block100;
                                    }
                                    case 62923603: {
                                        var16_16 = "A_AC3";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 16;
                                        break block100;
                                    }
                                    case 62923557: {
                                        var16_16 = "A_AAC";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 13;
                                        break block100;
                                    }
                                    case -356037306: {
                                        var16_16 = "A_DTS/LOSSLESS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 21;
                                        break block100;
                                    }
                                    case -425012669: {
                                        var16_16 = "S_VOBSUB";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 30;
                                        break block100;
                                    }
                                    case -538363109: {
                                        var16_16 = "V_MPEG4/ISO/AVC";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 7;
                                        break block100;
                                    }
                                    case -538363189: {
                                        var16_16 = "V_MPEG4/ISO/ASP";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 5;
                                        break block100;
                                    }
                                    case -933872740: {
                                        var16_16 = "S_DVBSUB";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 32;
                                        break block100;
                                    }
                                    case -1373388978: {
                                        var16_16 = "V_MS/VFW/FOURCC";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 9;
                                        break block100;
                                    }
                                    case -1482641357: {
                                        var16_16 = "A_MPEG/L3";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 15;
                                        break block100;
                                    }
                                    case -1482641358: {
                                        var16_16 = "A_MPEG/L2";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 14;
                                        break block100;
                                    }
                                    case -1730367663: {
                                        var16_16 = "A_VORBIS";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 11;
                                        break block100;
                                    }
                                    case -1784763192: {
                                        var16_16 = "A_TRUEHD";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 18;
                                        break block100;
                                    }
                                    case -1985379776: {
                                        var16_16 = "A_MS/ACM";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 23;
                                        break block100;
                                    }
                                    case -2095575984: {
                                        var16_16 = "V_MPEG4/ISO/SP";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 4;
                                        break block100;
                                    }
                                    case -2095576542: {
                                        var16_16 = "V_MPEG4/ISO/AP";
                                        var5_5 = (int)var4_4.equals(var16_16);
                                        if (var5_5 == 0) break;
                                        var5_5 = 6;
                                        break block100;
                                    }
                                }
                                var5_5 = -1;
                            }
                            var17_17 = "application/vobsub";
                            var18_18 = "application/pgs";
                            var19_19 = "application/dvbsubs";
                            var20_20 = "audio/raw";
                            var21_21 = "audio/x-unknown";
                            var22_22 = "MatroskaExtractor";
                            var23_23 = null;
                            var24_24 = ". Setting mimeType to audio/x-unknown";
                            block35 : switch (var5_5) {
                                default: {
                                    throw zzch.zza("Unrecognized codec identifier.", null);
                                }
                                case 32: {
                                    var16_16 = new byte[var9_9];
                                    System.arraycopy(var3_3.zzi((String)var4_4), 0, var16_16, 0, var9_9);
                                    var4_4 = zzgbc.zzn(var16_16);
                                    var20_20 = var19_19;
lbl234:
                                    // 5 sources

                                    while (true) {
                                        var6_6 = 0;
                                        var25_25 = null;
lbl237:
                                        // 7 sources

                                        while (true) {
                                            var5_5 = -1;
lbl239:
                                            // 3 sources

                                            while (true) {
                                                var9_9 = -1;
                                                var10_10 = 0.0f / 0.0f;
                                                break block35;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                case 31: {
                                    var26_26 = false;
                                    var4_4 = null;
                                    var6_6 = 0;
                                    var25_25 = null;
                                    var20_20 = var18_18;
                                    ** GOTO lbl237
                                }
                                case 30: {
                                    var4_4 = zzgbc.zzn(var3_3.zzi((String)var4_4));
                                    var6_6 = 0;
                                    var25_25 = null;
                                    var20_20 = var17_17;
                                    ** GOTO lbl237
                                }
                                case 29: {
                                    var20_20 = "text/vtt";
lbl258:
                                    // 12 sources

                                    while (true) {
                                        var26_27 = false;
                                        var4_4 = null;
                                        var6_6 = 0;
                                        var25_25 = null;
                                        ** GOTO lbl237
                                        break;
                                    }
                                }
                                case 28: {
                                    var4_4 = zzaiy.zzn();
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4 = zzgbc.zzo(var4_4, var16_16);
                                    var20_20 = "text/x-ssa";
                                    ** GOTO lbl234
                                }
                                case 27: {
                                    var20_20 = "application/x-subrip";
                                    ** GOTO lbl258
                                }
                                case 26: {
                                    var26_28 = var3_3.zzP;
                                    if (var26_28 == var8_8) lbl-1000:
                                    // 6 sources

                                    {
                                        while (true) {
                                            var26_28 = 0;
                                            var4_4 = null;
                                            var6_6 = 0;
                                            var25_25 = null;
                                            var5_5 = -1;
                                            break block35;
                                            break;
                                        }
                                    }
                                    var25_25 = "Unsupported floating point PCM bit depth: ";
                                    var16_16 = new StringBuilder((String)var25_25);
                                    var16_16.append(var26_28);
                                    var16_16.append((String)var24_24);
                                    var4_4 = var16_16.toString();
                                    zzfk.zzf((String)var22_22, (String)var4_4);
lbl292:
                                    // 5 sources

                                    while (true) {
                                        var26_28 = 0;
                                        var4_4 = null;
                                        var6_6 = 0;
                                        var25_25 = null;
                                        var20_20 = var21_21;
                                        ** GOTO lbl237
                                        break;
                                    }
                                }
                                case 25: {
                                    var26_28 = var3_3.zzP;
                                    if (var26_28 == var11_11) {
                                        var26_28 = 0;
                                        var4_4 = null;
                                        var6_6 = 0;
                                        var25_25 = null;
                                        var5_5 = -1;
                                        var9_9 = 3;
                                        var10_10 = 4.2E-45f;
                                        break;
                                    }
                                    if (var26_28 != var6_6) ** GOTO lbl314
                                    var9_9 = 0x10000000;
                                    var10_10 = 2.524355E-29f;
                                    ** GOTO lbl-1000
lbl314:
                                    // 1 sources

                                    if (var26_28 != var7_7) ** GOTO lbl318
                                    var9_9 = 0x50000000;
                                    var10_10 = 8.589935E9f;
                                    ** GOTO lbl-1000
lbl318:
                                    // 1 sources

                                    if (var26_28 != var8_8) ** GOTO lbl322
                                    var9_9 = 0x60000000;
                                    var10_10 = 3.689349E19f;
                                    ** GOTO lbl-1000
lbl322:
                                    // 1 sources

                                    var25_25 = "Unsupported big endian PCM bit depth: ";
                                    var16_16 = new StringBuilder((String)var25_25);
                                    var16_16.append(var26_28);
                                    var16_16.append((String)var24_24);
                                    var4_4 = var16_16.toString();
                                    zzfk.zzf((String)var22_22, (String)var4_4);
                                    ** GOTO lbl292
                                }
                                case 24: {
                                    var26_28 = var3_3.zzP;
                                    var9_9 = zzgd.zzl(var26_28);
                                    if (var9_9 != 0) ** GOTO lbl-1000
                                    var26_28 = var3_3.zzP;
                                    var25_25 = "Unsupported little endian PCM bit depth: ";
                                    var16_16 = new StringBuilder((String)var25_25);
                                    var16_16.append(var26_28);
                                    var16_16.append((String)var24_24);
                                    var4_4 = var16_16.toString();
                                    zzfk.zzf((String)var22_22, (String)var4_4);
                                    ** GOTO lbl292
                                }
                                case 23: {
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4 = new zzfu((byte[])var16_16);
                                    var26_28 = (int)zzaix.zzh((zzfu)var4_4);
                                    if (var26_28 == 0) ** GOTO lbl365
                                    var26_28 = var3_3.zzP;
                                    var9_9 = zzgd.zzl(var26_28);
                                    if (var9_9 == 0) ** break;
                                    ** continue;
                                    var26_28 = var3_3.zzP;
                                    var25_25 = "Unsupported PCM bit depth: ";
                                    var16_16 = new StringBuilder((String)var25_25);
                                    var16_16.append(var26_28);
                                    var16_16.append((String)var24_24);
                                    var4_4 = var16_16.toString();
                                    zzfk.zzf((String)var22_22, (String)var4_4);
                                    ** GOTO lbl292
lbl365:
                                    // 1 sources

                                    var4_4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                                    zzfk.zzf((String)var22_22, (String)var4_4);
                                    ** continue;
                                }
                                case 22: {
                                    var4_4 = Collections.singletonList(var3_3.zzi((String)var4_4));
                                    var20_20 = "audio/flac";
                                    ** GOTO lbl234
                                }
                                case 21: {
                                    var20_20 = "audio/vnd.dts.hd";
                                    ** GOTO lbl258
                                }
                                case 19: 
                                case 20: {
                                    var20_20 = "audio/vnd.dts";
                                    ** GOTO lbl258
                                }
                                case 18: {
                                    var3_3.zzT = var4_4 = new zzafb();
                                    var20_20 = "audio/true-hd";
                                    ** GOTO lbl258
                                }
                                case 17: {
                                    var20_20 = "audio/eac3";
                                    ** GOTO lbl258
                                }
                                case 16: {
                                    var20_20 = "audio/ac3";
                                    ** GOTO lbl258
                                }
                                case 15: {
                                    var26_29 = 4096;
                                    var20_20 = "audio/mpeg";
lbl391:
                                    // 2 sources

                                    while (true) {
                                        var26_29 = 0;
                                        var4_4 = null;
                                        var6_6 = 0;
                                        var25_25 = null;
                                        var5_5 = 4096;
                                        ** GOTO lbl239
                                        break;
                                    }
                                }
                                case 14: {
                                    var26_29 = 4096;
                                    var20_20 = "audio/mpeg-L2";
                                    ** continue;
                                }
                                case 13: {
                                    var4_4 = Collections.singletonList(var3_3.zzi((String)var4_4));
                                    var16_16 = zzacq.zza(var3_3.zzj);
                                    var3_3.zzQ = var6_6 = var16_16.zza;
                                    var3_3.zzO = var6_6 = var16_16.zzb;
                                    var16_16 = var16_16.zzc;
                                    var20_20 = "audio/mp4a-latm";
                                    var25_25 = var16_16;
                                    ** GOTO lbl237
                                }
                                case 12: {
                                    var4_4 = new ArrayList(var14_14);
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4.add(var16_16);
                                    var16_16 = ByteBuffer.allocate(var11_11);
                                    var25_25 = ByteOrder.LITTLE_ENDIAN;
                                    var16_16 = var16_16.order((ByteOrder)var25_25);
                                    var27_31 = var3_3.zzR;
                                    var16_16 = var16_16.putLong(var27_31).array();
                                    var4_4.add(var16_16);
                                    var16_16 = ByteBuffer.allocate(var11_11).order((ByteOrder)var25_25);
                                    var29_32 = var3_3.zzS;
                                    var16_16 = var16_16.putLong(var29_32).array();
                                    var4_4.add(var16_16);
                                    var5_5 = 5760;
                                    var20_20 = "audio/opus";
lbl431:
                                    // 2 sources

                                    while (true) {
                                        var6_6 = 0;
                                        var25_25 = null;
                                        ** continue;
                                        break;
                                    }
                                }
                                case 11: {
                                    var4_4 = zzaix.zzg(var3_3.zzi((String)var4_4));
                                    var5_5 = 8192;
                                    var20_20 = "audio/vorbis";
                                    ** continue;
                                }
                                case 10: {
                                    var20_20 = "video/x-unknown";
                                    ** GOTO lbl258
                                }
                                case 9: {
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4 = new zzfu((byte[])var16_16);
                                    var4_4 = zzaix.zzf((zzfu)var4_4);
                                    var20_20 = var16_16 = var4_4.first;
                                    var20_20 = (String)var16_16;
                                    var4_4 = (List)var4_4.second;
                                    ** GOTO lbl234
                                }
                                case 8: {
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4 = new zzfu((byte[])var16_16);
                                    var4_4 = zzaek.zza((zzfu)var4_4);
                                    var16_16 = var4_4.zza;
                                    var3_3.zzX = var6_6 = var4_4.zzb;
                                    var4_4 = var4_4.zzi;
                                    var20_20 = "video/hevc";
lbl461:
                                    // 2 sources

                                    while (true) {
                                        var25_25 = var4_4;
                                        var4_4 = var16_16;
                                        ** continue;
                                        break;
                                    }
                                }
                                case 7: {
                                    var16_16 = var3_3.zzb;
                                    var16_16 = var3_3.zzi((String)var16_16);
                                    var4_4 = new zzfu((byte[])var16_16);
                                    var4_4 = zzacx.zza((zzfu)var4_4);
                                    var16_16 = var4_4.zza;
                                    var3_3.zzX = var6_6 = var4_4.zzb;
                                    var4_4 = var4_4.zzk;
                                    var20_20 = "video/avc";
                                    ** continue;
                                }
                                case 4: 
                                case 5: 
                                case 6: {
                                    var4_4 = var3_3.zzj;
                                    if (var4_4 == null) {
                                        var26_30 = false;
                                        var4_4 = null;
                                    } else {
                                        var4_4 = Collections.singletonList(var4_4);
                                    }
                                    var20_20 = "video/mp4v-es";
                                    ** continue;
                                }
                                case 3: {
                                    var20_20 = "video/mpeg2";
                                    ** GOTO lbl258
                                }
                                case 2: {
                                    var20_20 = "video/av01";
                                    ** GOTO lbl258
                                }
                                case 1: {
                                    var20_20 = "video/x-vnd.on2.vp9";
                                    ** GOTO lbl258
                                }
                                case 0: {
                                    var20_20 = "video/x-vnd.on2.vp8";
                                    ** continue;
                                }
                            }
                            var22_22 = var3_3.zzN;
                            if (var22_22 != null) {
                                var31_33 = var3_3.zzN;
                                var22_22 = new zzfu(var31_33);
                                if ((var22_22 = zzado.zza((zzfu)var22_22)) != null) {
                                    var25_25 = var22_22.zza;
                                    var20_20 = "video/dolby-vision";
                                }
                            }
                            var22_22 = var20_20;
                            var7_7 = (int)var3_3.zzV;
                            var32_34 = 1;
                            var8_8 = (int)var3_3.zzU;
                            if (var32_34 != var8_8) {
                                var8_8 = 0;
                                var33_35 = null;
                            } else {
                                var8_8 = 2;
                            }
                            var7_7 |= var8_8;
                            var33_35 = new zzal();
                            var11_11 = (int)zzcg.zzg((String)var22_22);
                            if (var11_11 == 0) break block101;
                            var34_36 = var3_3.zzO;
                            var33_35.zzy(var34_36);
                            var34_36 = var3_3.zzQ;
                            var33_35.zzY(var34_36);
                            var33_35.zzR(var9_9);
                            var34_36 = 1;
                            var35_37 = 1.4E-45f;
                            break block102;
                        }
                        var32_34 = (int)zzcg.zzh((String)var22_22);
                        if (var32_34 == 0) break block103;
                        var34_36 = var3_3.zzq;
                        if (var34_36 == 0) {
                            var34_36 = var3_3.zzo;
                            var32_34 = -1;
                            if (var34_36 == var32_34) {
                                var34_36 = var3_3.zzl;
                            }
                            var3_3.zzo = var34_36;
                            var34_36 = var3_3.zzp;
                            if (var34_36 == var32_34) {
                                var34_36 = var3_3.zzm;
                            }
                            var3_3.zzp = var34_36;
                        } else {
                            var32_34 = -1;
                        }
                        var34_36 = var3_3.zzo;
                        var9_9 = -1082130432;
                        var10_10 = -1.0f;
                        if (var34_36 != var32_34 && (var11_11 = var3_3.zzp) != var32_34) {
                            var14_14 = var3_3.zzm * var34_36;
                            var34_36 = var3_3.zzl * var11_11;
                            var12_12 = var14_14;
                            var35_38 = var34_36;
                            var12_12 /= var35_38;
                        } else {
                            var11_11 = -1082130432;
                            var12_12 = -1.0f;
                        }
                        var34_36 = (int)var3_3.zzx;
                        if (var34_36 != 0) {
                            var35_38 = var3_3.zzD;
                            cfr_temp_0 = var35_38 - var10_10;
                            var34_36 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                            if (var34_36 != 0 && (var34_36 = (int)((cfr_temp_1 = (var35_38 = var3_3.zzE) - var10_10) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_2 = (var35_38 = var3_3.zzF) - var10_10) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_3 = (var35_38 = var3_3.zzG) - var10_10) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_4 = (var35_38 = var3_3.zzH) - var10_10) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_5 = (var35_38 = var3_3.zzI) - var10_10) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_6 = (var35_38 = var3_3.zzJ) - var10_10) == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_7 = (var35_38 = var3_3.zzK) - var10_10) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_8 = (var35_38 = var3_3.zzL) - var10_10) == 0.0f ? 0 : (cfr_temp_8 > 0.0f ? 1 : -1))) != 0 && (var34_36 = (int)((cfr_temp_9 = (var35_38 = var3_3.zzM) - var10_10) == 0.0f ? 0 : (cfr_temp_9 > 0.0f ? 1 : -1))) != 0) {
                                var34_36 = 25;
                                var35_38 = 3.5E-44f;
                                var23_23 = new byte[var34_36];
                                var19_19 = ByteBuffer.wrap((byte[])var23_23);
                                var36_40 = ByteOrder.LITTLE_ENDIAN;
                                var19_19 = var19_19.order((ByteOrder)var36_40);
                                var19_19.put((byte)0);
                                var10_10 = var3_3.zzD;
                                var14_14 = 1195593728;
                                var15_15 = 50000.0f;
                                var37_41 = 0.5f;
                                var9_9 = (short)((var10_10 *= var15_15) + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzE * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzF * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzG * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzH * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzI * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzJ * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzK * var15_15 + var37_41);
                                var19_19.putShort(var9_9);
                                var9_9 = (short)(var3_3.zzL + var37_41);
                                var19_19.putShort(var9_9);
                                var10_10 = var3_3.zzM + var37_41;
                                var9_9 = (short)var10_10;
                                var19_19.putShort(var9_9);
                                var9_9 = (short)var3_3.zzB;
                                var19_19.putShort(var9_9);
                                var9_9 = (short)var3_3.zzC;
                                var19_19.putShort(var9_9);
                            }
                            var19_19 = new zzr();
                            var9_9 = var3_3.zzy;
                            var19_19.zzc(var9_9);
                            var9_9 = var3_3.zzA;
                            var19_19.zzb(var9_9);
                            var9_9 = var3_3.zzz;
                            var19_19.zzd(var9_9);
                            var19_19.zze((byte[])var23_23);
                            var9_9 = var3_3.zzn;
                            var19_19.zzf(var9_9);
                            var9_9 = var3_3.zzn;
                            var19_19.zza(var9_9);
                            var23_23 = var19_19.zzg();
                        }
                        if ((var19_19 = var3_3.zza) != null && (var34_36 = (int)(var19_19 = zzaiy.zza()).containsKey(var36_40 = var3_3.zza)) != 0) {
                            var19_19 = zzaiy.zza();
                            var24_24 = var3_3.zza;
                            var19_19 = (Integer)var19_19.get(var24_24);
                            var32_34 = var34_36 = var19_19.intValue();
                        }
                        if ((var34_36 = var3_3.zzr) != 0) ** GOTO lbl-1000
                        var35_38 = var3_3.zzs;
                        var9_9 = 0;
                        var10_10 = 0.0f;
                        var36_40 = null;
                        var34_36 = Float.compare(var35_38, 0.0f);
                        if (var34_36 != 0 || (var34_36 = Float.compare(var35_38 = var3_3.zzt, 0.0f)) != 0) ** GOTO lbl-1000
                        var35_38 = var3_3.zzu;
                        var34_36 = Float.compare(var35_38, 0.0f);
                        if (var34_36 == 0) break block104;
                        var35_38 = var3_3.zzu;
                        var9_9 = 1119092736;
                        var10_10 = 90.0f;
                        var34_36 = Float.compare(var35_38, var10_10);
                        if (var34_36 != 0) break block105;
                        var13_13 = 90;
                        break block104;
                    }
                    var35_38 = var3_3.zzu;
                    var9_9 = -1020002304;
                    var10_10 = -180.0f;
                    var34_36 = Float.compare(var35_38, var10_10);
                    if (var34_36 == 0) ** GOTO lbl-1000
                    var35_38 = var3_3.zzu;
                    var9_9 = 0x43340000;
                    var10_10 = 180.0f;
                    var34_36 = Float.compare(var35_38, var10_10);
                    if (var34_36 == 0) lbl-1000:
                    // 2 sources

                    {
                        var13_13 = 180;
                    } else {
                        var35_38 = var3_3.zzu;
                        var9_9 = -1028390912;
                        var10_10 = -90.0f;
                        var34_36 = Float.compare(var35_38, var10_10);
                        if (var34_36 == 0) {
                            var13_13 = 270;
                        } else lbl-1000:
                        // 3 sources

                        {
                            var13_13 = var32_34;
                        }
                    }
                }
                var34_36 = var3_3.zzl;
                var33_35.zzac(var34_36);
                var34_36 = var3_3.zzm;
                var33_35.zzI(var34_36);
                var33_35.zzT(var12_12);
                var33_35.zzW(var13_13);
                var19_19 = var3_3.zzv;
                var33_35.zzU((byte[])var19_19);
                var34_36 = var3_3.zzw;
                var33_35.zzaa(var34_36);
                var33_35.zzA((zzt)var23_23);
                var34_36 = 2;
                var35_38 = 2.8E-45f;
                break block102;
            }
            var24_24 = "application/x-subrip";
            var32_34 = (int)var24_24.equals(var22_22);
            if (var32_34 != 0 || (var32_34 = (int)(var24_24 = "text/x-ssa").equals(var22_22)) != 0 || (var32_34 = (int)(var24_24 = "text/vtt").equals(var22_22)) != 0 || (var32_34 = (int)var17_17.equals(var22_22)) != 0 || (var32_34 = (int)var18_18.equals(var22_22)) != 0 || (var34_36 = (int)var19_19.equals(var22_22)) != 0) {
                var34_36 = 3;
                var35_39 = 4.2E-45f;
            } else {
                throw zzch.zza("Unexpected MIME type.", null);
            }
        }
        var24_24 = var3_3.zza;
        if (var24_24 != null && (var32_34 = (int)(var24_24 = zzaiy.zza()).containsKey(var36_40 = var3_3.zza)) == 0) {
            var24_24 = var3_3.zza;
            var33_35.zzM((String)var24_24);
        }
        var32_34 = var2_2;
        var33_35.zzJ(var2_2);
        var33_35.zzX((String)var22_22);
        var33_35.zzP(var5_5);
        var16_16 = var3_3.zzZ;
        var33_35.zzO((String)var16_16);
        var33_35.zzZ(var7_7);
        var33_35.zzL((List)var4_4);
        var33_35.zzz((String)var25_25);
        var4_4 = var3_3.zzk;
        var33_35.zzE((zzae)var4_4);
        var4_4 = var33_35.zzad();
        var5_5 = var3_3.zzc;
        var25_25 = var1_1;
        var3_3.zzW = var16_16 = var1_1.zzw(var5_5, var34_36);
        var16_16.zzl((zzan)var4_4);
    }
}

