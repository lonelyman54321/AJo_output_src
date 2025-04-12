/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.SystemClock
 */
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class DZ0 {
    public final wz0_0 a;
    public final Handler b;
    public final ArrayList c;
    public final RequestManager d;
    public final ny_0 e;
    public boolean f;
    public boolean g;
    public rj2_0 h;
    public DZ0$a i;
    public boolean j;
    public DZ0$a k;
    public Bitmap l;
    public xq3_0 m;
    public DZ0$a n;
    public int o;
    public int p;
    public int q;

    public DZ0(a object, qb3_1 qb3_12, int n3, int n4, cw3 cw32, Bitmap bitmap) {
        ny_0 ny_02 = ((a)object).b;
        object = ((a)object).d;
        Object object2 = com.bumptech.glide.a.e(object.getBaseContext());
        object = com.bumptech.glide.a.e(object.getBaseContext()).f();
        Nq0$b nq0$b = Nq0.a;
        fk2_0 fk2_02 = new fk2_0();
        Cloneable cloneable = ((fk2_0)((fk2_0)((fk2_0)fk2_02.j(nq0$b)).K()).E(true)).w(n3, n4);
        object = ((rj2_0)object).M((uw_0)cloneable);
        this.c = cloneable;
        this.d = object2;
        Looper looper = Looper.getMainLooper();
        object2 = new DZ0$c(this);
        super(looper, (Handler.Callback)object2);
        this.e = ny_02;
        this.b = cloneable;
        this.h = object;
        this.a = qb3_12;
        this.c(cw32, bitmap);
    }

    public final void a() {
        boolean bl2 = this.f;
        if (bl2 && !(bl2 = this.g)) {
            Object object = this.n;
            if (object != null) {
                this.n = null;
                this.b((DZ0$a)object);
                return;
            }
            this.g = bl2 = true;
            object = this.a;
            int n3 = object.d();
            long l2 = SystemClock.uptimeMillis();
            long l3 = n3;
            object.b();
            Handler handler = this.b;
            int n4 = object.e();
            Object object2 = new DZ0$a(handler, n4, l2 += l3);
            this.k = object2;
            object2 = this.h;
            double d2 = Math.random();
            Object object3 = d2;
            Object object4 = new k62(object3);
            object3 = new fk2_0();
            object4 = (fk2_0)((uw_0)object3).D((qn1_0)object4);
            object = ((rj2_0)object2).M((uw_0)object4).U(object);
            object2 = this.k;
            object4 = iE0.a;
            ((rj2_0)object).P((ki3_1)object2, null, (uw_0)object, (Executor)object4);
        }
    }

    public final void b(DZ0$a object) {
        Object object2 = null;
        this.g = false;
        boolean bl2 = this.j;
        int n3 = 2;
        Handler handler = this.b;
        if (bl2) {
            handler.obtainMessage(n3, object).sendToTarget();
            return;
        }
        bl2 = this.f;
        if (!bl2) {
            this.n = object;
            return;
        }
        object2 = ((DZ0$a)object).g;
        if (object2 != null) {
            object2 = this.l;
            if (object2 != null) {
                ny_0 ny_02 = this.e;
                ny_02.d((Bitmap)object2);
                bl2 = false;
                object2 = null;
                this.l = null;
            }
            object2 = this.i;
            this.i = object;
            object = this.c;
            for (int i3 = ((ArrayList)object).size() + -1; i3 >= 0; i3 += -1) {
                DZ0$b dZ0$b = (DZ0$b)((ArrayList)object).get(i3);
                dZ0$b.a();
            }
            if (object2 != null) {
                object = handler.obtainMessage(n3, object2);
                object.sendToTarget();
            }
        }
        this.a();
    }

    public final void c(xq3_0 object, Bitmap bitmap) {
        int n3;
        Object object2 = "Argument must not be null";
        dV0.c(object, (String)object2);
        this.m = object;
        dV0.c(bitmap, (String)object2);
        this.l = bitmap;
        object2 = this.h;
        fk2_0 fk2_02 = new fk2_0();
        object = fk2_02.I((xq3_0)object, true);
        this.h = object = ((rj2_0)object2).M((uw_0)object);
        this.o = n3 = dz3.c(bitmap);
        this.p = n3 = bitmap.getWidth();
        this.q = n3 = bitmap.getHeight();
    }
}

