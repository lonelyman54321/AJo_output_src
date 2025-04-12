/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public final class QU1 {
    public final NU1 a;
    public final mm0 b;

    public QU1(NU1 nU1, mm0 mm02) {
        this.a = nU1;
        this.b = mm02;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final HC1 a(Context object, String object2, InputStream object3, String object4, String string2) {
        boolean bl2;
        NU1 nU1;
        block11: {
            FileInputStream fileInputStream;
            Object object5;
            block12: {
                String string3;
                String string4;
                boolean bl3;
                if (object4 == null) {
                    object4 = "application/json";
                }
                object5 = "application/zip";
                boolean bl4 = ((String)object4).contains((CharSequence)object5);
                fileInputStream = null;
                nU1 = this.a;
                if (bl4 || (bl4 = ((String)object4).contains((CharSequence)(object5 = "application/x-zip"))) || (bl4 = ((String)object4).contains((CharSequence)(object5 = "application/x-zip-compressed"))) || (bl3 = (string4 = ((String)object2).split((String)(object5 = "\\?"))[0]).endsWith(string3 = ".lottie"))) break block12;
                object = "application/gzip";
                bl2 = ((String)object4).contains((CharSequence)object);
                if (!(bl2 || (bl2 = ((String)object4).contains((CharSequence)(object = "application/x-gzip"))) || (bl2 = ((String)(object = ((String)object2).split((String)object5)[0])).endsWith((String)(object4 = ".tgs"))))) {
                    rx1.a();
                    object = pL0.JSON;
                    if (string2 != null && nU1 != null) {
                        object3 = nU1.d((String)object2, (InputStream)object3, (pL0)((Object)object));
                        object3 = ((File)object3).getAbsolutePath();
                        object4 = new FileInputStream((String)object3);
                        object3 = cc1_0.e((InputStream)object4, (String)object2);
                        break block11;
                    } else {
                        object3 = cc1_0.e((InputStream)object3, null);
                    }
                    break block11;
                } else {
                    rx1.a();
                    object = pL0.GZIP;
                    if (string2 != null && nU1 != null) {
                        object3 = nU1.d((String)object2, (InputStream)object3, (pL0)((Object)object));
                        object5 = new FileInputStream((File)object3);
                        object4 = new GZIPInputStream((InputStream)object5);
                        object3 = cc1_0.e((InputStream)object4, (String)object2);
                        break block11;
                    } else {
                        object4 = new GZIPInputStream((InputStream)object3);
                        object3 = cc1_0.e((InputStream)object4, null);
                    }
                }
                break block11;
            }
            rx1.a();
            object4 = pL0.ZIP;
            if (string2 != null && nU1 != null) {
                object3 = nU1.d((String)object2, (InputStream)object3, (pL0)((Object)object4));
                fileInputStream = new FileInputStream((File)object3);
                object5 = new ZipInputStream(fileInputStream);
                object = cc1_0.i((Context)object, (ZipInputStream)object5, (String)object2);
            } else {
                object5 = new ZipInputStream((InputStream)object3);
                object = cc1_0.i((Context)object, (ZipInputStream)object5, null);
            }
            object3 = object;
            object = object4;
        }
        if (string2 != null && (object4 = ((HC1)object3).a) != null && nU1 != null) {
            boolean bl5 = true;
            object = NU1.a((String)object2, (pL0)((Object)object), bl5);
            object4 = nU1.c();
            object2 = new File((File)object4, (String)object);
            object = ((File)object2).getAbsolutePath();
            string2 = "";
            object = ((String)object).replace(".temp", string2);
            object4 = new File((String)object);
            bl2 = ((File)object2).renameTo((File)object4);
            object4.toString();
            rx1.a();
            if (!bl2) {
                string2 = "Unable to rename cache file ";
                object = new StringBuilder(string2);
                object2 = ((File)object2).getAbsolutePath();
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" to ");
                object2 = ((File)object4).getAbsolutePath();
                ((StringBuilder)object).append((String)object2);
                object2 = ".";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                rx1.b((String)object);
            }
        }
        return object3;
    }
}

