/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class s71 {
    public final AjioHomeActivity a;
    public final jo_2 b;

    public s71(AjioHomeActivity object) {
        Intrinsics.checkNotNullParameter(object, "baseActivity");
        this.a = object;
        Intrinsics.checkNotNullExpressionValue(((FragmentActivity)object).getSupportFragmentManager(), "getSupportFragmentManager(...)");
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.b = object = new jo_2((Context)aJIOApplication);
    }
}

