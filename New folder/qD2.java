/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class qD2
implements o60_0 {
    public final /* synthetic */ UploadImageAttributes a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wd2_0 c;

    public /* synthetic */ qD2(int n3, wd2_0 wd2_02, UploadImageAttributes uploadImageAttributes) {
        this.a = uploadImageAttributes;
        this.b = n3;
        this.c = wd2_02;
    }

    public final void accept(Object object) {
        int n3 = 1;
        object = (Throwable)object;
        UploadImageAttributes uploadImageAttributes = this.a;
        Intrinsics.checkNotNullParameter(uploadImageAttributes, "$uploadImageAttributes");
        wd2_0 wd2_02 = this.c;
        Intrinsics.checkNotNullParameter(wd2_02, "this$0");
        object = StringCompanionObject.INSTANCE;
        object = hv3_0.K(R$string.acc_error_message);
        int n4 = R$string.something_wrong_msg;
        String string2 = hv3_0.K(n4);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        string2 = "format(...)";
        object = xh2_0.a(objectArray, n3, (String)object, string2);
        n3 = R$string.something_wrong_msg;
        mq0_2.b(hv3_0.K(n3), (String)object);
        int n7 = this.b;
        Integer n8 = n7;
        uploadImageAttributes.setImagePosition(n8);
        uploadImageAttributes.setCompressed(false);
        uploadImageAttributes.setImageUploadStatus("ERROR");
        wd2_02.N.set(n7, uploadImageAttributes);
        PO2 pO2 = wd2_02.M;
        if (pO2 != null) {
            pO2.notifyItemChanged(n7);
        }
    }
}

