/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class pD2
implements o60_0 {
    public final /* synthetic */ UploadImageAttributes a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wd2_0 c;

    public /* synthetic */ pD2(int n3, wd2_0 wd2_02, UploadImageAttributes uploadImageAttributes) {
        this.a = uploadImageAttributes;
        this.b = n3;
        this.c = wd2_02;
    }

    public final void accept(Object object) {
        int n3 = 1;
        Object[] objectArray = this.a;
        Intrinsics.checkNotNullParameter(objectArray, "$uploadImageAttributes");
        String string2 = "this$0";
        wd2_0 wd2_02 = this.c;
        Intrinsics.checkNotNullParameter(wd2_02, string2);
        int n4 = object instanceof uy2_2;
        if (n4 != 0) {
            object = (uy2_2)object;
            string2 = ((uy2_2)object).e;
            objectArray.setImageUri((Uri)string2);
            string2 = ((uy2_2)object).c;
            objectArray.setImagePath(string2);
            n4 = this.b;
            Integer n7 = n4;
            objectArray.setImagePosition(n7);
            objectArray.setCompressed(n3 != 0);
            object = ((uy2_2)object).a;
            objectArray.setFileName((String)object);
            objectArray.setImageUploadStatus("IN_PROGRESS");
            wd2_02.N.set(n4, objectArray);
            object = wd2_02.M;
            if (object != null) {
                ((RecyclerView$f)object).notifyItemChanged(n4);
            }
            wd2_02.jb(n4, (UploadImageAttributes)objectArray);
        } else {
            object = StringCompanionObject.INSTANCE;
            int n8 = R$string.acc_error_message;
            object = hv3_0.K(n8);
            n4 = R$string.something_wrong_msg;
            string2 = hv3_0.K(n4);
            objectArray = new Object[n3];
            wd2_02 = null;
            objectArray[0] = string2;
            string2 = "format(...)";
            object = xh2_0.a(objectArray, n3, (String)object, string2);
            n3 = R$string.something_wrong_msg;
            String string3 = hv3_0.K(n3);
            mq0_2.b(string3, (String)object);
        }
    }
}

