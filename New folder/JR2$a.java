/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.window.extensions.WindowExtensionsProvider
 *  androidx.window.extensions.layout.WindowLayoutComponent
 */
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class JR2$a
extends Lambda
implements Function0 {
    public static final JR2$a c;

    static {
        JR2$a jR2$a;
        c = jR2$a = new Lambda(0);
    }

    public static WindowLayoutComponent b() {
        JR2 jR2;
        boolean bl2;
        ClassLoader classLoader = JR2.class.getClassLoader();
        WindowLayoutComponent windowLayoutComponent = null;
        if (classLoader != null && (bl2 = JR2.a(jR2 = JR2.a, classLoader))) {
            classLoader = WindowExtensionsProvider.getWindowExtensions();
            try {
                windowLayoutComponent = classLoader.getWindowLayoutComponent();
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                bl2 = false;
                classLoader = null;
            }
        } else {
            bl2 = false;
            classLoader = null;
        }
        return windowLayoutComponent;
    }
}

