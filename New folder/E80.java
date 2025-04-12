/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  org.json.JSONObject
 */
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

public final class E80 {
    public static boolean u = false;
    public static WeakReference v;
    public static int w;
    public static int x;
    public long a;
    public boolean b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object n;
    public final HashMap o;
    public long p;
    public String q;
    public String r;
    public String s;
    public JSONObject t;

    public E80() {
        Object object;
        long l2;
        this.a = l2 = 0L;
        this.b = false;
        this.c = object = new Object();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.k = false;
        this.m = 0;
        HashMap hashMap = new HashMap();
        this.n = hashMap;
        this.o = hashMap = new HashMap();
        this.p = l2;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }

    public static Activity e() {
        WeakReference weakReference = v;
        weakReference = weakReference == null ? null : (Activity)weakReference.get();
        return weakReference;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            Object var1_1 = null;
            this.s = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Object var1_1 = null;
            this.r = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Object var1_1 = null;
            this.t = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d() {
        synchronized (this) {
            return this.s;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String f() {
        synchronized (this) {
            return this.q;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject g() {
        synchronized (this) {
            return this.t;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h() {
        Object object = this.c;
        synchronized (object) {
            return this.b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(boolean bl2) {
        Object object = this.c;
        synchronized (object) {
            this.b = bl2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        String string3 = this.s;
                        if (string3 != null) break block4;
                        this.s = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(boolean bl2) {
        Object object = this.n;
        synchronized (object) {
            this.e = bl2;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        String string3 = this.r;
                        if (string3 != null) break block4;
                        this.r = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        String string3 = this.q;
                        if (string3 != null) break block4;
                        this.q = string2;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(JSONObject jSONObject) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        JSONObject jSONObject2 = this.t;
                        if (jSONObject2 != null) break block4;
                        this.t = jSONObject;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

