/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/*
 * Renamed from IS1
 */
public abstract class is1_1
implements Decoder,
s30_0 {
    public final ArrayList a;
    public boolean b;

    public is1_1() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final short B(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.O(object);
    }

    public final double C(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.I(object);
    }

    public final byte D() {
        Object object = this.T();
        return this.G(object);
    }

    public final Object E(qp0_2 qp0_22) {
        Intrinsics.checkNotNullParameter(qp0_22, "deserializer");
        return this.e(qp0_22);
    }

    public abstract boolean F(Object var1);

    public abstract byte G(Object var1);

    public abstract char H(Object var1);

    public abstract double I(Object var1);

    public abstract int J(Object var1, SerialDescriptor var2);

    public abstract float K(Object var1);

    public abstract Decoder L(Object var1, SerialDescriptor var2);

    public abstract int M(Object var1);

    public abstract long N(Object var1);

    public abstract short O(Object var1);

    public abstract String P(Object var1);

    public String Q(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return serialDescriptor.e(n3);
    }

    public final String R(SerialDescriptor object, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.Q((SerialDescriptor)object, n3);
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
        ArrayList arrayList = this.a;
        int n3 = xx_2.h(arrayList);
        arrayList = arrayList.remove(n3);
        this.b = true;
        return arrayList;
    }

    public final String U() {
        Object object = this.a;
        boolean bl2 = ((ArrayList)object).isEmpty();
        if (bl2) {
            object = "$";
        } else {
            String string2 = ".";
            String string3 = "$.";
            int n3 = 60;
            object = CollectionsKt.R((Iterable)object, string2, string3, null, null, n3);
        }
        return object;
    }

    public abstract Object e(qp0_2 var1);

    public final int f(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "enumDescriptor");
        Object object = this.T();
        return this.J(object, serialDescriptor);
    }

    public final long g(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.N(object);
    }

    public final Object h(SerialDescriptor object, int n3, qp0_2 qp0_22, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object2 = "deserializer";
        Intrinsics.checkNotNullParameter(qp0_22, (String)object2);
        object = this.S((SerialDescriptor)object, n3);
        ArrayList arrayList = this.a;
        arrayList.add(object);
        object = qp0_22.getDescriptor();
        boolean bl2 = object.b();
        if (!bl2 && !(bl2 = this.A())) {
            bl2 = false;
            object = null;
        } else {
            Intrinsics.checkNotNullParameter(qp0_22, (String)object2);
            object = this.e(qp0_22);
        }
        n3 = (int)(this.b ? 1 : 0);
        if (n3 == 0) {
            this.T();
        }
        this.b = false;
        return object;
    }

    public final int i() {
        Object object = this.T();
        return this.M(object);
    }

    public final int j(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.M(object);
    }

    public final long k() {
        Object object = this.T();
        return this.N(object);
    }

    public final String l(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.P(object);
    }

    public Decoder n(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Object object = this.T();
        return this.L(object, serialDescriptor);
    }

    public final Decoder o(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        String string2 = this.S(serialDescriptor, n3);
        serialDescriptor = serialDescriptor.g(n3);
        return this.L(string2, serialDescriptor);
    }

    public final short p() {
        Object object = this.T();
        return this.O(object);
    }

    public final float q() {
        Object object = this.T();
        return this.K(object);
    }

    public final float r(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.K(object);
    }

    public final double s() {
        Object object = this.T();
        return this.I(object);
    }

    public final boolean t() {
        Object object = this.T();
        return this.F(object);
    }

    public final char u() {
        Object object = this.T();
        return this.H(object);
    }

    public final Object v(SerialDescriptor object, int n3, qp0_2 qp0_22, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object2 = "deserializer";
        Intrinsics.checkNotNullParameter(qp0_22, (String)object2);
        object = this.S((SerialDescriptor)object, n3);
        ArrayList arrayList = this.a;
        arrayList.add(object);
        object = this.E(qp0_22);
        n3 = (int)(this.b ? 1 : 0);
        if (n3 == 0) {
            this.T();
        }
        this.b = false;
        return object;
    }

    public final String w() {
        Object object = this.T();
        return this.P(object);
    }

    public final char x(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.H(object);
    }

    public final byte y(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.G(object);
    }

    public final boolean z(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.S((SerialDescriptor)object, n3);
        return this.F(object);
    }
}

