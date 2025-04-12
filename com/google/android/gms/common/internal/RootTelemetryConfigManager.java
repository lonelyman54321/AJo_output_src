/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

public final class RootTelemetryConfigManager {
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb;
    private RootTelemetryConfiguration zzc;

    static {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        zzb = rootTelemetryConfiguration = new RootTelemetryConfiguration(0, false, false, 0, 0);
    }

    private RootTelemetryConfigManager() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static RootTelemetryConfigManager getInstance() {
        Class<RootTelemetryConfigManager> clazz = RootTelemetryConfigManager.class;
        synchronized (clazz) {
            try {
                RootTelemetryConfigManager rootTelemetryConfigManager = zza;
                if (rootTelemetryConfigManager != null) return zza;
                zza = rootTelemetryConfigManager = new RootTelemetryConfigManager();
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(RootTelemetryConfiguration var1_1) {
        synchronized (this) {
            block5: {
                block4: {
                    if (var1_1 != null) break block4;
                    try {
                        this.zzc = var1_1 = RootTelemetryConfigManager.zzb;
                        return;
                    }
                    catch (Throwable var1_2) {
                        break block5;
                    }
                }
                var2_3 = this.zzc;
                if (var2_3 == null || (var3_4 = var2_3.getVersion()) < (var4_5 = var1_1.getVersion())) ** GOTO lbl-1000
                return;
lbl-1000:
                // 1 sources

                {
                    this.zzc = var1_1;
                    return;
                }
            }
            throw var1_2;
        }
    }
}

