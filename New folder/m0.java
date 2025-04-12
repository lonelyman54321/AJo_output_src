/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.RowAwAjioGiftCardBinding;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class m0
extends RecyclerView$f {
    public final ArrayList a;
    public final d0_0 b;
    public final wg2_1 c;
    public final iI0 d;
    public final mq3_0 e;

    public m0(ArrayList arrayList, d0_0 d0_02, wg2_1 wg2_12, iI0 iI02, mq3_0 mq3_02) {
        Intrinsics.checkNotNullParameter(arrayList, "ajioWalletUIComponentList");
        Intrinsics.checkNotNullParameter(d0_02, "ajioCashListener");
        Intrinsics.checkNotNullParameter(wg2_12, "referralClickListener");
        Intrinsics.checkNotNullParameter(iI02, "faqListener");
        Intrinsics.checkNotNullParameter(mq3_02, "bankTransferClickListener");
        this.a = arrayList;
        this.b = d0_02;
        this.c = wg2_12;
        this.d = iI02;
        this.e = mq3_02;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        return ((n0)this.a.get((int)n3)).a;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4 = 3;
        float f5 = 4.2E-45f;
        int n7 = 1;
        TextView textView = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)textView);
        boolean bl2 = recyclerView$B instanceof i0;
        String string2 = "format(...)";
        Object object = this.a;
        if (bl2) {
            Object object2 = ((n0)((ArrayList)object).get((int)n3)).b;
            bl2 = object2 instanceof AjioWalletTransform;
            if (bl2) {
                recyclerView$B = (i0)recyclerView$B;
                object2 = (AjioWalletTransform)object2;
                recyclerView$B.getClass();
                textView = h40_0.a;
                bl2 = h40_0.B0();
                object = ((i0)recyclerView$B).z;
                Object object3 = ((i0)recyclerView$B).y;
                Object[] objectArray = ((i0)recyclerView$B).j;
                View view = ((i0)recyclerView$B).k;
                if (!bl2) {
                    ai0_2.B((View)objectArray);
                    ai0_2.B(object3);
                    ai0_2.B(view);
                    ai0_2.B((View)object);
                }
                textView = ((i0)recyclerView$B).r;
                TextView textView2 = ((i0)recyclerView$B).c;
                int n8 = 8;
                if (object2 == null) {
                    textView2.setVisibility(n8);
                    textView.setVisibility(n8);
                } else {
                    textView2.setVisibility(0);
                    textView.setVisibility(0);
                    boolean bl3 = h40_0.O0();
                    h0_0 h0_02 = new Object();
                    objectArray.setOnClickListener((View.OnClickListener)h0_02);
                    h0_02 = new Object();
                    view.setOnClickListener((View.OnClickListener)h0_02);
                    if (bl3) {
                        object3.setVisibility(n8);
                        object.setVisibility(n8);
                    } else {
                        objectArray.setVisibility(n8);
                        view.setVisibility(n8);
                        object3.setVisibility(n8);
                        object.setVisibility(n8);
                    }
                    ((i0)recyclerView$B).h.setVisibility(n8);
                    ((i0)recyclerView$B).i.setVisibility(n8);
                    int n10 = R$drawable.ic_ajio_cash;
                    object3 = ((i0)recyclerView$B).d;
                    object3.setImageResource(n10);
                    object = object3.getContext();
                    int n14 = R$string.acc_icon_ajio_cash_icon;
                    object = object.getString(n14);
                    object3.setContentDescription((CharSequence)object);
                    object = hv3_0.K(R$string.ajio_cash);
                    ((i0)recyclerView$B).e.setText((CharSequence)object);
                    object = ((i0)recyclerView$B).f;
                    object3 = ((AjioWalletTransform)object2).getCashInfo();
                    object.setText((CharSequence)object3);
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    n10 = (int)(((ao0_0)object).a("non_transferable_cash_enable") ? 1 : 0);
                    object3 = ((i0)recyclerView$B).g;
                    if (n10 != 0) {
                        float f6 = ((AjioWalletTransform)object2).getTotalCash();
                        object = qz2_0.x(Float.valueOf(f6));
                        object3.setText((CharSequence)object);
                        if (bl3) {
                            n10 = (int)(h40_0.B0() ? 1 : 0);
                            if (n10 != 0) {
                                view.setVisibility(n8);
                            } else {
                                view.setVisibility(0);
                            }
                            n10 = R$string.cash_non_transferable_text;
                            object = hv3_0.K(n10);
                            ((i0)recyclerView$B).n.setText((CharSequence)object);
                            f6 = ((AjioWalletTransform)object2).getNonTransferableCash();
                            object = qz2_0.x(Float.valueOf(f6));
                            object3 = ((i0)recyclerView$B).o;
                            object3.setText((CharSequence)object);
                            ((i0)recyclerView$B).w((AjioWalletTransform)object2);
                        }
                    } else {
                        float f7 = ((AjioWalletTransform)object2).getTransferableCash();
                        object = qz2_0.x(Float.valueOf(f7));
                        object3.setText((CharSequence)object);
                        if (bl3) {
                            view.setVisibility(n8);
                            ((i0)recyclerView$B).w((AjioWalletTransform)object2);
                        }
                    }
                    object = new e0_0(recyclerView$B, 0);
                    textView2.setOnClickListener((View.OnClickListener)object);
                    n10 = R$drawable.ic_ajio_point;
                    object3 = ((i0)recyclerView$B).s;
                    object3.setImageResource(n10);
                    n10 = R$string.super_cash;
                    object = hv3_0.K(n10);
                    objectArray = object3.getResources();
                    int n15 = R$string.acc_icon_super_cash_icon;
                    textView2 = new Object[n7];
                    textView2[0] = object;
                    objectArray = objectArray.getString(n15, (Object[])textView2);
                    object3.setContentDescription((CharSequence)objectArray);
                    object3 = hv3_0.K(R$string.super_cash);
                    ((i0)recyclerView$B).t.setText((CharSequence)object3);
                    object3 = ((i0)recyclerView$B).u;
                    objectArray = ((AjioWalletTransform)object2).getPointsInfo();
                    object3.setText((CharSequence)objectArray);
                    object3 = qz2_0.x(Float.valueOf(((AjioWalletTransform)object2).getActivePoints()));
                    ((i0)recyclerView$B).v.setText((CharSequence)object3);
                    float f8 = ((AjioWalletTransform)object2).getActivePoints();
                    n14 = 0;
                    objectArray = null;
                    view = ((i0)recyclerView$B).w;
                    textView2 = ((i0)recyclerView$B).x;
                    float f11 = f8 - 0.0f;
                    float f12 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (f12 > 0) {
                        view.setVisibility(0);
                        textView2.setVisibility(0);
                        f12 = R$string.worth;
                        object3 = hv3_0.K((int)f12);
                        object = n1.a((String)object, " ", (String)object3);
                        object3 = StringCompanionObject.INSTANCE;
                        f8 = ((AjioWalletTransform)object2).getTopExpiringPointAmount();
                        object3 = qz2_0.x(Float.valueOf(f8));
                        object2 = ((AjioWalletTransform)object2).getTopExpiringPointDate();
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n7] = object3;
                        n7 = 2;
                        objectArray[n7] = object2;
                        object2 = "%s %s expiring on %s";
                        zn0_1.b(objectArray, n4, (String)object2, string2, textView2);
                    } else {
                        view.setVisibility(n8);
                        textView2.setVisibility(n8);
                    }
                    object2 = new f0(recyclerView$B, 0);
                    textView.setOnClickListener((View.OnClickListener)object2);
                }
            }
        } else {
            n4 = recyclerView$B instanceof mh2_2;
            if (n4 != 0) {
                Object object4 = ((n0)((ArrayList)object).get((int)n3)).b;
                n4 = object4 instanceof Float;
                if (n4 != 0) {
                    recyclerView$B = (mh2_2)recyclerView$B;
                    object4 = (Number)object4;
                    float f14 = ((Number)object4).floatValue();
                    ((mh2_2)recyclerView$B).w(f14);
                }
            } else {
                n4 = recyclerView$B instanceof ag2_0;
                if (n4 != 0) {
                    Object object5 = ((n0)((ArrayList)object).get((int)n3)).b;
                    n4 = object5 instanceof ReferralFAQInfo;
                    if (n4 != 0) {
                        recyclerView$B = (ag2_0)recyclerView$B;
                        object5 = (ReferralFAQInfo)object5;
                        ((ag2_0)recyclerView$B).w((ReferralFAQInfo)object5);
                    }
                } else {
                    n4 = recyclerView$B instanceof c0_0;
                    if (n4 != 0) {
                        Object object6 = ((n0)((ArrayList)object).get((int)n3)).b;
                        n4 = object6 instanceof Integer;
                        if (n4 != 0) {
                            recyclerView$B = (c0_0)recyclerView$B;
                            n3 = ((Number)(object6 = (Number)object6)).intValue();
                            if (n3 > 0) {
                                recyclerView$B = ((c0_0)recyclerView$B).a.getLayoutParams();
                                ((ViewGroup.LayoutParams)recyclerView$B).height = n3;
                            } else {
                                recyclerView$B.getClass();
                            }
                        }
                    } else {
                        n4 = recyclerView$B instanceof l0_0;
                        if (n4 != 0) {
                            Object object7 = ((n0)((ArrayList)object).get((int)n3)).b;
                            n4 = object7 instanceof String;
                            if (n4 != 0) {
                                recyclerView$B = (l0_0)recyclerView$B;
                                object7 = (String)object7;
                                recyclerView$B.getClass();
                                Intrinsics.checkNotNullParameter(object7, "walletType");
                                RowAwAjioGiftCardBinding rowAwAjioGiftCardBinding = ((l0_0)recyclerView$B).b;
                                rowAwAjioGiftCardBinding.agAddTv.setOnClickListener((View.OnClickListener)recyclerView$B);
                                textView = rowAwAjioGiftCardBinding.agBalanceTv;
                                string2 = "agBalanceTv";
                                Intrinsics.checkNotNullExpressionValue(textView, string2);
                                ai0_2.B((View)textView);
                                rowAwAjioGiftCardBinding.agBalanceTv.setOnClickListener((View.OnClickListener)recyclerView$B);
                                textView = rowAwAjioGiftCardBinding.agTeamsCondition;
                                textView.setOnClickListener((View.OnClickListener)recyclerView$B);
                                recyclerView$B = rowAwAjioGiftCardBinding.agInfoTv;
                                n4 = R$string.ag_description_title;
                                Object[] objectArray = new Object[n7];
                                objectArray[0] = object7;
                                object7 = hv3_0.L(n4, objectArray);
                                recyclerView$B.setText((CharSequence)object7);
                            }
                        } else {
                            Object object8;
                            n4 = recyclerView$B instanceof j0;
                            if (n4 != 0 && (n4 = (object8 = ((n0)((ArrayList)object).get((int)n3)).b) instanceof Double) != 0) {
                                recyclerView$B = (j0)recyclerView$B;
                                double d2 = ((Number)object8).doubleValue();
                                recyclerView$B.getClass();
                                object8 = StringCompanionObject.INSTANCE;
                                n3 = R$string.ajio_gift_card_redemption_text;
                                object8 = hv3_0.K(n3);
                                n4 = ok1_1.a(d2);
                                f5 = n4;
                                String string3 = qz2_0.x(Float.valueOf(f5));
                                textView = new Object[n7];
                                textView[0] = string3;
                                object8 = xh2_0.a((Object[])textView, n7, (String)object8, string2);
                                recyclerView$B = ((j0)recyclerView$B).a;
                                if (recyclerView$B != null) {
                                    recyclerView$B.setText((CharSequence)object8);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 1;
        d0_0 d0_02 = this.b;
        String string2 = "inflate(...)";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 6;
                        if (n3 != n4) {
                            n4 = 7;
                            if (n3 != n4) {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                int n7 = R$layout.row_aw_divider;
                                viewGroup = object.inflate(n7, viewGroup, false);
                                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                                recyclerView$B = new c0_0((View)viewGroup);
                            } else {
                                object = LayoutInflater.from((Context)viewGroup.getContext());
                                int n8 = R$layout.row_aw_ajio_gift_amount_card;
                                viewGroup = object.inflate(n8, viewGroup, false);
                                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                                recyclerView$B = new j0((View)viewGroup);
                            }
                        } else {
                            object = LayoutInflater.from((Context)viewGroup.getContext());
                            int n10 = R$layout.row_aw_ajio_gift_card;
                            viewGroup = object.inflate(n10, viewGroup, false);
                            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                            recyclerView$B = new l0_0((View)viewGroup, d0_02);
                        }
                    } else {
                        object = LayoutInflater.from((Context)viewGroup.getContext());
                        int n14 = R$layout.row_referral_faq;
                        viewGroup = object.inflate(n14, viewGroup, false);
                        Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                        object = this.d;
                        recyclerView$B = new ag2_0((View)viewGroup, (iI0)object);
                    }
                } else {
                    object = LayoutInflater.from((Context)viewGroup.getContext());
                    int n15 = R$layout.row_referral_faq_header;
                    viewGroup = object.inflate(n15, viewGroup, false);
                    Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                    recyclerView$B = new yG2((View)viewGroup);
                }
            } else {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                int n16 = R$layout.row_referral_widget;
                viewGroup = object.inflate(n16, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
                object = this.c;
                recyclerView$B = new mh2_2((View)viewGroup, (wg2_1)object);
            }
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n17 = R$layout.row_aw_ajio_cash;
            viewGroup = object.inflate(n17, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.e;
            recyclerView$B = new i0((View)viewGroup, d0_02, (mq3_0)object);
        }
        return recyclerView$B;
    }
}

