/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from MZ2
 */
public final class mz2_2
implements SerialDescriptor,
qj_1 {
    public final SerialDescriptor a;
    public final String b;
    public final Set c;

    public mz2_2(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "original");
        this.a = object;
        CharSequence charSequence = new StringBuilder();
        String string2 = object.h();
        charSequence.append(string2);
        charSequence.append('?');
        charSequence = charSequence.toString();
        this.b = charSequence;
        this.c = object = kt2_2.a((SerialDescriptor)object);
    }

    public final Set a() {
        return this.c;
    }

    public final boolean b() {
        return true;
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
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof mz2_2;
        if (!bl3) {
            return false;
        }
        SerialDescriptor serialDescriptor = this.a;
        object = ((mz2_2)object).a;
        boolean bl4 = Intrinsics.areEqual(serialDescriptor, object);
        if (!bl4) {
            return false;
        }
        return bl2;
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
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final boolean i(int n3) {
        return this.a.i(n3);
    }

    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SerialDescriptor serialDescriptor = this.a;
        stringBuilder.append(serialDescriptor);
        stringBuilder.append('?');
        return stringBuilder.toString();
    }
}

