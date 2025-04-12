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

public final class Lz1$a {
    public static lz1_2 a(String string2, AccountCheckResponse accountCheckResponse) {
        Intrinsics.checkNotNullParameter(string2, "userInputValue");
        Intrinsics.checkNotNullParameter(accountCheckResponse, "accountCheckResponse");
        lz1_2 lz1_22 = new lz1_2();
        Bundle bundle = new Bundle();
        bundle.putString("USER_INPUT_VALUE", string2);
        bundle.putSerializable("param2", (Serializable)accountCheckResponse);
        lz1_22.setArguments(bundle);
        return lz1_22;
    }
}

