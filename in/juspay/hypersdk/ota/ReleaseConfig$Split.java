/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.ota;

import java.net.URL;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class ReleaseConfig$Split {
    private final String fileName;
    private final URL url;

    public ReleaseConfig$Split(URL object) {
        Intrinsics.checkNotNullParameter(object, "url");
        this.url = object;
        object = ((URL)object).getPath();
        Intrinsics.checkNotNullExpressionValue(object, "url.path");
        Object object2 = new String[]{"/"};
        object = (String)CollectionsKt.S(StringsKt.a0((CharSequence)object, object2, false, 0, 6));
        object2 = ".zip";
        boolean bl2 = b.h((String)object, (String)object2, false);
        if (bl2) {
            String string2 = ".jsa";
            this.fileName = object = b.n((String)object, (String)object2, string2, false);
        } else {
            this.fileName = object;
        }
    }

    public static /* synthetic */ ReleaseConfig$Split copy$default(ReleaseConfig$Split releaseConfig$Split, URL uRL, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            uRL = releaseConfig$Split.url;
        }
        return releaseConfig$Split.copy(uRL);
    }

    public final URL component1() {
        return this.url;
    }

    public final ReleaseConfig$Split copy(URL uRL) {
        Intrinsics.checkNotNullParameter(uRL, "url");
        ReleaseConfig$Split releaseConfig$Split = new ReleaseConfig$Split(uRL);
        return releaseConfig$Split;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReleaseConfig$Split;
        if (!bl3) {
            return false;
        }
        object = (ReleaseConfig$Split)object;
        URL uRL = this.url;
        object = ((ReleaseConfig$Split)object).url;
        boolean bl4 = Intrinsics.areEqual(uRL, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Split(url=");
        URL uRL = this.url;
        stringBuilder.append(uRL);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

