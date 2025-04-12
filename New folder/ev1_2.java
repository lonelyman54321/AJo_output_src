/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from ev1
 */
public abstract class ev1_2
implements SerialDescriptor {
    public final SerialDescriptor a;
    public final int b;

    public ev1_2(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
        this.b = 1;
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
        string2 = Ft2.a(string2, " is not a valid list index");
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    public final int d() {
        return this.b;
    }

    public final String e(int n3) {
        return String.valueOf(n3);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof ev1_2;
        if (!bl4) {
            return false;
        }
        object = (ev1_2)object;
        SerialDescriptor serialDescriptor = this.a;
        Object object2 = ((ev1_2)object).a;
        bl4 = Intrinsics.areEqual(serialDescriptor, object2);
        if (bl4 && (bl2 = Intrinsics.areEqual(object2 = this.h(), object = object.h()))) {
            return bl3;
        }
        return false;
    }

    public final List f(int n3) {
        if (n3 >= 0) {
            return mz0_2.a;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.h();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" expects only non-negative indices");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final SerialDescriptor g(int n3) {
        if (n3 >= 0) {
            return this.a;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.h();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" expects only non-negative indices");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        return Ye3$b.a;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.h().hashCode() + n3;
    }

    public final boolean i(int n3) {
        if (n3 >= 0) {
            return false;
        }
        CharSequence charSequence = wk0_0.a(n3, "Illegal index ", ", ");
        Object object = this.h();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(" expects only non-negative indices");
        charSequence = ((StringBuilder)charSequence).toString();
        charSequence = ((Object)charSequence).toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.h();
        stringBuilder.append((String)object);
        stringBuilder.append('(');
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

