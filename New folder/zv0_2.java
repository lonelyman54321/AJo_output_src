/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;

/*
 * Renamed from ZV0
 */
public final class zv0_2
implements az0_2 {
    public volatile vh0_0 a;
    public final Object b;
    public final Fragment c;

    public zv0_2(Fragment fragment) {
        Object object;
        this.b = object = new Object();
        this.c = fragment;
    }

    public static final Context b(Context context) {
        boolean bl2;
        while ((bl2 = context instanceof ContextWrapper) && !(bl2 = context instanceof Activity)) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        return context;
    }

    public final vh0_0 a() {
        Object object = this.c;
        Object object2 = ((Fragment)object).getHost();
        if (object2 != null) {
            boolean bl2 = ((Fragment)object).getHost() instanceof az0_2;
            Class<?> clazz = ((Fragment)object).getHost().getClass();
            Object[] objectArray = new Object[]{clazz};
            mx2_2.a(bl2, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", objectArray);
            object = ((Fragment)object).getHost();
            object = ((ZV0$a)da0_2.a(ZV0$a.class, object)).b();
            object.getClass();
            object = ((Uh0)object).a;
            object2 = new vh0_0((Rh0)object);
            return object2;
        }
        object = new NullPointerException("Hilt Fragments must be attached before creating the component.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object generatedComponent() {
        Object object = this.a;
        if (object != null) return this.a;
        object = this.b;
        synchronized (object) {
            try {
                vh0_0 vh0_02 = this.a;
                if (vh0_02 != null) return this.a;
                this.a = vh0_02 = this.a();
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

