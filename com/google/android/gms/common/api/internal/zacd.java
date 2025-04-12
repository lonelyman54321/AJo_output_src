/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class zacd
implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(GoogleApiManager googleApiManager, int n3, ApiKey apiKey, long l2, long l3, String string2, String string3) {
        this.zaa = googleApiManager;
        this.zab = n3;
        this.zac = apiKey;
        this.zad = l2;
        this.zae = l3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static zacd zaa(GoogleApiManager googleApiManager, int n3, ApiKey apiKey) {
        zacd zacd2;
        long l2;
        long l3;
        int n4;
        Object object;
        Object object2;
        boolean bl2 = googleApiManager.zaD();
        if (!bl2) return null;
        AbstractSafeParcelable abstractSafeParcelable = RootTelemetryConfigManager.getInstance().getConfig();
        if (abstractSafeParcelable != null) {
            boolean bl3 = ((RootTelemetryConfiguration)abstractSafeParcelable).getMethodInvocationTelemetryEnabled();
            if (!bl3) return null;
            bl2 = ((RootTelemetryConfiguration)abstractSafeParcelable).getMethodTimingTelemetryEnabled();
            object2 = googleApiManager.zai(apiKey);
            if (object2 != null) {
                object = ((zabq)object2).zaf();
                boolean bl4 = object instanceof BaseGmsClient;
                if (!bl4) return null;
                object = (BaseGmsClient)((Object)((zabq)object2).zaf());
                n4 = (int)(((BaseGmsClient)object).hasConnectionInfo() ? 1 : 0);
                if (n4 != 0 && (n4 = (int)(((BaseGmsClient)object).isConnecting() ? 1 : 0)) == 0) {
                    abstractSafeParcelable = zacd.zab((zabq)object2, (BaseGmsClient)object, n3);
                    if (abstractSafeParcelable == null) return null;
                    ((zabq)object2).zaq();
                    bl2 = ((ConnectionTelemetryConfiguration)abstractSafeParcelable).getMethodTimingTelemetryEnabled();
                }
            }
        } else {
            bl2 = true;
        }
        long l4 = 0L;
        long l7 = bl2 ? (l3 = System.currentTimeMillis()) : l4;
        long l8 = bl2 ? (l2 = SystemClock.elapsedRealtime()) : l4;
        object2 = zacd2;
        object = googleApiManager;
        n4 = n3;
        return new zacd(googleApiManager, n3, apiKey, l7, l8, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabq2, BaseGmsClient object, int n3) {
        int n4;
        int[] nArray;
        boolean bl2;
        if ((object = ((BaseGmsClient)object).getTelemetryConfiguration()) != null && (bl2 = ((ConnectionTelemetryConfiguration)object).getMethodInvocationTelemetryEnabled()) && !((nArray = ((ConnectionTelemetryConfiguration)object).getMethodInvocationMethodKeyAllowlist()) == null ? (nArray = ((ConnectionTelemetryConfiguration)object).getMethodInvocationMethodKeyDisallowlist()) != null && (n3 = (int)(ArrayUtils.contains(nArray, n3) ? 1 : 0)) != 0 : (n3 = (int)(ArrayUtils.contains(nArray, n3) ? 1 : 0)) == 0) && (n4 = zabq2.zac()) < (n3 = ((ConnectionTelemetryConfiguration)object).getMaxMethodInvocationsLogged())) {
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onComplete(Task task2) {
        long l2;
        long l3;
        int n3;
        int n4;
        GoogleApiManager googleApiManager;
        int n7;
        int n8;
        int n10;
        MethodInvocation methodInvocation;
        int n14;
        long l4;
        long l7;
        int n15;
        int n16;
        int n17;
        zacd zacd2;
        block11: {
            block13: {
                int n18;
                block14: {
                    Object object;
                    int n19;
                    block15: {
                        block12: {
                            block10: {
                                zacd2 = this;
                                Object object2 = this.zaa;
                                n17 = ((GoogleApiManager)object2).zaD();
                                if (n17 == 0) {
                                    return;
                                }
                                object2 = RootTelemetryConfigManager.getInstance().getConfig();
                                if (object2 != null) {
                                    n16 = ((RootTelemetryConfiguration)object2).getMethodInvocationTelemetryEnabled();
                                    if (n16 == 0) return;
                                }
                                Object object3 = zacd2.zaa;
                                Object object4 = zacd2.zac;
                                if ((object3 = ((GoogleApiManager)object3).zai((ApiKey)object4)) == null) return;
                                object4 = ((zabq)object3).zaf();
                                n15 = object4 instanceof BaseGmsClient;
                                if (n15 == 0) return;
                                object4 = (BaseGmsClient)((Object)((zabq)object3).zaf());
                                l7 = zacd2.zad;
                                int n20 = 1;
                                l4 = 0L;
                                n18 = 0;
                                Object object5 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
                                if (object5 > 0) {
                                    n14 = 1;
                                } else {
                                    n14 = 0;
                                    methodInvocation = null;
                                }
                                n10 = ((BaseGmsClient)object4).getGCoreServiceId();
                                n19 = 100;
                                if (object2 != null) {
                                    int n21 = ((RootTelemetryConfiguration)object2).getMethodTimingTelemetryEnabled();
                                    n14 &= n21;
                                    int n22 = ((RootTelemetryConfiguration)object2).getBatchPeriodMillis();
                                    n8 = ((RootTelemetryConfiguration)object2).getMaxMethodInvocationsInBatch();
                                    n17 = ((RootTelemetryConfiguration)object2).getVersion();
                                    n7 = ((BaseGmsClient)object4).hasConnectionInfo();
                                    if (n7 != 0 && (n7 = ((BaseGmsClient)object4).isConnecting()) == 0) {
                                        long l8;
                                        long l12;
                                        n14 = zacd2.zab;
                                        if ((object3 = zacd.zab((zabq)object3, (BaseGmsClient)object4, n14)) == null) return;
                                        n15 = (int)(((ConnectionTelemetryConfiguration)object3).getMethodTimingTelemetryEnabled() ? 1 : 0);
                                        if (n15 == 0 || (n8 = (int)((l12 = (l8 = zacd2.zad) - l4) == 0L ? 0 : (l12 < 0L ? -1 : 1))) <= 0) {
                                            n20 = 0;
                                            googleApiManager = null;
                                        }
                                        n8 = ((ConnectionTelemetryConfiguration)object3).getMaxMethodInvocationsLogged();
                                        n14 = n20;
                                    }
                                    n16 = n22;
                                    n15 = n8;
                                } else {
                                    int n24 = 5000;
                                    n17 = 0;
                                    object2 = null;
                                    n16 = 5000;
                                    n15 = 100;
                                }
                                googleApiManager = zacd2.zaa;
                                boolean bl2 = task2.isSuccessful();
                                n8 = -1;
                                if (!bl2) break block10;
                                n7 = 0;
                                n4 = 0;
                                break block11;
                            }
                            n18 = task2.isCanceled();
                            if (n18 == 0) break block12;
                            n7 = 100;
                            break block13;
                        }
                        object = task2.getException();
                        n18 = object instanceof ApiException;
                        if (n18 == 0) break block14;
                        object = ((ApiException)object).getStatus();
                        n18 = ((Status)object).getStatusCode();
                        if ((object = ((Status)object).getConnectionResult()) != null) break block15;
                        n7 = n18;
                        break block13;
                    }
                    n4 = n19 = ((ConnectionResult)object).getErrorCode();
                    n7 = n18;
                    break block11;
                }
                n18 = 101;
                n7 = 101;
            }
            n4 = -1;
        }
        if (n14 != 0) {
            l4 = zacd2.zad;
            l7 = zacd2.zae;
            long l14 = System.currentTimeMillis();
            n3 = n14 = (int)(SystemClock.elapsedRealtime() - l7);
            l3 = l4;
            l2 = l14;
        } else {
            l3 = l4;
            l2 = l4;
            n3 = -1;
        }
        n8 = zacd2.zab;
        methodInvocation = new MethodInvocation(n8, n7, n4, l3, l2, null, null, n10, n3);
        l3 = n16;
        n4 = n17;
        googleApiManager.zaw(methodInvocation, n17, l3, n15);
    }
}

