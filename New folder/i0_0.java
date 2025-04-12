/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/*
 * Renamed from I0
 */
public abstract class i0_0
implements Decoder,
s30_0 {
    public boolean A() {
        return true;
    }

    public short B(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.p();
    }

    public double C(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.s();
    }

    public abstract byte D();

    public abstract List E(String var1, List var2);

    public abstract boolean F(OP1 var1);

    public void G() {
        CharSequence charSequence = new StringBuilder();
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(this.getClass());
        charSequence.append(yn1_22);
        charSequence.append(" can't retrieve untyped values");
        charSequence = charSequence.toString();
        SerializationException serializationException = new IllegalArgumentException((String)charSequence);
        throw serializationException;
    }

    public abstract void H(hm1_1 var1);

    public abstract void I();

    public abstract Object J(OP1 var1);

    public abstract KSerializer K(yn1_2 var1, List var2);

    public abstract boolean L();

    public abstract Object M(l73 var1);

    public abstract qp0_2 N(yn1_2 var1, String var2);

    public abstract b03_0 O(yn1_2 var1, Object var2);

    public abstract Object P(mZ0 var1, f80_0 var2);

    public s30_0 c(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this;
    }

    public void d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
    }

    public Object e(qp0_2 qp0_22) {
        Intrinsics.checkNotNullParameter(qp0_22, "deserializer");
        return qp0_22.deserialize(this);
    }

    public int f(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "enumDescriptor");
        this.G();
        throw null;
    }

    public long g(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.k();
    }

    public Object h(SerialDescriptor object, int n3, qp0_2 qp0_22, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = "deserializer";
        Intrinsics.checkNotNullParameter(qp0_22, (String)object);
        SerialDescriptor serialDescriptor = qp0_22.getDescriptor();
        n3 = (int)(serialDescriptor.b() ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.A() ? 1 : 0)) == 0) {
            object = null;
        } else {
            Intrinsics.checkNotNullParameter(qp0_22, (String)object);
            object = this.e(qp0_22);
        }
        return object;
    }

    public abstract int i();

    public int j(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.i();
    }

    public abstract long k();

    public String l(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.w();
    }

    public Decoder n(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this;
    }

    public Decoder o(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        serialDescriptor = serialDescriptor.g(n3);
        return this.n(serialDescriptor);
    }

    public abstract short p();

    public float q() {
        this.G();
        throw null;
    }

    public float r(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.q();
    }

    public double s() {
        this.G();
        throw null;
    }

    public boolean t() {
        this.G();
        throw null;
    }

    public char u() {
        this.G();
        throw null;
    }

    public Object v(SerialDescriptor object, int n3, qp0_2 qp0_22, Object object2) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = "deserializer";
        Intrinsics.checkNotNullParameter(qp0_22, (String)object);
        Intrinsics.checkNotNullParameter(qp0_22, (String)object);
        return this.e(qp0_22);
    }

    public String w() {
        this.G();
        throw null;
    }

    public char x(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.u();
    }

    public byte y(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.D();
    }

    public boolean z(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.t();
    }
}

