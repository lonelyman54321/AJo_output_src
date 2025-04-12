/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from SH
 */
public abstract class sh_1
extends a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Oa() {
        boolean bl2;
        boolean bl3;
        Object object = this.getActivity();
        boolean bl4 = true;
        if (object == null || (bl3 = object.isFinishing()) || (bl2 = object.isDestroyed())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        AtomicBoolean atomicBoolean = this.f;
        if (!bl2 && !(bl2 = atomicBoolean.get()) && (object = this.getFragmentManager()) != null) {
            androidx.fragment.app.a a2 = new androidx.fragment.app.a((FragmentManager)object);
            try {
                a2.i(this);
                a2.d();
            }
            catch (IllegalStateException illegalStateException) {
                a2 = new androidx.fragment.app.a((FragmentManager)object);
                a2.i(this);
                a2.o(bl4, bl4);
            }
        }
        atomicBoolean.set(bl4);
    }

    public final void Qa() {
        Object object = this.b;
        if (object != null) {
            WeakReference<Object> weakReference;
            object = com.clevertap.android.sdk.a.k((Context)this.c, (CleverTapInstanceConfig)object).b.k;
            this.g = weakReference = new WeakReference<Object>(object);
        }
    }

    public final void onStart() {
        super.onStart();
        AtomicBoolean atomicBoolean = this.f;
        boolean bl2 = atomicBoolean.get();
        if (bl2) {
            this.Oa();
        }
    }
}

