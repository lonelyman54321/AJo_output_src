/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 */
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d82
 */
public final class d82_0 {
    public final Runnable a;
    public final p60_0 b;
    public final fp_2 c;
    public W72 d;
    public final OnBackInvokedCallback e;
    public OnBackInvokedDispatcher f;
    public boolean g;
    public boolean h;

    public d82_0() {
        this(null);
    }

    public d82_0(Runnable object) {
        this.a = object;
        this.b = null;
        this.c = object = new fp_2();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            Object object2;
            n4 = 34;
            if (n3 >= n4) {
                object = new X72(this);
                Y72 y72 = new Y72(this, 0);
                Z72 z72 = new Z72(this);
                a82 a822 = new a82(this);
                Intrinsics.checkNotNullParameter(object, "onBackStarted");
                Intrinsics.checkNotNullParameter(y72, "onBackProgressed");
                Intrinsics.checkNotNullParameter(z72, "onBackInvoked");
                Intrinsics.checkNotNullParameter(a822, "onBackCancelled");
                object2 = new e82((X72)object, y72, z72, a822);
            } else {
                object = new b82_0(this);
                String string2 = "onBackInvoked";
                Intrinsics.checkNotNullParameter(object, string2);
                object2 = new c82((b82_0)object);
            }
            this.e = object2;
        }
    }

    public final void a(mu1_1 object, W72 w72) {
        Intrinsics.checkNotNullParameter(object, "owner");
        Intrinsics.checkNotNullParameter(w72, "onBackPressedCallback");
        object = object.getLifecycle();
        Object object2 = ((i)object).b();
        Object object3 = i$b.DESTROYED;
        if (object2 == object3) {
            return;
        }
        object2 = new d82$c(this, (i)object, w72);
        w72.addCancellable((al_0)object2);
        this.f();
        object3 = object;
        object = new FunctionReferenceImpl(0, this, d82_0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        w72.setEnabledChangedCallback$activity_release((Function0)object);
    }

    public final d82$d b(W72 w72) {
        Intrinsics.checkNotNullParameter(w72, "onBackPressedCallback");
        this.c.addLast(w72);
        d82$d d82$d = new d82$d(this, w72);
        w72.addCancellable(d82$d);
        this.f();
        f82 f822 = new FunctionReferenceImpl(0, this, d82_0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        w72.setEnabledChangedCallback$activity_release(f822);
        return d82$d;
    }

    public final void c() {
        Object object = this.d;
        if (object == null) {
            Object e2;
            block3: {
                object = this.c;
                int n3 = object.size();
                object = object.listIterator(n3);
                while ((n3 = (int)(object.hasPrevious() ? 1 : 0)) != 0) {
                    e2 = object.previous();
                    Object object2 = e2;
                    object2 = (W72)e2;
                    boolean bl2 = ((W72)object2).isEnabled();
                    if (!bl2) continue;
                    break block3;
                }
                n3 = 0;
                e2 = null;
            }
            object = e2;
            object = (W72)e2;
        }
        this.d = null;
        if (object != null) {
            ((W72)object).handleOnBackCancelled();
        }
    }

    public final void d() {
        Object object = this.d;
        if (object == null) {
            Object e2;
            block4: {
                object = this.c;
                int n3 = object.size();
                object = object.listIterator(n3);
                while ((n3 = (int)(object.hasPrevious() ? 1 : 0)) != 0) {
                    e2 = object.previous();
                    Object object2 = e2;
                    object2 = (W72)e2;
                    boolean bl2 = ((W72)object2).isEnabled();
                    if (!bl2) continue;
                    break block4;
                }
                n3 = 0;
                e2 = null;
            }
            object = e2;
            object = (W72)e2;
        }
        this.d = null;
        if (object != null) {
            ((W72)object).handleOnBackPressed();
            return;
        }
        object = this.a;
        if (object != null) {
            object.run();
        }
    }

    public final void e(boolean bl2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f;
        OnBackInvokedCallback onBackInvokedCallback = this.e;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            boolean bl3;
            if (bl2 && !(bl3 = this.g)) {
                d82$a.a(onBackInvokedDispatcher, onBackInvokedCallback);
                this.g = bl2 = true;
            } else if (!bl2 && (bl2 = this.g)) {
                d82$a.b(onBackInvokedDispatcher, onBackInvokedCallback);
                bl2 = false;
                this.g = false;
            }
        }
    }

    public final void f() {
        int n3 = this.h;
        Object object = this.c;
        boolean bl2 = object instanceof Collection;
        int n4 = 0;
        if (!bl2 || !(bl2 = object.isEmpty())) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                W72 w72 = (W72)object.next();
                bl2 = w72.isEnabled();
                if (!bl2) continue;
                n4 = 1;
                break;
            }
        }
        this.h = n4;
        if (n4 != n3) {
            int n7;
            p60_0 p60_02 = this.b;
            if (p60_02 != null) {
                object = n4 != 0;
                p60_02.accept(object);
            }
            if ((n3 = Build.VERSION.SDK_INT) >= (n7 = 33)) {
                this.e(n4 != 0);
            }
        }
    }
}

