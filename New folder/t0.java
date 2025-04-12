/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$ProcessErrorStateInfo
 *  android.os.Looper
 *  android.os.Process
 *  org.json.JSONArray
 */
import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class t0 {
    public static final int a;
    public static final ScheduledExecutorService b;
    public static String c;
    public static final s0 d;

    static {
        s0 s02;
        new t0();
        a = Process.myUid();
        b = Executors.newSingleThreadScheduledExecutor();
        c = "";
        d = s02 = new Object();
    }

    public static final void a(ActivityManager object) {
        block31: {
            Class<t0> clazz = t0.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            if (object != null) {
                object = object.getProcessesInErrorState();
                if (object == null) break block31;
                object = (Iterable)object;
                try {
                    object = object.iterator();
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
                while (true) {
                    bl2 = object.hasNext();
                    if (!bl2) break;
                    Object object2 = object.next();
                    object2 = (ActivityManager.ProcessErrorStateInfo)object2;
                    int n3 = ((ActivityManager.ProcessErrorStateInfo)object2).condition;
                    int n4 = 2;
                    if (n3 != n4) continue;
                    n3 = ((ActivityManager.ProcessErrorStateInfo)object2).uid;
                    n4 = a;
                    if (n3 != n4) continue;
                    Object object3 = Looper.getMainLooper();
                    object3 = object3.getThread();
                    Object object4 = "getMainLooper().thread";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    object4 = "thread";
                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                    object4 = ((Thread)object3).getStackTrace();
                    Object object5 = new JSONArray();
                    String string2 = "stackTrace";
                    Intrinsics.checkNotNullExpressionValue(object4, string2);
                    int n7 = ((StackTraceElement[])object4).length;
                    for (int i3 = 0; i3 < n7; ++i3) {
                        Object object6 = object4[i3];
                        object6 = ((StackTraceElement)object6).toString();
                        object5.put(object6);
                        continue;
                    }
                    object4 = object5.toString();
                    object5 = c;
                    boolean bl3 = Intrinsics.areEqual(object4, object5);
                    if (bl3) continue;
                    n3 = (int)(ii1_0.d((Thread)object3) ? 1 : 0);
                    if (n3 == 0) continue;
                    c = object4;
                    object2 = ((ActivityManager.ProcessErrorStateInfo)object2).shortMsg;
                    object2 = Di1$a.a(object2, (String)object4);
                    ((Di1)object2).b();
                    continue;
                    break;
                }
            }
        }
    }
}

