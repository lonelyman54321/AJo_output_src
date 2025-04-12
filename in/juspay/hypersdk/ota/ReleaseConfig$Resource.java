/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class ReleaseConfig$Resource {
    private final String extension;
    private final String fileName;
    private final String name;
    private final URL url;
    private final String version;

    public ReleaseConfig$Resource(String string2, URL serializable, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(serializable, "url");
        Intrinsics.checkNotNullParameter(string3, "version");
        Intrinsics.checkNotNullParameter(string4, "extension");
        this.name = string2;
        this.url = serializable;
        this.version = string3;
        this.extension = string4;
        ((StringBuilder)serializable).append(string2);
        ((StringBuilder)serializable).append('_');
        ((StringBuilder)serializable).append(string3);
        ((StringBuilder)serializable).append('.');
        ((StringBuilder)serializable).append(string4);
        this.fileName = string2 = ((StringBuilder)serializable).toString();
    }

    public static /* synthetic */ ReleaseConfig$Resource copy$default(ReleaseConfig$Resource releaseConfig$Resource, String string2, URL uRL, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = releaseConfig$Resource.name;
        }
        if ((n4 = n3 & 2) != 0) {
            uRL = releaseConfig$Resource.url;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = releaseConfig$Resource.version;
        }
        if ((n3 &= 8) != 0) {
            string4 = releaseConfig$Resource.extension;
        }
        return releaseConfig$Resource.copy(string2, uRL, string3, string4);
    }

    public final String component1() {
        return this.name;
    }

    public final URL component2() {
        return this.url;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.extension;
    }

    public final ReleaseConfig$Resource copy(String string2, URL uRL, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(uRL, "url");
        Intrinsics.checkNotNullParameter(string3, "version");
        Intrinsics.checkNotNullParameter(string4, "extension");
        ReleaseConfig$Resource releaseConfig$Resource = new ReleaseConfig$Resource(string2, uRL, string3, string4);
        return releaseConfig$Resource;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof ReleaseConfig$Resource;
        if (!bl4) {
            return false;
        }
        String string2 = this.name;
        object = (ReleaseConfig$Resource)object;
        String string3 = ((ReleaseConfig$Resource)object).name;
        bl4 = Intrinsics.areEqual(string2, string3);
        if (!bl4 || !(bl2 = Intrinsics.areEqual(string2 = this.version, object = ((ReleaseConfig$Resource)object).version))) {
            bl3 = false;
        }
        return bl3;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getName() {
        return this.name;
    }

    public final URL getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int n3 = this.name.hashCode() * 31;
        return this.version.hashCode() + n3;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.url.toString();
        jSONObject = jSONObject.put("url", (Object)string2);
        string2 = this.version;
        jSONObject = jSONObject.put("version", (Object)string2);
        string2 = this.extension;
        jSONObject = jSONObject.put("extension", (Object)string2);
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n           \u2026t(\"extension\", extension)");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Resource(name=");
        Object object = this.name;
        stringBuilder.append((String)object);
        stringBuilder.append(", url=");
        object = this.url;
        stringBuilder.append(object);
        stringBuilder.append(", version=");
        object = this.version;
        stringBuilder.append((String)object);
        stringBuilder.append(", extension=");
        object = this.extension;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

