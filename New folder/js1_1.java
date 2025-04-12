/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from JS1
 */
public abstract class js1_1
implements Encoder,
u30_0 {
    public final ArrayList a;

    public js1_1() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public abstract Encoder A(Object var1, SerialDescriptor var2);

    public abstract void B(b03_0 var1, Object var2);

    public final void C(char c2) {
        Object object = this.T();
        this.k(object, c2);
    }

    public final void E(SerialDescriptor object, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.G(n4, object);
    }

    public final void F(SerialDescriptor object, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.h(object, bl2);
    }

    public abstract void G(int var1, Object var2);

    public final void H(SerialDescriptor object, int n3, b03_0 b03_02, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        object = this.S((SerialDescriptor)object, n3);
        this.a.add(object);
        this.B(b03_02, object2);
    }

    public final void J(int n3) {
        Object object = this.T();
        this.G(n3, object);
    }

    public final void K(SerialDescriptor object, int n3, short s7) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.P(object, s7);
    }

    public final void L(SerialDescriptor object, int n3, double d2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.l(object, d2);
    }

    public final void M(SerialDescriptor object, int n3, long l2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.O(l2, object);
    }

    public final void N(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        Object object = this.T();
        this.Q(object, string2);
    }

    public abstract void O(long var1, Object var3);

    public abstract void P(Object var1, short var2);

    public abstract void Q(Object var1, String var2);

    public abstract void R(SerialDescriptor var1);

    public final String S(SerialDescriptor object, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.b((SerialDescriptor)object, n3);
        Intrinsics.checkNotNullParameter(object, "nestedName");
        String string3 = (String)CollectionsKt.T(this.a);
        if (string3 == null) {
            string3 = "";
        }
        Intrinsics.checkNotNullParameter(string3, "parentName");
        Intrinsics.checkNotNullParameter(object, "childName");
        return object;
    }

    public final Object T() {
        Serializable serializable = this.a;
        int n3 = serializable.isEmpty() ^ 1;
        if (n3 != 0) {
            n3 = xx_2.h((List)((Object)serializable));
            return ((ArrayList)serializable).remove(n3);
        }
        serializable = new IllegalArgumentException("No tag in stack for requested element");
        throw serializable;
    }

    public abstract String b(SerialDescriptor var1, int var2);

    public final void d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        ArrayList arrayList = this.a;
        boolean bl2 = arrayList.isEmpty() ^ true;
        if (bl2) {
            this.T();
        }
        this.R(serialDescriptor);
    }

    public final Encoder e(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        String string2 = this.S(serialDescriptor, n3);
        serialDescriptor = serialDescriptor.g(n3);
        return this.A(string2, serialDescriptor);
    }

    public final void f(double d2) {
        Object object = this.T();
        this.l(object, d2);
    }

    public final void g(byte by2) {
        Object object = this.T();
        this.j(object, by2);
    }

    public abstract void h(Object var1, boolean var2);

    public final u30_0 i(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.c(serialDescriptor);
    }

    public abstract void j(Object var1, byte var2);

    public abstract void k(Object var1, char var2);

    public abstract void l(Object var1, double var2);

    public final void m(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "enumDescriptor");
        Object object = this.T();
        this.n(object, serialDescriptor, n3);
    }

    public abstract void n(Object var1, SerialDescriptor var2, int var3);

    public Encoder o(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Object object = this.T();
        return this.A(object, serialDescriptor);
    }

    public abstract void p(Object var1, float var2);

    public final void q(long l2) {
        Object object = this.T();
        this.O(l2, object);
    }

    public void r(SerialDescriptor object, int n3, b03_0 b03_02, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        object = this.S((SerialDescriptor)object, n3);
        this.a.add(object);
        dz0_1.a(this, b03_02, object2);
    }

    public final void s(SerialDescriptor object, String string2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Intrinsics.checkNotNullParameter(string2, "value");
        object = this.S((SerialDescriptor)object, 0);
        this.Q(object, string2);
    }

    public final void t(SerialDescriptor object, int n3, char c2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.k(object, c2);
    }

    public final void v(SerialDescriptor object, int n3, byte by2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.j(object, by2);
    }

    public final void w(short s7) {
        Object object = this.T();
        this.P(object, s7);
    }

    public final void x(boolean bl2) {
        Object object = this.T();
        this.h(object, bl2);
    }

    public final void y(SerialDescriptor object, int n3, float f5) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        this.p(object, f5);
    }

    public final void z(float f5) {
        Object object = this.T();
        this.p(object, f5);
    }
}

