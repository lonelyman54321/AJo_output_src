/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.app.Dialog
 *  android.app.TimePickerDialog
 *  android.app.TimePickerDialog$OnTimeSetListener
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  android.text.format.DateFormat
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.Spinner
 *  android.widget.TextView
 *  android.widget.TimePicker
 */
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.appcompat.app.f$a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/*
 * Renamed from hH
 */
public final class hh_2
implements TimePickerDialog.OnTimeSetListener,
DatePickerDialog.OnDateSetListener,
View.OnClickListener {
    public Context a;
    public TextView b;
    public TextView c;
    public EditText d;
    public EditText e;
    public EditText f;
    public Spinner g;
    public Spinner h;
    public Spinner i;
    public Dialog j;
    public Spinner k;
    public TextView l;
    public CheckBox m;
    public final ArrayList n;
    public final ArrayList o;

    public hh_2(np_1 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "applySettingsClickListener");
        this.n = arrayList = new ArrayList();
        this.o = arrayList = new ArrayList();
    }

    public final void a(int n3, int n4, int n7) {
        int n8 = n4 + 1;
        TextView textView = this.b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateTV");
            textView = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n7);
        String string2 = "/";
        stringBuilder.append(string2);
        stringBuilder.append(n8);
        stringBuilder.append(string2);
        stringBuilder.append(n3);
        String string3 = stringBuilder.toString();
        textView.setText((CharSequence)string3);
        ch_2.c = n7;
        ch_2.d = n4;
        ch_2.e = n3;
    }

    public final void b(int n3, int n4) {
        if (n3 > 0 || n4 > 0) {
            TextView textView = this.c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timeTV");
                textView = null;
            }
            CharSequence charSequence = new StringBuilder();
            charSequence.append(n3);
            String string2 = ":";
            charSequence.append(string2);
            charSequence.append(n4);
            charSequence = charSequence.toString();
            textView.setText(charSequence);
            ch_2.b = n3;
            ch_2.a = n4;
        }
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.btn_date_pick;
        int n8 = 1;
        Object object3 = "context";
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            Context context;
            object = Calendar.getInstance();
            int n10 = ((Calendar)object).get(n8);
            int n14 = ((Calendar)object).get(2);
            n7 = 5;
            int n15 = ((Calendar)object).get(n7);
            Context context2 = this.a;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                boolean bl2 = false;
                context = null;
            } else {
                context = context2;
            }
            Object object4 = object;
            hh_2 hh_22 = this;
            object = new DatePickerDialog(context, (DatePickerDialog.OnDateSetListener)this, n10, n14, n15);
            object.show();
        } else {
            n7 = R$id.btn_time_pick;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                String[] stringArray;
                object = Calendar.getInstance();
                int n16 = ((Calendar)object).get(11);
                n7 = 12;
                int n17 = ((Calendar)object).get(n7);
                String[] stringArray2 = this.a;
                if (stringArray2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    boolean bl3 = false;
                    stringArray = null;
                } else {
                    stringArray = stringArray2;
                }
                stringArray2 = this.a;
                if (stringArray2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object2 = stringArray2;
                }
                boolean bl4 = DateFormat.is24HourFormat((Context)object2);
                Object object5 = object;
                hh_2 hh_23 = this;
                object = new TimePickerDialog((Context)stringArray, (TimePickerDialog.OnTimeSetListener)this, n16, n17, bl4);
                object.show();
            } else {
                int n18;
                n7 = R$id.sub_group_selection;
                n3 = 0;
                eh_2 eh_22 = null;
                if (object != null && (n18 = ((Integer)object).intValue()) == n7) {
                    object = new ArrayList();
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Object object6 = z40_0.Companion;
                    object6 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object6).a;
                    Object object7 = "UserSubGroupForCMSPreview";
                    object6 = ((cw)object6).e((String)object7);
                    n8 = object6.length();
                    String[] stringArray = new String[n8];
                    Context context = null;
                    for (int i3 = 0; i3 < n8; i3 += 1) {
                        String string2;
                        stringArray[i3] = string2 = object6.get(i3).toString();
                    }
                    object6 = new Ref$ObjectRef();
                    ((Ref$ObjectRef)object6).element = object7 = (Object)new boolean[n8];
                    context = this.a;
                    if (context == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object2 = context;
                    }
                    object7 = new f$a((Context)object2);
                    ((f$a)object7).setTitle("Select Sub Group");
                    ((f$a)object7).setCancelable(false);
                    object2 = stringArray;
                    object2 = stringArray;
                    object3 = (boolean[])((Ref$ObjectRef)object6).element;
                    eh_22 = new eh_2(stringArray, (ArrayList)object, (Ref$ObjectRef)object6, (f$a)object7);
                    ((f$a)object7).setMultiChoiceItems((CharSequence[])object2, (boolean[])object3, (DialogInterface.OnMultiChoiceClickListener)eh_22);
                    object2 = new fh_2((ArrayList)object, stringArray, this);
                    ((f$a)object7).setPositiveButton("OK", (DialogInterface.OnClickListener)object2);
                    object = new Object();
                    object2 = "Cancel";
                    ((f$a)object7).setNegativeButton((CharSequence)object2, (DialogInterface.OnClickListener)object);
                    ((f$a)object7).show();
                } else {
                    n7 = R$id.done;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                        object = this.d;
                        String string3 = "pageIdEt";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n4 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = object.toString();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        if (object != null && (n4 = ((String)object).length()) != 0) {
                            object = this.d;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n4 = 0;
                                object = null;
                            }
                            if ((object = object.getText()) != null && (object = object.toString()) != null) {
                                n4 = Integer.parseInt((String)object);
                                object = n4;
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            Intrinsics.checkNotNull(object);
                            ch_2.f = n4 = ((Integer)object).intValue();
                        } else {
                            ch_2.f = n4 = -1;
                        }
                        object = this.e;
                        string3 = "pageUrlEt";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n4 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = object.toString();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        if (object != null && (n4 = ((String)object).length()) != 0) {
                            object = this.e;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n4 = 0;
                                object = null;
                            }
                            if ((object = object.getText()) != null) {
                                object = object.toString();
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            ch_2.g = object;
                        } else {
                            ch_2.g = null;
                        }
                        object = this.f;
                        string3 = "appVersionEt";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n4 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = object.toString();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        object3 = "";
                        if (object != null && (n4 = ((String)object).length()) != 0) {
                            object = this.f;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n4 = 0;
                                object = null;
                            }
                            if ((object = object.getText()) != null) {
                                object = object.toString();
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            ch_2.k = object;
                        } else {
                            ch_2.k = object3;
                        }
                        object = this.f;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n4 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = object.toString();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        if (object != null && (n4 = ((String)object).length()) != 0) {
                            object = this.f;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n4 = 0;
                                object = null;
                            }
                            if ((object = object.getText()) != null) {
                                object = object.toString();
                            } else {
                                n4 = 0;
                                object = null;
                            }
                            ch_2.k = object;
                        } else {
                            ch_2.k = object3;
                        }
                        object = this.g;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userTypeDd");
                            n4 = 0;
                            object = null;
                        }
                        object = object.getSelectedItem();
                        string3 = "null cannot be cast to non-null type kotlin.String";
                        Intrinsics.checkNotNull(object, string3);
                        ch_2.h = (String)object;
                        object = this.i;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userGroupDd");
                            n4 = 0;
                            object = null;
                        }
                        object = object.getSelectedItem();
                        Intrinsics.checkNotNull(object, string3);
                        ch_2.j = (String)object;
                        object = this.h;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("userStatusDd");
                            n4 = 0;
                            object = null;
                        }
                        object = object.getSelectedItem();
                        Intrinsics.checkNotNull(object, string3);
                        ch_2.i = (String)object;
                        object = this.o;
                        object3 = this.n;
                        Object object8 = this.k;
                        if (object8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("storeList");
                            n18 = 0;
                            object8 = null;
                        }
                        object8 = object8.getSelectedItem();
                        Intrinsics.checkNotNull(object8, string3);
                        object8 = (String)object8;
                        n7 = ((ArrayList)object3).indexOf(object8);
                        ch_2.l = (String)((ArrayList)object).get(n7);
                        object = this.l;
                        string3 = "subUserGroup";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n4 = 0;
                            object = null;
                        }
                        if ((n4 = (int)(StringsKt.F((CharSequence)(object = ((Object)object.getText()).toString()), (CharSequence)(object3 = "None"), n8 != 0) ? 1 : 0)) != 0) {
                            ch_2.m = null;
                        } else {
                            object = this.l;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n4 = 0;
                                object = null;
                            }
                            ch_2.m = object = ((Object)object.getText()).toString();
                        }
                        object = this.m;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uatCheckbox");
                            n4 = 0;
                            object = null;
                        }
                        n4 = (int)(object.isChecked() ? 1 : 0);
                        ch_2.o = n4;
                        og1_1.g(n8 != 0, false);
                        object = this.j;
                        if (object == null) {
                            object = "dialog";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        } else {
                            object2 = object;
                        }
                        object2.dismiss();
                    }
                }
            }
        }
    }

    public final void onDateSet(DatePicker datePicker, int n3, int n4, int n7) {
        this.a(n3, n4, n7);
    }

    public final void onTimeSet(TimePicker timePicker, int n3, int n4) {
        this.b(n3, n4);
    }
}

