/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.ReviewsResponse;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cp2
 */
public final class cp2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cp2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object iterator) {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                int n4;
                Object object3 = iterator;
                object3 = (xs3_0)((Object)iterator);
                object2 = (wd2_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = (Number)((xs3_0)object3).a;
                int n7 = ((Number)object).intValue();
                Object object4 = (String)((xs3_0)object3).b;
                object3 = (DataCallback)((xs3_0)object3).c;
                cp$a cp$a = cp_1.Companion;
                int n8 = nn_2.b(cp$a, (DataCallback)object3);
                if (n8 == 0) return Unit.a;
                n8 = 8;
                String string2 = "REVIEW_IMAGE";
                String string3 = "ERROR";
                int n10 = 1;
                boolean bl3 = false;
                Object object5 = null;
                if (object3 != null && (n4 = ((DataCallback)object3).getStatus()) == 0) {
                    boolean bl4;
                    void var17_21;
                    Object object6 = LD2.a;
                    object6 = ((wd2_0)object2).b;
                    if (object6 != null) {
                        object6 = ((RatingsModel)object6).getOrderId();
                    } else {
                        n4 = 0;
                        object6 = null;
                    }
                    RatingsModel ratingsModel = ((wd2_0)object2).b;
                    if (ratingsModel != null) {
                        String string4 = ratingsModel.getSkuId();
                    } else {
                        Object var17_20 = null;
                    }
                    Object object7 = ((wd2_0)object2).b;
                    object7 = object7 != null ? ((RatingsModel)object7).getBrandName() : null;
                    Object object8 = ((wd2_0)object2).b;
                    object8 = object8 != null ? ((RatingsModel)object8).getProductBrick() : null;
                    AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                    String string5 = av_0.a(analyticsManager$Companion);
                    String string6 = av_0.a(analyticsManager$Companion);
                    String string7 = bv_0.a(analyticsManager$Companion);
                    Bundle bundle = LD2.a((String)object6, (String)var17_21, (String)object7, (String)object8);
                    String string8 = cv_0.a(analyticsManager$Companion);
                    NewCustomEventsRevamp newCustomEventsRevamp = LD2.a;
                    int n14 = 1536;
                    String string9 = "reviews & ratings interactions";
                    String string10 = "Add a photo";
                    String string11 = "image upload success";
                    String string12 = "reviews_rating_interactions";
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string9, string10, string11, string12, string5, string6, string7, bundle, string8, false, null, n14, null);
                    object6 = (ReviewsResponse)((DataCallback)object3).getData();
                    if (object6 != null) {
                        object6 = ((ReviewsResponse)object6).getReviewId();
                    } else {
                        n4 = 0;
                        object6 = null;
                    }
                    object3 = (ReviewsResponse)((DataCallback)object3).getData();
                    if (object3 != null && (object3 = ((ReviewsResponse)object3).getImageIds()) != null) {
                        object5 = object3 = CollectionsKt.firstOrNull((List)object3);
                        object5 = (Long)object3;
                    }
                    object3 = yn3_0.a;
                    StringBuilder stringBuilder = new StringBuilder("reviewId: ");
                    stringBuilder.append(object6);
                    stringBuilder.append(", image id : ");
                    stringBuilder.append(object5);
                    object7 = ", index is :";
                    stringBuilder.append((String)object7);
                    stringBuilder.append(n7);
                    object = stringBuilder.toString();
                    Object[] objectArray = new Object[]{};
                    ((yn3$a)object3).a((String)object, objectArray);
                    object = ((wd2_0)object2).X;
                    object3 = "mapOfLocallyDeletedImages";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    n3 = (int)(object.containsKey(object4) ? 1 : 0);
                    String string13 = "COMPLETED";
                    if (n3 != 0) {
                        object2 = (UploadImageAttributes)object.get(object4);
                        if (object2 != null) {
                            ((UploadImageAttributes)object2).setImageUploadStatus(string13);
                        }
                        if (object2 != null) {
                            ((UploadImageAttributes)object2).setImageId((Long)object5);
                        }
                        if (object2 != null) {
                            ((UploadImageAttributes)object2).setReviewId((Long)object6);
                        }
                        object.put(object4, object2);
                        return Unit.a;
                    }
                    n7 = ((wd2_0)object2).Qa((String)object4);
                    ((wd2_0)object2).ib(n7, string13, (Long)object6, (Long)object5);
                    object = ((wd2_0)object2).N;
                    n3 = object instanceof Collection;
                    if (n3 == 0 || (n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0)) == 0) {
                        object = ((ArrayList)object).iterator();
                        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                            object3 = (UploadImageAttributes)object.next();
                            object4 = ((UploadImageAttributes)object3).getViewType();
                            bl4 = Intrinsics.areEqual(object4, string2);
                            if (!bl4 || (n3 = (int)(Intrinsics.areEqual(object3 = ((UploadImageAttributes)object3).getImageUploadStatus(), object4 = "IN_PROGRESS") ? 1 : 0)) == 0) continue;
                            n7 = 1;
                            break;
                        }
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    object3 = ((wd2_0)object2).N;
                    bl4 = object3 instanceof Collection;
                    if (!bl4 || !(bl4 = ((ArrayList)object3).isEmpty())) {
                        object3 = ((ArrayList)object3).iterator();
                        while (bl4 = object3.hasNext()) {
                            object4 = (UploadImageAttributes)object3.next();
                            object5 = ((UploadImageAttributes)object4).getViewType();
                            bl3 = Intrinsics.areEqual(object5, string2);
                            if (!bl3 || !(bl4 = Intrinsics.areEqual(object4 = ((UploadImageAttributes)object4).getImageUploadStatus(), string3))) continue;
                            break;
                        }
                    } else {
                        n10 = 0;
                    }
                    if (n7 != 0) return Unit.a;
                    if (n10 != 0) return Unit.a;
                    object = ((wd2_0)object2).T;
                    if (object == null) return Unit.a;
                    object.setVisibility(n8);
                    return Unit.a;
                }
                if (object3 == null) return Unit.a;
                n7 = ((DataCallback)object3).getStatus();
                if (n7 != n10) return Unit.a;
                n7 = ((wd2_0)object2).Qa((String)object4);
                ((wd2_0)object2).ib(n7, string3, null, null);
                object = ((wd2_0)object2).N.iterator();
                n3 = 0;
                object3 = null;
                while (bl2 = object.hasNext()) {
                    object4 = (UploadImageAttributes)object.next();
                    object5 = ((UploadImageAttributes)object4).getViewType();
                    bl3 = Intrinsics.areEqual(object5, string2);
                    if (!bl3 || !(bl2 = Intrinsics.areEqual(object4 = ((UploadImageAttributes)object4).getImageUploadStatus(), string3))) continue;
                    n3 = 1;
                }
                if (n3 == 0) {
                    object = ((wd2_0)object2).T;
                    if (object == null) return Unit.a;
                    object.setVisibility(n8);
                    return Unit.a;
                }
                object = ((wd2_0)object2).T;
                if (object != null) {
                    n3 = R$string.image_upload_error;
                    object3 = ((Fragment)object2).getString(n3);
                    object.setText((CharSequence)object3);
                }
                if ((object = ((wd2_0)object2).T) != null) {
                    object.setVisibility(0);
                }
                if ((object = ((wd2_0)object2).T) == null) return Unit.a;
                ai0_2.a((View)object);
                return Unit.a;
            }
            case 0: 
        }
        Object object9 = iterator;
        object9 = (Throwable)((Object)iterator);
        object2 = (op2_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((op2_2)object2).v;
        object2 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object9);
        object2 = ((ApiErrorRepo)object2).handleApiException((Throwable)object9, "PAYMENT_BinInfo", true, "single page checkout", "Forward");
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

