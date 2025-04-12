/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.BitmapFactory
 *  android.util.Base64
 */
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class mA1
implements Callable {
    public final /* synthetic */ pA1 a;
    public final /* synthetic */ String b;

    public /* synthetic */ mA1(pA1 pA12, String string2) {
        this.a = pA12;
        this.b = string2;
    }

    public final Object call() {
        int n3;
        Resources resources = null;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = yn3_0.a;
        String string2 = Thread.currentThread().getName();
        int n4 = 1;
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        string2 = "LoginPassword %s";
        ((yn3$a)object2).a(string2, objectArray);
        object.getClass();
        object = this.b;
        object2 = "decodeResource(...)";
        if (object != null && (n3 = ((String)object).length()) != 0) {
            object = Base64.decode((String)object, (int)0);
            n3 = ((Object)object).length;
            resources = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
            object = "decodeByteArray(...)";
            try {
                Intrinsics.checkNotNullExpressionValue(resources, (String)object);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
                AJIOApplication.Companion.getClass();
                resources = AJIOApplication$a.a().getResources();
                int n7 = R$drawable.component_placeholder;
                resources = BitmapFactory.decodeResource((Resources)resources, (int)n7);
                Intrinsics.checkNotNullExpressionValue(resources, (String)object2);
            }
        } else {
            AJIOApplication.Companion.getClass();
            resources = AJIOApplication$a.a().getResources();
            int n8 = R$drawable.component_placeholder;
            resources = BitmapFactory.decodeResource((Resources)resources, (int)n8);
            Intrinsics.checkNotNullExpressionValue(resources, (String)object2);
        }
        return resources;
    }
}

