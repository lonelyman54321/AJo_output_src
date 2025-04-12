/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;
import com.ril.ajio.customviews.widgets.ImageUploadWidget;
import com.ril.ajio.services.data.Product.ImageUploadResponseModel;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.query.ProductListQuery;
import java.io.File;
import java.net.URLEncoder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wa
 */
public final class wa_0
implements Function1 {
    public final /* synthetic */ ia_0 a;
    public final /* synthetic */ ImageUploadResponseModel b;

    public /* synthetic */ wa_0(ia_0 ia_02, ImageUploadResponseModel imageUploadResponseModel) {
        this.a = ia_02;
        this.b = imageUploadResponseModel;
    }

    public final Object invoke(Object object) {
        Object object2;
        block12: {
            block11: {
                ia_0 ia_02;
                Object object3;
                boolean bl2;
                block10: {
                    bl2 = false;
                    object2 = null;
                    object3 = object;
                    object3 = (Boolean)object;
                    ia_02 = this.a;
                    Intrinsics.checkNotNullParameter(ia_02, "this$0");
                    Object object4 = this.b;
                    Intrinsics.checkNotNullParameter(object4, "$imageUploadResponseModel");
                    Object object5 = Boolean.TRUE;
                    int n3 = Intrinsics.areEqual(object3, object5);
                    if (n3 == 0) break block10;
                    object3 = ia_02.E1;
                    if (object3 != null) {
                        n3 = 100;
                        ((ImageUploadWidget)((Object)object3)).setProgress(n3);
                    }
                    Object object6 = ia_02.K1;
                    Object object7 = ((NewCustomEventsRevamp)object6).getEC_IMAGE_SEARCH();
                    ia_02.getContext();
                    object3 = ia_02.z1;
                    object5 = new File((String)object3);
                    long l2 = ((File)object5).length();
                    long l3 = 1024L;
                    l2 = l2 / l3 / l3;
                    ia_02.getContext();
                    object3 = ia_02.z1;
                    n3 = ((String)object3).lastIndexOf(".") + 1;
                    object3 = ((String)object3).substring(n3);
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append(l2);
                    ((StringBuilder)object5).append(" | ");
                    ((StringBuilder)object5).append((String)object3);
                    String string2 = ((StringBuilder)object5).toString();
                    int n4 = 1536;
                    String string3 = "image uploaded";
                    String string4 = "event_upload_image_interactions";
                    String string5 = "image upload screen";
                    String string6 = "image upload screen";
                    String string7 = ia_02.L1;
                    String string8 = ia_02.M1;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object7, string3, string2, string4, string5, string6, string7, null, string8, false, null, n4, null);
                    object3 = ia_02.E1;
                    if (object3 != null) {
                        ((ImageUploadWidget)((Object)object3)).verifyImage();
                    }
                    object3 = ia_02.cb().d.q;
                    object5 = ia_02.getViewLifecycleOwner();
                    object6 = new pa_0(ia_02, 0);
                    object7 = new Ia$a((Function1)object6);
                    ((LiveData)object3).e((mu1_1)object5, (F62)object7);
                    object3 = ia_02.cb();
                    object4 = ((ImageUploadResponseModel)object4).getObjectName();
                    object3.getClass();
                    Intrinsics.checkNotNullParameter(object4, "imageName");
                    object5 = h40_0.a;
                    n3 = (int)(h40_0.m2() ? 1 : 0);
                    object5 = n3 != 0 ? "image_search_url_v2" : "image_search_url";
                    object6 = UrlHelper.Companion.getInstance();
                    object2 = new Object[]{};
                    object7 = "plp";
                    object2 = ((UrlHelper)object6).getApiUrl((String)object7, (String)object5, (Object[])object2);
                    object5 = "UTF-8";
                    object4 = URLEncoder.encode((String)object4, (String)object5);
                    n3 = (int)(h40_0.M1() ? 1 : 0);
                    object6 = "?image_name=";
                    if (n3 != 0 && (n3 = (int)(((F12)object3).g() ? 1 : 0)) != 0) {
                        object5 = ((F12)object3).b.d.getCustomerUUID();
                        object7 = "&userId=";
                        object2 = KW.a((String)object2, (String)object6, (String)object4, (String)object7, (String)object5);
                    } else {
                        object2 = n1.a((String)object2, (String)object6, (String)object4);
                    }
                    object4 = new ProductListQuery();
                    object5 = (Boolean)((F12)object3).a.getValue();
                    ((Boolean)object5).booleanValue();
                    ((ProductListQuery)object4).setUrgencyDriverEnabled((Boolean)object5);
                    object3 = ((F12)object3).d;
                    ((bv2_0)object3).o((String)object2, (ProductListQuery)object4);
                    object2 = ia_02.C;
                    if (object2 != null) {
                        ((ImageSearchCategoryWidget)object2).setImageSearchCamera();
                    }
                    break block11;
                }
                object2 = Boolean.FALSE;
                bl2 = Intrinsics.areEqual(object3, object2);
                if (!bl2) break block12;
                object2 = ia_02.E1;
                if (object2 != null) {
                    ((ImageUploadWidget)((Object)object2)).showTechError();
                }
            }
            return Unit.a;
        }
        object2 = new NoWhenBranchMatchedException();
        throw object2;
    }
}

