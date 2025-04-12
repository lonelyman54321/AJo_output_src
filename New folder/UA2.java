/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class UA2
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ UA2(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Activity)object;
        object2 = (Resource)object2;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object, "mActivity");
        Intrinsics.checkNotNullParameter(object2, "resource");
        String string2 = ((Resource)object2).getId();
        if (string2 != null) {
            if ((object2 = ((Resource)object2).getId()) == null) {
                object2 = "";
            }
            dr0_02.getClass();
            dr0_0.F((Activity)object, (String)object2);
        }
        return Unit.a;
    }
}

