/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;

public final class VX0 {
    public static UserInformation a(AJIOApplication$a aJIOApplication$a) {
        aJIOApplication$a.getClass();
        return UserInformation.getInstance((Context)AJIOApplication$a.a());
    }
}

