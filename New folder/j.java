/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

public final class j {
    public static final Om0 a;

    static {
        Om0 om0;
        a = om0 = new Om0(0);
    }

    public static final boolean a(pe1_0 object) {
        boolean bl2;
        block0: {
            block1: {
                block2: {
                    Object object2 = j$a.$EnumSwitchMapping$0;
                    int bl22 = ((pe1_0)object).i.ordinal();
                    int n3 = object2[bl22];
                    boolean bl3 = false;
                    int n4 = 1;
                    if (n3 == n4) break block0;
                    int n7 = 2;
                    if (n3 == n7) break block1;
                    n7 = 3;
                    if (n3 != n7) break block2;
                    object2 = ((pe1_0)object).L.b;
                    L63 l63 = ((pe1_0)object).B;
                    if ((object2 != null || (n3 = l63 instanceof wr0_1) == 0) && ((n3 = (object = ((pe1_0)object).c) instanceof nd3_0) == 0 || (n3 = l63 instanceof id3_1) == 0 || (n3 = (object2 = (Object)(object = (nd3_0)object).getView()) instanceof ImageView) == 0 || (object = object.getView()) != (object2 = (Object)(l63 = (id3_1)l63).getView()))) break block0;
                    break block1;
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final Drawable b(pe1_0 object, Drawable object2, Integer n3, Drawable drawable2) {
        void var2_7;
        void var1_6;
        if (object2 != null) return var1_6;
        if (var2_7 == null) {
            void var3_8;
            void var1_5 = var3_8;
            return var1_6;
        }
        int n4 = var2_7.intValue();
        if (n4 == 0) {
            return var1_6;
        }
        object = ((pe1_0)object).a;
        n4 = var2_7.intValue();
        if ((object = xn.a((Context)object, n4)) != null) {
            Object object3 = object;
            return var1_6;
        }
        object = hj0_0.a(n4, "Invalid resource ID: ");
        object = object.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

