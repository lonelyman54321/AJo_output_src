/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zaaf;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zabl;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.common.api.internal.zacd;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zach;
import com.google.android.gms.common.api.internal.zaci;
import com.google.android.gms.common.api.internal.zae;
import com.google.android.gms.common.api.internal.zaf;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.api.internal.zah;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.api.internal.zal;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleApiManager
implements Handler.Callback {
    public static final Status zaa;
    private static final Status zab;
    private static final Object zac;
    private static GoogleApiManager zad;
    private long zae;
    private boolean zaf;
    private TelemetryData zag;
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final AtomicInteger zal;
    private final AtomicInteger zam;
    private final Map zan;
    private zaae zao;
    private final Set zap;
    private final Set zaq;
    private final Handler zar;
    private volatile boolean zas;

    static {
        int n3 = 4;
        Object object = new Status(n3, "Sign-out occurred while this API call was in progress.");
        zaa = object;
        object = new Status(n3, "The user must be signed in to make this API call.");
        zab = object;
        zac = object = new Object();
    }

    private GoogleApiManager(Context context, Looper object, GoogleApiAvailability googleApiAvailability) {
        long l2;
        this.zae = l2 = 10000L;
        this.zaf = false;
        int n3 = 1;
        Object object2 = new AtomicInteger(n3);
        this.zal = object2;
        object2 = new AtomicInteger(0);
        this.zam = object2;
        int n4 = 5;
        float f5 = 0.75f;
        super(n4, f5, n3);
        this.zan = object2;
        this.zao = null;
        this.zap = object2 = new Np();
        this.zaq = object2 = new Np();
        this.zas = n3;
        this.zai = context;
        object2 = new zau((Looper)object, this);
        this.zar = object2;
        this.zaj = googleApiAvailability;
        super(googleApiAvailability);
        this.zak = object;
        boolean bl2 = DeviceProperties.isAuto(context);
        if (bl2) {
            this.zas = false;
        }
        context = object2.obtainMessage(6);
        object2.sendMessage((Message)context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reportSignOut() {
        Object object = zac;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        GoogleApiManager googleApiManager = zad;
                        if (googleApiManager == null) break block3;
                        AtomicInteger atomicInteger = googleApiManager.zam;
                        atomicInteger.incrementAndGet();
                        googleApiManager = googleApiManager.zar;
                        int n3 = 10;
                        atomicInteger = googleApiManager.obtainMessage(n3);
                        googleApiManager.sendMessageAtFrontOfQueue((Message)atomicInteger);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zaC(GoogleApiManager googleApiManager) {
        return googleApiManager.zas;
    }

    private static Status zaF(ApiKey object, ConnectionResult connectionResult) {
        object = ((ApiKey)object).zaa();
        String string2 = String.valueOf(connectionResult);
        object = UX.c("API: ", (String)object, " is not available on this device. Connection failed with: ", string2);
        Status status = new Status(connectionResult, (String)object);
        return status;
    }

    private final zabq zaG(GoogleApi object) {
        boolean bl2;
        Object object2 = this.zan;
        ApiKey apiKey = ((GoogleApi)object).getApiKey();
        if ((object2 = (zabq)object2.get(apiKey)) == null) {
            object2 = new zabq(this, (GoogleApi)object);
            object = this.zan;
            object.put(apiKey, object2);
        }
        if (bl2 = ((zabq)object2).zaA()) {
            object = this.zaq;
            object.add(apiKey);
        }
        ((zabq)object2).zao();
        return object2;
    }

    private final TelemetryLoggingClient zaH() {
        TelemetryLoggingClient telemetryLoggingClient = this.zah;
        if (telemetryLoggingClient == null) {
            this.zah = telemetryLoggingClient = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            int n3 = telemetryData.zaa();
            if (n3 > 0 || (n3 = (int)(this.zaD() ? 1 : 0)) != 0) {
                TelemetryLoggingClient telemetryLoggingClient = this.zaH();
                telemetryLoggingClient.log(telemetryData);
            }
            telemetryData = null;
            this.zag = null;
        }
    }

    private final void zaJ(TaskCompletionSource object, int n3, GoogleApi object2) {
        zacd zacd2;
        if (n3 != 0 && (zacd2 = zacd.zaa(this, n3, (ApiKey)(object2 = ((GoogleApi)object2).getApiKey()))) != null) {
            object = ((TaskCompletionSource)object).getTask();
            object2 = this.zar;
            object2.getClass();
            zabk zabk2 = new zabk((Handler)object2);
            ((Task)object).addOnCompleteListener(zabk2, (OnCompleteListener)zacd2);
        }
    }

    public static /* bridge */ /* synthetic */ long zab(GoogleApiManager googleApiManager) {
        return googleApiManager.zae;
    }

    public static /* bridge */ /* synthetic */ Context zac(GoogleApiManager googleApiManager) {
        return googleApiManager.zai;
    }

    public static /* bridge */ /* synthetic */ Handler zad(GoogleApiManager googleApiManager) {
        return googleApiManager.zar;
    }

    public static /* bridge */ /* synthetic */ GoogleApiAvailability zae(GoogleApiManager googleApiManager) {
        return googleApiManager.zaj;
    }

    public static /* bridge */ /* synthetic */ Status zaf() {
        return zab;
    }

    public static /* bridge */ /* synthetic */ Status zag(ApiKey apiKey, ConnectionResult connectionResult) {
        return GoogleApiManager.zaF(apiKey, connectionResult);
    }

    public static /* bridge */ /* synthetic */ zaae zah(GoogleApiManager googleApiManager) {
        return googleApiManager.zao;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GoogleApiManager zaj() {
        Object object = zac;
        synchronized (object) {
            GoogleApiManager googleApiManager = zad;
            String string2 = "Must guarantee manager is non-null before using getInstance";
            Preconditions.checkNotNull(googleApiManager, string2);
            return zad;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static GoogleApiManager zak(Context object) {
        Object object2 = zac;
        synchronized (object2) {
            try {
                GoogleApiManager googleApiManager;
                GoogleApiManager googleApiManager2 = zad;
                if (googleApiManager2 != null) return zad;
                googleApiManager2 = GmsClientSupervisor.getOrStartHandlerThread();
                googleApiManager2 = googleApiManager2.getLooper();
                object = object.getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                zad = googleApiManager = new GoogleApiManager((Context)object, (Looper)googleApiManager2, googleApiAvailability);
                return zad;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zal zal(GoogleApiManager googleApiManager) {
        return googleApiManager.zak;
    }

    public static /* bridge */ /* synthetic */ Object zaq() {
        return zac;
    }

    public static /* bridge */ /* synthetic */ Map zar(GoogleApiManager googleApiManager) {
        return googleApiManager.zan;
    }

    public static /* bridge */ /* synthetic */ Set zas(GoogleApiManager googleApiManager) {
        return googleApiManager.zap;
    }

    public static /* bridge */ /* synthetic */ void zat(GoogleApiManager googleApiManager, boolean bl2) {
        googleApiManager.zaf = true;
    }

    public final boolean handleMessage(Message object) {
        int n3 = ((Message)object).what;
        int n4 = 13;
        long l2 = 300000L;
        boolean bl2 = false;
        zabq zabq2 = null;
        boolean bl3 = true;
        int n7 = 17;
        int n8 = 0;
        block0 : switch (n3) {
            default: {
                return false;
            }
            case 19: {
                this.zaf = false;
                break;
            }
            case 18: {
                int n10;
                Object object2;
                object = (zace)((Message)object).obj;
                long l3 = ((zace)object).zac;
                l2 = 0L;
                bl2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (!bl2) {
                    n4 = ((zace)object).zab;
                    object = ((zace)object).zaa;
                    MethodInvocation[] methodInvocationArray = new MethodInvocation[bl3];
                    methodInvocationArray[0] = object;
                    object = Arrays.asList(methodInvocationArray);
                    TelemetryData telemetryData = new TelemetryData(n4, (List)object);
                    object = this.zaH();
                    object.log(telemetryData);
                    break;
                }
                Object object3 = this.zag;
                if (object3 != null) {
                    object2 = ((TelemetryData)object3).zab();
                    n3 = ((TelemetryData)object3).zaa();
                    if (n3 == (n10 = ((zace)object).zab) && (object2 == null || (n3 = object2.size()) < (n4 = ((zace)object).zad))) {
                        object3 = this.zag;
                        object2 = ((zace)object).zaa;
                        ((TelemetryData)object3).zac((MethodInvocation)object2);
                    } else {
                        object3 = this.zar;
                        object3.removeMessages(n7);
                        this.zaI();
                    }
                }
                if ((object3 = this.zag) != null) break;
                object3 = new ArrayList();
                object2 = ((zace)object).zaa;
                ((ArrayList)object3).add(object2);
                n10 = ((zace)object).zab;
                this.zag = object2 = new TelemetryData(n10, (List)object3);
                object3 = this.zar;
                object2 = object3.obtainMessage(n7);
                l2 = ((zace)object).zac;
                object3.sendMessageDelayed((Message)object2, l2);
                break;
            }
            case 17: {
                this.zaI();
                break;
            }
            case 16: {
                object = (zabs)((Message)object).obj;
                Object object4 = this.zan;
                ApiKey apiKey = zabs.zab((zabs)object);
                n3 = (int)(object4.containsKey(apiKey) ? 1 : 0);
                if (n3 == 0) break;
                object4 = this.zan;
                apiKey = zabs.zab((zabs)object);
                object4 = (zabq)object4.get(apiKey);
                zabq.zam((zabq)object4, (zabs)object);
                break;
            }
            case 15: {
                object = (zabs)((Message)object).obj;
                Object object5 = this.zan;
                ApiKey apiKey = zabs.zab((zabs)object);
                n3 = (int)(object5.containsKey(apiKey) ? 1 : 0);
                if (n3 == 0) break;
                object5 = this.zan;
                apiKey = zabs.zab((zabs)object);
                object5 = (zabq)object5.get(apiKey);
                zabq.zal((zabq)object5, (zabs)object);
                break;
            }
            case 14: {
                object = (zaaf)((Message)object).obj;
                Object object6 = ((zaaf)object).zaa();
                Map map2 = this.zan;
                n4 = (int)(map2.containsKey(object6) ? 1 : 0);
                if (n4 == 0) {
                    object = ((zaaf)object).zab();
                    object6 = Boolean.FALSE;
                    ((TaskCompletionSource)object).setResult(object6);
                    break;
                }
                map2 = this.zan;
                n3 = (int)(zabq.zay((zabq)map2.get(object6), false) ? 1 : 0);
                object = ((zaaf)object).zab();
                object6 = n3 != 0;
                ((TaskCompletionSource)object).setResult(object6);
                break;
            }
            case 12: {
                Map map3 = this.zan;
                Object object7 = ((Message)object).obj;
                n3 = (int)(map3.containsKey(object7) ? 1 : 0);
                if (n3 == 0) break;
                map3 = this.zan;
                object = ((Message)object).obj;
                object = (zabq)map3.get(object);
                ((zabq)object).zaB();
                break;
            }
            case 11: {
                Map map4 = this.zan;
                Object object8 = ((Message)object).obj;
                n3 = (int)(map4.containsKey(object8) ? 1 : 0);
                if (n3 == 0) break;
                map4 = this.zan;
                object = ((Message)object).obj;
                object = (zabq)map4.get(object);
                ((zabq)object).zaw();
                break;
            }
            case 10: {
                object = this.zaq.iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    Object object9 = (ApiKey)object.next();
                    Map map5 = this.zan;
                    if ((object9 = (zabq)map5.remove(object9)) == null) continue;
                    ((zabq)object9).zav();
                }
                object = this.zaq;
                object.clear();
                break;
            }
            case 9: {
                Map map6 = this.zan;
                Object object10 = ((Message)object).obj;
                n3 = (int)(map6.containsKey(object10) ? 1 : 0);
                if (n3 == 0) break;
                map6 = this.zan;
                object = ((Message)object).obj;
                object = (zabq)map6.get(object);
                ((zabq)object).zau();
                break;
            }
            case 7: {
                object = (GoogleApi)((Message)object).obj;
                this.zaG((GoogleApi)object);
                break;
            }
            case 6: {
                object = this.zai.getApplicationContext();
                boolean bl4 = object instanceof Application;
                if (!bl4) break;
                BackgroundDetector.initialize((Application)this.zai.getApplicationContext());
                object = BackgroundDetector.getInstance();
                zabl zabl2 = new zabl(this);
                ((BackgroundDetector)object).addListener(zabl2);
                object = BackgroundDetector.getInstance();
                bl4 = ((BackgroundDetector)object).readCurrentStateIfPossible(bl3);
                if (bl4) break;
                this.zae = l2;
                break;
            }
            case 5: {
                Object object11;
                boolean bl5;
                n3 = ((Message)object).arg1;
                object = (ConnectionResult)((Message)object).obj;
                Object object12 = this.zan.values().iterator();
                while (bl5 = object12.hasNext()) {
                    object11 = (zabq)object12.next();
                    n8 = ((zabq)object11).zab();
                    if (n8 != n3) continue;
                    zabq2 = object11;
                    break;
                }
                if (zabq2 != null) {
                    n3 = ((ConnectionResult)object).getErrorCode();
                    if (n3 == n4) {
                        Object object13 = this.zaj;
                        int n14 = ((ConnectionResult)object).getErrorCode();
                        object13 = ((GoogleApiAvailability)object13).getErrorString(n14);
                        object = ((ConnectionResult)object).getErrorMessage();
                        object12 = "Error resolution was canceled by the user, original error message: ";
                        object11 = ": ";
                        object = UX.c((String)object12, (String)object13, (String)object11, (String)object);
                        Status status = new Status(n7, (String)object);
                        zabq.zai(zabq2, status);
                        break;
                    }
                    ApiKey apiKey = zabq.zag(zabq2);
                    object = GoogleApiManager.zaF(apiKey, (ConnectionResult)object);
                    zabq.zai(zabq2, (Status)object);
                    break;
                }
                object = Gj0.b(n3, "Could not find API instance ", " while trying to fail enqueued calls.");
                Exception exception = new Exception();
                String string2 = "GoogleApiManager";
                Log.wtf((String)string2, (String)object, (Throwable)exception);
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                int n15;
                object = (zach)((Message)object).obj;
                Object object14 = this.zan;
                Object object15 = ((zach)object).zac.getApiKey();
                object14 = (zabq)object14.get(object15);
                if (object14 == null) {
                    object14 = ((zach)object).zac;
                    object14 = this.zaG((GoogleApi)object14);
                }
                if ((n4 = (int)(((zabq)object14).zaA() ? 1 : 0)) != 0 && (n4 = ((AtomicInteger)(object15 = this.zam)).get()) != (n15 = ((zach)object).zab)) {
                    object = ((zach)object).zaa;
                    object15 = zaa;
                    ((zai)object).zad((Status)object15);
                    ((zabq)object14).zav();
                    break;
                }
                object = ((zach)object).zaa;
                ((zabq)object14).zap((zai)object);
                break;
            }
            case 3: {
                object = this.zan.values().iterator();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    zabq zabq3 = (zabq)object.next();
                    zabq3.zan();
                    zabq3.zao();
                }
                break;
            }
            case 2: {
                boolean bl6;
                object = (zal)((Message)object).obj;
                Object object16 = ((zal)object).zab().iterator();
                while (bl6 = object16.hasNext()) {
                    ConnectionResult connectionResult;
                    ApiKey apiKey = (ApiKey)object16.next();
                    Object object17 = (zabq)this.zan.get(apiKey);
                    if (object17 == null) {
                        object16 = new ConnectionResult(n4);
                        ((zal)object).zac(apiKey, (ConnectionResult)object16, null);
                        break block0;
                    }
                    n7 = (int)(((zabq)object17).zaz() ? 1 : 0);
                    if (n7 != 0) {
                        connectionResult = ConnectionResult.RESULT_SUCCESS;
                        object17 = ((zabq)object17).zaf().getEndpointPackageName();
                        ((zal)object).zac(apiKey, connectionResult, (String)object17);
                        continue;
                    }
                    connectionResult = ((zabq)object17).zad();
                    if (connectionResult != null) {
                        ((zal)object).zac(apiKey, connectionResult, null);
                        continue;
                    }
                    ((zabq)object17).zat((zal)object);
                    ((zabq)object17).zao();
                }
                break;
            }
            case 1: {
                object = (Boolean)((Message)object).obj;
                boolean bl7 = (Boolean)object;
                if (bl3 == bl7) {
                    l2 = 10000L;
                }
                this.zae = l2;
                object = this.zar;
                n3 = 12;
                object.removeMessages(n3);
                object = this.zan.keySet().iterator();
                while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    ApiKey apiKey = (ApiKey)object.next();
                    Handler handler = this.zar;
                    apiKey = handler.obtainMessage(n3, (Object)apiKey);
                    long l4 = this.zae;
                    handler.sendMessageDelayed((Message)apiKey, l4);
                }
                break block0;
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zaA(zaae object) {
        Object object2 = zac;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                Object object3;
                block4: {
                    try {
                        object3 = this.zao;
                        if (object3 == object) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.zao = object;
                    object3 = this.zap;
                    object3.clear();
                }
                object3 = this.zap;
                object = ((zaae)object).zaa();
                object3.addAll(object);
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
    public final void zaB(zaae object) {
        Object object2 = zac;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        zaae zaae2 = this.zao;
                        if (zaae2 != object) break block4;
                        object = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.zao = null;
                    object = this.zap;
                    object.clear();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zaD() {
        int n3;
        int n4 = this.zaf;
        if (n4 != 0) {
            return false;
        }
        Object object = RootTelemetryConfigManager.getInstance().getConfig();
        if (object != null && (n4 = ((RootTelemetryConfiguration)object).getMethodInvocationTelemetryEnabled()) == 0) {
            return false;
        }
        object = this.zak;
        Context context = this.zai;
        int n7 = 203400000;
        n4 = ((com.google.android.gms.common.internal.zal)object).zaa(context, n7);
        return n4 == (n3 = -1) || n4 == 0;
        {
        }
    }

    public final boolean zaE(ConnectionResult connectionResult, int n3) {
        GoogleApiAvailability googleApiAvailability = this.zaj;
        Context context = this.zai;
        return googleApiAvailability.zah(context, connectionResult, n3);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    public final zabq zai(ApiKey apiKey) {
        return (zabq)this.zan.get(apiKey);
    }

    public final Task zam(Iterable iterable) {
        zal zal2 = new zal(iterable);
        iterable = this.zar.obtainMessage(2, (Object)zal2);
        this.zar.sendMessage((Message)iterable);
        return zal2.zaa();
    }

    public final Task zan(GoogleApi object) {
        object = ((GoogleApi)object).getApiKey();
        zaaf zaaf2 = new zaaf((ApiKey)object);
        object = this.zar.obtainMessage(14, (Object)zaaf2);
        this.zar.sendMessage((Message)object);
        return zaaf2.zab().getTask();
    }

    public final Task zao(GoogleApi googleApi, RegisterListenerMethod object, UnregisterListenerMethod object2, Runnable runnable2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        int n3 = ((RegisterListenerMethod)object).zaa();
        this.zaJ(taskCompletionSource, n3, googleApi);
        zaci zaci2 = new zaci((RegisterListenerMethod)object, (UnregisterListenerMethod)object2, runnable2);
        zaf zaf2 = new zaf(zaci2, taskCompletionSource);
        object = this.zam;
        int n4 = ((AtomicInteger)object).get();
        object2 = new zach(zaf2, n4, googleApi);
        googleApi = this.zar.obtainMessage(8, object2);
        this.zar.sendMessage((Message)googleApi);
        return taskCompletionSource.getTask();
    }

    public final Task zap(GoogleApi googleApi, ListenerHolder$ListenerKey object, int n3) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaJ(taskCompletionSource, n3, googleApi);
        zah zah2 = new zah((ListenerHolder$ListenerKey)object, taskCompletionSource);
        object = this.zam;
        int n4 = ((AtomicInteger)object).get();
        zach zach2 = new zach(zah2, n4, googleApi);
        googleApi = this.zar.obtainMessage(13, (Object)zach2);
        this.zar.sendMessage((Message)googleApi);
        return taskCompletionSource.getTask();
    }

    public final void zau(GoogleApi googleApi, int n3, BaseImplementation$ApiMethodImpl object) {
        zae zae2 = new zae(n3, (BaseImplementation$ApiMethodImpl)object);
        AtomicInteger atomicInteger = this.zam;
        n3 = atomicInteger.get();
        object = new zach(zae2, n3, googleApi);
        googleApi = this.zar.obtainMessage(4, object);
        this.zar.sendMessage((Message)googleApi);
    }

    public final void zav(GoogleApi googleApi, int n3, TaskApiCall object, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        int n4 = ((TaskApiCall)object).zaa();
        this.zaJ(taskCompletionSource, n4, googleApi);
        zag zag2 = new zag(n3, (TaskApiCall)object, taskCompletionSource, statusExceptionMapper);
        AtomicInteger atomicInteger = this.zam;
        n3 = atomicInteger.get();
        object = new zach(zag2, n3, googleApi);
        googleApi = this.zar.obtainMessage(4, object);
        this.zar.sendMessage((Message)googleApi);
    }

    public final void zaw(MethodInvocation methodInvocation, int n3, long l2, int n4) {
        zace zace2 = new zace(methodInvocation, n3, l2, n4);
        methodInvocation = this.zar.obtainMessage(18, (Object)zace2);
        this.zar.sendMessage((Message)methodInvocation);
    }

    public final void zax(ConnectionResult connectionResult, int n3) {
        boolean bl2 = this.zaE(connectionResult, n3);
        if (!bl2) {
            Handler handler = this.zar;
            int n4 = 5;
            connectionResult = handler.obtainMessage(n4, n3, 0, (Object)connectionResult);
            handler.sendMessage((Message)connectionResult);
        }
    }

    public final void zay() {
        Handler handler = this.zar;
        Message message = handler.obtainMessage(3);
        handler.sendMessage(message);
    }

    public final void zaz(GoogleApi googleApi) {
        Handler handler = this.zar;
        googleApi = handler.obtainMessage(7, (Object)googleApi);
        handler.sendMessage((Message)googleApi);
    }
}

