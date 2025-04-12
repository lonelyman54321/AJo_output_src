/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.config.ConfigurationConstants$CollectionDeactivated;
import com.google.firebase.perf.config.ConfigurationConstants$CollectionEnabled;
import com.google.firebase.perf.config.ConfigurationConstants$ExperimentTTID;
import com.google.firebase.perf.config.ConfigurationConstants$FragmentSamplingRate;
import com.google.firebase.perf.config.ConfigurationConstants$LogSourceName;
import com.google.firebase.perf.config.ConfigurationConstants$NetworkEventCountBackground;
import com.google.firebase.perf.config.ConfigurationConstants$NetworkEventCountForeground;
import com.google.firebase.perf.config.ConfigurationConstants$NetworkRequestSamplingRate;
import com.google.firebase.perf.config.ConfigurationConstants$RateLimitSec;
import com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions;
import com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsMaxDurationMinutes;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs;
import com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate;
import com.google.firebase.perf.config.ConfigurationConstants$TraceEventCountBackground;
import com.google.firebase.perf.config.ConfigurationConstants$TraceEventCountForeground;
import com.google.firebase.perf.config.ConfigurationConstants$TraceSamplingRate;
import com.google.firebase.perf.config.ConfigurationFlag;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

public class ConfigResolver {
    private static volatile ConfigResolver instance;
    private static final AndroidLogger logger;
    private DeviceCacheManager deviceCacheManager;
    private ImmutableBundle metadataBundle;
    private final RemoteConfigManager remoteConfigManager;

    static {
        logger = AndroidLogger.getInstance();
    }

    public ConfigResolver(RemoteConfigManager remoteConfigManager, ImmutableBundle immutableBundle, DeviceCacheManager deviceCacheManager) {
        if (remoteConfigManager == null) {
            remoteConfigManager = RemoteConfigManager.getInstance();
        }
        this.remoteConfigManager = remoteConfigManager;
        if (immutableBundle == null) {
            immutableBundle = new ImmutableBundle();
        }
        this.metadataBundle = immutableBundle;
        if (deviceCacheManager == null) {
            deviceCacheManager = DeviceCacheManager.getInstance();
        }
        this.deviceCacheManager = deviceCacheManager;
    }

    public static void clearInstance() {
        instance = null;
    }

    private Optional getDeviceCacheBoolean(ConfigurationFlag object) {
        DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
        object = ((ConfigurationFlag)object).getDeviceCacheFlag();
        return deviceCacheManager.getBoolean((String)object);
    }

    private Optional getDeviceCacheDouble(ConfigurationFlag object) {
        DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
        object = ((ConfigurationFlag)object).getDeviceCacheFlag();
        return deviceCacheManager.getDouble((String)object);
    }

    private Optional getDeviceCacheLong(ConfigurationFlag object) {
        DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
        object = ((ConfigurationFlag)object).getDeviceCacheFlag();
        return deviceCacheManager.getLong((String)object);
    }

    private Optional getDeviceCacheString(ConfigurationFlag object) {
        DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
        object = ((ConfigurationFlag)object).getDeviceCacheFlag();
        return deviceCacheManager.getString((String)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ConfigResolver getInstance() {
        Class<ConfigResolver> clazz = ConfigResolver.class;
        synchronized (clazz) {
            try {
                ConfigResolver configResolver = instance;
                if (configResolver != null) return instance;
                instance = configResolver = new ConfigResolver(null, null, null);
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private boolean getIsSdkEnabled() {
        Object object = ConfigurationConstants$SdkEnabled.getInstance();
        Object object2 = this.getDeviceCacheBoolean((ConfigurationFlag)object);
        Object object3 = this.getRemoteConfigBoolean((ConfigurationFlag)object);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2) {
            RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
            bl2 = remoteConfigManager.isLastFetchFailed();
            if (bl2) {
                return false;
            }
            object3 = (Boolean)((Optional)object3).get();
            if (object2 == null || !(bl2 = ((Optional)object2).isAvailable()) || (object2 = ((Optional)object2).get()) != object3) {
                object2 = this.deviceCacheManager;
                object = ((ConfigurationConstants$SdkEnabled)object).getDeviceCacheFlag();
                bl2 = (Boolean)object3;
                ((DeviceCacheManager)object2).setValue((String)object, bl2);
            }
            return (Boolean)object3;
        }
        boolean bl3 = ((Optional)object2).isAvailable();
        if (bl3) {
            return (Boolean)((Optional)object2).get();
        }
        return ((ConfigurationConstants$SdkEnabled)object).getDefault();
    }

    private boolean getIsSdkVersionDisabled() {
        Object object = ConfigurationConstants$SdkDisabledVersions.getInstance();
        Object object2 = this.getDeviceCacheString((ConfigurationFlag)object);
        Object object3 = this.getRemoteConfigString((ConfigurationFlag)object);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2) {
            boolean bl3;
            object3 = (String)((Optional)object3).get();
            if (object2 == null || !(bl2 = ((Optional)object2).isAvailable()) || !(bl3 = ((String)(object2 = (String)((Optional)object2).get())).equals(object3))) {
                object2 = this.deviceCacheManager;
                object = ((ConfigurationConstants$SdkDisabledVersions)object).getDeviceCacheFlag();
                ((DeviceCacheManager)object2).setValue((String)object, (String)object3);
            }
            return this.isFireperfSdkVersionInList((String)object3);
        }
        boolean bl4 = ((Optional)object2).isAvailable();
        if (bl4) {
            object = (String)((Optional)object2).get();
            return this.isFireperfSdkVersionInList((String)object);
        }
        object = ((ConfigurationConstants$SdkDisabledVersions)object).getDefault();
        return this.isFireperfSdkVersionInList((String)object);
    }

    private Optional getMetadataBoolean(ConfigurationFlag object) {
        ImmutableBundle immutableBundle = this.metadataBundle;
        object = ((ConfigurationFlag)object).getMetadataFlag();
        return immutableBundle.getBoolean((String)object);
    }

    private Optional getMetadataDouble(ConfigurationFlag object) {
        ImmutableBundle immutableBundle = this.metadataBundle;
        object = ((ConfigurationFlag)object).getMetadataFlag();
        return immutableBundle.getDouble((String)object);
    }

    private Optional getMetadataLong(ConfigurationFlag object) {
        ImmutableBundle immutableBundle = this.metadataBundle;
        object = ((ConfigurationFlag)object).getMetadataFlag();
        return immutableBundle.getLong((String)object);
    }

    private Optional getRemoteConfigBoolean(ConfigurationFlag object) {
        RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
        object = ((ConfigurationFlag)object).getRemoteConfigFlag();
        return remoteConfigManager.getBoolean((String)object);
    }

    private Optional getRemoteConfigDouble(ConfigurationFlag object) {
        RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
        object = ((ConfigurationFlag)object).getRemoteConfigFlag();
        return remoteConfigManager.getDouble((String)object);
    }

    private Optional getRemoteConfigLong(ConfigurationFlag object) {
        RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
        object = ((ConfigurationFlag)object).getRemoteConfigFlag();
        return remoteConfigManager.getLong((String)object);
    }

    private Optional getRemoteConfigString(ConfigurationFlag object) {
        RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
        object = ((ConfigurationFlag)object).getRemoteConfigFlag();
        return remoteConfigManager.getString((String)object);
    }

    private Long getRemoteConfigValue(ConfigurationFlag object) {
        String string2 = ((ConfigurationFlag)object).getRemoteConfigFlag();
        if (string2 == null) {
            object = (Long)((ConfigurationFlag)object).getDefault();
        } else {
            RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
            object = (Long)((ConfigurationFlag)object).getDefault();
            object = (Long)remoteConfigManager.getRemoteConfigValueOrDefault(string2, object);
        }
        return object;
    }

    private boolean isEventCountValid(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private boolean isFireperfSdkVersionInList(String stringArray) {
        String string2 = stringArray.trim();
        int n3 = string2.isEmpty();
        if (n3 != 0) {
            return false;
        }
        string2 = ";";
        stringArray = stringArray.split(string2);
        n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3;
            String string4 = stringArray[i3].trim();
            boolean bl2 = string4.equals(string3 = BuildConfig.FIREPERF_VERSION_NAME);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private boolean isGaugeCaptureFrequencyMsValid(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private boolean isSamplingRateValid(double d2) {
        double d5;
        double d7 = 0.0;
        double d9 = d7 - d2;
        Object object = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
        boolean bl2 = object <= 0 && (object = (d5 = d2 - (d7 = 1.0)) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) <= 0;
        return bl2;
    }

    private boolean isSessionsMaxDurationMinutesValid(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    private boolean isTimeRangeSecValid(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object > 0;
        return bl2;
    }

    public String getAndCacheLogSourceName() {
        Object object;
        ConfigurationConstants$LogSourceName configurationConstants$LogSourceName = ConfigurationConstants$LogSourceName.getInstance();
        Object object2 = BuildConfig.ENFORCE_DEFAULT_LOG_SRC;
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            return configurationConstants$LogSourceName.getDefault();
        }
        object2 = configurationConstants$LogSourceName.getRemoteConfigFlag();
        long l2 = -1;
        if (object2 != null) {
            RemoteConfigManager remoteConfigManager = this.remoteConfigManager;
            object = l2;
            object2 = (Long)remoteConfigManager.getRemoteConfigValueOrDefault((String)object2, object);
            l2 = (Long)object2;
        }
        object2 = configurationConstants$LogSourceName.getDeviceCacheFlag();
        boolean bl3 = ConfigurationConstants$LogSourceName.isLogSourceKnown(l2);
        if (bl3 && (object = ConfigurationConstants$LogSourceName.getLogSourceName(l2)) != null) {
            this.deviceCacheManager.setValue((String)object2, (String)object);
            return object;
        }
        object2 = this.getDeviceCacheString(configurationConstants$LogSourceName);
        boolean bl4 = ((Optional)object2).isAvailable();
        if (bl4) {
            return (String)((Optional)object2).get();
        }
        return configurationConstants$LogSourceName.getDefault();
    }

    public double getFragmentSamplingRate() {
        Object object;
        double d2;
        double d5;
        Object object2 = ConfigurationConstants$FragmentSamplingRate.getInstance();
        Object object3 = this.getMetadataDouble((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2) {
            object3 = (Double)((Optional)object3).get();
            double d7 = (Double)object3;
            d5 = 100.0;
            boolean bl3 = this.isSamplingRateValid(d7 /= d5);
            if (bl3) {
                return d7;
            }
        }
        if ((bl2 = ((Optional)(object3 = this.getRemoteConfigDouble((ConfigurationFlag)object2))).isAvailable()) && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$FragmentSamplingRate)object2).getDeviceCacheFlag();
            d5 = (Double)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, d5);
            return (Double)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheDouble((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            return (Double)((Optional)object3).get();
        }
        return ((ConfigurationConstants$FragmentSamplingRate)object2).getDefault();
    }

    public boolean getIsExperimentTTIDEnabled() {
        Object object = ConfigurationConstants$ExperimentTTID.getInstance();
        Optional optional = this.getMetadataBoolean((ConfigurationFlag)object);
        boolean bl2 = optional.isAvailable();
        if (bl2) {
            return (Boolean)optional.get();
        }
        optional = this.getRemoteConfigBoolean((ConfigurationFlag)object);
        bl2 = optional.isAvailable();
        if (bl2) {
            DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
            object = ((ConfigurationConstants$ExperimentTTID)object).getDeviceCacheFlag();
            boolean bl3 = (Boolean)optional.get();
            deviceCacheManager.setValue((String)object, bl3);
            return (Boolean)optional.get();
        }
        optional = this.getDeviceCacheBoolean((ConfigurationFlag)object);
        bl2 = optional.isAvailable();
        if (bl2) {
            return (Boolean)optional.get();
        }
        return ((ConfigurationConstants$ExperimentTTID)object).getDefault();
    }

    public Boolean getIsPerformanceCollectionDeactivated() {
        ConfigurationConstants$CollectionDeactivated configurationConstants$CollectionDeactivated = ConfigurationConstants$CollectionDeactivated.getInstance();
        Optional optional = this.getMetadataBoolean(configurationConstants$CollectionDeactivated);
        boolean bl2 = optional.isAvailable();
        if (bl2) {
            return (Boolean)optional.get();
        }
        return configurationConstants$CollectionDeactivated.getDefault();
    }

    public Boolean getIsPerformanceCollectionEnabled() {
        Object object = this.getIsPerformanceCollectionDeactivated();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return Boolean.FALSE;
        }
        object = ConfigurationConstants$CollectionEnabled.getInstance();
        Optional optional = this.getDeviceCacheBoolean((ConfigurationFlag)object);
        boolean bl3 = optional.isAvailable();
        if (bl3) {
            return (Boolean)optional.get();
        }
        boolean bl4 = ((Optional)(object = this.getMetadataBoolean((ConfigurationFlag)object))).isAvailable();
        if (bl4) {
            return (Boolean)((Optional)object).get();
        }
        return null;
    }

    public boolean getIsServiceCollectionEnabled() {
        boolean bl2 = this.getIsSdkEnabled();
        bl2 = bl2 && !(bl2 = this.getIsSdkVersionDisabled());
        return bl2;
    }

    public long getNetworkEventCountBackground() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$NetworkEventCountBackground.getInstance();
        Optional optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$NetworkEventCountBackground)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$NetworkEventCountBackground)object2).getDefault();
    }

    public long getNetworkEventCountForeground() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$NetworkEventCountForeground.getInstance();
        Optional optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$NetworkEventCountForeground)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$NetworkEventCountForeground)object2).getDefault();
    }

    public double getNetworkRequestSamplingRate() {
        Object object;
        double d2;
        Object object2 = ConfigurationConstants$NetworkRequestSamplingRate.getInstance();
        Object object3 = this.getRemoteConfigDouble((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$NetworkRequestSamplingRate)object2).getDeviceCacheFlag();
            double d5 = (Double)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, d5);
            return (Double)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheDouble((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            return (Double)((Optional)object3).get();
        }
        object3 = this.remoteConfigManager;
        boolean bl3 = ((RemoteConfigManager)object3).isLastFetchFailed();
        if (bl3) {
            return ((ConfigurationConstants$NetworkRequestSamplingRate)object2).getDefaultOnRcFetchFail();
        }
        return ((ConfigurationConstants$NetworkRequestSamplingRate)object2).getDefault();
    }

    public long getRateLimitSec() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$RateLimitSec.getInstance();
        Optional optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isTimeRangeSecValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$RateLimitSec)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isTimeRangeSecValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$RateLimitSec)object2).getDefault();
    }

    public long getSessionsCpuCaptureFrequencyBackgroundMs() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getInstance();
        Optional optional = this.getMetadataLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs)object2).getDefault();
    }

    public long getSessionsCpuCaptureFrequencyForegroundMs() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getInstance();
        Object object3 = this.getMetadataLong((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            return (Long)((Optional)object3).get();
        }
        object3 = this.getRemoteConfigLong((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs)object2).getDeviceCacheFlag();
            long l3 = (Long)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            return (Long)((Optional)object3).get();
        }
        object3 = this.remoteConfigManager;
        boolean bl3 = ((RemoteConfigManager)object3).isLastFetchFailed();
        if (bl3) {
            return ((ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs)object2).getDefaultOnRcFetchFail();
        }
        return ((ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs)object2).getDefault();
    }

    public long getSessionsMaxDurationMinutes() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$SessionsMaxDurationMinutes.getInstance();
        Optional optional = this.getMetadataLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isSessionsMaxDurationMinutesValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isSessionsMaxDurationMinutesValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsMaxDurationMinutes)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isSessionsMaxDurationMinutesValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$SessionsMaxDurationMinutes)object2).getDefault();
    }

    public long getSessionsMemoryCaptureFrequencyBackgroundMs() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs.getInstance();
        Optional optional = this.getMetadataLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs)object2).getDefault();
    }

    public long getSessionsMemoryCaptureFrequencyForegroundMs() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs.getInstance();
        Object object3 = this.getMetadataLong((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            return (Long)((Optional)object3).get();
        }
        object3 = this.getRemoteConfigLong((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs)object2).getDeviceCacheFlag();
            long l3 = (Long)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isGaugeCaptureFrequencyMsValid(l2 = ((Long)(object = (Long)((Optional)object3).get())).longValue()))) {
            return (Long)((Optional)object3).get();
        }
        object3 = this.remoteConfigManager;
        boolean bl3 = ((RemoteConfigManager)object3).isLastFetchFailed();
        if (bl3) {
            return ((ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs)object2).getDefaultOnRcFetchFail();
        }
        return ((ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs)object2).getDefault();
    }

    public double getSessionsSamplingRate() {
        Object object;
        double d2;
        double d5;
        Object object2 = ConfigurationConstants$SessionsSamplingRate.getInstance();
        Object object3 = this.getMetadataDouble((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2) {
            object3 = (Double)((Optional)object3).get();
            double d7 = (Double)object3;
            d5 = 100.0;
            boolean bl3 = this.isSamplingRateValid(d7 /= d5);
            if (bl3) {
                return d7;
            }
        }
        if ((bl2 = ((Optional)(object3 = this.getRemoteConfigDouble((ConfigurationFlag)object2))).isAvailable()) && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$SessionsSamplingRate)object2).getDeviceCacheFlag();
            d5 = (Double)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, d5);
            return (Double)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheDouble((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            return (Double)((Optional)object3).get();
        }
        object3 = this.remoteConfigManager;
        boolean bl4 = ((RemoteConfigManager)object3).isLastFetchFailed();
        if (bl4) {
            return ((ConfigurationConstants$SessionsSamplingRate)object2).getDefaultOnRcFetchFail();
        }
        return ((ConfigurationConstants$SessionsSamplingRate)object2).getDefault();
    }

    public long getTraceEventCountBackground() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$TraceEventCountBackground.getInstance();
        Optional optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$TraceEventCountBackground)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$TraceEventCountBackground)object2).getDefault();
    }

    public long getTraceEventCountForeground() {
        Object object;
        long l2;
        Object object2 = ConfigurationConstants$TraceEventCountForeground.getInstance();
        Optional optional = this.getRemoteConfigLong((ConfigurationFlag)object2);
        boolean bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$TraceEventCountForeground)object2).getDeviceCacheFlag();
            long l3 = (Long)optional.get();
            ((DeviceCacheManager)object).setValue((String)object2, l3);
            return (Long)optional.get();
        }
        optional = this.getDeviceCacheLong((ConfigurationFlag)object2);
        bl2 = optional.isAvailable();
        if (bl2 && (bl2 = this.isEventCountValid(l2 = ((Long)(object = (Long)optional.get())).longValue()))) {
            return (Long)optional.get();
        }
        return ((ConfigurationConstants$TraceEventCountForeground)object2).getDefault();
    }

    public double getTraceSamplingRate() {
        Object object;
        double d2;
        Object object2 = ConfigurationConstants$TraceSamplingRate.getInstance();
        Object object3 = this.getRemoteConfigDouble((ConfigurationFlag)object2);
        boolean bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            object = this.deviceCacheManager;
            object2 = ((ConfigurationConstants$TraceSamplingRate)object2).getDeviceCacheFlag();
            double d5 = (Double)((Optional)object3).get();
            ((DeviceCacheManager)object).setValue((String)object2, d5);
            return (Double)((Optional)object3).get();
        }
        object3 = this.getDeviceCacheDouble((ConfigurationFlag)object2);
        bl2 = ((Optional)object3).isAvailable();
        if (bl2 && (bl2 = this.isSamplingRateValid(d2 = ((Double)(object = (Double)((Optional)object3).get())).doubleValue()))) {
            return (Double)((Optional)object3).get();
        }
        object3 = this.remoteConfigManager;
        boolean bl3 = ((RemoteConfigManager)object3).isLastFetchFailed();
        if (bl3) {
            return ((ConfigurationConstants$TraceSamplingRate)object2).getDefaultOnRcFetchFail();
        }
        return ((ConfigurationConstants$TraceSamplingRate)object2).getDefault();
    }

    public boolean isCollectionEnabledConfigValueAvailable() {
        boolean bl2;
        Object object = ConfigurationConstants$SdkEnabled.getInstance();
        object = this.getRemoteConfigBoolean((ConfigurationFlag)object);
        Object object2 = ConfigurationConstants$CollectionEnabled.getInstance();
        boolean bl3 = ((Optional)(object2 = this.getDeviceCacheBoolean((ConfigurationFlag)object2))).isAvailable();
        if (!bl3 && !(bl2 = ((Optional)object).isAvailable())) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isPerformanceMonitoringEnabled() {
        boolean bl2;
        Boolean bl3 = this.getIsPerformanceCollectionEnabled();
        boolean bl4 = true;
        if (bl3 != null && (bl2 = bl3.booleanValue()) != bl4 || !(bl2 = this.getIsServiceCollectionEnabled())) {
            bl4 = false;
        }
        return bl4;
    }

    public void setApplicationContext(Context context) {
        AndroidLogger androidLogger = logger;
        boolean bl2 = Utils.isDebugLoggingEnabled(context);
        androidLogger.setLogcatEnabled(bl2);
        this.deviceCacheManager.setContext(context);
    }

    public void setContentProviderContext(Context context) {
        context = context.getApplicationContext();
        this.setApplicationContext(context);
    }

    public void setDeviceCacheManager(DeviceCacheManager deviceCacheManager) {
        this.deviceCacheManager = deviceCacheManager;
    }

    public void setIsPerformanceCollectionEnabled(Boolean object) {
        Object object2 = this.getIsPerformanceCollectionDeactivated();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            return;
        }
        object2 = ConfigurationConstants$CollectionEnabled.getInstance().getDeviceCacheFlag();
        if (object2 != null) {
            if (object != null) {
                DeviceCacheManager deviceCacheManager = this.deviceCacheManager;
                Boolean bl3 = Boolean.TRUE;
                boolean bl4 = bl3.equals(object);
                deviceCacheManager.setValue((String)object2, bl4);
            } else {
                object = this.deviceCacheManager;
                ((DeviceCacheManager)object).clear((String)object2);
            }
        }
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
        this.metadataBundle = immutableBundle;
    }
}

