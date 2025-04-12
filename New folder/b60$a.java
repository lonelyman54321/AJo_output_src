/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public final class b60$a {
    public final Uri a;
    public final boolean b;

    public b60$a(boolean bl2, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.a = uri;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Uri uri;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object != null) {
            uri = object.getClass();
        } else {
            bl2 = false;
            uri = null;
        }
        bl2 = Intrinsics.areEqual(b60$a.class, uri);
        if (!bl2) {
            return false;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        object = (b60$a)object;
        uri = this.a;
        Uri uri2 = ((b60$a)object).a;
        bl2 = Intrinsics.areEqual(uri, uri2);
        if (!bl2) {
            return false;
        }
        bl2 = this.b;
        boolean bl4 = ((b60$a)object).b;
        if (bl2 != bl4) {
            return false;
        }
        return bl3;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int n3 = uri.hashCode() * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }
}

