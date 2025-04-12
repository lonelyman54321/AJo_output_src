/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from HR2
 */
public final class hr2_1
extends Lambda
implements Function0 {
    public final /* synthetic */ ClassLoader c;

    public hr2_1(ClassLoader classLoader) {
        this.c = classLoader;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        block3: {
            block2: {
                bl2 = true;
                JR2.a.getClass();
                GenericDeclaration genericDeclaration = this.c.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                Object object = GR2.a();
                int n3 = 2;
                Object object2 = new Class[n3];
                object2[0] = Activity.class;
                object2[bl2] = object;
                object = ((Class)genericDeclaration).getMethod("addWindowLayoutInfoListener", (Class<?>)object2);
                object2 = GR2.a();
                Class[] classArray = new Class[bl2];
                classArray[0] = object2;
                genericDeclaration = ((Class)genericDeclaration).getMethod("removeWindowLayoutInfoListener", classArray);
                object2 = "addListenerMethod";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                boolean bl3 = Modifier.isPublic(((Method)object).getModifiers());
                if (!bl3) break block2;
                object = "removeListenerMethod";
                Intrinsics.checkNotNullExpressionValue(genericDeclaration, (String)object);
                boolean bl4 = Modifier.isPublic(((Method)genericDeclaration).getModifiers());
                if (bl4) break block3;
            }
            bl2 = false;
        }
        return bl2;
    }
}

