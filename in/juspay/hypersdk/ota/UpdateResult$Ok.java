/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig;
import in.juspay.hypersdk.ota.UpdateResult;
import kotlin.jvm.internal.Intrinsics;

public final class UpdateResult$Ok
implements UpdateResult {
    private final ReleaseConfig releaseConfig;

    public UpdateResult$Ok(ReleaseConfig releaseConfig) {
        Intrinsics.checkNotNullParameter(releaseConfig, "releaseConfig");
        this.releaseConfig = releaseConfig;
    }

    public static /* synthetic */ UpdateResult$Ok copy$default(UpdateResult$Ok updateResult$Ok, ReleaseConfig releaseConfig, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            releaseConfig = updateResult$Ok.releaseConfig;
        }
        return updateResult$Ok.copy(releaseConfig);
    }

    public final ReleaseConfig component1() {
        return this.releaseConfig;
    }

    public final UpdateResult$Ok copy(ReleaseConfig releaseConfig) {
        Intrinsics.checkNotNullParameter(releaseConfig, "releaseConfig");
        UpdateResult$Ok updateResult$Ok = new UpdateResult$Ok(releaseConfig);
        return updateResult$Ok;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof UpdateResult$Ok;
        if (!bl3) {
            return false;
        }
        object = (UpdateResult$Ok)object;
        ReleaseConfig releaseConfig = this.releaseConfig;
        object = ((UpdateResult$Ok)object).releaseConfig;
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
        return this.releaseConfig.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Ok(releaseConfig=");
        ReleaseConfig releaseConfig = this.releaseConfig;
        stringBuilder.append(releaseConfig);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

