/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from v70
 */
public final class v70_0
implements SerialDescriptor {
    public final SerialDescriptor a;
    public final yn1_2 b;
    public final String c;

    public v70_0(pz2_1 object, yn1_2 yn1_22) {
        Intrinsics.checkNotNullParameter(object, "original");
        Intrinsics.checkNotNullParameter(yn1_22, "kClass");
        this.a = object;
        this.b = yn1_22;
        StringBuilder stringBuilder = new StringBuilder();
        object = ((pz2_1)object).a;
        stringBuilder.append((String)object);
        stringBuilder.append('<');
        object = yn1_22.getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append('>');
        this.c = object = stringBuilder.toString();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final int c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return this.a.c(string2);
    }

    public final int d() {
        return this.a.d();
    }

    public final String e(int n3) {
        return this.a.e(n3);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof v70_0;
        if (bl3) {
            object = (v70_0)object;
        } else {
            bl2 = false;
            object = null;
        }
        bl3 = false;
        if (object == null) {
            return false;
        }
        Object object2 = this.a;
        SerialDescriptor serialDescriptor = ((v70_0)object).a;
        boolean bl4 = Intrinsics.areEqual(object2, serialDescriptor);
        if (bl4 && (bl2 = Intrinsics.areEqual(object = ((v70_0)object).b, object2 = this.b))) {
            bl3 = true;
        }
        return bl3;
    }

    public final List f(int n3) {
        return this.a.f(n3);
    }

    public final SerialDescriptor g(int n3) {
        return this.a.g(n3);
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final xz2_1 getKind() {
        return this.a.getKind();
    }

    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        return this.c.hashCode() + n3;
    }

    public final boolean i(int n3) {
        return this.a.i(n3);
    }

    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContextDescriptor(kClass: ");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", original: ");
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

