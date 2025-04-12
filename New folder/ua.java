/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.customviews.widgets.ImageUploadWidget;
import com.ril.ajio.plp.ProgressRequestBody;
import com.ril.ajio.plp.ProgressRequestBody$a;
import com.ril.ajio.services.data.Product.ImageUploadResponseModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ua
implements Function1 {
    public final /* synthetic */ ia_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ua(ia_0 ia_02, String string2) {
        this.a = ia_02;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        object = (ImageUploadResponseModel)object;
        Object object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object == null) {
            object = ((ia_0)object2).E1;
            if (object != null) {
                ((ImageUploadWidget)((Object)object)).showTechError();
            }
        } else {
            object3 = ((q22_0)object2).cb().d.b.observeImageUploadStatus();
            Object object4 = ((Fragment)object2).getViewLifecycleOwner();
            Object object5 = new wa_0((ia_0)object2, (ImageUploadResponseModel)object);
            Ia$a ia$a = new Ia$a((Function1)object5);
            ((LiveData)object3).e((mu1_1)object4, ia$a);
            object3 = this.b;
            if (object3 != null) {
                object4 = new File((String)object3);
                boolean bl2 = ((File)object4).exists();
                if (bl2) {
                    object3 = pj2_2.Companion;
                    object5 = jn1_0.d;
                    object5 = JN1$a.b("application/octet-stream");
                    object3.getClass();
                    PJ2$a.a((jn1_0)object5, (File)object4);
                    object3 = new ProgressRequestBody((File)object4, (ProgressRequestBody$a)object2);
                    object2 = ((q22_0)object2).cb();
                    object = ((ImageUploadResponseModel)object).getUrl();
                    object2.getClass();
                    object4 = "uploadImageUrl";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object5 = "image";
                    Intrinsics.checkNotNullParameter(object3, (String)object5);
                    object2 = ((F12)object2).d;
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    Intrinsics.checkNotNullParameter(object3, (String)object5);
                    object5 = null;
                    object4 = new iv2_1((bv2_0)object2, (String)object, (ProgressRequestBody)object3, null);
                    int n3 = 3;
                    object2 = ((bv2_0)object2).e;
                    Ae3.d((i90_0)object2, null, null, (Function2)object4, n3);
                } else {
                    object = ((ia_0)object2).E1;
                    if (object != null) {
                        ((ImageUploadWidget)((Object)object)).showTechError();
                    }
                }
            }
        }
        return Unit.a;
    }
}

