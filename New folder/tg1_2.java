/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Home.HomeContentData;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform$Builder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from TG1
 */
public final class tg1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tg1_2(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (dl2_2)object;
                object = (zr1_1)this.b;
                Intrinsics.checkNotNullParameter(object, "$referralImageMLD");
                Object object3 = (jH2)this.c;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                Intrinsics.checkNotNullParameter(object2, "imageResp");
                Object object4 = (HomeContentData)((dl2_2)object2).b;
                Object object5 = ((dl2_2)object2).a;
                boolean bl2 = ((cl2_2)object5).d();
                if (bl2 && object4 != null) {
                    object3 = new ReferralImageDataTransform$Builder();
                    object3 = ((ReferralImageDataTransform$Builder)object3).build((HomeContentData)object4);
                    object4 = DataCallback.Companion;
                    object3 = ((DataCallback$Companion)object4).onSuccess(object3);
                    ((LiveData)object).i(object3);
                    object = g53_0.d(Boolean.TRUE);
                } else {
                    DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
                    object3.getClass();
                    object4 = ApiErrorRepo.INSTANCE;
                    int n4 = 28;
                    object5 = "referral_banner";
                    object3 = ApiErrorRepo.getApiError$default((ApiErrorRepo)object4, (dl2_2)object2, (String)object5, false, null, null, n4, null);
                    object3 = dataCallback$Companion.onFailed((DataError)object3);
                    ((LiveData)object).i(object3);
                    object = g53_0.d(Boolean.FALSE);
                }
                return object;
            }
            case 0: 
        }
        object = (uu_1)object;
        Intrinsics.checkNotNullParameter(object, "$this$buildSerialDescriptor");
        SerialDescriptor serialDescriptor = ((KSerializer)this.b).getDescriptor();
        uu_1.a((uu_1)object, "key", serialDescriptor);
        serialDescriptor = ((KSerializer)this.c).getDescriptor();
        uu_1.a((uu_1)object, "value", serialDescriptor);
        return Unit.a;
    }
}

