/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.appsflyer.internal.AFd1iSDK;
import com.facebook.FacebookException;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient$Request;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sf0
 */
public final class sf0_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sf0_1(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Throwable throwable = (Throwable)this.c;
                String string2 = (String)this.d;
                AFd1iSDK.a((AFd1iSDK)this.b, throwable, string2);
                return;
            }
            case 0: 
        }
        CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler)this.b;
        Intrinsics.checkNotNullParameter(customTabLoginMethodHandler, "this$0");
        LoginClient$Request loginClient$Request = (LoginClient$Request)this.c;
        Intrinsics.checkNotNullParameter(loginClient$Request, "$request");
        Bundle bundle = (Bundle)this.d;
        Intrinsics.checkNotNullParameter(bundle, "$values");
        customTabLoginMethodHandler.j(loginClient$Request, bundle);
        try {
            customTabLoginMethodHandler.o(loginClient$Request, bundle, null);
        }
        catch (FacebookException facebookException) {
            customTabLoginMethodHandler.o(loginClient$Request, null, facebookException);
        }
    }
}

