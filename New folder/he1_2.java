/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from he1
 */
public final class he1_2 {
    public final Nc a;
    public final String b;
    public final i70_0 c;
    public final TX d;
    public final float e;
    public final long f;
    public final String g;

    public /* synthetic */ he1_2(Gx gx, String string2, i70_0 i70_02, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            gx = Nc$a.e;
        }
        Gx gx2 = gx;
        int n7 = n3 & 2;
        if (n7 != 0) {
            string2 = null;
        }
        String string3 = string2;
        n7 = n3 & 4;
        if (n7 != 0) {
            i70_02 = i70$a.a;
        }
        n7 = -1;
        long l2 = dj1.a(n7, n7);
        this(gx2, string3, i70_02, null, 1.0f, l2, "");
    }

    public he1_2(Nc nc, String string2, i70_0 i70_02, TX tX, float f5, long l2, String string3) {
        Intrinsics.checkNotNullParameter(nc, "alignment");
        Intrinsics.checkNotNullParameter(i70_02, "contentScale");
        Intrinsics.checkNotNullParameter(string3, "tag");
        this.a = nc;
        this.b = string2;
        this.c = i70_02;
        this.d = tX;
        this.e = f5;
        this.f = l2;
        this.g = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof he1_2;
        if (n3 == 0) {
            return false;
        }
        object = (he1_2)object;
        Object object2 = this.a;
        Object object3 = ((he1_2)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((he1_2)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((he1_2)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((he1_2)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        float f5 = this.e;
        float f6 = ((he1_2)object).e;
        n3 = Float.compare(f5, f6);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.f;
        long l3 = ((he1_2)object).f;
        n3 = (int)(bj1.b(l2, l3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object3 = this.g;
        object = ((he1_2)object).g;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        int n4 = object.hashCode();
        int n7 = 31;
        n4 *= 31;
        int n8 = 0;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.c;
        n3 = (object2.hashCode() + n4) * 31;
        object = this.d;
        if (object != null) {
            n8 = object.hashCode();
        }
        n3 = (n3 + n8) * 31;
        n4 = UR0.a(this.e, n3, n7);
        long l2 = this.f;
        long l3 = l2 >>> 32;
        n3 = ((int)(l2 ^ l3) + n4) * 31;
        return this.g.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ImageOptions(alignment=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", contentDescription=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", contentScale=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", colorFilter=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", alpha=");
        float f5 = this.e;
        stringBuilder.append(f5);
        stringBuilder.append(", requestSize=");
        object = bj1.e(this.f);
        stringBuilder.append(object);
        stringBuilder.append(", tag=");
        object = this.g;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

