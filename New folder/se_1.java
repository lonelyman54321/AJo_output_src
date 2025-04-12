/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/*
 * Renamed from sE
 */
public interface se_1
extends a93_0,
ReadableByteChannel {
    public long E(ff_2 var1);

    public long H0();

    public String L();

    public long T();

    public ff_2 b0(long var1);

    public int d0(aa2_2 var1);

    public ce_2 e();

    public void f(long var1);

    public boolean g();

    public byte[] h0();

    public InputStream inputStream();

    public long j0(y63_0 var1);

    public boolean l(long var1, ff_2 var3);

    public ce_2 m();

    public byte readByte();

    public int readInt();

    public short readShort();

    public boolean request(long var1);

    public void skip(long var1);

    public String t0(Charset var1);

    public String x(long var1);

    public int x0();
}

