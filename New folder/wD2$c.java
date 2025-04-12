/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.services.data.ratings.RatingsModel;
import com.ril.ajio.services.data.ratings.RatingsQuestionsResponseModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class wD2$c
implements sC2 {
    public final /* synthetic */ wd2_0 a;

    public wD2$c(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final void a(RatingsQuestionsResponseModel object) {
        block13: {
            int n3;
            Object object2;
            block14: {
                Object object3;
                Integer n4;
                Object object4;
                Object object5;
                block12: {
                    Intrinsics.checkNotNullParameter(object, "ratingsQuestionsResponseModel");
                    object2 = this.a;
                    object5 = ((Fragment)object2).getView();
                    if (object5 != null) {
                        ai0_2.j((View)object5);
                    }
                    object5 = ((wd2_0)object2).b;
                    object4 = null;
                    object5 = object5 != null ? ((RatingsModel)object5).getProductRating() : null;
                    ((wd2_0)object2).q = object5;
                    object5 = ((wd2_0)object2).l;
                    int n7 = -1;
                    if (object5 != null) {
                        boolean bl2;
                        object5 = ((ArrayList)object5).iterator();
                        n3 = 0;
                        while (bl2 = object5.hasNext()) {
                            n4 = ((RatingsQuestionsResponseModel)object5.next()).getQuestionId();
                            bl2 = Intrinsics.areEqual(n4, object3 = ((RatingsQuestionsResponseModel)object).getQuestionId());
                            if (!bl2) {
                                ++n3;
                                continue;
                            }
                            break;
                        }
                    } else {
                        n3 = -1;
                    }
                    if (n3 != n7) break block12;
                    object2 = ((wd2_0)object2).l;
                    if (object2 != null) {
                        ((ArrayList)object2).add(object);
                    }
                    break block13;
                }
                object5 = ((RatingsQuestionsResponseModel)object).getResponseId();
                if (object5 == null) break block14;
                Integer n8 = ((RatingsQuestionsResponseModel)object).getQuestionId();
                n4 = ((RatingsQuestionsResponseModel)object).getResponseId();
                object3 = ((RatingsQuestionsResponseModel)object).getResponseText();
                object = ((RatingsQuestionsResponseModel)object).getQuestionText();
                object5 = new RatingsQuestionsResponseModel(n8, n4, (String)object3, (String)object);
                object = ((wd2_0)object2).l;
                if (object != null) {
                    object4 = object = ((ArrayList)object).set(n3, object5);
                    object4 = (RatingsQuestionsResponseModel)object;
                }
                if (object4 != null) break block13;
            }
            if ((object = ((wd2_0)object2).l) != null) {
                object = (RatingsQuestionsResponseModel)((ArrayList)object).remove(n3);
            }
        }
    }
}

