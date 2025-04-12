/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public final class lC2$d
implements ei0_0 {
    public static final String[] k = new String[]{"_data"};
    public final Context a;
    public final BP1 b;
    public final BP1 c;
    public final Uri d;
    public final int e;
    public final int f;
    public final Z92 g;
    public final Class h;
    public volatile boolean i;
    public volatile ei0_0 j;

    public lC2$d(Context context, BP1 bP1, BP1 bP12, Uri uri, int n3, int n4, Z92 z92, Class clazz) {
        this.a = context = context.getApplicationContext();
        this.b = bP1;
        this.c = bP12;
        this.d = uri;
        this.e = n3;
        this.f = n4;
        this.g = z92;
        this.h = clazz;
    }

    public final Class a() {
        return this.h;
    }

    public final void b() {
        ei0_0 ei0_02 = this.j;
        if (ei0_02 != null) {
            ei0_02.b();
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ei0_0 c() {
        Object object;
        Object object2;
        block11: {
            String string2;
            List list;
            int n3;
            int n4;
            Object object3;
            Object object4;
            block10: {
                void var7_10;
                block12: {
                    String string3;
                    block8: {
                        String string4;
                        block9: {
                            boolean bl2 = mC2.a();
                            object2 = null;
                            object4 = this.a;
                            object3 = this.g;
                            n4 = this.f;
                            n3 = this.e;
                            if (!bl2) break block10;
                            object = this.d;
                            string3 = "Failed to media store entry for: ";
                            string4 = "File path was empty in media store for: ";
                            Object object5 = object4.getContentResolver();
                            String[] stringArray = k;
                            Uri uri = object;
                            object4 = object5.query(object, stringArray, null, null, null);
                            if (object4 == null) break block8;
                            int n7 = object4.moveToFirst();
                            if (n7 == 0) break block8;
                            object5 = "_data";
                            n7 = object4.getColumnIndexOrThrow((String)object5);
                            boolean bl3 = TextUtils.isEmpty((CharSequence)(object5 = object4.getString(n7)));
                            if (bl3) break block9;
                            object = new File((String)object5);
                            object4.close();
                            object4 = this.b;
                            object = object4.a(object, n3, n4, (Z92)object3);
                            break block11;
                        }
                        try {
                            object3 = new StringBuilder(string4);
                            ((StringBuilder)object3).append(object);
                            object = ((StringBuilder)object3).toString();
                            object2 = new FileNotFoundException((String)object);
                            throw object2;
                        }
                        catch (Throwable throwable) {
                            object2 = object4;
                        }
                        break block12;
                    }
                    object3 = new StringBuilder(string3);
                    ((StringBuilder)object3).append(object);
                    object = ((StringBuilder)object3).toString();
                    object2 = new FileNotFoundException((String)object);
                    throw object2;
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                if (object2 == null) throw var7_10;
                object2.close();
                throw var7_10;
            }
            object = this.d;
            boolean bl4 = FN1.a(object);
            BP1 bP1 = this.c;
            if (bl4 && (bl4 = (list = object.getPathSegments()).contains(string2 = "picker"))) {
                object = bP1.a(object, n3, n4, (Z92)object3);
            } else {
                int n8 = Pk0.a((Context)object4);
                if (n8 == 0) {
                    object = nC2.a(object);
                }
                object = bP1.a(object, n3, n4, (Z92)object3);
            }
        }
        if (object == null) return object2;
        return object.c;
    }

    public final void cancel() {
        boolean bl2;
        this.i = bl2 = true;
        ei0_0 ei0_02 = this.j;
        if (ei0_02 != null) {
            ei0_02.cancel();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Az2 object, ei0$a ei0$a) {
        FileNotFoundException fileNotFoundException2;
        block4: {
            Object object2;
            String string2 = "Failed to build fetcher for: ";
            try {
                object2 = this.c();
                if (object2 == null) {
                    object2 = new StringBuilder(string2);
                    string2 = this.d;
                    ((StringBuilder)object2).append((Object)string2);
                    string2 = ((StringBuilder)object2).toString();
                    object = new IllegalArgumentException(string2);
                    ei0$a.c((Exception)object);
                    return;
                }
            }
            catch (FileNotFoundException fileNotFoundException2) {
                break block4;
            }
            this.j = object2;
            boolean bl2 = this.i;
            if (bl2) {
                this.cancel();
                return;
            }
            object2.d((Az2)((Object)object), ei0$a);
            return;
        }
        ei0$a.c(fileNotFoundException2);
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

