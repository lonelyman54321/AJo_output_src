/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ShimmerPdpRatingsBinding;
import com.willy.ratingbar.ScaleRatingBar;

public final class FragmentRatingBottomSheetBinding
implements BC3 {
    public final AjioTextView addPhoto;
    public final LinearLayout addPhotoContainer;
    public final Barrier barrierImg;
    public final Barrier barrierRating;
    public final LinearLayout buttons;
    public final LinearLayout buttonsReview;
    public final ImageView cameraImg;
    public final FrameLayout cancelContainer;
    public final ImageView dismissSheetBtn;
    public final AjioTextView imageUploadError;
    public final RecyclerView imagesList;
    public final ScaleRatingBar itemRating;
    public final LinearLayout parentLayout;
    public final AjioRoundedCornerImageView productImg;
    public final RecyclerView questionsList;
    public final TextView ratingError;
    public final TextView ratingExperienceLabel;
    public final LinearLayout ratingItemLl;
    public final TextView ratingsProductDescription;
    public final TextView ratingsProductName;
    public final LinearLayout reviewContainer;
    public final TextView reviewDisclaimerMsgView;
    public final AjioTextView reviewImgText;
    public final AjioTextView reviewInfoView;
    public final EditText reviewText;
    public final TextView reviewTextCounter;
    public final AjioTextView reviewTextError;
    private final LinearLayout rootView;
    public final NestedScrollView scrollViewBottom;
    public final ShimmerPdpRatingsBinding shimmerPdpRatings;
    public final View shimmerRatings;
    public final ShimmerFrameLayout spShimmerView;
    public final AjioTextView tellUsMoreView;
    public final TextView thankYouRating;
    public final AjioTextView tvRetry;
    public final AjioTextView tvSkip;
    public final AjioTextView tvSkipReview;
    public final AjioTextView tvSubmit;
    public final AjioTextView tvWriteAReview;
    public final AjioTextView writeReviewTitle;

    private FragmentRatingBottomSheetBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, Barrier barrier, Barrier barrier2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, AjioTextView ajioTextView2, RecyclerView recyclerView, ScaleRatingBar scaleRatingBar, LinearLayout linearLayout5, AjioRoundedCornerImageView ajioRoundedCornerImageView, RecyclerView recyclerView2, TextView textView, TextView textView2, LinearLayout linearLayout6, TextView textView3, TextView textView4, LinearLayout linearLayout7, TextView textView5, AjioTextView ajioTextView3, AjioTextView ajioTextView4, EditText editText, TextView textView6, AjioTextView ajioTextView5, NestedScrollView nestedScrollView, ShimmerPdpRatingsBinding shimmerPdpRatingsBinding, View view, ShimmerFrameLayout shimmerFrameLayout, AjioTextView ajioTextView6, TextView textView7, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12) {
        this.rootView = linearLayout;
        this.addPhoto = ajioTextView;
        this.addPhotoContainer = linearLayout2;
        this.barrierImg = barrier;
        this.barrierRating = barrier2;
        this.buttons = linearLayout3;
        this.buttonsReview = linearLayout4;
        this.cameraImg = imageView;
        this.cancelContainer = frameLayout;
        this.dismissSheetBtn = imageView2;
        this.imageUploadError = ajioTextView2;
        this.imagesList = recyclerView;
        this.itemRating = scaleRatingBar;
        this.parentLayout = linearLayout5;
        this.productImg = ajioRoundedCornerImageView;
        this.questionsList = recyclerView2;
        this.ratingError = textView;
        this.ratingExperienceLabel = textView2;
        this.ratingItemLl = linearLayout6;
        this.ratingsProductDescription = textView3;
        this.ratingsProductName = textView4;
        this.reviewContainer = linearLayout7;
        this.reviewDisclaimerMsgView = textView5;
        this.reviewImgText = ajioTextView3;
        this.reviewInfoView = ajioTextView4;
        this.reviewText = editText;
        this.reviewTextCounter = textView6;
        this.reviewTextError = ajioTextView5;
        this.scrollViewBottom = nestedScrollView;
        this.shimmerPdpRatings = shimmerPdpRatingsBinding;
        this.shimmerRatings = view;
        this.spShimmerView = shimmerFrameLayout;
        this.tellUsMoreView = ajioTextView6;
        this.thankYouRating = textView7;
        this.tvRetry = ajioTextView7;
        this.tvSkip = ajioTextView8;
        this.tvSkipReview = ajioTextView9;
        this.tvSubmit = ajioTextView10;
        this.tvWriteAReview = ajioTextView11;
        this.writeReviewTitle = ajioTextView12;
    }

    public static FragmentRatingBottomSheetBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_photo;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.add_photo_container;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                n3 = R$id.barrier_img;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (Barrier)view2;
                if (view4 != null) {
                    n3 = R$id.barrier_rating;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (Barrier)view2;
                    if (view5 != null) {
                        n3 = R$id.buttons;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (LinearLayout)view2;
                        if (view6 != null) {
                            n3 = R$id.buttons_review;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.camera_img;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (ImageView)view2;
                                if (view8 != null) {
                                    n3 = R$id.cancelContainer;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (FrameLayout)view2;
                                    if (view9 != null) {
                                        n3 = R$id.dismissSheetBtn;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (ImageView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.image_upload_error;
                                            Object object3 = view2 = dd2_2.a(n3, view);
                                            object3 = (AjioTextView)view2;
                                            if (object3 != null) {
                                                n3 = R$id.images_list;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (RecyclerView)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.item_rating;
                                                    Object object5 = view2 = dd2_2.a(n3, view);
                                                    object5 = (ScaleRatingBar)view2;
                                                    if (object5 != null) {
                                                        n3 = R$id.parent_layout;
                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                        view11 = (LinearLayout)view2;
                                                        if (view11 != null) {
                                                            n3 = R$id.product_img;
                                                            Object object6 = view2 = dd2_2.a(n3, view);
                                                            object6 = (AjioRoundedCornerImageView)view2;
                                                            if (object6 != null) {
                                                                n3 = R$id.questions_list;
                                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                                object7 = (RecyclerView)view2;
                                                                if (object7 != null) {
                                                                    n3 = R$id.rating_error;
                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                    view12 = (TextView)view2;
                                                                    if (view12 != null) {
                                                                        n3 = R$id.rating_experience_label;
                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                        view13 = (TextView)view2;
                                                                        if (view13 != null) {
                                                                            n3 = R$id.rating_item_ll;
                                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                                            view14 = (LinearLayout)view2;
                                                                            if (view14 != null) {
                                                                                n3 = R$id.ratings_product_description;
                                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                                view15 = (TextView)view2;
                                                                                if (view15 != null) {
                                                                                    n3 = R$id.ratings_product_name;
                                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                                    view16 = (TextView)view2;
                                                                                    if (view16 != null) {
                                                                                        n3 = R$id.review_container;
                                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                                        view17 = (LinearLayout)view2;
                                                                                        if (view17 != null) {
                                                                                            n3 = R$id.review_disclaimer_msg_view;
                                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                                            view18 = (TextView)view2;
                                                                                            if (view18 != null) {
                                                                                                n3 = R$id.review_img_text;
                                                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                                                object8 = (AjioTextView)view2;
                                                                                                if (object8 != null) {
                                                                                                    n3 = R$id.review_info_view;
                                                                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                                                                    object9 = (AjioTextView)view2;
                                                                                                    if (object9 != null) {
                                                                                                        n3 = R$id.review_text;
                                                                                                        View view19 = view2 = dd2_2.a(n3, view);
                                                                                                        view19 = (EditText)view2;
                                                                                                        if (view19 != null) {
                                                                                                            n3 = R$id.review_text_counter;
                                                                                                            View view20 = view2 = dd2_2.a(n3, view);
                                                                                                            view20 = (TextView)view2;
                                                                                                            if (view20 != null) {
                                                                                                                n3 = R$id.review_text_error;
                                                                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                                                                object10 = (AjioTextView)view2;
                                                                                                                if (object10 != null) {
                                                                                                                    n3 = R$id.scrollViewBottom;
                                                                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                                                                    object11 = (NestedScrollView)view2;
                                                                                                                    if (object11 != null && (view2 = dd2_2.a(n3 = R$id.shimmer_pdp_ratings, view)) != null) {
                                                                                                                        ShimmerPdpRatingsBinding shimmerPdpRatingsBinding = ShimmerPdpRatingsBinding.bind(view2);
                                                                                                                        n3 = R$id.shimmer_ratings;
                                                                                                                        View view21 = dd2_2.a(n3, view);
                                                                                                                        if (view21 != null) {
                                                                                                                            n3 = R$id.spShimmerView;
                                                                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                                            object12 = (ShimmerFrameLayout)view2;
                                                                                                                            if (object12 != null) {
                                                                                                                                n3 = R$id.tell_us_more_view;
                                                                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                                                object13 = (AjioTextView)view2;
                                                                                                                                if (object13 != null) {
                                                                                                                                    n3 = R$id.thank_you_rating;
                                                                                                                                    View view22 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view22 = (TextView)view2;
                                                                                                                                    if (view22 != null) {
                                                                                                                                        n3 = R$id.tv_retry;
                                                                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object14 = (AjioTextView)view2;
                                                                                                                                        if (object14 != null) {
                                                                                                                                            n3 = R$id.tv_skip;
                                                                                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object15 = (AjioTextView)view2;
                                                                                                                                            if (object15 != null) {
                                                                                                                                                n3 = R$id.tv_skip_review;
                                                                                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                                                                                object16 = (AjioTextView)view2;
                                                                                                                                                if (object16 != null) {
                                                                                                                                                    n3 = R$id.tv_submit;
                                                                                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object17 = (AjioTextView)view2;
                                                                                                                                                    if (object17 != null) {
                                                                                                                                                        n3 = R$id.tv_write_a_review;
                                                                                                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        object18 = (AjioTextView)view2;
                                                                                                                                                        if (object18 != null) {
                                                                                                                                                            n3 = R$id.write_review_title;
                                                                                                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            object19 = (AjioTextView)view2;
                                                                                                                                                            if (object19 != null) {
                                                                                                                                                                View view23 = view;
                                                                                                                                                                view23 = (LinearLayout)view;
                                                                                                                                                                FragmentRatingBottomSheetBinding fragmentRatingBottomSheetBinding = new FragmentRatingBottomSheetBinding((LinearLayout)view23, (AjioTextView)object2, (LinearLayout)view3, (Barrier)view4, (Barrier)view5, (LinearLayout)view6, (LinearLayout)view7, (ImageView)view8, (FrameLayout)view9, (ImageView)view10, (AjioTextView)object3, (RecyclerView)object4, (ScaleRatingBar)((Object)object5), (LinearLayout)view11, (AjioRoundedCornerImageView)((Object)object6), (RecyclerView)object7, (TextView)view12, (TextView)view13, (LinearLayout)view14, (TextView)view15, (TextView)view16, (LinearLayout)view17, (TextView)view18, (AjioTextView)object8, (AjioTextView)object9, (EditText)view19, (TextView)view20, (AjioTextView)object10, (NestedScrollView)object11, shimmerPdpRatingsBinding, view21, (ShimmerFrameLayout)((Object)object12), (AjioTextView)object13, (TextView)view22, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19);
                                                                                                                                                                return fragmentRatingBottomSheetBinding;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentRatingBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentRatingBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentRatingBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_rating_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentRatingBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

