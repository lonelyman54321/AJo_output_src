/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 */
import android.webkit.ValueCallback;
import com.jpl.crasdk.CraActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kd0
 */
public final class kd0_2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ CraActivity b;

    public /* synthetic */ kd0_2(CraActivity craActivity, String string2) {
        this.a = string2;
        this.b = craActivity;
    }

    public final void run() {
        int n3;
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = this.a;
        if (string2 != null && (n3 = string2.length()) != 0) {
            object = ((CraActivity)object).Y;
            if (object != null) {
                String string3 = "')";
                string2 = cP.a("javascript:storedSessionDetails ('", string2, string3);
                md0_1 md0_12 = new Object();
                object.evaluateJavascript(string2, (ValueCallback)md0_12);
            }
        } else {
            string2 = ((CraActivity)object).Y;
            if (string2 != null) {
                object = new Object();
                String string4 = "javascript:storedSessionDetails ('')";
                string2.evaluateJavascript(string4, (ValueCallback)object);
            }
        }
    }
}

