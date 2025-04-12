/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XW
 */
public final class xw_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final ww_0 a(zd1_2 object) {
        void var0_9;
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof zd1.c_0;
        if (bl2) {
            WW$c wW$c = WW$c.a;
            return var0_9;
        }
        bl2 = object instanceof zd1.b_0;
        if (bl2) {
            WW$b wW$b = WW$b.a;
            return var0_9;
        }
        bl2 = object instanceof zd1$d_0;
        Object object3 = null;
        if (bl2) {
            zd1$d_0 zd1$d_0 = (zd1$d_0)object;
            Object object4 = zd1$d_0.a;
            boolean bl3 = object4 instanceof Drawable;
            if (bl3) {
                object3 = object4;
                object3 = (Drawable)object4;
            }
            qi0_1 qi0_12 = zd1$d_0.b;
            object2 = new WW$d((Drawable)object3, qi0_12);
        } else {
            bl2 = object instanceof zd1$a_0;
            if (!bl2) {
                NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                throw noWhenBranchMatchedException;
            }
            zd1$a_0 zd1$a_0 = (zd1$a_0)object;
            Object object5 = zd1$a_0.a;
            boolean bl4 = object5 instanceof Drawable;
            if (bl4) {
                object3 = object5;
                object3 = (Drawable)object5;
            }
            Throwable throwable = zd1$a_0.b;
            object2 = new WW$a((Drawable)object3, throwable);
        }
        Object object6 = object2;
        return var0_9;
    }
}

