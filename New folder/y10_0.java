/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.web.CustomWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Y10
 */
public final class y10_0
implements Function1 {
    public final Object invoke(Object object) {
        int n3 = 21;
        int n4 = (Integer)(object = (Integer)object);
        if (n3 <= n4 && n4 < (n3 = 34)) {
            AJIOApplication.Companion.getClass();
            Object object2 = AJIOApplication$a.a();
            object = new Intent((Context)object2, CustomWebViewActivity.class);
            object2 = h40_0.a;
            object2 = h40_0.D(false).getCancelPolicy();
            String string2 = "URL";
            object.putExtra(string2, (String)object2);
            int n7 = 18;
            object.putExtra("SOURCE", n7);
            n3 = 0x10000000;
            object.setFlags(n3);
            object2 = AJIOApplication$a.a();
            object2.startActivity((Intent)object);
        }
        return Unit.a;
    }
}

