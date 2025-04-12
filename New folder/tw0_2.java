/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import com.appsflyer.internal.AFj1vSDK;
import com.facebook.login.widget.LoginButton;
import in.juspay.hypersdk.core.DuiInterface;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tw0
 */
public final class tw0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tw0_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (AFj1vSDK)object2;
                object = (Context)object;
                AFj1vSDK.a((AFj1vSDK)object2, (Context)object);
                return;
            }
            case 1: {
                n3 = LoginButton.y;
                String string2 = "this$0";
                object2 = (LoginButton)((Object)object2);
                Intrinsics.checkNotNullParameter(object2, string2);
                object2.getClass();
                n3 = (int)(td0.b(object2) ? 1 : 0);
                if (n3 != 0 || (object = (al0_2)object) == null) return;
                n3 = (int)(((al0_2)object).c ? 1 : 0);
                if (n3 == 0) return;
                n3 = object2.getVisibility();
                if (n3 != 0) return;
                object = ((al0_2)object).b;
                try {
                    ((LoginButton)((Object)object2)).h((String)object);
                    return;
                }
                catch (Throwable throwable) {
                    td0.a(object2, throwable);
                }
                return;
            }
            case 0: 
        }
        object2 = (DuiInterface)object2;
        object = (Activity)object;
        DuiInterface.f((DuiInterface)object2, (Activity)object);
    }
}

