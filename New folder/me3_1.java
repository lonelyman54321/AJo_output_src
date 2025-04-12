/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/*
 * Renamed from me3
 */
public final class me3_1
implements BP1 {
    public final BP1 a;

    public me3_1(BP1 bP1) {
        this.a = bP1;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        char c2;
        Object object2;
        object = (String)object;
        char c3 = TextUtils.isEmpty((CharSequence)object);
        BP1$a bP1$a = null;
        if (c3 != '\u0000') {
            object = null;
        } else {
            object2 = null;
            c3 = ((String)object).charAt(0);
            if (c3 == (c2 = '/')) {
                object2 = new File((String)object);
                object = Uri.fromFile((File)object2);
            } else {
                object2 = Uri.parse((String)object);
                String string2 = object2.getScheme();
                if (string2 == null) {
                    object2 = new File((String)object);
                    object = Uri.fromFile((File)object2);
                } else {
                    object = object2;
                }
            }
        }
        if (object != null && (c2 = (char)((object2 = this.a).b(object) ? 1 : 0)) != '\u0000') {
            bP1$a = object2.a(object, n3, n4, z92);
        }
        return bP1$a;
    }
}

