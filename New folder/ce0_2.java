/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.Collection;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from cE0
 */
public final class ce0_2 {
    public static final boolean a(String string2, String string3) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0 && string3 != null && (n3 = string3.length()) != 0) {
            String[] stringArray = z40_0.Companion;
            stringArray = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)stringArray).a;
            String[] stringArray2 = "wrong_product_reason";
            int n4 = TextUtils.isEmpty((CharSequence)(stringArray = stringArray.b((String)stringArray2)));
            if (n4 == 0) {
                stringArray2 = new String[]{"#"};
                int n7 = 6;
                stringArray = StringsKt.a0((CharSequence)stringArray, stringArray2, false, 0, n7);
                stringArray2 = new String[]{};
                for (String string4 : stringArray.toArray(stringArray2)) {
                    String string5;
                    boolean bl2;
                    boolean bl3;
                    String string6;
                    Object object = new String[]{":"};
                    Collection collection = StringsKt.a0(string4, object, false, 0, n7);
                    object = new String[]{};
                    String[] stringArray3 = collection.toArray((T[])object);
                    boolean bl4 = b.i((String)(object = ((Object)StringsKt.m0(stringArray3[0])).toString()), string6 = ((Object)StringsKt.m0(string2)).toString(), bl3 = true);
                    if (!bl4 || !(bl2 = b.i(string5 = ((Object)StringsKt.m0(stringArray3[bl3])).toString(), (String)(object = ((Object)StringsKt.m0(string3)).toString()), bl3))) continue;
                    return bl3;
                }
            }
        }
        return false;
    }
}

