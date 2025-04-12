/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  androidx.window.extensions.layout.WindowLayoutComponent
 */
import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;

public final class JR2 {
    public static final JR2 a;
    public static final hh3_2 b;

    static {
        JR2 jR2;
        a = jR2 = new JR2();
        b = yr1_2.b(JR2$a.c);
    }

    public static final boolean a(JR2 object, ClassLoader classLoader) {
        object.getClass();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        boolean bl2 = false;
        if (n3 >= n4 && (n3 = (int)(JR2.c((Function0)(object = new ir2_0(classLoader))) ? 1 : 0)) != 0 && (n3 = (int)(JR2.c((Function0)(object = new y70_0(classLoader, n4 = 1))) ? 1 : 0)) != 0 && (n3 = (int)(JR2.c((Function0)(object = new hr2_1(classLoader))) ? 1 : 0)) != 0 && (n3 = (int)(JR2.c((Function0)(object = new fr2_1(classLoader))) ? 1 : 0)) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static WindowLayoutComponent b() {
        return (WindowLayoutComponent)b.getValue();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(Function0 object) {
        boolean bl2 = false;
        object = object.invoke();
        object = (Boolean)object;
        try {
            return (Boolean)object;
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            return bl2;
        }
    }
}

