/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from jm1
 */
public final class jm1_2
implements SerialDescriptor {
    public final hh3_2 a;

    public jm1_2(Function0 object) {
        this.a = object = yr1_2.b((Function0)object);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor)this.a.getValue();
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return this.a().c(string2);
    }

    public final int d() {
        return this.a().d();
    }

    public final String e(int n3) {
        return this.a().e(n3);
    }

    public final List f(int n3) {
        return this.a().f(n3);
    }

    public final SerialDescriptor g(int n3) {
        return this.a().g(n3);
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public final xz2_1 getKind() {
        return this.a().getKind();
    }

    public final String h() {
        return this.a().h();
    }

    public final boolean i(int n3) {
        return this.a().i(n3);
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }
}

