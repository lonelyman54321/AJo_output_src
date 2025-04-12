/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

public final class tz3
implements Function0 {
    public final Object invoke() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        ce1$a ce1$a = new ce1$a((Context)object);
        object = new n10$a();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        ArrayList arrayList = ((n10$a)object).e;
        if (n3 >= n4) {
            Gd1$a gd1$a = new Gd1$a();
            arrayList.add(gd1$a);
        } else {
            vZ0$a vZ0$a = new vZ0$a();
            arrayList.add(vZ0$a);
        }
        ce1$a.d = object = ((n10$a)object).c();
        return ce1$a.a();
    }
}

