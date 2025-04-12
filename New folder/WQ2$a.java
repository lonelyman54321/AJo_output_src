/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class WQ2$a {
    public static wq2_2 a(String object, ProfileHealth profileHealth) {
        String string2 = "profileType";
        Intrinsics.checkNotNullParameter(string2, string2);
        Intrinsics.checkNotNullParameter(profileHealth, "profileHealth");
        Bundle bundle = new Bundle();
        bundle.putCharSequence("ProfileType", (CharSequence)string2);
        bundle.putCharSequence("EntryPoint", (CharSequence)object);
        bundle.putSerializable("ProfileHealth", (Serializable)profileHealth);
        object = new wq2_2();
        ((Fragment)object).setArguments(bundle);
        return object;
    }
}

