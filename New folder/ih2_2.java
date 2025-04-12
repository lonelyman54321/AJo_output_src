/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.style.StrikethroughSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FragmentReturnRefundBreakupBinding;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IH2
 */
public final class ih2_2
extends h61_0
implements kh2_0 {
    public static final /* synthetic */ gn1_2[] q;
    public ReturnOrderItemDetails f;
    public ActionContent g;
    public final ArrayList h;
    public final String i;
    public float j;
    public final cc3_2 k;
    public boolean l;
    public final m80_0 m;
    public float n;
    public boolean o;
    public boolean p;

    static {
        in1_2 in1_22 = jz.a(ih2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentReturnRefundBreakupBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{in1_22};
        q = gn1_2Array;
    }

    public ih2_2() {
        Object object = new ArrayList();
        this.h = object;
        this.i = "Return_Order_Details";
        this.k = object = z80_0.c(ih2$a_0.a, this);
        this.l = true;
        this.m = object = new Object();
        ((m80_0)object).c();
    }

    /*
     * Unable to fully structure code
     */
    public static boolean Qa(ArrayList var0) {
        var0 = var0.iterator();
        block0: while (true) {
            var1_1 = false;
            var2_2 = null;
            while (var3_3 = var0.hasNext()) {
                var2_2 = (CartEntry)var0.next();
                var4_4 = var2_2.getConvenienceFee().getCOD();
                if (var4_4 != null) {
                    var4_4 = var4_4.isFeeCharged();
                    var5_5 = Boolean.TRUE;
                    var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                } else {
                    var3_3 = false;
                    var4_4 = null;
                }
                if (!var3_3) {
                    var4_4 = var2_2.getConvenienceFee().getDelivery();
                    if (var4_4 != null) {
                        var4_4 = var4_4.isFeeCharged();
                        var5_5 = Boolean.TRUE;
                        var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                    } else {
                        var3_3 = false;
                        var4_4 = null;
                    }
                    if (!var3_3) {
                        var4_4 = var2_2.getConvenienceFee().getRVP();
                        if (var4_4 != null) {
                            var4_4 = var4_4.isFeeCharged();
                            var5_5 = Boolean.TRUE;
                            var3_3 = Intrinsics.areEqual(var4_4, var5_5);
                        } else {
                            var3_3 = false;
                            var4_4 = null;
                        }
                        if (!var3_3) {
                            var3_3 = h40_0.P1();
                            if (!var3_3) continue block0;
                            if ((var2_2 = var2_2.getConvenienceFee().getPriorityDelivery()) != null) {
                                var2_2 = var2_2.isFeeCharged();
                                var4_4 = Boolean.TRUE;
                                var1_1 = Intrinsics.areEqual(var2_2, var4_4);
                            } else {
                                var1_1 = false;
                                var2_2 = null;
                            }
                            if (var1_1) ** break;
                            continue block0;
                        }
                    }
                }
                var1_1 = true;
            }
            break;
        }
        return var1_1;
    }

    public final void A0(float f5) {
        float f6;
        this.n = f6 = this.n + f5;
        AjioTextView ajioTextView = this.Pa().titleHeaderTotalAmount;
        String string2 = qz2_0.u(this.n);
        ajioTextView.setText(string2);
        ajioTextView = this.Pa().titleHeaderTotalAmount;
        Intrinsics.checkNotNullExpressionValue(ajioTextView, "titleHeaderTotalAmount");
        ai0_2.B((View)ajioTextView);
    }

    public final FragmentReturnRefundBreakupBinding Pa() {
        Object object = q[0];
        object = this.k.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentReturnRefundBreakupBinding)object;
    }

    /*
     * Exception decompiling
     */
    public final void Ra(double var1_1, float var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 16[TRYBLOCK] [17 : 288->293)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        eh2_0 eh2_02 = new eh2_0((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)eh2_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        boolean bl2;
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        String string2 = this.i;
        Boolean bl3 = null;
        if (object != null) {
            n4 = object.containsKey(string2);
            object = n4 != 0;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = 33;
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                n3 = Build.VERSION.SDK_INT;
                if (n3 >= n7) {
                    object = ch2_1.a(object, string2);
                } else {
                    bl2 = (object = object.getSerializable(string2)) instanceof ReturnOrderItemDetails;
                    if (!bl2) {
                        n4 = 0;
                        object = null;
                    }
                    object = (ReturnOrderItemDetails)object;
                }
                object = (ReturnOrderItemDetails)object;
            } else {
                n4 = 0;
                object = null;
            }
            this.f = object;
        }
        object = this.getArguments();
        string2 = "IS_FROM_RETURN_REFUND_ORDER_DETAILS";
        if (object != null) {
            n4 = object.containsKey(string2);
            object = n4 != 0;
        } else {
            n4 = 0;
            object = null;
        }
        n3 = 0;
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                n4 = object.getBoolean(string2);
            } else {
                n4 = 0;
                object = null;
            }
            this.p = n4;
        }
        object = this.getArguments();
        string2 = "actionContent";
        if (object != null) {
            n4 = object.containsKey(string2);
            object = n4 != 0;
        } else {
            n4 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                int n8 = Build.VERSION.SDK_INT;
                if (n8 >= n7) {
                    object = dh2_1.a(object);
                } else {
                    bl2 = (object = object.getSerializable(string2)) instanceof ActionContent;
                    if (!bl2) {
                        n4 = 0;
                        object = null;
                    }
                    object = (ActionContent)object;
                }
                object = (ActionContent)object;
            } else {
                n4 = 0;
                object = null;
            }
            this.g = object;
        }
        object = this.getArguments();
        string2 = "SHOULD_SHOW_YELLOW_BOTTOM_VIEW_REFUND_BREAKUP";
        if (object != null) {
            n4 = object.containsKey(string2);
            bl3 = n4 != 0;
        }
        if (bl3 != null) {
            object = this.getArguments();
            n4 = object != null ? (int)(object.getBoolean(string2) ? 1 : 0) : 1;
            this.l = n4;
        }
        n4 = R$layout.fragment_return_refund_breakup;
        return layoutInflater.inflate(n4, viewGroup, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block99: {
            block93: {
                block98: {
                    block92: {
                        block97: {
                            block96: {
                                block95: {
                                    block94: {
                                        var3_3 = this;
                                        var4_4 = 0;
                                        var5_5 = 0.0f;
                                        var6_6 /* !! */  = null;
                                        var7_7 /* !! */  = var1_1;
                                        Intrinsics.checkNotNullParameter(var1_1, "view");
                                        super.onViewCreated(var1_1, var2_2);
                                        var8_8 /* !! */  = this.f;
                                        var9_9 = 0;
                                        var10_10 = 0.0f;
                                        var11_11 = null;
                                        if (var8_8 /* !! */  == null) break block93;
                                        this.j = 0.0f;
                                        var8_8 /* !! */  = this.Pa().tvReturnFeeCta;
                                        var12_12 /* !! */  = new fh2_0(this, 0);
                                        var8_8 /* !! */ .setOnClickListener((View.OnClickListener)var12_12 /* !! */ );
                                        var8_8 /* !! */  = this.f;
                                        var12_12 /* !! */  = this.h;
                                        var13_14 = " ";
                                        if (var8_8 /* !! */  != null && (var8_8 /* !! */  = var8_8 /* !! */ .getSelectedControllerConfirmedList()) != null) {
                                            var8_8 /* !! */  = var8_8 /* !! */ .iterator();
                                            var14_15 = 0.0f;
                                            var15_16 = 0.0f;
                                            var16_17 = 0.0;
                                            var18_18 = 0.0f;
                                            var19_19 = 0;
                                            var20_20 = false;
                                            var21_21 = null;
                                            while (var22_23 = var8_8 /* !! */ .hasNext()) {
                                                var21_21 = (CartEntry)var8_8 /* !! */ .next();
                                                var22_23 = var21_21.isAjioFaultReturnFee();
                                                var23_24 = var21_21.getOrderEntry();
                                                var24_25 = var23_24.getReturnEditedQuantity();
                                                if (var24_25 == 0) {
                                                    var25_26 = var21_21.getOrderEntry();
                                                    var23_24 = var21_21.getQuantity();
                                                    var26_27 = var23_24.intValue();
                                                    var25_26.setReturnEditedQuantity(var26_27);
                                                }
                                                var7_7 /* !! */  = this.Pa().imCancelBtn;
                                                var27_28 = new gh2_0(var3_3, 0);
                                                var7_7 /* !! */ .setOnClickListener((View.OnClickListener)var27_28);
                                                var7_7 /* !! */  = this.Pa().okayButton;
                                                var27_28 = new hh2_0(var3_3, 0);
                                                var7_7 /* !! */ .setOnClickListener((View.OnClickListener)var27_28);
                                                var7_7 /* !! */  = var21_21.getOrderEntry();
                                                if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getTotalPrice()) != null) {
                                                    var7_7 /* !! */  = var7_7 /* !! */ .getValue();
                                                } else {
                                                    var26_27 = 0;
                                                    var28_29 = 0.0f;
                                                    var7_7 /* !! */  = null;
                                                }
                                                if (var7_7 /* !! */  != null && (var26_27 = var7_7 /* !! */ .length()) != 0 && (var7_7 /* !! */  = var21_21.getOrderEntry()) != null) {
                                                    var26_27 = var7_7 /* !! */ .getReturnEditedQuantity();
                                                    var27_28 = var21_21.getOrderEntry();
                                                    if (var27_28 != null && (var27_28 = var27_28.getTotalPrice()) != null) {
                                                        var27_28 = var27_28.getValue();
                                                    } else {
                                                        var29_30 /* !! */  = 0;
                                                        var30_31 = 0.0f;
                                                        var27_28 = null;
                                                    }
                                                    Intrinsics.checkNotNull(var27_28);
                                                    var30_31 = Float.parseFloat((String)var27_28);
                                                    var25_26 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                    var6_6 /* !! */  = "getOrderTotalQuantity(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var25_26, (String)var6_6 /* !! */ );
                                                    var31_32 = var25_26.floatValue();
                                                    var30_31 /= var31_32;
                                                    var31_32 = var3_3.j;
                                                    var10_10 = var26_27;
                                                    var3_3.j = var30_31 = var30_31 * var10_10 + var31_32;
                                                    var27_28 = var3_3.g;
                                                    if (var27_28 != null && (var27_28 = var27_28.getReturn_fee()) != null) {
                                                        var30_31 = var27_28.floatValue();
                                                    } else {
                                                        var29_30 /* !! */  = 0;
                                                        var30_31 = 0.0f;
                                                        var27_28 = null;
                                                    }
                                                    var18_18 += (var30_31 *= var10_10);
                                                    var19_19 += var26_27;
                                                    var27_28 = var21_21.getOrderEntry().getBankDiscountPromoAmt();
                                                    if (var27_28 != null) {
                                                        var32_33 = var27_28.doubleValue();
                                                        var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                        Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                        var34_34 = var27_28.doubleValue();
                                                        var32_33 /= var34_34;
                                                        var36_35 = var26_27;
                                                        var16_17 = (var32_33 *= var36_35) + var16_17;
                                                    }
                                                    var7_7 /* !! */  = cp_1.Companion;
                                                    var27_28 = var21_21.getOrderEntry();
                                                    var7_7 /* !! */ .getClass();
                                                    var26_27 = (int)cp$a.k((CartEntry)var27_28);
                                                    if (var26_27 != 0) {
                                                        var7_7 /* !! */  = var21_21.getOrderEntry();
                                                        if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getRVP()) != null) {
                                                            var7_7 /* !! */  = var7_7 /* !! */ .isFeeCharged();
                                                            var27_28 = Boolean.TRUE;
                                                            var26_27 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var27_28);
                                                        } else {
                                                            var26_27 = 0;
                                                            var28_29 = 0.0f;
                                                            var7_7 /* !! */  = null;
                                                        }
                                                        if (var26_27 != 0) {
                                                            var7_7 /* !! */  = var21_21.getOrderEntry();
                                                            if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getRVP()) != null) {
                                                                var28_29 = var7_7 /* !! */ .getNetAmount();
                                                                var7_7 /* !! */  = Float.valueOf(var28_29);
                                                            } else {
                                                                var26_27 = 0;
                                                                var28_29 = 0.0f;
                                                                var7_7 /* !! */  = null;
                                                            }
                                                            if (var7_7 /* !! */  != null) {
                                                                var28_29 = var7_7 /* !! */ .floatValue();
                                                                var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                                Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                                var30_31 = var27_28.floatValue();
                                                                var28_29 = var28_29 / var30_31 * var10_10;
                                                                var15_16 += var28_29;
                                                            }
                                                        }
                                                        if ((var7_7 /* !! */  = var21_21.getOrderEntry()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getCOD()) != null) {
                                                            var7_7 /* !! */  = var7_7 /* !! */ .isFeeCharged();
                                                            var27_28 = Boolean.TRUE;
                                                            var26_27 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var27_28);
                                                        } else {
                                                            var26_27 = 0;
                                                            var28_29 = 0.0f;
                                                            var7_7 /* !! */  = null;
                                                        }
                                                        if (var26_27 != 0) {
                                                            var7_7 /* !! */  = var21_21.getOrderEntry();
                                                            if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getCOD()) != null) {
                                                                var28_29 = var7_7 /* !! */ .getNetAmount();
                                                                var7_7 /* !! */  = Float.valueOf(var28_29);
                                                            } else {
                                                                var26_27 = 0;
                                                                var28_29 = 0.0f;
                                                                var7_7 /* !! */  = null;
                                                            }
                                                            if (var7_7 /* !! */  != null) {
                                                                var28_29 = var7_7 /* !! */ .floatValue();
                                                                var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                                Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                                var30_31 = var27_28.floatValue();
                                                                var28_29 = var28_29 / var30_31 * var10_10;
                                                                var15_16 += var28_29;
                                                            }
                                                        }
                                                        if ((var7_7 /* !! */  = var21_21.getOrderEntry()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getDelivery()) != null) {
                                                            var7_7 /* !! */  = var7_7 /* !! */ .isFeeCharged();
                                                            var27_28 = Boolean.TRUE;
                                                            var26_27 = (int)Intrinsics.areEqual(var7_7 /* !! */ , var27_28);
                                                        } else {
                                                            var26_27 = 0;
                                                            var28_29 = 0.0f;
                                                            var7_7 /* !! */  = null;
                                                        }
                                                        if (var26_27 != 0) {
                                                            var7_7 /* !! */  = var21_21.getOrderEntry();
                                                            if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getDelivery()) != null) {
                                                                var28_29 = var7_7 /* !! */ .getNetAmount();
                                                                var7_7 /* !! */  = Float.valueOf(var28_29);
                                                            } else {
                                                                var26_27 = 0;
                                                                var28_29 = 0.0f;
                                                                var7_7 /* !! */  = null;
                                                            }
                                                            if (var7_7 /* !! */  != null) {
                                                                var28_29 = var7_7 /* !! */ .floatValue();
                                                                var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                                Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                                var30_31 = var27_28.floatValue();
                                                                var15_16 = var28_29 = var28_29 / var30_31 * var10_10 + var15_16;
                                                            }
                                                        }
                                                        if ((var26_27 = (int)h40_0.P1()) != 0) {
                                                            var7_7 /* !! */  = var21_21.getOrderEntry();
                                                            if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getPriorityDelivery()) != null) {
                                                                var7_7 /* !! */  = var7_7 /* !! */ .isFeeCharged();
                                                                var27_28 = Boolean.TRUE;
                                                                var26_27 = Intrinsics.areEqual(var7_7 /* !! */ , var27_28);
                                                            } else {
                                                                var26_27 = 0;
                                                                var28_29 = 0.0f;
                                                                var7_7 /* !! */  = null;
                                                            }
                                                            if (var26_27 != 0) {
                                                                var7_7 /* !! */  = var21_21.getOrderEntry();
                                                                if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getPriorityDelivery()) != null) {
                                                                    var28_29 = var7_7 /* !! */ .getNetAmount();
                                                                    var7_7 /* !! */  = Float.valueOf(var28_29);
                                                                } else {
                                                                    var26_27 = 0;
                                                                    var28_29 = 0.0f;
                                                                    var7_7 /* !! */  = null;
                                                                }
                                                                if (var7_7 /* !! */  != null) {
                                                                    var28_29 = var7_7 /* !! */ .floatValue();
                                                                    var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                                    Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                                    var30_31 = var27_28.floatValue();
                                                                    var28_29 /= var30_31;
                                                                    var27_28 = var21_21.getOrderEntry();
                                                                    if (var27_28 != null && (var27_28 = var27_28.getConvenienceFee()) != null && (var27_28 = var27_28.getPriorityDelivery()) != null && (var29_30 /* !! */  = (int)var27_28.isAjioFault()) == 0) {
                                                                        var29_30 /* !! */  = 1;
                                                                        var30_31 = 1.4E-45f;
                                                                    } else {
                                                                        var29_30 /* !! */  = 0;
                                                                        var30_31 = 0.0f;
                                                                        var27_28 = null;
                                                                    }
                                                                    if (var29_30 /* !! */  != 0) {
                                                                        var15_16 = var28_29 = var28_29 * var10_10 + var15_16;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        var7_7 /* !! */  = var21_21.getOrderEntry().getConvenienceFee();
                                                        if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getTotal()) != null) {
                                                            var28_29 = var7_7 /* !! */ .getNetAmount();
                                                            var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                            Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                            var30_31 = var27_28.floatValue();
                                                            var28_29 = var28_29 / var30_31 * var10_10;
                                                            var15_16 += var28_29;
                                                        }
                                                    }
                                                    if ((var7_7 /* !! */  = var21_21.getOrderEntry().getConvenienceFee()) != null && (var7_7 /* !! */  = var7_7 /* !! */ .getTotal()) != null) {
                                                        var28_29 = var7_7 /* !! */ .getNetAmount();
                                                        var27_28 = var21_21.getOrderEntry().getOrderTotalQuantity();
                                                        Intrinsics.checkNotNullExpressionValue(var27_28, (String)var6_6 /* !! */ );
                                                        var5_5 = var27_28.floatValue();
                                                        var28_29 = var28_29 / var5_5 * var10_10;
                                                        var14_15 += var28_29;
                                                    }
                                                }
                                                var6_6 /* !! */  = var21_21.getOrderEntry();
                                                var12_12 /* !! */ .add(var6_6 /* !! */ );
                                                var4_4 = h40_0.P1();
                                                if (var4_4 != 0) {
                                                    var6_6 /* !! */  = var21_21.getPriorityDeliveryBreached();
                                                    var7_7 /* !! */  = Boolean.TRUE;
                                                    var4_4 = Intrinsics.areEqual(var6_6 /* !! */ , var7_7 /* !! */ );
                                                    var27_28 = var3_3.m;
                                                    var25_26 = "(Refunded to AJIO Cash)";
                                                    var38_36 = "REFUNDED";
                                                    var39_37 = var8_8 /* !! */ ;
                                                    var8_8 /* !! */  = "priorityDeliveryRefundedConstaintlayout";
                                                    var40_38 = "";
                                                    var11_11 = "priorityDeliveryTitleTv";
                                                    if (var4_4 != 0 && (var6_6 /* !! */  = var21_21.getPriorityDeliveryFeeStatus()) != null) {
                                                        var6_6 /* !! */  = this.Pa().priorityDeliveryTitleTv;
                                                        var7_7 /* !! */  = var27_28.b();
                                                        var27_28 = var21_21.getPriorityDeliveryFeeStatus();
                                                        var29_30 /* !! */  = (int)Intrinsics.areEqual(var27_28, var38_36);
                                                        if (var29_30 /* !! */  == 0) {
                                                            var25_26 = var40_38;
                                                        }
                                                        var27_28 = new StringBuilder();
                                                        var27_28.append((String)var7_7 /* !! */ );
                                                        var27_28.append(var13_14);
                                                        var27_28.append((String)var25_26);
                                                        var7_7 /* !! */  = var27_28.toString();
                                                        var6_6 /* !! */ .setText((CharSequence)var7_7 /* !! */ );
                                                        var6_6 /* !! */  = this.Pa().priorityDeliveryTitleTv;
                                                        Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , (String)var11_11);
                                                        ai0_2.B((View)var6_6 /* !! */ );
                                                        var4_4 = 1;
                                                        var5_5 = 1.4E-45f;
                                                        var3_3.o = var4_4;
                                                        var6_6 /* !! */  = this.Pa().priorityDeliveryRefundedConstaintlayout;
                                                        Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , (String)var8_8 /* !! */ );
                                                        ai0_2.B((View)var6_6 /* !! */ );
                                                    } else {
                                                        var6_6 /* !! */  = var21_21.getOrderEntry().getPriorityDeliveryBreached();
                                                        var4_4 = Intrinsics.areEqual(var6_6 /* !! */ , var7_7 /* !! */ );
                                                        if (var4_4 != 0 && (var6_6 /* !! */  = var21_21.getOrderEntry().getPriorityDeliveryFeeStatus()) != null) {
                                                            var6_6 /* !! */  = this.Pa().priorityDeliveryTitleTv;
                                                            var7_7 /* !! */  = var27_28.b();
                                                            var27_28 = var21_21.getOrderEntry().getPriorityDeliveryFeeStatus();
                                                            var29_30 /* !! */  = (int)Intrinsics.areEqual(var27_28, var38_36);
                                                            if (var29_30 /* !! */  == 0) {
                                                                var25_26 = var40_38;
                                                            }
                                                            var27_28 = new StringBuilder();
                                                            var27_28.append((String)var7_7 /* !! */ );
                                                            var27_28.append(var13_14);
                                                            var27_28.append((String)var25_26);
                                                            var7_7 /* !! */  = var27_28.toString();
                                                            var6_6 /* !! */ .setText((CharSequence)var7_7 /* !! */ );
                                                            var6_6 /* !! */  = this.Pa().priorityDeliveryTitleTv;
                                                            Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , (String)var11_11);
                                                            ai0_2.B((View)var6_6 /* !! */ );
                                                            var4_4 = 1;
                                                            var5_5 = 1.4E-45f;
                                                            var3_3.o = var4_4;
                                                            var6_6 /* !! */  = this.Pa().priorityDeliveryRefundedConstaintlayout;
                                                            Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , (String)var8_8 /* !! */ );
                                                            ai0_2.B((View)var6_6 /* !! */ );
                                                        }
                                                    }
                                                } else {
                                                    var39_37 = var8_8 /* !! */ ;
                                                }
                                                var20_20 = var22_23;
                                                var8_8 /* !! */  = var39_37;
                                                var4_4 = 0;
                                                var5_5 = 0.0f;
                                                var6_6 /* !! */  = null;
                                                var9_9 = 0;
                                                var10_10 = 0.0f;
                                                var11_11 = null;
                                            }
                                        } else {
                                            var14_15 = 0.0f;
                                            var15_16 = 0.0f;
                                            var16_17 = 0.0;
                                            var18_18 = 0.0f;
                                            var19_19 = 0;
                                            var20_20 = false;
                                            var21_22 = null;
                                        }
                                        var6_6 /* !! */  = this.Pa().orderList;
                                        var7_7 /* !! */  = this.requireActivity();
                                        var8_8 /* !! */  = new LinearLayoutManager((Context)var7_7 /* !! */ );
                                        var6_6 /* !! */ .setLayoutManager((RecyclerView$o)var8_8 /* !! */ );
                                        var6_6 /* !! */  = this.Pa().orderList;
                                        var26_27 = var3_3.p;
                                        var27_28 = "totalPriceCallback";
                                        Intrinsics.checkNotNullParameter(var3_3, (String)var27_28);
                                        var8_8 /* !! */  = new RecyclerView$f();
                                        var8_8 /* !! */ .a = var3_3;
                                        var8_8 /* !! */ .b = var26_27;
                                        var8_8 /* !! */ .c = var12_12 /* !! */ ;
                                        var6_6 /* !! */ .setAdapter((RecyclerView$f)var8_8 /* !! */ );
                                        var6_6 /* !! */  = this.Pa().titleHeader;
                                        var41_39 = var12_12 /* !! */ .size();
                                        var26_27 = var12_12 /* !! */ .size();
                                        var29_30 /* !! */  = 1;
                                        var30_31 = 1.4E-45f;
                                        var7_7 /* !! */  = var26_27 == var29_30 /* !! */  ? "Product" : "Products";
                                        var11_11 = "Total Amount (";
                                        var27_28 = new StringBuilder((String)var11_11);
                                        var27_28.append(var41_39);
                                        var27_28.append(var13_14);
                                        var27_28.append((String)var7_7 /* !! */ );
                                        var27_28.append(")");
                                        var8_8 /* !! */  = var27_28.toString();
                                        var6_6 /* !! */ .setText((CharSequence)var8_8 /* !! */ );
                                        var6_6 /* !! */  = this.Pa().titleHeader;
                                        var8_8 /* !! */  = "titleHeader";
                                        Intrinsics.checkNotNullExpressionValue(var6_6 /* !! */ , (String)var8_8 /* !! */ );
                                        ai0_2.B((View)var6_6 /* !! */ );
                                        var6_6 /* !! */  = cp_1.Companion;
                                        var6_6 /* !! */ .getClass();
                                        var4_4 = cp$a.u();
                                        if (var4_4 == 0) {
                                            var3_3.j = var5_5 = var3_3.j + var14_15;
                                            var4_4 = cp$a.l((ArrayList)var12_12 /* !! */ );
                                            if (var4_4 != 0) {
                                                var3_3.j = var5_5 = var3_3.j - var15_16;
                                            }
                                        }
                                        if ((var6_6 /* !! */  = var3_3.f) == null || (var6_6 /* !! */  = var6_6 /* !! */ .getRefundAmount()) == null) break block94;
                                        var42_40 = var6_6 /* !! */ .floatValue();
                                        var26_27 = 0;
                                        var28_29 = 0.0f;
                                        var7_7 /* !! */  = null;
                                        cfr_temp_0 = var42_40 - 0.0f;
                                        var41_39 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                        if (var41_39 > 0) {
                                            var41_39 = 1;
                                            var42_40 = 1.4E-45f;
                                        } else {
                                            var41_39 = 0;
                                            var42_40 = 0.0f;
                                            var8_8 /* !! */  = null;
                                        }
                                        if (var41_39 != 0) break block95;
                                    }
                                    var4_4 = 0;
                                    var5_5 = 0.0f;
                                    var6_6 /* !! */  = null;
                                }
                                if (var6_6 /* !! */  == null) {
                                    var4_4 = 1;
                                    var5_5 = 1.4E-45f;
                                } else {
                                    var4_4 = 0;
                                    var5_5 = 0.0f;
                                    var6_6 /* !! */  = null;
                                }
                                var42_40 = var3_3.j;
                                var43_41 = (double)var42_40 - var16_17;
                                if (var4_4 != 0) break block96;
                                var6_6 /* !! */  = h40_0.a;
                                var4_4 = h40_0.f2();
                                if (var4_4 == 0 || (var6_6 /* !! */  = h40_0.t0()) == null || (var6_6 /* !! */  = var6_6 /* !! */ .getReturn_processing_fee_post_order()) == null) ** GOTO lbl-1000
                                var4_4 = var6_6 /* !! */ .getRefund_breakup();
                                var29_30 /* !! */  = 1;
                                var30_31 = 1.4E-45f;
                                if (var4_4 == var29_30 /* !! */ ) {
                                    var4_4 = 1;
                                    var5_5 = 1.4E-45f;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = 0;
                                    var5_5 = 0.0f;
                                    var6_6 /* !! */  = null;
                                }
                                if (var4_4 != 0) {
                                    var4_4 = 0;
                                    var5_5 = 0.0f;
                                    var6_6 /* !! */  = null;
                                    cfr_temp_1 = var18_18 - 0.0f;
                                    var29_30 /* !! */  = (int)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                    if (var29_30 /* !! */  > 0) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var4_4 = 1;
                                            var5_5 = 1.4E-45f;
                                            break block92;
                                            break;
                                        }
                                    }
                                }
                                break block97;
                            }
                            var4_4 = 0;
                            var5_5 = 0.0f;
                            var6_6 /* !! */  = null;
                            var27_28 = h40_0.a;
                            var29_30 /* !! */  = (int)h40_0.g2();
                            if (var29_30 /* !! */  != 0 && (var29_30 /* !! */  = (int)((cfr_temp_2 = var18_18 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1))) > 0) {
                                var45_43 = var18_18;
                                var43_41 -= var45_43;
                                ** continue;
                            }
                        }
                        var4_4 = 0;
                        var5_5 = 0.0f;
                        var6_6 /* !! */  = null;
                    }
                    var27_28 = var3_3.g;
                    if (var27_28 != null && (var27_28 = var27_28.getReturn_fee()) != null) {
                        var30_31 = var27_28.floatValue();
                    } else {
                        var29_30 /* !! */  = 0;
                        var30_31 = 0.0f;
                        var27_28 = null;
                    }
                    if (var4_4 == 0) {
                        var29_30 /* !! */  = 0;
                        var30_31 = 0.0f;
                        var27_28 = null;
                        var47_44 = 0.0;
                        var18_18 = 0.0f;
                    } else {
                        var47_44 = 0.0;
                    }
                    var4_4 = (int)(var43_41 == var47_44 ? 0 : (var43_41 < var47_44 ? -1 : 1));
                    if (var4_4 < 0) {
                        var43_41 = 0.0;
                    }
                    var6_6 /* !! */  = "-";
                    var11_11 = "returnFeeConstaintlayout";
                    var49_45 = 0;
                    var50_47 = 0.0f;
                    var12_12 /* !! */  = null;
                    cfr_temp_3 = var30_31 - 0.0f;
                    var51_49 /* !! */  = (float)(cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1));
                    if (var51_49 /* !! */  > 0) {
                        var49_45 = 1;
                        var50_47 = 1.4E-45f;
                        if (var19_19 > var49_45) {
                            var50_47 = var19_19;
                            var12_12 /* !! */  = qz2_0.y(var50_47);
                            var27_28 = qz2_0.p(var30_31);
                            var13_14 = "x";
                            var27_28 = UX.c((String)var6_6 /* !! */ , (String)var12_12 /* !! */ , var13_14, (String)var27_28);
                        } else {
                            var27_28 = qz2_0.u(var30_31);
                            var27_28 = kp1_0.c((String)var6_6 /* !! */ , (String)var27_28);
                        }
                        var12_12 /* !! */  = this.Pa().returnFeeConstaintlayout;
                        Intrinsics.checkNotNullExpressionValue(var12_12 /* !! */ , (String)var11_11);
                        ai0_2.B((View)var12_12 /* !! */ );
                        if (var20_20) {
                            var11_11 = this.Pa().tvReturnFeeAmount.getContext();
                            var49_45 = R$color.accent_color_FFA5A5A5;
                            var9_9 = t70.getColor((Context)var11_11, var49_45);
                            var12_12 /* !! */  = new SpannableString((CharSequence)var27_28);
                            var27_28 = new StrikethroughSpan();
                            var51_49 /* !! */  = var12_12 /* !! */ .length();
                            var52_50 = 33;
                            var31_32 = 4.6E-44f;
                            var12_12 /* !! */ .setSpan(var27_28, 0, (int)var51_49 /* !! */ , var52_50);
                            this.Pa().tvReturnFeeAmount.setTextColor(var9_9);
                            this.Pa().tvReturnFeeAmount.setText((CharSequence)var12_12 /* !! */ );
                            var27_28 = this.Pa().tvReturnFeeDescription;
                            var49_45 = R$string.return_fee_was_not_charged;
                            var12_12 /* !! */  = var3_3.getString(var49_45);
                            var27_28.setText((CharSequence)var12_12 /* !! */ );
                            var49_45 = R$string.return_fee;
                            var12_12 /* !! */  = var3_3.getString(var49_45);
                            var13_14 = "*";
                            var12_12 /* !! */  = Ft2.a((String)var12_12 /* !! */ , var13_14);
                            var27_28 = new SpannableString((CharSequence)var12_12 /* !! */ );
                            var12_12 /* !! */  = new StrikethroughSpan();
                            var51_49 /* !! */  = var27_28.length();
                            var38_36 = null;
                            var27_28.setSpan(var12_12 /* !! */ , 0, (int)var51_49 /* !! */ , var52_50);
                            var12_12 /* !! */  = this.Pa().tvReturnFeeLabel;
                            var12_12 /* !! */ .setTextColor(var9_9);
                            this.Pa().tvReturnFeeLabel.setText((CharSequence)var27_28);
                            var27_28 = this.Pa().tvReturnFeeCta;
                            var11_11 = "tvReturnFeeCta";
                            Intrinsics.checkNotNullExpressionValue(var27_28, (String)var11_11);
                            ai0_2.i((View)var27_28);
                        } else {
                            var11_11 = this.Pa().tvReturnFeeAmount;
                            var12_12 /* !! */  = this.Pa().tvReturnFeeAmount.getContext();
                            var51_49 /* !! */  = R$color.color_202020;
                            var49_45 = t70.getColor((Context)var12_12 /* !! */ , (int)var51_49 /* !! */ );
                            var11_11.setTextColor(var49_45);
                            this.Pa().tvReturnFeeAmount.setText((CharSequence)var27_28);
                            var27_28 = this.Pa().tvReturnFeeDescription;
                            var9_9 = R$string.charged_per_product_per_quantity;
                            var11_11 = var3_3.getString(var9_9);
                            var27_28.setText((CharSequence)var11_11);
                        }
                    } else {
                        var27_28 = this.Pa().returnFeeConstaintlayout;
                        Intrinsics.checkNotNullExpressionValue(var27_28, (String)var11_11);
                        ai0_2.i((View)var27_28);
                    }
                    var42_40 = (float)var43_41;
                    var7_7 /* !! */  = this.Pa().tvTotalRefundAmount;
                    var27_28 = cp$a.f(String.valueOf(var42_40));
                    var7_7 /* !! */ .setText((CharSequence)var27_28);
                    var7_7 /* !! */  = var3_3.f;
                    if (var7_7 /* !! */  != null && (var7_7 /* !! */  = var7_7 /* !! */ .getRefundAmount()) != null) {
                        var30_31 = var7_7 /* !! */ .floatValue();
                        var9_9 = 0;
                        var10_10 = 0.0f;
                        var11_11 = null;
                        cfr_temp_4 = var30_31 - 0.0f;
                        var29_30 /* !! */  = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                        if (var29_30 /* !! */  <= 0) {
                            var26_27 = 0;
                            var28_29 = 0.0f;
                            var7_7 /* !! */  = null;
                        }
                        if (var7_7 /* !! */  != null) {
                            var28_29 = var7_7 /* !! */ .floatValue();
                            var27_28 = this.Pa().tvTotalRefundAmount;
                            var7_7 /* !! */  = qz2_0.u(var28_29);
                            var27_28.setText((CharSequence)var7_7 /* !! */ );
                        }
                    }
                    if ((var7_7 /* !! */  = var3_3.f) != null) {
                        var26_27 = (int)var7_7 /* !! */ .isSelfShip();
                        var7_7 /* !! */  = Boolean.valueOf((boolean)var26_27);
                    } else {
                        var26_27 = 0;
                        var28_29 = 0.0f;
                        var7_7 /* !! */  = null;
                    }
                    if (var7_7 /* !! */  == null || (var7_7 /* !! */  = var3_3.f) == null) break block98;
                    var26_27 = (int)var7_7 /* !! */ .isSelfShip();
                    var29_30 /* !! */  = 1;
                    var30_31 = 1.4E-45f;
                    if (var26_27 != var29_30 /* !! */ ) break block98;
                    var7_7 /* !! */  = this.Pa().selfShipConstaintlayout;
                    var29_30 /* !! */  = 0;
                    var30_31 = 0.0f;
                    var7_7 /* !! */ .setVisibility(0);
                    cp$a.e().getClass();
                    var7_7 /* !! */  = cp_1.B();
                    var28_29 = Float.parseFloat((String)var7_7 /* !! */ );
                    var27_28 = var3_3.f;
                    if (var27_28 != null && (var27_28 = var27_28.getSelfshipCreditAmt()) != null) {
                        var28_29 = Float.parseFloat((String)var27_28);
                    }
                    var27_28 = this.Pa().tvSelfShipAmount;
                    var11_11 = qz2_0.u(var28_29);
                    var27_28.setText((CharSequence)var11_11);
                    var27_28 = this.Pa().tvTotalRefundAmount;
                    var11_11 = var3_3.f;
                    if (var11_11 == null || (var11_11 = var11_11.getRefundAmount()) == null) ** GOTO lbl570
                    var10_10 = var11_11.floatValue();
                    var50_47 = 0.0f;
                    var12_12 /* !! */  = null;
                    cfr_temp_5 = var10_10 - 0.0f;
                    var49_45 = (int)(cfr_temp_5 == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                    if (var49_45 > 0) {
                        var8_8 /* !! */  = qz2_0.u(var10_10);
lbl565:
                        // 2 sources

                        while (true) {
                            var25_26 = var8_8 /* !! */ ;
                            break;
                        }
                    } else {
                        var8_8 /* !! */  = qz2_0.u(var42_40 += var28_29);
                        ** continue;
lbl570:
                        // 1 sources

                        var52_50 = 0;
                        var31_32 = 0.0f;
                        var25_26 = null;
                    }
                    var27_28.setText((CharSequence)var25_26);
                }
                if ((var29_30 /* !! */  = (cfr_temp_6 = var16_17 - (var43_41 = 0.0)) == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1)) != 0) {
                    var8_8 /* !! */  = this.Pa().constraintBankFee;
                    var26_27 = 0;
                    var8_8 /* !! */ .setVisibility(0);
                    var8_8 /* !! */  = this.Pa().bankDiscountLabelTv;
                    var28_29 = (float)var16_17;
                    var7_7 /* !! */  = qz2_0.u(var28_29);
                    var27_28 = new StringBuilder((String)var6_6 /* !! */ );
                    var27_28.append((String)var7_7 /* !! */ );
                    var6_6 /* !! */  = var27_28.toString();
                    var8_8 /* !! */ .setText((CharSequence)var6_6 /* !! */ );
                }
                var36_35 = var16_17;
                var10_10 = var18_18;
                break block99;
            }
            var43_42 = 0.0;
            var49_46 = false;
            var50_48 = 0.0f;
            var12_13 = null;
            var36_35 = var43_42;
            var9_9 = 0;
            var10_10 = 0.0f;
            var11_11 = null;
        }
        var3_3.Ra(var36_35, var10_10);
    }
}

