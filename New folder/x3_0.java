/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.concurrent.Callable;

/*
 * Renamed from X3
 */
public final class x3_0
implements Callable {
    public final Object call() {
        AJIOApplication.Companion.getClass();
        return AdvertisingIdClient.getAdvertisingIdInfo((Context)AJIOApplication$a.a());
    }
}

