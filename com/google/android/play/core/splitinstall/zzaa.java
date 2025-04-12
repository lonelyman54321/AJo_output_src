/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.IntentSender
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzn;
import com.google.android.play.core.splitinstall.zzbc;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzs;
import com.google.android.play.core.splitinstall.zzx;
import com.google.android.play.core.splitinstall.zzy;
import com.google.android.play.core.splitinstall.zzz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

final class zzaa
implements SplitInstallManager {
    private final zzbc zza;
    private final zzx zzb;
    private final zzs zzc;
    private final zzbe zzd;
    private final Handler zze;

    public zzaa(zzbc zzbc2, zzx zzx2, zzs zzs2, zzbe zzbe2) {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.zze = handler = new Handler(looper);
        this.zza = zzbc2;
        this.zzb = zzx2;
        this.zzc = zzs2;
        this.zzd = zzbe2;
    }

    public static /* bridge */ /* synthetic */ zzx zzc(zzaa zzaa2) {
        return zzaa2.zzb;
    }

    public static /* bridge */ /* synthetic */ List zzd(List list) {
        return zzaa.zze(list);
    }

    private static List zze(List object) {
        int n3 = object.size();
        ArrayList<String> arrayList = new ArrayList<String>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string2 = ((Locale)object.next()).toLanguageTag();
            arrayList.add(string2);
        }
        return arrayList;
    }

    public final Task cancelInstall(int n3) {
        return this.zza.zzc(n3);
    }

    public final Task deferredInstall(List list) {
        return this.zza.zzd(list);
    }

    public final Task deferredLanguageInstall(List list) {
        zzbc zzbc2 = this.zza;
        list = zzaa.zze(list);
        return zzbc2.zze(list);
    }

    public final Task deferredLanguageUninstall(List list) {
        zzbc zzbc2 = this.zza;
        list = zzaa.zze(list);
        return zzbc2.zzf(list);
    }

    public final Task deferredUninstall(List list) {
        this.zzd.zzc(list);
        return this.zza.zzg(list);
    }

    public final Set getInstalledLanguages() {
        Set set = this.zzc.zzd();
        if (set == null) {
            set = Collections.emptySet();
        }
        return set;
    }

    public final Set getInstalledModules() {
        return this.zzc.zzc();
    }

    public final Task getSessionState(int n3) {
        return this.zza.zzh(n3);
    }

    public final Task getSessionStates() {
        return this.zza.zzi();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            zzx zzx2 = this.zzb;
            zzx2.zzb(splitInstallStateUpdatedListener);
            return;
        }
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, I3 i3) {
        Object object;
        int n3;
        int n4 = splitInstallSessionState.status();
        if (n4 == (n3 = 8) && (object = splitInstallSessionState.resolutionIntent()) != null) {
            splitInstallSessionState = splitInstallSessionState.resolutionIntent().getIntentSender();
            Intrinsics.checkNotNullParameter(splitInstallSessionState, "intentSender");
            object = new IntentSenderRequest((IntentSender)splitInstallSessionState, null, 0, 0);
            i3.a(object);
            return true;
        }
        return false;
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int n3) {
        zzz zzz2 = new zzz(this, activity);
        return this.startConfirmationDialogForResult(splitInstallSessionState, zzz2, n3);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int n3) {
        Object object;
        int n4;
        int n7 = splitInstallSessionState.status();
        if (n7 == (n4 = 8) && (object = splitInstallSessionState.resolutionIntent()) != null) {
            IntentSender intentSender = splitInstallSessionState.resolutionIntent().getIntentSender();
            object = intentSenderForResultStarter;
            intentSenderForResultStarter.startIntentSenderForResult(intentSender, n3, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    public final Task startInstall(SplitInstallRequest object) {
        Collection collection;
        Object object2;
        zzn zzn2;
        block6: {
            int n3;
            block5: {
                boolean bl2;
                zzn2 = new zzn();
                n3 = 1;
                zzn2.zzb(n3);
                ((SplitInstallRequest)object).getLanguages().isEmpty();
                object2 = ((SplitInstallRequest)object).getLanguages();
                boolean bl3 = object2.isEmpty();
                if (bl3 || (collection = this.zzc.zzd()) == null) break block5;
                HashSet<String> hashSet = new HashSet<String>();
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    String string2 = ((Locale)object2.next()).getLanguage();
                    hashSet.add(string2);
                }
                n3 = (int)(collection.containsAll(hashSet) ? 1 : 0);
                if (n3 == 0) break block6;
            }
            object2 = ((SplitInstallRequest)object).getModuleNames();
            collection = this.zzc.zzc();
            n3 = (int)(collection.containsAll((Collection<?>)object2) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(Collections.disjoint(object2 = ((SplitInstallRequest)object).getModuleNames(), collection = this.zzd.zza()) ? 1 : 0)) != 0) {
                zzn2 = this.zze;
                object2 = new zzy(this, (SplitInstallRequest)object);
                zzn2.post((Runnable)object2);
                return Tasks.forResult(0);
            }
        }
        object2 = this.zzd;
        collection = ((SplitInstallRequest)object).getModuleNames();
        ((zzbe)object2).zzd(collection);
        object2 = this.zza;
        collection = ((SplitInstallRequest)object).getModuleNames();
        object = zzaa.zze(((SplitInstallRequest)object).getLanguages());
        return ((zzbc)object2).zzj(collection, (Collection)object, zzn2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            zzx zzx2 = this.zzb;
            zzx2.zzd(splitInstallStateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            zzx zzx2 = this.zzb;
            zzx2.zzi(splitInstallStateUpdatedListener);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        synchronized (this) {
            zzx zzx2 = this.zzb;
            zzx2.zzj(splitInstallStateUpdatedListener);
            return;
        }
    }
}

