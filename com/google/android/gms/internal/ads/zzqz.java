/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTrack
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzqn;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.ads.zzqy;
import com.google.android.gms.internal.ads.zzru;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zzsf;
import java.lang.reflect.Method;

final class zzqz {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzer zzI;
    private final zzqy zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzqx zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzqz(zzqy object) {
        this.zza = object;
        object = AudioTrack.class;
        String string2 = "getLatency";
        try {
            this.zzm = object = ((Class)object).getMethod(string2, null);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        object = new long[10];
        this.zzb = (long[])object;
        this.zzI = object = zzer.zza;
    }

    private final long zzl() {
        long l2;
        long l3;
        block8: {
            block9: {
                long l4;
                long l7;
                int n3;
                block10: {
                    long l8;
                    long l12;
                    block12: {
                        block11: {
                            l3 = SystemClock.elapsedRealtime();
                            l2 = this.zzx;
                            n3 = 2;
                            l12 = -9223372036854775807L;
                            long l14 = l2 - l12;
                            Object object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                            if (object != false) {
                                AudioTrack audioTrack = this.zzc;
                                audioTrack.getClass();
                                int n4 = audioTrack.getPlayState();
                                if (n4 == n3) {
                                    return this.zzz;
                                }
                                l3 = zzgd.zzr(l3);
                                l2 = this.zzx;
                                l3 -= l2;
                                float f5 = this.zzi;
                                l3 = zzgd.zzp(l3, f5);
                                n4 = this.zzf;
                                l3 = zzgd.zzo(l3, n4);
                                l2 = this.zzA;
                                long l15 = this.zzz + l3;
                                return Math.min(l2, l15);
                            }
                            l2 = this.zzr;
                            l7 = 5;
                            long l16 = (l2 = l3 - l2) - l7;
                            Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                            if (object2 < 0) break block8;
                            AudioTrack audioTrack = this.zzc;
                            audioTrack.getClass();
                            int n7 = audioTrack.getPlayState();
                            object = 1;
                            if (n7 == object) break block9;
                            l7 = audioTrack.getPlaybackHeadPosition();
                            int n8 = this.zzg;
                            l7 &= 0xFFFFFFFFL;
                            l8 = 0L;
                            if (n8 != 0) {
                                if (n7 == n3) {
                                    n8 = (int)(l7 == l8 ? 0 : (l7 < l8 ? -1 : 1));
                                    if (n8 == 0) {
                                        this.zzu = l2 = this.zzs;
                                    }
                                } else {
                                    n3 = n7;
                                }
                                l2 = this.zzu;
                                l7 += l2;
                                n7 = n3;
                            }
                            if ((n8 = zzgd.zza) > (n3 = 29)) break block10;
                            n8 = (int)(l7 == l8 ? 0 : (l7 < l8 ? -1 : 1));
                            if (n8 != 0) break block11;
                            l7 = this.zzs;
                            long l17 = l7 - l8;
                            n8 = (int)(l17 == 0L ? 0 : (l17 < 0L ? -1 : 1));
                            if (n8 <= 0) break block12;
                            n8 = 3;
                            float f6 = 4.2E-45f;
                            if (n7 != n8) break block12;
                            l2 = this.zzy;
                            long l18 = l2 - l12;
                            n3 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                            if (n3 == 0) {
                                this.zzy = l3;
                            }
                            break block9;
                        }
                        l8 = l7;
                    }
                    this.zzy = l12;
                    l7 = l8;
                }
                if ((n3 = (int)((l4 = (l2 = this.zzs) - l7) == 0L ? 0 : (l4 < 0L ? -1 : 1))) > 0) {
                    l2 = this.zzt;
                    long l19 = 1L;
                    this.zzt = l2 += l19;
                }
                this.zzs = l7;
            }
            this.zzr = l3;
        }
        l3 = this.zzs;
        l2 = this.zzH;
        l3 += l2;
        l2 = this.zzt << 32;
        return l3 + l2;
    }

    private final long zzm() {
        long l2 = this.zzl();
        int n3 = this.zzf;
        return zzgd.zzs(l2, n3);
    }

    private final void zzn() {
        long l2;
        this.zzk = l2 = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = l2;
        this.zzC = l2;
        this.zzF = l2;
        this.zzj = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long zza(boolean bl2) {
        long l2;
        long l3;
        long l4;
        int n3;
        Object object;
        long l7;
        long l8;
        long l12;
        long l14;
        Object object2 = this;
        int n4 = 1;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int n7 = audioTrack.getPlayState();
        int n8 = 3;
        float f5 = 4.2E-45f;
        long l15 = 0L;
        long l16 = 1000L;
        if (n7 == n8) {
            long l17;
            zzqx zzqx2;
            int n10;
            int n14;
            long l18 = System.nanoTime() / l16;
            long l19 = this.zzl;
            long l20 = 30000L;
            long l21 = (l19 = l18 - l19) - l20;
            Object object3 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
            if (object3 >= 0) {
                l19 = this.zzm();
                long l22 = l19 - l15;
                Object object4 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                if (object4 != false) {
                    long[] lArray = this.zzb;
                    int n15 = this.zzv;
                    float f6 = this.zzi;
                    lArray[n15] = l19 = zzgd.zzq(l19, f6) - l18;
                    n14 = this.zzv + n4;
                    n10 = 10;
                    this.zzv = n14 %= n10;
                    n14 = this.zzw;
                    if (n14 < n10) {
                        this.zzw = n14 += n4;
                    }
                    ((zzqz)object2).zzl = l18;
                    ((zzqz)object2).zzk = l15;
                    zzqx2 = null;
                    for (n14 = 0; n14 < (n10 = ((zzqz)object2).zzw); n14 += n4) {
                        l20 = ((zzqz)object2).zzk;
                        long[] lArray2 = ((zzqz)object2).zzb;
                        l14 = n10;
                        l17 = lArray2[n14] / l14;
                        ((zzqz)object2).zzk = l12 = l17 + l20;
                    }
                }
            } else if ((n14 = ((zzqz)object2).zzg) == 0) {
                StringBuilder stringBuilder;
                Object object5;
                zzqx2 = ((zzqz)object2).zze;
                zzqx2.getClass();
                n10 = zzqx2.zzg(l18);
                String string2 = "DefaultAudioSink";
                l8 = 5000000L;
                if (n10 != 0) {
                    l14 = zzqx2.zzb();
                    l15 = zzqx2.zza();
                    l16 = this.zzm();
                    long l23 = Math.abs(l14 - l18);
                    String string3 = ", ";
                    Object object6 = l23 == l8 ? 0 : (l23 < l8 ? -1 : 1);
                    if (object6 > 0) {
                        zzrz zzrz2 = ((zzru)((zzqz)object2).zza).zza;
                        l8 = zzrz.zzC(zzrz2);
                        l7 = zzrz.zzD(zzrz2);
                        object = D70.c(l15, "Spurious audio timestamp (system clock mismatch): ", string3);
                        ((StringBuilder)object).append(l14);
                        l15 = l18;
                        fn0_2.b((StringBuilder)object, string3, l18, string3);
                        ((StringBuilder)object).append(l16);
                        fn0_2.b((StringBuilder)object, string3, l8, string3);
                        ((StringBuilder)object).append(l7);
                        object5 = ((StringBuilder)object).toString();
                        zzfk.zzf(string2, (String)object5);
                        zzqx2.zzd();
                    } else {
                        n4 = ((zzqz)object2).zzf;
                        l8 = Math.abs(zzgd.zzs(l15, n4) - l16);
                        long l24 = l8 - (l17 = 5000000L);
                        if ((n4 = (int)(l24 == 0L ? 0 : (l24 < 0L ? -1 : 1))) > 0) {
                            object5 = ((zzru)((zzqz)object2).zza).zza;
                            l8 = zzrz.zzC((zzrz)object5);
                            long l25 = zzrz.zzD((zzrz)object5);
                            String string4 = "Spurious audio timestamp (frame position mismatch): ";
                            stringBuilder = D70.c(l15, string4, string3);
                            stringBuilder.append(l14);
                            fn0_2.b(stringBuilder, string3, l18, string3);
                            stringBuilder.append(l16);
                            fn0_2.b(stringBuilder, string3, l8, string3);
                            stringBuilder.append(l25);
                            object2 = stringBuilder.toString();
                            zzfk.zzf(string2, (String)object2);
                            zzqx2.zzd();
                        } else {
                            zzqx2.zzc();
                        }
                        object2 = this;
                    }
                }
                n4 = ((zzqz)object2).zzp;
                if (n4 != 0 && (object5 = ((zzqz)object2).zzm) != null) {
                    l15 = ((zzqz)object2).zzq;
                    l16 = 500000L;
                    long l26 = (l15 = l18 - l15) - l16;
                    n14 = (int)(l26 == 0L ? 0 : (l26 < 0L ? -1 : 1));
                    if (n14 >= 0) {
                        n3 = 0;
                        stringBuilder = null;
                        try {
                            AudioTrack audioTrack2 = ((zzqz)object2).zzc;
                            if (audioTrack2 == null) throw null;
                            object5 = ((Method)object5).invoke((Object)audioTrack2, null);
                            object5 = (Integer)object5;
                        }
                        catch (Exception exception) {}
                        n4 = (Integer)object5;
                        l4 = n4;
                        l3 = 1000L;
                        l4 *= l3;
                        l3 = ((zzqz)object2).zzh;
                        l4 -= l3;
                        ((zzqz)object2).zzn = l4;
                        l3 = 0L;
                        ((zzqz)object2).zzn = l4 = Math.max(l4, l3);
                        l3 = 5000000L;
                        n4 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
                        if (n4 > 0) {
                            object5 = new StringBuilder();
                            String string5 = "Ignoring impossibly large audio latency: ";
                            ((StringBuilder)object5).append(string5);
                            ((StringBuilder)object5).append(l4);
                            object5 = ((StringBuilder)object5).toString();
                            zzfk.zzf(string2, (String)object5);
                            ((zzqz)object2).zzn = l4 = 0L;
                        }
                        ((zzqz)object2).zzm = null;
                        ((zzqz)object2).zzq = l18;
                    }
                }
            }
        }
        l7 = System.nanoTime();
        long l27 = 1000L;
        l7 /= l27;
        object = ((zzqz)object2).zze;
        object.getClass();
        n3 = ((zzqx)object).zzf();
        if (n3 != 0) {
            l4 = ((zzqx)object).zza();
            int n16 = ((zzqz)object2).zzf;
            l4 = zzgd.zzs(l4, n16);
            l3 = ((zzqx)object).zzb();
            l3 = l7 - l3;
            f5 = ((zzqz)object2).zzi;
            l3 = zzgd.zzp(l3, f5) + l4;
        } else {
            n8 = ((zzqz)object2).zzw;
            if (n8 == 0) {
                l4 = this.zzm();
            } else {
                l4 = ((zzqz)object2).zzk + l7;
                f5 = ((zzqz)object2).zzi;
                l4 = zzgd.zzp(l4, f5);
            }
            l3 = l4;
            if (!bl2) {
                l4 = ((zzqz)object2).zzn;
                l3 -= l4;
                l4 = 0L;
                l3 = Math.max(l4, l3);
            }
        }
        n8 = (int)(((zzqz)object2).zzD ? 1 : 0);
        if (n8 != n3) {
            ((zzqz)object2).zzF = l4 = ((zzqz)object2).zzC;
            ((zzqz)object2).zzE = l4 = ((zzqz)object2).zzB;
        }
        l4 = ((zzqz)object2).zzF;
        l12 = 1000000L;
        long l28 = (l4 = l7 - l4) - l12;
        n8 = (int)(l28 == 0L ? 0 : (l28 < 0L ? -1 : 1));
        if (n8 < 0) {
            l8 = ((zzqz)object2).zzE;
            f5 = ((zzqz)object2).zzi;
            l14 = zzgd.zzp(l4, f5) + l8;
            l8 = 1000L;
            l4 = l4 * l8 / l12;
            l3 *= l4;
            l4 = (l8 - l4) * l14 + l3;
            l3 = l4 / l8;
        }
        if ((n8 = (int)(((zzqz)object2).zzj ? 1 : 0)) == 0 && (n8 = (int)((l2 = l3 - (l4 = ((zzqz)object2).zzB)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) > 0) {
            ((zzqz)object2).zzj = true;
            l4 = l3 - l4;
            n8 = zzgd.zza;
            f5 = ((zzqz)object2).zzi;
            l4 = zzgd.zzu(zzgd.zzq(zzgd.zzu(l4), f5));
            l12 = System.currentTimeMillis() - l4;
            object = ((zzru)((zzqz)object2).zza).zza;
            zzqs zzqs2 = zzrz.zzF((zzrz)object);
            if (zzqs2 != null) {
                object = zzsf.zzae(((zzse)zzrz.zzF((zzrz)object)).zza);
                ((zzqn)object).zzv(l12);
            }
        }
        ((zzqz)object2).zzC = l7;
        ((zzqz)object2).zzB = l3;
        ((zzqz)object2).zzD = n3;
        return l3;
    }

    public final void zzb(long l2) {
        long l3;
        this.zzz = l3 = this.zzl();
        this.zzx = l3 = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzA = l2;
    }

    public final void zzc() {
        this.zzn();
        this.zzc = null;
        this.zze = null;
    }

    /*
     * Exception decompiling
     */
    public final void zzd(AudioTrack var1_1, boolean var2_2, int var3_3, int var4_4, int var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void zze(zzer zzer2) {
        this.zzI = zzer2;
    }

    public final void zzf() {
        long l2 = this.zzx;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.zzx = l2 = zzgd.zzr(SystemClock.elapsedRealtime());
        }
        zzqx zzqx2 = this.zze;
        zzqx2.getClass();
        zzqx2.zze();
    }

    public final boolean zzg(long l2) {
        block2: {
            block3: {
                long l3;
                long l4 = this.zza(false);
                int n3 = this.zzf;
                long l7 = l2 - (l4 = zzgd.zzo(l4, n3));
                if ((n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1))) > 0) break block2;
                int n4 = this.zzg;
                if (n4 == 0) break block3;
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                n4 = audioTrack.getPlayState();
                int n7 = 2;
                if (n4 == n7 && (n3 = (int)((l3 = (l2 = this.zzl()) - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) == 0) break block2;
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int n3 = audioTrack.getPlayState();
        int n4 = 3;
        return n3 == n4;
    }

    public final boolean zzi(long l2) {
        long l3;
        Object object;
        long l4 = this.zzy;
        long l7 = -9223372036854775807L;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 != false && (object = (l3 = l2 - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            l2 = SystemClock.elapsedRealtime();
            l4 = this.zzy;
            long l12 = (l2 -= l4) - (l4 = 200L);
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzj(long l2) {
        boolean bl2;
        boolean bl3;
        long l3;
        zzqn zzqn2;
        Object object = this.zzc;
        object.getClass();
        boolean bl32 = object.getPlayState();
        boolean bl4 = this.zzg;
        boolean bl5 = true;
        if (bl4) {
            boolean bl6 = 2 != 0;
            zzqn2 = null;
            if (bl32 == bl6) {
                this.zzo = false;
                return false;
            }
            if (bl32 == bl5) {
                long l4;
                l3 = this.zzl();
                long l7 = l3 - (l4 = 0L);
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 != false) {
                    bl3 = true;
                } else {
                    return false;
                }
            }
        }
        boolean bl7 = this.zzo;
        this.zzo = bl2 = this.zzg(l2);
        if (bl7 && !bl2 && bl3 != bl5) {
            Object object3 = this.zza;
            int n3 = this.zzd;
            l3 = this.zzh;
            long l8 = zzgd.zzu(l3);
            object3 = (zzru)object3;
            zzrz zzrz2 = ((zzru)object3).zza;
            object = zzrz.zzF(zzrz2);
            if (object != null) {
                l3 = SystemClock.elapsedRealtime();
                long l12 = zzrz.zzB(zzrz2);
                l12 = l3 - l12;
                object3 = ((zzse)zzrz.zzF((zzrz)((zzru)object3).zza)).zza;
                zzqn2 = zzsf.zzae((zzsf)object3);
                zzqn2.zzx(n3, l8, l12);
            }
        }
        return bl5;
    }

    public final boolean zzk() {
        this.zzn();
        long l2 = this.zzx;
        long l3 = -9223372036854775807L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            zzqx zzqx2 = this.zze;
            zzqx2.getClass();
            zzqx2.zze();
            return true;
        }
        this.zzz = l2 = this.zzl();
        return false;
    }
}

