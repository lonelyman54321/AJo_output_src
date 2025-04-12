/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzair;
import com.google.android.gms.internal.ads.zzais;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzaiw;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzaiz;
import com.google.android.gms.internal.ads.zzaja;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfl;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzfxs;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgr;
import com.google.android.gms.internal.ads.zzo;
import com.google.android.gms.internal.ads.zzt;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class zzaiy
implements zzadu {
    public static final zzaea zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private zzaix zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzfl zzK;
    private zzfl zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadx zzaj;
    private final zzait zzh;
    private final zzaja zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzalt zzl;
    private final zzfu zzm;
    private final zzfu zzn;
    private final zzfu zzo;
    private final zzfu zzp;
    private final zzfu zzq;
    private final zzfu zzr;
    private final zzfu zzs;
    private final zzfu zzt;
    private final zzfu zzu;
    private final zzfu zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        byte[] byArray;
        HashMap hashMap = new HashMap();
        zza = hashMap;
        int n3 = 32;
        byte[] byArray2 = byArray = new byte[n3];
        byte[] byArray3 = byArray;
        byArray2[0] = 49;
        byArray3[1] = 10;
        byArray2[2] = 48;
        byArray3[3] = 48;
        byArray2[4] = 58;
        byArray3[5] = 48;
        byArray2[6] = 48;
        byArray3[7] = 58;
        byArray2[8] = 48;
        byArray3[9] = 48;
        byArray2[10] = 44;
        byArray3[11] = 48;
        byArray2[12] = 48;
        byArray3[13] = 48;
        byArray2[14] = 32;
        byArray3[15] = 45;
        byArray2[16] = 45;
        byArray3[17] = 62;
        byArray2[18] = 32;
        byArray3[19] = 48;
        byArray2[20] = 48;
        byArray3[21] = 58;
        byArray2[22] = 48;
        byArray3[23] = 48;
        byArray2[24] = 58;
        byArray3[25] = 48;
        byArray2[26] = 48;
        byArray3[27] = 44;
        byArray2[28] = 48;
        byArray3[29] = 48;
        byArray2[30] = 48;
        byArray3[31] = 10;
        zzb = byArray;
        Charset charset = zzfxs.zzc;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(charset);
        hashMap = (HashMap)new byte[n3];
        HashMap hashMap2 = hashMap;
        hashMap2[0] = 68;
        hashMap2[1] = 105;
        hashMap2[2] = 97;
        hashMap2[3] = 108;
        hashMap2[4] = 111;
        hashMap2[5] = 103;
        hashMap2[6] = 117;
        hashMap2[7] = 101;
        hashMap2[8] = 58;
        hashMap2[9] = 32;
        hashMap2[10] = 48;
        hashMap2[11] = 58;
        hashMap2[12] = 48;
        hashMap2[13] = 48;
        hashMap2[14] = 58;
        hashMap2[15] = 48;
        hashMap2[16] = 48;
        hashMap2[17] = 58;
        hashMap2[18] = 48;
        hashMap2[19] = 48;
        hashMap2[20] = 44;
        hashMap2[21] = 48;
        hashMap2[22] = 58;
        hashMap2[23] = 48;
        hashMap2[24] = 48;
        hashMap2[25] = 58;
        hashMap2[26] = 48;
        hashMap2[27] = 48;
        hashMap2[28] = 58;
        hashMap2[29] = 48;
        hashMap2[30] = 48;
        hashMap2[31] = 44;
        zzd = (byte[])hashMap;
        HashMap hashMap3 = hashMap = (HashMap)new byte[38];
        hashMap3[0] = 87;
        hashMap3[1] = 69;
        hashMap3[2] = 66;
        hashMap3[3] = 86;
        hashMap3[4] = 84;
        hashMap3[5] = 84;
        hashMap3[6] = 10;
        hashMap3[7] = 10;
        hashMap3[8] = 48;
        hashMap3[9] = 48;
        hashMap3[10] = 58;
        hashMap3[11] = 48;
        hashMap3[12] = 48;
        hashMap3[13] = 58;
        hashMap3[14] = 48;
        hashMap3[15] = 48;
        hashMap3[16] = 46;
        hashMap3[17] = 48;
        hashMap3[18] = 48;
        hashMap3[19] = 48;
        hashMap3[20] = 32;
        hashMap3[21] = 45;
        hashMap3[22] = 45;
        hashMap3[23] = 62;
        hashMap3[24] = 32;
        hashMap3[25] = 48;
        hashMap3[26] = 48;
        hashMap3[27] = 58;
        hashMap3[28] = 48;
        hashMap3[29] = 48;
        hashMap3[30] = 58;
        hashMap3[31] = 48;
        hashMap3[32] = 48;
        hashMap3[33] = 46;
        hashMap3[34] = 48;
        hashMap3[35] = 48;
        hashMap3[36] = 48;
        hashMap3[37] = 10;
        zze = (byte[])hashMap;
        hashMap = new HashMap(0x100000000001000L, -9223371306706625679L);
        zzf = hashMap;
        hashMap = new HashMap();
        cy_1.a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        cy_1.a(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzaiy() {
        zzair zzair2 = new zzair();
        zzalt zzalt2 = zzalt.zza;
        this(zzair2, 2, zzalt2);
    }

    public zzaiy(zzait object, int n3, zzalt zzalt2) {
        long l2;
        long l3;
        this.zzy = l3 = (long)-1;
        this.zzz = l2 = -9223372036854775807L;
        this.zzA = l2;
        this.zzB = l2;
        this.zzH = l3;
        this.zzI = l3;
        this.zzJ = l2;
        this.zzh = object;
        Object object2 = new zzaiw(this, null);
        object.zza((zzais)object2);
        this.zzl = zzalt2;
        int n4 = 1;
        this.zzk = n4;
        this.zzi = object2 = new zzaja();
        object2 = new SparseArray();
        this.zzj = object2;
        int n7 = 4;
        this.zzo = object2 = new zzfu(n7);
        byte[] byArray = ByteBuffer.allocate(n7).putInt(-1).array();
        this.zzp = object2 = new zzfu(byArray);
        this.zzq = object2 = new zzfu(n7);
        byArray = zzgr.zza;
        this.zzm = object2 = new zzfu(byArray);
        this.zzn = object2 = new zzfu(n7);
        this.zzr = object2 = new zzfu();
        this.zzs = object2 = new zzfu();
        this.zzt = object2 = new zzfu(8);
        this.zzu = object2 = new zzfu();
        this.zzv = object2 = new zzfu();
        object = new int[n4];
        this.zzT = (int[])object;
    }

    public zzaiy(zzalt zzalt2, int n3) {
        zzair zzair2 = new zzair();
        this(zzair2, 2, zzalt2);
    }

    public static /* bridge */ /* synthetic */ Map zza() {
        return zzg;
    }

    public static /* bridge */ /* synthetic */ UUID zzg() {
        return zzf;
    }

    public static /* bridge */ /* synthetic */ byte[] zzn() {
        return zzc;
    }

    /*
     * WARNING - void declaration
     */
    private final int zzo(zzadv object, zzaix object2, int n3, boolean n4) {
        int n7;
        zzfu zzfu2;
        Object object3;
        Object object4;
        int n8;
        int n10;
        Object object5 = "S_TEXT/UTF8";
        Object object6 = ((zzaix)object2).zzb;
        boolean bl2 = ((String)object5).equals(object6);
        if (bl2) {
            object2 = zzb;
            this.zzw((zzadv)object, (byte[])object2, n3);
            int n14 = this.zzab;
            this.zzv();
            return n14;
        }
        object5 = "S_TEXT/ASS";
        object6 = ((zzaix)object2).zzb;
        bl2 = ((String)object5).equals(object6);
        if (bl2) {
            object2 = zzd;
            this.zzw((zzadv)object, (byte[])object2, n3);
            int n15 = this.zzab;
            this.zzv();
            return n15;
        }
        object5 = "S_TEXT/WEBVTT";
        object6 = ((zzaix)object2).zzb;
        bl2 = ((String)object5).equals(object6);
        if (bl2) {
            object2 = zze;
            this.zzw((zzadv)object, (byte[])object2, n3);
            int n16 = this.zzab;
            this.zzv();
            return n16;
        }
        object6 = ((zzaix)object2).zzW;
        boolean s7 = this.zzad;
        int n14 = 2;
        int n15 = 4;
        int n16 = 1;
        if (!s7) {
            boolean bl3;
            boolean bl4 = ((zzaix)object2).zzg;
            if (bl4) {
                byte by2;
                Object object7;
                int n17;
                this.zzW = n17 = this.zzW & 0xBFFFFFFF;
                boolean bl5 = this.zzae;
                n10 = 128;
                if (!bl5) {
                    int n18;
                    object5 = this.zzo.zzM();
                    object7 = object;
                    object7 = (zzadi)object;
                    ((zzadi)object7).zzn((byte[])object5, 0, n16, false);
                    this.zzaa = n18 = this.zzaa + n16;
                    object5 = this.zzo.zzM();
                    int n19 = object5[0] & n10;
                    if (n19 != n10) {
                        object5 = this.zzo.zzM();
                        Object object8 = object5[0];
                        this.zzah = (byte)object8;
                        this.zzae = n16;
                    } else {
                        throw zzch.zza("Extension bit is set in signal byte", null);
                    }
                }
                if ((n8 = (by2 = this.zzah) & 1) == n16) {
                    int n20;
                    int n21 = by2 & n14;
                    n8 = this.zzW;
                    int n22 = 0x40000000;
                    this.zzW = n8 |= n22;
                    n8 = (int)(this.zzai ? 1 : 0);
                    if (n8 == 0) {
                        object7 = this.zzt.zzM();
                        object4 = object;
                        object4 = (zzadi)object;
                        n20 = 8;
                        ((zzadi)object4).zzn((byte[])object7, 0, n20, false);
                        this.zzaa = n8 = this.zzaa + n20;
                        this.zzai = n16;
                        object7 = this.zzo;
                        if (n21 != n14) {
                            n10 = 0;
                            object3 = null;
                        }
                        n10 |= n20;
                        object7 = ((zzfu)object7).zzM();
                        n10 = (byte)n10;
                        object7[0] = n10;
                        this.zzo.zzK(0);
                        object3 = this.zzo;
                        object6.zzr((zzfu)object3, n16, n16);
                        this.zzab = n10 = this.zzab + n16;
                        this.zzt.zzK(0);
                        object3 = this.zzt;
                        object6.zzr((zzfu)object3, n20, n16);
                        this.zzab = n10 = this.zzab + n20;
                    }
                    if (n21 == n14) {
                        int n24;
                        void var9_28;
                        boolean bl6 = this.zzaf;
                        if (!bl6) {
                            int n25;
                            int n26;
                            object5 = this.zzo.zzM();
                            object3 = object;
                            object3 = (zzadi)object;
                            ((zzadi)object3).zzn((byte[])object5, 0, n16, false);
                            this.zzaa = n26 = this.zzaa + n16;
                            this.zzo.zzK(0);
                            object5 = this.zzo;
                            this.zzag = n25 = ((zzfu)object5).zzm();
                            this.zzaf = n16;
                        }
                        int n27 = this.zzag * 4;
                        this.zzo.zzH(n27);
                        object3 = this.zzo.zzM();
                        object7 = object;
                        ((zzadi)object).zzn((byte[])object3, 0, n27, false);
                        this.zzaa = n10 = this.zzaa + n27;
                        int n28 = (this.zzag >> n16) + n16;
                        n10 = n28 * 6 + n14;
                        object7 = this.zzw;
                        if (object7 == null || (n8 = ((Buffer)object7).capacity()) < n10) {
                            this.zzw = object7 = ByteBuffer.allocate(n10);
                        }
                        short s8 = (short)n28;
                        this.zzw.position(0);
                        this.zzw.putShort(s8);
                        boolean bl7 = false;
                        object5 = null;
                        n8 = 0;
                        object7 = null;
                        while (var9_28 < (n22 = this.zzag)) {
                            ByteBuffer byteBuffer;
                            object4 = this.zzo;
                            n22 = ((zzfu)object4).zzp();
                            n8 = n22 - n8;
                            n20 = var9_28 % 2;
                            if (n20 == 0) {
                                byteBuffer = this.zzw;
                                n8 = (short)n8;
                                byteBuffer.putShort((short)n8);
                            } else {
                                byteBuffer = this.zzw;
                                byteBuffer.putInt(n8);
                            }
                            ++var9_28;
                            n8 = n22;
                        }
                        int n30 = this.zzaa;
                        n30 = n3 - n30 - n8;
                        n8 = n22 & 1;
                        if (n8 == n16) {
                            object7 = this.zzw;
                            ((ByteBuffer)object7).putInt(n30);
                        } else {
                            object7 = this.zzw;
                            short s10 = (short)n30;
                            ((ByteBuffer)object7).putShort(s10);
                            object5 = this.zzw;
                            ((ByteBuffer)object5).putInt(0);
                        }
                        object5 = this.zzu;
                        object7 = this.zzw.array();
                        ((zzfu)object5).zzI((byte[])object7, n10);
                        object5 = this.zzu;
                        object6.zzr((zzfu)object5, n10, n16);
                        this.zzab = n24 = this.zzab + n10;
                    }
                }
            } else {
                object5 = ((zzaix)object2).zzh;
                if (object5 != null) {
                    object3 = this.zzr;
                    n8 = ((Object)object5).length;
                    ((zzfu)object3).zzI((byte[])object5, n8);
                }
            }
            if ((bl3 = ((String)(object3 = "A_OPUS")).equals(object5 = ((zzaix)object2).zzb)) ? n4 != 0 : (n4 = ((zzaix)object2).zzf) > 0) {
                this.zzW = n4 = this.zzW | 0x10000000;
                this.zzv.zzH(0);
                n4 = this.zzr.zze() + n3;
                int n32 = this.zzaa;
                this.zzo.zzH(n15);
                object5 = this.zzo;
                n10 = (n4 -= n32) >> 24;
                object5 = ((zzfu)object5).zzM();
                n10 = (byte)(n10 & 0xFF);
                object5[0] = n10;
                object5 = this.zzo.zzM();
                n10 = (byte)(n4 >> 16 & 0xFF);
                object5[n16] = n10;
                object5 = this.zzo;
                n10 = n4 >> 8;
                object5 = ((zzfu)object5).zzM();
                n10 = (byte)(n10 & 0xFF);
                object5[n14] = n10;
                object5 = this.zzo.zzM();
                n4 = (byte)(n4 & 0xFF);
                n10 = 3;
                object5[n10] = n4;
                zzfu2 = this.zzo;
                object6.zzr(zzfu2, n15, n14);
                this.zzab = n4 = this.zzab + n15;
            }
            this.zzad = n16;
        }
        zzfu2 = this.zzr;
        n4 = zzfu2.zze() + n3;
        object5 = "V_MPEG4/ISO/AVC";
        Object object9 = ((zzaix)object2).zzb;
        n3 = (int)(((String)object5).equals(object9) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(((String)(object5 = "V_MPEGH/ISO/HEVC")).equals(object9 = ((zzaix)object2).zzb) ? 1 : 0)) == 0) {
            object9 = ((zzaix)object2).zzT;
            if (object9 != null) {
                object9 = this.zzr;
                n3 = ((zzfu)object9).zze();
                if (n3 != 0) {
                    n16 = 0;
                    Object var23_50 = null;
                }
                zzeq.zzf(n16 != 0);
                object9 = ((zzaix)object2).zzT;
                ((zzafb)object9).zzd((zzadv)object);
            }
            while ((n3 = this.zzaa) < n4) {
                int n34;
                n3 = n4 - n3;
                n3 = this.zzp((zzadv)object, (zzafa)object6, n3);
                this.zzaa = n34 = this.zzaa + n3;
                this.zzab = n34 = this.zzab + n3;
            }
        } else {
            object9 = this.zzn.zzM();
            object9[0] = false;
            object9[n16] = false;
            object9[n14] = false;
            int n35 = ((zzaix)object2).zzX;
            n14 = 4 - n35;
            while ((n16 = this.zzaa) < n4) {
                n16 = this.zzac;
                if (n16 == 0) {
                    zzfu zzfu3 = this.zzr;
                    n16 = zzfu3.zzb();
                    n16 = Math.min(n35, n16);
                    n10 = n14 + n16;
                    n8 = n35 - n16;
                    object4 = object;
                    object4 = (zzadi)object;
                    ((zzadi)object4).zzn((byte[])object9, n10, n8, false);
                    if (n16 > 0) {
                        object3 = this.zzr;
                        ((zzfu)object3).zzG((byte[])object9, n14, n16);
                    }
                    this.zzaa = n16 = this.zzaa + n35;
                    this.zzn.zzK(0);
                    this.zzac = n16 = this.zzn.zzp();
                    this.zzm.zzK(0);
                    zzfu3 = this.zzm;
                    zzaey.zzb((zzafa)object6, zzfu3, n15);
                    this.zzab = n16 = this.zzab + n15;
                    continue;
                }
                n16 = this.zzp((zzadv)object, (zzafa)object6, n16);
                this.zzaa = n10 = this.zzaa + n16;
                this.zzab = n10 = this.zzab + n16;
                this.zzac = n10 = this.zzac - n16;
            }
        }
        if ((n7 = ((String)(object2 = "A_VORBIS")).equals(object = ((zzaix)object2).zzb)) != 0) {
            this.zzp.zzK(0);
            object = this.zzp;
            zzaey.zzb((zzafa)object6, (zzfu)object, n15);
            this.zzab = n7 = this.zzab + n15;
        }
        n7 = this.zzab;
        this.zzv();
        return n7;
    }

    private final int zzp(zzadv zzadv2, zzafa zzafa2, int n3) {
        int n4;
        zzfu zzfu2 = this.zzr;
        int n7 = zzfu2.zzb();
        if (n7 > 0) {
            n4 = Math.min(n3, n7);
            zzfu zzfu3 = this.zzr;
            zzaey.zzb(zzafa2, zzfu3, n4);
        } else {
            n7 = 0;
            zzfu2 = null;
            n4 = zzaey.zza(zzafa2, zzadv2, n3, false);
        }
        return n4;
    }

    private final long zzq(long l2) {
        long l3 = this.zzz;
        long l4 = -9223372036854775807L;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            RoundingMode roundingMode = RoundingMode.FLOOR;
            l4 = l2;
            return zzgd.zzt(l2, l3, 1000L, roundingMode);
        }
        throw zzch.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzr(int n3) {
        Object object = this.zzK;
        if (object != null && (object = this.zzL) != null) {
            return;
        }
        object = new StringBuilder("Element ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" must be in a Cues");
        throw zzch.zza(((StringBuilder)object).toString(), null);
    }

    private final void zzs(int n3) {
        Object object = this.zzC;
        if (object != null) {
            return;
        }
        object = new StringBuilder("Element ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" must be in a TrackEntry");
        throw zzch.zza(((StringBuilder)object).toString(), null);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void zzt(zzaix var1_1, long var2_2, int var4_3, int var5_4, int var6_5) {
        block9: {
            block13: {
                block18: {
                    block17: {
                        block16: {
                            block14: {
                                block15: {
                                    block12: {
                                        block10: {
                                            block11: {
                                                block8: {
                                                    var7_6 = this;
                                                    var8_7 = var1_1;
                                                    var9_8 = var1_1.zzT;
                                                    var10_9 = 1;
                                                    if (var9_8 == null) break block8;
                                                    var11_10 = var1_1.zzW;
                                                    var12_12 = var1_1.zzi;
                                                    var8_7 = var9_8;
                                                    var9_8 = var11_10;
                                                    var13_14 = var2_2;
                                                    var15_16 = var4_3;
                                                    var16_18 = var5_4;
                                                    var8_7.zzc(var11_10, var2_2, var4_3, var5_4, var6_5, var12_12);
                                                    break block9;
                                                }
                                                var9_8 = var1_1.zzb;
                                                var11_11 = "S_TEXT/UTF8";
                                                var17_20 = var11_11.equals(var9_8);
                                                var18_21 = "S_TEXT/WEBVTT";
                                                var19_22 = "S_TEXT/ASS";
                                                var16_19 = 2;
                                                if (var17_20 == 0 && (var17_20 = (int)var19_22.equals(var9_8 = var1_1.zzb)) == 0 && (var17_20 = (int)var18_21.equals(var9_8 = var1_1.zzb)) == 0) break block10;
                                                var17_20 = var7_6.zzS;
                                                var12_13 = "MatroskaExtractor";
                                                if (var17_20 <= var10_9) break block11;
                                                var9_8 = "Skipping subtitle sample in laced block.";
                                                zzfk.zzf((String)var12_13, (String)var9_8);
                                                break block10;
                                            }
                                            var20_23 = var7_6.zzQ;
                                            var22_24 = -9223372036854775807L;
                                            cfr_temp_0 = var20_23 - var22_24;
                                            var17_20 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                            if (var17_20 != 0) break block12;
                                            var9_8 = "Skipping subtitle sample with no duration.";
                                            zzfk.zzf((String)var12_13, (String)var9_8);
                                        }
                                        var17_20 = var5_4;
                                        break block13;
                                    }
                                    var9_8 = var8_7.zzb;
                                    var12_13 = var7_6.zzs.zzM();
                                    var24_25 = var9_8.hashCode();
                                    if (var24_25 == (var25_26 = 738597099)) break block14;
                                    var15_17 = 1045209816;
                                    if (var24_25 == var15_17) break block15;
                                    var26_27 = 1422270023;
                                    if (var24_25 != var26_27 || (var17_20 = (int)var9_8.equals(var11_11)) == 0) ** GOTO lbl-1000
                                    var17_20 = 0;
                                    var9_8 = null;
                                    break block16;
                                }
                                var17_20 = (int)var9_8.equals(var18_21);
                                if (var17_20 == 0) ** GOTO lbl-1000
                                var17_20 = 2;
                                break block16;
                            }
                            var17_20 = (int)var9_8.equals(var19_22);
                            if (var17_20 != 0) {
                                var17_20 = 1;
                            } else lbl-1000:
                            // 3 sources

                            {
                                var17_20 = -1;
                            }
                        }
                        var13_15 = 1000L;
                        if (var17_20 == 0) break block17;
                        if (var17_20 == var10_9) ** GOTO lbl73
                        if (var17_20 == var16_19) {
                            var9_8 = zzaiy.zzx(var20_23, "%02d:%02d:%02d.%03d", var13_15);
                            var27_28 /* !! */  = 25;
                        } else {
                            var8_7 = new IllegalArgumentException();
                            throw var8_7;
lbl73:
                            // 1 sources

                            var13_15 = 10000L;
                            var9_8 = zzaiy.zzx(var20_23, "%01d:%02d:%02d:%02d", var13_15);
                            var27_28 /* !! */  = 21;
                        }
                        break block18;
                    }
                    var9_8 = zzaiy.zzx(var20_23, "%02d:%02d:%02d,%03d", var13_15);
                    var27_28 /* !! */  = 19;
                }
                var26_27 = ((Object)var9_8).length;
                System.arraycopy(var9_8, 0, var12_13, var27_28 /* !! */ , var26_27);
                var9_8 = var7_6.zzs;
                for (var17_20 = var9_8.zzd(); var17_20 < (var27_28 /* !! */  = (var11_11 = var7_6.zzs).zze()); ++var17_20) {
                    var11_11 = var7_6.zzs.zzM();
                    var27_28 /* !! */  = (int)var11_11[var17_20];
                    if (var27_28 /* !! */  != 0) continue;
                    var11_11 = var7_6.zzs;
                    var11_11.zzJ(var17_20);
                    break;
                }
                var9_8 = var8_7.zzW;
                var11_11 = var7_6.zzs;
                var26_27 = var11_11.zze();
                zzaey.zzb((zzafa)var9_8, (zzfu)var11_11, var26_27);
                var9_8 = var7_6.zzs;
                var17_20 = var9_8.zze() + var5_4;
            }
            var27_28 /* !! */  = var4_3 & 0x10000000;
            if (var27_28 /* !! */  != 0) {
                var27_28 /* !! */  = var7_6.zzS;
                if (var27_28 /* !! */  > var10_9) {
                    var11_11 = var7_6.zzv;
                    var11_11.zzH(0);
                } else {
                    var11_11 = var7_6.zzv;
                    var27_28 /* !! */  = var11_11.zze();
                    var18_21 = var8_7.zzW;
                    var19_22 = var7_6.zzv;
                    var18_21.zzr((zzfu)var19_22, var27_28 /* !! */ , var16_19);
                    var17_20 += var27_28 /* !! */ ;
                }
            }
            var28_29 = var8_7.zzW;
            var8_7 = var8_7.zzi;
            var25_26 = var4_3;
            var28_29.zzs(var2_2, var4_3, var17_20, var6_5, (zzaez)var8_7);
        }
        var7_6.zzN = var10_9;
    }

    private final void zzu(zzadv zzadv2, int n3) {
        zzfu zzfu2 = this.zzo;
        int n4 = zzfu2.zze();
        if (n4 >= n3) {
            return;
        }
        zzfu2 = this.zzo;
        n4 = zzfu2.zzc();
        if (n4 < n3) {
            zzfu2 = this.zzo;
            int n7 = zzfu2.zzc();
            n7 = Math.max(n7 + n7, n3);
            zzfu2.zzE(n7);
        }
        zzfu2 = this.zzo;
        byte[] byArray = zzfu2.zzM();
        int n8 = zzfu2.zze();
        n4 = zzfu2.zze();
        n4 = n3 - n4;
        ((zzadi)zzadv2).zzn(byArray, n8, n4, false);
        this.zzo.zzJ(n3);
    }

    private final void zzv() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzw(zzadv zzadv2, byte[] byArray, int n3) {
        int n4 = byArray.length;
        int n7 = n4 + n3;
        Object object = this.zzs;
        int n8 = ((zzfu)object).zzc();
        if (n8 < n7) {
            object = this.zzs;
            int n10 = n7 + n3;
            byArray = Arrays.copyOf(byArray, n10);
            n10 = byArray.length;
            ((zzfu)object).zzI(byArray, n10);
        } else {
            object = this.zzs.zzM();
            System.arraycopy(byArray, 0, object, 0, n4);
        }
        byArray = this.zzs.zzM();
        ((zzadi)zzadv2).zzn(byArray, n4, n3, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(n7);
    }

    private static byte[] zzx(long l2, String string2, long l3) {
        int n3 = 1;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        zzeq.zzd(bl2);
        l4 = 3600000000L;
        long l8 = l2 / l4;
        Locale locale = Locale.US;
        int n4 = (int)l8;
        Integer n7 = n4;
        long l12 = (long)n4 * l4;
        l4 = 60000000L;
        n4 = (int)((l2 -= l12) / l4);
        Integer n8 = n4;
        long l14 = (long)n4 * l4;
        l4 = 1000000L;
        n4 = (int)((l2 -= l14) / l4);
        Integer n10 = n4;
        long l15 = (long)n4 * l4;
        Object object2 = (int)((l2 - l15) / l3);
        Object object3 = new Object[4];
        object3[0] = n7;
        object3[n3] = n8;
        object3[2] = n10;
        object3[3] = object2;
        object2 = String.format(locale, string2, object3);
        object3 = zzfxs.zzc;
        return ((String)object2).getBytes((Charset)object3);
    }

    private static int[] zzy(int[] nArray, int n3) {
        if (nArray == null) {
            return new int[n3];
        }
        int n4 = nArray.length;
        if (n4 >= n3) {
            return nArray;
        }
        return new int[Math.max(n4 + n4, n3)];
    }

    public final int zzb(zzadv object, zzaeq object2) {
        boolean bl2;
        int n3 = 0;
        this.zzN = false;
        while (!(bl2 = this.zzN)) {
            int n4;
            Object object3 = this.zzh;
            bl2 = object3.zzc((zzadv)object);
            if (bl2) {
                long l2 = object.zzf();
                boolean bl3 = this.zzG;
                if (bl3) {
                    this.zzI = l2;
                    ((zzaeq)object2).zza = l2 = this.zzH;
                    this.zzG = false;
                } else {
                    long l3;
                    long l4;
                    long l7;
                    bl2 = this.zzD;
                    if (!bl2 || (l7 = (l4 = (l2 = this.zzI) - (l3 = (long)-1)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                    ((zzaeq)object2).zza = l2;
                    this.zzI = l3;
                }
                return 1;
            }
            while (n3 < (n4 = (object = this.zzj).size())) {
                object = (zzaix)this.zzj.valueAt(n3);
                zzaix.zzd((zzaix)object);
                object2 = ((zzaix)object).zzT;
                if (object2 != null) {
                    object3 = ((zzaix)object).zzW;
                    object = ((zzaix)object).zzi;
                    ((zzafb)object2).zza((zzafa)object3, (zzaez)object);
                }
                ++n3;
            }
            return -1;
        }
        return 0;
    }

    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    public final void zzd(zzadx zzadx2) {
        this.zzaj = zzadx2;
    }

    public final void zze(long l2, long l3) {
        int n3;
        this.zzJ = l2 = -9223372036854775807L;
        this.zzO = 0;
        this.zzh.zzb();
        Object object = this.zzi;
        ((zzaja)object).zze();
        this.zzv();
        for (int i3 = 0; i3 < (n3 = (object = this.zzj).size()); ++i3) {
            object = ((zzaix)this.zzj.valueAt((int)i3)).zzT;
            if (object == null) continue;
            ((zzafb)object).zzb();
        }
    }

    public final boolean zzf(zzadv zzadv2) {
        zzaiz zzaiz2 = new zzaiz();
        return zzaiz2.zza(zzadv2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zzh(int var1_1, int var2_2, zzadv var3_3) {
        block30: {
            block31: {
                block36: {
                    block33: {
                        block35: {
                            block34: {
                                block32: {
                                    block29: {
                                        var4_4 = this;
                                        var5_5 /* !! */  = var1_1;
                                        var6_6 = var2_2;
                                        var7_7 = var3_3;
                                        var8_8 /* !! */  = 161;
                                        var9_9 /* !! */  = 0;
                                        var10_10 = 4;
                                        var11_11 = 163;
                                        var12_12 = 2;
                                        var13_13 = 1;
                                        if (var1_1 == var8_8 /* !! */  || var1_1 == var11_11) break block29;
                                        var8_8 /* !! */  = 165;
                                        if (var1_1 != var8_8 /* !! */ ) {
                                            var8_8 /* !! */  = 16877;
                                            if (var1_1 != var8_8 /* !! */ ) {
                                                var8_8 /* !! */  = 16981;
                                                if (var1_1 != var8_8 /* !! */ ) {
                                                    var8_8 /* !! */  = 18402;
                                                    if (var1_1 != var8_8 /* !! */ ) {
                                                        var8_8 /* !! */  = 21419;
                                                        if (var1_1 != var8_8 /* !! */ ) {
                                                            var8_8 /* !! */  = 25506;
                                                            if (var1_1 != var8_8 /* !! */ ) {
                                                                var8_8 /* !! */  = 30322;
                                                                if (var1_1 == var8_8 /* !! */ ) {
                                                                    this.zzs(var1_1);
                                                                    var14_14 = this.zzC;
                                                                    var15_22 = new byte[var2_2];
                                                                    var14_14.zzv = var15_22;
                                                                    var14_14 = var3_3;
                                                                    ((zzadi)var3_3).zzn(var15_22, 0, var2_2, false);
                                                                    return;
                                                                }
                                                                var16_29 = new StringBuilder("Unexpected id: ");
                                                                var16_29.append(var1_1);
                                                                throw zzch.zza(var16_29.toString(), null);
                                                            }
                                                            this.zzs(var1_1);
                                                            var14_15 = this.zzC;
                                                            var15_23 = new byte[var2_2];
                                                            var14_15.zzj = var15_23;
                                                            var14_15 = var3_3;
                                                            ((zzadi)var3_3).zzn(var15_23, 0, var2_2, false);
                                                            return;
                                                        }
                                                        Arrays.fill(this.zzq.zzM(), (byte)0);
                                                        var14_16 = this.zzq;
                                                        var8_8 /* !! */  = 4 - var2_2;
                                                        var14_16 = var14_16.zzM();
                                                        ((zzadi)var3_3).zzn((byte[])var14_16, var8_8 /* !! */ , var2_2, false);
                                                        this.zzq.zzK(0);
                                                        this.zzE = var6_6 = (int)this.zzq.zzu();
                                                        return;
                                                    }
                                                    var15_24 = new byte[var2_2];
                                                    ((zzadi)var3_3).zzn(var15_24, 0, var2_2, false);
                                                    this.zzs(var1_1);
                                                    var14_17 = this.zzC;
                                                    var14_17.zzi = var16_30 = new zzaez(var13_13, var15_24, 0, 0);
                                                    return;
                                                }
                                                this.zzs(var1_1);
                                                var14_18 = this.zzC;
                                                var15_25 = new byte[var2_2];
                                                var14_18.zzh = var15_25;
                                                var14_18 = var3_3;
                                                ((zzadi)var3_3).zzn(var15_25, 0, var2_2, false);
                                                return;
                                            }
                                            this.zzs(var1_1);
                                            var14_19 = this.zzC;
                                            var8_8 /* !! */  = zzaix.zza((zzaix)var14_19);
                                            var9_9 /* !! */  = 1685485123;
                                            if (var8_8 /* !! */  != var9_9 /* !! */  && (var8_8 /* !! */  = zzaix.zza((zzaix)var14_19)) != (var9_9 /* !! */  = 1685480259)) {
                                                var14_19 = var3_3;
                                                ((zzadi)var3_3).zzo(var2_2, false);
                                                return;
                                            }
                                            var15_26 = new byte[var6_6];
                                            var14_19.zzN = var15_26;
                                            var14_19 = var7_7;
                                            ((zzadi)var7_7).zzn(var15_26, 0, var6_6, false);
                                            return;
                                        }
                                        var5_5 /* !! */  = this.zzO;
                                        if (var5_5 /* !! */  == var12_12) {
                                            var14_20 /* !! */  = this.zzj;
                                            var8_8 /* !! */  = this.zzU;
                                            var14_20 /* !! */  = (zzaix)var14_20 /* !! */ .get(var8_8 /* !! */ );
                                            var8_8 /* !! */  = this.zzX;
                                            if (var8_8 /* !! */  == var10_10 && (var5_5 /* !! */  = (int)(var15_27 = "V_VP9").equals(var14_20 /* !! */  = var14_20 /* !! */ .zzb)) != 0) {
                                                this.zzv.zzH(var2_2);
                                                var14_20 /* !! */  = (SparseArray)this.zzv.zzM();
                                                var15_27 = var3_3;
                                                ((zzadi)var3_3).zzn((byte[])var14_20 /* !! */ , 0, var2_2, false);
                                                return;
                                            }
                                            var14_20 /* !! */  = var7_7;
                                            ((zzadi)var7_7).zzo(var6_6, false);
                                            return;
                                        }
                                        break block30;
                                    }
                                    var8_8 /* !! */  = var4_4.zzO;
                                    var17_33 = 8;
                                    if (var8_8 /* !! */  == 0) {
                                        var4_4.zzU = var8_8 /* !! */  = (int)var4_4.zzi.zzd(var7_7, false, (boolean)var13_13, var17_33);
                                        var4_4.zzV = var8_8 /* !! */  = var4_4.zzi.zza();
                                        var4_4.zzQ = var18_34 = -9223372036854775807L;
                                        var4_4.zzO = var13_13;
                                        var15_28 /* !! */  = var4_4.zzo;
                                        var15_28 /* !! */ .zzH(0);
                                    }
                                    var15_28 /* !! */  = var4_4.zzj;
                                    var20_35 = var4_4.zzU;
                                    var21_36 /* !! */  = var15_28 /* !! */  = var15_28 /* !! */ .get(var20_35);
                                    var21_36 /* !! */  = (zzaix)var15_28 /* !! */ ;
                                    if (var21_36 /* !! */  == null) {
                                        var5_5 /* !! */  = var4_4.zzV;
                                        var5_5 /* !! */  = var6_6 - var5_5 /* !! */ ;
                                        var16_31 = var7_7;
                                        ((zzadi)var7_7).zzo(var5_5 /* !! */ , false);
                                        var4_4.zzO = 0;
                                        return;
                                    }
                                    zzaix.zzd((zzaix)var21_36 /* !! */ );
                                    var8_8 /* !! */  = var4_4.zzO;
                                    if (var8_8 /* !! */  != var13_13) break block31;
                                    var8_8 /* !! */  = 3;
                                    var4_4.zzu(var7_7, var8_8 /* !! */ );
                                    var22_37 /* !! */  = var4_4.zzo.zzM();
                                    var23_38 = (var22_37 /* !! */ [var12_12] & 6) >> var13_13;
                                    var24_39 = 255;
                                    if (var23_38 != 0) break block32;
                                    var4_4.zzS = var13_13;
                                    var15_28 /* !! */  = (SparseArray)zzaiy.zzy(var4_4.zzT, var13_13);
                                    var4_4.zzT = (int[])var15_28 /* !! */ ;
                                    var9_9 /* !! */  = var4_4.zzV;
                                    var6_6 = var6_6 - var9_9 /* !! */  + -3;
                                    var15_28 /* !! */ [0] = (SparseArray)var6_6;
                                    break block33;
                                }
                                var4_4.zzu(var7_7, var10_10);
                                var25_40 /* !! */  = var4_4.zzo.zzM();
                                var4_4.zzS = var26_41 = (var25_40 /* !! */ [var8_8 /* !! */ ] & var24_39) + var13_13;
                                var27_42 = zzaiy.zzy(var4_4.zzT, var26_41);
                                var4_4.zzT = var27_42;
                                if (var23_38 != var12_12) break block34;
                                var8_8 /* !! */  = var4_4.zzV;
                                var6_6 = var6_6 - var8_8 /* !! */  + -4;
                                var8_8 /* !! */  = var4_4.zzS;
                                Arrays.fill(var27_42, 0, var8_8 /* !! */ , var6_6 /= var8_8 /* !! */ );
                                break block33;
                            }
                            if (var23_38 != var13_13) break block35;
                            var15_28 /* !! */  = null;
                            var9_9 /* !! */  = 0;
                            var10_10 = 4;
                            block0: for (var8_8 /* !! */  = 0; var8_8 /* !! */  < (var23_38 = var4_4.zzS + -1); ++var8_8 /* !! */ ) {
                                var22_37 /* !! */  = (byte[])var4_4.zzT;
                                var22_37 /* !! */ [var8_8 /* !! */ ] = 0;
                                while (true) {
                                    var23_38 = var10_10 + 1;
                                    var4_4.zzu(var7_7, var23_38);
                                    var10_10 = var4_4.zzo.zzM()[var10_10] & var24_39;
                                    var25_40 /* !! */  = (byte[])var4_4.zzT;
                                    var25_40 /* !! */ [var8_8 /* !! */ ] = var28_43 = var25_40 /* !! */ [var8_8 /* !! */ ] + var10_10;
                                    if (var10_10 != var24_39) {
                                        var9_9 /* !! */  += var28_43;
                                        var10_10 = var23_38;
                                        continue block0;
                                    }
                                    var10_10 = var23_38;
                                }
                            }
                            var15_28 /* !! */  = (SparseArray)var4_4.zzT;
                            var26_41 = var4_4.zzV;
                            var6_6 = var6_6 - var26_41 - var10_10 - var9_9 /* !! */ ;
                            var15_28 /* !! */ [var23_38] = (SparseArray)var6_6;
                            break block33;
                        }
                        if (var23_38 != var8_8 /* !! */ ) break block36;
                        var15_28 /* !! */  = null;
                        var10_10 = 4;
                        var23_38 = 0;
                        var22_37 /* !! */  = null;
                        for (var8_8 /* !! */  = 0; var8_8 /* !! */  < (var26_41 = var4_4.zzS + -1); ++var8_8 /* !! */ ) {
                            var25_40 /* !! */  = (byte[])var4_4.zzT;
                            var25_40 /* !! */ [var8_8 /* !! */ ] = 0;
                            var26_41 = var10_10 + 1;
                            var4_4.zzu(var7_7, var26_41);
                            var29_44 /* !! */  = var4_4.zzo.zzM();
                            var11_11 = var29_44 /* !! */ [var10_10];
                            if (var11_11 != 0) {
                                block28: {
                                    var29_44 /* !! */  = null;
                                    for (var11_11 = 0; var11_11 < var17_33; ++var11_11) {
                                        var30_45 = 7 - var11_11;
                                        var12_12 = var13_13 << var30_45;
                                        var31_46 /* !! */  = var4_4.zzo.zzM();
                                        var13_13 = var31_46 /* !! */ [var10_10] & var12_12;
                                        if (var13_13 != 0) {
                                            var4_4.zzu(var7_7, var26_41 += var11_11);
                                            var31_46 /* !! */  = (byte[])var4_4.zzo;
                                            var32_47 = var10_10 + 1;
                                            var31_46 /* !! */  = var31_46 /* !! */ .zzM();
                                            var10_10 = var31_46 /* !! */ [var10_10] & var24_39;
                                            var33_48 = var10_10 &= (var12_12 ^= -1);
                                            var13_13 = var32_47;
                                            while (var13_13 < var26_41) {
                                                var33_48 <<= var17_33;
                                                var35_49 = var4_4.zzo;
                                                var36_50 = var13_13 + 1;
                                                var35_49 = var35_49.zzM();
                                                var12_12 = var35_49[var13_13] & var24_39;
                                                var37_51 = var26_41;
                                                var38_52 = var12_12;
                                                var33_48 |= var38_52;
                                                var13_13 = var36_50;
                                                var24_39 = 255;
                                            }
                                            var37_51 = var26_41;
                                            if (var8_8 /* !! */  > 0) {
                                                var11_11 = var11_11 * 7 + 6;
                                                var40_53 = 1L << var11_11;
                                                var38_52 = -1;
                                                var33_48 -= (var40_53 += var38_52);
                                            }
                                            break block28;
                                        }
                                        var9_9 /* !! */  = 0;
                                        var12_12 = 2;
                                        var13_13 = 1;
                                        var24_39 = 255;
                                    }
                                    var33_48 = 0L;
                                    var37_51 = var26_41;
                                }
                                if ((var24_39 = (int)((cfr_temp_0 = var33_48 - (var40_53 = 0x80000000L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) >= 0 && (var24_39 = (int)((cfr_temp_1 = var33_48 - (var40_53 = 0x7FFFFFFFL)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) <= 0) {
                                    var29_44 /* !! */  = (byte[])var4_4.zzT;
                                    var10_10 = (int)var33_48;
                                    if (var8_8 /* !! */  != 0) {
                                        var9_9 /* !! */  = var8_8 /* !! */  + -1;
                                        var9_9 /* !! */  = var29_44 /* !! */ [var9_9 /* !! */ ];
                                        var10_10 += var9_9 /* !! */ ;
                                    }
                                    var29_44 /* !! */ [var8_8 /* !! */ ] = var10_10;
                                    var23_38 += var10_10;
                                    var10_10 = var37_51;
                                    var9_9 /* !! */  = 0;
                                    var11_11 = 163;
                                    var12_12 = 2;
                                    var13_13 = 1;
                                    var24_39 = 255;
                                    continue;
                                }
                                throw zzch.zza("EBML lacing sample size out of range.", null);
                            }
                            throw zzch.zza("No valid varint length mask found", null);
                        }
                        var15_28 /* !! */  = (SparseArray)var4_4.zzT;
                        var9_9 /* !! */  = var4_4.zzV;
                        var6_6 = var6_6 - var9_9 /* !! */  - var10_10 - var23_38;
                        var15_28 /* !! */ [var26_41] = (SparseArray)var6_6;
                    }
                    var16_32 /* !! */  = var4_4.zzo.zzM();
                    var6_6 = var16_32 /* !! */ [0] << var17_33;
                    var15_28 /* !! */  = (SparseArray)var4_4.zzo.zzM();
                    var8_8 /* !! */  = (int)var15_28 /* !! */ [1];
                    var9_9 /* !! */  = 255;
                    var33_48 = var4_4.zzJ;
                    var42_54 = var6_6 | (var8_8 /* !! */  &= var9_9 /* !! */ );
                    var42_54 = var4_4.zzq(var42_54);
                    var4_4.zzP = var33_48 += var42_54;
                    var6_6 = var21_36 /* !! */ .zzd;
                    var8_8 /* !! */  = 2;
                    if (var6_6 == var8_8 /* !! */ ) ** GOTO lbl275
                    var6_6 = 163;
                    if (var5_5 /* !! */  != var6_6) ** GOTO lbl278
                    var14_21 = var4_4.zzo.zzM();
                    var5_5 /* !! */  = (int)var14_21[var8_8 /* !! */ ];
                    var6_6 = 128;
                    if ((var5_5 /* !! */  &= var6_6) == var6_6) {
                        var5_5 /* !! */  = 163;
lbl275:
                        // 2 sources

                        var9_9 /* !! */  = 1;
                    } else {
                        var5_5 /* !! */  = 163;
lbl278:
                        // 2 sources

                        var9_9 /* !! */  = 0;
                    }
                    var4_4.zzW = var9_9 /* !! */ ;
                    var4_4.zzO = var8_8 /* !! */ ;
                    var4_4.zzR = 0;
                    break block31;
                }
                throw zzch.zza("Unexpected lacing value: 2", null);
            }
            var6_6 = 163;
            if (var5_5 /* !! */  == var6_6) {
                while ((var5_5 /* !! */  = var4_4.zzR) < (var6_6 = var4_4.zzS)) {
                    var5_5 /* !! */  = var4_4.zzT[var5_5 /* !! */ ];
                    var11_11 = var4_4.zzo(var7_7, (zzaix)var21_36 /* !! */ , var5_5 /* !! */ , false);
                    var44_55 = var4_4.zzP;
                    var8_8 /* !! */  = var4_4.zzR;
                    var9_9 /* !! */  = var21_36 /* !! */ .zze;
                    var8_8 /* !! */  = var8_8 /* !! */  * var9_9 /* !! */  / 1000;
                    var46_56 = (long)var8_8 /* !! */  + var44_55;
                    var10_10 = var4_4.zzW;
                    var12_12 = 0;
                    var35_49 = null;
                    var14_21 = this;
                    var16_32 /* !! */  = (byte[])var21_36 /* !! */ ;
                    this.zzt((zzaix)var21_36 /* !! */ , var46_56, var10_10, var11_11, 0);
                    var5_5 /* !! */  = var4_4.zzR;
                    var6_6 = 1;
                    var4_4.zzR = var5_5 /* !! */  += var6_6;
                }
                var4_4.zzO = 0;
                return;
            }
            var6_6 = 1;
            while ((var5_5 /* !! */  = var4_4.zzR) < (var8_8 /* !! */  = var4_4.zzS)) {
                var15_28 /* !! */  = (SparseArray)var4_4.zzT;
                var9_9 /* !! */  = (int)var15_28 /* !! */ [var5_5 /* !! */ ];
                var9_9 /* !! */  = var4_4.zzo(var7_7, (zzaix)var21_36 /* !! */ , var9_9 /* !! */ , (boolean)var6_6);
                var15_28 /* !! */ [var5_5 /* !! */ ] = (SparseArray)var9_9 /* !! */ ;
                var4_4.zzR = var5_5 /* !! */  = var4_4.zzR + var6_6;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzi(int n3) {
        int n4;
        int n7;
        long l2;
        Object object;
        int n8;
        int n10;
        int n14;
        Object object2;
        int n15;
        zzaiy zzaiy2;
        block57: {
            zzaix zzaix2;
            int n16;
            block58: {
                zzaiy2 = this;
                n15 = n3;
                n16 = 0;
                int n17 = 1;
                object2 = this.zzaj;
                zzeq.zzb(object2);
                n14 = 160;
                n10 = 2;
                n8 = 8;
                object = "A_OPUS";
                if (n3 == n14) break block57;
                n14 = 174;
                int n18 = -1;
                boolean bl2 = false;
                if (n3 != n14) {
                    long l3;
                    long l4;
                    n14 = 19899;
                    long l7 = -1;
                    int n19 = 475249515;
                    if (n3 != n14) {
                        n14 = 25152;
                        if (n3 != n14) {
                            n14 = 28032;
                            if (n3 != n14) {
                                long l8;
                                long l12;
                                n14 = 357149030;
                                long l14 = -9223372036854775807L;
                                if (n3 != n14) {
                                    n14 = 374648427;
                                    if (n3 != n14) {
                                        if (n3 != n19) return;
                                        n15 = (int)(this.zzD ? 1 : 0);
                                        if (n15 == 0) {
                                            int n20;
                                            int n21;
                                            long l15;
                                            long l16;
                                            zzadx zzadx2 = this.zzaj;
                                            object2 = this.zzK;
                                            object = this.zzL;
                                            long l17 = this.zzy;
                                            long l18 = l17 - l7;
                                            Object object3 = l18 == 0L ? 0 : (l18 < 0L ? -1 : 1);
                                            if (object3 != false && (l16 = (l15 = (l7 = this.zzB) - l14) == 0L ? 0 : (l15 < 0L ? -1 : 1)) != false && object2 != null && (n21 = ((zzfl)object2).zza()) != 0 && object != null && (n20 = ((zzfl)object).zza()) == (n8 = ((zzfl)object2).zza())) {
                                                int n22;
                                                long l19;
                                                long l20;
                                                int n24 = ((zzfl)object2).zza();
                                                int[] nArray = new int[n24];
                                                long[] lArray = new long[n24];
                                                long[] lArray2 = new long[n24];
                                                long[] lArray3 = new long[n24];
                                                for (int i3 = 0; i3 < n24; i3 += n17) {
                                                    long l21;
                                                    lArray3[i3] = l21 = ((zzfl)object2).zzb(i3);
                                                    long l22 = zzaiy2.zzy;
                                                    lArray[i3] = l20 = ((zzfl)object).zzb(i3) + l22;
                                                }
                                                while (n16 < (n14 = n24 + -1)) {
                                                    int n25;
                                                    n14 = n16 + 1;
                                                    l19 = lArray[n14];
                                                    l20 = lArray[n16];
                                                    nArray[n16] = n25 = (int)(l19 - l20);
                                                    l19 = lArray3[n14];
                                                    l20 = lArray3[n16];
                                                    lArray2[n16] = l19 -= l20;
                                                    n16 = n14;
                                                }
                                                l19 = zzaiy2.zzy;
                                                long l23 = zzaiy2.zzx;
                                                long l24 = lArray[n14];
                                                nArray[n14] = n22 = (int)((l19 += l23) - l24);
                                                l19 = zzaiy2.zzB;
                                                l24 = lArray3[n14];
                                                lArray2[n14] = l19 -= l24;
                                                l24 = 0L;
                                                long l25 = l19 - l24;
                                                Object object4 = l25 == 0L ? 0 : (l25 < 0L ? -1 : 1);
                                                if (object4 <= 0) {
                                                    String string2 = "Discarding last cue point with unexpected duration: ";
                                                    StringBuilder stringBuilder = new StringBuilder(string2);
                                                    stringBuilder.append(l19);
                                                    String string3 = stringBuilder.toString();
                                                    object = "MatroskaExtractor";
                                                    zzfk.zzf((String)object, string3);
                                                    nArray = Arrays.copyOf(nArray, n14);
                                                    lArray = Arrays.copyOf(lArray, n14);
                                                    lArray2 = Arrays.copyOf(lArray2, n14);
                                                    lArray3 = Arrays.copyOf(lArray3, n14);
                                                }
                                                object2 = new zzadg(nArray, lArray, lArray2, lArray3);
                                            } else {
                                                l7 = zzaiy2.zzB;
                                                long l26 = 0L;
                                                object2 = new zzaes(l7, l26);
                                            }
                                            zzadx2.zzO((zzaet)object2);
                                            n15 = 1;
                                            zzaiy2.zzD = n15;
                                        }
                                        zzaiy2.zzK = null;
                                        zzaiy2.zzL = null;
                                        return;
                                    }
                                    SparseArray sparseArray = this.zzj;
                                    n15 = sparseArray.size();
                                    if (n15 == 0) throw zzch.zza("No valid tracks were found", null);
                                    this.zzaj.zzD();
                                    return;
                                }
                                long l27 = this.zzz;
                                long l28 = l27 - l14;
                                Object object5 = l28 == 0L ? 0 : (l28 < 0L ? -1 : 1);
                                if (object5 == false) {
                                    this.zzz = l27 = 1000000L;
                                }
                                if ((l12 = (l8 = (l27 = zzaiy2.zzA) - l14) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) return;
                                zzaiy2.zzB = l27 = zzaiy2.zzq(l27);
                                return;
                            }
                            this.zzs(n3);
                            Object object6 = this.zzC;
                            n14 = (int)(((zzaix)object6).zzg ? 1 : 0);
                            if (n14 == 0 || (object6 = (Object)((zzaix)object6).zzh) == null) return;
                            throw zzch.zza("Combining encryption and compression is not supported", null);
                        }
                        this.zzs(n3);
                        zzaix zzaix3 = this.zzC;
                        n14 = (int)(zzaix3.zzg ? 1 : 0);
                        if (n14 == 0) return;
                        object2 = zzaix3.zzi;
                        if (object2 == null) throw zzch.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                        zzad[] zzadArray = com.google.android.gms.internal.ads.zzo.zza;
                        object = this.zzC.zzi.zzb;
                        zzad zzad2 = new zzad((UUID)zzadArray, null, "video/webm", (byte[])object);
                        zzadArray = new zzad[]{zzad2};
                        zzaix3.zzk = object2 = new zzae(null, zzadArray);
                        return;
                    }
                    n15 = this.zzE;
                    if (n15 == n18 || (n14 = (int)((l4 = (l3 = this.zzF) - l7) == 0L ? 0 : (l4 < 0L ? -1 : 1))) == 0) throw zzch.zza("Mandatory element SeekID or SeekPosition not found", null);
                    if (n15 != n19) return;
                    this.zzH = l3;
                    return;
                }
                zzaix2 = this.zzC;
                zzeq.zzb(zzaix2);
                object2 = zzaix2.zzb;
                if (object2 == null) throw zzch.zza("CodecId is missing in TrackEntry element", null);
                int n26 = ((String)object2).hashCode();
                switch (n26) {
                    default: {
                        break;
                    }
                    case 1951062397: {
                        n14 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 11;
                        break block58;
                    }
                    case 1950789798: {
                        String string4 = "A_FLAC";
                        n14 = (int)(((String)object2).equals(string4) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 22;
                        break block58;
                    }
                    case 1950749482: {
                        String string5 = "A_EAC3";
                        n14 = (int)(((String)object2).equals(string5) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 17;
                        break block58;
                    }
                    case 1809237540: {
                        String string6 = "V_MPEG2";
                        n14 = (int)(((String)object2).equals(string6) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 3;
                        break block58;
                    }
                    case 1422270023: {
                        String string7 = "S_TEXT/UTF8";
                        n14 = (int)(((String)object2).equals(string7) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 27;
                        break block58;
                    }
                    case 1045209816: {
                        String string8 = "S_TEXT/WEBVTT";
                        n14 = (int)(((String)object2).equals(string8) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 29;
                        break block58;
                    }
                    case 855502857: {
                        String string9 = "V_MPEGH/ISO/HEVC";
                        n14 = (int)(((String)object2).equals(string9) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 8;
                        break block58;
                    }
                    case 738597099: {
                        String string10 = "S_TEXT/ASS";
                        n14 = (int)(((String)object2).equals(string10) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 28;
                        break block58;
                    }
                    case 725957860: {
                        String string11 = "A_PCM/INT/LIT";
                        n14 = (int)(((String)object2).equals(string11) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 24;
                        break block58;
                    }
                    case 725948237: {
                        String string12 = "A_PCM/INT/BIG";
                        n14 = (int)(((String)object2).equals(string12) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 25;
                        break block58;
                    }
                    case 635596514: {
                        String string13 = "A_PCM/FLOAT/IEEE";
                        n14 = (int)(((String)object2).equals(string13) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 26;
                        break block58;
                    }
                    case 542569478: {
                        String string14 = "A_DTS/EXPRESS";
                        n14 = (int)(((String)object2).equals(string14) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 20;
                        break block58;
                    }
                    case 444813526: {
                        String string15 = "V_THEORA";
                        n14 = (int)(((String)object2).equals(string15) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 10;
                        break block58;
                    }
                    case 99146302: {
                        String string16 = "S_HDMV/PGS";
                        n14 = (int)(((String)object2).equals(string16) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 31;
                        break block58;
                    }
                    case 82338134: {
                        String string17 = "V_VP9";
                        n14 = (int)(((String)object2).equals(string17) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 1;
                        break block58;
                    }
                    case 82338133: {
                        String string18 = "V_VP8";
                        n14 = (int)(((String)object2).equals(string18) ? 1 : 0);
                        if (n14 == 0) break;
                        break block58;
                    }
                    case 82318131: {
                        String string19 = "V_AV1";
                        n14 = (int)(((String)object2).equals(string19) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 2;
                        break block58;
                    }
                    case 62927045: {
                        String string20 = "A_DTS";
                        n14 = (int)(((String)object2).equals(string20) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 19;
                        break block58;
                    }
                    case 62923603: {
                        String string21 = "A_AC3";
                        n14 = (int)(((String)object2).equals(string21) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 16;
                        break block58;
                    }
                    case 62923557: {
                        String string22 = "A_AAC";
                        n14 = (int)(((String)object2).equals(string22) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 13;
                        break block58;
                    }
                    case -356037306: {
                        String string23 = "A_DTS/LOSSLESS";
                        n14 = (int)(((String)object2).equals(string23) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 21;
                        break block58;
                    }
                    case -425012669: {
                        String string24 = "S_VOBSUB";
                        n14 = (int)(((String)object2).equals(string24) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 30;
                        break block58;
                    }
                    case -538363109: {
                        String string25 = "V_MPEG4/ISO/AVC";
                        n14 = (int)(((String)object2).equals(string25) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 7;
                        break block58;
                    }
                    case -538363189: {
                        String string26 = "V_MPEG4/ISO/ASP";
                        n14 = (int)(((String)object2).equals(string26) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 5;
                        break block58;
                    }
                    case -933872740: {
                        String string27 = "S_DVBSUB";
                        n14 = (int)(((String)object2).equals(string27) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 32;
                        break block58;
                    }
                    case -1373388978: {
                        String string28 = "V_MS/VFW/FOURCC";
                        n14 = (int)(((String)object2).equals(string28) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 9;
                        break block58;
                    }
                    case -1482641357: {
                        String string29 = "A_MPEG/L3";
                        n14 = (int)(((String)object2).equals(string29) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 15;
                        break block58;
                    }
                    case -1482641358: {
                        String string30 = "A_MPEG/L2";
                        n14 = (int)(((String)object2).equals(string30) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 14;
                        break block58;
                    }
                    case -1730367663: {
                        String string31 = "A_VORBIS";
                        n14 = (int)(((String)object2).equals(string31) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 12;
                        break block58;
                    }
                    case -1784763192: {
                        String string32 = "A_TRUEHD";
                        n14 = (int)(((String)object2).equals(string32) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 18;
                        break block58;
                    }
                    case -1985379776: {
                        String string33 = "A_MS/ACM";
                        n14 = (int)(((String)object2).equals(string33) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 23;
                        break block58;
                    }
                    case -2095575984: {
                        String string34 = "V_MPEG4/ISO/SP";
                        n14 = (int)(((String)object2).equals(string34) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 4;
                        break block58;
                    }
                    case -2095576542: {
                        String string35 = "V_MPEG4/ISO/AP";
                        n14 = (int)(((String)object2).equals(string35) ? 1 : 0);
                        if (n14 == 0) break;
                        n16 = 6;
                        break block58;
                    }
                }
                n16 = -1;
            }
            switch (n16) {
                default: {
                    break;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: {
                    object2 = zzaiy2.zzaj;
                    int n27 = zzaix2.zzc;
                    zzaix2.zze((zzadx)object2, n27);
                    object2 = zzaiy2.zzj;
                    int n28 = zzaix2.zzc;
                    object2.put(n28, (Object)zzaix2);
                }
            }
            zzaiy2.zzC = null;
            return;
        }
        n15 = this.zzO;
        if (n15 != n10) return;
        Object object7 = this.zzj;
        n14 = this.zzU;
        object7 = object7.get(n14);
        Object object8 = object7;
        zzaix zzaix4 = (zzaix)object7;
        zzaix.zzd(zzaix4);
        long l29 = this.zzZ;
        long l30 = 0L;
        long l31 = l29 == l30 ? 0 : (l29 < l30 ? -1 : 1);
        if (l31 > 0 && (n15 = (int)(((String)object).equals(object7 = zzaix4.zzb) ? 1 : 0)) != 0) {
            object7 = this.zzv;
            object2 = ByteBuffer.allocate(n8);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            object2 = ((ByteBuffer)object2).order(byteOrder);
            l2 = this.zzZ;
            object2 = ((ByteBuffer)object2).putLong(l2).array();
            int n29 = ((Object)object2).length;
            ((zzfu)object7).zzI((byte[])object2, n29);
        }
        object7 = null;
        n14 = 0;
        object2 = null;
        for (n15 = 0; n15 < (n7 = zzaiy2.zzS); n15 += n7) {
            int[] nArray = zzaiy2.zzT;
            n7 = nArray[n15];
            n14 += n7;
            n7 = 1;
        }
        n15 = 0;
        object7 = null;
        while (n15 < (n4 = zzaiy2.zzS)) {
            int n30;
            l2 = zzaiy2.zzP;
            long l34 = zzaix4.zze * n15 / 1000;
            l2 += l34;
            int n32 = zzaiy2.zzW;
            if (n15 == 0) {
                n15 = (int)(zzaiy2.zzY ? 1 : 0);
                if (n15 == 0) {
                    n15 = 1;
                    n32 |= n15;
                }
                n30 = 0;
            } else {
                n30 = n15;
            }
            int n34 = zzaiy2.zzT[n30];
            int n35 = n14 - n34;
            object7 = this;
            object2 = zzaix4;
            this.zzt(zzaix4, l2, n32, n34, n35);
            n15 = n30 + 1;
            n14 = n35;
        }
        zzaiy2.zzO = 0;
    }

    public final void zzj(int n3, double d2) {
        int n4;
        int n7 = 181;
        if (n3 != n7) {
            long l2;
            n7 = 17545;
            if (n3 != n7) {
                switch (n3) {
                    default: {
                        switch (n3) {
                            default: {
                                return;
                            }
                            case 30325: {
                                float f5 = (float)d2;
                                this.zzs(n3);
                                this.zzC.zzu = f5;
                                return;
                            }
                            case 30324: {
                                float f6 = (float)d2;
                                this.zzs(n3);
                                this.zzC.zzt = f6;
                                return;
                            }
                            case 30323: 
                        }
                        float f7 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzs = f7;
                        return;
                    }
                    case 21978: {
                        float f8 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzM = f8;
                        return;
                    }
                    case 21977: {
                        float f11 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzL = f11;
                        return;
                    }
                    case 21976: {
                        float f12 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzK = f12;
                        return;
                    }
                    case 21975: {
                        float f14 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzJ = f14;
                        return;
                    }
                    case 21974: {
                        float f15 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzI = f15;
                        return;
                    }
                    case 21973: {
                        float f16 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzH = f16;
                        return;
                    }
                    case 21972: {
                        float f17 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzG = f17;
                        return;
                    }
                    case 21971: {
                        float f18 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzF = f18;
                        return;
                    }
                    case 21970: {
                        float f19 = (float)d2;
                        this.zzs(n3);
                        this.zzC.zzE = f19;
                        return;
                    }
                    case 21969: 
                }
                float f20 = (float)d2;
                this.zzs(n3);
                this.zzC.zzD = f20;
                return;
            }
            this.zzA = l2 = (long)d2;
            return;
        }
        this.zzs(n3);
        zzaix zzaix2 = this.zzC;
        zzaix2.zzQ = n4 = (int)d2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzk(int n3, long l2) {
        int n4 = 20529;
        boolean bl2 = false;
        String string2 = " not supported";
        if (n3 != n4) {
            n4 = 20530;
            long l3 = 1L;
            if (n3 != n4) {
                n4 = 0;
                int n7 = 3;
                int n8 = 2;
                int n10 = 1;
                switch (n3) {
                    default: {
                        n4 = -1;
                        switch (n3) {
                            default: {
                                return;
                            }
                            case 21949: {
                                int n14 = (int)l2;
                                this.zzs(n3);
                                this.zzC.zzC = n14;
                                return;
                            }
                            case 21948: {
                                int n15 = (int)l2;
                                this.zzs(n3);
                                this.zzC.zzB = n15;
                                return;
                            }
                            case 21947: {
                                int n16 = (int)l2;
                                this.zzs(n3);
                                zzaix zzaix2 = this.zzC;
                                zzaix2.zzx = n10;
                                n3 = com.google.android.gms.internal.ads.zzt.zza(n16);
                                if (n3 == n4) return;
                                this.zzC.zzy = n3;
                                return;
                            }
                            case 21946: {
                                int n17 = (int)l2;
                                this.zzs(n3);
                                n3 = com.google.android.gms.internal.ads.zzt.zzb(n17);
                                if (n3 == n4) return;
                                this.zzC.zzz = n3;
                                return;
                            }
                            case 21945: {
                                int n18 = (int)l2;
                                this.zzs(n3);
                                if (n18 != n10) {
                                    if (n18 != n8) return;
                                    this.zzC.zzA = n10;
                                    return;
                                }
                                this.zzC.zzA = n8;
                                return;
                            }
                        }
                    }
                    case 2807729: {
                        this.zzz = l2;
                        return;
                    }
                    case 2352003: {
                        int n19 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zze = n19;
                        return;
                    }
                    case 30321: {
                        int n20 = (int)l2;
                        this.zzs(n3);
                        if (n20 != 0) {
                            if (n20 != n10) {
                                if (n20 != n8) {
                                    if (n20 != n7) return;
                                    this.zzC.zzr = n7;
                                    return;
                                }
                                this.zzC.zzr = n8;
                                return;
                            }
                            this.zzC.zzr = n10;
                            return;
                        }
                        this.zzC.zzr = 0;
                        return;
                    }
                    case 30114: {
                        this.zzZ = l2;
                        return;
                    }
                    case 25188: {
                        int n21 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzP = n21;
                        return;
                    }
                    case 22203: {
                        this.zzs(n3);
                        this.zzC.zzS = l2;
                        return;
                    }
                    case 22186: {
                        this.zzs(n3);
                        this.zzC.zzR = l2;
                        return;
                    }
                    case 21998: {
                        int n22 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzf = n22;
                        return;
                    }
                    case 21938: {
                        int n24 = (int)l2;
                        this.zzs(n3);
                        zzaix zzaix3 = this.zzC;
                        zzaix3.zzx = n10;
                        zzaix3.zzn = n24;
                        return;
                    }
                    case 21930: {
                        bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (!bl2) {
                            n4 = 1;
                        }
                        this.zzs(n3);
                        this.zzC.zzU = n4;
                        return;
                    }
                    case 21690: {
                        int n25 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzp = n25;
                        return;
                    }
                    case 21682: {
                        int n26 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzq = n26;
                        return;
                    }
                    case 21680: {
                        int n27 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzo = n27;
                        return;
                    }
                    case 21432: {
                        int n28 = (int)l2;
                        this.zzs(n3);
                        if (n28 != 0) {
                            if (n28 != n10) {
                                if (n28 != n7) {
                                    n3 = 15;
                                    if (n28 != n3) return;
                                    this.zzC.zzw = n7;
                                    return;
                                }
                                this.zzC.zzw = n10;
                                return;
                            }
                            this.zzC.zzw = n8;
                            return;
                        }
                        this.zzC.zzw = 0;
                        return;
                    }
                    case 21420: {
                        long l4 = this.zzy;
                        this.zzF = l2 += l4;
                        return;
                    }
                    case 18408: {
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 == 0) return;
                        StringBuilder stringBuilder = new StringBuilder("AESSettingsCipherMode ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw zzch.zza(stringBuilder.toString(), null);
                    }
                    case 18401: {
                        l3 = 5;
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 == 0) return;
                        StringBuilder stringBuilder = new StringBuilder("ContentEncAlgo ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw zzch.zza(stringBuilder.toString(), null);
                    }
                    case 17143: {
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 == 0) return;
                        StringBuilder stringBuilder = new StringBuilder("EBMLReadVersion ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw zzch.zza(stringBuilder.toString(), null);
                    }
                    case 17029: {
                        long l7;
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 >= 0 && (n3 = (int)((l7 = l2 - (l3 = (long)2)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) <= 0) return;
                        StringBuilder stringBuilder = new StringBuilder("DocTypeReadVersion ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw zzch.zza(stringBuilder.toString(), null);
                    }
                    case 16980: {
                        l3 = 3;
                        n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n3 == 0) return;
                        StringBuilder stringBuilder = new StringBuilder("ContentCompAlgo ");
                        stringBuilder.append(l2);
                        stringBuilder.append(string2);
                        throw zzch.zza(stringBuilder.toString(), null);
                    }
                    case 16871: {
                        int n29 = (int)l2;
                        this.zzs(n3);
                        zzaix.zzb(this.zzC, n29);
                        return;
                    }
                    case 251: {
                        this.zzY = n10;
                        return;
                    }
                    case 241: {
                        n4 = (int)(this.zzM ? 1 : 0);
                        if (n4 != 0) return;
                        this.zzr(n3);
                        this.zzL.zzc(l2);
                        this.zzM = n10;
                        return;
                    }
                    case 238: {
                        this.zzX = n3 = (int)l2;
                        return;
                    }
                    case 231: {
                        long l8;
                        this.zzJ = l8 = this.zzq(l2);
                        return;
                    }
                    case 215: {
                        int n30 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzc = n30;
                        return;
                    }
                    case 186: {
                        int n32 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzm = n32;
                        return;
                    }
                    case 179: {
                        this.zzr(n3);
                        zzfl zzfl2 = this.zzK;
                        l2 = this.zzq(l2);
                        zzfl2.zzc(l2);
                        return;
                    }
                    case 176: {
                        int n34 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzl = n34;
                        return;
                    }
                    case 159: {
                        int n35 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzO = n35;
                        return;
                    }
                    case 155: {
                        long l12;
                        this.zzQ = l12 = this.zzq(l2);
                        return;
                    }
                    case 136: {
                        bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (!bl2) {
                            n4 = 1;
                        }
                        this.zzs(n3);
                        this.zzC.zzV = n4;
                        return;
                    }
                    case 131: {
                        int n36 = (int)l2;
                        this.zzs(n3);
                        this.zzC.zzd = n36;
                        return;
                    }
                }
            }
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 == 0) return;
            StringBuilder stringBuilder = new StringBuilder("ContentEncodingScope ");
            stringBuilder.append(l2);
            stringBuilder.append(string2);
            throw zzch.zza(stringBuilder.toString(), null);
        }
        long l14 = 0L;
        long l15 = l2 - l14;
        n3 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
        if (n3 == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("ContentEncodingOrder ");
        stringBuilder.append(l2);
        stringBuilder.append(string2);
        throw zzch.zza(stringBuilder.toString(), null);
    }

    public final void zzl(int n3, long l2, long l3) {
        zzadx zzadx2 = this.zzaj;
        zzeq.zzb(zzadx2);
        int n4 = 160;
        boolean bl2 = false;
        long l4 = 0L;
        if (n3 != n4) {
            zzaix zzaix2;
            n4 = 174;
            if (n3 != n4) {
                n4 = 187;
                if (n3 != n4) {
                    n4 = 19899;
                    long l7 = -1;
                    if (n3 != n4) {
                        n4 = 20533;
                        bl2 = true;
                        if (n3 != n4) {
                            n4 = 21968;
                            if (n3 != n4) {
                                n4 = 408125543;
                                if (n3 != n4) {
                                    zzfl zzfl2;
                                    int n7 = 475249515;
                                    if (n3 != n7) {
                                        n7 = 524531317;
                                        if (n3 == n7 && (n3 = (int)(this.zzD ? 1 : 0)) == 0) {
                                            long l8;
                                            long l12;
                                            long l14;
                                            n3 = (int)(this.zzk ? 1 : 0);
                                            if (n3 != 0 && (l14 = (l12 = (l8 = this.zzH) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
                                                this.zzG = bl2;
                                                return;
                                            }
                                            zzadx zzadx3 = this.zzaj;
                                            long l15 = this.zzB;
                                            zzaes zzaes2 = new zzaes(l15, l4);
                                            zzadx3.zzO(zzaes2);
                                            this.zzD = bl2;
                                        }
                                        return;
                                    }
                                    n7 = 32;
                                    this.zzK = zzfl2 = new zzfl(n7);
                                    this.zzL = zzfl2 = new zzfl(n7);
                                    return;
                                }
                                long l16 = this.zzy;
                                long l17 = l16 - l7;
                                n3 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
                                if (n3 != 0 && (n3 = (int)(l16 == l2 ? 0 : (l16 < l2 ? -1 : 1))) != 0) {
                                    throw zzch.zza("Multiple Segment elements not supported", null);
                                }
                                this.zzy = l2;
                                this.zzx = l3;
                                return;
                            }
                            this.zzs(n3);
                            this.zzC.zzx = bl2;
                            return;
                        }
                        this.zzs(n3);
                        this.zzC.zzg = bl2;
                        return;
                    }
                    this.zzE = -1;
                    this.zzF = l7;
                    return;
                }
                this.zzM = false;
                return;
            }
            this.zzC = zzaix2 = new zzaix();
            return;
        }
        this.zzY = false;
        this.zzZ = l4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzm(int n3, String string2) {
        int n4 = 134;
        if (n3 != n4) {
            n4 = 17026;
            if (n3 != n4) {
                n4 = 21358;
                if (n3 != n4) {
                    n4 = 2274716;
                    if (n3 != n4) return;
                    this.zzs(n3);
                    zzaix.zzc(this.zzC, string2);
                    return;
                }
                this.zzs(n3);
                this.zzC.zza = string2;
                return;
            }
            CharSequence charSequence = "webm";
            n3 = (int)(((String)charSequence).equals(string2) ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(((String)(charSequence = "matroska")).equals(string2) ? 1 : 0)) != 0) return;
            charSequence = new StringBuilder("DocType ");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(" not supported");
            throw zzch.zza(((StringBuilder)charSequence).toString(), null);
        }
        this.zzs(n3);
        this.zzC.zzb = string2;
    }
}

