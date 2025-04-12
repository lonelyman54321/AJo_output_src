/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.view.MotionEvent
 */
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.MotionEvent;
import java.util.Objects;

/*
 * Renamed from jQ1
 */
public final class jq1_1 {
    public static int a(Context object, String string2, int n3, int n4, String object2) {
        int n7;
        int n8;
        block11: {
            int n10;
            block12: {
                int n14;
                block9: {
                    block10: {
                        int n15;
                        if ((n3 = object.checkPermission(string2, n3, n4)) == (n15 = -1)) {
                            return n15;
                        }
                        n3 = Build.VERSION.SDK_INT;
                        n14 = 23;
                        string2 = n3 >= n14 ? Ho.c(string2) : null;
                        n8 = 0;
                        if (string2 == null) {
                            return 0;
                        }
                        if (object2 == null) {
                            int n16;
                            object2 = object.getPackageManager().getPackagesForUid(n4);
                            if (object2 != null && (n16 = ((String[])object2).length) > 0) {
                                object2 = object2[0];
                            } else {
                                return n15;
                            }
                        }
                        n15 = Process.myUid();
                        String string3 = object.getPackageName();
                        n10 = 1;
                        if (n15 != n4 || (n15 = (int)(Objects.equals(string3, object2) ? 1 : 0)) == 0) break block9;
                        n15 = 29;
                        if (n3 < n15) break block10;
                        AppOpsManager appOpsManager = Io.b(object);
                        n15 = Binder.getCallingUid();
                        n7 = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(string2, n15, (String)object2);
                        if (n7 != 0) break block11;
                        object = Io.a(object);
                        if (appOpsManager != null) {
                            n10 = appOpsManager.checkOpNoThrow(string2, n4, (String)object);
                        }
                        break block12;
                    }
                    if (n3 >= n14) {
                        object = (AppOpsManager)Ho.a(object);
                        n10 = Ho.b((AppOpsManager)object, string2, (String)object2);
                    }
                    break block12;
                }
                if (n3 >= n14) {
                    object = (AppOpsManager)Ho.a(object);
                    n10 = Ho.b((AppOpsManager)object, string2, (String)object2);
                }
            }
            n7 = n10;
        }
        if (n7 != 0) {
            n8 = -2;
        }
        return n8;
    }

    public static int b(Context context, String string2) {
        int n3 = Process.myPid();
        int n4 = Process.myUid();
        String string3 = context.getPackageName();
        return jq1_1.a(context, string2, n3, n4, string3);
    }

    public static boolean c(MotionEvent motionEvent, int n3) {
        int n4 = motionEvent.getSource() & n3;
        if (n4 == n3) {
            n4 = 1;
        } else {
            n4 = 0;
            motionEvent = null;
        }
        return n4 != 0;
    }
}

