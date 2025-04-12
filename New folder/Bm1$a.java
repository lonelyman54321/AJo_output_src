/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class Bm1$a
implements SerialDescriptor {
    public static final Bm1$a b;
    public static final String c;
    public final /* synthetic */ mu1_2 a;

    static {
        Bm1$a bm1$a;
        b = bm1$a = new Bm1$a();
        c = "kotlinx.serialization.json.JsonObject";
    }

    public Bm1$a() {
        xe_1.D(StringCompanionObject.INSTANCE);
        Object object = pe3_2.a;
        im1_2 im1_22 = im1_2.a;
        this.a = object = xe_1.i((KSerializer)object, (KSerializer)im1_22).c;
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
        return this.a.d;
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
        return Ye3$c.a;
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

