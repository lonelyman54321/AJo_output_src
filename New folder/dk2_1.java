/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;

/*
 * Renamed from DK2
 */
public final class dk2_1
implements BK2 {
    public static final U92 b;
    public final Context a;

    static {
        U92 u92;
        u92$a_0 u92$a_0 = U92.e;
        b = u92 = new U92("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, u92$a_0);
    }

    public dk2_1(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final boolean a(Object object, Z92 object2) {
        boolean bl2;
        if ((object = ((Uri)object).getScheme()) != null && (bl2 = ((String)object).equals(object2 = "android.resource"))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 c(Uri object, Z92 object2) {
        PackageManager.NameNotFoundException nameNotFoundException222222;
        RuntimeException runtimeException;
        block16: {
            void var1_10;
            void var1_7;
            String string2;
            int n3;
            Object object3;
            String string3;
            Context context;
            Object object4;
            block15: {
                object4 = object.getAuthority();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object4);
                if (bl2) {
                    object4 = new StringBuilder("Package name for ");
                    ((StringBuilder)object4).append(object);
                    ((StringBuilder)object4).append(" is null or empty");
                    String string4 = ((StringBuilder)object4).toString();
                    runtimeException = new IllegalStateException(string4);
                    throw runtimeException;
                }
                context = this.a;
                string3 = context.getPackageName();
                boolean bl3 = ((String)object4).equals(string3);
                Object var8_23 = null;
                if (!bl3) {
                    try {
                        string3 = context.createPackageContext((String)object4, 0);
                        break block15;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException222222) {
                        object3 = context.getPackageName();
                        n3 = ((String)object4).contains((CharSequence)object3);
                        if (n3 == 0) break block16;
                    }
                }
                string3 = context;
            }
            object3 = object.getPathSegments();
            int n4 = object3.size();
            int n7 = 2;
            int n8 = 1;
            if (n4 == n7) {
                object3 = object.getPathSegments();
                String string5 = object.getAuthority();
                String string6 = (String)object3.get(0);
                object3 = (String)object3.get(n8);
                Resources resources = string3.getResources();
                n4 = resources.getIdentifier((String)object3, string6, string5);
                if (n4 == 0) {
                    string5 = Resources.getSystem();
                    String string7 = "android";
                    n4 = string5.getIdentifier((String)object3, string6, string7);
                }
                if (n4 == 0) {
                    String string8 = og3_1.a(object, "Failed to find resource id for: ");
                    runtimeException = new IllegalArgumentException(string8);
                    throw runtimeException;
                }
            } else {
                n3 = object3.size();
                string2 = "Unrecognized Uri format: ";
                if (n3 != n8) {
                    String string9 = og3_1.a(object, string2);
                    runtimeException = new IllegalArgumentException(string9);
                    throw runtimeException;
                }
                object3 = object.getPathSegments();
                Object e2 = object3.get(0);
                String string10 = (String)e2;
                n4 = Integer.parseInt(string10);
            }
            String string11 = context.getPackageName();
            boolean bl4 = ((String)object4).equals(string11);
            object4 = null;
            if (bl4) {
                U92 u92 = b;
                Resources.Theme theme = (Resources.Theme)((Z92)((Object)runtimeException)).c(u92);
            } else {
                bl4 = false;
                Object var1_6 = null;
            }
            if (var1_7 == null) {
                Drawable drawable2 = xt0_0.a(context, (Context)string3, n4, null);
            } else {
                Drawable drawable3 = xt0_0.a(context, context, n4, (Resources.Theme)var1_7);
            }
            if (var1_10 == null) return object4;
            return new gu0_0((Drawable)var1_10);
            catch (NumberFormatException numberFormatException) {
                String string12 = og3_1.a(object, string2);
                object4 = new IllegalArgumentException(string12, numberFormatException);
                throw object4;
            }
        }
        String string13 = og3_1.a(object, "Failed to obtain context or unrecognized Uri format for: ");
        runtimeException = new IllegalArgumentException(string13, nameNotFoundException222222);
        throw runtimeException;
    }
}

