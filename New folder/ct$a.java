/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.appevents.i;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

public final class ct$a {
    public final BigDecimal a;
    public final Currency b;
    public final Bundle c;
    public final i d;

    public ct$a(BigDecimal bigDecimal, Currency currency, Bundle bundle, i i3) {
        Intrinsics.checkNotNullParameter(bigDecimal, "purchaseAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(bundle, "param");
        Intrinsics.checkNotNullParameter(i3, "operationalData");
        this.a = bigDecimal;
        this.b = currency;
        this.c = bundle;
        this.d = i3;
    }
}

