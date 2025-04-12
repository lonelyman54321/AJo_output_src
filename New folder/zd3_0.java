/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zd3
 */
public abstract class zd3_0 {
    public final o72 a;
    public wp3 b;
    public gi0_0 c;
    public q72 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public Zd3$a j;
    public long k;
    public boolean l;
    public boolean m;

    public zd3_0() {
        Object object = new o72();
        this.a = object;
        this.j = object = new Object();
    }

    public void a(long l2) {
        this.g = l2;
    }

    public abstract long b(Xm2 var1);

    public abstract boolean c(Xm2 var1, long var2, Zd3$a var4);

    public void d(boolean bl2) {
        long l2 = 0L;
        if (bl2) {
            Zd3$a zd3$a;
            this.j = zd3$a = new Object();
            this.f = l2;
            bl2 = false;
            zd3$a = null;
            this.h = 0;
        } else {
            bl2 = true;
            this.h = (int)(bl2 ? 1 : 0);
        }
        this.e = -1;
        this.g = l2;
    }
}

