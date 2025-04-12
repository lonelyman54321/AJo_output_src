/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzgp;
import com.google.android.gms.internal.gtm.zzgr;
import com.google.android.gms.internal.gtm.zzgt;
import com.google.android.gms.internal.gtm.zzgw;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhq;
import com.google.android.gms.internal.gtm.zzhr;
import com.google.android.gms.internal.gtm.zzhs;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzig;
import com.google.android.gms.internal.gtm.zzjk;
import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzkl;
import com.google.android.gms.internal.gtm.zzlm;
import com.google.android.gms.internal.gtm.zzlo;
import com.google.android.gms.internal.gtm.zzlp;
import com.google.android.gms.internal.gtm.zzlq;
import com.google.android.gms.internal.gtm.zzlr;
import com.google.android.gms.internal.gtm.zzls;
import com.google.android.gms.internal.gtm.zzlt;
import com.google.android.gms.internal.gtm.zzlu;
import com.google.android.gms.internal.gtm.zzlv;
import com.google.android.gms.internal.gtm.zzlw;
import com.google.android.gms.internal.gtm.zzms;
import com.google.android.gms.internal.gtm.zzmt;
import com.google.android.gms.internal.gtm.zzmu;
import com.google.android.gms.internal.gtm.zzmv;
import com.google.android.gms.internal.gtm.zzmw;
import com.google.android.gms.internal.gtm.zzmx;
import com.google.android.gms.internal.gtm.zzmy;
import com.google.android.gms.internal.gtm.zzmz;
import com.google.android.gms.internal.gtm.zzna;
import com.google.android.gms.internal.gtm.zznb;
import com.google.android.gms.internal.gtm.zznc;
import com.google.android.gms.internal.gtm.zznd;
import com.google.android.gms.internal.gtm.zzne;
import com.google.android.gms.internal.gtm.zznf;
import com.google.android.gms.internal.gtm.zzng;
import com.google.android.gms.internal.gtm.zznh;
import com.google.android.gms.internal.gtm.zzni;
import com.google.android.gms.internal.gtm.zznj;
import com.google.android.gms.internal.gtm.zznk;
import com.google.android.gms.internal.gtm.zznl;
import com.google.android.gms.internal.gtm.zznm;
import com.google.android.gms.internal.gtm.zznn;
import com.google.android.gms.internal.gtm.zzno;
import com.google.android.gms.internal.gtm.zznp;
import com.google.android.gms.internal.gtm.zznq;
import com.google.android.gms.internal.gtm.zznr;
import com.google.android.gms.internal.gtm.zzns;
import com.google.android.gms.internal.gtm.zznt;
import com.google.android.gms.internal.gtm.zznu;
import com.google.android.gms.internal.gtm.zznv;
import com.google.android.gms.internal.gtm.zznw;
import com.google.android.gms.internal.gtm.zznx;
import com.google.android.gms.internal.gtm.zzny;
import com.google.android.gms.internal.gtm.zznz;
import com.google.android.gms.internal.gtm.zzoa;
import com.google.android.gms.internal.gtm.zzob;
import com.google.android.gms.internal.gtm.zzoc;
import com.google.android.gms.internal.gtm.zzod;
import com.google.android.gms.internal.gtm.zzoe;
import com.google.android.gms.internal.gtm.zzof;
import com.google.android.gms.internal.gtm.zzog;
import com.google.android.gms.internal.gtm.zzoh;
import com.google.android.gms.internal.gtm.zzoi;
import com.google.android.gms.internal.gtm.zzoj;
import com.google.android.gms.internal.gtm.zzok;
import com.google.android.gms.internal.gtm.zzol;
import com.google.android.gms.internal.gtm.zzom;
import com.google.android.gms.internal.gtm.zzon;
import com.google.android.gms.internal.gtm.zzoo;
import com.google.android.gms.internal.gtm.zzop;
import com.google.android.gms.internal.gtm.zzor;
import com.google.android.gms.internal.gtm.zzos;
import com.google.android.gms.internal.gtm.zzot;
import com.google.android.gms.internal.gtm.zzou;
import com.google.android.gms.internal.gtm.zzov;
import com.google.android.gms.internal.gtm.zzow;
import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqe;
import com.google.android.gms.internal.gtm.zzqh;
import com.google.android.gms.internal.gtm.zzqk;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;
import com.google.android.gms.tagmanager.zzcb;
import com.google.android.gms.tagmanager.zzck;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzhv {
    private final Context zza;
    private final String zzb;
    private final zzpy zzc;
    private final zzck zzd;
    private final zzcb zze;
    private final zzhx zzf;
    private final zzqw zzg;
    private final zzqw zzh;
    private final Set zzi;
    private int zzj;
    private zznm zzk;
    private zzgt zzl;
    private final zzht zzm;

    public zzhv(Context object, String object2, zzpy object3, zzqh arrayList, zzck object4, zzcb object5) {
        boolean bl2;
        zzqw zzqw2;
        Object object6 = new zzhx();
        this.zzf = object6;
        int n3 = 50;
        Object object7 = new HashMap(n3);
        this.zzg = zzqw2 = new zzqw((Map)object7);
        Object object8 = new HashMap(10);
        this.zzh = object7 = new zzqw((Map)object8);
        this.zzi = object8;
        this.zzm = object8 = new zzhq(this);
        Preconditions.checkNotNull(object3, "Internal Error: Container resource cannot be null");
        Preconditions.checkNotNull(arrayList, "Internal Error: Runtime resource cannot be null");
        Preconditions.checkNotEmpty((String)object2, "Internal Error: ContainerId cannot be empty");
        Preconditions.checkNotNull(object4);
        Preconditions.checkNotNull(object5);
        this.zza = object;
        this.zzb = object2;
        this.zzc = object3;
        this.zzd = object4;
        this.zze = object5;
        Object object9 = new zzkl();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("1", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("12", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("18", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("19", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("20", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("21", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("23", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("24", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("27", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("28", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("29", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("30", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("32", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("33", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("34", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("35", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("39", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("40", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("0", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("10", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("25", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("26", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("37", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("2", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("3", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("4", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("5", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("6", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("7", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("8", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("9", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("13", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("47", (zzqo)object5);
        super();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("15", (zzqo)object5);
        super(this);
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("48", (zzqo)object5);
        object5 = new zzlm();
        object9 = new zzqr((zzjm)object5);
        String string2 = "16";
        ((zzhx)object6).zzc(string2, (zzqo)object9);
        object9 = new zzqr((zzjm)object5);
        ((zzhx)object6).zzc("17", (zzqo)object9);
        object9 = new zzlo();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("22", (zzqo)object5);
        object9 = new zzlp();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("45", (zzqo)object5);
        object9 = new zzlq();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("46", (zzqo)object5);
        object9 = new zzlr();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("36", (zzqo)object5);
        object9 = new zzls();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("43", (zzqo)object5);
        object9 = new zzlt();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("38", (zzqo)object5);
        object9 = new zzlu();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("44", (zzqo)object5);
        object9 = new zzlv();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("41", (zzqo)object5);
        object9 = new zzlw();
        object5 = new zzqr((zzjm)object9);
        ((zzhx)object6).zzc("42", (zzqo)object5);
        object5 = com.google.android.gms.internal.gtm.zza.zzam;
        object9 = new zzoj();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzal;
        object9 = new zzok();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzan;
        object9 = new zzol();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzar;
        object9 = new zzom();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzaq;
        object9 = new zzon();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzap;
        object9 = new zzoo();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzao;
        object9 = new zzop();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzaj;
        object9 = new zzor();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object5 = com.google.android.gms.internal.gtm.zza.zzak;
        object9 = new zzos();
        this.zzl((zza)((Object)object5), (zzjm)object9);
        object9 = new zznc((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("advertiserId", (zzqo)object5);
        object9 = new zznd((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("advertiserTrackingEnabled", (zzqo)object5);
        object9 = new zzne((zzht)object8);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("adwordsClickReferrer", (zzqo)object5);
        object9 = new zznf((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("applicationId", (zzqo)object5);
        object9 = new zzng((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("applicationName", (zzqo)object5);
        object9 = new zznh((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("applicationVersion", (zzqo)object5);
        object9 = new zzni((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("applicationVersionName", (zzqo)object5);
        int n4 = 1;
        object9 = new zzmz(n4, (zzhx)object6);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("arbitraryPixieMacro", (zzqo)object5);
        object9 = new zznj((Context)object);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("carrier", (zzqo)object5);
        object9 = new zzlr();
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("constant", (zzqo)object5);
        zzqz zzqz2 = new zzqz((String)object2);
        object9 = new zznk(zzqz2);
        object5 = new zzqr((zzjm)object9);
        zzqw2.zzf("containerId", (zzqo)object5);
        object3 = ((zzpy)object3).zzb();
        object9 = new zzqz((String)object3);
        object5 = new zznk((zzqo)object9);
        object2 = new zzqr((zzjm)object5);
        zzqw2.zzf("containerVersion", (zzqo)object2);
        object9 = null;
        object5 = new zzhs(this, null);
        object3 = new zzmy((zzmx)object5);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("customMacro", (zzqo)object2);
        object3 = new zznn();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("deviceBrand", (zzqo)object2);
        object3 = new zzno((Context)object);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("deviceId", (zzqo)object2);
        object3 = new zznp();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("deviceModel", (zzqo)object2);
        object3 = new zznq();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("deviceName", (zzqo)object2);
        object3 = new zznr();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("encode", (zzqo)object2);
        object3 = new zzns();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("encrypt", (zzqo)object2);
        object3 = new zznl();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("event", (zzqo)object2);
        object3 = new zznt((zzht)object8);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("eventParameters", (zzqo)object2);
        object3 = new zznu();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("version", (zzqo)object2);
        object3 = new zznv();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("hashcode", (zzqo)object2);
        object3 = new zznw((Context)object);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("installReferrer", (zzqo)object2);
        object3 = new zznx();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("join", (zzqo)object2);
        object3 = new zzny();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("language", (zzqo)object2);
        object3 = new zznz();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("locale", (zzqo)object2);
        object3 = new zzob((Context)object);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("adWordsUniqueId", (zzqo)object2);
        object3 = new zzoc();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("osVersion", (zzqo)object2);
        object3 = new zzod();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("platform", (zzqo)object2);
        object3 = new zzoe();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("random", (zzqo)object2);
        object3 = new zzof();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("regexGroup", (zzqo)object2);
        object3 = new zzoh((Context)object);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("resolution", (zzqo)object2);
        object3 = new zzog();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("runtimeVersion", (zzqo)object2);
        object3 = new zzoi();
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("sdkVersion", (zzqo)object2);
        object3 = this.zzk = (object2 = new zznm());
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("currentTime", (zzqo)object2);
        object3 = new zzoa((zzht)object8);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("userProperty", (zzqo)object2);
        object5 = zzgr.zza((Context)object);
        object3 = new zzov((zzgw)object5);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("arbitraryPixel", (zzqo)object2);
        object5 = new zzhr(this, null);
        object3 = new zzmy((zzmx)object5);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("customTag", (zzqo)object2);
        object3 = new zzow((Context)object, (zzht)object8);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("universalAnalytics", (zzqo)object2);
        object5 = zzgr.zza((Context)object);
        object3 = new zzot((zzgw)object5);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("queueRequest", (zzqo)object2);
        object3 = new zzou((zzck)object4, (zzht)object8);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("sendMeasurement", (zzqo)object2);
        object4 = null;
        object3 = new zzmz(0, (zzhx)object6);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("arbitraryPixieTag", (zzqo)object2);
        object3 = new zznb((Context)object, (zzht)object8);
        object2 = new zzqr((zzjm)object3);
        zzqw2.zzf("suppressPassthrough", (zzqo)object2);
        object2 = new zzms();
        super((zzjm)object2);
        ((zzqo)object7).zzf("decodeURI", (zzqo)object);
        object2 = new zzmt();
        super((zzjm)object2);
        ((zzqo)object7).zzf("decodeURIComponent", (zzqo)object);
        object2 = new zzmu();
        super((zzjm)object2);
        ((zzqo)object7).zzf("encodeURI", (zzqo)object);
        object2 = new zzmv();
        super((zzjm)object2);
        ((zzqo)object7).zzf("encodeURIComponent", (zzqo)object);
        object2 = new zzna();
        super((zzjm)object2);
        ((zzqo)object7).zzf("log", (zzqo)object);
        object2 = new zzmw();
        super((zzjm)object2);
        object2 = "isArray";
        ((zzqo)object7).zzf((String)object2, (zzqo)object);
        object = ((zzqh)((Object)arrayList)).zza().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzjl)object.next();
            object3 = this.zzf;
            ((zzjl)object2).zzc((zzhx)object3);
            object3 = this.zzf;
            arrayList = ((zzjl)object2).zzb();
            object4 = new zzqr((zzjm)object2);
            ((zzhx)object3).zzc((String)((Object)arrayList), (zzqo)object4);
        }
        object2 = new HashMap(n4);
        object = new zzqw((Map)object2);
        object2 = this.zzg;
        ((zzqo)object).zzf("mobile", (zzqo)object2);
        object2 = this.zzh;
        ((zzqo)object).zzf("common", (zzqo)object2);
        this.zzf.zzc("gtmUtils", (zzqo)object);
        arrayList = this.zzg.zzi();
        object3 = new HashMap(arrayList);
        object2 = new zzqw((Map)object3);
        ((zzqw)object2).zzj();
        object4 = this.zzh.zzi();
        arrayList = new ArrayList<Object>(object4);
        object3 = new zzqw((Map)((Object)arrayList));
        ((zzqw)object3).zzj();
        arrayList = this.zzf;
        object4 = "main";
        boolean bl3 = ((zzhx)((Object)arrayList)).zzf((String)object4);
        if (bl3 && (bl3 = (arrayList = this.zzf.zzb((String)object4)) instanceof zzqr)) {
            arrayList = new ArrayList<Object>();
            arrayList.add(object);
            object5 = this.zzf;
            object6 = new zzqx((String)object4, arrayList);
            zzra.zzd((zzhx)object5, (zzqx)object6);
        }
        arrayList = this.zzg;
        object4 = "base";
        ((zzqo)((Object)arrayList)).zzf((String)object4, (zzqo)object2);
        this.zzh.zzf((String)object4, (zzqo)object3);
        ((zzqw)object).zzj();
        this.zzg.zzj();
        this.zzh.zzj();
    }

    public static /* bridge */ /* synthetic */ zzcb zza(zzhv zzhv2) {
        return zzhv2.zze;
    }

    public static /* bridge */ /* synthetic */ zzgt zzb(zzhv zzhv2) {
        return zzhv2.zzl;
    }

    private final zzqo zzg(Map object) {
        Object object2;
        block11: {
            Object object3;
            boolean bl2;
            block10: {
                Object object4;
                block9: {
                    Object object5;
                    boolean bl3;
                    object2 = com.google.android.gms.internal.gtm.zzb.zzbo.toString();
                    bl2 = (object2 = (zzqo)object.get(object2)) instanceof zzqz;
                    if (!bl2) {
                        object = this.zza;
                        zzgp.zza("No function id in properties", (Context)object);
                        return zzqs.zze;
                    }
                    object3 = this.zzf;
                    bl2 = ((zzhx)object3).zzf((String)(object2 = ((zzqz)object2).zzk()));
                    if (!bl2) break block9;
                    object3 = new HashMap();
                    object = object.entrySet().iterator();
                    while (bl3 = object.hasNext()) {
                        String string2;
                        object5 = (Map.Entry)object.next();
                        String string3 = (String)object5.getKey();
                        boolean bl4 = string3.startsWith(string2 = "vtp_");
                        if (!bl4) continue;
                        string3 = (String)object5.getKey();
                        int n3 = 4;
                        string3 = string3.substring(n3);
                        object5 = (zzqo)object5.getValue();
                        ((HashMap)object3).put(string3, object5);
                    }
                    object = new ArrayList();
                    object5 = new zzqw((Map)object3);
                    ((ArrayList)object).add(object5);
                    object3 = new zzqx((String)object2, (List)object);
                    break block10;
                }
                object3 = zzjk.zzb((String)object2);
                if (object3 == null || !(bl2 = ((zzqo)(object4 = this.zzg)).zzh((String)object3))) break block11;
                object3 = this.zzf;
                try {
                    object3 = zzjk.zza((String)object2, (Map)object, (zzhx)object3);
                }
                catch (RuntimeException runtimeException) {
                    object = runtimeException.getMessage();
                    object4 = "Incorrect keys for function ";
                    object3 = new StringBuilder((String)object4);
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ". ";
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    zzhi.zza((String)object);
                    bl2 = false;
                    object3 = null;
                }
            }
            if (object3 == null) {
                object = this.zza;
                zzgp.zza("Internal error: failed to convert function to a valid statement", (Context)object);
                return zzqs.zze;
            }
            object = String.valueOf(((zzqx)object3).zzi());
            object2 = "Executing: ";
            zzhi.zzd(((String)object2).concat((String)object));
            object = zzra.zzd(this.zzf, (zzqx)object3);
            boolean bl5 = object instanceof zzqs;
            if (bl5) {
                object2 = object;
                object2 = (zzqs)object;
                bl2 = ((zzqs)object2).zzj();
                if (bl2) {
                    object = ((zzqs)object2).zzi();
                }
            }
            return (zzqo)object;
        }
        object = cP.a("functionId '", (String)object2, "' is not supported");
        object2 = this.zza;
        zzgp.zza((String)object, (Context)object2);
        return zzqs.zze;
    }

    private final zzqo zzh(zzqk iterator) {
        zzqo zzqo2;
        Object object;
        int n3 = ((zzqk)((Object)iterator)).zza();
        switch (n3) {
            default: {
                iterator = (Boolean)((zzqk)((Object)iterator)).zzb();
                zzqp zzqp2 = new zzqp((Boolean)((Object)iterator));
                return zzqp2;
            }
            case 7: {
                boolean bl2;
                Object object2 = new StringBuilder();
                iterator = ((List)((zzqk)((Object)iterator)).zzb()).iterator();
                while (bl2 = iterator.hasNext()) {
                    Object object3 = (zzqk)iterator.next();
                    object3 = zzjn.zzd(this.zzh((zzqk)object3));
                    ((StringBuilder)object2).append((String)object3);
                }
                iterator = ((StringBuilder)object2).toString();
                object2 = new zzqz((String)((Object)iterator));
                return object2;
            }
            case 6: {
                iterator = ((Integer)((zzqk)((Object)iterator)).zzb()).doubleValue();
                zzqq zzqq2 = new zzqq((Double)((Object)iterator));
                return zzqq2;
            }
            case 5: {
                iterator = (String)((zzqk)((Object)iterator)).zzb();
                zzqz zzqz2 = new zzqz((String)((Object)iterator));
                return zzqz2;
            }
            case 4: {
                Object object4;
                Object object5 = (String)((zzqk)((Object)iterator)).zzb();
                object5 = this.zzi((String)object5);
                boolean bl3 = object5 instanceof zzqz;
                if (bl3 && !(bl3 = (object4 = ((zzqk)((Object)iterator)).zzc()).isEmpty())) {
                    int n4;
                    object5 = ((zzqz)object5).zzk();
                    iterator = ((zzqk)((Object)iterator)).zzc().iterator();
                    while ((n4 = iterator.hasNext()) != 0) {
                        int n7;
                        Object object6 = (Integer)iterator.next();
                        n4 = (Integer)object6;
                        if (n4 != (n7 = 12)) continue;
                        object6 = "UTF-8";
                        object6 = URLEncoder.encode((String)object5, (String)object6);
                        String string2 = "\\+";
                        String string3 = "%20";
                        try {
                            object5 = ((String)object6).replaceAll(string2, string3);
                        }
                        catch (UnsupportedEncodingException unsupportedEncodingException) {
                            string2 = "Escape URI: unsupported encoding";
                            zzhi.zzb(string2, unsupportedEncodingException);
                        }
                    }
                    object4 = new zzqz((String)object5);
                    return object4;
                }
                return (zzqo)object5;
            }
            case 3: {
                iterator = (Map)((zzqk)((Object)iterator)).zzb();
                int n8 = iterator.size();
                HashMap<Object, Object> hashMap = new HashMap<Object, Object>(n8);
                iterator = iterator.entrySet().iterator();
                while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Object object7 = (Map.Entry)iterator.next();
                    Object object8 = (zzqk)object7.getKey();
                    object8 = this.zzh((zzqk)object8);
                    object7 = (zzqk)object7.getValue();
                    object7 = this.zzh((zzqk)object7);
                    object8 = zzjn.zzd((zzqo)object8);
                    hashMap.put(object8, object7);
                }
                iterator = new Iterator(hashMap);
                return iterator;
            }
            case 2: {
                iterator = (List)((zzqk)((Object)iterator)).zzb();
                int n10 = iterator.size();
                ArrayList<Object> arrayList = new ArrayList<Object>(n10);
                iterator = iterator.iterator();
                while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    Object object9 = (zzqk)iterator.next();
                    object9 = this.zzh((zzqk)object9);
                    arrayList.add(object9);
                }
                iterator = new Iterator(arrayList);
                return iterator;
            }
            case 1: 
        }
        try {
            object = ((zzqk)((Object)iterator)).zzb();
        }
        catch (NumberFormatException numberFormatException) {
            iterator = (String)((zzqk)((Object)iterator)).zzb();
            zzqo2 = new zzqz((String)((Object)iterator));
            return zzqo2;
        }
        object = (String)object;
        double d2 = Double.parseDouble((String)object);
        object = d2;
        zzqo2 = new zzqq((Double)object);
        return zzqo2;
    }

    private final zzqo zzi(String string2) {
        int n3;
        this.zzj = n3 = this.zzj + 1;
        Object object = this.zzj();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("Beginning to evaluate variable ");
        ((StringBuilder)object2).append(string2);
        zzhi.zzd(((StringBuilder)object2).toString());
        object = this.zzi;
        n3 = (int)(object.contains(string2) ? 1 : 0);
        if (n3 == 0) {
            this.zzi.add(string2);
            object = this.zzc.zza(string2);
            if (object != null) {
                int n4;
                object = ((zzqb)object).zza();
                object = this.zzk((Map)object);
                object = this.zzg((Map)object);
                object2 = this.zzj();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object2);
                stringBuilder.append("Done evaluating variable ");
                stringBuilder.append(string2);
                zzhi.zzd(stringBuilder.toString());
                this.zzj = n4 = this.zzj + -1;
                this.zzi.remove(string2);
                return object;
            }
            this.zzj = n3 = this.zzj + -1;
            this.zzi.remove(string2);
            string2 = n1.a(this.zzj(), "Attempting to resolve unknown macro ", string2);
            object = new IllegalStateException(string2);
            throw object;
        }
        this.zzj = n3 = this.zzj + -1;
        object = this.zzi;
        object = object.toString();
        string2 = UX.c("Macro cycle detected.  Current macro reference: ", string2, ". Previous macro references: ", (String)object);
        object2 = new IllegalStateException(string2);
        throw object2;
    }

    private final String zzj() {
        char c2;
        int n3 = this.zzj;
        int n4 = 1;
        if (n3 <= n4) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Integer.toString(this.zzj);
        stringBuilder.append(string2);
        for (n4 = 2; n4 < (c2 = this.zzj); ++n4) {
            c2 = ' ';
            stringBuilder.append(c2);
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private final Map zzk(Map object) {
        boolean bl2;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (zzqk)object2.getValue();
            object2 = this.zzh((zzqk)object2);
            hashMap.put(string2, object2);
        }
        return hashMap;
    }

    private final void zzl(zza object, zzjm zzjm2) {
        object = zzjk.zzb(object.toString());
        zzqr zzqr2 = new zzqr(zzjm2);
        this.zzg.zzf((String)object, zzqr2);
    }

    public final zzqo zzc(String string2) {
        Object object = this.zzi;
        boolean bl2 = object.contains(string2);
        if (!bl2) {
            this.zzj = 0;
            return this.zzi(string2);
        }
        object = this.zzi;
        object = object.toString();
        string2 = UX.c("Macro cycle detected.  Current macro reference: ", string2, ". Previous macro references: ", (String)object);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final zzqo zzd(zzqb object) {
        Object object2 = this.zzi;
        object2.clear();
        try {
            object = ((zzqb)object).zza();
        }
        catch (IllegalStateException illegalStateException) {
            zzhi.zza("Error evaluating predicate.");
            return zzqs.zzd;
        }
        object = this.zzk((Map)object);
        object = this.zzg((Map)object);
        boolean bl2 = object instanceof zzqp;
        if (!bl2) {
            object = "Predicate must return a boolean value";
            object2 = this.zza;
            zzgp.zza((String)object, (Context)object2);
            object2 = Boolean.FALSE;
            object = new zzqp((Boolean)object2);
        }
        return (zzqo)object;
    }

    public final void zze() {
        zzgr.zza(this.zza);
        zzig.zzf().zzi();
    }

    public final void zzf(zzgt object) {
        boolean bl2;
        Object object2;
        Object object3;
        int n4;
        HashSet hashSet = ((zzgt)object).zzb();
        Object object4 = new zzqz((String)((Object)hashSet));
        hashSet = this.zzf;
        Object object5 = "gtm.globals.eventName";
        ((zzhx)((Object)hashSet)).zzc((String)object5, (zzqo)object4);
        this.zzk.zza((Clock)object);
        this.zzl = object;
        object4 = new HashSet();
        hashSet = new HashSet();
        Object object6 = new HashMap();
        Object object7 = this.zzc.zzc().iterator();
        while ((n4 = object7.hasNext()) != 0) {
            Object object8;
            Object object9;
            boolean n3;
            block39: {
                boolean bl3;
                object3 = (zzqe)object7.next();
                object2 = ((zzqe)object3).zza();
                n3 = object2.isEmpty();
                if (n3 && (n3 = (object2 = ((zzqe)object3).zzd()).isEmpty())) {
                    object3 = String.valueOf(object3);
                    object2 = "Trigger is not being evaluated since it has no associated tags: ";
                    object3 = ((String)object2).concat((String)object3);
                    zzhi.zzd((String)object3);
                    continue;
                }
                object2 = String.valueOf(object3);
                object9 = "Evaluating trigger ";
                zzhi.zzd(((String)object9).concat((String)object2));
                object2 = ((zzqe)object3).zzb().iterator();
                while (bl3 = object2.hasNext()) {
                    object9 = (zzqb)object2.next();
                    object8 = (zzqo)((HashMap)object6).get(object9);
                    if (object8 == null) {
                        object8 = this.zzd((zzqb)object9);
                        ((HashMap)object6).put(object9, object8);
                    }
                    if (object8 != (object9 = zzqs.zzd)) {
                        object9 = ((zzqp)(object8 = (zzqp)object8)).zzi();
                        bl3 = (Boolean)object9;
                        if (!bl3) continue;
                        object2 = Boolean.FALSE;
                        object9 = new zzqp((Boolean)object2);
                    }
                    break block39;
                }
                object2 = ((zzqe)object3).zzc().iterator();
                while (bl3 = object2.hasNext()) {
                    object9 = (zzqb)object2.next();
                    object8 = (zzqo)((HashMap)object6).get(object9);
                    if (object8 == null) {
                        object8 = this.zzd((zzqb)object9);
                        ((HashMap)object6).put(object9, object8);
                    }
                    if (object8 != (object9 = zzqs.zzd)) {
                        object9 = ((zzqp)(object8 = (zzqp)object8)).zzi();
                        bl3 = (Boolean)object9;
                        if (bl3) continue;
                        object2 = Boolean.FALSE;
                        object9 = new zzqp((Boolean)object2);
                    }
                    break block39;
                }
                object2 = Boolean.TRUE;
                object9 = new zzqp((Boolean)object2);
            }
            if (object9 == (object2 = zzqs.zzd)) {
                object2 = String.valueOf(object3);
                object9 = this.zza;
                object8 = "Error encounted while evaluating trigger ";
                zzgp.zzc(((String)object8).concat((String)object2), (Context)object9);
                object2 = ((zzqe)object3).zzd();
                n3 = object2.isEmpty();
                if (n3) continue;
                object2 = String.valueOf(((zzqe)object3).zzd());
                object9 = "Blocking tags: ";
                object2 = ((String)object9).concat((String)object2);
                zzhi.zzd((String)object2);
                object3 = ((zzqe)object3).zzd();
                hashSet.addAll(object3);
                continue;
            }
            object2 = ((zzqp)(object9 = (zzqp)object9)).zzi();
            n3 = (Boolean)object2;
            if (!n3) continue;
            object2 = String.valueOf(object3);
            object9 = "Trigger is firing: ";
            zzhi.zzd(((String)object9).concat((String)object2));
            object2 = ((zzqe)object3).zza();
            n3 = object2.isEmpty();
            if (!n3) {
                object2 = String.valueOf(((zzqe)object3).zza());
                object9 = "Adding tags to firing candidates: ";
                zzhi.zzd(((String)object9).concat((String)object2));
                object2 = ((zzqe)object3).zza();
                object4.addAll(object2);
            }
            if (n3 = (object2 = ((zzqe)object3).zzd()).isEmpty()) continue;
            object2 = String.valueOf(((zzqe)object3).zzd());
            object9 = "Blocking disabled tags: ";
            object2 = ((String)object9).concat((String)object2);
            zzhi.zzd((String)object2);
            object3 = ((zzqe)object3).zzd();
            hashSet.addAll(object3);
        }
        object4.removeAll(hashSet);
        object4 = ((HashSet)object4).iterator();
        boolean bl4 = false;
        hashSet = null;
        while (bl2 = object4.hasNext()) {
            int n3;
            object6 = (zzqb)object4.next();
            this.zzi.clear();
            object7 = String.valueOf(object6);
            object3 = "Executing firing tag ";
            object7 = ((String)object3).concat((String)object7);
            zzhi.zzd((String)object7);
            object7 = ((zzqb)object6).zza();
            object7 = this.zzk((Map)object7);
            this.zzg((Map)object7);
            object7 = ((zzqb)object6).zza();
            object3 = com.google.android.gms.internal.gtm.zzb.zzaJ;
            object3 = ((zzb)((Object)object3)).toString();
            object7 = object7.get(object3);
            if ((object7 = (zzqk)object7) == null) continue;
            n4 = ((zzqk)object7).zza();
            if (n4 != (n3 = 8)) continue;
            object7 = ((zzqk)object7).zzb();
            object7 = (Boolean)object7;
            boolean bl5 = (Boolean)object7;
            if (!bl5) continue;
            bl4 = true;
            object7 = String.valueOf(object6);
            object3 = new StringBuilder();
            object2 = "Tag configured to dispatch on fire: ";
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append((String)object7);
            object7 = ((StringBuilder)object3).toString();
            try {
                zzhi.zzd((String)object7);
            }
            catch (IllegalStateException illegalStateException) {
                object6 = String.valueOf(object6);
                object2 = ": ";
                object6 = cP.a("Error firing tag ", (String)object6, (String)object2);
                object3 = this.zza;
                zzgp.zzb((String)object6, illegalStateException, (Context)object3);
            }
        }
        object4 = this.zzf;
        ((zzhx)object4).zzd((String)object5);
        boolean bl6 = ((zzgt)object).zzf();
        if (bl6) {
            object4 = ((zzgt)object).zzb();
            object6 = "Log passthrough event ";
            object5 = new StringBuilder((String)object6);
            ((StringBuilder)object5).append((String)object4);
            ((StringBuilder)object5).append(" to Firebase.");
            object4 = ((StringBuilder)object5).toString();
            zzhi.zzd((String)object4);
            object5 = this.zzd;
            object6 = ((zzgt)object).zzc();
            object7 = ((zzgt)object).zzb();
            object3 = ((zzgt)object).zza();
            long l2 = ((zzgt)object).currentTimeMillis();
            try {
                object5.zzc((String)object6, (String)object7, (Bundle)object3, l2);
            }
            catch (RemoteException remoteException) {
                object4 = this.zza;
                object5 = "Error calling measurement proxy: ";
                zzgp.zzb((String)object5, remoteException, (Context)object4);
            }
        } else {
            object = ((zzgt)object).zzb();
            object5 = "Non-passthrough event ";
            object4 = new StringBuilder((String)object5);
            ((StringBuilder)object4).append((String)object);
            ((StringBuilder)object4).append(" doesn't get logged to Firebase directly.");
            object = ((StringBuilder)object4).toString();
            zzhi.zzd((String)object);
        }
        if (bl4) {
            object = "Dispatch called for dispatchOnFire tags.";
            zzhi.zzd((String)object);
            this.zze();
        }
    }
}

