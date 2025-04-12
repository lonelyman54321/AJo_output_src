/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.text.TextUtils
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.ril.ajio.R$string;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O13
 */
public final class o13_0
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ o13_0(Context context, Bitmap bitmap) {
        this.a = context;
        this.b = bitmap;
    }

    public final Object call() {
        boolean bl2;
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "$context");
        Object object = context.getExternalCacheDir();
        if (object != null) {
            object = ((File)object).getAbsolutePath();
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = "/share/";
        object = Ft2.a((String)object, (String)object2);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            String string2;
            String string3;
            long l2 = System.currentTimeMillis();
            String string4 = Ov2.a(l2, string3 = "share_image_", string2 = ".jpg");
            object2 = new File((String)object, string4);
            if ((object = ((File)object2).getParentFile()) != null) {
                ((File)object).mkdirs();
            }
            if (!(bl2 = ((File)object2).exists())) {
                ((File)object2).createNewFile();
            }
            object = new FileOutputStream((File)object2);
            string4 = this.b;
            if (string4 != null) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                int n3 = 100;
                string4.compress(compressFormat, n3, (OutputStream)object);
            }
            ((FileOutputStream)object).close();
            object = hv3_0.K(R$string.file_authority);
            return FileProvider.d(context, (String)object, (File)object2);
        }
        object = new Exception("directory path empty");
        throw object;
    }
}

