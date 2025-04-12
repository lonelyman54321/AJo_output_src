/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class pA1$a {
    public static pA1 a(AccountCheckResponse accountCheckResponse, boolean bl2, boolean bl3, String string2, boolean bl4) {
        Intrinsics.checkNotNullParameter(accountCheckResponse, "accountCheckResponse");
        pA1 pA12 = new pA1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("mobileNumber", bl2);
        bundle.putString("mobileEmailInputValue", string2);
        bundle.putSerializable("AccountCheckResponse", (Serializable)accountCheckResponse);
        bundle.putBoolean("isFromLogin", bl3);
        bundle.putBoolean("FromOtpScreen", bl4);
        pA12.setArguments(bundle);
        return pA12;
    }
}

