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
 * Renamed from co2
 */
public final class co2_2
implements Function0 {
    public final /* synthetic */ Context a;

    public /* synthetic */ co2_2(Context context) {
        this.a = context;
    }

    public final Object invoke() {
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "$context");
        return UserInformation.getInstance(context);
    }
}

