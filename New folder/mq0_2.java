/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
import android.content.Context;
import android.widget.Toast;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mq0
 */
public final class mq0_2 {
    public static final void a(int n3, String object) {
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        int n4 = 1;
        if (bl2) {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            String string2 = hv3_0.K(n3);
            Integer n7 = n4;
            ig0_0.a((Context)object2, string2, n7, (String)object);
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            Toast toast = Toast.makeText((Context)object, (int)n3, (int)n4);
            toast.show();
        }
    }

    public static final void b(String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "res");
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        int n3 = 1;
        if (bl2) {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            Integer n4 = n3;
            ig0_0.a((Context)object2, string2, n4, (String)object);
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            string2 = Toast.makeText((Context)object, (CharSequence)string2, (int)n3);
            string2.show();
        }
    }

    public static final void c(String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "res");
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        Integer n3 = null;
        if (bl2) {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            n3 = 0;
            ig0_0.a((Context)object2, string2, n3, (String)object);
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            string2 = Toast.makeText((Context)object, (CharSequence)string2, (int)0);
            string2.show();
        }
    }

    public static final void d(String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "res");
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (bl2) {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            ig0_0.c((AJIOApplication)object2, string2, (String)object);
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            bl2 = false;
            object2 = null;
            string2 = Toast.makeText((Context)object, (CharSequence)string2, (int)0);
            int n3 = 17;
            string2.setGravity(n3, 0, 0);
            string2.show();
        }
    }
}

