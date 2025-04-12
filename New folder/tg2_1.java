/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.json.JSONObject
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.referral.transform.ReferralAjioWalletTransform;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import com.ril.ajio.services.data.referral.transform.ReferralImageDataTransform;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from tG2
 */
public final class tg2_1
extends RecyclerView$f {
    public final ArrayList a;
    public final LG2 b;
    public final iI0 c;

    public tg2_1(ArrayList arrayList, LG2 lG2, iI0 iI02) {
        Intrinsics.checkNotNullParameter(arrayList, "referralUIComponentList");
        Intrinsics.checkNotNullParameter(lG2, "referralListener");
        Intrinsics.checkNotNullParameter(iI02, "faqListener");
        this.a = arrayList;
        this.b = lG2;
        this.c = iI02;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        return ((kH2)this.a.get((int)n3)).a;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object;
        block64: {
            block66: {
                Object object2;
                ImageView imageView;
                ConstraintLayout constraintLayout;
                String string2;
                float f5;
                int n7;
                Object object3;
                JSONObject jSONObject;
                int n8;
                String string3;
                Object object4;
                float f6;
                int n10;
                String string4;
                block67: {
                    String string5;
                    ImageView imageView2;
                    ImageView imageView3;
                    View view;
                    View view2;
                    View view3;
                    TextView textView;
                    TextView textView2;
                    void var10_84;
                    void var3_45;
                    void var3_41;
                    void var3_37;
                    ConstraintLayout constraintLayout2;
                    void var3_33;
                    void var3_29;
                    void var3_25;
                    ConstraintLayout constraintLayout3;
                    void var3_21;
                    void var3_17;
                    void var3_13;
                    int n14;
                    ConstraintLayout constraintLayout4;
                    block65: {
                        ImageView imageView4;
                        View view4;
                        ImageView imageView5;
                        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
                        ArrayList arrayList = this.a;
                        object = ((kH2)arrayList.get((int)n3)).b;
                        n4 = recyclerView$B instanceof IG2;
                        if (n4 == 0) break block64;
                        n4 = object instanceof ReferralImageDataTransform;
                        if (n4 == 0) return;
                        recyclerView$B = (IG2)recyclerView$B;
                        object = (ReferralImageDataTransform)object;
                        recyclerView$B.getClass();
                        Intrinsics.checkNotNullParameter(object, "referralImageData");
                        TextView textView3 = ((IG2)recyclerView$B).w();
                        if (textView3 != null) {
                            string4 = ((ReferralImageDataTransform)object).getReferralCode();
                            textView3.setText((CharSequence)string4);
                        }
                        h40_0 h40_02 = h40_0.a;
                        n4 = h40_0.t1();
                        string4 = ((IG2)recyclerView$B).a;
                        n10 = 1;
                        if (n4 != 0) break block65;
                        n4 = R$id.referral_img;
                        ((IG2)recyclerView$B).c = imageView5 = (ImageView)string4.findViewById(n4);
                        n4 = R$id.share;
                        ((IG2)recyclerView$B).d = view4 = string4.findViewById(n4);
                        if (view4 != null) {
                            view4.setOnClickListener((View.OnClickListener)recyclerView$B);
                        }
                        if ((imageView4 = ((IG2)recyclerView$B).c) != null) {
                            da$a da$a = new da$a();
                            da$a.k = n10;
                            da$a.r = n10;
                            int n15 = R$string.acc_banner;
                            string4 = hv3_0.K(n15);
                            da$a.b(string4);
                            object = ((ReferralImageDataTransform)object).getImageURL();
                            string4 = ((IG2)recyclerView$B).c;
                            Intrinsics.checkNotNull(string4);
                            da$a.n = object;
                            da$a.u = string4;
                            da$a.a();
                        }
                        break block66;
                    }
                    n4 = R$id.referrer_details;
                    ((IG2)recyclerView$B).e = constraintLayout4 = (ConstraintLayout)string4.findViewById(n4);
                    int n16 = 0;
                    Object var10_81 = null;
                    if (constraintLayout4 != null) {
                        n14 = R$id.info_image;
                        ImageView imageView6 = (ImageView)constraintLayout4.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_12 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).f = var3_13;
                    ConstraintLayout constraintLayout5 = ((IG2)recyclerView$B).e;
                    if (constraintLayout5 != null) {
                        n14 = R$id.title_textview;
                        TextView textView4 = (TextView)constraintLayout5.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_16 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).g = var3_17;
                    ConstraintLayout constraintLayout6 = ((IG2)recyclerView$B).e;
                    if (constraintLayout6 != null) {
                        n14 = R$id.subtitle_textview;
                        TextView textView5 = (TextView)constraintLayout6.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_20 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).h = var3_21;
                    n4 = R$id.referee_details;
                    ((IG2)recyclerView$B).i = constraintLayout3 = (ConstraintLayout)string4.findViewById(n4);
                    if (constraintLayout3 != null) {
                        n14 = R$id.info_image;
                        ImageView imageView7 = (ImageView)constraintLayout3.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_24 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).j = var3_25;
                    ConstraintLayout constraintLayout7 = ((IG2)recyclerView$B).i;
                    if (constraintLayout7 != null) {
                        n14 = R$id.title_textview;
                        TextView textView6 = (TextView)constraintLayout7.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_28 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).k = var3_29;
                    ConstraintLayout constraintLayout8 = ((IG2)recyclerView$B).i;
                    if (constraintLayout8 != null) {
                        n14 = R$id.subtitle_textview;
                        TextView textView7 = (TextView)constraintLayout8.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_32 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).l = var3_33;
                    n4 = R$id.referrer_benefits_details;
                    ((IG2)recyclerView$B).m = constraintLayout2 = (ConstraintLayout)string4.findViewById(n4);
                    if (constraintLayout2 != null) {
                        n14 = R$id.info_image;
                        ImageView imageView8 = (ImageView)constraintLayout2.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_36 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).n = var3_37;
                    ConstraintLayout constraintLayout9 = ((IG2)recyclerView$B).m;
                    if (constraintLayout9 != null) {
                        n14 = R$id.info_image_1;
                        ImageView imageView9 = (ImageView)constraintLayout9.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_40 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).o = var3_41;
                    ConstraintLayout constraintLayout10 = ((IG2)recyclerView$B).m;
                    if (constraintLayout10 != null) {
                        n14 = R$id.title_textview;
                        TextView textView8 = (TextView)constraintLayout10.findViewById(n14);
                    } else {
                        n4 = 0;
                        Object var3_44 = null;
                        f6 = 0.0f;
                    }
                    ((IG2)recyclerView$B).p = var3_45;
                    ConstraintLayout constraintLayout11 = ((IG2)recyclerView$B).m;
                    if (constraintLayout11 != null) {
                        View view5;
                        n16 = R$id.subtitle_textview;
                        View view6 = view5 = constraintLayout11.findViewById(n16);
                        TextView textView9 = (TextView)view5;
                    }
                    ((IG2)recyclerView$B).q = var10_84;
                    n4 = R$id.referral_description_textview;
                    ((IG2)recyclerView$B).r = textView2 = (TextView)string4.findViewById(n4);
                    n4 = R$id.invite_code_textview;
                    ((IG2)recyclerView$B).s = textView = (TextView)string4.findViewById(n4);
                    n4 = R$id.share_btn_bg;
                    ((IG2)recyclerView$B).t = view3 = string4.findViewById(n4);
                    n4 = R$id.share_enlarged_btn;
                    ((IG2)recyclerView$B).u = view2 = string4.findViewById(n4);
                    View view7 = ((IG2)recyclerView$B).t;
                    if (view7 != null) {
                        view7.setOnClickListener((View.OnClickListener)recyclerView$B);
                    }
                    if ((view = ((IG2)recyclerView$B).u) != null) {
                        view.setOnClickListener((View.OnClickListener)recyclerView$B);
                    }
                    TextView textView10 = ((IG2)recyclerView$B).s;
                    string4 = "getString(...)";
                    if (textView10 != null) {
                        void var10_87;
                        JSONObject jSONObject2 = h40_0.n0();
                        n16 = (int)(jSONObject2.has((String)(object4 = "referralScreenTitleText")) ? 1 : 0);
                        if (n16 != 0) {
                            String string6 = h40_0.n0().getString((String)object4);
                        } else {
                            AJIOApplication.Companion.getClass();
                            AJIOApplication aJIOApplication = AJIOApplication$a.a();
                            n14 = R$string.invite_code;
                            String string7 = aJIOApplication.getString(n14);
                        }
                        Intrinsics.checkNotNullExpressionValue(var10_87, string4);
                        textView10.setText((CharSequence)var10_87);
                    }
                    TextView textView11 = ((IG2)recyclerView$B).r;
                    string3 = "referralDescription";
                    if (textView11 != null) {
                        object4 = h40_0.n0();
                        n14 = (int)(object4.has(string3) ? 1 : 0);
                        if (n14 != 0) {
                            object4 = h40_0.n0().getString(string3);
                        } else {
                            AJIOApplication.Companion.getClass();
                            object4 = AJIOApplication$a.a();
                            n8 = R$string.referral_description;
                            object4 = object4.getString(n8);
                        }
                        Intrinsics.checkNotNullExpressionValue(object4, string4);
                        textView11.setText((CharSequence)object4);
                    }
                    jSONObject = h40_0.q0();
                    object4 = h40_0.o0();
                    JSONObject jSONObject3 = h40_0.p0();
                    object3 = h40_0.n0();
                    String string8 = "showEitherReferrerOrReferee";
                    n7 = object3.has(string8);
                    String string9 = null;
                    if (n7 != 0) {
                        object3 = h40_0.n0();
                        n7 = object3.getBoolean(string8);
                    } else {
                        n7 = 0;
                        object3 = null;
                    }
                    f5 = 0.0f;
                    string8 = null;
                    string2 = "referralAmountText";
                    if (n7 == 0) break block67;
                    ConstraintLayout constraintLayout12 = ((IG2)recyclerView$B).m;
                    if (constraintLayout12 != null) {
                        constraintLayout12.setVisibility(0);
                    }
                    if ((imageView3 = ((IG2)recyclerView$B).n) != null) {
                        object4 = new da$a();
                        ((da$a)object4).k = n10;
                        ((da$a)object4).r = n10;
                        object3 = hv3_0.K(R$string.acc_banner);
                        ((da$a)object4).b((String)object3);
                        object3 = h40_0.p0();
                        string9 = "leftImage";
                        n7 = object3.has(string9);
                        if (n7 != 0 && (object3 = h40_0.p0().getString(string9)) != null && (n7 = ((String)object3).length()) != 0) {
                            object3 = h40_0.p0().getString(string9);
                            Intrinsics.checkNotNull(object3);
                        } else {
                            object3 = "https://assets.ajio.com/cms/AJIO/MOBILE/Image%20B_1.png";
                        }
                        ((da$a)object4).n = object3;
                        ((da$a)object4).u = imageView3;
                        ((da$a)object4).a();
                    }
                    if ((imageView2 = ((IG2)recyclerView$B).o) != null) {
                        object4 = new da$a();
                        ((da$a)object4).k = n10;
                        ((da$a)object4).r = n10;
                        string5 = hv3_0.K(R$string.acc_banner);
                        ((da$a)object4).b(string5);
                        string5 = h40_0.p0();
                        object3 = "rightImage";
                        n10 = string5.has((String)object3);
                        if (n10 != 0 && (string5 = h40_0.p0().getString((String)object3)) != null && (n10 = string5.length()) != 0) {
                            string5 = h40_0.p0().getString((String)object3);
                            Intrinsics.checkNotNull(string5);
                        } else {
                            string5 = "https://assets.ajio.com/cms/AJIO/MOBILE/Image%20B_2.png";
                        }
                        ((da$a)object4).n = string5;
                        ((da$a)object4).u = imageView2;
                        ((da$a)object4).a();
                    }
                    if ((n4 = (int)(jSONObject3.has(string2) ? 1 : 0)) == 0) break block66;
                    Float f7 = ((ReferralImageDataTransform)object).getRefereeBonus();
                    Intrinsics.checkNotNull(f7);
                    f6 = f7.floatValue();
                    float f8 = f6 - 0.0f;
                    n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        TextView textView12 = ((IG2)recyclerView$B).p;
                        if (textView12 != null) {
                            if ((object = ((ReferralImageDataTransform)object).getReferralBonus()) != null) {
                                f5 = ((Float)object).floatValue();
                            }
                            object = qz2_0.t(f5);
                            string5 = jSONObject3.getString(string2);
                            Intrinsics.checkNotNullExpressionValue(string5, string4);
                            object = IG2.x((String)object, string5);
                            textView12.setText((CharSequence)object);
                        }
                        if ((n3 = (int)(jSONObject3.has(string3) ? 1 : 0)) != 0 && (object = ((IG2)recyclerView$B).q) != null) {
                            String string10 = jSONObject3.getString(string3);
                            object.setText((CharSequence)string10);
                        }
                    }
                    break block66;
                }
                ConstraintLayout constraintLayout13 = ((IG2)recyclerView$B).e;
                if (constraintLayout13 != null) {
                    constraintLayout13.setVisibility(0);
                }
                if ((constraintLayout = ((IG2)recyclerView$B).i) != null) {
                    constraintLayout.setVisibility(0);
                }
                da$a da$a = new da$a();
                da$a.k = n10;
                da$a.r = n10;
                object3 = hv3_0.K(R$string.acc_banner);
                da$a.b((String)object3);
                object3 = h40_0.q0();
                String string11 = "image";
                n7 = object3.has(string11);
                if (n7 != 0 && (object3 = h40_0.q0().getString(string11)) != null && (n7 = ((String)object3).length()) != 0) {
                    object3 = h40_0.q0().getString(string11);
                    Intrinsics.checkNotNull(object3);
                } else {
                    object3 = "https://assets.ajio.com/cms/AJIO/MOBILE/Image%20A_1.png";
                }
                Object object5 = ((IG2)recyclerView$B).f;
                Intrinsics.checkNotNull(object5);
                da$a.n = object3;
                da$a.u = object5;
                da$a.a();
                n8 = (int)(jSONObject.has(string2) ? 1 : 0);
                if (n8 != 0) {
                    Float f11 = ((ReferralImageDataTransform)object).getReferralBonus();
                    Intrinsics.checkNotNull(f11);
                    float f12 = f11.floatValue();
                    float f14 = f12 - 0.0f;
                    n8 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                    if (n8 > 0) {
                        TextView textView;
                        Float f15 = ((ReferralImageDataTransform)object).getReferralBonus();
                        if (f15 != null) {
                            f12 = f15.floatValue();
                        } else {
                            n8 = 0;
                            f12 = 0.0f;
                            Object var15_102 = null;
                        }
                        String string12 = qz2_0.t(f12);
                        object3 = object4.getString(string2);
                        Intrinsics.checkNotNullExpressionValue(object3, string4);
                        String string13 = IG2.x(string12, (String)object3);
                        object3 = ((IG2)recyclerView$B).g;
                        if (object3 != null) {
                            object3.setText((CharSequence)string13);
                        }
                        if ((object3 = ((IG2)recyclerView$B).g) != null) {
                            String string14 = "referral ";
                            object5 = new StringBuilder(string14);
                            ((StringBuilder)object5).append(string13);
                            String string15 = ((StringBuilder)object5).toString();
                            object3.setContentDescription((CharSequence)string15);
                        }
                        if ((n8 = (int)(jSONObject.has(string3) ? 1 : 0)) != 0 && (textView = ((IG2)recyclerView$B).h) != null) {
                            String string16 = jSONObject.getString(string3);
                            textView.setText((CharSequence)string16);
                        }
                    }
                }
                if ((imageView = ((IG2)recyclerView$B).j) != null) {
                    da$a da$a2 = new da$a();
                    da$a2.k = n10;
                    da$a2.g = n10;
                    object2 = h40_0.o0();
                    n10 = (int)(object2.has(string11) ? 1 : 0);
                    if (n10 != 0 && (object2 = h40_0.o0().getString(string11)) != null && (n10 = ((String)object2).length()) != 0) {
                        object2 = h40_0.o0().getString(string11);
                        Intrinsics.checkNotNull(object2);
                    } else {
                        object2 = "https://assets.ajio.com/cms/AJIO/MOBILE/Image%20A_2.png";
                    }
                    da$a2.n = object2;
                    da$a2.u = imageView;
                    da$a2.a();
                }
                yn3$a yn3$a = yn3_0.a;
                object2 = ((ReferralImageDataTransform)object).getReferralBonus();
                Float f16 = ((ReferralImageDataTransform)object).getRefereeBonus();
                string11 = "referrer ";
                object3 = new StringBuilder(string11);
                ((StringBuilder)object3).append(object2);
                ((StringBuilder)object3).append(" and ");
                ((StringBuilder)object3).append(f16);
                object2 = ((StringBuilder)object3).toString();
                Object[] objectArray = new Object[]{};
                yn3$a.a((String)object2, objectArray);
                n4 = (int)(object4.has(string2) ? 1 : 0);
                if (n4 != 0) {
                    Float f17 = ((ReferralImageDataTransform)object).getRefereeBonus();
                    Intrinsics.checkNotNull(f17);
                    f6 = f17.floatValue();
                    float f18 = f6 - 0.0f;
                    n4 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                    if (n4 > 0) {
                        TextView textView = ((IG2)recyclerView$B).k;
                        if (textView != null) {
                            if ((object = ((ReferralImageDataTransform)object).getRefereeBonus()) != null) {
                                f5 = ((Float)object).floatValue();
                            }
                            object = qz2_0.t(f5);
                            object2 = object4.getString(string2);
                            Intrinsics.checkNotNullExpressionValue(object2, string4);
                            object = IG2.x((String)object, (String)object2);
                            textView.setText((CharSequence)object);
                        }
                        if ((n3 = (int)(object4.has(string3) ? 1 : 0)) != 0 && (object = ((IG2)recyclerView$B).l) != null) {
                            String string17 = object4.getString(string3);
                            object.setText((CharSequence)string17);
                        }
                    }
                }
            }
            object = ((IG2)recyclerView$B).w.getValue();
            String string18 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object, string18);
            object = (View)object;
            object.setOnClickListener((View.OnClickListener)recyclerView$B);
            return;
        }
        n4 = recyclerView$B instanceof vg2_0;
        if (n4 == 0) {
            n4 = recyclerView$B instanceof ag2_0;
            if (n4 == 0) return;
            n4 = object instanceof ReferralFAQInfo;
            if (n4 == 0) return;
            recyclerView$B = (ag2_0)recyclerView$B;
            object = (ReferralFAQInfo)object;
            ((ag2_0)recyclerView$B).w((ReferralFAQInfo)object);
            return;
        }
        n4 = object instanceof ReferralAjioWalletTransform;
        if (n4 == 0) return;
        recyclerView$B = (vg2_0)recyclerView$B;
        object = (ReferralAjioWalletTransform)object;
        recyclerView$B.getClass();
        String string19 = "referralAjioWallet";
        Intrinsics.checkNotNullParameter(object, string19);
        object = ((ReferralAjioWalletTransform)object).getAmount();
        if (object != null) {
            float f19 = ((Number)object).floatValue();
            object = qz2_0.x(Float.valueOf(f19));
            TextView textView = ((vg2_0)recyclerView$B).c;
            textView.setText((CharSequence)object);
        }
        object = new uG2((vg2_0)recyclerView$B);
        recyclerView$B = ((vg2_0)recyclerView$B).d;
        recyclerView$B.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Object object2 = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object2);
        int n4 = 1;
        LG2 lG2 = this.b;
        String string2 = "inflate(...)";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 5;
                    if (n3 != n4) {
                        object2 = LayoutInflater.from((Context)viewGroup.getContext());
                        int n7 = R$layout.referral_divider;
                        viewGroup = object2.inflate(n7, viewGroup, false);
                        Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                        object = new xg2_0((View)viewGroup);
                    } else {
                        object2 = LayoutInflater.from((Context)viewGroup.getContext());
                        int n8 = R$layout.row_referral_cash;
                        viewGroup = object2.inflate(n8, viewGroup, false);
                        Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                        object = new vg2_0((View)viewGroup, lG2);
                    }
                } else {
                    object2 = LayoutInflater.from((Context)viewGroup.getContext());
                    int n10 = R$layout.row_referral_faq;
                    viewGroup = object2.inflate(n10, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    object2 = this.c;
                    object = new ag2_0((View)viewGroup, (iI0)object2);
                }
            } else {
                object2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n14 = R$layout.row_referral_faq_header;
                viewGroup = object2.inflate(n14, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new yG2((View)viewGroup);
            }
        } else {
            object = h40_0.a;
            n3 = (int)(h40_0.t1() ? 1 : 0);
            if (n3 == 0) {
                object2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n15 = R$layout.row_referral_image;
                viewGroup = object2.inflate(n15, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new IG2((View)viewGroup, lG2);
            } else {
                object2 = LayoutInflater.from((Context)viewGroup.getContext());
                int n16 = R$layout.row_referral_new_referral_screen;
                viewGroup = object2.inflate(n16, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = new IG2((View)viewGroup, lG2);
            }
        }
        return object;
    }
}

