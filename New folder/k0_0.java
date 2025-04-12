/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.content.Context;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONObject;

/*
 * Renamed from K0
 */
public abstract class k0_0
implements Encoder,
u30_0,
xx2_0 {
    public void B(b03_0 b03_02, Object object) {
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        b03_02.serialize(this, object);
    }

    public void C(char c2) {
        Character c3 = Character.valueOf(c2);
        this.S(c3);
    }

    public /* synthetic */ void D() {
    }

    public void E(SerialDescriptor serialDescriptor, int n3, int n4) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.J(n4);
    }

    public void F(SerialDescriptor serialDescriptor, int n3, boolean bl2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.x(bl2);
    }

    public int G(int n3) {
        int n4;
        if ((n3 = this.V(n3)) == (n4 = -1)) {
            return n4;
        }
        int n7 = this.V(n3);
        if (n7 == n4) {
            n3 = -1;
        }
        return n3;
    }

    public void H(SerialDescriptor serialDescriptor, int n3, b03_0 b03_02, Object object) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        this.R(serialDescriptor, n3);
        this.B(b03_02, object);
    }

    public boolean I(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return true;
    }

    public void J(int n3) {
        Integer n4 = n3;
        this.S(n4);
    }

    public void K(SerialDescriptor serialDescriptor, int n3, short s7) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.w(s7);
    }

    public void L(SerialDescriptor serialDescriptor, int n3, double d2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.f(d2);
    }

    public void M(SerialDescriptor serialDescriptor, int n3, long l2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.q(l2);
    }

    public void N(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.S(string2);
    }

    public Metadata P(do1_2 do1_22) {
        ByteBuffer byteBuffer = do1_22.d;
        byteBuffer.getClass();
        int n3 = byteBuffer.position();
        n3 = n3 == 0 && (n3 = (int)(byteBuffer.hasArray() ? 1 : 0)) != 0 && (n3 = byteBuffer.arrayOffset()) == 0 ? 1 : 0;
        ct3.a(n3 != 0);
        return this.Q(do1_22, byteBuffer);
    }

    public abstract Metadata Q(do1_2 var1, ByteBuffer var2);

    public void R(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
    }

    public void S(Object object) {
        Intrinsics.checkNotNullParameter(object, "value");
        StringBuilder stringBuilder = new StringBuilder("Non-serializable ");
        object = Reflection.getOrCreateKotlinClass(object.getClass());
        stringBuilder.append(object);
        stringBuilder.append(" is not supported by ");
        object = Reflection.getOrCreateKotlinClass(this.getClass());
        stringBuilder.append(object);
        stringBuilder.append(" encoder");
        object = stringBuilder.toString();
        SerializationException serializationException = new IllegalArgumentException((String)object);
        throw serializationException;
    }

    public abstract void T(Context var1, FB0 var2, String var3);

    public abstract int U(int var1);

    public abstract int V(int var1);

    public abstract void W(JSONObject var1, boolean var2);

    public abstract void X();

    public abstract Future Y(Context var1, JSONObject var2, int var3);

    public u30_0 c(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this;
    }

    public void d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
    }

    public Encoder e(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        serialDescriptor = serialDescriptor.g(n3);
        return this.o(serialDescriptor);
    }

    public void f(double d2) {
        Double d5 = d2;
        this.S(d5);
    }

    public void g(byte by2) {
        Byte by4 = by2;
        this.S(by4);
    }

    public int h(int n3) {
        int n4;
        if ((n3 = this.U(n3)) == (n4 = -1)) {
            return n4;
        }
        int n7 = this.U(n3);
        if (n7 == n4) {
            n3 = -1;
        }
        return n3;
    }

    public u30_0 i(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.c(serialDescriptor);
    }

    public int j(int n3) {
        return this.V(n3);
    }

    public int l(int n3) {
        return this.U(n3);
    }

    public void m(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "enumDescriptor");
        object = n3;
        this.S(object);
    }

    public Encoder o(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this;
    }

    public void q(long l2) {
        Long l3 = l2;
        this.S(l3);
    }

    public void r(SerialDescriptor serialDescriptor, int n3, b03_0 b03_02, Object object) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(b03_02, "serializer");
        this.R(serialDescriptor, n3);
        dz0_1.a(this, b03_02, object);
    }

    public void s(SerialDescriptor serialDescriptor, String string2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(string2, "value");
        this.R(serialDescriptor, 0);
        this.N(string2);
    }

    public void t(SerialDescriptor serialDescriptor, int n3, char c2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.C(c2);
    }

    public void u() {
        SerializationException serializationException = new IllegalArgumentException("'null' is not supported by default");
        throw serializationException;
    }

    public void v(SerialDescriptor serialDescriptor, int n3, byte by2) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.g(by2);
    }

    public void w(short s7) {
        Short s8 = s7;
        this.S(s8);
    }

    public void x(boolean bl2) {
        Boolean bl3 = bl2;
        this.S(bl3);
    }

    public void y(SerialDescriptor serialDescriptor, int n3, float f5) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        this.R(serialDescriptor, n3);
        this.z(f5);
    }

    public void z(float f5) {
        Float f6 = Float.valueOf(f5);
        this.S(f6);
    }
}

