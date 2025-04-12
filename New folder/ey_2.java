/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import com.ril.ajio.data.repo.ApiErrorRepo;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ey
 */
public final class ey_2
implements dy$a,
vv1$a,
bx0_2 {
    public Bitmap a(int n3, byte[] object) {
        try {
            return uy_1.a(n3, object);
        }
        catch (IOException iOException) {
            object = new ImageDecoderException;
            object(iOException);
            throw object;
        }
        catch (ParserException parserException) {
            StringBuilder stringBuilder = new StringBuilder("Could not decode image data with BitmapFactory. (data.length = ");
            int n4 = ((byte[])object).length;
            stringBuilder.append(n4);
            stringBuilder.append(", input length = ");
            stringBuilder.append(n3);
            stringBuilder.append(")");
            String string2 = stringBuilder.toString();
            ImageDecoderException imageDecoderException = new Exception(string2, parserException);
            throw imageDecoderException;
        }
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "PAYMENT_TransactionGetstatus";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

