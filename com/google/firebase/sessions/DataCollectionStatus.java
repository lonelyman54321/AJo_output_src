/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions;

import com.google.firebase.sessions.DataCollectionState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DataCollectionStatus {
    private final DataCollectionState crashlytics;
    private final DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0, 7, null);
    }

    public DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2) {
        Intrinsics.checkNotNullParameter(dataCollectionState, "performance");
        Intrinsics.checkNotNullParameter(dataCollectionState2, "crashlytics");
        this.performance = dataCollectionState;
        this.crashlytics = dataCollectionState2;
        this.sessionSamplingRate = d2;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if ((n4 = n3 & 2) != 0) {
            dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if ((n3 &= 4) != 0) {
            d2 = 1.0;
        }
        this(dataCollectionState, dataCollectionState2, d2);
    }

    public static /* synthetic */ DataCollectionStatus copy$default(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            dataCollectionState = dataCollectionStatus.performance;
        }
        if ((n4 = n3 & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.crashlytics;
        }
        if ((n3 &= 4) != 0) {
            d2 = dataCollectionStatus.sessionSamplingRate;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d2);
    }

    public final DataCollectionState component1() {
        return this.performance;
    }

    public final DataCollectionState component2() {
        return this.crashlytics;
    }

    public final double component3() {
        return this.sessionSamplingRate;
    }

    public final DataCollectionStatus copy(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d2) {
        Intrinsics.checkNotNullParameter(dataCollectionState, "performance");
        Intrinsics.checkNotNullParameter(dataCollectionState2, "crashlytics");
        DataCollectionStatus dataCollectionStatus = new DataCollectionStatus(dataCollectionState, dataCollectionState2, d2);
        return dataCollectionStatus;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DataCollectionStatus;
        if (!bl3) {
            return false;
        }
        object = (DataCollectionStatus)object;
        DataCollectionState dataCollectionState = this.performance;
        DataCollectionState dataCollectionState2 = ((DataCollectionStatus)object).performance;
        if (dataCollectionState != dataCollectionState2) {
            return false;
        }
        dataCollectionState = this.crashlytics;
        dataCollectionState2 = ((DataCollectionStatus)object).crashlytics;
        if (dataCollectionState != dataCollectionState2) {
            return false;
        }
        double d2 = this.sessionSamplingRate;
        double d5 = ((DataCollectionStatus)object).sessionSamplingRate;
        int n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        return bl2;
    }

    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        int n3 = this.performance.hashCode() * 31;
        int n4 = (this.crashlytics.hashCode() + n3) * 31;
        long l2 = Double.doubleToLongBits(this.sessionSamplingRate);
        long l3 = l2 >>> 32;
        n3 = (int)(l2 ^ l3);
        return n4 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataCollectionStatus(performance=");
        DataCollectionState dataCollectionState = this.performance;
        stringBuilder.append(dataCollectionState);
        stringBuilder.append(", crashlytics=");
        dataCollectionState = this.crashlytics;
        stringBuilder.append(dataCollectionState);
        stringBuilder.append(", sessionSamplingRate=");
        double d2 = this.sessionSamplingRate;
        stringBuilder.append(d2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

