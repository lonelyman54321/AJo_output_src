/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.google.gson.Gson;
import com.ril.ajio.services.data.Product.KYPMedia;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

public final class Dj2$a {
    public static dj2_2 a(KYPMedia object, String string2, boolean bl2, String string3, String string4) {
        String string5 = "kypMedia";
        Intrinsics.checkNotNullParameter(object, string5);
        Intrinsics.checkNotNullParameter(string3, "productId");
        Intrinsics.checkNotNullParameter(string4, "productName");
        dj2_2 dj2_22 = new dj2_2();
        Bundle bundle = new Bundle();
        Gson gson = new Gson();
        object = gson.toJson(object, (Type)((Object)KYPMedia.class));
        bundle.putString(string5, (String)object);
        bundle.putString("uuid", string2);
        bundle.putBoolean("is luxe", bl2);
        bundle.putString("product_id", string3);
        bundle.putString("product_name", string4);
        dj2_22.setArguments(bundle);
        return dj2_22;
    }
}

