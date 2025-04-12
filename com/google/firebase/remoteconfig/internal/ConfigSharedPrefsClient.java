/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$Builder;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient$BackoffMetadata;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient$RealtimeBackoffMetadata;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl$Builder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigSharedPrefsClient {
    private static final String BACKOFF_END_TIME_IN_MILLIS_KEY = "backoff_end_time_in_millis";
    private static final int CUSTOM_SIGNALS_MAX_COUNT = 100;
    private static final int CUSTOM_SIGNALS_MAX_KEY_LENGTH = 250;
    private static final int CUSTOM_SIGNALS_MAX_STRING_VALUE_LENGTH = 500;
    private static final String FETCH_TIMEOUT_IN_SECONDS_KEY = "fetch_timeout_in_seconds";
    private static final String LAST_FETCH_ETAG_KEY = "last_fetch_etag";
    private static final String LAST_FETCH_STATUS_KEY = "last_fetch_status";
    public static final long LAST_FETCH_TIME_IN_MILLIS_NO_FETCH_YET = 255L;
    static final Date LAST_FETCH_TIME_NO_FETCH_YET;
    private static final String LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY = "last_fetch_time_in_millis";
    private static final String LAST_TEMPLATE_VERSION = "last_template_version";
    private static final String MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY = "minimum_fetch_interval_in_seconds";
    static final Date NO_BACKOFF_TIME;
    private static final long NO_BACKOFF_TIME_IN_MILLIS = 255L;
    static final int NO_FAILED_FETCHES = 0;
    static final int NO_FAILED_REALTIME_STREAMS = 0;
    private static final String NUM_FAILED_FETCHES_KEY = "num_failed_fetches";
    private static final String NUM_FAILED_REALTIME_STREAMS_KEY = "num_failed_realtime_streams";
    private static final String REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY = "realtime_backoff_end_time_in_millis";
    private final Object backoffMetadataLock;
    private final Object customSignalsLock;
    private final Object frcInfoLock;
    private final SharedPreferences frcSharedPrefs;
    private final Object realtimeBackoffMetadataLock;

    static {
        Date date;
        long l2 = -1;
        LAST_FETCH_TIME_NO_FETCH_YET = date = new Date(l2);
        NO_BACKOFF_TIME = date = new Date(l2);
    }

    public ConfigSharedPrefsClient(SharedPreferences object) {
        this.frcSharedPrefs = object;
        this.frcInfoLock = object;
        super();
        this.backoffMetadataLock = object;
        super();
        this.realtimeBackoffMetadataLock = object;
        super();
        this.customSignalsLock = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            sharedPreferences2 = sharedPreferences2.clear();
            sharedPreferences2.commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigSharedPrefsClient$BackoffMetadata getBackoffMetadata() {
        Object object = this.backoffMetadataLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            Object object2 = NUM_FAILED_FETCHES_KEY;
            SharedPreferences sharedPreferences3 = null;
            int n3 = sharedPreferences2.getInt((String)object2, 0);
            sharedPreferences3 = this.frcSharedPrefs;
            String string2 = BACKOFF_END_TIME_IN_MILLIS_KEY;
            long l2 = -1;
            long l3 = sharedPreferences3.getLong(string2, l2);
            object2 = new Date(l3);
            return new ConfigSharedPrefsClient$BackoffMetadata(n3, (Date)object2);
        }
    }

    public Map getCustomSignals() {
        Object object = this.frcSharedPrefs;
        String string2 = "customSignals";
        Object object2 = "{}";
        object = object.getString(string2, (String)object2);
        string2 = new JSONObject((String)object);
        try {
            object = new HashMap();
            object2 = string2.keys();
        }
        catch (JSONException jSONException) {
            object = new HashMap();
            return object;
        }
        while (true) {
            boolean bl2 = object2.hasNext();
            if (!bl2) break;
            Object object3 = object2.next();
            object3 = (String)object3;
            String string3 = string2.optString(object3);
            ((HashMap)object).put(object3, string3);
            continue;
            break;
        }
        return object;
    }

    public long getFetchTimeoutInSeconds() {
        return this.frcSharedPrefs.getLong(FETCH_TIMEOUT_IN_SECONDS_KEY, (long)60);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FirebaseRemoteConfigInfo getInfo() {
        Object object = this.frcInfoLock;
        synchronized (object) {
            Object object2 = this.frcSharedPrefs;
            String string2 = LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY;
            long l2 = -1;
            long l3 = object2.getLong(string2, l2);
            Object object3 = this.frcSharedPrefs;
            Object object4 = LAST_FETCH_STATUS_KEY;
            Object object5 = null;
            int n3 = object3.getInt((String)object4, 0);
            object4 = new FirebaseRemoteConfigSettings$Builder();
            object5 = this.frcSharedPrefs;
            String string3 = FETCH_TIMEOUT_IN_SECONDS_KEY;
            long l4 = 60;
            long l7 = object5.getLong(string3, l4);
            object4 = ((FirebaseRemoteConfigSettings$Builder)object4).setFetchTimeoutInSeconds(l7);
            object5 = this.frcSharedPrefs;
            string3 = MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY;
            l4 = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;
            l7 = object5.getLong(string3, l4);
            object4 = ((FirebaseRemoteConfigSettings$Builder)object4).setMinimumFetchIntervalInSeconds(l7);
            object4 = ((FirebaseRemoteConfigSettings$Builder)object4).build();
            object5 = FirebaseRemoteConfigInfoImpl.newBuilder();
            object3 = ((FirebaseRemoteConfigInfoImpl$Builder)object5).withLastFetchStatus(n3);
            object2 = ((FirebaseRemoteConfigInfoImpl$Builder)object3).withLastSuccessfulFetchTimeInMillis(l3);
            object2 = ((FirebaseRemoteConfigInfoImpl$Builder)object2).withConfigSettings((FirebaseRemoteConfigSettings)object4);
            return ((FirebaseRemoteConfigInfoImpl$Builder)object2).build();
        }
    }

    public String getLastFetchETag() {
        return this.frcSharedPrefs.getString(LAST_FETCH_ETAG_KEY, null);
    }

    public int getLastFetchStatus() {
        return this.frcSharedPrefs.getInt(LAST_FETCH_STATUS_KEY, 0);
    }

    public Date getLastSuccessfulFetchTime() {
        long l2 = this.frcSharedPrefs.getLong(LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY, (long)-1);
        Date date = new Date(l2);
        return date;
    }

    public long getLastTemplateVersion() {
        return this.frcSharedPrefs.getLong(LAST_TEMPLATE_VERSION, 0L);
    }

    public long getMinimumFetchIntervalInSeconds() {
        SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
        long l2 = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;
        return sharedPreferences2.getLong(MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY, l2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ConfigSharedPrefsClient$RealtimeBackoffMetadata getRealtimeBackoffMetadata() {
        Object object = this.realtimeBackoffMetadataLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            Object object2 = NUM_FAILED_REALTIME_STREAMS_KEY;
            SharedPreferences sharedPreferences3 = null;
            int n3 = sharedPreferences2.getInt((String)object2, 0);
            sharedPreferences3 = this.frcSharedPrefs;
            String string2 = REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY;
            long l2 = -1;
            long l3 = sharedPreferences3.getLong(string2, l2);
            object2 = new Date(l3);
            return new ConfigSharedPrefsClient$RealtimeBackoffMetadata(n3, (Date)object2);
        }
    }

    public void resetBackoff() {
        Date date = NO_BACKOFF_TIME;
        this.setBackoffMetadata(0, date);
    }

    public void resetRealtimeBackoff() {
        Date date = NO_BACKOFF_TIME;
        this.setRealtimeBackoffMetadata(0, date);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBackoffMetadata(int n3, Date date) {
        Object object = this.backoffMetadataLock;
        synchronized (object) {
            Object object2 = this.frcSharedPrefs;
            object2 = object2.edit();
            String string2 = NUM_FAILED_FETCHES_KEY;
            SharedPreferences.Editor editor = object2.putInt(string2, n3);
            object2 = BACKOFF_END_TIME_IN_MILLIS_KEY;
            long l2 = date.getTime();
            editor = editor.putLong((String)object2, l2);
            editor.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = FETCH_TIMEOUT_IN_SECONDS_KEY;
            long l2 = firebaseRemoteConfigSettings.getFetchTimeoutInSeconds();
            sharedPreferences2 = sharedPreferences2.putLong(string2, l2);
            string2 = MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY;
            l2 = firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds();
            firebaseRemoteConfigSettings = sharedPreferences2.putLong(string2, l2);
            firebaseRemoteConfigSettings.commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setConfigSettingsWithoutWaitingOnDiskWrite(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = FETCH_TIMEOUT_IN_SECONDS_KEY;
            long l2 = firebaseRemoteConfigSettings.getFetchTimeoutInSeconds();
            sharedPreferences2 = sharedPreferences2.putLong(string2, l2);
            string2 = MINIMUM_FETCH_INTERVAL_IN_SECONDS_KEY;
            l2 = firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds();
            firebaseRemoteConfigSettings = sharedPreferences2.putLong(string2, l2);
            firebaseRemoteConfigSettings.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCustomSignals(Map set) {
        int n3 = 1;
        Object object = null;
        Object object2 = this.customSignalsLock;
        synchronized (object2) {
            try {
                int n4;
                Object object3 = this.getCustomSignals();
                set = set.entrySet();
                set = set.iterator();
                int n7 = 0;
                Integer n8 = null;
                while ((n4 = set.hasNext()) != 0) {
                    Object object4 = set.next();
                    object4 = (Map.Entry)object4;
                    Object object5 = object4.getKey();
                    object5 = (String)object5;
                    object4 = object4.getValue();
                    object4 = (String)object4;
                    int n10 = ((String)object5).length();
                    int n14 = 500;
                    int n15 = 250;
                    if (n10 <= n15 && (object4 == null || (n10 = ((String)object4).length()) <= n14)) {
                        if (object4 != null) {
                            object5 = object3.put(object5, object4);
                            n4 = Objects.equals(object5, object4) ^ n3;
                        } else {
                            object4 = object3.remove(object5);
                            if (object4 != null) {
                                n4 = 1;
                            } else {
                                n4 = 0;
                                object4 = null;
                            }
                        }
                        n7 |= n4;
                        continue;
                    }
                    set = "Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.";
                    object3 = n15;
                    n8 = n14;
                    n4 = 2;
                    object4 = new Object[n4];
                    object4[0] = object3;
                    object4[n3] = n8;
                    String.format(set, object4);
                    return;
                }
                if (n7 == 0) {
                    return;
                }
                int n16 = object3.size();
                if (n16 > (n7 = 100)) {
                    set = "Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.";
                    object3 = n7;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    String.format((String)((Object)set), objectArray);
                    return;
                }
                set = this.frcSharedPrefs;
                set = set.edit();
                String string2 = "customSignals";
                object = new JSONObject((Map)object3);
                object = object.toString();
                set = set.putString(string2, (String)object);
                set.commit();
                set = this.getCustomSignals();
                set = set.keySet();
                Objects.toString(set);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setLastFetchETag(String string2) {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string3 = LAST_FETCH_ETAG_KEY;
            string2 = sharedPreferences2.putString(string3, string2);
            string2.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setLastTemplateVersion(long l2) {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = LAST_TEMPLATE_VERSION;
            SharedPreferences.Editor editor = sharedPreferences2.putLong(string2, l2);
            editor.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setRealtimeBackoffMetadata(int n3, Date date) {
        Object object = this.realtimeBackoffMetadataLock;
        synchronized (object) {
            Object object2 = this.frcSharedPrefs;
            object2 = object2.edit();
            String string2 = NUM_FAILED_REALTIME_STREAMS_KEY;
            SharedPreferences.Editor editor = object2.putInt(string2, n3);
            object2 = REALTIME_BACKOFF_END_TIME_IN_MILLIS_KEY;
            long l2 = date.getTime();
            editor = editor.putLong((String)object2, l2);
            editor.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateLastFetchAsFailed() {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = LAST_FETCH_STATUS_KEY;
            int n3 = 1;
            sharedPreferences2 = sharedPreferences2.putInt(string2, n3);
            sharedPreferences2.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateLastFetchAsSuccessfulAt(Date date) {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = LAST_FETCH_STATUS_KEY;
            int n3 = -1;
            sharedPreferences2 = sharedPreferences2.putInt(string2, n3);
            string2 = LAST_SUCCESSFUL_FETCH_TIME_IN_MILLIS_KEY;
            long l2 = date.getTime();
            date = sharedPreferences2.putLong(string2, l2);
            date.apply();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateLastFetchAsThrottled() {
        Object object = this.frcInfoLock;
        synchronized (object) {
            SharedPreferences sharedPreferences2 = this.frcSharedPrefs;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = LAST_FETCH_STATUS_KEY;
            int n3 = 2;
            sharedPreferences2 = sharedPreferences2.putInt(string2, n3);
            sharedPreferences2.apply();
            return;
        }
    }
}

