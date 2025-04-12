/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from zz3
 */
public final class zz3_0 {
    public static final zz3_0 a;

    static {
        zz3_0 zz3_02;
        a = zz3_02 = new zz3_0();
    }

    public static final File a() {
        Throwable throwable2;
        Class<zz3_0> clazz;
        block9: {
            File file;
            block8: {
                File file2;
                block7: {
                    Object object;
                    clazz = zz3_0.class;
                    boolean bl2 = td0.b(clazz);
                    file = null;
                    if (bl2) {
                        return null;
                    }
                    try {
                        object = FacebookSdk.a();
                    }
                    catch (Throwable throwable2) {}
                    object = object.getFilesDir();
                    String string2 = "facebook_ml/";
                    file2 = new File((File)object, string2);
                    boolean bl3 = file2.exists();
                    if (bl3) break block7;
                    boolean bl4 = file2.mkdirs();
                    if (!bl4) break block8;
                    break block9;
                }
                file = file2;
            }
            return file;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b(String object) {
        Throwable throwable2;
        block7: {
            boolean bl2;
            int n3;
            int n4;
            int n7 = td0.b(this);
            if (n7 != 0) {
                return null;
            }
            Object object2 = "str";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n7 = object.length();
                n4 = 1;
                n7 -= n4;
                n3 = 0;
                bl2 = false;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            while (n3 <= n7) {
                int n8 = !bl2 ? n3 : n7;
                n8 = object.charAt(n8);
                int n10 = 32;
                n8 = Intrinsics.compare(n8, n10);
                n8 = n8 <= 0 ? 1 : 0;
                if (!bl2) {
                    if (n8 == 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n8 == 0) break;
                n7 += -1;
            }
            object = object.subSequence(n3, n7 += n4);
            object = object.toString();
            String string2 = "\\s+";
            object2 = new Regex(string2);
            object = object2.e((CharSequence)object);
            object = (Collection)object;
            object2 = new String[]{};
            object = object.toArray((T[])object2);
            object2 = " ";
            object = TextUtils.join((CharSequence)object2, (Object[])object);
            object2 = "join(\" \", strArray)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            return object;
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int[] c(String object) {
        int n3;
        int[] nArray;
        int n4;
        block5: {
            n4 = td0.b(this);
            if (n4 != 0) {
                return null;
            }
            String string2 = "texts";
            try {
                Intrinsics.checkNotNullParameter(object, string2);
                n4 = 128;
                nArray = new int[n4];
                object = this.b((String)object);
                Object object2 = "UTF-8";
                object2 = Charset.forName((String)object2);
                String string3 = "forName(\"UTF-8\")";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                object = ((String)object).getBytes((Charset)object2);
                object2 = "this as java.lang.String).getBytes(charset)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object2 = null;
                n3 = 0;
                string3 = null;
                break block5;
            }
            catch (Throwable throwable) {}
            td0.a(this, throwable);
            return null;
        }
        while (n3 < n4) {
            int n7 = ((Object)object).length;
            nArray[n3] = n3 < n7 ? (n7 = object[n3] & 0xFF) : 0;
            ++n3;
        }
        return nArray;
    }
}

