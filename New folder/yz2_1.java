/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from yz2
 */
public final class yz2_1
implements SerialDescriptor {
    public final String a;
    public final wz2_2 b;

    public yz2_1(String string2, wz2_2 wz2_22) {
        Intrinsics.checkNotNullParameter(string2, "serialName");
        Intrinsics.checkNotNullParameter(wz2_22, "kind");
        this.a = string2;
        this.b = wz2_22;
    }

    public final void a() {
        CharSequence charSequence = new StringBuilder("Primitive descriptor ");
        String string2 = this.a;
        charSequence = h30_0.a(charSequence, string2, " does not have elements");
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.a();
        throw null;
    }

    public final int d() {
        return 0;
    }

    public final String e(int n3) {
        this.a();
        throw null;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof yz2_1;
        if (!bl4) {
            return false;
        }
        object = (yz2_1)object;
        String string2 = this.a;
        Object object2 = ((yz2_1)object).a;
        bl4 = Intrinsics.areEqual(string2, object2);
        if (bl4 && (bl2 = Intrinsics.areEqual(object2 = this.b, object = ((yz2_1)object).b))) {
            return bl3;
        }
        return false;
    }

    public final List f(int n3) {
        this.a();
        throw null;
    }

    public final SerialDescriptor g(int n3) {
        this.a();
        throw null;
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        return this.b.hashCode() * 31 + n3;
    }

    public final boolean i(int n3) {
        this.a();
        throw null;
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PrimitiveDescriptor(");
        String string2 = this.a;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

