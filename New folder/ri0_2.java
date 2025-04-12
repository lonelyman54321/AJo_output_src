/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog$c;
import com.facebook.internal.a;
import com.ril.ajio.data.repo.UserRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rI0
 */
public final class ri0_2
implements WebDialog$c,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ri0_2(Object object) {
        this.a = object;
    }

    public void a(Bundle bundle, FacebookException facebookException) {
        sD3 sD32 = (a)this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(sD32, string2);
        sD32 = sD32.getActivity();
        if (sD32 != null) {
            int n3;
            string2 = sD32.getIntent();
            String string3 = "fragmentActivity.intent";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            bundle = os1_1.f((Intent)string2, bundle, facebookException);
            if (facebookException == null) {
                n3 = -1;
            } else {
                n3 = 0;
                facebookException = null;
            }
            sD32.setResult(n3, (Intent)bundle);
            sD32.finish();
        }
    }

    public Object apply(Object object) {
        return UserRepo.X((a72_0)((Function1)this.a), object);
    }
}

