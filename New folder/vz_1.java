/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VZ
 */
public final class vz_1
implements Function0 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ vz_1(e00 e002) {
        this.a = e002;
    }

    public final Object invoke() {
        e00 e002 = this.a;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        return UserInformation.getInstance((Context)e002.a);
    }
}

