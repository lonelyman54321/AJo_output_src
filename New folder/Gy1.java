/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import com.facebook.login.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Gy1
extends Lambda
implements Function1 {
    public final /* synthetic */ h c;
    public final /* synthetic */ FragmentActivity d;

    public Gy1(h h3, FragmentActivity fragmentActivity) {
        this.c = h3;
        this.d = fragmentActivity;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (ActivityResult)object;
        Object object2 = "result";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = ((ActivityResult)object).a;
        int n4 = -1;
        if (n3 == n4) {
            object2 = this.c.Oa();
            dK$c dK$c = dK$c.Login;
            n4 = dK$c.toRequestCode();
            int n7 = ((ActivityResult)object).a;
            object = ((ActivityResult)object).b;
            ((LoginClient)object2).j(n4, n7, (Intent)object);
        } else {
            object = this.d;
            object.finish();
        }
        return Unit.a;
    }
}

