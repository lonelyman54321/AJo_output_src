/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.SimpleCursorAdapter
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$b;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c;
import androidx.appcompat.app.d;
import androidx.appcompat.app.e;
import androidx.appcompat.app.f;

public class f$a {
    private final AlertController$b P;
    private final int mTheme;

    public f$a(Context context) {
        int n3 = f.b(0, context);
        this(context, n3);
    }

    public f$a(Context context, int n3) {
        AlertController$b alertController$b;
        int n4 = f.b(n3, context);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n4);
        this.P = alertController$b = new AlertController$b(contextThemeWrapper);
        this.mTheme = n3;
    }

    public f create() {
        int n3;
        int n4;
        Drawable drawable2;
        int n7;
        Object object;
        f$a f$a = this;
        Object object2 = this.P.a;
        int n8 = this.mTheme;
        object2 = (ContextThemeWrapper)object2;
        f f5 = new f((ContextThemeWrapper)object2, n8);
        object2 = this.P;
        Object object3 = object2.f;
        AlertController alertController = f5.a;
        if (object3 != null) {
            alertController.G = object3;
        } else {
            object3 = object2.e;
            if (object3 != null) {
                alertController.e = object3;
                object = alertController.E;
                if (object != null) {
                    object.setText((CharSequence)object3);
                }
            }
            if ((object3 = object2.d) != null) {
                alertController.C = object3;
                alertController.B = 0;
                object = alertController.D;
                if (object != null) {
                    object.setVisibility(0);
                    object = alertController.D;
                    object.setImageDrawable((Drawable)object3);
                }
            }
            if ((n8 = object2.c) != 0) {
                alertController.C = null;
                alertController.B = n8;
                object = alertController.D;
                if (object != null) {
                    if (n8 != 0) {
                        object.setVisibility(0);
                        object3 = alertController.D;
                        n7 = alertController.B;
                        object3.setImageResource(n7);
                    } else {
                        n8 = 8;
                        object.setVisibility(n8);
                    }
                }
            }
        }
        object3 = object2.g;
        if (object3 != null) {
            alertController.f = object3;
            object = alertController.F;
            if (object != null) {
                object.setText((CharSequence)object3);
            }
        }
        if ((object3 = object2.h) != null || (object = object2.i) != null) {
            object = object2.j;
            drawable2 = object2.i;
            n4 = -1;
            alertController.d(n4, (CharSequence)object3, (DialogInterface.OnClickListener)object, drawable2);
        }
        if ((object3 = object2.k) != null || (object = object2.l) != null) {
            object = object2.m;
            drawable2 = object2.l;
            n4 = -2;
            alertController.d(n4, (CharSequence)object3, (DialogInterface.OnClickListener)object, drawable2);
        }
        if ((object3 = object2.n) != null || (object = object2.o) != null) {
            object = object2.p;
            drawable2 = object2.o;
            n4 = -3;
            alertController.d(n4, (CharSequence)object3, (DialogInterface.OnClickListener)object, drawable2);
        }
        object3 = object2.u;
        int n10 = 1;
        if (object3 != null || (object3 = object2.J) != null || (object3 = object2.v) != null) {
            Object object4;
            n8 = alertController.K;
            object = object2.b;
            object3 = (AlertController$RecycleListView)object.inflate(n8, null);
            n7 = (int)(object2.F ? 1 : 0);
            drawable2 = object2.a;
            if (n7 != 0) {
                object = object2.J;
                if (object == null) {
                    CharSequence[] charSequenceArray = object2.u;
                    int n14 = alertController.L;
                    Drawable drawable3 = drawable2;
                    drawable3 = (ContextThemeWrapper)drawable2;
                    object = object4;
                    drawable2 = object2;
                    object4 = new b((AlertController$b)object2, (ContextThemeWrapper)drawable3, n14, charSequenceArray, (AlertController$RecycleListView)((Object)object3));
                } else {
                    Cursor cursor = object2.J;
                    Drawable drawable4 = drawable2;
                    drawable4 = (ContextThemeWrapper)drawable2;
                    object = object4;
                    drawable2 = object2;
                    Object object5 = object3;
                    object4 = new c((AlertController$b)object2, (ContextThemeWrapper)drawable4, cursor, (AlertController$RecycleListView)((Object)object3), alertController);
                }
            } else {
                n7 = (int)(object2.G ? 1 : 0);
                n7 = n7 != 0 ? alertController.M : alertController.N;
                Object[] objectArray = object2.J;
                int n15 = 16908308;
                if (objectArray != null) {
                    objectArray = object2.J;
                    String string2 = object2.K;
                    String[] stringArray = new String[]{string2};
                    int[] nArray = new int[]{n15};
                    Context context = object2.a;
                    object4 = drawable2;
                    drawable2 = new SimpleCursorAdapter(context, n7, (Cursor)objectArray, stringArray, nArray);
                } else {
                    object4 = object2.v;
                    if (object4 == null) {
                        objectArray = object2.u;
                        object4 = new ArrayAdapter((Context)drawable2, n7, n15, objectArray);
                    }
                }
            }
            alertController.H = object4;
            alertController.I = n7 = object2.H;
            object = object2.w;
            if (object != null) {
                object = new d((AlertController$b)object2, alertController);
                object3.setOnItemClickListener((AdapterView.OnItemClickListener)object);
            } else {
                object = object2.I;
                if (object != null) {
                    object = new e((AlertController$b)object2, (AlertController$RecycleListView)((Object)object3), alertController);
                    object3.setOnItemClickListener((AdapterView.OnItemClickListener)object);
                }
            }
            object = object2.M;
            if (object != null) {
                object3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object);
            }
            if ((n7 = (int)(object2.G ? 1 : 0)) != 0) {
                object3.setChoiceMode(n10);
            } else {
                n7 = (int)(object2.F ? 1 : 0);
                if (n7 != 0) {
                    n7 = 2;
                    object3.setChoiceMode(n7);
                }
            }
            alertController.g = object3;
        }
        if ((object3 = object2.y) != null) {
            n7 = (int)(object2.D ? 1 : 0);
            if (n7 != 0) {
                n7 = object2.z;
                int n16 = object2.A;
                n4 = object2.B;
                n3 = object2.C;
                alertController.h = object3;
                alertController.i = 0;
                alertController.n = n10;
                alertController.j = n7;
                alertController.k = n16;
                alertController.l = n4;
                alertController.m = n3;
            } else {
                alertController.h = object3;
                alertController.i = 0;
                alertController.n = false;
            }
        } else {
            n3 = object2.x;
            if (n3 != 0) {
                alertController.h = null;
                alertController.i = n3;
                alertController.n = false;
            }
        }
        n3 = (int)(f$a.P.q ? 1 : 0);
        f5.setCancelable(n3 != 0);
        object2 = f$a.P;
        n3 = (int)(object2.q ? 1 : 0);
        if (n3 != 0) {
            f5.setCanceledOnTouchOutside(n10 != 0);
        }
        object2 = f$a.P.r;
        f5.setOnCancelListener((DialogInterface.OnCancelListener)object2);
        object2 = f$a.P.s;
        f5.setOnDismissListener((DialogInterface.OnDismissListener)object2);
        object2 = f$a.P.t;
        if (object2 != null) {
            f5.setOnKeyListener((DialogInterface.OnKeyListener)object2);
        }
        return f5;
    }

    public Context getContext() {
        return this.P.a;
    }

    public f$a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.v = listAdapter;
        alertController$b.w = onClickListener;
        return this;
    }

    public f$a setCancelable(boolean bl2) {
        this.P.q = bl2;
        return this;
    }

    public f$a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String string2) {
        AlertController$b alertController$b = this.P;
        alertController$b.J = cursor;
        alertController$b.K = string2;
        alertController$b.w = onClickListener;
        return this;
    }

    public f$a setCustomTitle(View view) {
        this.P.f = view;
        return this;
    }

    public f$a setIcon(int n3) {
        this.P.c = n3;
        return this;
    }

    public f$a setIcon(Drawable drawable2) {
        this.P.d = drawable2;
        return this;
    }

    public f$a setIconAttribute(int n3) {
        int n4;
        TypedValue typedValue = new TypedValue();
        this.P.a.getTheme().resolveAttribute(n3, typedValue, true);
        AlertController$b alertController$b = this.P;
        alertController$b.c = n4 = typedValue.resourceId;
        return this;
    }

    public f$a setInverseBackgroundForced(boolean bl2) {
        this.P.getClass();
        return this;
    }

    public f$a setItems(int n3, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        CharSequence[] charSequenceArray = alertController$b.a.getResources().getTextArray(n3);
        alertController$b.u = charSequenceArray;
        this.P.w = onClickListener;
        return this;
    }

    public f$a setItems(CharSequence[] charSequenceArray, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.u = charSequenceArray;
        alertController$b.w = onClickListener;
        return this;
    }

    public f$a setMessage(int n3) {
        CharSequence charSequence;
        AlertController$b alertController$b = this.P;
        alertController$b.g = charSequence = alertController$b.a.getText(n3);
        return this;
    }

    public f$a setMessage(CharSequence charSequence) {
        this.P.g = charSequence;
        return this;
    }

    public f$a setMultiChoiceItems(int n3, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController$b alertController$b = this.P;
        Object object = alertController$b.a.getResources().getTextArray(n3);
        alertController$b.u = object;
        object = this.P;
        object.I = onMultiChoiceClickListener;
        object.E = blArray;
        object.F = true;
        return this;
    }

    public f$a setMultiChoiceItems(Cursor cursor, String string2, String string3, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.J = cursor;
        alertController$b.I = onMultiChoiceClickListener;
        alertController$b.L = string2;
        alertController$b.K = string3;
        alertController$b.F = true;
        return this;
    }

    public f$a setMultiChoiceItems(CharSequence[] charSequenceArray, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.u = charSequenceArray;
        alertController$b.I = onMultiChoiceClickListener;
        alertController$b.E = blArray;
        alertController$b.F = true;
        return this;
    }

    public f$a setNegativeButton(int n3, DialogInterface.OnClickListener onClickListener) {
        CharSequence charSequence;
        AlertController$b alertController$b = this.P;
        alertController$b.k = charSequence = alertController$b.a.getText(n3);
        this.P.m = onClickListener;
        return this;
    }

    public f$a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.k = charSequence;
        alertController$b.m = onClickListener;
        return this;
    }

    public f$a setNegativeButtonIcon(Drawable drawable2) {
        this.P.l = drawable2;
        return this;
    }

    public f$a setNeutralButton(int n3, DialogInterface.OnClickListener onClickListener) {
        CharSequence charSequence;
        AlertController$b alertController$b = this.P;
        alertController$b.n = charSequence = alertController$b.a.getText(n3);
        this.P.p = onClickListener;
        return this;
    }

    public f$a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.n = charSequence;
        alertController$b.p = onClickListener;
        return this;
    }

    public f$a setNeutralButtonIcon(Drawable drawable2) {
        this.P.o = drawable2;
        return this;
    }

    public f$a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.r = onCancelListener;
        return this;
    }

    public f$a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.s = onDismissListener;
        return this;
    }

    public f$a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.M = onItemSelectedListener;
        return this;
    }

    public f$a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.t = onKeyListener;
        return this;
    }

    public f$a setPositiveButton(int n3, DialogInterface.OnClickListener onClickListener) {
        CharSequence charSequence;
        AlertController$b alertController$b = this.P;
        alertController$b.h = charSequence = alertController$b.a.getText(n3);
        this.P.j = onClickListener;
        return this;
    }

    public f$a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.h = charSequence;
        alertController$b.j = onClickListener;
        return this;
    }

    public f$a setPositiveButtonIcon(Drawable drawable2) {
        this.P.i = drawable2;
        return this;
    }

    public f$a setRecycleOnMeasureEnabled(boolean bl2) {
        this.P.getClass();
        return this;
    }

    public f$a setSingleChoiceItems(int n3, int n4, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        Object object = alertController$b.a.getResources().getTextArray(n3);
        alertController$b.u = object;
        object = this.P;
        object.w = onClickListener;
        object.H = n4;
        object.G = true;
        return this;
    }

    public f$a setSingleChoiceItems(Cursor cursor, int n3, String string2, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.J = cursor;
        alertController$b.w = onClickListener;
        alertController$b.H = n3;
        alertController$b.K = string2;
        alertController$b.G = true;
        return this;
    }

    public f$a setSingleChoiceItems(ListAdapter listAdapter, int n3, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.v = listAdapter;
        alertController$b.w = onClickListener;
        alertController$b.H = n3;
        alertController$b.G = true;
        return this;
    }

    public f$a setSingleChoiceItems(CharSequence[] charSequenceArray, int n3, DialogInterface.OnClickListener onClickListener) {
        AlertController$b alertController$b = this.P;
        alertController$b.u = charSequenceArray;
        alertController$b.w = onClickListener;
        alertController$b.H = n3;
        alertController$b.G = true;
        return this;
    }

    public f$a setTitle(int n3) {
        CharSequence charSequence;
        AlertController$b alertController$b = this.P;
        alertController$b.e = charSequence = alertController$b.a.getText(n3);
        return this;
    }

    public f$a setTitle(CharSequence charSequence) {
        this.P.e = charSequence;
        return this;
    }

    public f$a setView(int n3) {
        AlertController$b alertController$b = this.P;
        alertController$b.y = null;
        alertController$b.x = n3;
        alertController$b.D = false;
        return this;
    }

    public f$a setView(View view) {
        AlertController$b alertController$b = this.P;
        alertController$b.y = view;
        alertController$b.x = 0;
        alertController$b.D = false;
        return this;
    }

    public f$a setView(View view, int n3, int n4, int n7, int n8) {
        AlertController$b alertController$b = this.P;
        alertController$b.y = view;
        alertController$b.x = 0;
        alertController$b.D = true;
        alertController$b.z = n3;
        alertController$b.A = n4;
        alertController$b.B = n7;
        alertController$b.C = n8;
        return this;
    }

    public f show() {
        f f5 = this.create();
        f5.show();
        return f5;
    }
}

