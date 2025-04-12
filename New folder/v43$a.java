/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.window.sidecar.SidecarDeviceState
 *  androidx.window.sidecar.SidecarWindowLayoutInfo
 */
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class v43$a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(SidecarDeviceState object) {
        Object object2 = "sidecarDeviceState";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            return ((SidecarDeviceState)object).posture;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            block9: {
                object2 = SidecarDeviceState.class;
                String string2 = "getPosture";
                object2 = ((Class)object2).getMethod(string2, null);
                object = ((Method)object2).invoke(object, null);
                if (object == null) break block9;
                object = (Integer)object;
                return (Integer)object;
            }
            object2 = "null cannot be cast to non-null type kotlin.Int";
            try {
                object = new NullPointerException((String)object2);
                throw object;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return 0;
            }
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        int n3;
        String string2 = "sidecarDeviceState";
        Intrinsics.checkNotNullParameter(sidecarDeviceState, string2);
        int n4 = v43$a.a(sidecarDeviceState);
        if (n4 < 0 || n4 > (n3 = 4)) {
            n4 = 0;
            sidecarDeviceState = null;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List c(SidecarWindowLayoutInfo object) {
        Object object2 = "info";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            object2 = object.displayFeatures;
            if (object2 != null) return object2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            block9: {
                object2 = SidecarWindowLayoutInfo.class;
                String string2 = "getDisplayFeatures";
                object2 = ((Class)object2).getMethod(string2, null);
                Object object3 = ((Method)object2).invoke(object, null);
                if (object3 == null) break block9;
                return (List)object3;
            }
            object2 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>";
            try {
                NullPointerException nullPointerException = new NullPointerException((String)object2);
                throw nullPointerException;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return xx_2.f();
            }
        }
        return xx_2.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d(SidecarDeviceState sidecarDeviceState, int n3) {
        int n4 = 1;
        Object object = "sidecarDeviceState";
        Intrinsics.checkNotNullParameter(sidecarDeviceState, (String)object);
        try {
            sidecarDeviceState.posture = n3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            object = SidecarDeviceState.class;
            String string2 = "setPosture";
            Class[] classArray = new Class[n4];
            Class<Integer> clazz = Integer.TYPE;
            classArray[0] = clazz;
            object = ((Class)object).getMethod(string2, classArray);
            Integer n7 = n3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = n7;
            try {
                ((Method)object).invoke((Object)sidecarDeviceState, objectArray);
                return;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return;
            }
        }
    }
}

