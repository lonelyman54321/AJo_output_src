/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.encoding;

import kotlinx.serialization.descriptors.SerialDescriptor;

public interface Encoder {
    public void B(b03_0 var1, Object var2);

    public void C(char var1);

    public void D();

    public void J(int var1);

    public void N(String var1);

    public i0_0 a();

    public u30_0 c(SerialDescriptor var1);

    public void f(double var1);

    public void g(byte var1);

    public u30_0 i(SerialDescriptor var1, int var2);

    public void m(SerialDescriptor var1, int var2);

    public Encoder o(SerialDescriptor var1);

    public void q(long var1);

    public void u();

    public void w(short var1);

    public void x(boolean var1);

    public void z(float var1);
}

