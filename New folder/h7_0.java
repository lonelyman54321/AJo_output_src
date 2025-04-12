/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.ajiocash.transform.AjioWalletTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from h7
 */
public final class h7_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3 = 3;
        String string2 = "this$0";
        Object object2 = this.b;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        String string3 = null;
        int n7 = this.a;
        switch (n7) {
            default: {
                Object object3 = object;
                DataCallback dataCallback = (DataCallback)object;
                object2 = (bz1_2)object2;
                Intrinsics.checkNotNullParameter(object2, string2);
                cp$a cp$a = cp_1.Companion;
                int n8 = nn_2.b(cp$a, dataCallback);
                if (n8 == 0) return Unit.a;
                n8 = dataCallback.getStatus();
                int n10 = 8;
                ConstraintLayout constraintLayout = null;
                String string4 = "walletLayout";
                if (n8 == 0) {
                    String string5;
                    void var9_69;
                    void var9_66;
                    void var17_113;
                    void var9_61;
                    float f6;
                    int n14;
                    void var17_106;
                    void var17_103;
                    void var27_127;
                    View view;
                    Object object4;
                    float f7;
                    void var9_57;
                    void var9_51;
                    TextView textView;
                    void var9_47;
                    TextView textView2;
                    void var9_43;
                    ImageView imageView;
                    void var9_40;
                    View view2;
                    void var9_36;
                    TextView textView3;
                    void var9_32;
                    TextView textView4;
                    void var9_28;
                    ImageView imageView2;
                    void var9_25;
                    View view3;
                    float f8;
                    void var3_8;
                    Object object5 = dataCallback.getData();
                    if (object5 == null) {
                        ConstraintLayout constraintLayout2 = ((bz1_2)object2).g;
                        if (constraintLayout2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                        } else {
                            constraintLayout = constraintLayout2;
                        }
                        constraintLayout.setVisibility(n10);
                        return Unit.a;
                    }
                    ConstraintLayout constraintLayout3 = ((bz1_2)object2).g;
                    if (constraintLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n8 = 0;
                        Object var3_7 = null;
                    }
                    var3_8.setVisibility(0);
                    AjioWalletTransform ajioWalletTransform = (AjioWalletTransform)dataCallback.getData();
                    if (ajioWalletTransform == null) return Unit.a;
                    wc_1 wc_12 = ((bz1_2)object2).n;
                    if (wc_12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ajioWalletVM");
                        n7 = 0;
                        Object var9_21 = null;
                        f8 = 0.0f;
                    }
                    var9_22.j = ajioWalletTransform;
                    ConstraintLayout constraintLayout4 = ((bz1_2)object2).g;
                    if (constraintLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        Object var9_24 = null;
                        f8 = 0.0f;
                    }
                    int n15 = R$id.aw_info_cash;
                    ((bz1_2)object2).N0 = view3 = var9_25.findViewById(n15);
                    String string6 = "cashParentView";
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n7 = 0;
                        Object var9_27 = null;
                        f8 = 0.0f;
                    }
                    int n16 = R$id.aw_cash_iv;
                    ((bz1_2)object2).O0 = imageView2 = (ImageView)var9_28.findViewById(n16);
                    View view4 = ((bz1_2)object2).N0;
                    if (view4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n7 = 0;
                        Object var9_31 = null;
                        f8 = 0.0f;
                    }
                    n16 = R$id.aw_cash_tv;
                    ((bz1_2)object2).P0 = textView4 = (TextView)var9_32.findViewById(n16);
                    View view5 = ((bz1_2)object2).N0;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n7 = 0;
                        Object var9_35 = null;
                        f8 = 0.0f;
                    }
                    n16 = R$id.aw_amount;
                    ((bz1_2)object2).Q0 = textView3 = (TextView)var9_36.findViewById(n16);
                    ConstraintLayout constraintLayout5 = ((bz1_2)object2).g;
                    if (constraintLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        Object var9_39 = null;
                        f8 = 0.0f;
                    }
                    n16 = R$id.aw_info_point;
                    ((bz1_2)object2).R0 = view2 = var9_40.findViewById(n16);
                    Object[] objectArray = "pointParentView";
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                        n7 = 0;
                        Object var9_42 = null;
                        f8 = 0.0f;
                    }
                    int n17 = R$id.aw_cash_iv;
                    ((bz1_2)object2).S0 = imageView = (ImageView)var9_43.findViewById(n17);
                    View view6 = ((bz1_2)object2).R0;
                    if (view6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                        n7 = 0;
                        Object var9_46 = null;
                        f8 = 0.0f;
                    }
                    n17 = R$id.aw_cash_tv;
                    ((bz1_2)object2).T0 = textView2 = (TextView)var9_47.findViewById(n17);
                    View view7 = ((bz1_2)object2).R0;
                    if (view7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                        n7 = 0;
                        Object var9_50 = null;
                        f8 = 0.0f;
                    }
                    n17 = R$id.aw_amount;
                    ((bz1_2)object2).U0 = textView = (TextView)var9_51.findViewById(n17);
                    z40$a z40$a = z40_0.Companion;
                    ao0_0 ao0_02 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a;
                    String string7 = "non_transferable_cash_enable";
                    n7 = (int)(ao0_02.a(string7) ? 1 : 0);
                    if (n7 != 0) {
                        f8 = ajioWalletTransform.getTotalCash();
                        Float f11 = Float.valueOf(f8);
                    } else {
                        f8 = ajioWalletTransform.getTransferableCash();
                        Float f12 = Float.valueOf(f8);
                    }
                    float f14 = var9_57.floatValue();
                    NewCustomEventsRevamp newCustomEventsRevamp = null;
                    float f15 = f14 - 0.0f;
                    float f16 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                    if (f16 <= 0) {
                        f7 = ajioWalletTransform.getActivePoints();
                        object4 = Float.valueOf(f7);
                        Intrinsics.checkNotNull(object4);
                        float f17 = f7 - 0.0f;
                        f16 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                        if (f16 <= 0) {
                            void var14_87;
                            void var14_84;
                            View view8 = ((bz1_2)object2).N0;
                            if (view8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string6);
                                n3 = 0;
                                Object var14_83 = null;
                            }
                            var14_84.setVisibility(n10);
                            View view9 = ((bz1_2)object2).R0;
                            if (view9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                                n3 = 0;
                                Object var14_86 = null;
                            }
                            var14_87.setVisibility(n10);
                            ConstraintLayout constraintLayout6 = ((bz1_2)object2).g;
                            if (constraintLayout6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                            } else {
                                constraintLayout = constraintLayout6;
                            }
                            constraintLayout.setVisibility(n10);
                            return Unit.a;
                        }
                    }
                    if ((view = ((bz1_2)object2).N0) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        f16 = 0.0f;
                        Object var27_126 = null;
                        f7 = 0.0f;
                    }
                    var27_127.setVisibility(0);
                    View view10 = ((bz1_2)object2).R0;
                    if (view10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)objectArray);
                        n15 = 0;
                        Object var17_102 = null;
                    }
                    var17_103.setVisibility(0);
                    ConstraintLayout constraintLayout7 = ((bz1_2)object2).g;
                    if (constraintLayout7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n15 = 0;
                        Object var17_105 = null;
                    }
                    var17_106.setVisibility(0);
                    string4 = ((bz1_2)object2).O0;
                    String string8 = "cashIV";
                    if (string4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n14 = 0;
                        string4 = null;
                        f6 = 0.0f;
                    }
                    n16 = R$drawable.ic_ajio_cash;
                    string4.setImageResource(n16);
                    string4 = ((bz1_2)object2).O0;
                    if (string4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n14 = 0;
                        string4 = null;
                        f6 = 0.0f;
                    }
                    if ((objectArray = ((bz1_2)object2).O0) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n16 = 0;
                        objectArray = null;
                    }
                    Context context = objectArray.getContext();
                    n16 = R$string.acc_icon_ajio_cash_icon;
                    String string9 = context.getString(n16);
                    string4.setContentDescription((CharSequence)string9);
                    string4 = ((bz1_2)object2).P0;
                    if (string4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cashHeaderTV");
                        n14 = 0;
                        string4 = null;
                        f6 = 0.0f;
                    }
                    n15 = R$string.cash;
                    String string10 = hv3_0.K(n15);
                    string4.setText((CharSequence)string10);
                    string4 = ((bz1_2)object2).Q0;
                    if (string4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cashAmount");
                        n14 = 0;
                        string4 = null;
                        f6 = 0.0f;
                    }
                    String string11 = qz2_0.x((Float)var9_57);
                    string4.setText((CharSequence)string11);
                    ImageView imageView3 = ((bz1_2)object2).S0;
                    string4 = "pointIV";
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        Object var9_60 = null;
                        f8 = 0.0f;
                    }
                    n15 = R$drawable.ic_ajio_point;
                    var9_61.setImageResource(n15);
                    n7 = R$string.super_cash;
                    String string12 = hv3_0.K(n7);
                    ImageView imageView4 = ((bz1_2)object2).S0;
                    if (imageView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n15 = 0;
                        Object var17_112 = null;
                    }
                    if ((objectArray = ((bz1_2)object2).S0) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n16 = 0;
                        objectArray = null;
                    }
                    string4 = objectArray.getResources();
                    n16 = R$string.acc_icon_super_cash_icon;
                    Object[] objectArray2 = new Object[n4];
                    objectArray2[0] = string12;
                    String string13 = string4.getString(n16, objectArray2);
                    var17_113.setContentDescription((CharSequence)string13);
                    TextView textView5 = ((bz1_2)object2).T0;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointHeaderTV");
                        n7 = 0;
                        Object var9_65 = null;
                        f8 = 0.0f;
                    }
                    n14 = R$string.super_cash;
                    string4 = hv3_0.K(n14);
                    var9_66.setText((CharSequence)string4);
                    TextView textView6 = ((bz1_2)object2).U0;
                    if (textView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pointAmount");
                        n7 = 0;
                        Object var9_68 = null;
                        f8 = 0.0f;
                    }
                    f6 = ajioWalletTransform.getActivePoints();
                    string4 = qz2_0.x(Float.valueOf(f6));
                    var9_69.setText((CharSequence)string4);
                    f8 = ajioWalletTransform.getActivePoints();
                    Intrinsics.checkNotNull(Float.valueOf(f8));
                    string4 = "pointPointExpireBG";
                    String string14 = "pointPointAmt";
                    float f18 = f8 - 0.0f;
                    n7 = (int)(f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1));
                    if (n7 > 0) {
                        void var9_75;
                        void var9_72;
                        View view11 = ((bz1_2)object2).V0;
                        if (view11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n7 = 0;
                            Object var9_71 = null;
                            f8 = 0.0f;
                        }
                        var9_72.setVisibility(0);
                        TextView textView7 = ((bz1_2)object2).W0;
                        if (textView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string14);
                            n7 = 0;
                            Object var9_74 = null;
                            f8 = 0.0f;
                        }
                        var9_75.setVisibility(0);
                        n7 = R$string.super_cash;
                        String string15 = hv3_0.K(n7);
                        TextView textView8 = ((bz1_2)object2).W0;
                        if (textView8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string14);
                        } else {
                            constraintLayout = textView8;
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        n10 = R$string.super_cash_expiring;
                        String string16 = ((Fragment)object2).getString(n10);
                        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                        f6 = ajioWalletTransform.getTopExpiringPointAmount();
                        string4 = qz2_0.x(Float.valueOf(f6));
                        String string17 = ajioWalletTransform.getTopExpiringPointDate();
                        objectArray = new Object[n3];
                        objectArray[0] = string4;
                        objectArray[n4] = string15;
                        n4 = 2;
                        f5 = 2.8E-45f;
                        objectArray[n4] = string17;
                        string5 = "format(...)";
                        zn0_1.b(objectArray, n3, string16, string5, (TextView)constraintLayout);
                    } else {
                        void var14_91;
                        View view12 = ((bz1_2)object2).V0;
                        if (view12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n3 = 0;
                            Object var14_90 = null;
                        }
                        var14_91.setVisibility(n10);
                        TextView textView9 = ((bz1_2)object2).W0;
                        if (textView9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string14);
                        } else {
                            constraintLayout = textView9;
                        }
                        constraintLayout.setVisibility(n10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putFloat("ajio_cash_balance", f14);
                    f5 = ajioWalletTransform.getActivePoints();
                    bundle.putFloat("ajio_points_balance", f5);
                    f5 = ajioWalletTransform.getTopExpiringPointAmount();
                    string3 = "points_expiry";
                    bundle.putFloat(string3, f5);
                    string5 = "points_expiry_date";
                    String string18 = ajioWalletTransform.getTopExpiringPointDate();
                    bundle.putString(string5, string18);
                    newCustomEventsRevamp = ((bz1_2)object2).t;
                    String string19 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION();
                    object4 = newCustomEventsRevamp.getWALLET_WIDGET_VIEW();
                    String string20 = newCustomEventsRevamp.getEC_WIDGET_INTERACTION_EVENT();
                    String string21 = "";
                    String string22 = "my account screen";
                    String string23 = "my account screen";
                    String string24 = ((bz1_2)object2).H0;
                    object2 = ((bz1_2)object2).I0;
                    int n18 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string19, (String)object4, string21, string20, string22, string23, string24, bundle, (String)object2, false, null, n18, null);
                    return Unit.a;
                }
                n3 = dataCallback.getStatus();
                if (n3 != n4) return Unit.a;
                ConstraintLayout constraintLayout8 = ((bz1_2)object2).g;
                if (constraintLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    constraintLayout = constraintLayout8;
                }
                constraintLayout.setVisibility(n10);
                return Unit.a;
            }
            case 0: 
        }
        Object object6 = object;
        Throwable throwable = (Throwable)object;
        object2 = (j7_0)object2;
        Intrinsics.checkNotNullParameter(object2, string2);
        zr1_1 zr1_12 = ((j7_0)object2).e;
        Intrinsics.checkNotNull(throwable);
        DataCallback dataCallback = ((j7_0)object2).d.handleApiException(throwable, "BackGround_AllCMSCategories");
        zr1_12.k(dataCallback);
        return Unit.a;
    }
}

