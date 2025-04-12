/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ItemRatingsViewReturnOrderBinding;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.Question;
import com.ril.ajio.services.data.Order.QuestionResponse;
import com.ril.ajio.services.data.Order.Rating;
import com.ril.ajio.services.data.Order.UserSubRating;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class XH2
implements View.OnClickListener {
    public final /* synthetic */ Ref$BooleanRef a;
    public final /* synthetic */ ItemRatingsViewReturnOrderBinding b;
    public final /* synthetic */ aI2$a c;
    public final /* synthetic */ Rating d;
    public final /* synthetic */ OrderDetailLineItem e;
    public final /* synthetic */ ai2_1 f;

    public /* synthetic */ XH2(Ref$BooleanRef ref$BooleanRef, ItemRatingsViewReturnOrderBinding itemRatingsViewReturnOrderBinding, aI2$a aI2$a, Rating rating, OrderDetailLineItem orderDetailLineItem, ai2_1 ai2_12) {
        this.a = ref$BooleanRef;
        this.b = itemRatingsViewReturnOrderBinding;
        this.c = aI2$a;
        this.d = rating;
        this.e = orderDetailLineItem;
        this.f = ai2_12;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Ref$BooleanRef ref$BooleanRef;
        block34: {
            float f5;
            OrderDetailLineItem orderDetailLineItem;
            Rating rating;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            block40: {
                Object object5;
                int n3;
                Object object6;
                int n4;
                Object object7;
                ArrayList arrayList;
                Serializable serializable;
                AjioTextView ajioTextView;
                Serializable serializable2;
                int n7;
                int n8;
                block31: {
                    block39: {
                        int n10;
                        block36: {
                            block38: {
                                block37: {
                                    boolean bl2;
                                    block35: {
                                        XH2 xH2;
                                        block33: {
                                            xH2 = this;
                                            n8 = 1;
                                            ref$BooleanRef = this.a;
                                            Intrinsics.checkNotNullParameter(ref$BooleanRef, "$isExpanded");
                                            object4 = this.b;
                                            Intrinsics.checkNotNullParameter(object4, "$this_apply");
                                            object3 = this.c;
                                            Intrinsics.checkNotNullParameter(object3, "this$0");
                                            object2 = this.f;
                                            object = "this$1";
                                            Intrinsics.checkNotNullParameter(object2, (String)object);
                                            int n14 = ref$BooleanRef.element;
                                            n10 = 8;
                                            n7 = 0;
                                            serializable2 = null;
                                            if (n14 == 0) break block33;
                                            ((ItemRatingsViewReturnOrderBinding)object4).odEditFeedback.setVisibility(n10);
                                            ((aI2$a)object3).e.setVisibility(n10);
                                            ((ItemRatingsViewReturnOrderBinding)object4).reviewComposeLayout.setVisibility(n10);
                                            ((aI2$a)object3).d.setVisibility(n10);
                                            ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown.setVisibility(0);
                                            ((ItemRatingsViewReturnOrderBinding)object4).odItemRatingCl.setVisibility(0);
                                            ((ItemRatingsViewReturnOrderBinding)object4).odRatingCl.setVisibility(0);
                                            object2 = ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown;
                                            object3 = ((RecyclerView$B)object3).itemView.getContext();
                                            n14 = R$drawable.arrow_down;
                                            object3 = t70.getDrawable((Context)object3, n14);
                                            object2.setImageDrawable((Drawable)object3);
                                            object4 = ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown;
                                            int n15 = R$string.acc_down_arrow_icon;
                                            object3 = hv3_0.K(n15);
                                            object4.setContentDescription((CharSequence)object3);
                                            break block34;
                                        }
                                        object = ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown;
                                        Context context = ((RecyclerView$B)object3).itemView.getContext();
                                        int n16 = R$drawable.arrow_up;
                                        Drawable drawable2 = t70.getDrawable(context, n16);
                                        object.setImageDrawable(drawable2);
                                        object = ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown;
                                        int n17 = R$string.acc_up_arrow_icon;
                                        String string2 = hv3_0.K(n17);
                                        object.setContentDescription((CharSequence)string2);
                                        ((ItemRatingsViewReturnOrderBinding)object4).odEditFeedback.setVisibility(0);
                                        object = ((aI2$a)object3).e;
                                        object.setVisibility(0);
                                        ((ItemRatingsViewReturnOrderBinding)object4).reviewComposeLayout.setVisibility(0);
                                        ajioTextView = ((aI2$a)object3).d;
                                        ajioTextView.setVisibility(0);
                                        ((ItemRatingsViewReturnOrderBinding)object4).odOrderDown.setVisibility(0);
                                        ((ItemRatingsViewReturnOrderBinding)object4).odItemRatingCl.setVisibility(0);
                                        ((ItemRatingsViewReturnOrderBinding)object4).odRatingCl.setVisibility(0);
                                        boolean bl3 = false;
                                        object4 = null;
                                        rating = this.d;
                                        if (rating != null) {
                                            serializable = rating.userSubRatings;
                                        } else {
                                            bl2 = false;
                                            serializable = null;
                                        }
                                        orderDetailLineItem = xH2.e;
                                        if (serializable != null && !(bl2 = serializable.isEmpty())) break block35;
                                        if (rating != null && (serializable = rating.questionResponse) != null) {
                                            serializable = ((QuestionResponse)serializable).questions;
                                        } else {
                                            bl2 = false;
                                            serializable = null;
                                        }
                                        if (serializable == null || (bl2 = serializable.isEmpty())) break block36;
                                    }
                                    arrayList = new ArrayList();
                                    if (rating != null) {
                                        serializable = rating.userSubRatings;
                                    } else {
                                        bl2 = false;
                                        serializable = null;
                                    }
                                    object7 = rating != null && (object7 = rating.questionResponse) != null ? ((QuestionResponse)object7).questions : null;
                                    if (serializable != null) {
                                        n4 = ((ArrayList)serializable).size();
                                    } else {
                                        n4 = 0;
                                        object6 = null;
                                    }
                                    if (object7 != null) {
                                        n3 = ((ArrayList)object7).size();
                                    } else {
                                        n3 = 0;
                                        object5 = null;
                                    }
                                    if (n4 != n3) break block37;
                                    if (rating != null) {
                                        arrayList = rating.userSubRatings;
                                        break block31;
                                    } else {
                                        n10 = 0;
                                        arrayList = null;
                                    }
                                    break block31;
                                }
                                if (object7 == null || (n4 = (int)(object7.isEmpty() ? 1 : 0)) != 0) break block38;
                                object7 = object7.iterator();
                                break block39;
                            }
                            if (serializable == null || (n7 = serializable.isEmpty()) != 0) break block31;
                            arrayList.addAll(serializable);
                            break block31;
                        }
                        object.setVisibility(n10);
                        ajioTextView.setVisibility(n10);
                        break block40;
                    }
                    while ((n4 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                        object6 = (Question)object7.next();
                        n3 = ((Question)object6).questionId;
                        if (serializable == null) {
                            n7 = 0;
                            serializable2 = null;
                        } else {
                            void var30_40;
                            block32: {
                                boolean bl4;
                                Iterator iterator = serializable.iterator();
                                while (bl4 = iterator.hasNext()) {
                                    Object t3 = iterator.next();
                                    serializable2 = t3;
                                    serializable2 = (UserSubRating)t3;
                                    n7 = ((UserSubRating)serializable2).questionId;
                                    if (n7 != n3) {
                                        n7 = 0;
                                        serializable2 = null;
                                        continue;
                                    }
                                    break block32;
                                }
                                bl4 = false;
                                Object var30_39 = null;
                            }
                            UserSubRating userSubRating = (UserSubRating)var30_40;
                            serializable2 = userSubRating;
                        }
                        if (serializable2 != null) {
                            arrayList.add(serializable2);
                        } else {
                            serializable2 = new UserSubRating();
                            object5 = ((Question)object6).title;
                            ((UserSubRating)serializable2).setTitle((String)object5);
                            n4 = ((Question)object6).questionId;
                            ((UserSubRating)serializable2).setQuestionId(n4);
                            arrayList.add(serializable2);
                        }
                        n7 = 0;
                        serializable2 = null;
                    }
                }
                serializable2 = orderDetailLineItem.getEntry();
                if (serializable2 != null) {
                    serializable2 = ((CartEntry)serializable2).getProduct();
                } else {
                    n7 = 0;
                    serializable2 = null;
                }
                serializable = ((ai2_1)object2).b;
                object7 = AnalyticsManager.Companion;
                object6 = ((AnalyticsManager$Companion)object7).getInstance().getGtmEvents();
                object5 = "order details screen";
                ((GTMEvents)object6).setScreenName((String)object5);
                object7 = ((AnalyticsManager$Companion)object7).getInstance().getNewEEcommerceEventsRevamp();
                object6 = "order listing screen";
                ((NewEEcommerceEventsRevamp)object7).setPrevScreen((String)object6);
                if (arrayList != null) {
                    n4 = yx_2.o(arrayList, 10);
                    object7 = new Object(n4);
                    object6 = arrayList.iterator();
                    while ((n3 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                        object5 = ((UserSubRating)object6.next()).title;
                        ((ArrayList)object7).add((String)object5);
                    }
                } else {
                    object7 = null;
                }
                if (object7 != null) {
                    object7 = object7.iterator();
                    n4 = 0;
                    object6 = null;
                    while ((n3 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
                        object5 = object7.next();
                        int n18 = n4 + 1;
                        if (n4 < 0) {
                            xx_2.n();
                            throw null;
                        }
                        String string4 = object5;
                        string4 = object5;
                        object5 = LD2.a;
                        Intrinsics.checkNotNull(string4);
                        object6 = (UserSubRating)CollectionsKt.N(n4, arrayList);
                        if (object6 == null || (object6 = ((UserSubRating)object6).subQuestionText) == null) {
                            object6 = "";
                        }
                        Object object8 = object6;
                        Object object9 = serializable != null ? (object6 = ((CartOrder)serializable).getCode()) : null;
                        Object object10 = serializable2 != null ? (object6 = ((Product)serializable2).getCode()) : null;
                        Object object11 = serializable2 != null ? (object6 = ((Product)serializable2).getBrickCategory()) : null;
                        Object object12 = serializable2 != null ? (object6 = ((Product)serializable2).getBrandName()) : null;
                        LD2.f(string4, (String)object8, (String)object9, (String)object10, (String)object12, (String)object11);
                        n4 = n18;
                    }
                }
                n7 = 0;
                serializable2 = null;
                object.setVisibility(0);
                ajioTextView.setVisibility(0);
                object3 = ((RecyclerView$B)object3).itemView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)object3, n8, false);
                object3 = new qa2_1(arrayList);
                ((RecyclerView)object).setLayoutManager(linearLayoutManager);
                ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                object3 = ((ai2_1)object2).e;
                object3.o6();
            }
            object3 = orderDetailLineItem.getEntry();
            if (object3 != null) {
                object4 = ((CartEntry)object3).getProduct();
            }
            if (rating != null) {
                f5 = rating.rating;
            } else {
                boolean bl5 = false;
                f5 = 0.0f;
                object3 = null;
            }
            object4 = aI2$a.w((Product)object4, f5, rating);
            object3 = LD2.a;
            object3 = ((RatingsModel)object4).getOrderId();
            object2 = ((RatingsModel)object4).getSkuId();
            object = ((RatingsModel)object4).getBrandName();
            object4 = ((RatingsModel)object4).getProductBrick();
            LD2.e((String)object3, (String)object2, (String)object, (String)object4);
        }
        int n19 = ref$BooleanRef.element;
        ref$BooleanRef.element = n8 ^= n19;
    }
}

