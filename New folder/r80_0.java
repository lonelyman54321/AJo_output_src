/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.cart.ConvenienceFeeConfig;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.myaccount.order.data.PriorityDeliveryConfig;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from r80
 */
public final class r80_0
extends BottomSheetDialogFragment {
    public static final r80$a Companion;
    public View A;
    public View B;
    public View C;
    public View D;
    public final NewCustomEventsRevamp E;
    public Boolean F;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public m80_0 i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public String n;
    public String o;
    public Boolean p;
    public AppCompatImageView q;
    public AjioTextView r;
    public AjioTextView s;
    public AjioTextView t;
    public AjioTextView u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;

    static {
        r80$a r80$a;
        Companion = r80$a = new Object();
    }

    public r80_0() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        Constable constable;
        this.h = constable = Integer.valueOf(0);
        constable = Boolean.FALSE;
        this.j = constable;
        this.k = constable;
        this.l = constable;
        this.m = constable;
        this.p = constable;
        this.E = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.F = constable;
    }

    public final void Oa(String string2, String string3, String string4, String string5, String string6, String string7, String string8, m80_0 m80_02, Integer n3, boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, String string9, String string10, Boolean bl6, Boolean bl7) {
        Object object = bl7;
        this.F = bl7;
        object = bl2;
        this.j = object;
        object = string2;
        this.a = string2;
        object = string3;
        this.b = string3;
        object = string4;
        this.c = string4;
        object = string5;
        this.d = string5;
        object = string6;
        this.e = string6;
        object = string7;
        this.f = string7;
        object = string8;
        this.g = string8;
        object = m80_02;
        this.i = m80_02;
        object = n3;
        this.h = n3;
        object = bl3;
        this.k = bl3;
        object = bl4;
        this.l = bl4;
        object = bl5;
        this.m = bl5;
        object = string9;
        this.n = string9;
        object = string10;
        this.o = string10;
        object = bl6;
        this.p = bl6;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        n80_0 n80_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)n80_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        Boolean bl2;
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0 && (n3 = (int)(Intrinsics.areEqual(object = this.j, bl2 = Boolean.FALSE) ? 1 : 0)) != 0) {
            n3 = R$layout.convenience_fee_info_bottom_sheet_layout_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.convenience_fee_info_bottom_sheet_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        Object object;
        int n4;
        Object object2;
        Comparable<Boolean> comparable;
        Object object3;
        Object object4;
        float f5;
        int n7;
        Object object5;
        int n8;
        Object object6;
        Object object7;
        float f6;
        int n10;
        Object object8;
        Object object9;
        int n14;
        Object object10;
        r80_0 r80_02 = this;
        Object object11 = view;
        Object object12 = null;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n15 = R$id.parent_layout;
        Object object13 = (ConstraintLayout)view.findViewById(n15);
        n15 = R$id.acc_page_name_lyt;
        object13 = view.findViewById(n15);
        String string2 = "format(...)";
        int n16 = 1;
        if (object13 != null) {
            object10 = StringCompanionObject.INSTANCE;
            int n17 = R$string.acc_info_popup;
            object10 = hv3_0.K(n17);
            n14 = R$string.convenience_fee_title;
            object9 = hv3_0.K(n14);
            object8 = new Object[n16];
            object8[0] = object9;
            object9 = Arrays.copyOf(object8, n16);
            object10 = String.format((String)object10, (Object[])object9);
            Intrinsics.checkNotNullExpressionValue(object10, string2);
            object13.setContentDescription((CharSequence)object10);
        }
        object9 = Looper.getMainLooper();
        object10 = new Handler((Looper)object9);
        object9 = new o80_0((View)object13);
        long l2 = 100;
        object10.postDelayed((Runnable)object9, l2);
        n15 = R$id.close_dialog;
        object13 = (AppCompatImageView)object11.findViewById(n15);
        r80_02.q = object13;
        n15 = R$id.okay_btn;
        object13 = (AjioTextView)object11.findViewById(n15);
        r80_02.s = object13;
        n15 = R$id.note_tv;
        object13 = (AjioTextView)object11.findViewById(n15);
        r80_02.t = object13;
        n15 = R$id.convFeeValue;
        object13 = (AjioTextView)object11.findViewById(n15);
        r80_02.r = object13;
        n15 = R$id.total_fee_layout;
        object13 = object11.findViewById(n15);
        r80_02.y = object13;
        n15 = R$id.policy_text;
        object13 = (AjioTextView)object11.findViewById(n15);
        r80_02.u = object13;
        n15 = R$id.delivery_layout;
        object13 = object11.findViewById(n15);
        r80_02.v = object13;
        n15 = R$id.platform_convenience_fee_layout;
        object13 = object11.findViewById(n15);
        r80_02.w = object13;
        n15 = R$id.cod_fee_layout;
        object13 = object11.findViewById(n15);
        r80_02.x = object13;
        n15 = R$id.priority_delivery_fee_layout;
        object13 = object11.findViewById(n15);
        r80_02.z = object13;
        n15 = R$id.delivery_fee_desc_layout;
        object13 = object11.findViewById(n15);
        r80_02.A = object13;
        n15 = R$id.pcf_fee_desc_layout;
        object13 = object11.findViewById(n15);
        r80_02.B = object13;
        n15 = R$id.cod_fee_desc_layout;
        object13 = object11.findViewById(n15);
        r80_02.C = object13;
        n15 = R$id.priority_delivery_fee_desc_layout;
        object11 = object11.findViewById(n15);
        r80_02.D = object11;
        object11 = r80_02.q;
        n15 = 0;
        object13 = null;
        if (object11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeDialog");
            n10 = 0;
            object11 = null;
            f6 = 0.0f;
        }
        object10 = new p80_0(r80_02, 0);
        object11.setOnClickListener((View.OnClickListener)object10);
        object11 = r80_02.s;
        if (object11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("okayButton");
            n10 = 0;
            object11 = null;
            f6 = 0.0f;
        }
        object10 = new q80_0(r80_02, 0);
        object11.setOnClickListener((View.OnClickListener)object10);
        object11 = r80_02.a;
        object10 = "";
        if (object11 != null && (n10 = ((String)object11).length()) != 0 && (object11 = r80_02.b) != null && (n10 = ((String)object11).length()) != 0) {
            object11 = r80_02.v;
            object9 = "deliveryLayout";
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            ai0_2.B((View)object11);
            object11 = r80_02.i;
            if (object11 != null && (object11 = ((m80_0)object11).b) != null) {
                object11 = ((ConvenienceFeeConfig)object11).getDeliveryFeeDesc();
            } else {
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            if (object11 != null && (n10 = ((String)object11).length()) != 0 && (object11 = r80_02.h) != null) {
                n10 = ((Number)object11).intValue();
                object8 = r80_02.j;
                object7 = Boolean.TRUE;
                boolean bl3 = Intrinsics.areEqual(object8, object7);
                if (bl3) {
                    cp_1.Companion.getClass();
                    object11 = z40_0.Companion;
                    object11 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object11).a;
                    object8 = "free_shipping_amount_limit";
                    n10 = ((ao0_0)object11).g((String)object8);
                    f6 = n10;
                    object11 = qz2_0.t(f6);
                } else {
                    f6 = n10;
                    object11 = qz2_0.t(f6);
                }
                object8 = StringCompanionObject.INSTANCE;
                object8 = r80_02.i;
                if (object8 != null && (object8 = ((m80_0)object8).b) != null) {
                    object8 = ((ConvenienceFeeConfig)object8).getDeliveryFeeDesc();
                } else {
                    bl3 = false;
                    object8 = null;
                }
                Intrinsics.checkNotNull(object8);
                object7 = new Object[n16];
                object7[0] = object11;
                object6 = object11 = xh2_0.a((Object[])object7, n16, (String)object8, string2);
            } else {
                object6 = object10;
            }
            object8 = hv3_0.a;
            object11 = r80_02.v;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n8 = 0;
                object7 = null;
            } else {
                object7 = object11;
            }
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getDeliveryFeeLabel();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object5 = object11;
            } else {
                n7 = 0;
                object5 = null;
                f5 = 0.0f;
            }
            object4 = mz3_0.K(r80_02.b);
            object11 = r80_02.a;
            object3 = mz3_0.K((String)object11);
            comparable = r80_02.k;
            object2 = null;
            n4 = 64;
            hv3_0.n0((hv3_0)object8, (View)object7, (String)object5, (Float)object4, (Float)object3, comparable, (String)object6, null, n4);
        }
        if ((object11 = r80_02.d) != null && (n10 = ((String)object11).length()) != 0) {
            r80_02.c = object11 = r80_02.d;
            object11 = r80_02.w;
            object9 = "platformConvenienceFeeLayout";
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            ai0_2.B((View)object11);
            object8 = hv3_0.a;
            object11 = r80_02.w;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n8 = 0;
                object7 = null;
            } else {
                object7 = object11;
            }
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getPlatformConvenienceFeeLabel();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object5 = object11;
            } else {
                n7 = 0;
                object5 = null;
                f5 = 0.0f;
            }
            object4 = mz3_0.K(r80_02.d);
            object3 = mz3_0.K(r80_02.c);
            comparable = r80_02.l;
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getPlatformConvenienceFeeDesc();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object6 = object11;
            } else {
                object6 = null;
            }
            object2 = null;
            n4 = 64;
            hv3_0.n0((hv3_0)object8, (View)object7, (String)object5, (Float)object4, (Float)object3, comparable, (String)object6, null, n4);
        }
        object11 = r80_02.e;
        object9 = "0.0";
        if (object11 != null && (n10 = ((String)object11).length()) != 0 && (object11 = r80_02.f) != null && (n10 = ((String)object11).length()) != 0 && (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.f, object9) ? 1 : 0)) == 0) {
            object11 = r80_02.x;
            object8 = "codFeeLayout";
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            ai0_2.B((View)object11);
            object7 = hv3_0.a;
            object11 = r80_02.x;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n7 = 0;
                object5 = null;
                f5 = 0.0f;
            } else {
                object5 = object11;
            }
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getCashOnDeliveryFeeLabel();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object4 = object11;
            } else {
                object4 = null;
            }
            object3 = mz3_0.K(r80_02.f);
            comparable = mz3_0.K(r80_02.e);
            object6 = r80_02.m;
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getCodFeeDesc();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object2 = object11;
            } else {
                object2 = null;
            }
            n4 = 0;
            object = null;
            int bl2 = 64;
            hv3_0.n0((hv3_0)object7, (View)object5, (String)object4, (Float)object3, (Float)comparable, (Boolean)object6, (String)object2, null, bl2);
        }
        object11 = r80_02.F;
        object8 = Boolean.TRUE;
        n10 = (int)(Intrinsics.areEqual(object11, object8) ? 1 : 0);
        object7 = "priorityDeliveryFeeLayout";
        if (n10 != 0) {
            object11 = h40_0.a;
            n10 = (int)(h40_0.O1() ? 1 : 0);
            if (n10 != 0 && (object11 = r80_02.n) != null && (n10 = ((String)object11).length()) != 0 && (object11 = r80_02.n) != null && (n10 = ((String)object11).length()) != 0) {
                object11 = r80_02.z;
                if (object11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                ai0_2.B((View)object11);
                object11 = hv3_0.a;
                object5 = r80_02.z;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    object4 = null;
                } else {
                    object4 = object5;
                }
                object3 = h40_0.j0().getPriorityDeliveryFeeLabel();
                comparable = mz3_0.K(r80_02.o);
                object6 = mz3_0.K(r80_02.n);
                object2 = r80_02.p;
                object7 = h40_0.j0();
                object = ((PriorityDeliveryConfig)object7).getPriorityDeliveryFeeDes();
                object11.getClass();
                boolean bl2 = true;
                hv3_0.k0((View)object4, (String)object3, (Float)comparable, (Float)object6, (Boolean)object2, (String)object, bl2);
            }
        } else {
            n10 = (int)(h40_0.P1() ? 1 : 0);
            if (n10 != 0 && (object11 = r80_02.n) != null && (n10 = ((String)object11).length()) != 0 && (object11 = r80_02.n) != null && (n10 = ((String)object11).length()) != 0) {
                object11 = r80_02.z;
                if (object11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                ai0_2.B((View)object11);
                object11 = hv3_0.a;
                object5 = r80_02.z;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    object4 = null;
                } else {
                    object4 = object5;
                }
                object7 = r80_02.i;
                if (object7 != null) {
                    object3 = object7 = ((m80_0)object7).b();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                comparable = mz3_0.K(r80_02.o);
                object6 = mz3_0.K(r80_02.n);
                object2 = r80_02.p;
                object7 = r80_02.i;
                if (object7 != null) {
                    object7 = ((m80_0)object7).b;
                    if (object7 != null) {
                        object7 = ((ConvenienceFeeConfig)object7).getPriorityDeliveryFeeDesc();
                    } else {
                        n8 = 0;
                        object7 = null;
                    }
                    object = object7;
                } else {
                    n4 = 0;
                    object = null;
                }
                object11.getClass();
                boolean bl3 = false;
                hv3_0.k0((View)object4, (String)object3, (Float)comparable, (Float)object6, (Boolean)object2, (String)object, false);
            }
        }
        if ((object11 = r80_02.g) != null && (n10 = ((String)object11).length()) != 0) {
            object7 = hv3_0.a;
            object11 = r80_02.y;
            if (object11 == null) {
                object11 = "convFeeValue";
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n7 = 0;
                object5 = null;
                f5 = 0.0f;
            } else {
                object5 = object11;
            }
            object11 = r80_02.i;
            if (object11 != null) {
                object11 = ((m80_0)object11).b;
                if (object11 != null) {
                    object11 = ((ConvenienceFeeConfig)object11).getTotalConvenienceFeeLabel();
                } else {
                    n10 = 0;
                    object11 = null;
                    f6 = 0.0f;
                }
                object4 = object11;
            } else {
                object4 = null;
            }
            object3 = mz3_0.K(r80_02.g);
            object11 = r80_02.g;
            comparable = mz3_0.K((String)object11);
            object2 = null;
            n4 = 0;
            object = null;
            object6 = null;
            int n17 = 112;
            hv3_0.n0((hv3_0)object7, (View)object5, (String)object4, (Float)object3, (Float)comparable, null, null, null, n17);
        }
        object11 = r80_02.r;
        object7 = "totalConvFeeValue";
        if (object11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n10 = 0;
            object11 = null;
            f6 = 0.0f;
        }
        f5 = mz3_0.J(r80_02.g);
        object5 = qz2_0.u(f5);
        object11.setText((CharSequence)object5);
        object11 = r80_02.r;
        if (object11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n10 = 0;
            object11 = null;
            f6 = 0.0f;
        }
        n8 = R$string.total_convenience_feed;
        f5 = mz3_0.J(r80_02.g);
        object5 = qz2_0.u(f5);
        object4 = new Object[n16];
        object4[0] = object5;
        object7 = hv3_0.L(n8, (Object[])object4);
        object11.setContentDescription((CharSequence)object7);
        object11 = r80_02.i;
        if (object11 != null && (object11 = ((m80_0)object11).b) != null) {
            object11 = ((ConvenienceFeeConfig)object11).getConvenienceFeeNote();
        } else {
            n10 = 0;
            object11 = null;
            f6 = 0.0f;
        }
        object7 = "noteTv";
        if (object11 != null && (n10 = ((String)object11).length()) != 0) {
            object11 = r80_02.t;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            ai0_2.B((View)object11);
            object11 = r80_02.t;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            if ((object7 = r80_02.i) != null && (object7 = ((m80_0)object7).b) != null) {
                object7 = ((ConvenienceFeeConfig)object7).getConvenienceFeeNote();
            } else {
                n8 = 0;
                object7 = null;
            }
            object11.setText((CharSequence)object7);
        } else {
            object11 = r80_02.t;
            if (object11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n10 = 0;
                object11 = null;
                f6 = 0.0f;
            }
            ai0_2.i((View)object11);
        }
        object11 = cp_1.Companion;
        object11.getClass();
        n10 = (int)(cp$a.u() ? 1 : 0);
        if ((n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.k, object8) ? 1 : 0)) != 0 && (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.l, object8) ? 1 : 0)) != 0 && (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.m, object8) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.k, object8) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.m, object8) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.l, object8) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object11 = r80_02.p, object8) ? 1 : 0)) != 0 && (n10 = (int)(h40_0.P1() ? 1 : 0)) != 0) && (object11 = r80_02.u) != null && (n8 = (int)(Intrinsics.areEqual(object7 = r80_02.j, object8) ? 1 : 0)) != 0) {
            object7 = r80_02.u;
            if (object7 != null) {
                ai0_2.B((View)object7);
            }
            if ((object7 = r80_02.u) != null) {
                object5 = r80_02.i;
                if (object5 != null && (object5 = ((m80_0)object5).b) != null) {
                    object5 = ((ConvenienceFeeConfig)object5).getOrderConfirmReadPolicy();
                } else {
                    n7 = 0;
                    object5 = null;
                    f5 = 0.0f;
                }
                object7.setText((CharSequence)object5);
            }
            object7 = hv3_0.a;
            object5 = StringCompanionObject.INSTANCE;
            n7 = R$string.order_summary_conv_fee_policy_text;
            object5 = hv3_0.K(n7);
            object4 = new ArrayList();
            object3 = r80_02.k;
            n3 = Intrinsics.areEqual(object3, object8);
            if (n3 != 0 && (n3 = Intrinsics.areEqual(object3 = r80_02.b, object9)) == 0) {
                object3 = r80_02.i;
                if (object3 != null && (object3 = ((m80_0)object3).b) != null) {
                    object3 = ((ConvenienceFeeConfig)object3).getDeliveryFeeLabel();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object3 = String.valueOf(object3);
                ((ArrayList)object4).add(object3);
            }
            if ((n3 = Intrinsics.areEqual(object3 = r80_02.l, object8)) != 0 && (n3 = Intrinsics.areEqual(object3 = r80_02.d, object9)) == 0) {
                object3 = r80_02.i;
                if (object3 != null && (object3 = ((m80_0)object3).b) != null) {
                    object3 = ((ConvenienceFeeConfig)object3).getPlatformConvenienceFeeLabel();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                object3 = String.valueOf(object3);
                ((ArrayList)object4).add(object3);
            }
            if ((n3 = Intrinsics.areEqual(object3 = r80_02.m, object8)) != 0 && (n14 = (int)(Intrinsics.areEqual(object3 = r80_02.f, object9) ? 1 : 0)) == 0) {
                object9 = r80_02.i;
                if (object9 != null && (object9 = ((m80_0)object9).b) != null) {
                    object9 = ((ConvenienceFeeConfig)object9).getCashOnDeliveryFeeLabel();
                } else {
                    n14 = 0;
                    object9 = null;
                }
                object9 = String.valueOf(object9);
                ((ArrayList)object4).add(object9);
            }
            if ((n14 = (int)(h40_0.P1() ? 1 : 0)) != 0 && (n14 = (int)(Intrinsics.areEqual(object9 = r80_02.p, object8) ? 1 : 0)) != 0 && (object9 = r80_02.o) != null) {
                object9 = r80_02.i;
                if (object9 != null) {
                    object13 = ((m80_0)object9).b();
                }
                object13 = String.valueOf(object13);
                ((ArrayList)object4).add(object13);
            }
            n15 = ((ArrayList)object4).size();
            object9 = null;
            for (n14 = 0; n14 < n15; n14 += n16) {
                object8 = (String)((ArrayList)object4).get(n14);
                if (n14 == 0) {
                    object10 = Ft2.a((String)object10, (String)object8);
                }
                if (n14 != 0 && n14 < (n3 = ((ArrayList)object4).size() - n16)) {
                    object3 = ", ";
                    object10 = Ft2.a(Ft2.a((String)object10, (String)object3), (String)object8);
                }
                if (n14 == 0 || n14 != (n3 = ((ArrayList)object4).size() - n16)) continue;
                object3 = " and ";
                object10 = Ft2.a(Ft2.a((String)object10, (String)object3), (String)object8);
            }
            object13 = new Object[n16];
            object13[0] = object10;
            object12 = xh2_0.a((Object[])object13, n16, (String)object5, string2);
            n15 = R$string.order_summary_read_policy_text;
            object13 = hv3_0.K(n15);
            object7.getClass();
            hv3_0.g0((String)object12, (String)object13, (TextView)object11);
        }
        object11 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object12 = new Bundle();
        object13 = r80_02.E;
        string2 = ((NewCustomEventsRevamp)object13).getSV_EP_COD_FEE_SLASHED();
        Object object14 = r80_02.e;
        object10 = "0";
        if (object14 == null) {
            object14 = object10;
        }
        object12.putString(string2, (String)object14);
        string2 = ((NewCustomEventsRevamp)object13).getSV_EP_COD_FEE_ACTUAL();
        object14 = r80_02.f;
        if (object14 == null) {
            object14 = object10;
        }
        object12.putString(string2, (String)object14);
        string2 = ((NewCustomEventsRevamp)object13).getSV_EP_RVP_FEE();
        object14 = r80_02.c;
        if (object14 == null) {
            object14 = object10;
        }
        object12.putString(string2, (String)object14);
        string2 = ((NewCustomEventsRevamp)object13).getSV_EP_DELIVERY_FEE();
        object14 = r80_02.a;
        if (object14 == null) {
            object14 = object10;
        }
        object12.putString(string2, (String)object14);
        string2 = ((NewCustomEventsRevamp)object13).getSV_EP_DELIVERY_SLASHED_FEE();
        object14 = r80_02.b;
        if (object14 == null) {
            object14 = object10;
        }
        object12.putString(string2, (String)object14);
        object13 = ((NewCustomEventsRevamp)object13).getSV_EP_TOTAL_CONV_FEE();
        string2 = r80_02.g;
        if (string2 != null) {
            object10 = string2;
        }
        object12.putString((String)object13, (String)object10);
        ((GTMEvents)object11).pushOpenScreenEvent("Fee Explanation bottom screen", (Bundle)object12);
    }
}

