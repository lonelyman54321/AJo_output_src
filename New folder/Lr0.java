/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Parcelable
 *  android.util.Size
 *  android.util.SizeF
 *  android.util.SparseArray
 */
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

public final class Lr0 {
    public static final Class[] a;

    static {
        Class[] classArray = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
        a = classArray;
    }

    public static final boolean a(Object object) {
        int n3;
        boolean bl2 = object instanceof g83_0;
        boolean bl3 = true;
        if (bl2) {
            object = (g83_0)object;
            I83 i83 = object.a();
            J83.h();
            I83 i832 = wv1_0.b;
            if (i83 != i832) {
                i83 = object.a();
                J83.l();
                i832 = qi_2.b;
                if (i83 != i832) {
                    i83 = object.a();
                    J83.i();
                    i832 = vf_1.b;
                    if (i83 != i832) {
                        return false;
                    }
                }
            }
            if ((object = object.getValue()) != null) {
                bl3 = Lr0.a(object);
            }
            return bl3;
        }
        bl2 = object instanceof fx0_2;
        if (bl2 && (bl2 = object instanceof Serializable)) {
            return false;
        }
        Class[] classArray = a;
        Object var4_6 = null;
        for (int i3 = 0; i3 < (n3 = 7); ++i3) {
            Class clazz = classArray[i3];
            n3 = clazz.isInstance(object) ? 1 : 0;
            if (n3 == 0) continue;
            return bl3;
        }
        return false;
    }
}

