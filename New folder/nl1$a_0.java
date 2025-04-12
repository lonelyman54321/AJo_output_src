/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Nl1$a
 */
public final class nl1$a_0
implements SerialDescriptor {
    public static final nl1$a_0 b;
    public static final String c;
    public final /* synthetic */ hp_2 a;

    static {
        nl1$a_0 nl1$a_0;
        b = nl1$a_0 = new nl1$a_0();
        c = "kotlinx.serialization.json.JsonArray";
    }

    public nl1$a_0() {
        hp_2 hp_22;
        this.a = hp_22 = xe_1.g((KSerializer)im1_2.a).b;
    }

    public final boolean b() {
        this.a.getClass();
        return false;
    }

    public final int c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return this.a.c(string2);
    }

    public final int d() {
        return this.a.b;
    }

    public final String e(int n3) {
        this.a.getClass();
        return String.valueOf(n3);
    }

    public final List f(int n3) {
        return this.a.f(n3);
    }

    public final SerialDescriptor g(int n3) {
        return this.a.g(n3);
    }

    public final List getAnnotations() {
        this.a.getClass();
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        this.a.getClass();
        return Ye3$b.a;
    }

    public final String h() {
        return c;
    }

    public final boolean i(int n3) {
        this.a.i(n3);
        return false;
    }

    public final boolean isInline() {
        this.a.getClass();
        return false;
    }
}

