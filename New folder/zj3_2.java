/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZJ3
 */
public final class zj3_2 {
    public static String a(String object, String string2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "url");
        Intrinsics.checkNotNullParameter(string2, "filePath");
        string2 = Intrinsics.stringPlus(string2, "/haptik-custom-css/");
        Object object2 = new File(string2);
        ((File)object2).mkdirs();
        object2 = new URL((String)object);
        ((URL)object2).openConnection();
        object = ((URL)object2).openStream();
        object2 = new BufferedInputStream((InputStream)object);
        String string3 = "haptik-custom-css.css";
        Object object3 = Intrinsics.stringPlus(string2, string3);
        Object object4 = new FileOutputStream((String)object3);
        int n7 = 4096;
        object3 = new byte[n7];
        while ((n4 = ((InputStream)object2).read((byte[])object3)) != (n3 = -1)) {
            n3 = 0;
            ((FileOutputStream)object4).write((byte[])object3, 0, n4);
        }
        ((FileOutputStream)object4).close();
        ((BufferedInputStream)object2).close();
        ((InputStream)object).close();
        string2 = Intrinsics.stringPlus(string2, string3);
        object = new File(string2);
        object = ((File)object).getPath();
        Intrinsics.checkNotNullExpressionValue(object, "localFilePath");
        Intrinsics.checkNotNullParameter(object, "value");
        string2 = yl0.a;
        object2 = null;
        object4 = "helper";
        if (string2 != null) {
            string2 = string2.edit();
            string3 = "custom_css_file_local_path";
            string2.putString(string3, (String)object);
            string2.apply();
            long l2 = System.currentTimeMillis();
            string2 = yl0.a;
            if (string2 != null) {
                string2 = string2.edit();
                string2.putLong("custom_css_download_timestamp", l2);
                string2.apply();
                return object;
            }
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        throw null;
    }
}

