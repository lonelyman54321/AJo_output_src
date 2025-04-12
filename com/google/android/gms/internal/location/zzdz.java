/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.location.Location
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.WorkSource
 */
package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdg;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.internal.location.zzdi;
import com.google.android.gms.internal.location.zzdj;
import com.google.android.gms.internal.location.zzdk;
import com.google.android.gms.internal.location.zzdl;
import com.google.android.gms.internal.location.zzdn;
import com.google.android.gms.internal.location.zzdo;
import com.google.android.gms.internal.location.zzdq;
import com.google.android.gms.internal.location.zzdr;
import com.google.android.gms.internal.location.zzdv;
import com.google.android.gms.internal.location.zzdy;
import com.google.android.gms.internal.location.zzea;
import com.google.android.gms.internal.location.zzeb;
import com.google.android.gms.internal.location.zzec;
import com.google.android.gms.internal.location.zzed;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzfc;
import com.google.android.gms.internal.location.zzh;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzu;
import com.google.android.gms.internal.location.zzv;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationRequest$Builder;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzo;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzz;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class zzdz
extends GmsClient {
    public static final /* synthetic */ int zze;
    private final a53 zzf;
    private final a53 zzg;
    private final a53 zzh;
    private final a53 zzi;

    public zzdz(Context object, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super((Context)object, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        super();
        this.zzf = object;
        super();
        this.zzg = object;
        super();
        this.zzh = object;
        super();
        this.zzi = object;
    }

    private final boolean zzG(Feature feature) {
        Feature[] featureArray = this.getAvailableFeatures();
        if (featureArray != null) {
            long l2;
            Feature feature2;
            block5: {
                int n3;
                for (int i3 = 0; i3 < (n3 = featureArray.length); ++i3) {
                    String string2;
                    feature2 = featureArray[i3];
                    String string3 = feature.getName();
                    boolean bl2 = string3.equals(string2 = feature2.getName());
                    if (!bl2) {
                        continue;
                    }
                    break block5;
                }
                n3 = 0;
                feature2 = null;
            }
            if (feature2 == null) {
                return false;
            }
            long l3 = feature2.getVersion();
            long l4 = l3 - (l2 = feature.getVersion());
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            boolean bl2 = iInterface instanceof zzv;
            if (bl2) {
                object = iInterface;
                object = (zzv)iInterface;
            } else {
                iInterface = new zzu((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }

    public final Feature[] getApiFeatures() {
        return zzo.zzp;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConnectionSuspended(int n3) {
        a53 a532;
        super.onConnectionSuspended(n3);
        a53 a533 = this.zzf;
        synchronized (a533) {
            a532 = this.zzf;
            a532.clear();
        }
        a532 = this.zzg;
        synchronized (a532) {
            a533 = this.zzg;
            a533.clear();
        }
        a533 = this.zzh;
        synchronized (a533) {
            a532 = this.zzh;
            a532.clear();
            return;
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(Location location, TaskCompletionSource taskCompletionSource) {
        Object object = zzo.zzh;
        boolean bl2 = this.zzG((Feature)object);
        if (bl2) {
            object = (zzv)this.getService();
            zzdj zzdj2 = new zzdj(null, taskCompletionSource);
            object.zzB(location, zzdj2);
            return;
        }
        ((zzv)this.getService()).zzA(location);
        taskCompletionSource.setResult(null);
    }

    public final void zzB(TaskCompletionSource taskCompletionSource) {
        zzv zzv2 = (zzv)this.getService();
        zzdn zzdn2 = new zzdn(null, taskCompletionSource);
        zzv2.zzC(zzdn2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzC(ListenerHolder object, DeviceOrientationRequest object2, TaskCompletionSource object3) {
        Object object4 = ((ListenerHolder)object).getListenerKey();
        Objects.requireNonNull(object4);
        a53 a532 = this.zzh;
        synchronized (a532) {
            Throwable throwable2;
            block5: {
                Object object5;
                block4: {
                    block3: {
                        try {
                            object5 = this.zzh;
                            object5 = ((a53)object5).get(object4);
                            object5 = (zzdq)object5;
                            if (object5 != null) break block3;
                            object5 = new zzdq((ListenerHolder)object);
                            object = this.zzh;
                            ((a53)object).put(object4, object5);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    ((zzdq)object5).zzc((ListenerHolder)object);
                }
                object = this.getService();
                object = (zzv)object;
                List list = com.google.android.gms.internal.location.zzh.zza;
                object4 = new zzh((DeviceOrientationRequest)object2, list, null);
                object2 = new zzdn(null, (TaskCompletionSource)object3);
                int n3 = 1;
                object3 = new zzj(n3, (zzh)object4, (IBinder)object5, (IBinder)object2);
                object.zzF((zzj)object3);
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
    public final void zzD(ListenerHolder$ListenerKey object, TaskCompletionSource object2) {
        a53 a532 = this.zzh;
        synchronized (a532) {
            Throwable throwable2;
            block4: {
                Object object3;
                try {
                    object3 = this.zzh;
                    object = ((a53)object3).remove(object);
                    object = (zzdq)object;
                    if (object == null) {
                        object = Boolean.FALSE;
                        ((TaskCompletionSource)object2).setResult(object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ((zzdq)object).zze();
                object3 = this.getService();
                object3 = (zzv)object3;
                Boolean bl2 = Boolean.TRUE;
                zzdn zzdn2 = new zzdn(bl2, (TaskCompletionSource)object2);
                int n3 = 2;
                object2 = new zzj(n3, null, (IBinder)object, (IBinder)zzdn2);
                object3.zzF((zzj)object2);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzE(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        Object object = zzo.zzn;
        boolean bl2 = this.zzG((Feature)object);
        if (bl2) {
            object = (zzv)this.getService();
            zzdj zzdj2 = new zzdj(null, taskCompletionSource);
            object.zze(geofencingRequest, pendingIntent, zzdj2);
            return;
        }
        object = (zzv)this.getService();
        zzdg zzdg2 = new zzdg(taskCompletionSource);
        object.zzd(geofencingRequest, pendingIntent, zzdg2);
    }

    public final void zzF(zzem zzem2, TaskCompletionSource taskCompletionSource) {
        Object object = zzo.zzn;
        boolean bl2 = this.zzG((Feature)object);
        if (bl2) {
            object = (zzv)this.getService();
            zzdj zzdj2 = new zzdj(null, taskCompletionSource);
            object.zzg(zzem2, zzdj2);
            return;
        }
        object = (zzv)this.getService();
        zzdg zzdg2 = new zzdg(taskCompletionSource);
        object.zzf(zzem2, zzdg2);
    }

    public final void zzp(zzad object, TaskCompletionSource object2) {
        Object object3 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object3);
        if (bl2) {
            object3 = (zzv)this.getService();
            zzdl zzdl2 = new zzdl((TaskCompletionSource)object2);
            object2 = new zzee(5, null, (IBinder)zzdl2, null, null);
            object3.zzo((zzad)object, (zzee)object2);
            return;
        }
        object = (zzv)this.getService();
        object3 = this.getContext().getPackageName();
        object = object.zzp((String)object3);
        ((TaskCompletionSource)object2).setResult(object);
    }

    public final void zzq(LastLocationRequest lastLocationRequest, TaskCompletionSource object) {
        Object object2 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object2);
        if (bl2) {
            object2 = (zzv)this.getService();
            zzdk zzdk2 = new zzdk((TaskCompletionSource)object);
            object = zzee.zzd(zzdk2);
            object2.zzq(lastLocationRequest, (zzee)object);
            return;
        }
        object2 = zzo.zzf;
        bl2 = this.zzG((Feature)object2);
        if (bl2) {
            object2 = (zzv)this.getService();
            zzdk zzdk3 = new zzdk((TaskCompletionSource)object);
            object2.zzr(lastLocationRequest, zzdk3);
            return;
        }
        lastLocationRequest = ((zzv)this.getService()).zzs();
        ((TaskCompletionSource)object).setResult(lastLocationRequest);
    }

    public final void zzr(CurrentLocationRequest object, CancellationToken cancellationToken, TaskCompletionSource object2) {
        Object object3 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object3);
        if (bl2) {
            object3 = (zzv)this.getService();
            zzdk zzdk2 = new zzdk((TaskCompletionSource)object2);
            object2 = zzee.zzd(zzdk2);
            object = object3.zzt((CurrentLocationRequest)object, (zzee)object2);
            if (cancellationToken != null) {
                object2 = new zzed((ICancelToken)object);
                cancellationToken.onCanceledRequested((OnTokenCanceledListener)object2);
                return;
            }
        } else {
            object3 = zzo.zze;
            bl2 = this.zzG((Feature)object3);
            if (bl2) {
                object3 = (zzv)this.getService();
                zzdk zzdk3 = new zzdk((TaskCompletionSource)object2);
                object = object3.zzu((CurrentLocationRequest)object, zzdk3);
                if (cancellationToken != null) {
                    object2 = new zzeb((ICancelToken)object);
                    cancellationToken.onCanceledRequested((OnTokenCanceledListener)object2);
                    return;
                }
            } else {
                object3 = new zzdh(this, (TaskCompletionSource)object2);
                Object object4 = zzfc.zza();
                object3 = ListenerHolders.createListenerHolder(object3, (Executor)object4, "GetCurrentLocation");
                object4 = ((ListenerHolder)object3).getListenerKey();
                Objects.requireNonNull(object4);
                zzdi zzdi2 = new zzdi(this, (ListenerHolder)object3, (TaskCompletionSource)object2);
                object3 = new TaskCompletionSource();
                int bl3 = ((CurrentLocationRequest)object).getPriority();
                long l2 = 0L;
                LocationRequest$Builder locationRequest$Builder = new LocationRequest$Builder(bl3, l2);
                locationRequest$Builder.setMinUpdateIntervalMillis(l2);
                long l3 = ((CurrentLocationRequest)object).getDurationMillis();
                locationRequest$Builder.setDurationMillis(l3);
                int n3 = ((CurrentLocationRequest)object).getGranularity();
                locationRequest$Builder.setGranularity(n3);
                l3 = ((CurrentLocationRequest)object).getMaxUpdateAgeMillis();
                locationRequest$Builder.setMaxUpdateAgeMillis(l3);
                boolean bl4 = ((CurrentLocationRequest)object).zza();
                locationRequest$Builder.zzb(bl4);
                int n4 = ((CurrentLocationRequest)object).zzb();
                locationRequest$Builder.zza(n4);
                boolean bl5 = true;
                locationRequest$Builder.setWaitForAccurateLocation(bl5);
                object = ((CurrentLocationRequest)object).zzc();
                locationRequest$Builder.zzc((WorkSource)object);
                object = locationRequest$Builder.build();
                this.zzt(zzdi2, (LocationRequest)object, (TaskCompletionSource)object3);
                object = ((TaskCompletionSource)object3).getTask();
                object3 = new zzea((TaskCompletionSource)object2);
                ((Task)object).addOnCompleteListener((OnCompleteListener)object3);
                if (cancellationToken != null) {
                    object = new zzec(this, (ListenerHolder$ListenerKey)object4);
                    cancellationToken.onCanceledRequested((OnTokenCanceledListener)object);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzs(zzdr zzdr2, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzdz zzdz2 = this;
        AbstractSafeParcelable abstractSafeParcelable = locationRequest;
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        Object object = zzdr2.zza();
        Object object2 = ((ListenerHolder)object).getListenerKey();
        Objects.requireNonNull(object2);
        Object object3 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object3);
        a53 a532 = this.zzf;
        synchronized (a532) {
            Throwable throwable2;
            block7: {
                Object object4;
                Object object5;
                Object object6;
                block6: {
                    block5: {
                        try {
                            object6 = this.zzf;
                            object6 = ((a53)object6).get(object2);
                            object6 = (zzdy)object6;
                            if (object6 == null || bl2) break block5;
                            ((zzdy)object6).zzc((ListenerHolder)object);
                            object5 = object6;
                            object6 = null;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object4 = zzdr2;
                    object = new zzdy(zzdr2);
                    object4 = zzdz2.zzf;
                    ((a53)object4).put(object2, object);
                    object5 = object;
                }
                if (bl2) {
                    object = this.getService();
                    object = (zzv)object;
                    object2 = ((ListenerHolder$ListenerKey)object2).toIdString();
                    object2 = zzee.zza((IInterface)object6, (zzz)object5, (String)object2);
                    object3 = new zzdj(null, taskCompletionSource2);
                    object.zzw((zzee)object2, (LocationRequest)abstractSafeParcelable, (IStatusCallback)object3);
                } else {
                    object = this.getService();
                    object = (zzv)object;
                    zzeg zzeg2 = zzeg.zza(null, abstractSafeParcelable);
                    zzdo zzdo2 = new zzdo(taskCompletionSource2, (zzz)object5);
                    String string2 = ((ListenerHolder$ListenerKey)object2).toIdString();
                    int n3 = 1;
                    object4 = abstractSafeParcelable;
                    abstractSafeParcelable = new zzei(n3, zzeg2, (IBinder)object5, null, null, (IBinder)zzdo2, string2);
                    object.zzv((zzei)abstractSafeParcelable);
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
    public final void zzt(zzdr zzdr2, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzdz zzdz2 = this;
        AbstractSafeParcelable abstractSafeParcelable = locationRequest;
        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
        Object object = zzdr2.zza();
        Object object2 = ((ListenerHolder)object).getListenerKey();
        Objects.requireNonNull(object2);
        Object object3 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object3);
        a53 a532 = this.zzg;
        synchronized (a532) {
            Throwable throwable2;
            block7: {
                Object object4;
                Object object5;
                Object object6;
                block6: {
                    block5: {
                        try {
                            object6 = this.zzg;
                            object6 = ((a53)object6).get(object2);
                            object6 = (zzdv)object6;
                            if (object6 == null || bl2) break block5;
                            ((zzdv)object6).zzc((ListenerHolder)object);
                            object5 = object6;
                            object6 = null;
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object4 = zzdr2;
                    object = new zzdv(zzdr2);
                    object4 = zzdz2.zzg;
                    ((a53)object4).put(object2, object);
                    object5 = object;
                }
                if (bl2) {
                    object = this.getService();
                    object = (zzv)object;
                    object2 = ((ListenerHolder$ListenerKey)object2).toIdString();
                    object2 = zzee.zzb((IInterface)object6, (zzw)object5, (String)object2);
                    object3 = new zzdj(null, taskCompletionSource2);
                    object.zzw((zzee)object2, (LocationRequest)abstractSafeParcelable, (IStatusCallback)object3);
                } else {
                    object = this.getService();
                    object = (zzv)object;
                    zzeg zzeg2 = zzeg.zza(null, abstractSafeParcelable);
                    zzdd zzdd2 = new zzdd(taskCompletionSource2, (zzw)object5);
                    String string2 = ((ListenerHolder$ListenerKey)object2).toIdString();
                    int n3 = 1;
                    object4 = abstractSafeParcelable;
                    abstractSafeParcelable = new zzei(n3, zzeg2, null, (IBinder)object5, null, (IBinder)zzdd2, string2);
                    object.zzv((zzei)abstractSafeParcelable);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzu(PendingIntent object, LocationRequest abstractSafeParcelable, TaskCompletionSource taskCompletionSource) {
        Object object2 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object2);
        int n3 = 0;
        if (bl2) {
            object2 = (zzv)this.getService();
            object = zzee.zzc(object);
            zzdj zzdj2 = new zzdj(null, taskCompletionSource);
            object2.zzw((zzee)object, (LocationRequest)abstractSafeParcelable, zzdj2);
            return;
        }
        object2 = (zzv)this.getService();
        zzeg zzeg2 = zzeg.zza(null, abstractSafeParcelable);
        zzdn zzdn2 = new zzdn(null, taskCompletionSource);
        int n4 = object.hashCode();
        n3 = String.valueOf(n4).length();
        Object object3 = new StringBuilder(n3 += 14);
        ((StringBuilder)object3).append("PendingIntent@");
        ((StringBuilder)object3).append(n4);
        String string2 = ((StringBuilder)object3).toString();
        object3 = abstractSafeParcelable;
        abstractSafeParcelable = new zzei(1, zzeg2, null, null, (PendingIntent)object, (IBinder)zzdn2, string2);
        object2.zzv((zzei)abstractSafeParcelable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzv(ListenerHolder$ListenerKey object, boolean bl2, TaskCompletionSource taskCompletionSource) {
        a53 a532 = this.zzf;
        synchronized (a532) {
            Throwable throwable2;
            block8: {
                Object object2;
                Object object3;
                try {
                    object3 = this.zzf;
                    object2 = object = ((a53)object3).remove(object);
                    object2 = (zzdy)object;
                    if (object2 == null) {
                        object = Boolean.FALSE;
                        taskCompletionSource.setResult(object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                ((zzdy)object2).zzf();
                if (bl2) {
                    object = zzo.zzj;
                    boolean bl3 = this.zzG((Feature)object);
                    if (bl3) {
                        object = this.getService();
                        object = (zzv)object;
                        Object object4 = "ILocationListener@";
                        int n3 = System.identityHashCode(object2);
                        Object object5 = String.valueOf(n3);
                        int n4 = ((String)object5).length() + 18;
                        StringBuilder stringBuilder = new StringBuilder(n4);
                        stringBuilder.append((String)object4);
                        stringBuilder.append(n3);
                        object4 = stringBuilder.toString();
                        n3 = 0;
                        object3 = null;
                        object4 = zzee.zza(null, (zzz)object2, (String)object4);
                        object3 = Boolean.TRUE;
                        object5 = new zzdj(object3, taskCompletionSource);
                        object.zzx((zzee)object4, (IStatusCallback)object5);
                    } else {
                        object = this.getService();
                        object = (zzv)object;
                        Object object6 = Boolean.TRUE;
                        zzdn zzdn2 = new zzdn(object6, taskCompletionSource);
                        int n7 = 2;
                        Object var12_16 = null;
                        object3 = object6;
                        object6 = new zzei(n7, null, (IBinder)object2, null, null, (IBinder)zzdn2, null);
                        object.zzv((zzei)object6);
                    }
                } else {
                    object = Boolean.TRUE;
                    taskCompletionSource.setResult(object);
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
    public final void zzw(ListenerHolder$ListenerKey object, boolean bl2, TaskCompletionSource taskCompletionSource) {
        a53 a532 = this.zzg;
        synchronized (a532) {
            Throwable throwable2;
            block8: {
                Object object2;
                Object object3;
                try {
                    object3 = this.zzg;
                    object2 = object = ((a53)object3).remove(object);
                    object2 = (zzdv)object;
                    if (object2 == null) {
                        object = Boolean.FALSE;
                        taskCompletionSource.setResult(object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                ((zzdv)object2).zzg();
                if (bl2) {
                    object = zzo.zzj;
                    boolean bl3 = this.zzG((Feature)object);
                    if (bl3) {
                        object = this.getService();
                        object = (zzv)object;
                        Object object4 = "ILocationCallback@";
                        int n3 = System.identityHashCode(object2);
                        Object object5 = String.valueOf(n3);
                        int n4 = ((String)object5).length() + 18;
                        StringBuilder stringBuilder = new StringBuilder(n4);
                        stringBuilder.append((String)object4);
                        stringBuilder.append(n3);
                        object4 = stringBuilder.toString();
                        n3 = 0;
                        object3 = null;
                        object4 = zzee.zzb(null, (zzw)object2, (String)object4);
                        object3 = Boolean.TRUE;
                        object5 = new zzdj(object3, taskCompletionSource);
                        object.zzx((zzee)object4, (IStatusCallback)object5);
                    } else {
                        object = this.getService();
                        object = (zzv)object;
                        Object object6 = Boolean.TRUE;
                        zzdn zzdn2 = new zzdn(object6, taskCompletionSource);
                        int n7 = 2;
                        Object var12_16 = null;
                        object3 = object6;
                        object6 = new zzei(n7, null, null, (IBinder)object2, null, (IBinder)zzdn2, null);
                        object.zzv((zzei)object6);
                    }
                } else {
                    object = Boolean.TRUE;
                    taskCompletionSource.setResult(object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzx(PendingIntent object, TaskCompletionSource object2, Object object3) {
        object3 = zzo.zzj;
        boolean bl2 = this.zzG((Feature)object3);
        if (bl2) {
            object3 = (zzv)this.getService();
            object = zzee.zzc(object);
            zzdj zzdj2 = new zzdj(null, (TaskCompletionSource)object2);
            object3.zzx((zzee)object, zzdj2);
            return;
        }
        object3 = (zzv)this.getService();
        zzdn zzdn2 = new zzdn(null, (TaskCompletionSource)object2);
        Object object4 = object2;
        object2 = new zzei(2, null, null, null, (PendingIntent)object, (IBinder)zzdn2, null);
        object3.zzv((zzei)object2);
    }

    public final void zzy(TaskCompletionSource taskCompletionSource) {
        Object object = zzo.zzg;
        boolean bl2 = this.zzG((Feature)object);
        boolean bl3 = true;
        if (bl2) {
            object = (zzv)this.getService();
            zzdj zzdj2 = new zzdj(null, taskCompletionSource);
            object.zzz(bl3, zzdj2);
            return;
        }
        ((zzv)this.getService()).zzy(bl3);
        taskCompletionSource.setResult(null);
    }

    public final void zzz(TaskCompletionSource taskCompletionSource) {
        Object object = zzo.zzg;
        boolean bl2 = this.zzG((Feature)object);
        if (bl2) {
            object = (zzv)this.getService();
            Boolean bl3 = Boolean.TRUE;
            zzdj zzdj2 = new zzdj(bl3, taskCompletionSource);
            object.zzz(false, zzdj2);
            return;
        }
        ((zzv)this.getService()).zzy(false);
        object = Boolean.TRUE;
        taskCompletionSource.setResult(object);
    }
}

