/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv$zza$zza;
import com.google.android.gms.internal.ads.zzbdv$zzab$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzar;
import com.google.android.gms.internal.ads.zzbdv$zzas;
import com.google.android.gms.internal.ads.zzbdv$zzd$zza;
import com.google.android.gms.internal.ads.zzbdv$zzo$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzr$1;
import com.google.android.gms.internal.ads.zzbdv$zzr$2;
import com.google.android.gms.internal.ads.zzbdv$zzr$zza;
import com.google.android.gms.internal.ads.zzbdv$zzs;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhbw;
import com.google.android.gms.internal.ads.zzhbx;
import com.google.android.gms.internal.ads.zzhby;
import com.google.android.gms.internal.ads.zzhdm;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzbdv$zzr
extends zzhbo
implements zzbdv$zzs {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    private static final zzhbx zzk;
    private static final zzhbx zzl;
    private static final zzbdv$zzr zzm;
    private static volatile zzhdm zzn;
    private int zzA;
    private zzhbw zzB;
    private zzhbw zzC;
    private int zzo;
    private int zzp;
    private String zzu;
    private zzbdv$zzar zzv;
    private int zzw;
    private String zzx;
    private String zzy;
    private int zzz;

    static {
        Object object = new zzbdv$zzr$1();
        zzk = object;
        object = new zzbdv$zzr$2();
        zzl = object;
        zzm = object = new zzbdv$zzr();
        zzhbo.zzca(zzbdv$zzr.class, (zzhbo)object);
    }

    private zzbdv$zzr() {
        Object object = "";
        this.zzu = object;
        this.zzx = object;
        this.zzy = object;
        this.zzB = object = zzhbo.zzbG();
        this.zzC = object = zzhbo.zzbG();
    }

    public static /* synthetic */ void zzA(zzbdv$zzr zzbdv$zzr, String string2) {
        zzbdv$zzr.zzck(string2);
    }

    public static /* synthetic */ void zzB(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaA();
    }

    public static /* synthetic */ void zzC(zzbdv$zzr zzbdv$zzr, zzhac zzhac2) {
        zzbdv$zzr.zzcl(zzhac2);
    }

    public static /* synthetic */ void zzD(zzbdv$zzr zzbdv$zzr, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzr.zzcn(zzbdv$zzar);
    }

    public static /* synthetic */ void zzE(zzbdv$zzr zzbdv$zzr, zzbdv$zzar zzbdv$zzar) {
        zzbdv$zzr.zzaI(zzbdv$zzar);
    }

    public static /* synthetic */ void zzF(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaC();
    }

    public static /* synthetic */ void zzG(zzbdv$zzr zzbdv$zzr, zzbdv$zzo$zzb zzbdv$zzo$zzb) {
        zzbdv$zzr.zzco(zzbdv$zzo$zzb);
    }

    public static /* synthetic */ void zzH(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaD();
    }

    public static /* synthetic */ void zzI(zzbdv$zzr zzbdv$zzr, String string2) {
        zzbdv$zzr.zzaK(string2);
    }

    public static /* synthetic */ void zzJ(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzax();
    }

    private void zzaA() {
        String string2;
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFFD;
        this.zzu = string2 = zzbdv$zzr.zzk().zzR();
    }

    private void zzaB() {
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFFE;
        this.zzp = 0;
    }

    private void zzaC() {
        int n3;
        this.zzv = null;
        this.zzo = n3 = this.zzo & 0xFFFFFFFB;
    }

    private void zzaD() {
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFF7;
        this.zzw = 0;
    }

    private void zzaE() {
        zzhbw zzhbw2;
        this.zzC = zzhbw2 = zzhbo.zzbG();
    }

    private void zzaF() {
        zzhbw zzhbw2;
        this.zzB = zzhbw2 = zzhbo.zzbG();
    }

    private void zzaG() {
        zzhbw zzhbw2 = this.zzC;
        boolean bl2 = zzhbw2.zzc();
        if (!bl2) {
            this.zzC = zzhbw2 = zzhbo.zzbH(zzhbw2);
        }
    }

    private void zzaH() {
        zzhbw zzhbw2 = this.zzB;
        boolean bl2 = zzhbw2.zzc();
        if (!bl2) {
            this.zzB = zzhbw2 = zzhbo.zzbH(zzhbw2);
        }
    }

    private void zzaI(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar zzbdv$zzar2;
        zzbdv$zzar.getClass();
        zzbdv$zzas zzbdv$zzas = this.zzv;
        if (zzbdv$zzas != null && zzbdv$zzas != (zzbdv$zzar2 = zzbdv$zzar.zzg())) {
            zzbdv$zzas = zzbdv$zzar.zze((zzbdv$zzar)zzbdv$zzas);
            ((zzhbi)((Object)zzbdv$zzas)).zzbj(zzbdv$zzar);
            zzbdv$zzar = (zzbdv$zzar)((zzhbi)((Object)zzbdv$zzas)).zzbo();
        }
        this.zzv = zzbdv$zzar;
        this.zzo = n3 = this.zzo | 4;
    }

    private void zzaJ(zzbdv$zza$zza zzbdv$zza$zza) {
        int n3;
        this.zzA = n3 = zzbdv$zza$zza.zza();
        this.zzo = n3 = this.zzo | 0x80;
    }

    private void zzaK(String string2) {
        int n3;
        string2.getClass();
        this.zzo = n3 = this.zzo | 0x10;
        this.zzx = string2;
    }

    public static /* synthetic */ void zzac(zzbdv$zzr zzbdv$zzr, zzhac zzhac2) {
        zzbdv$zzr.zzcg(zzhac2);
    }

    public static /* synthetic */ void zzad(zzbdv$zzr zzbdv$zzr, String string2) {
        zzbdv$zzr.zzci(string2);
    }

    public static /* synthetic */ void zzae(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaz();
    }

    public static /* synthetic */ void zzaf(zzbdv$zzr zzbdv$zzr, zzhac zzhac2) {
        zzbdv$zzr.zzcj(zzhac2);
    }

    public static /* synthetic */ void zzag(zzbdv$zzr zzbdv$zzr, zzbdv$zzab$zzc zzbdv$zzab$zzc) {
        zzbdv$zzr.zzch(zzbdv$zzab$zzc);
    }

    public static /* synthetic */ void zzah(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzay();
    }

    public static /* synthetic */ void zzai(zzbdv$zzr zzbdv$zzr, zzbdv$zza$zza zzbdv$zza$zza) {
        zzbdv$zzr.zzaJ(zzbdv$zza$zza);
    }

    public static /* synthetic */ void zzaj(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaw();
    }

    public static /* synthetic */ void zzak(zzbdv$zzr zzbdv$zzr, int n3, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzr.zzcq(n3, zzbdv$zzd$zza);
    }

    public static /* synthetic */ void zzal(zzbdv$zzr zzbdv$zzr, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzr.zzav(zzbdv$zzd$zza);
    }

    public static /* synthetic */ void zzam(zzbdv$zzr zzbdv$zzr, Iterable iterable) {
        zzbdv$zzr.zzat(iterable);
    }

    public static /* synthetic */ void zzan(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaF();
    }

    public static /* synthetic */ void zzao(zzbdv$zzr zzbdv$zzr, int n3, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzr.zzcp(n3, zzbdv$zzd$zza);
    }

    public static /* synthetic */ void zzap(zzbdv$zzr zzbdv$zzr, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzr.zzau(zzbdv$zzd$zza);
    }

    public static /* synthetic */ void zzaq(zzbdv$zzr zzbdv$zzr, Iterable iterable) {
        zzbdv$zzr.zzas(iterable);
    }

    public static /* synthetic */ void zzar(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaE();
    }

    private void zzas(Iterable object) {
        int n3;
        this.zzaG();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            zzbdv$zzd$zza zzbdv$zzd$zza = (zzbdv$zzd$zza)object.next();
            zzhbw zzhbw2 = this.zzC;
            n3 = zzbdv$zzd$zza.zza();
            zzhbw2.zzi(n3);
        }
    }

    private void zzat(Iterable object) {
        int n3;
        this.zzaH();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            zzbdv$zzd$zza zzbdv$zzd$zza = (zzbdv$zzd$zza)object.next();
            zzhbw zzhbw2 = this.zzB;
            n3 = zzbdv$zzd$zza.zza();
            zzhbw2.zzi(n3);
        }
    }

    private void zzau(zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzd$zza.getClass();
        this.zzaG();
        zzhbw zzhbw2 = this.zzC;
        int n3 = zzbdv$zzd$zza.zza();
        zzhbw2.zzi(n3);
    }

    private void zzav(zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzd$zza.getClass();
        this.zzaH();
        zzhbw zzhbw2 = this.zzB;
        int n3 = zzbdv$zzd$zza.zza();
        zzhbw2.zzi(n3);
    }

    private void zzaw() {
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFF7F;
        this.zzA = 0;
    }

    private void zzax() {
        String string2;
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFEF;
        this.zzx = string2 = zzbdv$zzr.zzk().zzP();
    }

    private void zzay() {
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFBF;
        this.zzz = 0;
    }

    private void zzaz() {
        String string2;
        int n3;
        this.zzo = n3 = this.zzo & 0xFFFFFFDF;
        this.zzy = string2 = zzbdv$zzr.zzk().zzQ();
    }

    private void zzcg(zzhac object) {
        int n3;
        this.zzx = object = ((zzhac)object).zzy();
        this.zzo = n3 = this.zzo | 0x10;
    }

    private void zzch(zzbdv$zzab$zzc zzbdv$zzab$zzc) {
        int n3;
        this.zzz = n3 = zzbdv$zzab$zzc.zza();
        this.zzo = n3 = this.zzo | 0x40;
    }

    private void zzci(String string2) {
        int n3;
        string2.getClass();
        this.zzo = n3 = this.zzo | 0x20;
        this.zzy = string2;
    }

    private void zzcj(zzhac object) {
        int n3;
        this.zzy = object = ((zzhac)object).zzy();
        this.zzo = n3 = this.zzo | 0x20;
    }

    private void zzck(String string2) {
        int n3;
        string2.getClass();
        this.zzo = n3 = this.zzo | 2;
        this.zzu = string2;
    }

    private void zzcl(zzhac object) {
        int n3;
        this.zzu = object = ((zzhac)object).zzy();
        this.zzo = n3 = this.zzo | 2;
    }

    private void zzcm(int n3) {
        int n4;
        this.zzo = n4 = this.zzo | 1;
        this.zzp = n3;
    }

    private void zzcn(zzbdv$zzar zzbdv$zzar) {
        int n3;
        zzbdv$zzar.getClass();
        this.zzv = zzbdv$zzar;
        this.zzo = n3 = this.zzo | 4;
    }

    private void zzco(zzbdv$zzo$zzb zzbdv$zzo$zzb) {
        int n3;
        this.zzw = n3 = zzbdv$zzo$zzb.zza();
        this.zzo = n3 = this.zzo | 8;
    }

    private void zzcp(int n3, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzd$zza.getClass();
        this.zzaG();
        zzhbw zzhbw2 = this.zzC;
        int n4 = zzbdv$zzd$zza.zza();
        zzhbw2.zze(n3, n4);
    }

    private void zzcq(int n3, zzbdv$zzd$zza zzbdv$zzd$zza) {
        zzbdv$zzd$zza.getClass();
        this.zzaH();
        zzhbw zzhbw2 = this.zzB;
        int n4 = zzbdv$zzd$zza.zza();
        zzhbw2.zze(n3, n4);
    }

    public static zzbdv$zzr$zza zzh() {
        return (zzbdv$zzr$zza)zzm.zzaZ();
    }

    public static zzbdv$zzr$zza zzi(zzbdv$zzr zzbdv$zzr) {
        return (zzbdv$zzr$zza)zzm.zzba(zzbdv$zzr);
    }

    public static /* synthetic */ zzbdv$zzr zzj() {
        return zzm;
    }

    public static zzbdv$zzr zzk() {
        return zzm;
    }

    public static zzbdv$zzr zzl(InputStream inputStream) {
        return (zzbdv$zzr)zzhbo.zzbk(zzm, inputStream);
    }

    public static zzbdv$zzr zzm(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbl(zzm, inputStream, zzhay2);
    }

    public static zzbdv$zzr zzn(zzhac zzhac2) {
        return (zzbdv$zzr)zzhbo.zzbm(zzm, zzhac2);
    }

    public static zzbdv$zzr zzo(zzham zzham2) {
        return (zzbdv$zzr)zzhbo.zzbn(zzm, zzham2);
    }

    public static zzbdv$zzr zzp(InputStream inputStream) {
        return (zzbdv$zzr)zzhbo.zzbo(zzm, inputStream);
    }

    public static zzbdv$zzr zzq(ByteBuffer byteBuffer) {
        return (zzbdv$zzr)zzhbo.zzbp(zzm, byteBuffer);
    }

    public static zzbdv$zzr zzr(byte[] byArray) {
        return (zzbdv$zzr)zzhbo.zzbq(zzm, byArray);
    }

    public static zzbdv$zzr zzs(zzhac zzhac2, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbr(zzm, zzhac2, zzhay2);
    }

    public static zzbdv$zzr zzt(zzham zzham2, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbs(zzm, zzham2, zzhay2);
    }

    public static zzbdv$zzr zzu(InputStream inputStream, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbu(zzm, inputStream, zzhay2);
    }

    public static zzbdv$zzr zzv(ByteBuffer byteBuffer, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbv(zzm, byteBuffer, zzhay2);
    }

    public static zzbdv$zzr zzw(byte[] byArray, zzhay zzhay2) {
        return (zzbdv$zzr)zzhbo.zzbx(zzm, byArray, zzhay2);
    }

    public static zzhdm zzx() {
        return zzm.zzbM();
    }

    public static /* synthetic */ void zzy(zzbdv$zzr zzbdv$zzr, int n3) {
        zzbdv$zzr.zzcm(n3);
    }

    public static /* synthetic */ void zzz(zzbdv$zzr zzbdv$zzr) {
        zzbdv$zzr.zzaB();
    }

    public zzbdv$zzab$zzc zzK() {
        int n3 = this.zzz;
        zzbdv$zzab$zzc zzbdv$zzab$zzc = zzbdv$zzab$zzc.zzb(n3);
        if (zzbdv$zzab$zzc == null) {
            zzbdv$zzab$zzc = zzbdv$zzab$zzc.zza;
        }
        return zzbdv$zzab$zzc;
    }

    public zzbdv$zzar zzL() {
        zzbdv$zzar zzbdv$zzar = this.zzv;
        if (zzbdv$zzar == null) {
            zzbdv$zzar = zzbdv$zzar.zzg();
        }
        return zzbdv$zzar;
    }

    public zzhac zzM() {
        return zzhac.zzw(this.zzx);
    }

    public zzhac zzN() {
        return zzhac.zzw(this.zzy);
    }

    public zzhac zzO() {
        return zzhac.zzw(this.zzu);
    }

    public String zzP() {
        return this.zzx;
    }

    public String zzQ() {
        return this.zzy;
    }

    public String zzR() {
        return this.zzu;
    }

    public List zzS() {
        zzhbw zzhbw2 = this.zzC;
        zzhbx zzhbx2 = zzl;
        zzhby zzhby2 = new zzhby(zzhbw2, zzhbx2);
        return zzhby2;
    }

    public List zzT() {
        zzhbw zzhbw2 = this.zzB;
        zzhbx zzhbx2 = zzk;
        zzhby zzhby2 = new zzhby(zzhbw2, zzhbx2);
        return zzhby2;
    }

    public boolean zzU() {
        int n3 = this.zzo & 0x80;
        return n3 != 0;
    }

    public boolean zzV() {
        int n3 = this.zzo & 0x10;
        return n3 != 0;
    }

    public boolean zzW() {
        int n3 = this.zzo & 0x40;
        return n3 != 0;
    }

    public boolean zzX() {
        int n3 = this.zzo & 0x20;
        return n3 != 0;
    }

    public boolean zzY() {
        int n3 = this.zzo & 2;
        return n3 != 0;
    }

    public boolean zzZ() {
        int n3 = this.zzo;
        int n4 = 1;
        if ((n3 &= n4) != 0) {
            return n4 != 0;
        }
        return false;
    }

    public int zza() {
        return this.zzp;
    }

    public boolean zzaa() {
        int n3 = this.zzo & 4;
        return n3 != 0;
    }

    public boolean zzab() {
        int n3 = this.zzo & 8;
        return n3 != 0;
    }

    public int zzb() {
        return this.zzC.size();
    }

    public int zzc() {
        return this.zzB.size();
    }

    public zzbdv$zza$zza zzd() {
        int n3 = this.zzA;
        zzbdv$zza$zza zzbdv$zza$zza = zzbdv$zza$zza.zzb(n3);
        if (zzbdv$zza$zza == null) {
            zzbdv$zza$zza = zzbdv$zza$zza.zza;
        }
        return zzbdv$zza$zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = zzhbn.zza;
        int n3 = object.ordinal();
        object2 = null;
        switch (n3) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 6: {
                object = zzn;
                if (object != null) return object;
                clazz = zzbdv$zzr.class;
                synchronized (clazz) {
                    try {
                        object = zzn;
                        if (object != null) return object;
                        object2 = zzm;
                        object = new zzhbj((zzhbo)object2);
                        zzn = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zzm;
            }
            case 4: {
                return new zzbdv$zzr$zza(null);
            }
            case 3: {
                return new zzbdv$zzr();
            }
            case 2: {
                object = zzbdv$zzo$zzb.zze();
                object2 = zzbdv$zzab$zzc.zze();
                zzhbu zzhbu2 = zzbdv$zza$zza.zze();
                zzhbu zzhbu3 = zzbdv$zzd$zza.zze();
                zzhbu zzhbu4 = zzbdv$zzd$zza.zze();
                Object[] objectArray = new Object[16];
                objectArray[0] = "zzo";
                objectArray[by2] = "zzp";
                objectArray[2] = "zzu";
                objectArray[3] = "zzv";
                objectArray[4] = "zzw";
                objectArray[5] = object;
                objectArray[6] = "zzx";
                objectArray[7] = "zzy";
                objectArray[8] = "zzz";
                objectArray[9] = object2;
                objectArray[10] = "zzA";
                objectArray[11] = zzhbu2;
                objectArray[12] = "zzB";
                objectArray[13] = zzhbu3;
                objectArray[14] = "zzC";
                objectArray[15] = zzhbu4;
                return zzhbo.zzbR(zzm, "\u0001\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007\u1004\u0000\b\u1008\u0001\t\u1009\u0002\n\u180c\u0003\u000b\u1008\u0004\f\u1008\u0005\r\u180c\u0006\u000e\u180c\u0007\u000f\u081e\u0010\u081e", objectArray);
            }
            case 1: {
                return null;
            }
            case 0: 
        }
        return by2;
    }

    public zzbdv$zzd$zza zze(int n3) {
        zzhbw zzhbw2 = this.zzC;
        zzbdv$zzd$zza zzbdv$zzd$zza = zzbdv$zzd$zza.zzb(n3 = zzhbw2.zzd(n3));
        if (zzbdv$zzd$zza == null) {
            zzbdv$zzd$zza = zzbdv$zzd$zza.zza;
        }
        return zzbdv$zzd$zza;
    }

    public zzbdv$zzd$zza zzf(int n3) {
        zzhbw zzhbw2 = this.zzB;
        zzbdv$zzd$zza zzbdv$zzd$zza = zzbdv$zzd$zza.zzb(n3 = zzhbw2.zzd(n3));
        if (zzbdv$zzd$zza == null) {
            zzbdv$zzd$zza = zzbdv$zzd$zza.zza;
        }
        return zzbdv$zzd$zza;
    }

    public zzbdv$zzo$zzb zzg() {
        int n3 = this.zzw;
        zzbdv$zzo$zzb zzbdv$zzo$zzb = zzbdv$zzo$zzb.zzb(n3);
        if (zzbdv$zzo$zzb == null) {
            zzbdv$zzo$zzb = zzbdv$zzo$zzb.zza;
        }
        return zzbdv$zzo$zzb;
    }
}

