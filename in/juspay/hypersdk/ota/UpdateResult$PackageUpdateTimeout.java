/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateResult;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateResult$PackageUpdateTimeout
implements UpdateResult {
    private final ReleaseConfig releaseConfig;

    public UpdateResult$PackageUpdateTimeout(ReleaseConfig releaseConfig) {
        this.releaseConfig = releaseConfig;
    }

    public static /* synthetic */ UpdateResult$PackageUpdateTimeout copy$default(UpdateResult$PackageUpdateTimeout updateResult$PackageUpdateTimeout, ReleaseConfig releaseConfig, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            releaseConfig = updateResult$PackageUpdateTimeout.releaseConfig;
        }
        return updateResult$PackageUpdateTimeout.copy(releaseConfig);
    }

    public final ReleaseConfig component1() {
        return this.releaseConfig;
    }

    public final UpdateResult$PackageUpdateTimeout copy(ReleaseConfig releaseConfig) {
        UpdateResult$PackageUpdateTimeout updateResult$PackageUpdateTimeout = new UpdateResult$PackageUpdateTimeout(releaseConfig);
        return updateResult$PackageUpdateTimeout;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateResult$PackageUpdateTimeout;
        if (!bl3) {
            return false;
        }
        object = (UpdateResult$PackageUpdateTimeout)object;
        ReleaseConfig releaseConfig = this.releaseConfig;
        object = ((UpdateResult$PackageUpdateTimeout)object).releaseConfig;
        boolean bl4 = Intrinsics.areEqual(releaseConfig, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ReleaseConfig getReleaseConfig() {
        return this.releaseConfig;
    }

    public int hashCode() {
        int n3;
        ReleaseConfig releaseConfig = this.releaseConfig;
        if (releaseConfig == null) {
            n3 = 0;
            releaseConfig = null;
        } else {
            n3 = releaseConfig.hashCode();
        }
        return n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PackageUpdateTimeout(releaseConfig=");
        ReleaseConfig releaseConfig = this.releaseConfig;
        stringBuilder.append(releaseConfig);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

