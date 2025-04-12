/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.RequestConfiguration$Builder;
import com.google.android.gms.ads.initialization.AdapterStatus$State;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzaq;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzfyv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzej {
    private static zzej zza;
    private final Object zzb;
    private final ArrayList zzc;
    private boolean zzd;
    private boolean zze;
    private final Object zzf;
    private zzco zzg;
    private OnAdInspectorClosedListener zzh;
    private RequestConfiguration zzi;

    private zzej() {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zzd = false;
        this.zze = false;
        arrayList = new ArrayList();
        this.zzf = arrayList;
        this.zzh = null;
        arrayList = new ArrayList();
        arrayList = ((RequestConfiguration$Builder)((Object)arrayList)).build();
        this.zzi = arrayList;
        this.zzc = arrayList = new ArrayList();
    }

    private final void zzA(Context object) {
        Object object2 = this.zzg;
        if (object2 == null) {
            object2 = zzay.zza();
            zzaq zzaq2 = new zzaq((zzaw)object2, (Context)object);
            object2 = null;
            object = (zzco)zzaq2.zzd((Context)object, false);
            this.zzg = object;
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        zzco zzco2;
        try {
            zzco2 = this.zzg;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to set request configuration parcel.", remoteException);
            return;
        }
        zzff zzff2 = new zzff(requestConfiguration);
        zzco2.zzu(zzff2);
    }

    public static /* bridge */ /* synthetic */ OnAdInspectorClosedListener zzb(zzej zzej2) {
        return zzej2.zzh;
    }

    public static /* bridge */ /* synthetic */ InitializationStatus zzd(List list) {
        return zzej.zzy(list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzej zzf() {
        Class<zzej> clazz = zzej.class;
        synchronized (clazz) {
            try {
                zzej zzej2 = zza;
                if (zzej2 != null) return zza;
                zza = zzej2 = new zzej();
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ Object zzg(zzej zzej2) {
        return zzej2.zzb;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzi(zzej zzej2) {
        return zzej2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzej zzej2, boolean bl2) {
        zzej2.zze = true;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzej zzej2, boolean bl2) {
        zzej2.zzd = false;
    }

    private static InitializationStatus zzy(List object) {
        int n3;
        HashMap<String, zzbnv> hashMap = new HashMap<String, zzbnv>();
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            zzbnn zzbnn2 = (zzbnn)object.next();
            String string2 = zzbnn2.zza;
            boolean bl2 = zzbnn2.zzb;
            AdapterStatus$State adapterStatus$State = bl2 ? AdapterStatus$State.READY : AdapterStatus$State.NOT_READY;
            String string3 = zzbnn2.zzd;
            n3 = zzbnn2.zzc;
            zzbnv zzbnv2 = new zzbnv(adapterStatus$State, string3, n3);
            hashMap.put(string2, zzbnv2);
        }
        object = new zzbnw(hashMap);
        return object;
    }

    private final void zzz(Context object, String object2) {
        try {
            object2 = zzbqx.zza();
        }
        catch (RemoteException remoteException) {
            zzm.zzk("MobileAdsSettingManager initialization failed", remoteException);
            return;
        }
        ((zzbqx)object2).zzb((Context)object, null);
        object = this.zzg;
        object.zzk();
        object = this.zzg;
        object2 = ObjectWrapper.wrap(null);
        object.zzl(null, (IObjectWrapper)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zza() {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                float f5;
                zzco zzco2;
                try {
                    zzco2 = this.zzg;
                    f5 = 1.0f;
                    if (zzco2 == null) {
                        return f5;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzco2.zze();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to get app volume.";
                    zzm.zzh(string2, remoteException);
                }
                return f5;
            }
            throw throwable2;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InitializationStatus zze() {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                boolean bl2;
                Object object2 = this.zzg;
                if (object2 != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                String string2 = "MobileAds.initialize() must be called prior to getting initialization status.";
                Preconditions.checkState(bl2, string2);
                object2 = this.zzg;
                object2 = object2.zzg();
                return zzej.zzy((List)object2);
                {
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    catch (RemoteException remoteException) {}
                    object2 = "Unable to get Initialization status.";
                    {
                        zzm.zzg((String)object2);
                        return new zzeb(this);
                    }
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzh() {
        Object object = this.zzf;
        synchronized (object) {
            try {
                boolean bl2;
                Object object2 = this.zzg;
                if (object2 != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                String string2 = "MobileAds.initialize() must be called prior to getting version string.";
                Preconditions.checkState(bl2, string2);
                try {
                    object2 = this.zzg;
                    object2 = object2.zzf();
                    return zzfyv.zzc((String)object2);
                }
                catch (RemoteException remoteException) {
                    string2 = "Unable to get internal version.";
                    zzm.zzh(string2, remoteException);
                    return "";
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzl(Context var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [5 : 34->43)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * Exception decompiling
     */
    public final void zzm(Context var1_1, String var2_4, OnInitializationCompleteListener var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 40->47)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzn(Context context, String object) {
        object = this.zzf;
        synchronized (object) {
            this.zzz(context, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzo(Context context, String object) {
        object = this.zzf;
        synchronized (object) {
            this.zzz(context, null);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zzp(Context var1_1, OnAdInspectorClosedListener var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [10 : 56->60)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(Context object, String string2) {
        Object object2 = this.zzf;
        synchronized (object2) {
            Throwable throwable2;
            block7: {
                try {
                    boolean bl2;
                    zzco zzco2 = this.zzg;
                    if (zzco2 != null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        zzco2 = null;
                    }
                    String string3 = "MobileAds.initialize() must be called prior to opening debug menu.";
                    Preconditions.checkState(bl2, string3);
                    try {
                        zzco2 = this.zzg;
                        object = ObjectWrapper.wrap(object);
                        zzco2.zzn((IObjectWrapper)object, string2);
                    }
                    catch (RemoteException remoteException) {
                        string2 = "Unable to open debug menu.";
                        zzm.zzh(string2, remoteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr(Class object) {
        Object object2 = this.zzf;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        zzco zzco2 = this.zzg;
                        object = ((Class)object).getCanonicalName();
                        zzco2.zzh((String)object);
                    }
                    catch (RemoteException remoteException) {
                        String string2 = "Unable to register RtbAdapter";
                        zzm.zzh(string2, remoteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs(boolean bl2) {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                try {
                    boolean bl3;
                    Object object2 = this.zzg;
                    if (object2 != null) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object2 = null;
                    }
                    String string2 = "MobileAds.initialize() must be called prior to setting app muted state.";
                    Preconditions.checkState(bl3, string2);
                    try {
                        object2 = this.zzg;
                        object2.zzp(bl2);
                    }
                    catch (RemoteException remoteException) {
                        object2 = "Unable to set app mute state.";
                        zzm.zzh((String)object2, remoteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzt(float f5) {
        float f6;
        float f7 = 0.0f;
        Object object = null;
        boolean bl2 = true;
        String string2 = null;
        float f8 = f5 - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object2 >= 0 && (object2 = (f6 = f5 - (f7 = 1.0f)) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) <= 0) {
            object2 = true;
            f7 = Float.MIN_VALUE;
        } else {
            object2 = false;
            f7 = 0.0f;
            object = null;
        }
        Object object3 = "The app volume must be a value between 0 and 1 inclusive.";
        Preconditions.checkArgument((boolean)object2, object3);
        object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                try {
                    Object object4;
                    object3 = this.zzg;
                    if (object3 == null) {
                        bl2 = false;
                        object4 = null;
                    }
                    string2 = "MobileAds.initialize() must be called prior to setting the app volume.";
                    Preconditions.checkState(bl2, string2);
                    try {
                        object4 = this.zzg;
                        object4.zzq(f5);
                    }
                    catch (RemoteException remoteException) {
                        object4 = "Unable to set app volume.";
                        zzm.zzh((String)object4, remoteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzu(String string2) {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                try {
                    boolean bl2;
                    Object object2 = this.zzg;
                    if (object2 != null) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    String string3 = "MobileAds.initialize() must be called prior to setting the plugin.";
                    Preconditions.checkState(bl2, string3);
                    try {
                        object2 = this.zzg;
                        object2.zzt(string2);
                    }
                    catch (RemoteException remoteException) {
                        object2 = "Unable to set plugin.";
                        zzm.zzh((String)object2, remoteException);
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(RequestConfiguration requestConfiguration) {
        Object object;
        boolean bl2;
        if (requestConfiguration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = "Null passed to setRequestConfiguration.";
        Preconditions.checkArgument(bl2, object2);
        object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                int n3;
                int n4;
                try {
                    object2 = this.zzi;
                    this.zzi = requestConfiguration;
                    zzco zzco2 = this.zzg;
                    if (zzco2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                int n7 = ((RequestConfiguration)object2).getTagForChildDirectedTreatment();
                if (n7 != (n4 = requestConfiguration.getTagForChildDirectedTreatment()) || (n3 = ((RequestConfiguration)object2).getTagForUnderAgeOfConsent()) != (n7 = requestConfiguration.getTagForUnderAgeOfConsent())) {
                    this.zzB(requestConfiguration);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzw() {
        Object object = this.zzf;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                zzco zzco2;
                try {
                    zzco2 = this.zzg;
                    bl2 = false;
                    if (zzco2 == null) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzco2.zzv();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to get app mute state.";
                    zzm.zzh(string2, remoteException);
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzx(boolean bl2) {
        String string2 = "Unable to ";
        Object object = this.zzf;
        synchronized (object) {
            try {
                boolean bl3;
                zzco zzco2 = this.zzg;
                boolean bl4 = true;
                if (zzco2 != null) {
                    bl3 = true;
                } else {
                    bl3 = false;
                    zzco2 = null;
                }
                String string3 = "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.";
                Preconditions.checkState(bl3, string3);
                try {
                    zzco2 = this.zzg;
                    zzco2.zzj(bl2);
                    return bl4;
                }
                catch (RemoteException remoteException) {
                    String string4 = bl2 ? "enable" : "disable";
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(string4);
                    string4 = " the publisher first-party ID.";
                    stringBuilder.append(string4);
                    string4 = stringBuilder.toString();
                    zzm.zzh(string4, remoteException);
                    return false;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

