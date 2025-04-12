/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fN2
 */
public final class fn2_1 {
    public final Uri a;
    public final String b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;

    public fn2_1() {
        this(null, null, false, false, false, 511);
    }

    public fn2_1(Uri uri, String string2, boolean bl2, boolean bl3, boolean bl4, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            uri = null;
        }
        n4 = n3 & 2;
        String string3 = "";
        if (n4 != 0) {
            string2 = string3;
        }
        if ((n4 = n3 & 4) != 0) {
            bl2 = false;
        }
        if ((n4 = n3 & 0x10) != 0) {
            bl3 = false;
        }
        if ((n3 &= 0x20) != 0) {
            bl4 = false;
        }
        Intrinsics.checkNotNullParameter(string2, "path");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        this.a = uri;
        this.b = string2;
        this.c = bl2;
        this.d = false;
        this.e = bl3;
        this.f = bl4;
        this.g = false;
        this.h = 0;
        this.i = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof fn2_1;
        if (n3 == 0) {
            return false;
        }
        object = (fn2_1)object;
        Object object2 = this.a;
        Object object3 = ((fn2_1)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((fn2_1)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((fn2_1)object).c;
        if (n3 != n4) {
            return false;
        }
        n3 = this.d;
        n4 = ((fn2_1)object).d;
        if (n3 != n4) {
            return false;
        }
        n3 = this.e;
        n4 = ((fn2_1)object).e;
        if (n3 != n4) {
            return false;
        }
        n3 = this.f;
        n4 = ((fn2_1)object).f;
        if (n3 != n4) {
            return false;
        }
        n3 = this.g;
        n4 = ((fn2_1)object).g;
        if (n3 != n4) {
            return false;
        }
        n3 = this.h;
        n4 = ((fn2_1)object).h;
        if (n3 != n4) {
            return false;
        }
        object3 = this.i;
        object = ((fn2_1)object).i;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Uri uri = this.a;
        if (uri == null) {
            n3 = 0;
            uri = null;
        } else {
            n3 = uri.hashCode();
        }
        int n4 = 31;
        n3 *= 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, n4, string2);
        int n7 = 1237;
        int n8 = this.c;
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = (int)(this.d ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = (int)(this.e ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = (int)(this.f ? 1 : 0);
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        if (n8 != 0) {
            n7 = 1231;
        }
        n3 = (n3 + n7) * 31;
        n7 = this.h;
        n3 = (n3 + n7) * 31;
        return this.i.hashCode() + n3;
    }

    public final String toString() {
        boolean bl2 = this.d;
        boolean bl3 = this.e;
        boolean bl4 = this.f;
        boolean bl5 = this.g;
        int n3 = this.h;
        String string2 = this.i;
        StringBuilder stringBuilder = new StringBuilder("ReturnImage(uri=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", path=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", isAddImageIcon=");
        boolean bl6 = this.c;
        I81.a(", isUploadFailed=", ", isUploadSuccess=", stringBuilder, bl6, bl2);
        I81.a(", isUploadAttempted=", ", isUploading=", stringBuilder, bl3, bl4);
        stringBuilder.append(bl5);
        stringBuilder.append(", uploadProgress=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageUrl=");
        return h30_0.a(stringBuilder, string2, ")");
    }
}

