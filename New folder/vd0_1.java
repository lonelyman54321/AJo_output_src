/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.InputFilter$AllCaps
 *  android.text.InputFilter$LengthFilter
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.ActionMode$Callback
 *  android.view.View$OnClickListener
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatEditText;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/*
 * Renamed from vD0
 */
public final class vd0_1
implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ zd0_2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vd0_1(zd0_2 zd0_22, boolean bl2) {
        this.a = zd0_22;
        this.b = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCheckedChanged(RadioGroup radioGroup, int n3) {
        Object object;
        int n4;
        block18: {
            block19: {
                Object object2;
                zd0_2 zd0_22;
                Object object3;
                block22: {
                    int n7;
                    block21: {
                        Serializable serializable;
                        block20: {
                            AjioEditText ajioEditText;
                            block17: {
                                Object object4;
                                block16: {
                                    int n8;
                                    block15: {
                                        block14: {
                                            Object object5;
                                            radioGroup = null;
                                            object3 = "this$0";
                                            zd0_22 = this.a;
                                            Intrinsics.checkNotNullParameter(zd0_22, (String)object3);
                                            n7 = R$id.rb_ajiostorecredits;
                                            n4 = 8;
                                            if (n3 == n7) {
                                                object3 = zd0_22.c;
                                                object3.I0(n3);
                                                AjioTextView ajioTextView = zd0_22.s;
                                                ajioTextView.setVisibility(0);
                                                radioGroup = zd0_22.t;
                                                radioGroup.setVisibility(n4);
                                                zd0_22.w();
                                                return;
                                            }
                                            n7 = R$id.rb_banktransfer;
                                            if (n3 != n7) return;
                                            object3 = zd0_22.b;
                                            n7 = (int)(((ReturnOrderItemDetails)object3).isRefundToBankSelected() ? 1 : 0);
                                            serializable = zd0_22.b;
                                            if (n7 == 0) {
                                                ((ReturnOrderItemDetails)serializable).setAccountNumberInvalid(false);
                                                ((ReturnOrderItemDetails)serializable).setConfirmAccountNumberInvalid(false);
                                                ((ReturnOrderItemDetails)serializable).setIFSCCodeInvalid(false);
                                            }
                                            zd0_22.c.I0(n3);
                                            zd0_22.t.setVisibility(0);
                                            object2 = new yd0_2(zd0_22, 0);
                                            object3 = zd0_22.n;
                                            object3.setOnClickListener((View.OnClickListener)object2);
                                            n3 = (int)(this.b ? 1 : 0);
                                            n7 = 11;
                                            ajioEditText = zd0_22.l;
                                            object = zd0_22.k;
                                            object4 = zd0_22.j;
                                            if (n3 != 0) {
                                                object5 = new jv_2((AjioEditText)object4, zd0_22, (ReturnOrderItemDetails)serializable);
                                                object4.addTextChangedListener((TextWatcher)object5);
                                                object5 = new jv_2((AjioEditText)object, zd0_22, (ReturnOrderItemDetails)serializable);
                                                object.addTextChangedListener((TextWatcher)object5);
                                                object5 = new jv_2(ajioEditText, zd0_22, (ReturnOrderItemDetails)serializable);
                                                ajioEditText.addTextChangedListener((TextWatcher)object5);
                                                object4.setLongClickable(false);
                                                object.setLongClickable(false);
                                                object5 = new InputFilter.AllCaps();
                                                InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(n7);
                                                int n10 = 2;
                                                InputFilter[] inputFilterArray = new InputFilter[n10];
                                                inputFilterArray[0] = object5;
                                                int n14 = 1;
                                                inputFilterArray[n14] = lengthFilter;
                                                ajioEditText.setFilters(inputFilterArray);
                                            }
                                            object5 = new Object();
                                            ((AppCompatEditText)object4).setCustomSelectionActionModeCallback((ActionMode.Callback)object5);
                                            object4 = new Object();
                                            ((AppCompatEditText)object).setCustomSelectionActionModeCallback((ActionMode.Callback)object4);
                                            n8 = ((ReturnOrderItemDetails)serializable).isAccountNumberInvalid();
                                            object4 = zd0_22.q;
                                            if (n8 == 0) break block14;
                                            object4.setVisibility(0);
                                            object = ((ReturnOrderItemDetails)serializable).getAccountNumber();
                                            n8 = TextUtils.isEmpty((CharSequence)object);
                                            if (n8 == 0 && (n8 = TextUtils.isEmpty((CharSequence)(object = ((ReturnOrderItemDetails)serializable).getConfirmAccountNumber()))) == 0) {
                                                n8 = R$string.account_number_invalid;
                                                object = hv3_0.K(n8);
                                                object4.setText((CharSequence)object);
                                                break block15;
                                            } else {
                                                object = ((ReturnOrderItemDetails)serializable).getAccountNumber();
                                                n8 = TextUtils.isEmpty((CharSequence)object);
                                                if (n8 != 0) {
                                                    n8 = R$string.account_number_blank;
                                                    object = hv3_0.K(n8);
                                                    object4.setText((CharSequence)object);
                                                }
                                            }
                                            break block15;
                                        }
                                        object4.setVisibility(n4);
                                    }
                                    n8 = ((ReturnOrderItemDetails)serializable).isConfirmAccountNumberInvalid();
                                    object4 = zd0_22.p;
                                    if (n8 == 0) break block16;
                                    object4.setVisibility(0);
                                    object = ((ReturnOrderItemDetails)serializable).getAccountNumber();
                                    n8 = TextUtils.isEmpty((CharSequence)object);
                                    if (n8 == 0 && (n8 = (int)(TextUtils.isEmpty((CharSequence)(object = ((ReturnOrderItemDetails)serializable).getConfirmAccountNumber())) ? 1 : 0)) == 0) {
                                        n8 = R$string.account_number_invalid;
                                        object = hv3_0.K(n8);
                                        object4.setText((CharSequence)object);
                                        break block17;
                                    } else {
                                        object = ((ReturnOrderItemDetails)serializable).getConfirmAccountNumber();
                                        n8 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                                        if (n8 != 0) {
                                            n8 = R$string.account_number_blank;
                                            object = hv3_0.K(n8);
                                            object4.setText((CharSequence)object);
                                        }
                                    }
                                    break block17;
                                }
                                object4.setVisibility(n4);
                            }
                            object = zd0_22.r;
                            if (n3 != 0) break block18;
                            n3 = (int)(((ReturnOrderItemDetails)serializable).isIFSCCodeInvalid() ? 1 : 0);
                            if (n3 != 0) break block19;
                            object2 = ((Object)StringsKt.m0(String.valueOf(ajioEditText.getText()))).toString();
                            int n15 = ((String)object2).length();
                            if (n15 >= n7) break block20;
                            object2 = "IFSC code should be 11 characters long";
                            object.setText((CharSequence)object2);
                            break block19;
                        }
                        serializable = zd0_22.e;
                        object3 = ((String)object2).subSequence(0, 4);
                        n7 = (int)(((Regex)serializable).c((CharSequence)object3) ? 1 : 0);
                        if (n7 != 0) break block21;
                        object2 = "First 4 characters should have only alphabets";
                        object.setText((CharSequence)object2);
                        break block19;
                    }
                    object3 = zd0_22.d;
                    n7 = (int)(((Regex)object3).c((CharSequence)object2) ? 1 : 0);
                    if (n7 != 0) break block22;
                    object2 = "Allowed characters are A-Z,0-9";
                    object.setText((CharSequence)object2);
                    break block19;
                }
                object3 = zd0_22.f;
                n3 = (int)(((Regex)object3).c((CharSequence)object2) ? 1 : 0);
                if (n3 != 0) break block18;
                object2 = "Please enter a valid format IFSC code";
                object.setText((CharSequence)object2);
            }
            object.setVisibility(0);
            return;
        }
        object.setVisibility(n4);
    }
}

