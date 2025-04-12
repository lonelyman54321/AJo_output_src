/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.view.View
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import com.bumptech.glide.manager.FirstFrameWaiter;
import java.util.List;

public final class dK2
implements Handler.Callback {
    public static final dK2$a f;
    public volatile RequestManager a;
    public final dK2$b b;
    public final Jp c;
    public final TW0 d;
    public final pu1_0 e;

    static {
        dK2$a dK2$a;
        f = dK2$a = new Object();
    }

    public dK2(dK2$b object) {
        Object object2 = new Jp();
        this.c = object2;
        if (object == null) {
            object = f;
        }
        this.b = object;
        this.e = object2 = new pu1_0((dK2$b)object);
        boolean bl2 = M31.f;
        object = bl2 && (bl2 = M31.e) ? new FirstFrameWaiter() : new Object();
        this.d = object;
    }

    public static Activity a(Context context) {
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            return (Activity)context;
        }
        bl2 = context instanceof ContextWrapper;
        if (bl2) {
            return dK2.a(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }

    public static void b(List object, Jp jp) {
        boolean bl2;
        if (object == null) {
            return;
        }
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            View view;
            Object object2 = (Fragment)object.next();
            if (object2 == null || (view = ((Fragment)object2).getView()) == null) continue;
            view = ((Fragment)object2).getView();
            jp.put(view, object2);
            object2 = ((Fragment)object2).getChildFragmentManager().c.f();
            dK2.b((List)object2, jp);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final RequestManager c(Context object) {
        boolean bl2;
        Object object2;
        if (object == null) {
            object = new IllegalArgumentException("You cannot start a load on a null Context");
            throw object;
        }
        Object object3 = dz3.a;
        object3 = Looper.myLooper();
        if (object3 == (object2 = Looper.getMainLooper()) && !(bl2 = object instanceof Application)) {
            bl2 = object instanceof FragmentActivity;
            if (bl2) {
                object = (FragmentActivity)object;
                return this.d((FragmentActivity)object);
            }
            bl2 = object instanceof ContextWrapper;
            if (bl2) {
                object3 = object;
                object3 = (ContextWrapper)object;
                object2 = object3.getBaseContext().getApplicationContext();
                if (object2 != null) {
                    object = object3.getBaseContext();
                    return this.c((Context)object);
                }
            }
        }
        if ((object3 = (Object)this.a) != null) return this.a;
        synchronized (this) {
            try {
                object3 = this.a;
                if (object3 != null) return this.a;
                object3 = object.getApplicationContext();
                object3 = com.bumptech.glide.a.a((Context)object3);
                object2 = this.b;
                Pq3 pq3 = new Object();
                rz0_1 rz0_12 = new Object();
                object = object.getApplicationContext();
                object = object2.a((a)object3, pq3, rz0_12, (Context)object);
                this.a = object;
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final RequestManager d(FragmentActivity object) {
        boolean bl2;
        Object object2 = dz3.a;
        object2 = Looper.myLooper();
        Looper looper = Looper.getMainLooper();
        boolean bl3 = true;
        if (object2 == looper) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl2 ^= bl3) {
            object = object.getApplicationContext();
            return this.c((Context)object);
        }
        bl2 = object.isDestroyed();
        if (!bl2) {
            this.d.b((Activity)object);
            object2 = dK2.a((Context)object);
            boolean bl4 = object2 == null || !(bl2 = object2.isFinishing());
            a a2 = com.bumptech.glide.a.a(object.getApplicationContext());
            i i3 = ((ComponentActivity)object).getLifecycle();
            FragmentManager fragmentManager = ((FragmentActivity)object).getSupportFragmentManager();
            return this.e.a((Context)object, a2, i3, fragmentManager, bl4);
        }
        object = new IllegalArgumentException("You cannot start a load for a destroyed activity");
        throw object;
    }

    public final boolean handleMessage(Message message) {
        return false;
    }
}

