/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class SH3 {
    public static final void a(Context object) {
        boolean bl2;
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String[] stringArray = "androidx.work.workdb";
        Object object3 = object.getDatabasePath((String)stringArray);
        Object object4 = "context.getDatabasePath(WORK_DATABASE_NAME)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4 && (bl2 = ((File)object3).exists())) {
            boolean bl3;
            object3 = qx1.a();
            Object object5 = TH3.a;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            if (n3 >= n4) {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object3 = object.getDatabasePath((String)stringArray);
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                if (n3 < n4) {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = object.getDatabasePath((String)stringArray);
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                } else {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = object.getNoBackupFilesDir();
                    object2 = "context.noBackupFilesDir";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object = object4 = new File((File)object, (String)stringArray);
                }
                object2 = TH3.a;
                int n7 = eh1_2.c(((String[])object2).length);
                int n8 = 16;
                if (n7 < n8) {
                    n7 = 16;
                }
                object4 = new LinkedHashMap(n7);
                for (Object object6 : object2) {
                    Object object7 = new StringBuilder();
                    CharSequence charSequence = ((File)object3).getPath();
                    ((StringBuilder)object7).append((String)charSequence);
                    ((StringBuilder)object7).append((String)object6);
                    object7 = ((StringBuilder)object7).toString();
                    object5 = new File((String)object7);
                    charSequence = new StringBuilder();
                    String string2 = ((File)object).getPath();
                    ((StringBuilder)charSequence).append(string2);
                    ((StringBuilder)charSequence).append((String)object6);
                    object6 = ((StringBuilder)charSequence).toString();
                    object7 = new File((String)object6);
                    object4.put(object5, object7);
                }
                object2 = new Pair(object3, object);
                object = fh1_2.l((Map)object4, (Pair)object2);
            } else {
                object = fh1_2.f();
            }
            object = object.entrySet().iterator();
            while (bl3 = object.hasNext()) {
                object2 = (Map.Entry)object.next();
                stringArray = (File)object2.getKey();
                object2 = (File)object2.getValue();
                bl2 = stringArray.exists();
                if (!bl2) continue;
                bl2 = ((File)object2).exists();
                if (bl2) {
                    object3 = qx1.a();
                    object4 = TH3.a;
                    object2.toString();
                    object3.getClass();
                }
                if (bl2 = stringArray.renameTo((File)object2)) {
                    stringArray.toString();
                    object2.toString();
                } else {
                    stringArray.toString();
                    object2.toString();
                }
                object2 = qx1.a();
                stringArray = TH3.a;
                object2.getClass();
            }
        }
    }
}

