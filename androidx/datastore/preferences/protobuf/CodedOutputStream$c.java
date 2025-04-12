/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.CodedOutputStream$a;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$d;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.a_0;
import java.io.OutputStream;

public final class CodedOutputStream$c
extends CodedOutputStream$a {
    public final OutputStream g;

    public CodedOutputStream$c(X53$b x53$b, int n3) {
        super(n3);
        this.g = x53$b;
    }

    public final void D(byte by2) {
        int n3 = this.f;
        int n4 = this.e;
        if (n3 == n4) {
            this.e0();
        }
        n3 = this.f;
        this.f = n4 = n3 + 1;
        this.d[n3] = by2;
    }

    public final void E(int n3, boolean bl2) {
        int n4;
        this.f0(11);
        this.b0(n3, 0);
        n3 = (byte)(bl2 ? 1 : 0);
        int n7 = this.f;
        this.f = n4 = n7 + 1;
        this.d[n7] = n3;
    }

    public final void F(int n3, byte[] byArray) {
        this.W(n3);
        this.g0(byArray, 0, n3);
    }

    public final void G(int n3, DF dF) {
        this.U(n3, 2);
        this.H(dF);
    }

    public final void H(DF dF) {
        int n3 = dF.size();
        this.W(n3);
        dF.h(this);
    }

    public final void I(int n3, int n4) {
        this.f0(14);
        this.b0(n3, 5);
        this.Z(n4);
    }

    public final void J(int n3) {
        this.f0(4);
        this.Z(n3);
    }

    public final void K(int n3, long l2) {
        this.f0(18);
        this.b0(n3, 1);
        this.a0(l2);
    }

    public final void L(long l2) {
        this.f0(8);
        this.a0(l2);
    }

    public final void M(int n3, int n4) {
        this.f0(20);
        this.b0(n3, 0);
        if (n4 >= 0) {
            this.c0(n4);
        } else {
            long l2 = n4;
            this.d0(l2);
        }
    }

    public final void N(int n3) {
        if (n3 >= 0) {
            this.W(n3);
        } else {
            long l2 = n3;
            this.Y(l2);
        }
    }

    public final void O(int n3, wo1_1 wo1_12, st2_0 st2_02) {
        this.U(n3, 2);
        Object object = wo1_12;
        n3 = ((a_0)wo1_12).c(st2_02);
        this.W(n3);
        object = this.a;
        st2_02.b(wo1_12, (L)object);
    }

    public final void P(wo1_1 wo1_12) {
        int n3 = wo1_12.getSerializedSize();
        this.W(n3);
        wo1_12.d(this);
    }

    public final void Q(int n3, wo1_1 wo1_12) {
        int n4 = 1;
        int n7 = 3;
        this.U(n4, n7);
        int n8 = 2;
        this.V(n8, n3);
        this.U(n7, n8);
        this.P(wo1_12);
        this.U(n4, 4);
    }

    public final void R(int n3, DF dF) {
        int n4 = 1;
        int n7 = 3;
        this.U(n4, n7);
        this.V(2, n3);
        this.G(n7, dF);
        this.U(n4, 4);
    }

    public final void S(int n3, String string2) {
        this.U(n3, 2);
        this.T(string2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T(String var1_1) {
        block11: {
            block13: {
                block12: {
                    try {
                        var2_2 = var1_1.length() * 3;
                    }
                    catch (K$d var9_11) {
                        break block11;
                    }
                    {
                        var3_3 = CodedOutputStream.z(var2_2);
                        var4_4 = var3_3 + var2_2;
                        var5_5 = this.e;
                        if (var4_4 <= var5_5) break block12;
                    }
                    var6_6 = new byte[var2_2];
                    var7_8 = K.a;
                    var5_5 = 0;
                    var8_9 = null;
                    var2_2 = var7_8.b(var1_1, var6_6, 0, var2_2);
                    this.W(var2_2);
                    this.g0(var6_6, 0, var2_2);
                    return;
                }
                var2_2 = this.f;
                if (var4_4 <= (var2_2 = var5_5 - var2_2)) ** GOTO lbl22
                {
                    this.e0();
lbl22:
                    // 2 sources

                    var2_2 = var1_1.length();
                    var2_2 = CodedOutputStream.z(var2_2);
                    var4_4 = this.f;
                    var10_14 = this.d;
                    if (var2_2 != var3_3) break block13;
                    var3_3 = var4_4 + var2_2;
                }
                try {
                    this.f = var3_3;
                    var5_5 -= var3_3;
                }
                catch (ArrayIndexOutOfBoundsException var9_12) {
                    ** GOTO lbl-1000
                }
                catch (K$d var9_13) {
                    ** GOTO lbl52
                }
                {
                    var11_15 = K.a;
                    var3_3 = var11_15.b(var1_1, var10_14, var3_3, var5_5);
                    this.f = var4_4;
                    var5_5 = var3_3 - var4_4 - var2_2;
                }
                this.c0(var5_5);
                this.f = var3_3;
                return;
            }
            var2_2 = K.b(var1_1);
            this.c0(var2_2);
            var3_3 = this.f;
            var8_10 = K.a;
            this.f = var2_2 = var8_10.b(var1_1, var10_14, var3_3, var2_2);
            return;
lbl-1000:
            // 1 sources

            {
                var6_7 = new CodedOutputStream$OutOfSpaceException(var9_12);
                throw var6_7;
lbl52:
                // 1 sources

                this.f = var4_4;
                throw var9_13;
            }
        }
        this.C(var1_1, var9_11);
    }

    public final void U(int n3, int n4) {
        n3 = n3 << 3 | n4;
        this.W(n3);
    }

    public final void V(int n3, int n4) {
        this.f0(20);
        this.b0(n3, 0);
        this.c0(n4);
    }

    public final void W(int n3) {
        this.f0(5);
        this.c0(n3);
    }

    public final void X(int n3, long l2) {
        this.f0(20);
        this.b0(n3, 0);
        this.d0(l2);
    }

    public final void Y(long l2) {
        this.f0(10);
        this.d0(l2);
    }

    public final void d(byte[] byArray, int n3, int n4) {
        this.g0(byArray, n3, n4);
    }

    public final void e0() {
        int n3 = this.f;
        OutputStream outputStream = this.g;
        byte[] byArray = this.d;
        outputStream.write(byArray, 0, n3);
        this.f = 0;
    }

    public final void f0(int n3) {
        int n4 = this.e;
        int n7 = this.f;
        if ((n4 -= n7) < n3) {
            this.e0();
        }
    }

    public final void g0(byte[] byArray, int n3, int n4) {
        int n7 = this.f;
        int n8 = this.e;
        int n10 = n8 - n7;
        byte[] byArray2 = this.d;
        if (n10 >= n4) {
            int n14;
            System.arraycopy(byArray, n3, byArray2, n7, n4);
            this.f = n14 = this.f + n4;
        } else {
            System.arraycopy(byArray, n3, byArray2, n7, n10);
            n3 += n10;
            this.f = n8;
            this.e0();
            if ((n4 -= n10) <= n8) {
                n7 = 0;
                Object var9_9 = null;
                System.arraycopy(byArray, n3, byArray2, 0, n4);
                this.f = n4;
            } else {
                OutputStream outputStream = this.g;
                outputStream.write(byArray, n3, n4);
            }
        }
    }
}

