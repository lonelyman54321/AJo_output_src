/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl$1;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.zza;
import com.google.firebase.analytics.connector.zzb;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsConnectorImpl
implements AnalyticsConnector {
    private static volatile AnalyticsConnector zzb;
    final Map zza;
    private final AppMeasurementSdk zzc;

    private AnalyticsConnectorImpl(AppMeasurementSdk concurrentHashMap) {
        Preconditions.checkNotNull(concurrentHashMap);
        this.zzc = concurrentHashMap;
        this.zza = concurrentHashMap = new ConcurrentHashMap();
    }

    public static AnalyticsConnector getInstance() {
        return AnalyticsConnectorImpl.getInstance(FirebaseApp.getInstance());
    }

    public static AnalyticsConnector getInstance(FirebaseApp firebaseApp) {
        return (AnalyticsConnector)firebaseApp.get(AnalyticsConnector.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AnalyticsConnector getInstance(FirebaseApp object, Context object2, Subscriber object3) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(object2);
        Preconditions.checkNotNull(object3);
        Preconditions.checkNotNull(object2.getApplicationContext());
        Object object4 = zzb;
        if (object4 != null) return zzb;
        object4 = AnalyticsConnectorImpl.class;
        synchronized (object4) {
            Throwable throwable2;
            block4: {
                AnalyticsConnector analyticsConnector;
                block3: {
                    try {
                        analyticsConnector = zzb;
                        if (analyticsConnector != null) return zzb;
                        int n3 = 1;
                        analyticsConnector = new Bundle(n3);
                        n3 = (int)(((FirebaseApp)object).isDefaultApp() ? 1 : 0);
                        if (n3 == 0) break block3;
                        Class<DataCollectionDefaultChange> clazz = DataCollectionDefaultChange.class;
                        zzb zzb2 = new zzb();
                        zza zza2 = new zza();
                        object3.subscribe(clazz, zzb2, zza2);
                        object3 = "dataCollectionDefaultEnabled";
                        boolean bl2 = ((FirebaseApp)object).isDataCollectionDefaultEnabled();
                        analyticsConnector.putBoolean((String)object3, bl2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object3 = null;
                object2 = zzed.zza((Context)object2, null, null, null, (Bundle)analyticsConnector);
                object2 = ((zzed)object2).zzb();
                zzb = object = new AnalyticsConnectorImpl((AppMeasurementSdk)object2);
                return zzb;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(Event object) {
        object = (DataCollectionDefaultChange)((Event)object).getPayload();
        boolean bl2 = ((DataCollectionDefaultChange)object).enabled;
        Class<AnalyticsConnectorImpl> clazz = AnalyticsConnectorImpl.class;
        synchronized (clazz) {
            Object object2 = zzb;
            object2 = Preconditions.checkNotNull(object2);
            object2 = (AnalyticsConnectorImpl)object2;
            object2 = ((AnalyticsConnectorImpl)object2).zzc;
            ((AppMeasurementSdk)object2).zza(bl2);
            return;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zza(AnalyticsConnectorImpl analyticsConnectorImpl, String string2) {
        return analyticsConnectorImpl.zza(string2);
    }

    private final boolean zza(String string2) {
        Map map2;
        boolean bl2 = string2.isEmpty();
        return !bl2 && (bl2 = (map2 = this.zza).containsKey(string2)) && (string2 = (map2 = this.zza).get(string2)) != null;
    }

    public void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        boolean bl2;
        if (string3 != null && !(bl2 = zzd.zza(string3, bundle))) {
            return;
        }
        this.zzc.clearConditionalUserProperty(string2, string3, bundle);
    }

    public List getConditionalUserProperties(String object, String object2) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        AppMeasurementSdk appMeasurementSdk = this.zzc;
        object = appMeasurementSdk.getConditionalUserProperties((String)object, (String)object2).iterator();
        while (bl2 = object.hasNext()) {
            object2 = zzd.zza((Bundle)object.next());
            arrayList.add(object2);
        }
        return arrayList;
    }

    public int getMaxUserProperties(String string2) {
        return this.zzc.getMaxUserProperties(string2);
    }

    public Map getUserProperties(boolean bl2) {
        return this.zzc.getUserProperties(null, null, bl2);
    }

    public void logEvent(String string2, String string3, Bundle bundle) {
        boolean bl2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!(bl2 = zzd.zzf(string2))) {
            return;
        }
        bl2 = zzd.zza(string3, bundle);
        if (!bl2) {
            return;
        }
        bl2 = zzd.zzb(string2, string3, bundle);
        if (!bl2) {
            return;
        }
        zzd.zza(string2, string3, bundle);
        this.zzc.logEvent(string2, string3, bundle);
    }

    public AnalyticsConnector$AnalyticsConnectorHandle registerAnalyticsConnectorListener(String string2, AnalyticsConnector$AnalyticsConnectorListener object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = zzd.zzf(string2);
        if (!bl2) {
            return null;
        }
        bl2 = this.zza(string2);
        if (bl2) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.zzc;
        Object object2 = "fiam";
        boolean bl3 = ((String)object2).equals(string2);
        if (bl3) {
            object2 = new zzc(appMeasurementSdk, (AnalyticsConnector$AnalyticsConnectorListener)object);
        } else {
            object2 = "clx";
            bl3 = ((String)object2).equals(string2);
            if (bl3) {
                object2 = new zze(appMeasurementSdk, (AnalyticsConnector$AnalyticsConnectorListener)object);
            } else {
                bl3 = false;
                object2 = null;
            }
        }
        if (object2 != null) {
            this.zza.put(string2, object2);
            object = new AnalyticsConnectorImpl$1(this, string2);
            return object;
        }
        return null;
    }

    public void setConditionalUserProperty(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        boolean bl2 = zzd.zzb(analyticsConnector$ConditionalUserProperty);
        if (!bl2) {
            return;
        }
        AppMeasurementSdk appMeasurementSdk = this.zzc;
        analyticsConnector$ConditionalUserProperty = zzd.zza(analyticsConnector$ConditionalUserProperty);
        appMeasurementSdk.setConditionalUserProperty((Bundle)analyticsConnector$ConditionalUserProperty);
    }

    public void setUserProperty(String string2, String string3, Object object) {
        boolean bl2 = zzd.zzf(string2);
        if (!bl2) {
            return;
        }
        bl2 = zzd.zza(string2, string3);
        if (!bl2) {
            return;
        }
        this.zzc.setUserProperty(string2, string3, object);
    }
}

