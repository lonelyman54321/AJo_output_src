/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 */
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ce0
 */
public final class ce0_1
implements v53_0 {
    public final /* synthetic */ de0_2 a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ ce0_1(de0_2 de0_22, Bitmap bitmap) {
        this.a = de0_22;
        this.b = bitmap;
    }

    public final void b(H53$a h53$a) {
        Object object;
        block3: {
            block2: {
                block1: {
                    object = this.a;
                    Intrinsics.checkNotNullParameter(object, "this$0");
                    Bitmap bitmap = this.b;
                    Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
                    Object object2 = "emitter";
                    Intrinsics.checkNotNullParameter(h53$a, (String)object2);
                    if (bitmap == null) break block1;
                    if ((object = ((Fragment)object).requireActivity().getExternalCacheDir()) == null) break block2;
                    String string2 = "/ImageSearch";
                    object2 = new File((File)object, string2);
                    boolean bl2 = ((File)object2).exists();
                    if (!bl2) {
                        ((File)object2).mkdir();
                    }
                    if (!(bl2 = ((File)object2).exists())) break block2;
                    object = ((File)object2).getAbsolutePath();
                    Intrinsics.checkNotNull(object);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append("/IMG_Search.jpeg");
                    object = ((StringBuilder)object2).toString();
                    object2 = new FileOutputStream((String)object);
                    string2 = Bitmap.CompressFormat.JPEG;
                    int n3 = 80;
                    bitmap.compress((Bitmap.CompressFormat)string2, n3, (OutputStream)object2);
                    ((OutputStream)object2).flush();
                    ((FileOutputStream)object2).close();
                    break block3;
                }
                object.getClass();
            }
            object = "";
        }
        object = Uri.parse((String)object);
        h53$a.a(object);
    }
}

