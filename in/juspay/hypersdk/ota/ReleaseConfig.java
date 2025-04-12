/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Companion;
import in.juspay.hypersdk.ota.ReleaseConfig$Config;
import in.juspay.hypersdk.ota.ReleaseConfig$PackageManifest;
import in.juspay.hypersdk.ota.ReleaseConfig$ResourceManifest;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ReleaseConfig {
    public static final ReleaseConfig$Companion Companion;
    private final ReleaseConfig$Config config;
    private final ReleaseConfig$PackageManifest pkg;
    private final ReleaseConfig$ResourceManifest resources;

    static {
        ReleaseConfig$Companion releaseConfig$Companion;
        Companion = releaseConfig$Companion = new ReleaseConfig$Companion(null);
    }

    public ReleaseConfig(ReleaseConfig$Config releaseConfig$Config, ReleaseConfig$PackageManifest releaseConfig$PackageManifest, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest) {
        Intrinsics.checkNotNullParameter(releaseConfig$Config, "config");
        Intrinsics.checkNotNullParameter(releaseConfig$PackageManifest, "pkg");
        Intrinsics.checkNotNullParameter(releaseConfig$ResourceManifest, "resources");
        this.config = releaseConfig$Config;
        this.pkg = releaseConfig$PackageManifest;
        this.resources = releaseConfig$ResourceManifest;
    }

    public static /* synthetic */ ReleaseConfig copy$default(ReleaseConfig releaseConfig, ReleaseConfig$Config releaseConfig$Config, ReleaseConfig$PackageManifest releaseConfig$PackageManifest, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            releaseConfig$Config = releaseConfig.config;
        }
        if ((n4 = n3 & 2) != 0) {
            releaseConfig$PackageManifest = releaseConfig.pkg;
        }
        if ((n3 &= 4) != 0) {
            releaseConfig$ResourceManifest = releaseConfig.resources;
        }
        return releaseConfig.copy(releaseConfig$Config, releaseConfig$PackageManifest, releaseConfig$ResourceManifest);
    }

    public final ReleaseConfig$Config component1() {
        return this.config;
    }

    public final ReleaseConfig$PackageManifest component2() {
        return this.pkg;
    }

    public final ReleaseConfig$ResourceManifest component3() {
        return this.resources;
    }

    public final ReleaseConfig copy(ReleaseConfig$Config releaseConfig$Config, ReleaseConfig$PackageManifest releaseConfig$PackageManifest, ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest) {
        Intrinsics.checkNotNullParameter(releaseConfig$Config, "config");
        Intrinsics.checkNotNullParameter(releaseConfig$PackageManifest, "pkg");
        Intrinsics.checkNotNullParameter(releaseConfig$ResourceManifest, "resources");
        ReleaseConfig releaseConfig = new ReleaseConfig(releaseConfig$Config, releaseConfig$PackageManifest, releaseConfig$ResourceManifest);
        return releaseConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReleaseConfig;
        if (!bl3) {
            return false;
        }
        object = (ReleaseConfig)object;
        Object object2 = this.config;
        Object object3 = ((ReleaseConfig)object).config;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pkg;
        object3 = ((ReleaseConfig)object).pkg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.resources;
        object = ((ReleaseConfig)object).resources;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ReleaseConfig$Config getConfig() {
        return this.config;
    }

    public final ReleaseConfig$PackageManifest getPkg() {
        return this.pkg;
    }

    public final ReleaseConfig$ResourceManifest getResources() {
        return this.resources;
    }

    public int hashCode() {
        int n3 = this.config.hashCode() * 31;
        int n4 = (this.pkg.hashCode() + n3) * 31;
        return this.resources.hashCode() + n4;
    }

    public final String serialize() {
        Object object = new JSONObject();
        JSONObject jSONObject = this.config.toJSON();
        object = object.put("config", (Object)jSONObject);
        jSONObject = this.pkg.toJSON();
        object = object.put("package", (Object)jSONObject);
        jSONObject = this.resources.toJSON();
        object = object.put("resources", (Object)jSONObject).toString();
        Intrinsics.checkNotNullExpressionValue(object, "JSONObject()\n           \u2026)\n            .toString()");
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReleaseConfig(config=");
        Object object = this.config;
        stringBuilder.append(object);
        stringBuilder.append(", pkg=");
        object = this.pkg;
        stringBuilder.append(object);
        stringBuilder.append(", resources=");
        object = this.resources;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

