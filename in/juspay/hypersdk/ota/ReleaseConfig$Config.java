/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ReleaseConfig$Config {
    private final long packageTimeout;
    private final JSONObject properties;
    private final long releaseConfigTimeout;
    private final String version;

    public ReleaseConfig$Config(String string2, long l2, long l3, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "version");
        Intrinsics.checkNotNullParameter(jSONObject, "properties");
        this.version = string2;
        this.releaseConfigTimeout = l2;
        this.packageTimeout = l3;
        this.properties = jSONObject;
    }

    public static /* synthetic */ ReleaseConfig$Config copy$default(ReleaseConfig$Config releaseConfig$Config, String string2, long l2, long l3, JSONObject jSONObject, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = releaseConfig$Config.version;
        }
        if ((n4 = n3 & 2) != 0) {
            l2 = releaseConfig$Config.releaseConfigTimeout;
        }
        long l4 = l2;
        int n7 = n3 & 4;
        if (n7 != 0) {
            l3 = releaseConfig$Config.packageTimeout;
        }
        long l7 = l3;
        n7 = n3 & 8;
        if (n7 != 0) {
            jSONObject = releaseConfig$Config.properties;
        }
        l3 = l4;
        return releaseConfig$Config.copy(string2, l4, l7, jSONObject);
    }

    public final String component1() {
        return this.version;
    }

    public final long component2() {
        return this.releaseConfigTimeout;
    }

    public final long component3() {
        return this.packageTimeout;
    }

    public final JSONObject component4() {
        return this.properties;
    }

    public final ReleaseConfig$Config copy(String string2, long l2, long l3, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(string2, "version");
        Intrinsics.checkNotNullParameter(jSONObject, "properties");
        ReleaseConfig$Config releaseConfig$Config = new ReleaseConfig$Config(string2, l2, l3, jSONObject);
        return releaseConfig$Config;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof ReleaseConfig$Config;
        if (!object2) {
            return false;
        }
        object = (ReleaseConfig$Config)object;
        String string2 = this.version;
        String string3 = ((ReleaseConfig$Config)object).version;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        long l2 = this.releaseConfigTimeout;
        long l3 = ((ReleaseConfig$Config)object).releaseConfigTimeout;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.packageTimeout;
        l3 = ((ReleaseConfig$Config)object).packageTimeout;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        string2 = this.properties;
        object = ((ReleaseConfig$Config)object).properties;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final long getPackageTimeout() {
        return this.packageTimeout;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }

    public final long getReleaseConfigTimeout() {
        return this.releaseConfigTimeout;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3 = this.version.hashCode() * 31;
        long l2 = this.releaseConfigTimeout;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = (int)(l2 ^ l3);
        n3 = (n3 + n7) * 31;
        l2 = this.packageTimeout;
        long l4 = l2 >>> n4;
        n7 = (int)(l2 ^ l4);
        n3 = (n3 + n7) * 31;
        return this.properties.hashCode() + n3;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.version;
        jSONObject = jSONObject.put("version", (Object)string2);
        long l2 = this.releaseConfigTimeout;
        jSONObject = jSONObject.put("release_config_timeout", l2);
        l2 = this.packageTimeout;
        jSONObject = jSONObject.put("package_timeout", l2);
        string2 = this.properties;
        jSONObject = jSONObject.put("properties", (Object)string2);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026\"properties\", properties)");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Config(version=");
        String string2 = this.version;
        stringBuilder.append(string2);
        stringBuilder.append(", releaseConfigTimeout=");
        long l2 = this.releaseConfigTimeout;
        stringBuilder.append(l2);
        stringBuilder.append(", packageTimeout=");
        l2 = this.packageTimeout;
        stringBuilder.append(l2);
        stringBuilder.append(", properties=");
        string2 = this.properties;
        stringBuilder.append((Object)string2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

