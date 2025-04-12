/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.services.data.Home.HomePageRatingViewType;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import com.willy.ratingbar.BaseRatingBar$a;
import com.willy.ratingbar.ScaleRatingBar;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O71
 */
public final class o71_0
extends RecyclerView$f {
    public final ArrayList a;
    public final String b;
    public final String c;
    public R71 d;
    public fU1 e;

    public o71_0(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "sourcePage");
        Intrinsics.checkNotNullParameter(string3, "ratingTitle");
        this.a = arrayList;
        this.b = string2;
        this.c = string3;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        Object object;
        ArrayList arrayList = this.a;
        if (arrayList != null && (object = (UserUnratedItem)arrayList.get(n3)) != null && (object = ((UserUnratedItem)object).getViewType()) != null) {
            n3 = ((HomePageRatingViewType)((Object)object)).getType();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "viewHolder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = object instanceof O71$b;
        int n7 = 0;
        ArrayList arrayList = null;
        int n8 = 0;
        Object object3 = null;
        Object object4 = this.a;
        if (n4 != 0) {
            Object object5;
            if (object4 != null) {
                object5 = ((ArrayList)object4).get(n3);
                object3 = object5;
                object3 = (UserUnratedItem)object5;
            }
            object = (O71$b)object;
            object.getClass();
            if (object3 != null) {
                int n10;
                Object object6;
                object5 = ((UserUnratedItem)object3).getBrandName();
                if (object5 != null) {
                    object2 = ((O71$b)object).b;
                    object2.setText(object5);
                }
                if ((object5 = ((UserUnratedItem)object3).getBrandTitle()) != null) {
                    object2 = ((O71$b)object).c;
                    object2.setText(object5);
                }
                object5 = ((O71$b)object).g;
                object2 = ((o71_0)object5).b;
                object4 = "LP";
                n4 = Intrinsics.areEqual(object2, object4);
                int n14 = 1092616192;
                float f5 = 10.0f;
                ScaleRatingBar scaleRatingBar = ((O71$b)object).d;
                if (n4 != 0) {
                    AjioRoundedCornerImageView.Companion.setRadius(f5);
                    object2 = ((RecyclerView$B)object).itemView;
                    n14 = hv3_0.m(R$color.white);
                    object2.setBackgroundColor(n14);
                } else {
                    object2 = ((RecyclerView$B)object).itemView;
                    object6 = object2.getContext();
                    String string2 = "getContext(...)";
                    Intrinsics.checkNotNullExpressionValue(object6, string2);
                    int n15 = R$attr.bg_color_accent_2;
                    n10 = tm3_0.a(n15, object6);
                    object2.setBackgroundColor(n10);
                    AjioRoundedCornerImageView.Companion.setRadius(f5);
                    object2 = ((RecyclerView$B)object).itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    n14 = R$attr.rating_empty;
                    n4 = tm3_0.b(n14, (Context)object2);
                    scaleRatingBar.setEmptyDrawableRes(n4);
                    n4 = R$string.acc_star_unselected;
                    object2 = hv3_0.K(n4);
                    scaleRatingBar.setContentDescription((CharSequence)object2);
                }
                object2 = ((UserUnratedItem)object3).getImageUrl();
                if (object2 != null) {
                    object4 = new da$a();
                    n10 = 1;
                    ((da$a)object4).k = n10;
                    ((da$a)object4).r = n10;
                    n10 = R$string.acc_banner;
                    object6 = hv3_0.K(n10);
                    ((da$a)object4).b((String)object6);
                    ((da$a)object4).n = object2;
                    object2 = ((O71$b)object).a;
                    ((da$a)object4).u = object2;
                    ((da$a)object4).a();
                }
                if ((object2 = ((UserUnratedItem)object3).getProductRating()) != null) {
                    float f6 = ((Number)object2).floatValue();
                    scaleRatingBar.setRating(f6);
                } else {
                    n4 = 0;
                    float f7 = 0.0f;
                    object2 = null;
                    scaleRatingBar.setRating(0.0f);
                }
                ai0_2.b(scaleRatingBar);
                object2 = new P71((o71_0)object5, (UserUnratedItem)object3, (O71$b)object);
                scaleRatingBar.setOnRatingChangeListener((BaseRatingBar$a)object2);
                object2 = ((UserUnratedItem)object3).isItemRated();
                object3 = Boolean.TRUE;
                n4 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
                n8 = 8;
                object4 = ((O71$b)object).f;
                scaleRatingBar = ((O71$b)object).e;
                if (n4 != 0) {
                    scaleRatingBar.setVisibility(n8);
                    object4.setVisibility(0);
                    object5 = h40_0.a;
                    object5 = h40_0.m0();
                    object2 = "ratingSubmittedTitle";
                    n7 = (int)(object5.has((String)object2) ? 1 : 0);
                    if (n7 != 0) {
                        if ((object5 = object5.getString((String)object2)) != null && (n4 = ((String)object5).length()) != 0) {
                            object4.setText((CharSequence)object5);
                        } else {
                            object = ((RecyclerView$B)object).itemView.getContext();
                            n3 = R$string.rating_submitted;
                            object = object.getString(n3);
                            object4.setText((CharSequence)object);
                        }
                    } else {
                        object = ((RecyclerView$B)object).itemView.getContext();
                        n3 = R$string.rating_submitted;
                        object = object.getString(n3);
                        object4.setText((CharSequence)object);
                    }
                } else {
                    object = ((o71_0)object5).c;
                    scaleRatingBar.setText((CharSequence)object);
                    scaleRatingBar.setVisibility(0);
                    object4.setVisibility(n8);
                }
            }
        } else {
            n4 = object instanceof O71$c;
            if (n4 != 0) {
                Object object7;
                if (object4 != null) {
                    object7 = ((ArrayList)object4).get(n3);
                    object3 = object7;
                    object3 = (UserUnratedItem)object7;
                }
                object = (O71$c)object;
                if (object3 != null) {
                    object2 = ((O71$c)object).c;
                    object7 = new Object((o71_0)object2);
                    ((O71$c)object).b.setOnClickListener(object7);
                    object2 = ((RecyclerView$B)object).itemView.getContext();
                    object7 = new Object((Context)object2, 0, false);
                    arrayList = ((UserUnratedItem)object3).getImageList();
                    object2 = new M71(arrayList);
                    object = ((O71$c)object).a;
                    ((RecyclerView)object).setLayoutManager((RecyclerView$o)object7);
                    ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                } else {
                    object.getClass();
                }
            } else {
                n3 = object instanceof O71$a;
                if (n3 != 0) {
                    object = (O71$a)object;
                    object.getClass();
                    Object object8 = h40_0.a;
                    object8 = h40_0.m0();
                    object2 = "widgetAllProductsRatedTitleMsg";
                    n7 = object8.has((String)object2);
                    object3 = ((O71$a)object).a;
                    if (n7 != 0) {
                        if ((object2 = object8.getString((String)object2)) != null && (n7 = ((String)object2).length()) != 0) {
                            object3.setText((CharSequence)object2);
                        } else {
                            object2 = ((RecyclerView$B)object).itemView.getContext();
                            n7 = R$string.rated_all_products;
                            object2 = object2.getString(n7);
                            object3.setText((CharSequence)object2);
                        }
                    } else {
                        object2 = ((RecyclerView$B)object).itemView.getContext();
                        n7 = R$string.rated_all_products;
                        object2 = object2.getString(n7);
                        object3.setText((CharSequence)object2);
                    }
                    object2 = "widgetAllProductRatedThanksMsg";
                    n7 = (int)(object8.has((String)object2) ? 1 : 0);
                    object3 = ((O71$a)object).b;
                    if (n7 != 0) {
                        if ((object8 = object8.getString((String)object2)) != null && (n4 = ((String)object8).length()) != 0) {
                            object3.setText((CharSequence)object8);
                        } else {
                            object = ((RecyclerView$B)object).itemView.getContext();
                            n3 = R$string.rated_thank_you_msg;
                            object = object.getString(n3);
                            object3.setText((CharSequence)object);
                        }
                    } else {
                        object = ((RecyclerView$B)object).itemView.getContext();
                        n3 = R$string.rated_thank_you_msg;
                        object = object.getString(n3);
                        object3.setText((CharSequence)object);
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        HomePageRatingViewType homePageRatingViewType = HomePageRatingViewType.RATE_ITEM_VIEW;
        int n4 = homePageRatingViewType.getType();
        String string2 = "inflate(...)";
        if (n3 == n4) {
            homePageRatingViewType = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.homepage_rating_item_unrated;
            viewGroup = homePageRatingViewType.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new O71$b(this, (View)viewGroup);
        } else {
            homePageRatingViewType = HomePageRatingViewType.RATE_OTHER_ITEM_VIEW;
            n4 = homePageRatingViewType.getType();
            if (n3 == n4) {
                homePageRatingViewType = LayoutInflater.from((Context)viewGroup.getContext());
                int n8 = R$layout.homepage_rating_other_item;
                viewGroup = homePageRatingViewType.inflate(n8, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                recyclerView$B = new O71$c(this, (View)viewGroup);
            } else {
                homePageRatingViewType = HomePageRatingViewType.RATING_COMPLETED;
                n4 = homePageRatingViewType.getType();
                if (n3 == n4) {
                    homePageRatingViewType = LayoutInflater.from((Context)viewGroup.getContext());
                    int n10 = R$layout.homepage_rated_all_products;
                    viewGroup = homePageRatingViewType.inflate(n10, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    recyclerView$B = new O71$a((View)viewGroup);
                } else {
                    homePageRatingViewType = LayoutInflater.from((Context)viewGroup.getContext());
                    int n14 = R$layout.homepage_rating_item_unrated;
                    viewGroup = homePageRatingViewType.inflate(n14, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    recyclerView$B = new O71$b(this, (View)viewGroup);
                }
            }
        }
        return recyclerView$B;
    }
}

