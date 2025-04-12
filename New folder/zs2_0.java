/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

/*
 * Renamed from zs2
 */
public final class zs2_0 {
    public D3$f a;
    public int b;
    public boolean c;
    public D3$b d;
    public boolean e;
    public long f;

    public zs2_0() {
        Object object = D3$c.a;
        this.a = object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        n3 = n3 >= n4 || n3 >= (n4 = 30) && (n3 = C3.a()) >= (n4 = 2) ? A3.a() : -1 >>> 1;
        this.b = n3;
        this.d = object = D3$b$a.a;
    }
}

