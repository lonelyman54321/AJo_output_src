/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

public final class DN1$b
implements ei0_0 {
    public static final String[] c = new String[]{"_data"};
    public final Context a;
    public final Uri b;

    public DN1$b(Context context, Uri uri) {
        this.a = context;
        this.b = uri;
    }

    public final Class a() {
        return File.class;
    }

    public final void b() {
    }

    public final void cancel() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Az2 object, ei0$a ei0$a) {
        void var2_5;
        boolean bl2;
        Uri uri;
        Object object2;
        block6: {
            object2 = this.a.getContentResolver();
            String[] stringArray = c;
            uri = this.b;
            Cursor cursor = object2.query(uri, stringArray, null, null, null);
            int n3 = 0;
            object2 = null;
            if (cursor != null) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            boolean bl3 = cursor.moveToFirst();
                            if (!bl3) break block4;
                            object2 = "_data";
                            n3 = cursor.getColumnIndexOrThrow((String)object2);
                            object2 = cursor.getString(n3);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    cursor.close();
                    break block6;
                }
                cursor.close();
                throw throwable2;
            }
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)object2)) {
            object2 = new StringBuilder("Failed to find file path for: ");
            uri = this.b;
            ((StringBuilder)object2).append(uri);
            object2 = ((StringBuilder)object2).toString();
            FileNotFoundException fileNotFoundException = new FileNotFoundException((String)object2);
            var2_5.c(fileNotFoundException);
            return;
        }
        File file = new File((String)object2);
        var2_5.f(file);
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

