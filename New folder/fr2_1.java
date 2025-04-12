/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from FR2
 */
public final class fr2_1
extends Lambda
implements Function0 {
    public final /* synthetic */ ClassLoader c;

    public fr2_1(ClassLoader classLoader) {
        this.c = classLoader;
        super(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        boolean bl2;
        block3: {
            block2: {
                boolean bl3;
                JR2.a.getClass();
                GenericDeclaration genericDeclaration = this.c.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Method method = ((Class)genericDeclaration).getMethod("getBounds", null);
                Method method2 = ((Class)genericDeclaration).getMethod("getType", null);
                genericDeclaration = ((Class)genericDeclaration).getMethod("getState", null);
                Intrinsics.checkNotNullExpressionValue(method, "getBoundsMethod");
                Class<?> clazz = rn1_2.a(Reflection.getOrCreateKotlinClass(Rect.class));
                Class<?> clazz2 = method.getReturnType();
                boolean bl4 = clazz2.equals(clazz);
                if (!bl4 || !(bl3 = Modifier.isPublic(method.getModifiers()))) break block2;
                Intrinsics.checkNotNullExpressionValue(method2, "getTypeMethod");
                Class<Integer> clazz3 = Integer.TYPE;
                clazz = rn1_2.a(Reflection.getOrCreateKotlinClass(clazz3));
                clazz2 = method2.getReturnType();
                bl4 = clazz2.equals(clazz);
                if (!bl4 || !(bl4 = Modifier.isPublic(method2.getModifiers()))) break block2;
                Intrinsics.checkNotNullExpressionValue(genericDeclaration, "getStateMethod");
                Class clazz4 = rn1_2.a(Reflection.getOrCreateKotlinClass(clazz3));
                clazz = ((Method)genericDeclaration).getReturnType();
                bl3 = clazz.equals(clazz4);
                if (bl3 && (bl2 = Modifier.isPublic(((Method)genericDeclaration).getModifiers()))) break block3;
            }
            bl2 = false;
            return bl2;
        }
        bl2 = true;
        return bl2;
    }
}

