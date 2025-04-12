/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.ratings.ReviewQueryParamters;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from fE2
 */
public final class fe2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ReviewQueryParamters b;
    public final /* synthetic */ UploadImageAttributes c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ gE2 e;
    public final /* synthetic */ int f;

    public fe2_0(ReviewQueryParamters reviewQueryParamters, UploadImageAttributes uploadImageAttributes, sd2_0 sd2_02, gE2 gE22, int n3, f80_0 f80_02) {
        this.b = reviewQueryParamters;
        this.c = uploadImageAttributes;
        this.d = sd2_02;
        this.e = gE22;
        this.f = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.d;
        Function1 function1 = object2;
        function1 = (sd2_0)object2;
        ReviewQueryParamters reviewQueryParamters = this.b;
        UploadImageAttributes uploadImageAttributes = this.c;
        gE2 gE22 = this.e;
        int n3 = this.f;
        object2 = object;
        object = new fe2_0(reviewQueryParamters, uploadImageAttributes, (sd2_0)function1, gE22, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fe2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fe2_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        int n3;
        Ref$ObjectRef ref$ObjectRef;
        LinkedHashMap linkedHashMap;
        Object object3;
        Object object4;
        UploadImageAttributes uploadImageAttributes;
        j90_0 j90_02;
        int n4;
        block16: {
            block17: {
                n4 = 1;
                j90_02 = j90_0.COROUTINE_SUSPENDED;
                int n7 = this.a;
                if (n7 != 0) {
                    if (n7 == n4) {
                        vl2_2.b(object);
                        return Unit.a;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                object = sE2.a;
                object = this.b;
                Intrinsics.checkNotNullParameter(object, "reviewQueryParameters");
                uploadImageAttributes = this.c;
                Intrinsics.checkNotNullParameter(uploadImageAttributes, "uploadedImageList");
                object4 = this.d;
                object3 = "onProgress";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                linkedHashMap = sE2.b((ReviewQueryParamters)object);
                ref$ObjectRef = new Ref$ObjectRef();
                object = uploadImageAttributes.getImagePath();
                if (object == null) break block16;
                n3 = ((String)object).length();
                if (n3 <= 0) break block16;
                object3 = new File((String)object);
                object = cr1_2.f;
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object4 = (sd2_0)object4;
                object2 = new vh0_2((jn1_0)object, (File)object3, (sd2_0)object4);
                object = uploadImageAttributes.getFileName();
                if (object != null) break block17;
                object = cp_1.Companion;
                object.getClass();
                object = cp$a.e();
                object.getClass();
                object = cp_1.l();
            }
            object4 = sE2.f;
            object = cR1$c$a.a((String)object4, (String)object, (pj2_2)object2);
            try {
                ref$ObjectRef.element = object;
            }
            catch (Exception exception) {
                object4 = yn3_0.a;
                ((yn3$a)object4).e(exception);
            }
        }
        UserInformation userInformation = VX0.a(AJIOApplication.Companion);
        object = userInformation.getCustomerUUID();
        object4 = UrlHelper.Companion.getInstance();
        object3 = new Object[n4];
        object3[0] = object;
        String string2 = ((UrlHelper)object4).getApiUrl("ratings", "set_reviews", (Object[])object3);
        object2 = object;
        object = new qe2_0(string2, userInformation, linkedHashMap, ref$ObjectRef, null);
        object4 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object4, (CoroutineContext)object);
        n3 = 3;
        object2 = null;
        object4 = new qg3_2(n3, null);
        object3 = new at0_1((es0_2)object, (gx0_2)object4);
        object4 = this.e;
        int n8 = this.f;
        object = new fE2$a((gE2)object4, n8, uploadImageAttributes);
        this.a = n4;
        if ((object = ((at0_1)object3).collect((fs0_2)object, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

