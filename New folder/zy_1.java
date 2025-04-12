/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.graphics.ColorSpace
 *  android.os.Bundle
 */
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.WebDialog$c;
import com.facebook.internal.a;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZY
 */
public final class zy_1
implements js0_0,
WebDialog$c,
OnSuccessListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ zy_1(Object object) {
        this.a = object;
    }

    public void a(Bundle bundle, FacebookException object) {
        a a2 = (a)this.a;
        Intrinsics.checkNotNullParameter(a2, "this$0");
        object = a2.getActivity();
        if (object != null) {
            a2 = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            a2.putExtras(bundle);
            int n3 = -1;
            object.setResult(n3, (Intent)a2);
            object.finish();
        }
    }

    public double c(double d2) {
        return JY.a(KY.a(e2_0.a((ColorSpace)this.a)), d2);
    }

    public void onSuccess(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

