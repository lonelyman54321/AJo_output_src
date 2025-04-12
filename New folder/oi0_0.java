/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.io.Serializable;

/*
 * Renamed from Oi0
 */
public final class oi0_0 {
    public static void a() {
        Serializable serializable = new Throwable();
        serializable = ((Throwable)serializable).getStackTrace()[1];
        ((StackTraceElement)serializable).getFileName();
        ((StackTraceElement)serializable).getLineNumber();
        ((StackTraceElement)serializable).getMethodName();
    }

    public static void b() {
        Serializable serializable = new Throwable();
        serializable = ((Throwable)serializable).getStackTrace()[1];
        ((StackTraceElement)serializable).getFileName();
        ((StackTraceElement)serializable).getLineNumber();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String c(int n3, Context context) {
        int n4 = -1;
        if (n3 == n4) return "UNKNOWN";
        try {
            context = context.getResources();
        }
        catch (Exception exception) {
            return hj0_0.a(n3, "?");
        }
        return context.getResourceEntryName(n3);
    }

    public static String d(View view) {
        Context context;
        try {
            context = view.getContext();
        }
        catch (Exception exception) {
            return "UNKNOWN";
        }
        context = context.getResources();
        int n3 = view.getId();
        return context.getResourceEntryName(n3);
    }

    public static String e(int n3, MotionLayout motionLayout) {
        String string2;
        int n4 = -1;
        if (n3 == n4) {
            string2 = "UNDEFINED";
        } else {
            motionLayout = motionLayout.getContext().getResources();
            string2 = motionLayout.getResourceEntryName(n3);
        }
        return string2;
    }
}

