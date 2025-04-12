/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.ril.ajio.home.AjioHomeActivity;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class C23
extends zj0_0 {
    public final Activity c;

    public C23(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "callingActivity");
        super(activity);
        this.c = activity;
    }

    public final void b(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "linkUrl");
        Bundle bundle = new Bundle();
        Object object2 = "/sharedcloset";
        int n3 = 1;
        boolean bl2 = kotlin.text.b.s((String)object, (String)object2, n3 != 0);
        if (bl2) {
            boolean bl3;
            Object[] objectArray;
            CharSequence charSequence;
            int n4;
            object = StringsKt.U((String)object, "/sharedcloset?");
            bundle.putString("LINK_URL", (String)object);
            Object object3 = "&";
            object2 = new Regex((String)object3);
            object = ((Regex)object2).e((CharSequence)object).iterator();
            while (true) {
                bl2 = object.hasNext();
                n4 = 6;
                int n7 = 0;
                String string3 = null;
                charSequence = "substring(...)";
                if (!bl2) break;
                object2 = (String)object.next();
                boolean bl4 = StringsKt.F((CharSequence)object2, (CharSequence)(objectArray = "="), false);
                if (!bl4) continue;
                n4 = StringsKt.O((CharSequence)object2, (String)objectArray, 0, false, n4);
                objectArray = ((String)object2).substring(0, n4);
                Intrinsics.checkNotNullExpressionValue(objectArray, (String)charSequence);
                object2 = ((String)object2).substring(n4 += n3);
                Intrinsics.checkNotNullExpressionValue(object2, (String)charSequence);
                object2 = xx_2.i(objectArray, object2);
                object3 = yn3_0.a;
                charSequence = new StringBuilder("SubParts ");
                ((StringBuilder)charSequence).append(object2);
                charSequence = ((StringBuilder)charSequence).toString();
                objectArray = new Object[]{};
                ((yn3$a)object3).a((String)charSequence, objectArray);
                object3 = (String)object2.get(0);
                n7 = ((String)object3).hashCode();
                int n8 = 112;
                if (n7 != n8) {
                    n8 = 116;
                    if (n7 != n8) {
                        n8 = 3737;
                        if (n7 != n8) {
                            n8 = 3744;
                            if (n7 != n8 || (n4 = (int)(((String)object3).equals(string3 = "uu") ? 1 : 0)) == 0) continue;
                            object2 = (String)object2.get(n3);
                            object3 = "LINK_USER";
                            bundle.putString((String)object3, (String)object2);
                            continue;
                        }
                        string3 = "un";
                        n4 = (int)(((String)object3).equals(string3) ? 1 : 0);
                        if (n4 == 0) continue;
                        object2 = (String)object2.get(n3);
                        object3 = "LINK_USER_NAME";
                        bundle.putString((String)object3, (String)object2);
                        continue;
                    }
                    string3 = "t";
                    n4 = (int)(((String)object3).equals(string3) ? 1 : 0);
                    if (n4 == 0) continue;
                    long l2 = Long.parseLong((String)object2.get(n3));
                    object2 = "LINK_TIME";
                    bundle.putLong((String)object2, l2);
                    continue;
                }
                string3 = "p";
                n4 = (int)(((String)object3).equals(string3) ? 1 : 0);
                if (n4 == 0) continue;
                object2 = (String)object2.get(n3);
                object3 = "LINK_PRODUCTS";
                bundle.putString((String)object3, (String)object2);
            }
            if (string2 != null) {
                object2 = "/";
                object = new Regex((String)object2);
                Intrinsics.checkNotNullParameter(string2, "input");
                object = ((Regex)object).a.matcher(string2);
                boolean n10 = ((Matcher)object).find();
                objectArray = "SHORTLINK_CODE";
                if (n10) {
                    int n7 = StringsKt.R(string2, (String)object2, 0, n4) + n3;
                    object = string2.substring(n7);
                    Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
                    bundle.putString((String)objectArray, (String)object);
                } else {
                    bundle.putString((String)objectArray, string2);
                }
            }
            if (bl3 = (object = this.c) instanceof AjioHomeActivity) {
                object = (AjioHomeActivity)object;
                object.getClass();
                string2 = "bundle";
                Intrinsics.checkNotNullParameter(bundle, string2);
                ((AjioHomeActivity)object).M2(bundle);
            }
        }
    }
}

