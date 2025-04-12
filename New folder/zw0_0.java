/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 */
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zW0
 */
public final class zw0_0 {
    public static final zW0$b a = zW0$b.c;

    public static zW0$b a(Fragment fragment) {
        while (fragment != null) {
            boolean bl2 = fragment.isAdded();
            if (bl2) {
                FragmentManager fragmentManager = fragment.getParentFragmentManager();
                String string2 = "declaringFragment.parentFragmentManager";
                Intrinsics.checkNotNullExpressionValue(fragmentManager, string2);
                fragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(zW0$b object, Violation violation) {
        Fragment fragment = violation.a;
        String string2 = fragment.getClass().getName();
        zW0$a zW0$a = zW0$a.PENALTY_LOG;
        object = ((zW0$b)object).a;
        object.contains((Object)zW0$a);
        zW0$a = zW0$a.PENALTY_DEATH;
        boolean bl2 = object.contains((Object)zW0$a);
        if (!bl2) return;
        object = new A1(string2, violation);
        boolean bl3 = fragment.isAdded();
        string2 = null;
        if (!bl3) {
            ((A1)object).run();
            throw null;
        }
        violation = fragment.getParentFragmentManager().x.c;
        fragment = violation.getLooper();
        boolean bl4 = Intrinsics.areEqual(fragment, (Object)(zW0$a = Looper.myLooper()));
        if (!bl4) {
            violation.post((Runnable)object);
            return;
        }
        ((A1)object).run();
        throw null;
    }

    public static void c(Violation object) {
        String string2 = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            object = ((Violation)object).a;
            object.getClass();
        }
    }

    public static final void d(Fragment object, String object2) {
        boolean bl2;
        Class<FragmentReuseViolation> clazz = "fragment";
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        Object object3 = "previousFragmentId";
        Intrinsics.checkNotNullParameter(object2, object3);
        Intrinsics.checkNotNullParameter(object, (String)((Object)clazz));
        Intrinsics.checkNotNullParameter(object2, object3);
        clazz = new Class<FragmentReuseViolation>("Attempting to reuse fragment ");
        ((StringBuilder)((Object)clazz)).append(object);
        ((StringBuilder)((Object)clazz)).append(" with previous ID ");
        ((StringBuilder)((Object)clazz)).append((String)object2);
        object2 = ((StringBuilder)((Object)clazz)).toString();
        FragmentReuseViolation fragmentReuseViolation = new Violation((Fragment)object, (String)object2);
        zw0_0.c(fragmentReuseViolation);
        object2 = zw0_0.a((Fragment)object);
        clazz = ((zW0$b)object2).a;
        object3 = zW0$a.DETECT_FRAGMENT_REUSE;
        boolean bl3 = clazz.contains(object3);
        if (bl3 && (bl2 = zw0_0.e((zW0$b)object2, (Class)(object = object.getClass()), clazz = FragmentReuseViolation.class))) {
            zw0_0.b((zW0$b)object2, fragmentReuseViolation);
        }
    }

    public static boolean e(zW0$b object, Class object2, Class clazz) {
        Class clazz2;
        object2 = ((Class)object2).getName();
        object = (Set)((zW0$b)object).b.get(object2);
        boolean bl2 = true;
        if (object == null) {
            return bl2;
        }
        Object object3 = clazz.getSuperclass();
        boolean bl3 = Intrinsics.areEqual(object3, clazz2 = Violation.class);
        if (!bl3) {
            object3 = object;
            object3 = (Iterable)object;
            clazz2 = clazz.getSuperclass();
            bl3 = CollectionsKt.F((Iterable)object3, clazz2);
            if (bl3) {
                return false;
            }
        }
        return object.contains(clazz) ^ bl2;
    }
}

