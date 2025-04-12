/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzelf;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfny;
import com.google.android.gms.internal.ads.zzfnz;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyb;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzfoa {
    private final zzelf zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfhg zzf;
    private final zzfhh zzg;
    private final Clock zzh;
    private final zzaxd zzi;

    public zzfoa(zzelf object, VersionInfoParcel versionInfoParcel, String string2, String string3, Context context, zzfhg zzfhg2, zzfhh zzfhh2, Clock clock, zzaxd zzaxd2) {
        this.zza = object;
        this.zzb = object = versionInfoParcel.afmaVersion;
        this.zzc = string2;
        this.zzd = string3;
        this.zze = context;
        this.zzf = zzfhg2;
        this.zzg = zzfhh2;
        this.zzh = clock;
        this.zzi = zzaxd2;
    }

    public static /* synthetic */ String zza(zzfhg zzfhg2) {
        return zzfoa.zzi(zzfhg2.zza);
    }

    public static /* synthetic */ String zzb(zzfhg zzfhg2) {
        return zzfoa.zzi(zzfhg2.zzb);
    }

    public static final List zzf(int n3, int n4, List object) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            String string3 = hj0_0.a(n4, "2.");
            String string4 = "@gw_mpe@";
            string2 = zzfoa.zzj(string2, string4, string3);
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static final List zzg(List object, String string2) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string3 = (String)object.next();
            String string4 = "@gw_adnetstatus@";
            string3 = zzfoa.zzj(string3, string4, string2);
            arrayList.add(string3);
        }
        return arrayList;
    }

    public static final List zzh(List object, long l2) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            int n3 = 10;
            String string3 = Long.toString(l2, n3);
            String string4 = "@gw_ttr@";
            string2 = zzfoa.zzj(string2, string4, string3);
            arrayList.add(string2);
        }
        return arrayList;
    }

    private static String zzi(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return "";
        }
        bl2 = zzl.zzk();
        if (bl2) {
            string2 = "fakeForAdDebugLog";
        }
        return string2;
    }

    private static String zzj(String string2, String string3, String string4) {
        boolean bl2 = true;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string4);
        if (bl2 == bl3) {
            string4 = "";
        }
        return string2.replaceAll(string3, string4);
    }

    public final List zzc(zzfhf zzfhf2, zzfgt zzfgt2, List list) {
        return this.zzd(zzfhf2, zzfgt2, false, "", "", list);
    }

    public final List zzd(zzfhf zzfhf2, zzfgt zzfgt2, boolean bl2, String string2, String string3, List object) {
        boolean bl3;
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            String string4;
            block7: {
                boolean bl4;
                boolean bl5;
                Object object2;
                Object object3;
                block8: {
                    block6: {
                        boolean bl6;
                        bl3 = true;
                        string4 = bl3 != bl2 ? "0" : "1";
                        object3 = (String)object.next();
                        Object object4 = zzfhf2.zza.zza;
                        object2 = "@gw_adlocid@";
                        object4 = ((zzfho)object4).zzf;
                        string4 = zzfoa.zzj(zzfoa.zzj((String)object3, (String)object2, (String)object4), "@gw_adnetrefresh@", string4);
                        object3 = this.zzb;
                        object4 = "@gw_sdkver@";
                        string4 = zzfoa.zzj(string4, (String)object4, (String)object3);
                        if (zzfgt2 != null) {
                            object4 = zzfgt2.zzz;
                            string4 = zzfoa.zzj(string4, "@gw_qdata@", (String)object4);
                            object4 = zzfgt2.zzy;
                            string4 = zzfoa.zzj(string4, "@gw_adnetid@", (String)object4);
                            object4 = zzfgt2.zzx;
                            string4 = zzfoa.zzj(string4, "@gw_allocid@", (String)object4);
                            object3 = this.zze;
                            object4 = zzfgt2.zzax;
                            bl6 = zzfgt2.zzX;
                            string4 = zzcaw.zzc(string4, (Context)object3, bl6, (Map)object4);
                        }
                        object3 = this.zza.zzg();
                        string4 = zzfoa.zzj(string4, "@gw_adnetstatus@", (String)object3);
                        long l2 = this.zza.zza();
                        bl6 = 10 != 0;
                        object3 = Long.toString(l2, (int)(bl6 ? 1 : 0));
                        string4 = zzfoa.zzj(string4, "@gw_ttr@", (String)object3);
                        object3 = this.zzc;
                        string4 = zzfoa.zzj(string4, "@gw_seqnum@", (String)object3);
                        object3 = this.zzd;
                        string4 = zzfoa.zzj(string4, "@gw_sessid@", (String)object3);
                        object3 = zzbep.zzdx;
                        object3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
                        bl5 = (Boolean)object3;
                        bl4 = false;
                        object4 = null;
                        if (bl5 && !(bl5 = TextUtils.isEmpty((CharSequence)string2))) {
                            bl4 = true;
                        }
                        bl5 = TextUtils.isEmpty((CharSequence)string3) ^ bl3;
                        if (bl4) break block6;
                        if (!bl5) break block7;
                        break block8;
                    }
                    bl3 = bl5;
                }
                object3 = Uri.parse((String)string4);
                object2 = this.zzi;
                bl5 = ((zzaxd)object2).zzf((Uri)object3);
                if (bl5) {
                    String string5;
                    string4 = Uri.parse((String)string4).buildUpon();
                    if (bl4) {
                        object3 = "ms";
                        string4 = string4.appendQueryParameter((String)object3, string2);
                    }
                    if (bl3) {
                        string5 = "attok";
                        string4 = string4.appendQueryParameter(string5, string3);
                    }
                    string5 = string4.build();
                    string4 = string5.toString();
                }
            }
            arrayList.add(string4);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zze(zzfgt zzfgt2, List iterator, zzbyh object) {
        Object object2;
        Object object3;
        String string2;
        long l2;
        ArrayList<String> arrayList;
        block6: {
            block7: {
                block4: {
                    block5: {
                        arrayList = new ArrayList<String>();
                        Clock clock = this.zzh;
                        l2 = clock.currentTimeMillis();
                        try {
                            string2 = object.zzc();
                            int n3 = object.zzb();
                            object = Integer.toString(n3);
                            object3 = zzbep.zzdy;
                        }
                        catch (RemoteException remoteException) {
                            zzm.zzh("Unable to determine award type and amount.", remoteException);
                            return arrayList;
                        }
                        object2 = zzba.zzc();
                        object3 = (Boolean)((zzben)object2).zza((zzbeg)object3);
                        boolean bl2 = (Boolean)object3;
                        if (!bl2) break block4;
                        object3 = this.zzg;
                        if (object3 != null) break block5;
                        object3 = zzfyb.zzc();
                        break block6;
                    }
                    object3 = ((zzfhh)object3).zza;
                    break block7;
                }
                object3 = this.zzf;
            }
            object3 = zzfyb.zzd(object3);
        }
        object2 = new zzfny();
        object2 = ((zzfyb)object3).zza((zzfxu)object2);
        String string3 = "";
        object2 = (String)((zzfyb)object2).zzb(string3);
        Object object4 = new zzfnz();
        object3 = (String)((zzfyb)object3).zza((zzfxu)object4).zzb(string3);
        iterator = iterator.iterator();
        while (true) {
            boolean bl3;
            if (!(bl3 = iterator.hasNext())) {
                return arrayList;
            }
            string3 = (String)iterator.next();
            object4 = Uri.encode((String)object2);
            string3 = zzfoa.zzj(string3, "@gw_rwd_userid@", (String)object4);
            object4 = Uri.encode((String)object3);
            string3 = zzfoa.zzj(string3, "@gw_rwd_custom_data@", (String)object4);
            object4 = Long.toString(l2);
            string3 = zzfoa.zzj(string3, "@gw_tmstmp@", (String)object4);
            object4 = Uri.encode((String)string2);
            string3 = zzfoa.zzj(zzfoa.zzj(string3, "@gw_rwd_itm@", (String)object4), "@gw_rwd_amt@", (String)object);
            object4 = this.zzb;
            String string4 = "@gw_sdkver@";
            string3 = zzfoa.zzj(string3, string4, (String)object4);
            object4 = this.zze;
            boolean bl4 = zzfgt2.zzX;
            Map map2 = zzfgt2.zzax;
            string3 = zzcaw.zzc(string3, (Context)object4, bl4, map2);
            arrayList.add(string3);
        }
    }
}

