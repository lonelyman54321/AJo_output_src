/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from XG1
 */
public abstract class xg1_2
implements SerialDescriptor {
    public final String a;
    public final SerialDescriptor b;
    public final SerialDescriptor c;
    public final int d;

    public xg1_2(String string2, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.a = string2;
        this.b = serialDescriptor;
        this.c = serialDescriptor2;
        this.d = 2;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Serializable serializable = StringsKt.toIntOrNull(string2);
        if (serializable != null) {
            return serializable;
        }
        string2 = Ft2.a(string2, " is not a valid map index");
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    public final int d() {
        return this.d;
    }

    public final String e(int n3) {
        return String.valueOf(n3);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xg1_2;
        if (!bl3) {
            return false;
        }
        object = (xg1_2)object;
        Object object2 = this.a;
        Object object3 = ((xg1_2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((xg1_2)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object = ((xg1_2)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List f(int n3) {
        if (n3 >= 0) {
            return mz0_2.a;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.a;
        charSequence = h30_0.a((StringBuilder)charSequence, (String)object, " expects only non-negative indices");
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final SerialDescriptor g(int n3) {
        if (n3 >= 0) {
            if ((n3 %= 2) == 0) return this.b;
            int n4 = 1;
            if (n3 == n4) {
                return this.c;
            }
            String string2 = "Unreached".toString();
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.a;
        charSequence = h30_0.a((StringBuilder)charSequence, (String)object, " expects only non-negative indices");
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        return Ye3$c.a;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final boolean i(int n3) {
        if (n3 >= 0) {
            return false;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.a;
        charSequence = h30_0.a((StringBuilder)charSequence, (String)object, " expects only non-negative indices");
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append('(');
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", ");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

