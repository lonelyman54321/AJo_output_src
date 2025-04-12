/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.LiveData$1;
import androidx.lifecycle.LiveData$a;
import androidx.lifecycle.LiveData$b;
import androidx.lifecycle.LiveData$c;
import androidx.lifecycle.i$b;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class LiveData {
    public static final Object k;
    public final Object a;
    public final CR2 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    static {
        Object object;
        k = object = new Object();
    }

    public LiveData() {
        Object object;
        this.a = object = new Object();
        this.b = object = new CR2();
        this.c = 0;
        this.f = object = k;
        LiveData$1 liveData$1 = new LiveData$1(this);
        this.j = liveData$1;
        this.e = object;
        this.g = -1;
    }

    public LiveData(Object object) {
        Object object2;
        Object object3;
        this.a = object3 = new Object();
        this.b = object3 = new CR2();
        this.c = 0;
        this.f = object2 = k;
        this.j = object2 = new LiveData$1(this);
        this.e = object;
        this.g = 0;
    }

    public static void a(String string2) {
        xp_0.Q().a.getClass();
        Object object = Looper.getMainLooper().getThread();
        Thread thread2 = Thread.currentThread();
        if (object == thread2) {
            return;
        }
        string2 = cP.a("Cannot invoke ", string2, " on a background thread");
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void b(LiveData$c object) {
        boolean n3 = ((LiveData$c)object).b;
        if (!n3) {
            return;
        }
        boolean bl2 = ((LiveData$c)object).e();
        if (!bl2) {
            ((LiveData$c)object).b(false);
            return;
        }
        int n4 = ((LiveData$c)object).c;
        int n7 = this.g;
        if (n4 >= n7) {
            return;
        }
        ((LiveData$c)object).c = n7;
        object = ((LiveData$c)object).a;
        Object object2 = this.e;
        object.onChanged(object2);
    }

    public final void c(LiveData$c liveData$c) {
        boolean bl2 = this.h;
        boolean bl3 = true;
        if (bl2) {
            this.i = bl3;
            return;
        }
        this.h = bl3;
        do {
            bl2 = false;
            this.i = false;
            if (liveData$c != null) {
                this.b(liveData$c);
                liveData$c = null;
                continue;
            }
            Object object = this.b;
            object.getClass();
            CR2$d cR2$d = new CR2$d((CR2)object);
            object = ((CR2)object).c;
            Boolean bl4 = Boolean.FALSE;
            ((WeakHashMap)object).put(cR2$d, bl4);
            while (bl3 = cR2$d.hasNext()) {
                object = (LiveData$c)((Map.Entry)cR2$d.next()).getValue();
                this.b((LiveData$c)object);
                bl3 = this.i;
                if (!bl3) continue;
            }
        } while (bl3 = this.i);
        this.h = false;
    }

    public final Object d() {
        Object object = this.e;
        Object object2 = k;
        if (object != object2) {
            return object;
        }
        return null;
    }

    public void e(mu1_1 object, F62 object2) {
        boolean bl2;
        LiveData.a("observe");
        Object object3 = object.getLifecycle().b();
        Object object4 = i$b.DESTROYED;
        if (object3 == object4) {
            return;
        }
        object4 = this.b;
        object3 = new LiveData$b(this, (mu1_1)object, (F62)object2);
        if ((object2 = (LiveData$c)((CR2)object4).c(object2, object3)) != null && !(bl2 = ((LiveData$c)object2).d((mu1_1)object))) {
            object = new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            throw object;
        }
        if (object2 != null) {
            return;
        }
        object.getLifecycle().a((lu1)object3);
    }

    public final void f(F62 object) {
        LiveData.a("observeForever");
        LiveData$a liveData$a = new LiveData$c(this, (F62)object);
        CR2 cR2 = this.b;
        object = (LiveData$c)cR2.c(object, liveData$a);
        boolean bl2 = object instanceof LiveData$b;
        if (!bl2) {
            if (object != null) {
                return;
            }
            liveData$a.b(true);
            return;
        }
        object = new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        throw object;
    }

    public void g() {
    }

    public void h() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void i(Object object) {
        boolean bl2;
        Object object2 = this.a;
        // MONITORENTER : object2
        Object object3 = this.f;
        Object object4 = k;
        if (object3 == object4) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        this.f = object;
        // MONITOREXIT : object2
        if (!bl2) {
            return;
        }
        object = xp_0.Q();
        object2 = this.j;
        ((xp_0)object).S((Runnable)object2);
    }

    public void j(F62 object) {
        LiveData.a("removeObserver");
        CR2 cR2 = this.b;
        object = (LiveData$c)cR2.d(object);
        if (object == null) {
            return;
        }
        ((LiveData$c)object).c();
        ((LiveData$c)object).b(false);
    }

    public void k(Object object) {
        int n3;
        LiveData.a("setValue");
        this.g = n3 = this.g + 1;
        this.e = object;
        this.c(null);
    }
}

