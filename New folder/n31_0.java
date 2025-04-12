/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N31
 */
public final class n31_0
implements JU0 {
    public final FA a;
    public final N31$a b;
    public final JU0$b c;

    public n31_0(FA object, N31$a object2, JU0$b jU0$b) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "featureBounds");
        Intrinsics.checkNotNullParameter(object2, "type");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(jU0$b, string2);
        this.a = object;
        this.b = object2;
        this.c = jU0$b;
        object2 = "bounds";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = ((FA)object).b();
        if (n4 == 0 && (n4 = ((FA)object).a()) == 0) {
            object2 = "Bounds must be non zero".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        n4 = ((FA)object).a;
        if (n4 != 0 && (n3 = ((FA)object).b) != 0) {
            object2 = "Bounding rectangle must start at the top or left window edge for folding features".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
    }

    public final JU0$a a() {
        int n3;
        Object object = this.a;
        int n4 = ((FA)object).b();
        object = n4 > (n3 = ((FA)object).a()) ? JU0$a.c : JU0$a.b;
        return object;
    }

    public final Rect b() {
        return this.a.c();
    }

    public final boolean c() {
        Object object = N31$a.c;
        Object object2 = this.b;
        boolean bl2 = Intrinsics.areEqual(object2, object);
        boolean bl3 = true;
        if (!(bl2 || (bl2 = Intrinsics.areEqual(object2, object = N31$a.b)) && (bl2 = Intrinsics.areEqual(object2 = this.c, object = JU0$b.c)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object == null) {
            bl2 = false;
            object2 = null;
        } else {
            object2 = object.getClass();
        }
        bl2 = Intrinsics.areEqual(n31_0.class, object2);
        if (!bl2) {
            return false;
        }
        if (object != null) {
            object = (n31_0)object;
            object2 = this.a;
            Object object3 = ((n31_0)object).a;
            bl2 = Intrinsics.areEqual(object2, object3);
            if (!bl2) {
                return false;
            }
            object2 = this.b;
            object3 = ((n31_0)object).b;
            bl2 = Intrinsics.areEqual(object2, object3);
            if (!bl2) {
                return false;
            }
            object2 = this.c;
            object = ((n31_0)object).c;
            boolean bl4 = Intrinsics.areEqual(object2, object);
            if (!bl4) {
                return false;
            }
            return bl3;
        }
        object = new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        throw object;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = n31_0.class.getSimpleName();
        stringBuilder.append(object);
        stringBuilder.append(" { ");
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", type=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", state=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

