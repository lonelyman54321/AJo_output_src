/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from lT1
 */
public final class lt1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ gt1_0 c;

    public lt1_1(gt1_0 gt1_02) {
        this.c = gt1_02;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        String string2 = this.c.a;
        if (string2 != null && (string2 = Uri.parse((String)string2).getQuery()) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }
}

