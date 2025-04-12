/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.NativeAppLoginMethodHandler;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MS1
 */
public final class ms1_1
implements Runnable {
    public final /* synthetic */ NativeAppLoginMethodHandler a;
    public final /* synthetic */ LoginClient$Request b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ ms1_1(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient$Request loginClient$Request, Bundle bundle) {
        this.a = nativeAppLoginMethodHandler;
        this.b = loginClient$Request;
        this.c = bundle;
    }

    public final void run() {
        block4: {
            FacebookServiceException facebookServiceException2;
            String string2;
            LoginClient$Request loginClient$Request;
            NativeAppLoginMethodHandler nativeAppLoginMethodHandler;
            block6: {
                nativeAppLoginMethodHandler = this.a;
                Intrinsics.checkNotNullParameter(nativeAppLoginMethodHandler, "this$0");
                loginClient$Request = this.b;
                Intrinsics.checkNotNullParameter(loginClient$Request, "$request");
                Bundle bundle = this.c;
                string2 = "$extras";
                Intrinsics.checkNotNullParameter(bundle, string2);
                nativeAppLoginMethodHandler.j(loginClient$Request, bundle);
                try {
                    nativeAppLoginMethodHandler.p(loginClient$Request, bundle);
                    break block4;
                }
                catch (FacebookException facebookException) {
                }
                catch (FacebookServiceException facebookServiceException2) {
                    break block6;
                }
                String string3 = facebookException.getMessage();
                string2 = null;
                nativeAppLoginMethodHandler.o(loginClient$Request, null, string3, null);
                break block4;
            }
            Object object = facebookServiceException2.b;
            string2 = ((FacebookRequestError)object).d;
            String string4 = ((FacebookRequestError)object).a();
            int n3 = ((FacebookRequestError)object).b;
            object = String.valueOf(n3);
            nativeAppLoginMethodHandler.o(loginClient$Request, string2, string4, (String)object);
        }
    }
}

