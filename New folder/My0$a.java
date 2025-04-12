/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable$Factory
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class My0$a
extends My0$b {
    public final EditText a;
    public final wy0_0 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public My0$a(EditText editText) {
        Object object;
        block9: {
            this.a = editText;
            this.b = object = new wy0_0(editText);
            editText.addTextChangedListener((TextWatcher)object);
            object = Ny0.b;
            if (object == null) {
                object = Ny0.a;
                synchronized (object) {
                    Throwable throwable2;
                    block8: {
                        block7: {
                            Object object2;
                            Object object3;
                            Ny0 ny0;
                            try {
                                ny0 = Ny0.b;
                                if (ny0 != null) break block7;
                                object3 = "android.text.DynamicLayout$ChangeWatcher";
                                object2 = Ny0.class;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                            try {
                                object2 = ((Class)object2).getClassLoader();
                                Ny0.c = object3 = Class.forName((String)object3, false, (ClassLoader)object2);
                            }
                            catch (Throwable throwable3) {}
                            Ny0.b = ny0;
                        }
                        break block9;
                    }
                    throw throwable2;
                }
            }
        }
        object = Ny0.b;
        editText.setEditableFactory((Editable.Factory)object);
    }
}

