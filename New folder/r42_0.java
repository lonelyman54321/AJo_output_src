/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from r42
 */
public final class r42_0
implements SerialDescriptor {
    public static final r42_0 a;
    public static final Ye3$d b;
    public static final String c;

    static {
        r42_0 r42_02;
        a = r42_02 = new Object();
        b = Ye3$d.a;
        c = "kotlin.Nothing";
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        object = new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
        throw object;
    }

    public final int d() {
        return 0;
    }

    public final String e(int n3) {
        IllegalStateException illegalStateException = new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
        throw illegalStateException;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        if (this == object) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final List f(int n3) {
        IllegalStateException illegalStateException = new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
        throw illegalStateException;
    }

    public final SerialDescriptor g(int n3) {
        IllegalStateException illegalStateException = new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
        throw illegalStateException;
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        return b;
    }

    public final String h() {
        return c;
    }

    public final int hashCode() {
        int n3 = c.hashCode();
        return b.hashCode() * 31 + n3;
    }

    public final boolean i(int n3) {
        IllegalStateException illegalStateException = new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
        throw illegalStateException;
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}

