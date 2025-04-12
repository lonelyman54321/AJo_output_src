/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$d;
import androidx.datastore.preferences.protobuf.a_0;
import androidx.datastore.preferences.protobuf.g_0;
import androidx.datastore.preferences.protobuf.p;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream
extends tf_0 {
    public static final Logger b = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean c = nw3.f;
    public g_0 a;

    public static int A(int n3, long l2) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.B(l2) + n3;
    }

    public static int B(long l2) {
        long l3;
        long l4 = (long)-128 & l2;
        long l7 = 0L;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            return 1;
        }
        Object object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object2 < 0) {
            return 10;
        }
        l4 = 0xFFFFFFF800000000L & l2;
        long l12 = l4 - l7;
        object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false) {
            l2 >>>= 28;
            object2 = 6;
        } else {
            object2 = 2;
        }
        long l14 = 0xFFE00000L & l2;
        long l15 = l14 == l7 ? 0 : (l14 < l7 ? -1 : 1);
        if (l15 != false) {
            object2 += 2;
            l15 = 14;
            l2 >>>= l15;
        }
        if ((l15 = (l3 = (l2 &= (l14 = -16384L)) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            ++object2;
        }
        return (int)object2;
    }

    public static int e(int n3) {
        return CodedOutputStream.x(n3) + 1;
    }

    public static int f(int n3, DF dF) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.g(dF) + n3;
    }

    public static int g(DF dF) {
        int n3 = dF.size();
        return CodedOutputStream.z(n3) + n3;
    }

    public static int h(int n3) {
        return CodedOutputStream.x(n3) + 8;
    }

    public static int i(int n3, int n4) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.o(n4) + n3;
    }

    public static int j(int n3) {
        return CodedOutputStream.x(n3) + 4;
    }

    public static int k(int n3) {
        return CodedOutputStream.x(n3) + 8;
    }

    public static int l(int n3) {
        return CodedOutputStream.x(n3) + 4;
    }

    public static int m(int n3, wo1_1 wo1_12, st2_0 st2_02) {
        n3 = CodedOutputStream.x(n3) * 2;
        return ((a_0)wo1_12).c(st2_02) + n3;
    }

    public static int n(int n3, int n4) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.o(n4) + n3;
    }

    public static int o(int n3) {
        if (n3 >= 0) {
            return CodedOutputStream.z(n3);
        }
        return 10;
    }

    public static int p(int n3, long l2) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.B(l2) + n3;
    }

    public static int q(yq1_0 object) {
        int n3;
        Object object2 = ((yq1_0)object).b;
        if (object2 != null) {
            object = ((yq1_0)object).b;
            n3 = ((DF)object).size();
        } else {
            object2 = ((yq1_0)object).a;
            if (object2 != null) {
                object = ((yq1_0)object).a;
                n3 = object.getSerializedSize();
            } else {
                n3 = 0;
                object = null;
            }
        }
        return CodedOutputStream.z(n3) + n3;
    }

    public static int r(int n3) {
        return CodedOutputStream.x(n3) + 4;
    }

    public static int s(int n3) {
        return CodedOutputStream.x(n3) + 8;
    }

    public static int t(int n3, int n4) {
        n3 = CodedOutputStream.x(n3);
        int n7 = n4 << 1;
        return CodedOutputStream.z(n4 >> 31 ^ n7) + n3;
    }

    public static int u(int n3, long l2) {
        n3 = CodedOutputStream.x(n3);
        long l3 = l2 << 1;
        return CodedOutputStream.B(l2 >> 63 ^ l3) + n3;
    }

    public static int v(int n3, String string2) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.w(string2) + n3;
    }

    public static int w(String object) {
        int n3;
        try {
            n3 = K.b((CharSequence)object);
        }
        catch (K$d k$d) {
            Charset charset = p.a;
            object = ((String)object).getBytes(charset);
            n3 = ((Object)object).length;
        }
        return CodedOutputStream.z(n3) + n3;
    }

    public static int x(int n3) {
        return CodedOutputStream.z(n3 << 3);
    }

    public static int y(int n3, int n4) {
        n3 = CodedOutputStream.x(n3);
        return CodedOutputStream.z(n4) + n3;
    }

    public static int z(int n3) {
        int n4 = n3 & 0xFFFFFF80;
        if (n4 == 0) {
            return 1;
        }
        n4 = n3 & 0xFFFFC000;
        if (n4 == 0) {
            return 2;
        }
        n4 = 0xFFE00000 & n3;
        if (n4 == 0) {
            return 3;
        }
        n4 = -268435456;
        if ((n3 &= n4) == 0) {
            return 4;
        }
        return 5;
    }

    public final void C(String object, K$d object2) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        block6: {
            Level level = Level.WARNING;
            String string2 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!";
            Logger logger = b;
            logger.log(level, string2, (Throwable)object2);
            object2 = p.a;
            object = ((String)object).getBytes((Charset)object2);
            int n3 = ((Object)object).length;
            this.W(n3);
            n3 = ((Object)object).length;
            level = null;
            try {
                this.d((byte[])object, 0, n3);
                return;
            }
            catch (CodedOutputStream$OutOfSpaceException codedOutputStream$OutOfSpaceException) {
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                break block6;
            }
            throw codedOutputStream$OutOfSpaceException;
        }
        object2 = new CodedOutputStream$OutOfSpaceException(indexOutOfBoundsException2);
        throw object2;
    }

    public abstract void D(byte var1);

    public abstract void E(int var1, boolean var2);

    public abstract void F(int var1, byte[] var2);

    public abstract void G(int var1, DF var2);

    public abstract void H(DF var1);

    public abstract void I(int var1, int var2);

    public abstract void J(int var1);

    public abstract void K(int var1, long var2);

    public abstract void L(long var1);

    public abstract void M(int var1, int var2);

    public abstract void N(int var1);

    public abstract void O(int var1, wo1_1 var2, st2_0 var3);

    public abstract void P(wo1_1 var1);

    public abstract void Q(int var1, wo1_1 var2);

    public abstract void R(int var1, DF var2);

    public abstract void S(int var1, String var2);

    public abstract void T(String var1);

    public abstract void U(int var1, int var2);

    public abstract void V(int var1, int var2);

    public abstract void W(int var1);

    public abstract void X(int var1, long var2);

    public abstract void Y(long var1);
}

