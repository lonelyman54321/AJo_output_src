/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.PendingIntent
 *  android.content.AttributionSource
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 */
package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES;
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zze;
    private volatile String zzA;
    private volatile AttributionSourceWrapper zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzk zzE;
    zzv zza;
    final Handler zzb;
    protected BaseGmsClient$ConnectionProgressReportCallbacks zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;
    private IGmsServiceBroker zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private zze zzu;
    private int zzv;
    private final BaseGmsClient$BaseConnectionCallbacks zzw;
    private final BaseGmsClient$BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final String zzz;

    static {
        zze = new Feature[0];
        GOOGLE_PLUS_REQUIRED_FEATURES = new String[]{"service_esmobile", "service_googleme"};
    }

    public BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int n3, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener) {
        AtomicInteger atomicInteger;
        this.zzk = null;
        ArrayList arrayList = new ArrayList();
        this.zzp = arrayList;
        arrayList = new ArrayList();
        this.zzq = arrayList;
        this.zzt = arrayList = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = atomicInteger = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzb = handler;
        context = handler.getLooper();
        this.zzm = context;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzy = n3;
        this.zzw = baseGmsClient$BaseConnectionCallbacks;
        this.zzx = baseGmsClient$BaseOnConnectionFailedListener;
        this.zzz = null;
    }

    public BaseGmsClient(Context context, Looper looper, int n3, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener, String string2) {
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
        Preconditions.checkNotNull(baseGmsClient$BaseConnectionCallbacks);
        Preconditions.checkNotNull(baseGmsClient$BaseOnConnectionFailedListener);
        this(context, looper, gmsClientSupervisor, googleApiAvailabilityLight, n3, baseGmsClient$BaseConnectionCallbacks, baseGmsClient$BaseOnConnectionFailedListener, string2);
    }

    public BaseGmsClient(Context object, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int n3, BaseGmsClient$BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener, String string2) {
        AtomicInteger atomicInteger;
        this.zzk = null;
        ArrayList arrayList = new ArrayList();
        this.zzp = arrayList;
        arrayList = new ArrayList();
        this.zzq = arrayList;
        this.zzt = arrayList = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = atomicInteger = new AtomicInteger(0);
        Preconditions.checkNotNull(object, "Context must not be null");
        this.zzl = object;
        Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        super(this, looper);
        this.zzb = object;
        this.zzy = n3;
        this.zzw = baseGmsClient$BaseConnectionCallbacks;
        this.zzx = baseGmsClient$BaseOnConnectionFailedListener;
        this.zzz = string2;
    }

    public static /* bridge */ /* synthetic */ ConnectionResult zza(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzC;
    }

    public static /* bridge */ /* synthetic */ BaseGmsClient$BaseConnectionCallbacks zzb(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzw;
    }

    public static /* bridge */ /* synthetic */ BaseGmsClient$BaseOnConnectionFailedListener zzc(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzx;
    }

    public static /* bridge */ /* synthetic */ Object zzd(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzq;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzf(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzt;
    }

    public static /* bridge */ /* synthetic */ void zzg(BaseGmsClient baseGmsClient, ConnectionResult connectionResult) {
        baseGmsClient.zzC = connectionResult;
    }

    public static /* bridge */ /* synthetic */ void zzh(BaseGmsClient baseGmsClient, IGmsServiceBroker iGmsServiceBroker) {
        baseGmsClient.zzr = iGmsServiceBroker;
    }

    public static /* bridge */ /* synthetic */ void zzi(BaseGmsClient baseGmsClient, int n3, IInterface iInterface) {
        baseGmsClient.zzp(n3, null);
    }

    public static /* bridge */ /* synthetic */ void zzj(BaseGmsClient object, zzk object2) {
        ((BaseGmsClient)object).zzE = object2;
        boolean bl2 = ((BaseGmsClient)object).usesClientTelemetry();
        if (bl2) {
            object = ((zzk)object2).zzd;
            object2 = RootTelemetryConfigManager.getInstance();
            if (object == null) {
                bl2 = false;
                object = null;
            } else {
                object = ((ConnectionTelemetryConfiguration)object).zza();
            }
            ((RootTelemetryConfigManager)object2).zza((RootTelemetryConfiguration)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int n3) {
        int n4;
        Object object = baseGmsClient.zzp;
        synchronized (object) {
            n4 = baseGmsClient.zzv;
        }
        n3 = 3;
        if (n4 == n3) {
            baseGmsClient.zzD = true;
            n3 = 5;
        } else {
            n3 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        int n7 = baseGmsClient.zzd.get();
        baseGmsClient = handler.obtainMessage(n3, n7, 16);
        handler.sendMessage((Message)baseGmsClient);
    }

    public static /* bridge */ /* synthetic */ boolean zzm(BaseGmsClient baseGmsClient) {
        return baseGmsClient.zzD;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int n3, int n4, IInterface iInterface) {
        Object object = baseGmsClient.zzp;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    int n7 = baseGmsClient.zzv;
                    if (n7 != n3) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                baseGmsClient.zzp(n4, iInterface);
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ boolean zzo(BaseGmsClient object) {
        boolean bl2 = ((BaseGmsClient)object).zzD;
        boolean bl3 = false;
        if (bl2) {
            return bl3;
        }
        String string2 = ((BaseGmsClient)object).getServiceDescriptor();
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return bl3;
        }
        string2 = ((BaseGmsClient)object).getLocalStartServiceAction();
        bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return bl3;
        }
        try {
            object = ((BaseGmsClient)object).getServiceDescriptor();
            Class.forName((String)object);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return bl3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzp(int n3, IInterface object) {
        Object object2;
        int n4;
        Bundle bundle;
        int n7;
        boolean bl2 = false;
        Object object3 = null;
        int n8 = 1;
        int n10 = 4;
        if (n3 != n10) {
            n7 = 0;
            bundle = null;
        } else {
            n7 = 1;
        }
        if (object == null) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = 1;
        }
        if (n7 == n4) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object3 = this.zzp;
        synchronized (object3) {
            Throwable throwable2;
            block19: {
                block18: {
                    block16: {
                        Object object4;
                        int n14;
                        Object object5;
                        Object object6;
                        Object object7;
                        Object object8;
                        block17: {
                            try {
                                this.zzv = n3;
                                this.zzs = object;
                                n7 = 0;
                                bundle = null;
                                if (n3 == n8) break block16;
                                n8 = 2;
                                n4 = 3;
                                if (n3 == n8 || n3 == n4) break block17;
                                if (n3 == n10) {
                                    Preconditions.checkNotNull(object);
                                    this.onConnectedLocked((IInterface)object);
                                }
                                break block18;
                            }
                            catch (Throwable throwable2) {
                                break block19;
                            }
                        }
                        zze zze2 = this.zzu;
                        if (zze2 != null && (object8 = this.zza) != null) {
                            ((zzv)object8).zzb();
                            ((zzv)object8).zza();
                            object7 = this.zzn;
                            object8 = this.zza;
                            object6 = ((zzv)object8).zzb();
                            Preconditions.checkNotNull(object6);
                            object8 = this.zza;
                            object5 = ((zzv)object8).zza();
                            String string2 = this.zze();
                            object8 = this.zza;
                            boolean bl3 = ((zzv)object8).zzc();
                            n14 = 4225;
                            ((GmsClientSupervisor)object7).zzc((String)object6, (String)object5, n14, zze2, string2, bl3);
                            object8 = this.zzd;
                            ((AtomicInteger)object8).incrementAndGet();
                        }
                        object = this.zzd;
                        int n15 = ((AtomicInteger)object).get();
                        this.zzu = object8 = new zze(this, n15);
                        n15 = this.zzv;
                        if (n15 == n4 && (object = this.getLocalStartServiceAction()) != null) {
                            object4 = this.getContext();
                            object7 = object4.getPackageName();
                            object6 = this.getLocalStartServiceAction();
                            n14 = 4225;
                            boolean bl4 = false;
                            zze2 = null;
                            boolean bl5 = true;
                            object2 = object;
                            object = new zzv((String)object7, (String)object6, bl5, n14, false);
                        } else {
                            object7 = this.getStartServicePackage();
                            object6 = this.getStartServiceAction();
                            boolean bl6 = this.getUseDynamicLookup();
                            boolean bl7 = false;
                            object5 = null;
                            n14 = 4225;
                            object2 = object;
                            object = new zzv((String)object7, (String)object6, false, n14, bl6);
                        }
                        this.zza = object;
                        n15 = (int)(((zzv)object).zzc() ? 1 : 0);
                        if (n15 != 0 && (n15 = this.getMinApkVersion()) < (n8 = 17895000)) {
                            object = this.zza;
                            object = ((zzv)object).zzb();
                            object4 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ";
                            object = String.valueOf(object);
                            object = ((String)object4).concat((String)object);
                            object8 = new IllegalStateException((String)object);
                            throw object8;
                        }
                        object = this.zzn;
                        object4 = this.zza;
                        object4 = ((zzv)object4).zzb();
                        Preconditions.checkNotNull(object4);
                        Object object9 = this.zza;
                        object9 = ((zzv)object9).zza();
                        object2 = this.zze();
                        object7 = this.zza;
                        boolean bl8 = ((zzv)object7).zzc();
                        object6 = this.getBindServiceExecutor();
                        n14 = 4225;
                        object5 = new zzo((String)object4, (String)object9, n14, bl8);
                        object8 = ((GmsClientSupervisor)object).zza((zzo)object5, (ServiceConnection)object8, (String)object2, (Executor)object6);
                        n15 = (int)(((ConnectionResult)object8).isSuccess() ? 1 : 0);
                        if (n15 == 0) {
                            object = this.zza;
                            ((zzv)object).zzb();
                            object = this.zza;
                            ((zzv)object).zza();
                            n15 = ((ConnectionResult)object8).getErrorCode();
                            n8 = -1;
                            n15 = n15 == n8 ? 16 : ((ConnectionResult)object8).getErrorCode();
                            object4 = ((ConnectionResult)object8).getResolution();
                            if (object4 != null) {
                                bundle = new Bundle();
                                object4 = KEY_PENDING_INTENT;
                                object8 = ((ConnectionResult)object8).getResolution();
                                bundle.putParcelable((String)object4, (Parcelable)object8);
                            }
                            object8 = this.zzd;
                            n3 = ((AtomicInteger)object8).get();
                            this.zzl(n15, bundle, n3);
                        }
                        break block18;
                    }
                    zze zze3 = this.zzu;
                    if (zze3 != null) {
                        object2 = this.zzn;
                        zzv zzv2 = this.zza;
                        String string3 = zzv2.zzb();
                        Preconditions.checkNotNull(string3);
                        zzv2 = this.zza;
                        String string4 = zzv2.zza();
                        String string5 = this.zze();
                        zzv2 = this.zza;
                        boolean bl9 = zzv2.zzc();
                        int n16 = 4225;
                        ((GmsClientSupervisor)object2).zzc(string3, string4, n16, zze3, string5, bl9);
                        this.zzu = null;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void checkAvailabilityAndConnect() {
        Object object = this.zzo;
        Object object2 = this.zzl;
        int n3 = this.getMinApkVersion();
        int n4 = ((GoogleApiAvailabilityLight)object).isGooglePlayServicesAvailable((Context)object2, n3);
        if (n4 != 0) {
            this.zzp(1, null);
            object2 = new BaseGmsClient$LegacyClientCallbackAdapter(this);
            this.triggerNotAvailable((BaseGmsClient$ConnectionProgressReportCallbacks)object2, n4, null);
            return;
        }
        object = new BaseGmsClient$LegacyClientCallbackAdapter(this);
        this.connect((BaseGmsClient$ConnectionProgressReportCallbacks)object);
    }

    public final void checkConnected() {
        boolean bl2 = this.isConnected();
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        throw illegalStateException;
    }

    public void connect(BaseGmsClient$ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks) {
        Preconditions.checkNotNull(baseGmsClient$ConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = baseGmsClient$ConnectionProgressReportCallbacks;
        this.zzp(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        // MONITORENTER : arrayList
        Object object = this.zzt;
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = this.zzt;
            object2 = ((ArrayList)object2).get(i3);
            object2 = (zzc)object2;
            ((zzc)object2).zzf();
        }
        object = this.zzt;
        ((ArrayList)object).clear();
        // MONITOREXIT : arrayList
        object = this.zzq;
        // MONITORENTER : object
        arrayList = null;
        this.zzr = null;
        // MONITOREXIT : object
        this.zzp(1, null);
    }

    public void disconnect(String string2) {
        this.zzk = string2;
        this.disconnect();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dump(String object, FileDescriptor object2, PrintWriter object3, String[] object4) {
        long l2;
        long l3;
        long l4;
        Object object5;
        int n3;
        block25: {
            Object object6;
            block21: {
                block26: {
                    long l7;
                    String string2;
                    int n4;
                    int n7;
                    int n8;
                    block20: {
                        block22: {
                            block23: {
                                block24: {
                                    object2 = this.zzp;
                                    synchronized (object2) {
                                        n3 = this.zzv;
                                        object5 = this.zzs;
                                    }
                                    Object object7 = this.zzq;
                                    synchronized (object7) {
                                        object2 = this.zzr;
                                    }
                                    object7 = ((PrintWriter)object3).append((CharSequence)object);
                                    object6 = "mConnectState=";
                                    ((PrintWriter)object7).append((CharSequence)object6);
                                    n8 = 3;
                                    n7 = 2;
                                    n4 = 1;
                                    if (n3 == n4) break block22;
                                    if (n3 == n7) break block23;
                                    if (n3 == n8) break block24;
                                    int n10 = 4;
                                    if (n3 != n10) {
                                        n10 = 5;
                                        if (n3 != n10) {
                                            object4 = "UNKNOWN";
                                            ((PrintWriter)object3).print((String)object4);
                                            break block20;
                                        } else {
                                            object4 = "DISCONNECTING";
                                            ((PrintWriter)object3).print((String)object4);
                                        }
                                        break block20;
                                    } else {
                                        object4 = "CONNECTED";
                                        ((PrintWriter)object3).print((String)object4);
                                    }
                                    break block20;
                                }
                                object4 = "LOCAL_CONNECTING";
                                ((PrintWriter)object3).print((String)object4);
                                break block20;
                            }
                            object4 = "REMOTE_CONNECTING";
                            ((PrintWriter)object3).print((String)object4);
                            break block20;
                        }
                        object4 = "DISCONNECTED";
                        ((PrintWriter)object3).print((String)object4);
                    }
                    object4 = " mService=";
                    ((PrintWriter)object3).append((CharSequence)object4);
                    if (object5 == null) {
                        object4 = "null";
                        ((PrintWriter)object3).append((CharSequence)object4);
                    } else {
                        object4 = this.getServiceDescriptor();
                        object4 = ((PrintWriter)object3).append((CharSequence)object4);
                        string2 = "@";
                        object4 = ((PrintWriter)object4).append(string2);
                        int n14 = System.identityHashCode(object5.asBinder());
                        object5 = Integer.toHexString(n14);
                        ((PrintWriter)object4).append((CharSequence)object5);
                    }
                    object4 = " mServiceBroker=";
                    ((PrintWriter)object3).append((CharSequence)object4);
                    if (object2 == null) {
                        object2 = "null";
                        ((PrintWriter)object3).println((String)object2);
                    } else {
                        object4 = ((PrintWriter)object3).append("IGmsServiceBroker@");
                        int n15 = System.identityHashCode(object2.asBinder());
                        object2 = Integer.toHexString(n15);
                        ((PrintWriter)object4).println((String)object2);
                    }
                    object4 = "yyyy-MM-dd HH:mm:ss.SSS";
                    object5 = Locale.US;
                    object2 = new SimpleDateFormat((String)object4, (Locale)object5);
                    long l8 = this.zzh;
                    l4 = 0L;
                    n3 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1));
                    if (n3 > 0) {
                        object4 = ((PrintWriter)object3).append((CharSequence)object).append("lastConnectedTime=");
                        l8 = this.zzh;
                        object5 = new Date(l8);
                        object5 = ((DateFormat)object2).format((Date)object5);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(l8);
                        string2 = " ";
                        stringBuilder.append(string2);
                        stringBuilder.append((String)object5);
                        object5 = stringBuilder.toString();
                        ((PrintWriter)object4).println((String)object5);
                    }
                    if ((n3 = (int)((l7 = (l8 = this.zzg) - l4) == 0L ? 0 : (l7 < 0L ? -1 : 1))) <= 0) break block25;
                    object4 = ((PrintWriter)object3).append((CharSequence)object);
                    object5 = "lastSuspendedCause=";
                    ((PrintWriter)object4).append((CharSequence)object5);
                    n3 = this.zzf;
                    if (n3 == n4) break block26;
                    if (n3 != n7) {
                        if (n3 != n8) {
                            object4 = String.valueOf(n3);
                            ((PrintWriter)object3).append((CharSequence)object4);
                            break block21;
                        } else {
                            object4 = "CAUSE_DEAD_OBJECT_EXCEPTION";
                            ((PrintWriter)object3).append((CharSequence)object4);
                        }
                        break block21;
                    } else {
                        object4 = "CAUSE_NETWORK_LOST";
                        ((PrintWriter)object3).append((CharSequence)object4);
                    }
                    break block21;
                }
                object4 = "CAUSE_SERVICE_DISCONNECTED";
                ((PrintWriter)object3).append((CharSequence)object4);
            }
            object4 = ((PrintWriter)object3).append(" lastSuspendedTime=");
            l3 = this.zzg;
            object6 = new Date(l3);
            object6 = ((DateFormat)object2).format((Date)object6);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l3);
            stringBuilder.append(" ");
            stringBuilder.append((String)object6);
            object5 = stringBuilder.toString();
            ((PrintWriter)object4).println((String)object5);
        }
        if ((n3 = (int)((l2 = (l3 = this.zzj) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1))) > 0) {
            object = ((PrintWriter)object3).append((CharSequence)object).append("lastFailedStatus=");
            n3 = this.zzi;
            object4 = CommonStatusCodes.getStatusCodeString(n3);
            ((PrintWriter)object).append((CharSequence)object4);
            object = ((PrintWriter)object3).append(" lastFailedTime=");
            long l12 = this.zzj;
            object5 = new Date(l12);
            object2 = ((DateFormat)object2).format((Date)object5);
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(l12);
            object3 = " ";
            ((StringBuilder)object5).append((String)object3);
            ((StringBuilder)object5).append((String)object2);
            object2 = ((StringBuilder)object5).toString();
            ((PrintWriter)object).println((String)object2);
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzk2 = this.zzE;
        if (zzk2 == null) {
            return null;
        }
        return zzk2.zzb;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        Object object;
        boolean bl2 = this.isConnected();
        if (bl2 && (object = this.zza) != null) {
            return ((zzv)object).zza();
        }
        object = new RuntimeException("Failed to connect when checking package");
        throw object;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        return bundle;
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void getRemoteService(IAccountAccessor iAccountAccessor, Set account) {
        int n3;
        GetServiceRequest getServiceRequest;
        Object object;
        Object object2;
        BaseGmsClient baseGmsClient = this;
        Object object3 = account;
        Object object4 = this.getGetServiceRequestExtraArgs();
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        object2 = n4 < n7 ? this.zzA : ((object2 = this.zzB) == null ? this.zzA : ((object2 = this.zzB.getAttributionSource()) == null ? this.zzA : ((object = gw_0.a((AttributionSource)object2)) == null ? this.zzA : gw_0.a((AttributionSource)object2))));
        Object object5 = object2;
        int n8 = baseGmsClient.zzy;
        int n10 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArray = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArray = GetServiceRequest.zzb;
        n7 = 6;
        boolean bl2 = true;
        object2 = getServiceRequest;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        getServiceRequest = null;
        ((GetServiceRequest)object2)(n7, n8, n10, null, null, scopeArray, bundle, null, featureArray, featureArray, bl2, 0, false, (String)object5);
        object2 = baseGmsClient.zzl.getPackageName();
        object = getServiceRequest2;
        getServiceRequest2.zzf = object2;
        getServiceRequest2.zzi = object4;
        if (object3 != null) {
            object4 = new Scope[]{};
            object3 = object3.toArray((T[])object4);
            getServiceRequest2.zzh = object3;
        }
        if ((n3 = this.requiresSignIn()) != 0) {
            object3 = this.getAccount();
            if (object3 == null) {
                object4 = DEFAULT_ACCOUNT;
                object2 = "com.google";
                object3 = new Account((String)object4, (String)object2);
            }
            ((GetServiceRequest)object).zzj = object3;
            if (iAccountAccessor != null) {
                object3 = iAccountAccessor.asBinder();
                ((GetServiceRequest)object).zzg = object3;
            }
        } else {
            n3 = this.requiresAccount();
            if (n3 != 0) {
                object3 = this.getAccount();
                ((GetServiceRequest)object).zzj = object3;
            }
        }
        object3 = zze;
        ((GetServiceRequest)object).zzk = object3;
        object3 = this.getApiFeatures();
        ((GetServiceRequest)object).zzl = object3;
        n3 = this.usesClientTelemetry();
        if (n3 != 0) {
            ((GetServiceRequest)object).zzo = n3 = 1;
        }
        object4 = baseGmsClient.zzq;
        // MONITORENTER : object4
        try {
            object3 = baseGmsClient.zzr;
            if (object3 == null) return;
            AtomicInteger atomicInteger = baseGmsClient.zzd;
            n8 = atomicInteger.get();
            object2 = new zzd(baseGmsClient, n8);
            object3.getService((IGmsCallbacks)object2, (GetServiceRequest)object);
            return;
        }
        catch (Throwable throwable) {}
        {
        }
        // MONITOREXIT : object4
        try {
            throw throwable;
        }
        catch (SecurityException securityException) {
            throw securityException;
        }
        catch (RemoteException | RuntimeException throwable) {
            n3 = baseGmsClient.zzd.get();
            baseGmsClient.onPostInitHandler(8, null, null, n3);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            baseGmsClient.triggerConnectionSuspended(3);
            return;
        }
    }

    public Set getScopes() {
        return Collections.emptySet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IInterface getService() {
        Object object = this.zzp;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    int n3 = this.zzv;
                    int n4 = 5;
                    if (n3 != n4) {
                        this.checkConnected();
                        IInterface iInterface = this.zzs;
                        String string2 = "Client is connected but service is null";
                        Preconditions.checkNotNull(iInterface, string2);
                        return iInterface;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                DeadObjectException deadObjectException = new DeadObjectException();
                throw deadObjectException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public IBinder getServiceBrokerBinder() {
        Object object = this.zzq;
        synchronized (object) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker != null) return iGmsServiceBroker.asBinder();
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Not a sign in API");
        throw unsupportedOperationException;
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzk2 = this.zzE;
        if (zzk2 == null) {
            return null;
        }
        return zzk2.zzd;
    }

    public boolean getUseDynamicLookup() {
        int n3;
        int n4 = this.getMinApkVersion();
        return n4 >= (n3 = 211700000);
    }

    public boolean hasConnectionInfo() {
        zzk zzk2 = this.zzE;
        return zzk2 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isConnected() {
        Object object = this.zzp;
        synchronized (object) {
            boolean bl2 = this.zzv;
            boolean bl3 = 4 != 0;
            if (bl2 != bl3) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isConnecting() {
        Object object = this.zzp;
        synchronized (object) {
            int n3 = this.zzv;
            int n4 = 2;
            boolean bl2 = true;
            if (n3 == n4) return bl2;
            n4 = 3;
            if (n3 != n4) return false;
            return bl2;
        }
    }

    public void onConnectedLocked(IInterface iInterface) {
        long l2;
        this.zzh = l2 = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        long l2;
        int n3;
        this.zzi = n3 = connectionResult.getErrorCode();
        this.zzj = l2 = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int n3) {
        long l2;
        this.zzf = n3;
        this.zzg = l2 = System.currentTimeMillis();
    }

    public void onPostInitHandler(int n3, IBinder iBinder, Bundle bundle, int n4) {
        zzf zzf2 = new zzf(this, n3, iBinder, bundle);
        Message message = this.zzb.obtainMessage(1, n4, -1, (Object)zzf2);
        this.zzb.sendMessage(message);
    }

    public void onUserSignOut(BaseGmsClient$SignOutCallbacks baseGmsClient$SignOutCallbacks) {
        baseGmsClient$SignOutCallbacks.onSignOutComplete();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    public void setAttributionTag(String string2) {
        this.zzA = string2;
    }

    public void triggerConnectionSuspended(int n3) {
        int n4 = this.zzd.get();
        Message message = this.zzb.obtainMessage(6, n4, n3);
        this.zzb.sendMessage(message);
    }

    public void triggerNotAvailable(BaseGmsClient$ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks, int n3, PendingIntent pendingIntent) {
        Preconditions.checkNotNull(baseGmsClient$ConnectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = baseGmsClient$ConnectionProgressReportCallbacks;
        int n4 = this.zzd.get();
        baseGmsClient$ConnectionProgressReportCallbacks = this.zzb.obtainMessage(3, n4, n3, (Object)pendingIntent);
        this.zzb.sendMessage((Message)baseGmsClient$ConnectionProgressReportCallbacks);
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String string2 = this.zzz;
        if (string2 == null) {
            string2 = this.zzl.getClass().getName();
        }
        return string2;
    }

    public final void zzl(int n3, Bundle bundle, int n4) {
        zzg zzg2 = new zzg(this, n3, bundle);
        Message message = this.zzb.obtainMessage(7, n4, -1, (Object)zzg2);
        this.zzb.sendMessage(message);
    }
}

