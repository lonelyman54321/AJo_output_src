/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jh3
 */
public final class jh3_2 {
    public static boolean a(SystemUiController systemUiController) {
        boolean bl2;
        boolean bl3 = systemUiController.getStatusBarDarkContentEnabled();
        if (bl3 && (bl2 = systemUiController.getNavigationBarDarkContentEnabled())) {
            bl2 = true;
        } else {
            bl2 = false;
            systemUiController = null;
        }
        return bl2;
    }

    public static boolean b(SystemUiController systemUiController) {
        boolean bl2;
        boolean bl3 = systemUiController.isNavigationBarVisible();
        if (bl3 && (bl2 = systemUiController.isStatusBarVisible())) {
            bl2 = true;
        } else {
            bl2 = false;
            systemUiController = null;
        }
        return bl2;
    }

    public static void c(SystemUiController systemUiController, long l2, boolean bl2, boolean bl3, Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "transformColorForLightContent");
        systemUiController.setStatusBarColor-ek8zF_U(l2, bl2, function1);
        systemUiController.setNavigationBarColor-Iv8Zu3U(l2, bl2, bl3, function1);
    }

    public static void d(SystemUiController systemUiController, boolean bl2) {
        systemUiController.setStatusBarDarkContentEnabled(bl2);
        systemUiController.setNavigationBarDarkContentEnabled(bl2);
    }

    public static void e(SystemUiController systemUiController, boolean bl2) {
        systemUiController.setStatusBarVisible(bl2);
        systemUiController.setNavigationBarVisible(bl2);
    }

    public static /* synthetic */ void f(SystemUiController object, long l2, boolean object2, boolean bl2, Function1 function1, int n3, Object object3) {
        if (object3 == null) {
            int n4 = n3 & 2;
            if (n4 != 0) {
                float f5 = zx_0.h(l2);
                n4 = 0x3F000000;
                float f6 = 0.5f;
                float f7 = f5 - f6;
                object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    object2 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    object2 = 0;
                    f5 = 0.0f;
                }
            }
            boolean bl3 = object2;
            object2 = n3 & 4;
            boolean bl4 = object2 != 0 ? true : bl2;
            object2 = n3 & 8;
            if (object2 != 0) {
                function1 = SystemUiControllerKt.access$getBlackScrimmed$p();
            }
            object.setNavigationBarColor-Iv8Zu3U(l2, bl3, bl4, function1);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        throw object;
    }

    public static /* synthetic */ void g(SystemUiController object, long l2, boolean object2, Function1 function1, int n3, Object object3) {
        if (object3 == null) {
            int n4 = n3 & 2;
            if (n4 != 0) {
                float f5 = zx_0.h(l2);
                n4 = 0x3F000000;
                float f6 = 0.5f;
                float f7 = f5 - f6;
                object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    object2 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    object2 = 0;
                    f5 = 0.0f;
                }
            }
            if ((n3 &= 4) != 0) {
                function1 = SystemUiControllerKt.access$getBlackScrimmed$p();
            }
            object.setStatusBarColor-ek8zF_U(l2, (boolean)object2, function1);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        throw object;
    }

    public static /* synthetic */ void h(SystemUiController object, long l2, boolean object2, boolean bl2, Function1 function1, int n3, Object object3) {
        if (object3 == null) {
            int n4 = n3 & 2;
            if (n4 != 0) {
                float f5 = zx_0.h(l2);
                n4 = 0x3F000000;
                float f6 = 0.5f;
                float f7 = f5 - f6;
                object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    object2 = 1;
                    f5 = Float.MIN_VALUE;
                } else {
                    object2 = 0;
                    f5 = 0.0f;
                }
            }
            boolean bl3 = object2;
            object2 = n3 & 4;
            boolean bl4 = object2 != 0 ? true : bl2;
            object2 = n3 & 8;
            if (object2 != 0) {
                function1 = SystemUiControllerKt.access$getBlackScrimmed$p();
            }
            object.setSystemBarsColor-Iv8Zu3U(l2, bl3, bl4, function1);
            return;
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
        throw object;
    }
}

