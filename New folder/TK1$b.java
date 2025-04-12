/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;

public final class TK1$b {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public byte[] O;
    public int P;
    public int Q;
    public int R;
    public long S;
    public long T;
    public zs3 U;
    public boolean V;
    public boolean W;
    public String X;
    public wp3 Y;
    public int Z;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public wp3.a j;
    public byte[] k;
    public DrmInitData l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public float v;
    public byte[] w;
    public int x;
    public boolean y;
    public int z;

    public TK1$b() {
        long l2;
        int n3;
        float f5;
        int n4;
        this.m = n4 = -1;
        this.n = n4;
        this.o = n4;
        this.p = n4;
        this.q = n4;
        this.r = 0;
        this.s = n4;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = null;
        this.x = n4;
        this.y = false;
        this.z = n4;
        this.A = n4;
        this.B = n4;
        this.C = 1000;
        this.D = 200;
        this.E = f5 = -1.0f;
        this.F = f5;
        this.G = f5;
        this.H = f5;
        this.I = f5;
        this.J = f5;
        this.K = f5;
        this.L = f5;
        this.M = f5;
        this.N = f5;
        this.P = n3 = 1;
        this.Q = n4;
        this.R = 8000;
        this.S = l2 = 0L;
        this.T = l2;
        this.W = n3;
        this.X = "eng";
    }

    public final byte[] a(String string2) {
        Object object = this.k;
        if (object != null) {
            return object;
        }
        object = new StringBuilder;
        object("Missing CodecPrivate for codec ");
        object.append(string2);
        throw ParserException.a(object.toString(), null);
    }
}

